package mooc;

import java.util.Scanner;

public class Main {
	public static void main( String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction{
	int gcd(int a, int  b){
    if(b==0){
        return a;
    }
    return gcd(b, a%b);
	}
	int Fir,Sec,temp;
	public Fraction(int Fir,int Sec) {
		// TODO 自动生成的构造函数存根
		this.Fir = Fir;
		this.Sec = Sec;
	}
	void print(){
		temp = gcd(this.Fir,this.Sec);
		if(this.Fir == this.Sec) {
			System.out.println(1);
		}else {
		System.out.println(this.Fir/temp+"/"+this.Sec/temp);
		}	
	}
	Fraction plus(Fraction r) {
		int F1 = r.Fir;
		int S1 = r.Sec;
		int F2 = this.Fir;
		int S2 = this.Sec;
		if(S1 == S2) {
			F1 = F1 + F2;
		}else {
			F1 = S2 * F1;
			F2 = S1 * F2;
			S1 = S2 * S1;
			F1 = F1 + F2;
		}
		return new Fraction(F1,S1);
	}
	Fraction multiply(Fraction r) {
		int a = r.Fir;
		int b = r.Sec;
		a = a * this.Fir;
		b = b * this.Sec;
		return new Fraction(a,b);
	}
}


