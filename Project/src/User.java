
public class User {

	private String Rid;
	private String Firstname;
	private String Lastname;
	private String Gender ;
	private String Education;
	private String Birthday;
	private String Password;
	
	public User() {
		
	}
	
	public User(String rid, String firstname, String lastname, String gender, String education, String birthday,String password)
	{
Rid=rid;
Firstname=firstname;
Lastname=lastname;
Gender=gender;
Education=education;
Birthday=birthday;
Password=password;
	}
	
	
	public String getRID() {
		return Rid;
	}
	public void setRID(String rid) {
		this.Rid=rid;
	}
	public String getFNAME() {
		return Firstname;
	}
	public void setFNAME(String firstname) {
		this.Firstname=firstname;
	}
	public String getLNAME() {
		return Lastname;
	}
	public void setLNAME(String lastname) {
		this.Lastname=lastname;
	}
	public String getGENDER() {
		return Gender;
	}
	public void setGENDER(String gender) {
		this.Gender=gender;
	}
	public String getEDU() {
		return Education;
	}
	public void setEDU(String education) {
		this.Education=education;
	}
	public String getDOB() {
		return Birthday;
	}
	public void setDOB(String birthday) {
		this.Birthday=birthday;
	}
	public String getPWD() {
		return Password;
	}
	public void setPWD(String password) {
		this.Password=password;
	}
}
