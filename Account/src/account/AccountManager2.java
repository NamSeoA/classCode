package account;

public class AccountManager2 implements Util{

		private Account[] accountArray;
		private int cnt;
		
		private AccountManager2(int num) {
			accountArray = new Account[num];
			cnt = 0;
		}
		

//		private static AccountManager2 manager = new AccountManager2(10);
		
		//외부에서 참조변수를 받을 수 있는 메서드
//		public static AccountManager2 getInstance() {
//			return manager;
//		}

		//정보저장
		// 배열에 새로운 계좌 정보를 저장하는 메서드
		private void addInfor(Account info) {
			accountArray[cnt++] = info;
		}
		
		//사용자에게 정보 입력 받음 -> 계좌 정보를 인스턴스로 생성하고 배열에 저장
		public void CreateAccount() {
			
			if(accountArray.length==cnt) {
				System.out.println("더이상 정보를 저장할 수 없습니다.");
				System.out.println("일부 정보를 삭제하고 저장 공간을 확보해주세요.");
			}
			
			System.out.println("========================== ");
			System.out.println("계좌번호를 생성하겠습니다");
			System.out.println("새로 만드실 계좌번호를 입력해주세요.");
			System.out.println("계좌 번호 :  ");
			String AccountNumber = SC.next();
			System.out.println("계좌주 : ");
			String AccountName = SC.next();
			System.out.print("비밀번호 : "); //수정 필요 __숫자 4자리 입력
			String Password = SC.next();
			
			addInfor(AccountNumber, AccountName,Password);
			
			
			
		}
		
		//계좌등록
/*		public void CreateAccount() {
			for (int i = 0; i < accountArray.length; i++) {
				System.out.println("========================== ");
				System.out.println("계좌번호를 생성하겠습니다");
				System.out.println("새로 만드실 계좌번호를 입력해주세요.");
				System.out.println("계좌 번호 :  ");
				String AccountNumber = SC.next();
				if (FindAccount_Nu(AccountNumber) != null) { //계좌번호가 중복될시
					System.out.println("※ 계좌번호가 중복됩니다. ");
					return;
				} else {
					System.out.println("계좌주 : ");
					String AccountName = SC.next();
					System.out.print("비밀번호 : "); //수정 필요 __숫자 4자리 입력
					String Password = SC.next();
					accountArray[i] = new Account(AccountNumber, AccountName, Password, balance, totalTrans);
				}
				System.out.println("============================================================================");
				System.out.println("*" + FindAccount_Nu(AccountNumber).getAccountName() + "님의 계좌가 정상적으로 개설되었습니다.");
				System.out.println("[계좌 주: " + accountArray[0].getAccountName() + "] , [계좌 번호: " + accountArray[0].getAccountNumber() + "] 입니다.");    
				System.out.println("========================================");
				System.out.println("※ 위 내용을 확인 바랍니다. \r");
				return;
			}
			System.out.println("※ 계좌를 개설 하실 수 없습니다.");
		}

		// 검색된 계좌 객체를 반환하는 메서드
		public static Account FindAccount_Nu(String AccountNumber) {
			for (int i = 0; accountArray[i] != null; i++)
				if (accountArray[i].getAccountNumber().equals(AccountNumber)) //전달받은 계좌번호와 저장되어 있는 계좌번호가 일치하면
					return accountArray[i];
			return null;
		}

		*/
		
		// 계좌 조회 
		public void AccountCheck() {
			String accountName;  //조회할 계좌주
			Account account;     //등록된 계좌

			System.out.println("[   계 좌 조 회    ]");
			if (accountArray[0] == null) {
				System.out.println("※ 등록된 계좌가 없습니다.");
				return;
			}
			System.out.print("조회하실 계좌주 : ");
			accountName = SC.nextLine();
			account = FindAccount_Na(accountName);
			if (!accountName.equals(account.getAccountName())) {
				System.out.println();
				System.out.println("※ 등록된 정보와 일치하지 않습니다.");
				System.out.println("※ 확인 후 다시 이용바랍니다.");
				return;
			} try {
				System.out.print((new StringBuilder(String.valueOf(accountName))).append(" 비밀번호 : ").toString());
				String Password = SC.nextLine();
				if (Password.equals(account.getPassword())) {
					for (int i = 0; accountArray[i] != null; i++)
						if (account.getAccountName().equals(accountArray[i].getAccountName())) {
							Account AccountCheck = accountArray[i];
							if (AccountCheck != null) {
								System.out.println("=========================");
								System.out.println((new StringBuilder("     ")).append(AccountCheck.getAccountName()).append(" 님의 계좌 정보").toString());
								System.out.println("-------------------------");
								System.out.println((new StringBuilder("조회하신 계좌주\t:")).append(AccountCheck.getAccountName()).toString());
								System.out.println((new StringBuilder(String.valueOf(AccountCheck.getAccountName()))).append(" 님의 계좌번호\t:").append(AccountCheck.getAccountNumber()).toString());
								System.out.println((new StringBuilder(String.valueOf(AccountCheck.getAccountName()))).append(" 님의 잔 액 \t:").append(AccountCheck.getBalance()).append(" 원").toString());
								System.out.println("=========================");
								System.out.println("※ 등록된 계좌 정보를 확인 하였습니다.\r");
							}
						}
				} else if (!Password.equals(account.getPassword())) {
					System.out.println("※ 비밀번호가 일치 하지 않습니다.");
					System.out.println("※ 확인 후 다시 이용 바랍니다.");
					return;
				}
			} catch (Exception e) {
				System.out.println("등록된 계좌 정보가 존재하지 않습니다.\r");
			} 
			return;
		}

