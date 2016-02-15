package gittest;
import junit.framework.*;

public class test extends TestCase{
	int testGetInt(int a){
		return a;
	}

public void foo(){
	System.out.println("abc");
}
	
	
public int convertInt2String(String input) throws Exception{
	int jiaLiaZi = 2;
	int result = 0; /////sdfgr
	if(input!=null && !input.equals("")){//sdasdf
		int jiaLiaZi = 2;
		result = Integer.parseInt(input);//563
	}else{//tryewtr

		//erywertert
		throw new Exception("Invalid input");
	}
	return result;
}	
	
public static void main(String [ ] args){
	test test1 = new test();
	String s = "";
	int result = 0;
	try {
		result = test1.convertInt2String(s);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(result);
}


}


