package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		System.out.println("");
		 Scanner sc1 = new Scanner(System.in);
	        String user_name1 = sc1.nextLine();
	        //ユーザーが記入したものが0文字以下もしくはnullの場合、
	        if(Objects.isNull(user_name1)|| user_name1.length()<=0) {
	        //「名前を入力してください」と出力
	        	System.out.println("名前を入力してください");
            //ユーザーが記入したものが10文字以上だった場合、
	        }else if(user_name1.length()>=10){
	        //「名前を10文字以内にしてください」と出力
		        System.out.println("名前を10文字以内にしてください");
		    //ユーザーが記入したものが半角英数字以外の場合、
		    }else if(! user_name1.matches("^[a-zA-Z0-9]+$")) {
		    //「半角英数字のみで名前を入力してください」と出力
		    	System.out.println("半角英数字のみで名前を入力してください");
		    //「ユーザー名「入力したユーザー名」を登録しました」と出力
		    }else {
		        System.out.println("ユーザー名" + 「name」+ "を登録しました");
		    }
	        
	}
}
public class Qes4{
	public static void main(String args) {
	//ユーザーの手をキーボードから入力
	int user = getUser();
	//コンピュータの手を乱数で作成
	int pc = getPc();
	//勝敗の判定を行う
	String result = judgeJanken(user,pc);
	//結果を表示する
	showResult(user,pc,result);
		}
	
	public static int getUser() {
	//キーボード入力の準備
	Scanner stdin = new Scanner(System.in);
	//無限ループ
	while(true) {
	//メッセージの表示
	System.out.println("あなたのじゃんけんの手を入力してください");
	System.out.print("(グー:0,チョキ:1,パー:2)-->");
	//入力されたデータが整数かどうかのチェック
	if(stdin.hasNextInt()) {
	//入力されたデータを整数として読み込む
	int number = stdin.nextInt();
	//整数でも有効なのは[0,1,2]のみ
	if(number<=-1 || number >=3) {
	//範囲外は無効なデータなのでやり直し
	System.out.println("【エラー】入力できるのは「０〜２」です");
	continue;
	//勝った回数をカウント
	let winCount=0;
	}else {
	//0,1,2の場合、メソッドの結果として返す
	return number;
	}
	}else {
	//整数以外の場合、無効なデータなのでやり直し
	System.out.println("【エラー】入力できるのは整数だけです");
	//不要なトークンをバッファから取り除く
	stdin.next();
	}
	}
	}
	public static int getPc() {
	//乱数の準備
	Random rand = new Random();
	//0,1,2のどれかを求め、メソッドの結果として返す
	return rand.nextInt(3);
	}

	public static String judgeJanken(int user,int pc) {
	String result=""; //判定結果を保存する
	if((user==0 && pc==1) || (user==1 && pc==2) || (user==2 && pc==0)) 
	{result="やるやん。\n次は俺にリベンジさせて";
	//勝った回数に１プラス
	winCount++;
	//勝った回数をテキストに表示
	win.textCount=winCount;
	}else if((user==1 && pc==0))
	{result="俺の勝ち！\n負けは次に繋がるチャンスです！\nネバーギブアップ！";
	}else if((user==2 && pc==1))
	{result="俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ";
	}else if((user==0 && pc==2))
	{result="俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです";
	}else {
	result="DRAW あいこ もう一回しましょう！";
	} 
	
	//勝敗結果を返す
	return result;
	}
	
	public static void showResult(int user,int  pc,String result) {
	//じゃんけんの手を配列で定義
	String[] janken= {"グー","チョキ","パー"};
	//結果の表示
	System.out.println("nameの手は「"+janken[user]+"」"+"相手の手は「"+janken[pc]+"」");
	System.out.println("結果:"+result);
	}
}

