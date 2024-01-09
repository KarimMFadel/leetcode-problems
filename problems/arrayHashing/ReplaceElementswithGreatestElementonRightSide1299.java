package arrayHashing;
public class ReplaceElementswithGreatestElementonRightSide1299 {
    
    public static void main(String[] args) {
        
    }

    // length = 6 
    // 0 , 1,  2, 3, 4, 5   // index
    //              l-2  l-1
    // 27, 28, 3, 5, 9, 2   // arr
    // 0,  0,  0, , 2, -1   // result
    public static int[] replaceElements(int[] arr) {
        if(arr.length == 0)
            return null;
        else if (arr.length == 1)
            return new int[] {-1};

        int[] result = new int[arr.length];
      
        int prevTemp = arr[result.length - 1];
        result[arr.length - 1] = -1;
        result[arr.length - 2] = prevTemp;


        for (int i = result.length-3; i >= 0; i--) {
            if(arr[i+1] > prevTemp) {
                result[i] = arr[i+1];
                prevTemp = arr[i+1];
            } else {
                result[i] = prevTemp;
            }

        }
        
        return result;
    }

    public static int[] replaceElements_oldSolution(int[] arr) {
        if(arr.length == 0)
        return null;
    else if (arr.length == 1)
        return new int[] {-1};

    int[] result = new int[arr.length];


    int maxIndex = -1;
    for (int i = 0; i < arr.length - 1; i++) {
        int maxValue = arr[i+1];
        if(i < maxIndex) {
            result[i] = arr[maxIndex];
            continue;
        }
        
        for (int j = i + 2; j < arr.length ; j++) {
            if(maxValue < arr[j]) {
                maxValue = arr[j];
                maxIndex = j;
            }
        }
        result[i] = maxValue;
    }

    result[arr.length - 1] = -1;
    return result;
    }
}
