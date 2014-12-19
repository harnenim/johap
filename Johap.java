package harne.johap;

public class Johap {
	
	private String str;
	
	private final static char[] JCHO = "ᄀᄁᄂᄃᄄᄅᄆᄇᄈᄉᄊᄋᄌᄍᄎᄏᄐᄑᄒ".toCharArray();
	private final static char[] WCHO = "ㄱㄲㄴㄷㄸㄹㅁㅂㅃㅅㅆㅇㅈㅉㅊㅋㅌㅍㅎ".toCharArray();
	private final static char[] JUNG = "ᅡᅢᅣᅤᅥᅦᅧᅨᅩᅪᅫᅬᅭᅮᅯᅰᅱᅲᅳᅴᅵ".toCharArray();
	private final static char[] JONG = "　ᆨᆩᆪᆫᆬᆭᆮᆯᆰᆱᆲᆳᆴᆵᆶᆷᆸᆹᆺᆻᆼᆽᆾᆿᇀᇁᇂ".toCharArray();
	
	public Johap(String str) {
		this.str = str;
	}

	public String toJohap() { return toJohap(this.str); }
	public static String toJohap(String str) {
		StringBuffer result = new StringBuffer();

		char[] c = str.toCharArray();
		for(int i=0; i<c.length; i++){
			if(c[i]>='가' && c[i]<='힣'){
				int cCho_ = ( c[i]-'가')/588;
				int cJung = ((c[i]-'가')/28)%21;
				int cJong = ( c[i]-'가')%28;

				if(cJong>0)
					result.append(JCHO[cCho_]).append(JUNG[cJung]).append(JONG[cJong]);
				else{
					result.append(JCHO[cCho_]).append(JUNG[cJung]);
				}
			}else{
				result.append(c[i]);
			}
		}

		return result.toString();
	}
	
