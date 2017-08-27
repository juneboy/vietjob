package fi.vietjob.bean.user;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class UserImpl implements User {
	@Inject
	@Qualifier
	private StandardPasswordEncoder encoder;
	
    public StandardPasswordEncoder getEncoder() {
		return encoder;
	}
	public void setEncoder(StandardPasswordEncoder encoder) {
		this.encoder = encoder;
	}
	private int userID, enabled;
    private String email, rawPassword, salt, image;
   /* private static final String algorithm = Encrypted.SHA512;
    private static final int times = 100;*/
    
    
	/**
	 * @param userID
	 * @param enabled
	 * @param email
	 * @param pass
	 * @param salt
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 */
    /*public boolean checkLogin(String pass) throws NoSuchAlgorithmException, UnsupportedEncodingException{
    	     String hassedPass = Encrypted.encryptedPass(pass, salt, times, algorithm);
    	     return hassedPass.equals(this.passHassed);
    }
    public UserImpl(String email, String pass) throws NoSuchAlgorithmException, UnsupportedEncodingException{
    	    super();
    	    setEmail(email);
    	    String salt;
	    salt = Encrypted.generateSalt();
    	    setSalt(salt);
    	    String passHassed = Encrypted.encryptedPass(pass, getSalt(), times, algorithm);
    	    setPassHassed(passHassed);
    }*/
    
	public UserImpl(int enabled, String email, String rawPassword,
			String salt, String image) {
		super();
		this.enabled = enabled;
		this.email = email;
		this.rawPassword = rawPassword;
		this.salt = salt;
		this.image = image;
	}
	
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return rawPassword;
	}
	public void setPass(String pass) {
		this.rawPassword = pass;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
    
    
}
