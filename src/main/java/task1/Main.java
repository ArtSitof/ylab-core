package task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                Thread.sleep(5);
                array[i][j] = randomNumber1();
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("min = " + minNumber(array));
        System.out.println("max = " + maxNumber(array));
        System.out.println("average = " + averageNumber(array));
    }

    static int randomNumber1() {
        long rangeBegin = 0L;
        long rangeEnd = 100L;
        long currentTime = System.currentTimeMillis();
        return (int) (rangeBegin + currentTime % (rangeEnd - rangeBegin));
    }

    static int minNumber(int[][] array) {
        int min = array[0][0];
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] < min) {
                    min = ints[j];
                }
            }
        }
        return min;
    }

    static int maxNumber(int[][] array) {
        int max = array[0][0];
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }

    static int averageNumber(int[][] array) {
        int sum = 0;
        int count = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                count++;
                sum += ints[j];
            }
        }
        return sum / count;
    }
}
