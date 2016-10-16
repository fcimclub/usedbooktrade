package club.fcim.usedbooktrade.innerlogic;
/**
 * 教科书詳細信息記錄
 * @author cris-li
 *
 */
public class BookDetail {

	// 書籍名稱
	private String name;
	// 所屬年級
	private String grade;
	// 所屬學院
	private String school;
	// 聯繫方式
	private String contact;
	// 所屬種類
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
