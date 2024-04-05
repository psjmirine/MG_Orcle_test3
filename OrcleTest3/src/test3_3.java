public class test3_3 {
    public static void main(String[] args) {
        float d = 10.0f; // float는 꼭 f붙일것
        boolean a = true;
        boolean b = true;
        boolean c = false;

        System.out.println(d);
        //System.out.println(a<=b); //오직 ==, !=만 가능하다. 관계연산 불가
        System.out.println(a==b);
        System.out.println(c==a);
    }
}
