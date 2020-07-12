
public class CryptoManager {
	public static final char UPPER_BOUND = '_';
	public static final char LOWER_BOUND = ' ';
	public static final int desiredRange = UPPER_BOUND - LOWER_BOUND + 1;
	
	public static boolean stringInBounds (String plainText){
		for (int i=0; i<plainText.length();i++) {
			char convertToChar = plainText.charAt(i);
			
			if((convertToChar > UPPER_BOUND) || (convertToChar < LOWER_BOUND))
				return false;
		}
		return true;
	}
	public static String encryptCaesar(String plainText, int key) {
		
		if(! (stringInBounds(plainText))) {
			return "";
		}
			String encryptString = "";
			
			for (int i =0; i< plainText.length(); i++) {
				
				char convertToChar = plainText.charAt(i);
				
				int offset = (int)convertToChar + key;
				
				while(offset > UPPER_BOUND) {
					offset = offset - desiredRange;
				}
				encryptString = encryptString + (char)offset;
		}
		return encryptString;
	}
	public static String decryptCaesar(String encryptedText, int key){

		
			String decryptString = "";
			
			for (int i =0; i< encryptedText.length(); i++) {
				
				char convertToChar = encryptedText.charAt(i);
				
				int offset = convertToChar - key;
				
				while(offset <LOWER_BOUND) {
					offset = offset + desiredRange;
				}
				decryptString = decryptString + (char)offset;
		}
		return decryptString;
	}
	public static String encryptBellaso(String plainText, String bellasoStr){
		
		String encryptString = "";
		
		int lengthOfBellasoStr = bellasoStr.length();
		
		for(int i=0 ; i< plainText.length(); i++) {
			char convertToChar = plainText.charAt(i);
			
			int offset = convertToChar + bellasoStr.charAt(i % lengthOfBellasoStr);
		
		
		while (offset > UPPER_BOUND) {
			offset = offset - desiredRange;
		}
		encryptString = encryptString + (char)offset;
		}
		return encryptString;
	
	}
	public static String decryptBellaso(String encryptedText, String bellasoStr){
		String decryptString = "";
		
		int lengthOfBellasoStr = bellasoStr.length();
		
		for(int i=0 ; i< encryptedText.length(); i++) {
			char convertToChar = encryptedText.charAt(i);
			
			int offset = convertToChar - bellasoStr.charAt(i % lengthOfBellasoStr);
		
		
		while (offset < LOWER_BOUND) {
			offset = offset + desiredRange;
		}
		decryptString = decryptString + (char)offset;
		}
		return decryptString;
		
	}
}
