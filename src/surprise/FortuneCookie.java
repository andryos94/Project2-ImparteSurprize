package surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise {
	//read idioms from a file
	/*File file = new File("C:\\Users\\Andrei\\eclipse-workspace\\Project2-ImparteSurprize\\vorbededuh.txt");
	Scanner scanner = new Scanner(file);
	ArrayList<String> list = new ArrayList<String>();
	while (scanner.hasNext()){
	    list.add(scanner.next());
	}
	scanner.close();*/
	private static final ArrayList<String> idioms = new ArrayList<String>(Arrays.asList("Gigi Becali: „M-am certat si cu Mitica Dragomir, dar fara jigniri. El m-a facut oligofren, eu l-am facut zdreanta, dar nu ne-am insultat”.",
			"Dumitru Dragomir: „Dom'le, eu muncesc 24 de ore pe zi, iar uneori chiar si noaptea”",
			"Dumitru Graur: „Alina Astafei a dat nastere unei fiinte umane”",
			"Gabi Stan: „Pase scurte si pe sus, ai n-ai mingea, tragi la poarta”.",
			"Nicolae Vacaroi: „Noi suntem rapidisti din tata-n fiu, în afara de fiul meu, care e stelist.”",
			"Ioan Sdrobis (antrenorul echipei FC Baia-Mare, dupa meciul Electroputere Craiova - FC Baia-Mare 8-1): \"Putea fi 3-3!\"",
			"Marian Iancu: „Ionel Ganea, ca om, e capabil sa infecteze pâna si penicilina!”.",
			"Gheorghe Hagi: „Viata e frumoasa, dar merita traita\".",
			"Florin Mihoc: „În Brazilia este iarna. La ora 18 e întuneric bocna\".",
			"Dorinel Munteanu: „ Acum, ce sa va zic, dupa acest rezultat, calificarea este si posibila, si imposibila\".",
			"Claudiu Raducanu : „La bulanu’ meu o sa dau si gol daca o sa ma convoaca”.",
			"Deian Sorescu, dupa debutul la Dinamo: „Este cel mai fericit dintre debuturile mele în Liga I” (mai jucase pentru Timisoara)",
			"Gheorghe Hagi: „Omul este o persoana umana”",
			"Ionel Danciulescu: \"Suporterii nostri sunt 80 la suta din Bucuresti si 40 la suta din provincie\"",
			"Nicolae Mitea: \"Sunt pesimist. Cred ca putem învinge Olanda\"",
			"Adrian Porumboiu: \"Singura echipa care poate prinde CFR-ul din urma este DNA!\""));
	private String idiom;
	private static Random random;
	
	public String getIdiom() {
		return this.idiom;
	}
	
	public FortuneCookie(String idiom) {
		this.idiom = idiom;
	}
	
	public static FortuneCookie generate() {
		int n1 = random.nextInt(idioms.size());
		FortuneCookie f = new FortuneCookie(idioms.get(n1));
		return f;
	}
	
	@Override
	public void enjoy() {
		System.out.println(getIdiom());
	}
}
