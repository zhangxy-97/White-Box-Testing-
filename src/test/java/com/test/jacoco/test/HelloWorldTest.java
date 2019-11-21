package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);//(1)a > 5, b < 0
    	//zxy :  add test case
    	int b = hw.Method3(6, 1, -1); //(2)a > 5, b >= 0, c <= 0
        int c = hw.Method3(6,1,1);//(3)a > 5, b >= 0, c > 0
        int d = hw.Method3(4,1,-3);//(4)a <= 5, c < -2
        int e = hw.Method3(4,1,-1);//(5)a <= 5, -2 <= c <= 0
        int f = hw.Method3(4,1,1);//(6)a <= 5, c > 0
        int g = hw.Method3(5,0,-1);//(7)special a = 5, c <=0
    	
    }

    @Test
    public void testMethod4(){
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0,0,0,0,0);//a = 0,return
        int b = hw.Method4(5,5,0,0,0);//a = b = 5
        int c = hw.Method4(4,4,0,0,0);//a = b != 5
//        int d = hw.Method4(1,2,3,4,0.1f);//a != b, c != d  此时x = 0，程序抛出异常
//        int e = hw.Method4(1,2,3,3,0.1f);//a != b, c = d, a != 5   此时x = 0，程序抛出异常
        int f = hw.Method4(5,2,3,3,0);//a != b, c = d, a = 5

    }

    @Test
    public void testbug(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(5);//true
        boolean b = hw.bug(4);//false

        assertEquals(true, a);
        assertEquals(false, b);
    }

    @Test
    public void testisTriangle(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(3,4,5);

        boolean b = hw.isTriangle(0,1,1);
        boolean c = hw.isTriangle(1,0,1);
        boolean d = hw.isTriangle(1,1,0);
        boolean e = hw.isTriangle(-2147483648,2,5);

        boolean f = hw.isTriangle(1,3,5);
        boolean g = hw.isTriangle(1,5,3);
        boolean h = hw.isTriangle(5,1,3);
        boolean i = hw.isTriangle(2147483647,1,2147483646);

        assertEquals(true, a);
        assertEquals(false, b);
        assertEquals(false, c);
        assertEquals(false, d);
        assertEquals(false, e);
        assertEquals(false, f);
        assertEquals(false, g);
        assertEquals(false, h);
        assertEquals(false, i);

    }

    @Test
    public void testisBirthday(){
        HelloWorld hw = new HelloWorld();

        boolean a1 = hw.isBirthday(1899,1,1);
        boolean a2 = hw.isBirthday(2020,1,1);

        boolean b11 = hw.isBirthday(2008,1,32);
        boolean b12 = hw.isBirthday(2008,1,0);
        boolean b13 = hw.isBirthday(2008,1,16);//true
        boolean b21 = hw.isBirthday(2018,2,29);
        boolean b22 = hw.isBirthday(2018,2,0);
        boolean b23 = hw.isBirthday(2008,2,29);//true
        boolean b24 = hw.isBirthday(2008,2,0);
        boolean b25 = hw.isBirthday(2008,2,30);
        boolean b26 = hw.isBirthday(2018,2,28);//true
        boolean b31 = hw.isBirthday(2018,3,32);
        boolean b32 = hw.isBirthday(2018,3,0);
        boolean b33 = hw.isBirthday(2018,3,2);//true
        boolean b41 = hw.isBirthday(2018,4,31);
        boolean b42 = hw.isBirthday(2018,4,0);
        boolean b43 = hw.isBirthday(2018,4,15);//true
        boolean b51 = hw.isBirthday(2018,5,32);
        boolean b52 = hw.isBirthday(2018,5,0);
        boolean b53 = hw.isBirthday(2018,5,31);//true
        boolean b61 = hw.isBirthday(2018,6,31);
        boolean b62 = hw.isBirthday(2018,6,0);
        boolean b63 = hw.isBirthday(2018,6,30);//true
        boolean b71 = hw.isBirthday(2018,7,32);
        boolean b72 = hw.isBirthday(2018,7,0);
        boolean b73 = hw.isBirthday(2018,7,31);//true
        boolean b81 = hw.isBirthday(2018,8,32);
        boolean b82 = hw.isBirthday(2018,8,0);
        boolean b83 = hw.isBirthday(2018,8,31);//true
        boolean b91 = hw.isBirthday(2018,9,31);
        boolean b92 = hw.isBirthday(2018,9,0);
        boolean b93 = hw.isBirthday(2018,9,30);//true
        boolean b101 = hw.isBirthday(2018,10,32);
        boolean b102 = hw.isBirthday(2018,10,0);
        boolean b103 = hw.isBirthday(2018,10,31);//true
        boolean b111 = hw.isBirthday(2018,11,31);
        boolean b112 = hw.isBirthday(2018,11,0);
        boolean b113 = hw.isBirthday(2018,11,30);//true
        boolean b121 = hw.isBirthday(2018,12,32);
        boolean b122 = hw.isBirthday(2018,12,0);
        boolean b123 = hw.isBirthday(2018,12,31);//true

        boolean c91 = hw.isBirthday(2019,9,15);//true
        boolean c101 = hw.isBirthday(2019,10,1);//true
        boolean c102 = hw.isBirthday(2019,10,2);
        boolean c111 = hw.isBirthday(2019,11,1);
        boolean c121 = hw.isBirthday(2019,12,1);

        boolean d1 = hw.isBirthday(2011,13,1);
        boolean d2 = hw.isBirthday(1997,9,18);//true


        assertEquals(false,a1);
        assertEquals(false,a2);

        assertEquals(false,b11);
        assertEquals(false,b12);
        assertEquals(true,b13);
        assertEquals(false,b21);
        assertEquals(false,b22);
        assertEquals(true,b23);
        assertEquals(false,b24);
        assertEquals(false,b25);
        assertEquals(true,b26);
        assertEquals(false,b31);
        assertEquals(false,b32);
        assertEquals(true,b33);
        assertEquals(false,b41);
        assertEquals(false,b42);
        assertEquals(true,b43);
        assertEquals(false,b51);
        assertEquals(false,b52);
        assertEquals(true,b53);
        assertEquals(false,b61);
        assertEquals(false,b62);
        assertEquals(true,b63);
        assertEquals(false,b71);
        assertEquals(false,b72);
        assertEquals(true,b73);
        assertEquals(false,b81);
        assertEquals(false,b82);
        assertEquals(true,b83);
        assertEquals(false,b91);
        assertEquals(false,b92);
        assertEquals(true,b93);
        assertEquals(false,b101);
        assertEquals(false,b102);
        assertEquals(true,b103);
        assertEquals(false,b111);
        assertEquals(false,b112);
        assertEquals(true,b113);
        assertEquals(false,b121);
        assertEquals(false,b122);
        assertEquals(true,b123);

        assertEquals(true,c91);
        assertEquals(true,c101);
        assertEquals(false,c102);
        assertEquals(false,c111);
        assertEquals(false,c121);

        assertEquals(false,d1);
        assertEquals(true,d2);

    }

    @Test
    public void testminiCalculator(){
        HelloWorld hw = new HelloWorld();
        double a1 = hw.miniCalculator(1,2,'+');
        double a2 = hw.miniCalculator(Double.MAX_VALUE,Double.MAX_VALUE,'+');
        double a3 = hw.miniCalculator(Double.MAX_VALUE,Double.MIN_VALUE,'+');

        double b1 = hw.miniCalculator(1,2,'-');
        double b2 = hw.miniCalculator(Double.MAX_VALUE,Double.MAX_VALUE,'-');
        double b3 = hw.miniCalculator(Double.MAX_VALUE,Double.MIN_VALUE,'-');

        double c1 = hw.miniCalculator(1,2,'*');
        double c2 = hw.miniCalculator(Double.MAX_VALUE,Double.MAX_VALUE,'*');
        double c3 = hw.miniCalculator(Double.MIN_VALUE,Double.MIN_VALUE,'*');

        double d1 = hw.miniCalculator(1,2,'/');
        double d2 = hw.miniCalculator(1,0,'/');
        double d3 = hw.miniCalculator(-1,0,'/');
        double d4 = hw.miniCalculator(0,0,'/');
        double e1 = hw.miniCalculator(1,2,'=');

        assertEquals(3, a1, 0);
        assertEquals(Double.POSITIVE_INFINITY, a2, 0);
        assertEquals(Double.MAX_VALUE, a3, 0);

        assertEquals(-1, b1, 0);
        assertEquals(0, b2, 0);
        assertEquals(Double.MAX_VALUE, b3, 0);

        assertEquals(2, c1, 0);
        assertEquals(Double.POSITIVE_INFINITY, c2, 0);
        assertEquals(0, c3, 0);

        assertEquals(0.5, d1, 0);
        assertEquals(Double.POSITIVE_INFINITY, d2, 0);
        assertEquals(Double.NEGATIVE_INFINITY, d3, 0);
        assertEquals(Double.NaN, d4, 0);

        assertEquals(0, e1, 0);


    }
}
