package week8.day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationFinder;
import org.testng.internal.annotations.IAnnotationTransformer;

public class RetryAnalyzer implements IRetryAnalyzer,IAnnotationTransformer{
	//IRetryAnalyzer interface where we write logic for rerunning in retry method
	//IAnnotationTransformer, to set rerun logic to all testcase [instaed of using @Test(retryAnalyzer=RetryAnalyzer.class) attribute in all in testcases)
	//use <listeners> and <listener>tag and mention classname with packagename
	int count=0;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<2) {  // rerun the failed testcase twice
			count++;
			return true;
		}
		return false;
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,Class<?> occurringClazz) {
		
			annotation.setRetryAnalyzer(RetryAnalyzer.class); //use pre-definedmethod setRetryAnalyzer and mention classname where rerun logic is written
		}

}
