package accountbook;

public class remove {
	public void removeInitialization(message) { //아직 작동 안함
		Income im = new Income(message);
		Expense em = new Expense(message);
		//수입삭제할지 지출삭제할지 월 일 메모까지 해서 삭제할 거 결정
		if(incomeList.contains(im)) {
			
			for(i=0;i<incomeList.length;i++) {
				if(incomList.get(i)==message) {
					incomList.remove(i);
				}
			}
		}
		else if(expenseList.contains(em)) {
			System.out.println(expenseList.get(expenseList.indexOf(em)));
		} else {
			System.out.println("지출내역이 없습니다.");
		}
		
	}
}
