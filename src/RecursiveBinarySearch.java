import java.util.ArrayList;
import java.lang.Integer;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		ArrayList<Integer> iList = new ArrayList<>();
		iList.add(3);
		iList.add(4);
		iList.add(7);
		iList.add(2);
		iList.add(47);
		iList.add(5);
		iList.add(76);
		iList.add(8);
		iList.add(36);
		iList.add(1);
		
		
	}
	
	public static int recLinearSearch(ArrayList<String> pList, String pKey, int pBeginIdx, int pEndIdx) {
		pBeginIdx++;
		
		if(pBeginIdx >= pEndIdx) {
			return -1;
		}
		
		if(pList.get(pBeginIdx) == pKey) {
			return pBeginIdx;
		}
		else {
			return recLinearSearch(pList, pKey, pBeginIdx++, pEndIdx);
		}
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
