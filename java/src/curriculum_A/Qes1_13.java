package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
//		問１
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		float fNum;
		double dNum;
		char chart;
		String text;
		boolean check;
		
//		問２
		bNum = 0;
		sNum = 0;
		iNum = 0;
		lNum = 0;
		fNum = 0.0f;
		dNum = 0.0d;
		chart = '\0';
		text = "null";
		check = false;
		
//		問３
		bNum = 10;
		sNum = 100;
		iNum = 1000;
		lNum = 10000;
		fNum = 9.5f;
		dNum = 10.5d;
		chart = 'a';
		text = "ハロー";
		check = true;
		
//		問4
		System.out.println(bNum+sNum+iNum+lNum);
		System.out.println(bNum+bNum);
		System.out.println(chart+text+check);
		System.out.println(bNum+sNum+iNum+lNum+fNum+dNum);
		System.out.println(bNum*sNum*iNum*lNum);
		System.out.println(dNum/sNum);
		System.out.println(bNum-sNum+"\n");

//		問５
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1)+"\n");
		
//		問６
		String text1 = "山田太郎";
		String text2 = "寿司";
		byte bNum1 = 18;
		double dNum1 = 170.5;
		double dNum2 = 62.2;
		
		System.out.println("「始めまして"+text1+"です」");
		System.out.println("「年齢は"+bNum1+"歳です」");
		System.out.println("「身長は"+dNum1+"cmです」");
		System.out.println("「体重は"+dNum2+"kgです」");
		System.out.println("「好きな食べ物は"+text2+"です」"+"\n");
		
//		問７
		System.out.println("「BMIは"+((Math.floor(dNum2/((dNum1/sNum)*(dNum1/sNum))*10)/10))+"です」"+"\n");
		
//		問８
		text1 = "鈴木一郎";
		text2 = "オムライス";
		bNum1 = 24;
		dNum1 = 168.5;
		dNum2 = 64.2;
		
		System.out.println("「始めまして"+text1+"です」");
		System.out.println("「年齢は"+bNum1+"です」");
		System.out.println("「身長は"+dNum1+"cmです」");
		System.out.println("「体重は"+dNum2+"kgです」");
		System.out.println("「好きな食べ物は"+text2+"です」");
		System.out.println("「BMIは"+((Math.floor(dNum2/((dNum1/sNum)*(dNum1/sNum))*10)/10))+"です」"+"\n");
		
//		問９
		System.out.println("「始めまして"+text1+"です」");
		int nenrei = bNum1+bNum1;
		System.out.println("「年齢は"+nenrei+"です」");
		double shinchou = dNum1+dNum1;
		System.out.println("「身長は"+shinchou+"cmです」");
		double taizyu = dNum2+dNum2;
		System.out.println("「体重は"+taizyu+"kgです」");
		System.out.println("「好きな食べ物は"+text2+"です」");
		double BMI = taizyu / Math.pow(shinchou / 100,2);
		System.out.println("「BMIは"+ String.format("%.2f",BMI)+"です」"+"\n");
		
//		問10
		check = (bNum >= 25);
		System.out.println(check+"\n");
		
//		問11
		Integer i = Integer.valueOf(bNum1);
		String str = i.toString();
		String str1 = Double.valueOf(dNum1).toString();
		String str2 = Double.valueOf(dNum2).toString();
		System.out.println(str + str1 + str2 + "\n");
		
////	問12
		int i1 = Integer.parseInt(str);
		float f_Val = Float.valueOf(str1);
		int i2 = (int)f_Val;
		System.out.println(i1);
		System.out.println(i2 + "\n");
		
////	問13
		check = (i1 == 25 || i2 >= 160);
		System.out.println(check);
		
	}
	
}
