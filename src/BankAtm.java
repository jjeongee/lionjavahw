import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BankAtm {
    private static String accountnumber ="";
    private static String membername =" ";
    private static Integer accountmoney =0;
    private static Integer deltamoney =0;
    private static String register;
    private static Scanner sc = new Scanner(System.in);
    private static boolean isCreated=false; //계좌 생성 여부
    //전체 메뉴 작성
    public static void main(String[] args) {
        do{
            System.out.println("=====Bank Menu=====");
            System.out.println("1.계좌 개설");
            System.out.println("2.입금하기");
            System.out.println("3.출금하기");
            System.out.println("4.전체조회");
            System.out.println("5.계좌이체");
            System.out.println("6.전체종료");
            System.out.println("===================");
            System.out.println("입력 : ");

            Integer register_input=sc.nextInt();
            boolean stop=false;
            ArrayList members=new ArrayList<>();

            while(!stop){
    
                    //파이썬 dictonary와 같은 기능
                    HashMap account = new HashMap();
                
                if(register_input==1){
                    System.out.println("=====계좌 개설=====");
                    //계좌 생성
                    System.out.println("계좌번호: ");
                    accountnumber=sc.nextLine();
                    System.out.println("이름: ");
                    membername=sc.nextLine();
                    System.out.println("예금: ");
                    accountmoney=sc.nextInt();
                    System.out.println("##계좌개설이 완료되었습니다.##");
                    System.out.println("==============");
    
                    account.put("accountnumber", accountnumber);
                    account.put("membername", membername);
                    account.put("accountmoney", accountmoney);
    
                    //리스트에 각 사람의 계좌와 정보를 저장
                    members.add(account);
    
                }
                else if(register_input==2){
                    System.out.println("=====입금 하기=====");
                     //입금하기(입력)
                    System.out.println("입금하실 계좌번호를 입력해주세요: ");
                    accountnumber=sc.nextLine();
                    System.out.println("이름: "+account.get(membername));
                    System.out.println("예금: "+account.get(accountmoney));
                    System.out.println("입금하실 금액을 입력해주세요: ");
                    deltamoney=sc.nextInt();
                    accountmoney+=deltamoney;
                    account.put("finalmoney",accountmoney);
                    //입금하기(출력)
                    System.out.println("##계좌 잔고: "+account.get("finalmoney")+"원 ##");
                    System.out.println("##입금이 완료되었습니다.##");
                    System.out.println("==============");
    
                }
                else if(register_input==3){
                    System.out.println("=====출금 하기=====");
                    //출금하기(입력)
                    System.out.println("출금하실 계좌번호를 입력해주세요: ");
                    accountnumber=sc.nextLine();
                    System.out.println("이름: "+account.get(membername));
                    System.out.println("예금: "+account.get(accountmoney));
                    System.out.println("출금하실 금액을 입력해주세요: ");
                    deltamoney=sc.nextInt();
                    accountmoney-=deltamoney;
                    account.put("finalmoney",accountmoney);
                    //출금하기(출력)
                    System.out.println("##계좌 잔고: "+account.get("finalmoney")+"원 ##");
                    System.out.println("##출금이 완료되었습니다.##");
                    System.out.println("==============");
    
                }
                else if(register_input==4){
                    System.out.println("=====전체 조회=====");
                }
                else if(register_input==5){
                    System.out.println("=====계좌 이체=====");
                }
                else if(register_input==6){
                    System.out.println("##프로그램을 종료합니다.##");
                    System.exit(0);
                    break;
                }
                else{
                    System.out.println("잘못된 입력값입니다. 입력값을 확인해주세요");
                }
    

            }

        }   
    }
}
            
           
            
            