	public static String toTyping(char c) {
		return toTyping((Character.toString(c)));
	}
	public static String toTyping(String str) {
		StringBuffer s = new StringBuffer();
		char[] c = toJohap(str).toCharArray();
		for(char x : c) {
			switch(x){
				case 'ᄀ' : s.append("ㄱ"  ); break;
				case 'ᄁ' : s.append("ㄲ"  ); break;
				case 'ᄂ' : s.append("ㄴ"  ); break;
				case 'ᄃ' : s.append("ㄷ"  ); break;
				case 'ᄄ' : s.append("ㄸ"  ); break;
				case 'ᄅ' : s.append("ㄹ"  ); break;
				case 'ᄆ' : s.append("ㅁ"  ); break;
				case 'ᄇ' : s.append("ㅂ"  ); break;
				case 'ᄈ' : s.append("ㅃ"  ); break;
				case 'ᄉ' : s.append("ㅅ"  ); break;
				case 'ᄊ' : s.append("ㅆ"  ); break;
				case 'ᄋ' : s.append("ㅇ"  ); break;
				case 'ᄌ' : s.append("ㅈ"  ); break;
				case 'ᄍ' : s.append("ㅉ"  ); break;
				case 'ᄎ' : s.append("ㅊ"  ); break;
				case 'ᄏ' : s.append("ㅋ"  ); break;
				case 'ᄐ' : s.append("ㅌ"  ); break;
				case 'ᄑ' : s.append("ㅍ"  ); break;
				case 'ᄒ' : s.append("ㅎ"  ); break;
				case 'ᅡ' : s.append("ㅏ"  ); break;
				case 'ᅢ' : s.append("ㅐ"  ); break;
				case 'ᅣ' : s.append("ㅑ"  ); break;
				case 'ᅤ' : s.append("ㅒ"  ); break;
				case 'ᅥ' : s.append("ㅓ"  ); break;
				case 'ᅦ' : s.append("ㅔ"  ); break;
				case 'ᅧ' : s.append("ㅕ"  ); break;
				case 'ᅨ' : s.append("ㅖ"  ); break;
				case 'ᅩ' : s.append("ㅗ"  ); break;
				case 'ᅪ' : s.append("ㅗㅏ"); break;
				case 'ᅫ' : s.append("ㅗㅐ"); break;
				case 'ᅬ' : s.append("ㅗㅣ"); break;
				case 'ᅭ' : s.append("ㅛ"  ); break;
				case 'ᅮ' : s.append("ㅜ"  ); break;
				case 'ᅯ' : s.append("ㅜㅓ"); break;
				case 'ᅰ' : s.append("ㅜㅔ"); break;
				case 'ᅱ' : s.append("ㅜㅣ"); break;
				case 'ᅲ' : s.append("ㅠ"  ); break;
				case 'ᅳ' : s.append("ㅡ"  ); break;
				case 'ᅴ' : s.append("ㅡㅣ"); break;
				case 'ᅵ' : s.append("ㅣ"  ); break;
				case 'ᆨ' : s.append("ㄱ"  ); break;
				case 'ᆩ' : s.append("ㄲ"  ); break;
				case 'ᆪ' : s.append("ㄱㅅ"); break;
				case 'ᆫ' : s.append("ㄴ"  ); break;
				case 'ᆬ' : s.append("ㄴㅈ"); break;
				case 'ᆭ' : s.append("ㄴㅎ"); break;
				case 'ᆮ' : s.append("ㄷ"  ); break;
				case 'ᆯ' : s.append("ㄹ"  ); break;
				case 'ᆰ' : s.append("ㄹㄱ"); break;
				case 'ᆱ' : s.append("ㄹㅁ"); break;
				case 'ᆲ' : s.append("ㄹㅂ"); break;
				case 'ᆳ' : s.append("ㄹㅅ"); break;
				case 'ᆴ' : s.append("ㄹㅌ"); break;
				case 'ᆵ' : s.append("ㄹㅍ"); break;
				case 'ᆶ' : s.append("ㄹㅎ"); break;
				case 'ᆷ' : s.append("ㅁ"  ); break;
				case 'ᆸ' : s.append("ㅂ"  ); break;
				case 'ᆹ' : s.append("ㅂㅅ"); break;
				case 'ᆺ' : s.append("ㅅ"  ); break;
				case 'ᆻ' : s.append("ㅆ"  ); break;
				case 'ᆼ' : s.append("ㅇ"  ); break;
				case 'ᆽ' : s.append("ㅈ"  ); break;
				case 'ᆾ' : s.append("ㅊ"  ); break;
				case 'ᆿ' : s.append("ㅋ"  ); break;
				case 'ᇀ' : s.append("ㅌ"  ); break;
				case 'ᇁ' : s.append("ㅍ"  ); break;
				case 'ᇂ' : s.append("ㅎ"  ); break;
				case 'ㄳ' : s.append("ㄱㅅ"); break;
				case 'ㄵ' : s.append("ㄴㅈ"); break;
				case 'ㄶ' : s.append("ㄴㅎ"); break;
				case 'ㄺ' : s.append("ㄹㄱ"); break;
				case 'ㄻ' : s.append("ㄹㅁ"); break;
				case 'ㄼ' : s.append("ㄹㅂ"); break;
				case 'ㄽ' : s.append("ㄹㅅ"); break;
				case 'ㄿ' : s.append("ㄹㅍ"); break;
				case 'ㄾ' : s.append("ㄹㅌ"); break;
				case 'ㅀ' : s.append("ㄹㅎ"); break;
				case 'ㅄ' : s.append("ㅂㅅ"); break;
				default   : s.append(x);
			}
		}
		
		return s.toString();		
	}
	
	public String toWanseong() { return toWanseong(this.str); }
	public static String toWanseong(String str) {
		return toWanseong(str.toCharArray());
	}
	public static String toWanseong(char[] c) {
		StringBuffer result = new StringBuffer();
		char buf = 0;
		int mode = 0;
		for(int i=0; i<c.length; i++){
			if(c[i]>='ᄀ' && c[i]<='ᄒ') {
				if(mode!=0)
					result.append(buf);
				buf = c[i];
				mode = 1;

			} else if(c[i]>='ᅡ' && c[i]<='ᅵ') {
				if(mode==1) {
					buf = (char)((buf-'ᄀ')*('까'-'가')+'가' + (c[i]-'ᅡ')*('개'-'가'));
					mode = 2;
				} else {
					if(mode>1)
						result.append(buf).append(c[i]);
					else
						result.append(c[i]);
					mode = 0;
				}
				
			} else if(c[i]>='ᆨ' && c[i]<='ᇂ') {
				if(mode==1) {
					result.append(WCHO[buf-'ᄀ']);
					buf = c[i];
				} else if(mode==2) {
					result.append((char)(buf + (c[i]-'ᆨ'+1)));
				} else if(mode>1)
					result.append(buf).append(c[i]);
				else
					result.append(c[i]);
				mode = 0;
				
			} else {
				if(mode==1)
					result.append(WCHO[buf-'ᄀ']);
				else if(mode>1)
					result.append(buf).append(c[i]);
				else
					result.append(c[i]);
				mode = 0;
				
			}
		
		}
		if(mode==1) {
			result.append(WCHO[buf-'ᄀ']);
		} else if(mode>1)
			result.append(buf);

		System.out.println();
		return result.toString();
	}
	