		public static Account FindAccount_Na(String AccountName) {
			for (int i = 0; accountArray[i] != null; i++)
				if (accountArray[i].getAccountName().equals(AccountName))
					return accountArray[i];
			return null;
		}

		
		
		// 계좌 입금
		public void saving() {
			System.out.println("[===입  금===]");
			System.out.print("계좌 번호: ");
			String number = SC.next();
			Account account = FindAccount_Nu(number);
			if(FindAccount_Nu(AccountNumber) == null) {
				System.out.println("존재하지 않는 계좌입니다.");
				System.out.println("계좌번호를 다시 확인하시기 바랍니다.");
				System.out.println();
				return;
			}
			System.out.println("비밀번호 입력 : ");
			String password = SC.next();
			if (account != null) {
				if (!password.equals(account.getPassword())) {
					System.out.println("비밀번호가 일치하지 않습니다.");
					System.out.println("확인 후 이용 바랍니다.");
					System.out.println();
				} else {
					System.out.print("입금 금액 : ");
					long money = SC.nextLong();
					System.out.println();
					account.setBalance(account.getBalance() + money);	// 잔액+입금 금액
					transactions[totalTrans++] = new Transaction("입금", money);	// 거래내역 추가
					System.out.println("계좌에 " + money + "원이 입금되었습니다.");
					System.out.println("현재 잔액은 " + account.getBalance() + "원 입니다.\r");
					System.out.println();
				}
			}
		}

		// 계좌 출금
		public void withdraw() {
			System.out.println("[===출  금===]");
			System.out.print("계좌 번호: ");
			String number = SC.next();
			Account account = FindAccount_Nu(number);
			if(FindAccount_Nu(AccountNumber) == null) {
				System.out.println("존재하지 않는 계좌입니다.");
				System.out.println("계좌번호를 다시 확인하시기 바랍니다.");
				System.out.println();
				return;
			}
			System.out.println("비밀번호 입력 : ");
			String password = SC.next();
			if (!password.equals(account.getPassword())) {
				System.out.println("입력하신 비밀번호가 일치하지 않습니다.");
				System.out.println("확인 후 이용 바랍니다.");
				System.out.println();
			}
			if (account != null) {
				System.out.print("출금 금액: \r");
				long money = SC.nextLong();
				if (money > account.getBalance()) {
					System.out.println("잔액이 부족하여 출금할 수 없습니다.");
					System.out.println();
				} else {
					account.setBalance(account.getBalance() - money);	// 잔액-출금 금액
					transactions[totalTrans++] = new Transaction("출금", money);	// 거래내역 추가
					System.out.println("계좌에서 " + money + "원이 출금되었습니다.");
					System.out.println("현재 잔액은 " + account.getBalance() + "원 입니다.\r");
					System.out.println();
				}
			}

		}

		// 계좌 이체
		public void transfer() {
			System.out.println("[===이  체===]");
			System.out.print("계좌 번호: ");
			String number = SC.next();
			Account account = FindAccount_Nu(number);
			if(FindAccount_Nu(AccountNumber) == null) {
				System.out.println("존재하지 않는 계좌입니다.");
				System.out.println("계좌번호를 다시 확인하시기 바랍니다.");
				System.out.println();
				return;
			}
			System.out.println("비밀번호 입력 : ");
			String password = SC.next();
			if (!password.equals(account.getPassword())) {
				System.out.println("입력하신 비밀번호가 일치하지 않습니다.");
				System.out.println("확인 후 이용 바랍니다.");
				System.out.println();
			}
			System.out.println("보내실 금액: ");
			long money = SC.nextInt();
			if (money > account.getBalance()) {
				System.out.println("잔액이 부족하여 이체할 수 없습니다.");
				System.out.println();
			} else {
				System.out.println("이체할 계좌 : ");
				String number1 = SC.next();
				Account account1 = FindAccount_Nu(number1);

				if(FindAccount_Nu(number1)==null) {
					System.out.println("존재하지 않는 계좌입니다.");
					System.out.println();
				}
				account.setBalance(account.getBalance() - money);	// account의 잔액-이체금액
				account1.setBalance(account1.getBalance() + money);	// account1의 잔액+이체금액
				transactions[totalTrans++] = new Transaction("이체", money);	// 거래내역 추가
				System.out.println("현재 잔고는 " + account.getBalance() + "원 입니다.\r");
				System.out.println();
			}

		}

		public String getAccountNumber() {
			return AccountNumber;
		}

		public void setAccountNumber(String AccountNumber) {
			this.AccountNumber = AccountNumber;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public long getBalance() {
			return balance;
		}

		public void setBalance(long balance) {
			this.balance = balance;
		}

		public Transaction[] getTransaction() {
			return transactions;
		}

		public int getTotalTrans() {
			return totalTrans;
		}

		public void setTotalTrans(int totalTrans) {
			this.totalTrans = totalTrans;
		}

	}