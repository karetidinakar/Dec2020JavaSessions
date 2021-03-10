package CollectionsConcept;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {

	enum Lang{
	java,
	cSharp,
	python,
	javaScript
	}
	public static void main(String[] args) {
		//all
		EnumSet<Lang> es1 =  EnumSet.allOf(Lang.class);
		System.out.println(es1);
		//none
		EnumSet<Lang> es2 =  EnumSet.noneOf(Lang.class);
		System.out.println(es2);
		//range
		EnumSet<Lang> es3 =  EnumSet.range(Lang.java,Lang.cSharp);
		System.out.println(es3);
		//of
		EnumSet<Lang> es4 =  EnumSet.of(Lang.python);
		System.out.println(es4);
		//of
		EnumSet<Lang> es5 =  EnumSet.of(Lang.python,Lang.javaScript);
		System.out.println(es5);
		
		//add, addAll
		EnumSet<Lang> lang1 =  EnumSet.allOf(Lang.class);
		System.out.println(lang1);
		//none
		EnumSet<Lang> lang2 =  EnumSet.noneOf(Lang.class);
		System.out.println(lang2);
		
		lang2.add(Lang.javaScript);
		lang2.addAll(lang1);
		
		//iterate
		EnumSet<Lang> fullLang =  EnumSet.allOf(Lang.class);
		Iterator<Lang> it = fullLang.iterator();
		for(Lang l:fullLang) {
			System.out.println(l);
		}
		
		//remove removeAll
		EnumSet<Lang> fullLangRemove =  EnumSet.allOf(Lang.class);
		System.out.println(fullLangRemove);
		System.out.println(fullLangRemove.remove(Lang.javaScript));
		System.out.println(fullLangRemove.removeAll(fullLangRemove));
		System.out.println(fullLangRemove);
	}

}
