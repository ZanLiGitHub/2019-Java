import java.util.LinkedList;
public class MyGraph{
    
    private int V; 
	LinkedList<Node> adjListArray[];

	public MyGraph(int V){
		this.V = V;
		adjListArray = new LinkedList[V];
		for(int i = 0; i < V ; i++){
            adjListArray[i] = new LinkedList<>();
        }
	}

	public void matrixToList(int[][] matrix){
		for(int i=0; i< matrix.length; i++){
			for(int j=0; j< matrix[i].length; j++){
				if(matrix[i][j] == 1){
					this.adjListArray[i].addFirst(new Node(j));
				}
			}
		}
	}

	public void displayAdjListArray(){
		for(int v = 0; v < this.V; v++){
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Node pCrawl: this.adjListArray[v]){
                System.out.print(" -> "+pCrawl.getIndex());
            }
            System.out.println("\n");
        }
	}
}