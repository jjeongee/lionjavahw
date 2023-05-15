import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserRegister {
    public static void main(String[] args) {

        System.out.println("================");
        System.out.println("회원 등록");
        System.out.println("================");

        boolean register = false;
        Scanner sc=new Scanner(System.in);

        while(!register){
            System.out.println("회원가입을 하시겠습니까?\n y:진행 N:취소");
            System.out.println(">>");
            String register_input=sc.nextLine();

            if(register_input.equalsIgnoreCase("y")){
                register=true;
                System.out.println("====================");
                System.out.println("회원가입을 진행합니다.");
                System.out.println("====================");
            }
            else if(register_input.equalsIgnoreCase("N")){
                System.out.println("====================");
                System.out.println("회원가입이 종료됩니다.");
                System.out.println("====================");
                System.exit(0);
            }
            else{
                System.out.println("입력값을 확인해주세요.");
            }

        }

        ArrayList users=new ArrayList();
        while(true){
            HashMap user= new HashMap();

            //ID
            System.out.println("ID: ");
            String username= sc.nextLine();

            //PW
            String password="";
            while(true){
                System.out.println("PW: ");
                password=sc.nextLine();
                System.out.println("PW 확인: ");
                String password_confirm = sc.nextLine();

                if(password.equals(password_confirm)){
                    break;
                }
                else{
                    System.out.println("=================");
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    System.out.println("비밀번호를 다시 입력해주세요.");
                    System.out.println("=================");
                }

            }

            //NAME
            System.out.println("NAME: ");
            String realname= sc.nextLine();

            //BIRTH
            String birthday="";
            while(true){
                System.out.println("BRITHDAY: ");
                birthday=sc.nextLine();

                if(birthday.length()!=6){
                    break;
                }
                else{
                    System.out.println("=================");
                    System.out.println("생년월일이 6자리가 아닙니다.");
                    System.out.println("생년월일을 다시 입력해주세요.");
                    System.out.println("=================");
                }
        }
    }
}
