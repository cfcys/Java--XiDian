package task4;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws NumberFormatException, Exception {
		//第一个内容
		Scanner in = new Scanner(System.in);
		System.out.println("请输入您要存取的内容：");
		String a = in.nextLine();
		String c = in.nextLine();
		File file1 = new File("1.txt");
		FileWriter out1 = new FileWriter(file1);
		out1.write(a);
		out1.write(c);
		out1.close();
		FileReader in1 = new FileReader("1.txt");
		BufferedReader bReader = new BufferedReader(in1);//new一个BufferedReader对象，将文件内容读取到缓存
	    StringBuilder sb = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
	    String s = "";
	    while ((s =bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
	            sb.append(s + "\n");//将读取的字符串添加换行符后累加存放在缓存中
//	            System.out.println(s);
	    }
	    bReader.close();
	    String str = sb.toString();
	    System.out.println("读取到的内容为"+str);
		int size = 5;
		double[] List = new double[size];
		List[0] = 1.23;
		List[1] = 69.88;
		List[2] = 34.45;
		List[3] = 67.98;
		List[4] = 2345.67;
		File file2 = new File("a.dat");
		FileOutputStream fos = new FileOutputStream(file2) ;
	    ObjectOutputStream oos = new ObjectOutputStream(fos) ;
	    oos.writeObject(List);
	    System.out.println("文件已存入");
	    oos.close();
	    fos.close();
//读取该二进制文件。
	    FileInputStream fis = new FileInputStream(file2) ;
	    ObjectInputStream ois = new ObjectInputStream(fis) ;
	    double[] List2 = (double[])ois.readObject() ;
	    for(int i = 0;i<5;i++) {
	    	System.out.println(List2[i]);
	    }
	    ois.close();
	    fis.close();
	    System.out.println("**************华丽的分割线****************");
//以可打印形式存储到文件中。
	    File file = new File("a.txt");
		FileWriter out = new FileWriter(file);
		for(int i = 0;i<size;i++) {
			try {
				out.write(List[i]+"\r");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	    out.close();
	    FileReader in2 = new FileReader("a.txt");
		BufferedReader bReader2 = new BufferedReader(in2);//new一个BufferedReader对象，将文件内容读取到缓存
	    StringBuilder sb2 = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
	    String s2 = "";
	        while ((s2 =bReader2.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
	            sb2.append(s2 + "\n");//将读取的字符串添加换行符后累加存放在缓存中
//	            System.out.println(s);
	        }
	    bReader2.close();
	    String str2 = sb2.toString();
	    System.out.println("读取到的内容为"+str2);
//		for(int i = 0;i<size;i++) { //之前走的一些弯路。
//		List[i] = Double.parseDouble(decimal2Binary((float)List[i]));
//	}
//	
//	File file = new File("a.txt");
//	FileWriter out = new FileWriter(file);
//	for(int i = 0;i<size;i++) {
//		try {
//			out.write(List[i]+"\r");
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//	}
//	out.close();
	}
//	//Double转为二进制的函数
//	public static String decimal2Binary(double value) throws Exception {
//	        // 整数部分的值
//	        int in = (int) value;
//	        double r = value - in;
//	        StringBuilder stringBuilder = new StringBuilder();
//	        int remainder = 0;
//	        int quotient = 0;
//	        while (in != 0) {
//	            // 得商
//	            quotient = in / 2;
//	            // 得余数
//	            remainder = in % 2;
//	            stringBuilder.append(remainder);
//	            in = quotient;
//	        }
//	        stringBuilder.reverse();
//	        stringBuilder.append(".");
//
//	        int count = 32; // 限制小数部分位数最多为32位，如果超过32为则抛出异常
//	        double num = 0;
//	        while (r > 0.0000000001) {
//	            count--;
//	            num = r * 2;
//	            if (num >= 1) {
//	                stringBuilder.append(1);
//	                r = num - 1;
//	            } else {
//	                stringBuilder.append(0);
//	                r = num;
//	            }
//	        }
//
//	        return stringBuilder.toString();
//	    }
}
