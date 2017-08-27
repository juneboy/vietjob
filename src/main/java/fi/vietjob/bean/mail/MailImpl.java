package fi.vietjob.bean.mail;

public class MailImpl implements Mail {
      private String from;
      private String subject;
      private String text;
      
      
    public String getFrom(){
    	   return from;
    }
  	public void setFrom(String from){
  		this.from = from;
  	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
      
}
