public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
            for (int i = 0; i < array.length; i++) {
                 if (!isInTheArr(array, i)) {
                     return i;
                 }
            }
            return (array.length);
    }

    public static boolean isInTheArr (int [] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array [i] == n) {
                return true;
            }
        }
        return false;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secMax = array[0];
        for (int i= 0; i < array.length; i++) {
            if ( array [i] > max) {
                max= array[i];
            }
        }
        for (int i= 0; i < array.length; i++) {
            if ((array [i] < max) && (array [i] > secMax)) {
                secMax= array[i];
            }
        }
        return secMax;
    }


    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i < array2.length; i++) { // A loop that checks if array2 is contained in array1
            if (!isInTheArr(array1, array2[i])) {
                return false;
            }
        }
        for (int i = 0; i < array1.length; i++) { // A loop that checks if array1 is contained in array2
            if (!isInTheArr(array2, array1[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean increase = false;
        boolean decrease = false;
            for (int i = 1; i < array.length; i++) {// checks if the array is sorted decreasingly
                if (array [i - 1] >= array [i]) {
                     decrease = true;
                }
                else {
                    decrease = false;
                    break;
                }
            }
            for (int i = 1; i < array.length; i++) {// checks if the array is sorted increasingly
                if (array [i - 1] <= array [i]) {
                     increase = true;
                }
                else {
                    increase = false;
                    break;
                }
            }
        return (increase || decrease);
    }
}
