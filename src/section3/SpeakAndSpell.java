package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot".
		String word = "astronaut";
		
		
		speak("Spell " + word);
		
		// 2. Catch the user's answer in a String
		String answer = JOptionPane.showInputDialog("Type answer here!");
		// 3. If the user spelled the word correctly, speak "correct"
				if( answer.equalsIgnoreCase(word)){
					speak("Correct! Your so smart!");
					}
		// 4. Otherwise say "wrong"
				else{
					speak("Wrong! Maybe next time!");	
				}
		// 5. repeat the process for other words
				String newword = "mississipi";
				speak("Spell" + newword);
				
				// 2. Catch the user's answer in a String
				String responce = JOptionPane.showInputDialog("Type answer here!");
				// 3. If the user spelled the word correctly, speak "correct"
						if( responce.equalsIgnoreCase("newword")){
							speak("Correct! Your so smart!");
							}
				// 4. Otherwise say "wrong"
						else{
							 speak("Wrong! Maybe next time!");	
						}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


