
public class Person implements ICharacterInfo{
	//normal sınıf da interface sınıfımızı implement edersek otomatikmen oradaki metodları da override ederiz..

	@Override
	public void name() {
			System.out.println("Adı: Yunus");
	}

	@Override
	public void from() {
			System.out.println("Memleketi: Giresun");
	}

	@Override
	public void privateInfo() {
			System.out.println("23 yaşında 80kg 1.80 boyunda");
	}

}
