import java.util.ArrayList;
import java.lang.Integer;


public class TernarySearch {
	public static void main(String[] args) {
		
	}
	
	public int recTernarySearch(ArrayList<Integer> pList, Integer pKey, int pLow, int pHigh) {
		
		if(pLow > pHigh) {
			return -1;
		}

		int range = pHigh - pLow;
		
		int oneThirdIdx = (int) Math.round(pLow + range / 3.0);
		int twoThirdIdx = (int) Math.round(pLow + range / 1.33);
		
		if(pKey.equals(pList.get(oneThirdIdx))) {
			return oneThirdIdx;
		}
		else if(pKey.equals(pList.get(twoThirdIdx))) {
			return twoThirdIdx;
		}
		else if(pKey < pList.get(oneThirdIdx)) {
			return recTernarySearch(pList, pKey, pLow, oneThirdIdx - 1);
		}
		else if(pKey > pList.get(twoThirdIdx)) {
			return recTernarySearch(pList, pKey, twoThirdIdx + 1, pHigh);
		}
		else {
			return recTernarySearch(pList, pKey, oneThirdIdx + 1, twoThirdIdx - 1);
		}
	}
}
