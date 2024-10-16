//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1)
        int c=10;
        double f=1.8*c+32;
        System.out.println("celsius to fahrenheit="+f);

//2)
        double far=50;
        double cel= (far-32)/1.8;
        System.out.println("fahrenheit to celsius="+cel);

//3
        int feb=29;
        int year=2024;
        boolean k=true;
        boolean t=false;
        if(feb==29 && year%100>0 ){
            System.out.println(k);
        }
        if(feb==29 && year%100==0 ){
            System.out.println(t);
        }
        if(feb==29 && year%400==0){
            System.out.println(k);
        }
//4)
        int x=5;
        int y=-3;
        if(x>0 && y>0){
            System.out.println("pirveli meotxedi");
        }
        if(x<0 && y>0){
            System.out.println("meore meotxedi");
        }
        if(x<0 && y<0){
            System.out.println("mesame meotxedi");
        }
        if(x>0 && y<0){
            System.out.println("meotxe meotxedi");
        }
//5)
        String z="+";
        int u=10;
        int i=2;
        int result=u+i;
        if(z=="+") {
            System.out.println(u+z+i+"="+result);

        }
        else System.out.println("Uknown Symbol");
        }
        }

