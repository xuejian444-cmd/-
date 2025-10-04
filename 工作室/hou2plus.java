import java.util.Scanner;
public class hou2plus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score =sc.nextInt();
        int pan=score/10;
        //好像switch无法单独判断输入值的范围,所以我还是采用了if语句的嵌套
        if(score<0 || score>100){
            System.out.println("成绩输入不正确,请重新输入");
        }else{
          switch(pan){
              case 10,9://注意c语言中不能像这样连跟多个数值,c语言中要使用case的穿透
                  System.out.println("A");
                  break;
              case 8:
                  System.out.println("B");
                  break;
              case 7:
                  System.out.println("C");
                  break;
              case 6:
                  System.out.println("D");
                  break;
              default:
                  System.out.println("E");
                  break;
          }
          //总结:switch语句的使用建立在独立,明确的数值上,一般是有限个数值的判断
            //若数值不是简单的有限个,便尝试化为有限个,总不可能写一百个case吧
            //所以可以像写if语句一样,找一些数值的共同点,如90~100的十位都是9
            //从而将100个case化为了10个case
        }
    }
}
