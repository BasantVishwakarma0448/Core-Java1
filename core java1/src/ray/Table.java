package ray;

public class Table {
	public static void main(String[] args) {
		int [][] Table = new int [5][2];
		Table [0][0] = 2;
		Table [1][0] = 4;
		Table [2][0] = 6;
		Table [3][0] = 8;
		Table [4][0] = 10;
		Table [0][1] = 3;
		Table [1][1] = 6;
		Table [2][1] = 9;
		Table [3][1] = 12;
		Table [4][1] = 15;
		for(int i = 0; i<Table.length; i++) {
			for(int j = 0; j<Table[0].length; j++) {
				System.out.println(Table[i][j] + "\t");
				break;
			}
			//System.out.println();
		}
		
	}
}
