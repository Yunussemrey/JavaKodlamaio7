
public class Main {

	public static void main(String[] args) {

		//Burada interface sınıfı new'lenemez. Tanımlı metodlar var ama içi boş. o yüzden implement edilen sınıfı new ederiz ve onun bilgilerini yazdırırız.
		ICharacterInfo characterInfo=new PersonNew();
		characterInfo.name();
		characterInfo.from();
		characterInfo.privateInfo();
	}

}
