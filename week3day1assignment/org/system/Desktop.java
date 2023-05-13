package week3day1assignment.org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("Size of Desktop is 24inch");

	}
	
	public static void main(String[] args) {
		Desktop desktop=new Desktop();
		desktop.computerModel();
		desktop.desktopSize();

	}

}
