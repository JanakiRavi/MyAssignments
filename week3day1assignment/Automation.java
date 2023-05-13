package week3day1assignment;

public class Automation extends MultipleLanguage implements Language,TestTool{

	

	public void Java() {
		System.out.println("Java is widely used Language");
		
	}
	public void Selenium() {
		System.out.println("Selenium Automates web Applications");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby is High-level programming language");
		
	}

	
public static void main(String[] args) {
	Automation auto=new Automation();
	auto.Java();
	auto.Selenium();
	auto.python();
	auto.ruby();
	}
}