	public int tasu() { return tasu(this.str); }
	public static int tasu(String str) {
		int result = 0;
		char[] c = str.toCharArray();
		for(int i=0; i<c.length; i++){
			// 완성형
			if(c[i]>='가' && c[i]<='힣'){
				// 초성 = 1타
				result++;
				
				// 중성
				switch ((char)(((c[i]-'가')/28)%21+'ㅏ')) {
					case 'ㅘ' :
					case 'ㅙ' :
					case 'ㅚ' :
					case 'ㅝ' :
					case 'ㅞ' :
					case 'ㅟ' :
					case 'ㅢ' :
						result += 2;
						break;
					default :
						result ++;
				}
				
				// 종성
				switch ((c[i]-'가')%28) {
					case 0 :
						break;
					case 'ㄳ'-'ㄱ' :
					case 'ㄵ'-'ㄱ' :
					case 'ㄺ'-'ㄱ' :
					case 'ㄻ'-'ㄱ' :
					case 'ㄼ'-'ㄱ' :
					case 'ㄽ'-'ㄱ' :
					case 'ㄾ'-'ㄱ' :
					case 'ㄿ'-'ㄱ' :
					case 'ㅀ'-'ㄱ' :
					case 'ㅄ'-'ㄱ' :
						result += 2;
						break;
					default :
						result ++;
				}
			}
			// 따로 노는 자모
			else if(c[i]>='ㄳ' && c[i]<='ㅄ') {
				switch (c[i]) {
					case 'ㄳ' :
					case 'ㄵ' :
					case 'ㄶ' :
					case 'ㄺ' :
					case 'ㄻ' :
					case 'ㄼ' :
					case 'ㄽ' :
					case 'ㄾ' :
					case 'ㄿ' :
					case 'ㅀ' :
					case 'ㅄ' :
						result += 2;
						break;
					default :
						result++;
				}
			} else if(c[i]>='ㅘ' && c[i]<='ㅢ') {
				switch (c[i]) {
					case 'ㅘ' :
					case 'ㅙ' :
					case 'ㅚ' :
					case 'ㅝ' :
					case 'ㅞ' :
					case 'ㅟ' :
					case 'ㅢ' :
						result += 2;
						break;
					default :
						result++;
				}
			}
			// 조합형
			else if(c[i]>='ᅪ' && c[i]<='ᅴ') {
				switch (c[i]) {
					case 'ᅪ' :
					case 'ᅫ' :
					case 'ᅬ' :
					case 'ᅯ' :
					case 'ᅰ' :
					case 'ᅱ' :
					case 'ᅴ' :
						result += 2;
						break;
					default :
						result++;
				}
			} else if(c[i]>='ᆪ' && c[i]<='ᆹ') {
				switch (c[i]) {
					case 'ᆪ' :
					case 'ᆬ' :
					case 'ᆭ' :
					case 'ᆰ' :
					case 'ᆱ' :
					case 'ᆲ' :
					case 'ᆳ' :
					case 'ᆴ' :
					case 'ᆵ' :
					case 'ᆶ' :
					case 'ᆹ' :
						result += 2;
						break;
					default :
						result++;
				}
			}
			// 이외의 문자는 1타로 처리
			else
				result++;
		}
		return result;
	}
	
	public String toString() {
		return this.str;
	}
	
	public int length() { return this.str.length(); }

	public static void main(String[] args) {
		String s = Johap.toJohap("각난닫핥ㅐ모맺도며ㅑㄴ런ㄷㅇ로ㅑㅁㅈㄷㄹ");
		System.out.println(s);
		char[] c = s.toCharArray();
		for(char x : c) {
			System.out.print(x);
			System.out.print(' ');
		}
		System.out.println(Johap.toWanseong(s));
		
		Johap str = new Johap("ㅁ됼호ㅓㄱㄹ허ㅏㄷㄱ욯ㅕ효ㅓㅘㄴㅇ러ㅏㅎ");
		System.out.println(str.tasu());
		System.out.println(Johap.tasu("가나돯ㄱㅘ라"));

		System.out.println();
		System.out.println(str);
		String str2 = str.toJohap();
		for(int i=0; i<=str2.length(); i++)
			System.out.println(str2.substring(0, i));
		str2 = Johap.toTyping(str2);
		for(int i=0; i<=str2.length(); i++)
			System.out.println(str2.substring(0, i));
		
	}
	
}
