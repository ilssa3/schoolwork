import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Examps {

	public static void main(String[] args) {
//Списък от 100 души - съхраняваимена и номер на пароли
		
	HashMap<Integer,String>PassportAndNames = new HashMap<>();
		// key, value
	
	//добавяне на елементи
	PassportAndNames.put(5265415,"Damqn Vladimirov Kalkanow");
	PassportAndNames.put(6363639, "Khan Asparuh Donew Tenew");
	PassportAndNames.put(2351872,"Putyo Putyo");
	PassportAndNames.put(2353376,"Niki Kunchev");

	System.out.println(PassportAndNames);
	
	//Да видим стойността на ключ
	String Lname = PassportAndNames.get(235187256);
	System.out.println(Lname);
	
	//премахване на ел
	PassportAndNames.remove(5265415);
	System.out.println(PassportAndNames);
	
	//садържа ли се? (булеви)
	System.out.println(PassportAndNames.containsKey(6363639));
	System.out.println(PassportAndNames.containsValue("Damqn Vladimirov Kalkanow"));

	//в арей лист
	Set Keys = PassportAndNames.keySet();
	System.out.println("Keys : "+Keys);
	ArrayList<String>values= new ArrayList<>(PassportAndNames.values());
	System.out.println("Stoinosti : "+values);
	
	//подаване na dweoika stojnosti ot edin hashMap в друг
	HashMap<Integer,String>bordCardList = new HashMap<>();
	bordCardList.put(131619, "Yasen Plamenov Minev - Kuchana");
	bordCardList.put(888888, "Mladen Petrov Mladenov");
	bordCardList.put(423856, "Nikola Papi Parushev - Bajo");
	bordCardList.put(333333, "Iliyana Iskarova ^2 ");
	bordCardList.put(333332, "Dimitar Hristomirev - Metko");
	
	PassportAndNames.putAll(bordCardList);
	System.out.println(PassportAndNames);
	}

}
