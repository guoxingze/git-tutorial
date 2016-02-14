package gittest;

public class PenDaiMa {

	public int parseString2Int(String input){
		int result = 0;
		if(input != null && !input.equals("")){
			result = Integer.parseInt(input);
		}
		return result;
	}
	
	
	
	public static void main(String [ ] args){
		PenDaiMa pen = new PenDaiMa();
		int result2 = 0;
		try {
//			result1 = pen.parseString2Int(null);
			result2 = pen.parseString2Int("123");
			if(result2 == 123){
				System.out.println("parseString2Int test success");				
			}else{
				System.out.println("parseString2Int test faile when input == 123");				
			}
//			result3 = pen.parseString2Int("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(result);
	}
}
