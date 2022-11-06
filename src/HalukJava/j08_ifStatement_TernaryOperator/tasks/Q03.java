package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

Scanner sc=new Scanner(System.in);
        System.out.println("metre olarak boyunuz?");
double boy=sc.nextDouble();
        System.out.println("kg olarak kilonuz");
        int kilo= sc.nextInt();
        double bmi=(kilo/(boy*boy));
            if (bmi<020)
            {System.out.println("zayifsiniz");}
            else if(bmi>20 && bmi<=25)
            {System.out.println("Normal sinirlardasiniz");}
            else if(bmi>25 && bmi<=30)
            {System.out.println("Sisman kategorisindesiniz");}
            else if(bmi>30)
            {System.out.println("Obez grubundasiniz");}
            else System.out.println("yanlış değer girdiniz,tekrar deneyin");



        }

    }


