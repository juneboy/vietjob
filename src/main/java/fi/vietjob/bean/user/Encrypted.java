package fi.vietjob.bean.user;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.xml.bind.DatatypeConverter;


public class Encrypted {
	public static final String MD5 = "MD5";
	public static final String SHA1 = "SHA-1";
	public static final String SHA256 = "SHA-256";
	public static final String SHA384 = "SHA-384";
	public static final String SHA512 = "SHA-512";
    
	public static String encryptedPass(String pass, String salt, int times,
			String algorithm) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md;
		md = MessageDigest.getInstance(algorithm);
		md.reset();
		md.update(salt.getBytes("UTF-8"));
		byte[] input = md.digest(pass.getBytes("UTF-8"));
		for (int i = 0; i < times; i++) {
			md.reset();
			input = md.digest(input);
		}
		String encryptedPass = DatatypeConverter.printBase64Binary(input);
		return encryptedPass;
	}

	public static String generateSalt() throws NoSuchAlgorithmException {
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		byte[] saltBin = new byte[8];
		random.nextBytes(saltBin);
		String saltStr = DatatypeConverter.printBase64Binary(saltBin);
		return saltStr;
	}
}
