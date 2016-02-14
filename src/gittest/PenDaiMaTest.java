package gittest;
import junit.framework.*;

public class PenDaiMaTest extends TestCase{
	private PenDaiMa pen;
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		pen = new PenDaiMa();
	}
	
	public void test_parseString2Int_with_null_input(){
		int except = 0;
		int result = pen.parseString2Int(null);
		assertEquals(except, result);
	}

	public void test_parseString2Int_with_empty_input(){
		int except = 0;
		int result = pen.parseString2Int("");
		assertEquals(except, result);
	}
	public void test_parseString2Int_success(){
		int except = 123;
		int result = pen.parseString2Int("123");
		assertEquals(except, result);
	}
}
