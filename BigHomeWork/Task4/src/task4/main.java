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
		//��һ������
		Scanner in = new Scanner(System.in);
		System.out.println("��������Ҫ��ȡ�����ݣ�");
		String a = in.nextLine();
		String c = in.nextLine();
		File file1 = new File("1.txt");
		FileWriter out1 = new FileWriter(file1);
		out1.write(a);
		out1.write(c);
		out1.close();
		FileReader in1 = new FileReader("1.txt");
		BufferedReader bReader = new BufferedReader(in1);//newһ��BufferedReader���󣬽��ļ����ݶ�ȡ������
	    StringBuilder sb = new StringBuilder();//����һ���ַ������棬���ַ�����Ż�����
	    String s = "";
	    while ((s =bReader.readLine()) != null) {//���ж�ȡ�ļ����ݣ�����ȡ���з���ĩβ�Ŀո�
	            sb.append(s + "\n");//����ȡ���ַ�����ӻ��з����ۼӴ���ڻ�����
//	            System.out.println(s);
	    }
	    bReader.close();
	    String str = sb.toString();
	    System.out.println("��ȡ��������Ϊ"+str);
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
	    System.out.println("�ļ��Ѵ���");
	    oos.close();
	    fos.close();
//��ȡ�ö������ļ���
	    FileInputStream fis = new FileInputStream(file2) ;
	    ObjectInputStream ois = new ObjectInputStream(fis) ;
	    double[] List2 = (double[])ois.readObject() ;
	    for(int i = 0;i<5;i++) {
	    	System.out.println(List2[i]);
	    }
	    ois.close();
	    fis.close();
	    System.out.println("**************�����ķָ���****************");
//�Կɴ�ӡ��ʽ�洢���ļ��С�
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
		BufferedReader bReader2 = new BufferedReader(in2);//newһ��BufferedReader���󣬽��ļ����ݶ�ȡ������
	    StringBuilder sb2 = new StringBuilder();//����һ���ַ������棬���ַ�����Ż�����
	    String s2 = "";
	        while ((s2 =bReader2.readLine()) != null) {//���ж�ȡ�ļ����ݣ�����ȡ���з���ĩβ�Ŀո�
	            sb2.append(s2 + "\n");//����ȡ���ַ�����ӻ��з����ۼӴ���ڻ�����
//	            System.out.println(s);
	        }
	    bReader2.close();
	    String str2 = sb2.toString();
	    System.out.println("��ȡ��������Ϊ"+str2);
//		for(int i = 0;i<size;i++) { //֮ǰ�ߵ�һЩ��·��
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
//	//DoubleתΪ�����Ƶĺ���
//	public static String decimal2Binary(double value) throws Exception {
//	        // �������ֵ�ֵ
//	        int in = (int) value;
//	        double r = value - in;
//	        StringBuilder stringBuilder = new StringBuilder();
//	        int remainder = 0;
//	        int quotient = 0;
//	        while (in != 0) {
//	            // ����
//	            quotient = in / 2;
//	            // ������
//	            remainder = in % 2;
//	            stringBuilder.append(remainder);
//	            in = quotient;
//	        }
//	        stringBuilder.reverse();
//	        stringBuilder.append(".");
//
//	        int count = 32; // ����С������λ�����Ϊ32λ���������32Ϊ���׳��쳣
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
