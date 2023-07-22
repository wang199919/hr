package roy.hr.util;

import com.google.common.io.BaseEncoding;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: roy
 * @date: 2023/7/22 17:43
 * @description:
 */
@Component
public class JwtUtils {
    private  static  final String CLAIM_KEY_USERNAME="sub";
    private  static  final  String CLAIM_KEY_CREATE="created";
    @Value("${jwt.secret}")
    private  String secret;
    @Value("${jwt.expiration}")
    private  Long expiration;
    /*建立JWT的token*/
    public   String generateToken(Map<String,Object> claims){
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpiratioonDate())
                .signWith(SignatureAlgorithm.HS256,secret)
                .compact();

    }
    /*解析Token*/
    public   Claims getClaimsFromToekn(String token){
        Claims claims=null;
        claims=Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        return  claims;
    }
    /*获取token里面的用户名*/
    public  String getUserNameFromToken(String token){
        String username;
        Claims claims=getClaimsFromToekn(token);
        username=claims.getSubject();
        return  username;
    }
    /*查看token是否过期*/
    public  boolean isTokenExpired(String token){
        Date date=getExpiredByToken(token);
        return date.before(new Date());
    }
    /*获取过期时间*/
    public  Date getExpiredByToken(String token){
        Claims claims=getClaimsFromToekn(token);
        return  claims.getExpiration();
    }
    /*根据用户生成Token*/
    public  String generateToken(UserDetails userDetails){
        Map<String ,Object> claims=new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME,userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATE,new Date());
        return generateToken(claims);
    }
    /*判断token是否可以被刷新*/
    public  boolean canRefresh(String token){
        return  !isTokenExpired(token);
    }
    /*刷新token*/
    public  String refreshToken(String token){
        Claims claims=getClaimsFromToekn(token);
        claims.put(CLAIM_KEY_CREATE,new Date());
        return  generateToken(claims);
    }
    public boolean validateToken(String token,UserDetails userDetails){
        String username=getUserNameFromToken(token);
        return username.equals(userDetails.getUsername())&&!isTokenExpired(token);
    }
    public Date generateExpiratioonDate() {
        return new Date(System.currentTimeMillis()+expiration*1000);
    }

}
