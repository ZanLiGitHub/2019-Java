public class Test{
	public static void main(String[] args){

		int V = 5;
		MyGraph graph = new MyGraph(5);
		int[][] matrix = new int[5][5];
		matrix[0][0] = 0;
		matrix[0][1] = 1;
		matrix[0][2] = 1;
		matrix[0][3] = 0;
		matrix[0][4] = 0;
		matrix[1][0] = 1;
		matrix[1][1] = 0;
		matrix[1][2] = 0;
		matrix[1][3] = 0;
		matrix[1][4] = 1;
		matrix[2][0] = 1;
		matrix[2][1] = 0;
		matrix[2][2] = 0;
		matrix[2][3] = 1;
		matrix[2][4] = 0;
		matrix[3][0] = 0;
		matrix[3][1] = 0;
		matrix[3][2] = 1;
		matrix[3][3] = 0;
		matrix[3][4] = 1;
		matrix[4][0] = 0;
		matrix[4][1] = 1;
		matrix[4][2] = 0;
		matrix[4][3] = 1;
		matrix[4][4] = 0;

		graph.matrixToList(matrix);
		graph.displayAdjListArray();
	}
}