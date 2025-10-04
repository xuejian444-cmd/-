import java.util.Scanner;
public class hou2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score = sc.nextInt();
        if(score<0 || score>100){//短路螺距运算符||来判断成绩输入的范围
            System.out.println("成绩输入错误");
        } else{//if语句的嵌套
            if(score>=90){//这里没必要再用短路逻辑运算符&&来小于等于100
                //因为上面已经限定了范围,也就是限定了上界,我们只管下界
                System.out.println('A');
            } else if(score>=80){
                System.out.println('B');
            } else if(score>=70){
                System.out.println('C');
            } else if(score>=60){
                System.out.println('D');
            } else{
                System.out.println('E');
            }
            //总结:if单语句就是一个简单的判断,而if-else是对变量的两种状态的判断
            //if-else if语句则是对变量多种状态(同一标准的状态)的判断
            //以上都只输出一种结果(变量真正所处的状态)
            //但多个独立if语句相连则可对多个变量判断或者对变量不同标准状态的判断
            //比如我要判断他的性别,学历,婚姻状态,则可用三个独立的if语句,而非if-else if语句
            //而if语句的嵌套可用于对输入范围的判断

        }
    }
}