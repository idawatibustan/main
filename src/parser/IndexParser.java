/*
 * This class returns the index argument if it is present in the user String input
 * 
 * Returns -1 if it is absent.
 */

package parser;

import java.util.ArrayList;

public class IndexParser {
	
	protected static int getIndex(String str) {
		ArrayList<String> arr = Parser.toArrayList(str.trim().toLowerCase(), ParserConstants.CHAR_SINGLE_WHITESPACE);
		if (Parser.indexPresent(arr)) {
			return Integer.parseInt(arr.get(ParserConstants.INDEX_SECOND));
		}
		else {
			return -1;
		}
	}
}