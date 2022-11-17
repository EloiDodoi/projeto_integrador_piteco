package controle;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {

	public static String cifrar(String s) {
	       MessageDigest m;
		try {
			m = MessageDigest.getInstance("MD5");
			
			 m.update(s.getBytes(),0,s.length());
	       return new BigInteger(1,m.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      return null;

	}
	
	public static void main(String[] args) {
		String a = "123";
		;
		System.out.println(Md5.cifrar(a));
	}
}
