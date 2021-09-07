public class javaOOP {
    static int sum(int K){
        if(K > 0){
            return K + sum(K-1);
        }else {
            return 0;
        }
    }//call method in the same method.
    public static void main(String[] args){
        int result = sum(10);
        System.out.println("Result : " + result);

        NewCode newObj = new NewCode();//create new object called "newObj" using NewJava class.
        System.out.println(newObj.x);//print new object values.
    }
}
