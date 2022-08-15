
public class LinearSearchAlgo {
    public static void main(String[] args) {

        // the dataset
        int[] dataNumbers = {29, 98, 76, 56, 45, 20, 67, 34, 65, 78};

        
        int searchNo = 67;

        for(int i  = 1; i < dataNumbers.length; i++){
            if(dataNumbers[i] == searchNo){
                System.out.println(i);
                break;
            }else{
                System.out.println("The item is not present");
            }
        }
    }
}
