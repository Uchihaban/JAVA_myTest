/**
 * 
 */
/**
 * @author zhengban
 *
 */
package set;

/*遍历数组
 * public static void main(String[] args) {
	// 遍历数组：
	String[] arr = new String[] { "xx", "yy", "zz" };

	// 1，增强的for循环
	for (String elt : arr) {
		System.out.println(elt);
	}

	// 2，下标的方式
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}*/

/*遍历List
public static void main(String[] args) {
	// 遍历List：
	List<String> list = new ArrayList<String>();
	list.add("aa");
	list.add("bb");
	list.add("cc");

	// 1，增强的for循环
	for (String elt : list) {
		System.out.println(elt);
	}

	// 2，下标
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}

	// 3，迭代器
	for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
		String elt = iter.next();
		System.out.println(elt);
	}
}
*/

/*遍历Set
public static void main(String[] args) {
	// 遍历Set：
	Set<String> set = new HashSet<String>();
	set.add("dd");
	set.add("ee");
	set.add("ff");

	// 1，增强的for循环
	for (String elt : set) {
		System.out.println(elt);
	}
	
	// 2，迭代器
	for(Iterator<String> iter = set.iterator(); iter.hasNext() ; ){
		String elt = iter.next();
		System.out.println(elt);
	}
}*/


/*遍历Map
// 遍历Map：
	Map<String, String> map = new HashMap<String, String>();
	map.put("aa", "xx");
	map.put("bb", "yy");
	map.put("cc", "zz");
  
  Set<Entry<String,String>> entrys = map.entrySet();
 
	// 1，增强的for循环（Entry集合）
	for (Entry<String, String> entry : map.entrySet()) {
		System.out.println(entr y);
	}
	
	// 2，增强的for循环（Key集合）
	for(String key : map.keySet()){
		System.out.println(key + " = " + map.get(key));
	}
	
	// 3，遍历值的集合
	for(String value : map.values()){
		System.out.println(value);
	}

}
*/