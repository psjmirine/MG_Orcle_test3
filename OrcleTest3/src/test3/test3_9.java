package test3;

public class test3_9 {
    private int num;
    private String name;

    public test3_9(int num, String name){
        this.num = num;
        this.name = name;
    }

    public boolean equals(Object obj){
        if(obj == null) {
            return false;
        }

        if(obj instanceof test3_9){
            test3_9 obj2 = (test3_9)obj;
        }
        return false;
    }
}
