package test;

import org.apache.commons.lang3.StringUtils;

/**
 * @author yyj
 * @version CreateTime：2018年10月26日 上午9:50:17
 * 
 */
public class TempTest {

	public static void main(String[] args) {
		String str = "1,2,3,4,5,6,7,9,10";

		String strArray[] = str.split(",");
		String  str1= StringUtils.join(strArray,"big");
		System.out.println(str1);
		System.out.println("true||false : " + (true || false));
		System.out.println("true||true : " + (true || true));
		System.out.println("false||false :" + (false || false));
		System.out.println("false&&false :" + (false&&false));
		System.out.println("false&&true :" + (false || true));
		System.out.println("true&&false :" + (true&&false));

		
	}

}
