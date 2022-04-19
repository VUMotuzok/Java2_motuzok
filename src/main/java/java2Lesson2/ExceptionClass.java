package java2Lesson2;

public class ExceptionClass {
    public static void main(String[] args) {

        String[][] array = new String[][]{{"1", "2", "4", "6"},
                {"1", "2", "3", "4"},
                {"5", "2", "0", "1"},
                {"4", "3", "2", "1"}};
        try {
            try {
                int result = arrayMethod(array);
                System.out.println("Sum of the array elements is " + result);
            } catch (ArraySizeException e) {
                System.out.println("Array size exceeded!");
            }
        }
        catch (ArrayDataException e) {
            System.out.println("Wrong array value!");
            System.out.println("See error in: " + e.i + "x" + e.j);
        }

    }

    public static int arrayMethod (String[][] array) throws ArraySizeException, ArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new ArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new ArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}
