public class Main {

    int []blocks = {0,1,5,4,3,4,5,6,4,3,2,1,0,1,2,3,4,5};

    private int distanceCalculation(int []blocks){

            int maxDistance = 0;

            for (int i = 0; i < blocks.length; i++) {
                int left = i - 1;
                int right = i + 1;

                while (left >= 0 && blocks[left] >= blocks[left + 1]) {
                    left--;
                }

                while (right < blocks.length && blocks[right] >= blocks[right - 1]) {
                    right++;
                }

                maxDistance = Math.max(maxDistance, right - left - 1);
            }

            System.out.println("(distanceCalculation) This is a debug message and the maximum distance is: " + maxDistance);
            return maxDistance;
        }



    public static void main(String[] args) {

        Main main = new Main();
        System.out.println("(main) The maximum block distance possible is: " + main.distanceCalculation(main.blocks));


    }
}