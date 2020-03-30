package lesson2.HomeWork;

public class MyMassiv {

    void Create(Integer int1, Integer int2) throws MyArraySizeException, MyArrayDataException {

        if (int1 != 2 || int2 != 2 ) {
            throw new MyArraySizeException("Array Size not 2x2");
        }
        else {
            String[][] array = new String[int1][int2];

            array[0][0] = "1";
            array[0][1] = "1";
            array[1][0] = "3";
            array[1][1] = "4";

            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                try {
                  sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new MyArrayDataException("Not Integer at: " + i + " " + j);
                }
              }

            }

            System.out.println(sum);
        }

    }

}
