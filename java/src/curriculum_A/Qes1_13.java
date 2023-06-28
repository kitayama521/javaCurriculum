package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
//		問１
//		ローカル変数として宣言
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
//		初期値を代入しそれぞれ初期化
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
//		それぞれの変数に値を代入
		bNum = 10;
		sNum = 100;
		iNum = 1000;
		lNum = 10000l;
		fNum = 9.5f;
		dNum = 10.5d;
		chart = 'a';
		text = "ハロー";
		check = true;
		
//		問4
//		11110を出力
		System.out.println(bNum + sNum + iNum + lNum);
//		20を出力
		System.out.println(bNum + bNum);
//		a ハロー trueを出力
		System.out.println(chart + text + check);
//		数字を全て足して11130を出力
		System.out.println(bNum + sNum + iNum + lNum + fNum + dNum);
//		小数点以外の数字を全てかけて10000000000を出力
		System.out.println(bNum * sNum * iNum * lNum);
//		10.5割る100をして0.105を出力
		System.out.println(dNum / sNum);
//		10引く100をして-90を出力
		System.out.println(bNum - sNum + "\n");

//		問５
//		numに20を代入
		int num = 20;
//		num1に23を代入
		int num1 = 23;
//		ハローJAVA43を出力 
		System.out.println("ハローJAVA" + (num + num1) + "\n");
		
//		問６
//		text1に山田太郎を代入
		String text1 = "山田太郎";
//		text2に寿司を代入
		String text2 = "寿司";
//		bNum1に18を代入
		byte bNum1 = 18;
//		dNum1に170.5を代入
		double dNum1 = 170.5;
//		dNum2に62.2を代入
		double dNum2 = 62.2;
		
//		「始めまして山田太郎です」と出力
		System.out.println("「始めまして" + text1 + "です」");
//		「年齢は18歳です」と出力
		System.out.println("「年齢は" + bNum1 + "歳です」");
//		「身長は170.5cmです」と出力
		System.out.println("「身長は" + dNum1 + "cmです」");
//		「体重は62.2kgです」と出力
		System.out.println("「体重は" + dNum2 + "kgです」");
//		「好きな食べ物は寿司です」と出力
		System.out.println("「好きな食べ物は" + text2 + "です」" + "\n");
		
//		問７
//		問6での変数を使用してBMIが出力されるようにし、「BMIは⚪⚪︎です」と出力
		System.out.println("「BMIは" + (((double)Math.round(dNum2 / ((dNum1 / sNum) * (dNum1 / sNum)) * 10) / 10)) + "です」" + "\n");
		
//		問８
//		text1に鈴木一郎を再代入
		text1 = "鈴木一郎";
//		text2にオムライスを再代入
		text2 = "オムライス";
//		bNumm1に24を再代入
		bNum1 = 24;
//		dNum1に168.5を再代入
		dNum1 = 168.5;
//		dNum2に64.2を再代入
		dNum2 = 64.2;
		
//		「始めまして鈴木一郎です」と出力
		System.out.println("「始めまして" + text1 + "です」");
//		「年齢は24歳です」と出力
		System.out.println("「年齢は" + bNum1 + "です」");
//		「身長は168.5cmです」と出力
		System.out.println("「身長は" + dNum1 + "cmです」");
//		「体重は64.2kgです」と出力
		System.out.println("「体重は" + dNum2 + "kgです」");
//		「好きな食べ物はオムライスです」と出力
		System.out.println("「好きな食べ物は" + text2 + "です」");
//		「BMIは22.6です」と出力
		System.out.println("「BMIは" + ((Math.floor(dNum2 / ((dNum1 / sNum) * (dNum1 / sNum)) * 10) / 10)) + "です」" + "\n");
		
//		問９
//		「始めまして鈴木一郎です」と出力
		System.out.println("「始めまして" + text1 + "です」");
//		ageに年齢の和算を代入
		int age = bNum1 + bNum1;
//		「年齢は48歳です」と出力
		System.out.println("「年齢は" + age + "歳です」");
//		heightに身長の和算を代入
		double height = dNum1 + dNum1;
//		「身長は337.0cmです」と出力
		System.out.println("「身長は" + height + "cmです」");
//		weightに体重の和算を代入
		double weight = dNum2 + dNum2;
//		「体重は128.4kgです」と出力
		System.out.println("「体重は" + weight + "kgです」");
//		「好きな食べ物はオムライスです」と出力
		System.out.println("「好きな食べ物は" + text2 + "です」");
//		変数を使ってBMIを計算し、BMIに代入
		double BMI = weight / Math.pow(height / 100,2);
//		「BMIは11.31です」と出力
		System.out.println("「BMIは" + String.format("%.2f",BMI) + "です」" + "\n");
		
//		問10
//		問8で使用した年齢が25歳以上であればtrueを出力
		check = (bNum1 >= 25);
		System.out.println(check+"\n");
		
//		問11
//		年齢、身長、体重を文字列型に変換
		String str = String.valueOf(bNum1);
		String str1 = String.valueOf(dNum1);
		String str2 = String.valueOf(dNum2);
//		年齢、身長、体重を出力
		System.out.println(str + str1 + str2 + "\n");
		
////	問12
//		年齢を整数型に変換
		int i1 = Integer.parseInt(str);
//		身長の少数部分を切り捨て整数へ
		float f_Val = Float.valueOf(str1);
//		身長を整数型に変換
		int i2 = (int)f_Val;
//		年齢、身長を出力
		System.out.println(i1);
		System.out.println(i2 + "\n");
		
////	問13
//		年齢が25歳もしくは身長が160cm以上であればtrueを出力
		check = (i1 == 25 || i2 >= 160);
		System.out.println(check);
		
	}
	
}
