package leetcodepractice.topinterview150

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * nums1 그리고 nums2 두개 숫자 배열이 주어집니다. 비 내림차순 정렬로 된, 그리고 두 개 숫자 m 그리고 n, 나타내는 숫자 요소 num1 그리고 nums2 안에 있는 , 각각
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 합쳐라 nums1 과 nums2를 하나의 배열로 비내림차순으로 정렬된
 * The final sorted array should not be returned by the function,
 * 최종 정렬된 배열은 함수에 의해 반환하지 않는다.
 * but instead be stored inside the array nums1.
 * 대신에 nums1 안에 저장된다.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * 이를 충족하기 위해, nums1은 m+n의 길이를 가진다. 첫번째 m 요소가 나타내는 곳에서 병합된다. 그리고 마지막 n 요소는 0으로 설정되어있으며 무시해야된다. nums2가 n 길이 이다.
 */
class MergeSortedArrayTest {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1        // nums1의 유효한 마지막 요소
        var j = n - 1        // nums2의 마지막 요소
        var k = nums1.size - 1 // 병합된 배열의 마지막 위치

        while (j >= 0) {  // nums2의 요소가 남아 있는 동안 반복
            nums1[k--] = when {
                i < 0 -> nums2[j--]  // nums1이 비었으면 nums2의 값 사용
                nums1[i] > nums2[j] -> nums1[i--]  // nums1의 값이 더 크면 채우기
                else -> nums2[j--]  // nums2의 값이 더 크면 채우기
            }
        }
    }
}

fun main() {
    MergeSortedArrayTest().merge(nums1 = intArrayOf(0), m = 1, nums2 = intArrayOf(1), n = 1)
}