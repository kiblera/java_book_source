package main.java.chapter4;

class Example4 {

    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++) {
            if (i <= 9){
                return;
            }

            System.out.println(i);
        }
    }
}