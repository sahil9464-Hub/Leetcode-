class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int count = 0;

        for (int i = 1; i <= 12; i++){
            int maxDays = 31;

            if (i == 4 || i == 6 || i == 9 || i == 11)
                maxDays = 30;
            else if (i == 2)
                maxDays = 28;

            for (int j = 1; j <= maxDays; j++) {
                String date = String.format("%02d-%02d", i, j);

                if (date.compareTo(arriveAlice) >= 0 &&
                    date.compareTo(leaveAlice) <= 0 &&
                    date.compareTo(arriveBob) >= 0 &&
                    date.compareTo(leaveBob) <= 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
