package pac;

public class App implements R {
	public static void main(String[] args) {
	System.out.println(R.boy_filePathString);
	System.out.println(R.girl_filePathString);
//	System.out.println(R.array2d[0][1]);
	for (int row = 0; row < array2d.length; row++) {
		for (int col = 0; col < array2d[0].length; col++) {
			System.out.print(array2d[row][col]+" ");
				}
		System.out.println();
       }
	}

}
