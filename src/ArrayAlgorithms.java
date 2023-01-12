public class ArrayAlgorithms {

    /**
     * Prints each String in wordList, on its own line, followed by “!”.
     * Does NOT mutate (modify) wordList.
     * PRECONDITION: wordList.length > 0
     *
     * @param wordList original array of Strings; does not get modified
     */
    public static void printExclamation(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            System.out.println(wordList[i] + "!");
        }
    }

    /**
     * Adds a “!” to the end of each String in wordList (does not print).
     * DOES mutate (modify) original wordList.
     * PRECONDITION: wordList.length > 0
     *
     * @param wordList original array of Strings, modified by method
     */
    public static void addExclamation(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i] + "!";
        }
    }

    /**
     * Returns the sum of all values in numList.
     * Does NOT mutate (modify) numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList array of integers to find sum
     * @return the sum of all numbers in the list
     */
    public static int sum(int[] numList) {
        int sum = 0;
        for (int i = 0; i < numList.length; i++) {
            sum += numList[i];
        }
        return sum;
    }

    /**
     * Returns the average of all values in numList, as a double.
     * Does NOT mutate (modify) numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList array of integers to find average
     * @return the average of all numbers in the list
     * <p>
     * Use your sum method for this! (don’t rewrite that logic!)
     */
    public static double average(int[] numList)
    {
        return sum(numList) /(double) (numList.length);
    }
    /** Returns the value in numList that represents the minimum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find minimum
     *  @return  the minimum value in the array
     */
    public static int minimum(int[] numList) {
        int min = numList[0];
        for (int i = 0; i < numList.length; i++) {
            if (min > numList[i]){
                min = numList[i];
            }
        }
        return min;
    }
    /** Returns the value in numList that represents the maximum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find maximum
     *  @return  the maximum value in the array
     */
    public static int maximum(int[] numList) {
        int max = numList[0];
        for (int i = 0; i < numList.length; i++) {
            if (max < numList[i]){
                max = numList[i];
            }
        }
        return max; }
    /** Multiplies each number in numList by multiplier.
     *  DOES mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers, modified by method
     *  @param multiplier  number to multiply each element in numList
     */
    public static void multiplyBy(int[] numList, int multiplier)
    {
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * multiplier;
        }
    }

    /** Returns a NEW array containing the squares of the elements in the original
     *  numList array, in the same position.
     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers to be squared
     *  @return  new array containing squares of the values in numList
     */
    public static int[] squares(int[] numList)
    {
        int[] Array = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            Array[i] = numList[i] * numList[i];
        }
        return Array;

    }

    /** Switches each boolean value in boolList to its opposite value; true values
     *  becomes false, and false values become true.
     *  DOES mutate (modify) original boolList.
     *  PRECONDITION: boolList.length > 0
     *
     *  @param boolList  original array of booleans, modified by method
     */
    public static void flipBool(boolean[] boolList)
    {
        for (int i = 0; i < boolList.length; i++){
            if (boolList[i] == false){
                boolList[i] = true;
            }
            else boolList[i] = false;
        }
    }

    /** Returns a String representing the array of ints as a printable String,
     *  including open and closing brackets, with values separated by commas.
     *  This method should function identically to Arrays.toString()!

     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of ints to be represented in String form
     */
    public static String customToString(int[] numList) {
        String toString = "[";
        if (numList.length < 1) {
            for (int i = 0; i < numList.length; i++) {
                toString += numList[i] + ", ";
            }
        }
        return toString + numList[numList.length + 1] + "]";
    }


    /**
     * Returns true if ANY of the ints in numList are positive, otherwise,
     * returns false.
     * <p>
     * Does NOT mutate (modify) numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList original array of ints; does not get modified
     * @return true if any element of numList is positive, false otherwise
     */
    public static boolean containsPositive(int[] numList)
    {
        for(int i : numList) {
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    /** Returns true if ANY of the Strings in stringList contain searchStr,
     *  otherwise, returns false. Your method should NOT be case sensitive, e.g.
     *  searching for "ma" should be found in the String "Maddox" and searching
     *  for "MA" should be found in String "mad"
     *
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @param searchStr  the String to search each element of stringList
     *  @return  true if any element of stringList contains searchStr, otherwise
     *           returns false
     */
    public static boolean containsString(String[] stringList, String searchStr)
    {
        for (String s : stringList){
            if ((s.toLowerCase()).contains(searchStr.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    /** Returns a NEW array of Strings that contains all words from the original
     *  array of strings in lowercase.
     *
     *  Does NOT mutate (modify) original wordList
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, not modified by method
     *  @return  new array of Strings in all lowercase
     */

    public static String[] makeLowercase(String[] wordList)
    {
        String[] lowercase = new String[wordList.length];
        for (int i = 0;i< wordList.length;i++) {
            lowercase[i] = wordList[i].toLowerCase();
        }
        return lowercase;
    }

    /** Returns a NEW array of ints that contains the higher value of each pair
     *  of elements at the same index in two other equally-sized arrays of ints
     *  For example, if intArr1 = {2, 5, 6, 1, 0} and intArr2 = {1, 7, 6, -2, 8},
     *  this method returns the array {2, 7, 6, 1, 8}, where each value is the
     *  higher of the two at that respective index in the two original arrays
     *
     *  Does NOT mutate (modify) EITHER array
     *  PRECONDITION: intArr1.length == intArr2.length
     *
     *  @param intArr1  first array of ints
     *  @param intArr2  second array of ints, having the same length as intArr1
     *  @return  new array of ints representing the higher values
     */

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2)
    {
        int[] max = new int[intArr1.length];
        for(int i = 0; i < intArr1.length; i++){
            if(intArr1[i] > intArr2[i]){
                max[i] = intArr1[i];
            }
            else if(intArr1[i] < intArr2[i]){
                max[i] = intArr2[i];
            }
            else{
                max[i] = intArr2[i];
            }
        }
        return max;
    }


    /** Returns the number of Strings in stringList that have an exclamation point
     *  ("!") at the end.
     *
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  number of Strings in stringList that end in "!"
     */
    public static int endsInExclamations(String[] stringList)
    {
        int count = 0;
        for (String str : stringList){
            if (str.substring(str.length()-1) .equals("!")){
                count++;
            }
        }
        return count;

    }

    /** Returns the number of elements in the numList array that have the same
     *  value as the element immediately adjacent to the right in the array.
     *  (BE CAREFUL not to go out of bounds!)
     *  For example, given the array {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *  this method would return 5, since there are five numbers in the array that
     *  are equal to the number immediately to the right (shown below in blue):
     *                    {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *
     *  Does NOT mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does not get modified
     *  @return  number of elements in numList that are equal to the element
     *           adjacent to the right of the element in the array
     */
    public static int countConsecutiveDoubles(int[] numList)
    {
        int next = 0;
        int current = 0;
        int count = 0;
        for (int i = 0; i< numList.length-1;i++){
            current = numList[i];
            next = numList[i+1];
            if (current == next){
                count ++;
            }
        }
        return count;
    }

    /** Returns a NEW array that contains all elements of the original numList,
     *  shifted to the left by one index; the first element of the array should
     *  wrap around and appear at the end.
     *  For example, given the array {5, 1, 3, 4, 7}, this method returns the
     *  array {1, 3, 4, 7, 5}
     *
     *  Does NOT mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does not get modified
     *  @return  array with elements in numList shifted by one index left
     */
    public static int[] shiftLeft(int[] numList)
    {
        int[] list = new int[numList.length];
        int max = numList.length-1;
        for(int i = 0;i< numList.length;i++){
            int a = i;
            if ((a - 1) == -1){
                a = max;
            }
            else a = a - 1;
            list[a] = numList[i];
        }
        return list;
    }

    public static void shiftLeftModify(int[] numList)
    {
        int max = numList.length-1;
        int last = numList[0];
        for(int i = 1;i< numList.length;i++){
            int a = i - 1;
            numList[a] = numList[i];
            }
            numList[max] = last;
        }
        }

