/*
������� ��������� ������ HashMap, ���������� � �� ���������
 ����������: � �������� �����  - ��������� ������ � �������� (catalog.onliner.by) 
 � �������� �������� - ���������� ������� � ������ ���������. 
 ����������� ��������� �� ���������� ������� � ������ ���������, 
 ����� ��������� � ������� ���������� ������������ ���������� �������, 
 ������� ��� ��������� � ������� ��� �� ������ ������
  (������������� ����� ��������� ��� ���������� ���������)
*/
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTask10 {

	public static void main(String[] args) {
		Map <String, Integer> hm = new HashMap<String, Integer>();
		hm.put("TV", 1000);
		hm.put("iPhone", 500);
		hm.put("Fridge", 350);
		hm.put("Tablet", 160);
		hm.put("Oven", 400);
		hm.put("Calculator", 0);
		
		Map <String, Integer> sortedMap = new TreeMap<>(new Comparator<String>(){
			@Override
			public int compare(String a, String b){
				return hm.get(a).compareTo(hm.get(b));
			}
		});
		
		sortedMap.putAll(hm);
		
		for(Map.Entry<String, Integer> entry: sortedMap.entrySet()){
			
			if(entry.getValue() != 0){
				System.out.println(String.format("%s = %s", entry.getKey(), entry.getValue()));
			}
		}
		
		Map.Entry <String, Integer> maxEntry = null;
		for(Map.Entry<String, Integer> entry: hm.entrySet()){
			if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue())>0){
				maxEntry = entry;
			}
		}
		System.out.println("Categoty max is: " + maxEntry);
		
	}

}
