//    *前面有四个空格,一个宽度(1层),宽度=2*1-1
//   * *前面有三个空格,三宽度,中间一空格(2层),宽度=2*2-1
//  *   *前面有两个空格,五宽度,中间三空格(3层),宽度=2*3-1
// *     *前面有一个空格,七宽度,中间五空格(4层),宽度=2*4-1
//*********无空格,九宽度
//起始和结束有*(除了最后一层)
import java.util.Scanner;
public class hou3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ceng=sc.nextInt();
        int i;
        //外循环为层数
        for(i=1;i<=ceng;i++){//!!!不要用println,会自动换行(无语...)
            for(int j=1;j<=ceng-i;j++){//控制前面的空格
                System.out.print(" ");
            }for(int k=1;k<=2*i-1;k++){
                if(k==1 || k==2*i-1 || i==1 ||i==ceng){//控制*的位置
                    System.out.print("*");
                }else{//控制空心空格
                    System.out.print(" ");
                }
            }
            System.out.print("\n");//一层结束后换行
        }
    }
}
