package week3day1assignment;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("ID of the student is :" +id);

	}
	public void getStudentInfo(int id,String name) {
		System.out.println("ID  is "+id +" Name:" +name);

	}
	
	public void getStudentInfo(String email,String phone) {
		System.out.println("Email  is "+email +" PhoneNumber:" +phone);

	}
	public static void main(String[] args) {
		Students stu=new Students ();
		stu.getStudentInfo(101);
		stu.getStudentInfo(101,"Janaki");
		stu.getStudentInfo("janakiravi77@gmail.com", "7397597078");
	}

}
