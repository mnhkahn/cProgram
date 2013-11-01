public class StringTest {
	public void Trans(int testInt, String testStr, StringBuffer testStringBuffer) {
		testInt = 1001;
		testStr += "1";
		testStringBuffer.append("1");
		System.out.println(testStr + testStr.hashCode());
	}
	public static void main(String args[]) {
		int testInt = 100;
		String testStr = "100";
		StringBuffer testStringBuffer = new StringBuffer("100");
		StringTest test = new StringTest();
		test.Trans(testInt, testStr, testStringBuffer);
		testStr += "2";
		
		System.out.println("testInt=" + testInt);
		System.out.println("testStr=" + testStr + testStr.hashCode());
		System.out.println("testStrBuf=" + testStringBuffer);
	}
}