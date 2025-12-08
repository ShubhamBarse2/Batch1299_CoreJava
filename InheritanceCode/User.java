package InheritanceCode;

public class User {

	public static void main(String[] args) {

		InstaGram i = new InstaGram();
		i.myLogin();
		i.myMsg();
		i.myRegister();
		i.myStory();
		i.myReels();

		Whatsapp w = new Whatsapp();
		w.myRegister();
		w.myLogin();
		w.myMsg();
		w.myStatus();
		w.myLocation();

		FaceBook fb = new FaceBook();
		fb.myRegister();
		fb.myLogin();
		fb.myMsg();
		fb.myPost();

		
		
		
	}

}
