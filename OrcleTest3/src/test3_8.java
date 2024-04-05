public class test3_8 {
    private int num;
    public test3_8(int num){
        this.num = num;
    }

    public static void main(String[] args) {
        test3_8 s1 = new test3_8(10);
        test3_8 s2 = s1;
        s1 = new test3_8(10); // 새 정의 를 했기때문에 false 만약 없다면

        System.out.println(s1 == s2);

    }
}
