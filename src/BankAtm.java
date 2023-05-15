import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BankAtm{
    public static void main(String[] args) {
        boolean run = false;
        Scanner sc=new Scanner(System.in);
        Integer run_input;
        String accountnum;
        String insertnum;
        String username;
        Integer accountmoney;
        Integer deltamoney;
        ArrayList users= new ArrayList();
        HashMap user=new HashMap();

        do{
            System.out.println("======Bank Menu=====");
            System.out.println("1. 계좌 개설");
            System.out.println("2. 입금하기");
            System.out.println("3. 출금하기");
            System.out.println("4. 전체조회");
            System.out.println("5. 프로그램 종료");
            System.out.println("=====================");

            System.out.println("입력: ");
            run_input = sc.nextInt();

            switch(run_input){
                case 1:
                if(run_input==1){
                    run=true;
                    System.out.println("=====계좌 개설=====");
                    System.out.println("계좌 번호: ");
                    accountnum=sc.next();
                    System.out.println("이름: ");
                    username=sc.next();
                    System.out.println("예금: ");
                    accountmoney=sc.nextInt();
    
                    user.put("accountnum",accountnum);
                    user.put("username",username);
                    user.put("accountmoney",accountmoney);
                    users.add(user);
    
                    System.out.println("##계좌개설을 완료하였습니다##");
                    System.out.println("=================");
                }
                break;
                
                case 2:
                if(run_input==2){
                    run=true;
                    System.out.println("=================");
                    System.out.println("입금하실 계좌번호를 입력해주세요:");
                    insertnum=sc.next();
                    System.out.println("계좌 이름 : "+ user.get("username"));
                    System.out.println("계좌 잔고 : "+ user.get("accountmoney"));
                    System.out.println("입금할 금액을 입력하세요: ");
                    deltamoney=sc.nextInt();
                    if(deltamoney<=0){
                        System.out.println("금액 입력이 올바르지 않습니다");
                    }
                    else{
                        user.put("accountmoney",(int)user.get("accountmoney")+deltamoney);
                        System.out.println("##계좌 잔고:"+user.get("accountmoney")+"###");
                        System.out.println("입금이 완료되었습니다");
                        System.out.println("==============");
                    }
                }
                break;

                case 3:
                if(run_input==3){
                    run=true;
                    System.out.println("=================");
                    System.out.println("출금하실 계좌번호를 입력해주세요:");
                    insertnum=sc.next();
                    System.out.println("계좌 이름 : "+ user.get("username"));
                    System.out.println("계좌 잔고 : "+ user.get("accountmoney"));
                    System.out.println("출금할 금액을 입력하세요: ");
                    deltamoney=sc.nextInt();
                    if(deltamoney<(int)user.get("accountmoney")){
                        user.put("accountmoney",(int)user.get("accountmoney")-deltamoney);
                        System.out.println("##계좌 잔고:"+user.get("accountmoney")+"###");
                        System.out.println("출금이 완료되었습니다");
                        System.out.println("==============");
                    }
                    else{
                        System.out.println("잔고 부족");
                    }
                }
                break;

                case 4:
                if(run_input==4){
                    run=true;
                    System.out.println("====전체 조회=====");
                    for(Object account : users){
                        System.out.println(account);
                    }
                }
                break;

                case 5:
                if(run_input==5){
                    run=false;
                    System.out.println("입력을 종료합니다");
                    break;
                }

                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }while(run_input!=5);
    
    }
}