import java.util.*;
class Sol{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		String result = "";
		while(t-->0){
			
			String str = s.nextLine();
			Map<Character,Integer> map = new HashMap<Character,Integer>();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (map.containsKey(c)) {
					int cnt = map.get(c);
					map.put(c, ++cnt);
				} else {
				map.put(c, 1);
				}
			}
			int count  = 0;
			for (Map.Entry mapElement : map.entrySet()) { 
				int value = ((int)mapElement.getValue()); 
				if(value >1){
					count = count + value;
				}
			}
			result = result + count + "\n"; 
		}
		System.out.println(result);
	}
}
