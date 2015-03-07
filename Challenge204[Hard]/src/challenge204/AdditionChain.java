/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

/**
 *
 * @author Fen
 */
public class AdditionChain {


    
    public LinkedList<Integer> recursiveLookup(int finish, int numOfSteps) {
	ArrayList<Integer> list = new ArrayList<>();
	list.add(1);
	
	return incrementList(new LinkedList<Integer>(), list, 0, finish, numOfSteps);
    }

    private LinkedList<Integer> incrementList(LinkedList<Integer> chain, ArrayList<Integer> numList, int currentTotal, int finishNum, int numOfSteps) {
	if (chain.size() > numOfSteps) {
	    return null;
	}

	for (int num : numList) {
	    if (num + currentTotal == finishNum) {
		// Target Number
		chain.add(num);
		return chain;
	    } else if (num + currentTotal > finishNum) {
		// Over target
		return null;
	    } else {
		// Under target
		LinkedList<Integer> newLink = new LinkedList(chain);
		newLink.add(num);
		ArrayList<Integer> newList = new ArrayList(numList);
		newList.add(num + currentTotal);

		LinkedList<Integer> returnList = incrementList(newLink, newList, num + currentTotal, finishNum, numOfSteps);
		if (returnList != null) {
		    return returnList;
		}
	    }
	}
	return null;
    }

}
