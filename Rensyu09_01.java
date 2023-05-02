package rensyu09;

import lib.Input;

public class Rensyu09_01 {

	public static void main(String[] args) {
		//P202 練習問題9-2
		double x;			//先にdouble型のxを宣言しておく
		while((x=Input.getDouble())!=0) {		//while文で入力された数値が0じゃない限りは繰り返し続ける
			double y=Math.sqrt(x);		//入力したxをMathクラスのsqrtメソッドで平方根にしてyに代入する
			System.out.println(y);		//表示
		}
			
		//P204 練習問題9-3
		int value,total,kensu;	//int型の変数の宣言
		total=0;
		kensu=0;				//totalとkensuを0にしておく
		while((value=Input.getInt())!=0) {	//入力された値が0じゃない限りは繰り返し
			total+=value;	//totalに入力された値のvalueを足す
			kensu++;		//kensuに1足される
			System.out.println(total);		
		}
		System.out.println(total);
		System.out.println(kensu);
	}

}
