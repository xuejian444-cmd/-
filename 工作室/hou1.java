import java.util.Scanner;//Scanner的类
public class hou1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//应用Scanner
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;//将原来的a给覆盖掉,创建一个新的a,也可以写成a+=b,与c语言一样
        b=a-b;//新的a减去原来的b就是原来的a
        a=a-b;//新的a减去新的b就是原来的b
        System.out.println(a);
        System.out.println(b);
        //整个问题在c语言中同样实用,就只是Scanner与scanf之间的不同
        //下面再补充引入第三变量的做法
        int x=sc.nextInt();
        int y=sc.nextInt();
        int e=x;//引入e作为中间值
        x=y;
        y=e;
        System.out.println(x);
        System.out.println(y);

    }
}
