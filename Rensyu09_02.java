package rensyu09;

import lib.Input;

public class Rensyu09_02 {

	public static void main(String[] args) {
		//P212 通貨テスト
		//1
		String text;
		while((text=Input.getString())!=null) {	//入力された文字列がnullでなければ繰り返し
			int num=text.length();				//textの文字数をnumに代入
			System.out.println("<"+num+">"+text);
		}
		
		//2
		System.out.println("\n");
		double total,value,kensu;
		total=0;
		kensu=0;
		while((value=Input.getDouble())!=0) {//入力された値が0じゃない限りは繰り返し
			total+=value;
			kensu++;
		}
		System.out.println("合計="+total);	
		System.out.println("件数="+kensu);
		System.out.println("平均="+total/kensu);
		
		//3
		System.out.println("\n");
		int n;
		while((n=Input.getInt())!=0) {
			System.out.println(Math.random());//乱数を表示するためのメソッド
		}
		
	}

}
