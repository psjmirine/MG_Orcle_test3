package test2;

public class test2_2 {
    public static void literal1(){
        int a = 267;
        //int b = 0413; // 8진수
        int c = 0x20B; // 16진수
        int d = 0b100001011; // 2진수
        //int e = 0827; //8진수지만 8이있기때문에 실행불가

        System.out.print(a+"    ");
        //System.out.print(b+"    ");
        System.out.print(c+"    ");
        System.out.print(d+"    ");
        // System.out.print(e);
    }

    public static void literal2(){
        int a = 123_456_789;
        int b = 5_______2;
        //int c = _123_456_789; //앞에 _올수 없음
        //int d = 123_456_789_; // 뒤에 _올수 없음
        //float e = 3_.1415F; //. 앞, 뒤로 _올수 없읍
        // long f = 999_99_9999_L; //
        //byte g = 0b0_1;

        System.out.print(a+"    ");
        System.out.print(b+"    ");
        //System.out.print(d+"    ");
        //System.out.print(e+"    ");
        //System.out.print(f+"    ");
        //System.out.print(g+"    ");

    }
    public static void main(String... args){
        //literal1();
        literal2();

    }
}

