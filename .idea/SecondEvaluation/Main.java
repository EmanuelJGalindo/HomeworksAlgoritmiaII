import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] repackagingTimes = new int[N];
        for (int i = 0; i < N; i++) {
            repackagingTimes[i] = scanner.nextInt();
        }

        int[] deliveryTimes = new int[N];
        for (int i = 0; i < N; i++) {
            deliveryTimes[i] = scanner.nextInt();
        }

        int shortestDeliveryTime = calculateShortestDeliveryTime(N, repackagingTimes, deliveryTimes);
        System.out.println(shortestDeliveryTime);
    }

    public static int calculateShortestDeliveryTime(int N, int[] repackagingTimes, int[] deliveryTimes) {
        Arrays.sort(repackagingTimes);

        int totalTime = repackagingTimes[N - 1];
        for (int i = 0; i < N - 1; i++) {
            totalTime += Math.max(repackagingTimes[i], deliveryTimes[i]);
        }
        totalTime += deliveryTimes[N - 1];

        return totalTime;
    }
}


