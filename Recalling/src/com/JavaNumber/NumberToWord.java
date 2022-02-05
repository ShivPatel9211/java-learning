package com.JavaNumber;

public class NumberToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToWord obj=new ToWord();
		obj.Convert(909);

	}

}

class ToWord{
	public void Convert(int input) {
		String[] one= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twevel",
				"thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String[] ten= {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		String hund="hundred";
		if ( input < 0 || input > 999 ) {
			System.out.println("Please enter correct digit between 0 to 100 ");
		}
		else {
			int once=input%10;
			int temp = input/10;
			int tens=temp%10;
			temp=temp/10;
			int hun=temp%10;
			String result;
			if (input<20) {
				result=one[input];
				System.out.println(result);
			}
			else if(input>19 && input<100) {
				result=ten[tens]+" " +one[once];
				System.out.println(result);
			}
			else {
				result=one[hun]+" "+hund+""+ten[tens]+" " +one[once];
				System.out.println(result);
			}
			
		}
	}
}
