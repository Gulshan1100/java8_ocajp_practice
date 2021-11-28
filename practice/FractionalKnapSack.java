import java.util.*;
class Item{
	Double cost;
	double weight, value,index;
	
	public Item(double weight, double value,int index){
		this.weight = weight;
		this.value = value;
		this.index = index;
		cost = new Double(weight/value);
	}
}
 
class FractionalKnapSack{
	public static double fractionalKnapSack(int []weight, int []value, int capacity){
		Item[] indexing = new Item[weight.length];
		for(int i=0;i<weight.length;i++){
			indexing[i] = new Item(weight[i],value[i],i);
		}	
		Arrays.sort(indexing,new Comparator<Item>(){
			public int compare(Item o1, Item o2){
				return o1.cost.compareTo(o2.cost);
			}
		});
		double res = 0d;
		for(Item i : indexing){
			int currentCap = (int)i.weight;
			int currentVal = (int)i.value;
			
			if(capacity - currentCap >=0){
				res = res + currentVal;
				capacity = capacity - currentCap;
			} else {
				double fraction = ((double)capacity/(double)currentCap);
				res = res + (currentVal*fraction);
				capacity = (int)(capacity - (currentCap*fraction));
				break;
			}
		}
		return res;
	}
	
	public static void main(String args[]){
		 int[] wt = {10, 40, 20, 30}; 
        int[] val = {60, 40, 100, 120}; 
        int capacity = 50; 
		System.out.println(fractionalKnapSack(wt,val,capacity));
	}
}