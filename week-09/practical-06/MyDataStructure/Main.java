import java.util.*;

public class Main{
	@SuppressWarnings("Unchecked")
	public static void main (String[] args){

        /**
        * Match brackets
        */
		String input1 = "({})";
		String input2 = "(1+2) * {(2+3)*(3+4)}";
		String input3 = "(1+2) * {{2+3)*(3+4}}";
		System.out.println(bracketsMatching(input1));
		System.out.println(bracketsMatching(input2));
		System.out.println(bracketsMatching(input3));

		
		/**
		* Reverse the queue
		*/
        Queue<String> queue = new LinkedList<String>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
		reverseQueue(queue);
		for(String i:queue){
			System.out.print(i+" ");
		}
	}

	/**
	* The bracketsMatching method takes a String of lower case letters as input. Your bracketsMatching method should return 
	* TRUE when the brackets/parenthesis are matching, and return FALSE if not.
	*
	* @param String s
	* @return boolean
	*/
	public static boolean bracketsMatching(String s){
        Stack<String> left=new Stack<String>();
        
        while (!s.isEmpty()){
            
            String character=s.substring(0,1);
            s=s.substring(1);

            if(character.equals("{")||character.equals("[")||character.equals("(")){    
                left.push(character);
            }else if(character.equals(")")||character.equals("]")||character.equals("}")){ 
                if(left.isEmpty())
                    return false;
                String leftChar=left.pop();            
                if(character.equals(")")){
                    if(!leftChar.equals("("))
                        return false;
                }else if(character.equals("]")){
                    if(!leftChar.equals("["))
                        return false;
                }else if(character.equals("}")){
                    if(!leftChar.equals("{"))
                        return false;
                }
            }
        }
        return left.isEmpty();
    }

    /**
    * The reverseQueue method takes a Myqueue object as input, and return a Myqueue object which saves a reversed queue. 
    * You need to use enqueue, dequeue to solve this problem
    *
    * @param Queue queue
    * @return queue
    */
    public static Queue reverseQueue(Queue queue){
    	
        Stack stack = new Stack();
    	while(!queue.isEmpty()){
 			stack.push(queue.poll());
    	}
    	while(!stack.isEmpty()){
    		queue.offer(stack.pop());
    	}

    	return queue;
    }
}