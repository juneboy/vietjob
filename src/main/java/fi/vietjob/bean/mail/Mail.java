package fi.vietjob.bean.mail;

public interface Mail {
	public String getSubject() ;
	public void setSubject(String subject);
	public String getText();
	public void setText(String text);
	public String getFrom();
	public void setFrom(String from);
}
