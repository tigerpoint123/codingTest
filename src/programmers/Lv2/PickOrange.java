package programmers.Lv2;

import java.util.*;

public class PickOrange {
    public static void main(String[] args) {
        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
        System.out.println(solution(2, tangerine));
    }

    public static int solution(int k, int[] tangerine) { // 정렬 알고리즘
        int answer = 0;
        tangerine = sort(tangerine);
        int temp = tangerine[0];
        int count = 1;
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i < tangerine.length; i++){
            if (temp == tangerine[i]) {
                count++;
            } else {
                list.add(count);
                temp = tangerine[i];
                count = 1;
            }
        }
        list.add(count);
        list.sort(Collections.reverseOrder());
        count = 0;

        for (int i = 0; i < list.size(); i++) {
            if(k > 0){
                k -=  list.get(i);
                count++;
            }
            if (k <= 0) {
                break;
            }
        }
        answer = count;
        return answer;
    }

    public static int[] sort(int[] tangerine) {
        quickSort(tangerine, 0, tangerine.length - 1);
        return tangerine;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 피벗을 기준으로 배열을 나누고 피벗의 최종 위치를 반환받음
            int pivotIndex = partition(arr, low, high);

            // 피벗을 제외한 왼쪽과 오른쪽 부분 배열을 재귀적으로 정렬
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // 가장 오른쪽 요소를 피벗으로 설정 (다양한 선택 전략이 있음)
        int pivot = arr[high];
        int i = (low - 1); // 작은 요소들이 들어갈 위치의 인덱스

        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같으면 i를 증가시키고 교환
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // 피벗을 올바른 위치(i + 1)로 이동
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
