package it.unical.prova_2021_10_28;

import java.util.List;

public class MyListUtil {
	public List<Integer> sort(List<Integer> list, int order){
		List<Integer> tmp = list;
		
		switch(order) {
			case 0:
				ascendente(tmp);
				break;
			case 1:
				discendente(tmp);
				break;
			default:
		}
		
		return tmp;
	}
	
	public void ascendente(List<Integer> tmp) {
		for(int i = 0; i < tmp.size() - 1; i++) {
			for(int j = i + 1; j < tmp.size(); j++) {
				if(tmp.get(i) > tmp.get(j)) {
					Integer n = tmp.get(i);
					tmp.set(i, tmp.get(j));
					tmp.set(j, n);
				}
			}
		}
	}
	
	public void discendente(List<Integer> tmp) {
		for(int i = 0; i < tmp.size() - 1; i++) {
			for(int j = i + 1; j < tmp.size(); j++) {
				if(tmp.get(i) < tmp.get(j)) {
					Integer n = tmp.get(i);
					tmp.set(i, tmp.get(j));
					tmp.set(j, n);
				}
			}
		}
	}
}