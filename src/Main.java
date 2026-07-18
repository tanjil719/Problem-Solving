public class Main {
    private static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        boolean result = isPalindrome(s);
//        System.out.println(result);

//        Pro2 pro2 = new Pro2();
//        ListNode l1 = createLinkedList(new int[]{2, 4, 3});
//        ListNode l2 = createLinkedList(new int[]{5, 6, 4});
//        ListNode result = pro2.addTwoNumbers(l1, l2);
//        System.out.println("Pro2 result: ");
//        printLinkedList(result);

//       Problem88 problem88 = new Problem88();
//       problem88.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
//
//       Problem26 problem26 = new Problem26();
//       problem26.removeDuplicates(new int[]{0,0,1,2,2,2,3,4});

//        Problem169 problem169 = new Problem169();
//        int result = problem169.majorityElement(new int[]{2,2,1,1,0,0,1,1,2,2,2});
//        System.out.println(result);
//
//        Pro121 pro121 = new Pro121();
//        int result = pro121.maxProfit(new int[]{7,1,5,3,6,4});
//        System.out.println(result);
//
//        Pro45 pro45 = new  Pro45();
//        int result = pro45.jump(new int[]{2,3,1,1,4});

//        Pro274 pro274 = new Pro274();
//        int result = pro274.hIndex(new int[]{1,100});
//
//        System.out.println(result);

//        float arr[] = {(float) 0.897, (float) 0.565,
//                (float) 0.656, (float) 0.1234,
//                (float) 0.665, (float) 0.3434};
//
//        int n = arr.length;
//
//        BucketSorting bucketSorting = new BucketSorting();
//
//        bucketSorting.bucketSort(arr, n);
//
//        System.out.println("Sorted array is ");
//        for (float el : arr) {
//            System.out.print(el + " ");
//        }
//
//        Pro274 pro274 = new Pro274();
//        int result = pro274.hIndex(new int[]{0, 1, 3, 5, 6});

//        Pro1 pro1 = new Pro1();
//        int[] ints = pro1.twoSum(new int[]{3,10, 7, 11, 15, 2}, 9);
//
//        System.out.println(ints.toString());
//
//        Pro380 pro380 = new Pro380()    ;
//        pro380.insert(1);
//        pro380.remove(2);
//        pro380.insert(2);
//        pro380.getRandom();
//        pro380.remove(1);
//        pro380.insert(2);
//        pro380.getRandom();

//
//        Pro238 pro238 = new Pro238() ;
//        pro238.productExceptSelf(new  int[]{5,6,3,4,8,9});


//         Pro134 pro134 = new Pro134() ;
//         pro134.canCompleteCircuit(new  int[]{5,8,2,8}, new  int[]{6,5,6,6});

//         Pro2202 pro2202 = new Pro2202() ;
//        int i = pro2202.maximumTop(new int[]{35,43,23,86,23,45,84,2,18,83,79,28,54,81,100,94,14,0,0,29,94,12,13,1,48,85,22,95,24,5,73,10,96,97,72,41,52,1,91,3,20,22,41,98,70,20,52,48,91,84,16,30,27,35,69,33,67,18,4,53,86,78,26,83,13,96,29,15,34,80,16,49}, 15);
//        System.out.println(i);

//        Pro135 pro135 = new Pro135();
//        pro135.candy(new  int[]{1,6,10,8,7,3,2});

//        Pro42 pro42 = new Pro42();
//        int trap = pro42.trap(new int[]{4,2,0,3,2,5});
//        System.out.println(trap);
//
//        Pro11 pro11 = new Pro11();
//        pro11.maxArea(new int[]{1,8,6,2,5,4,8,3,7});

//        Pro13 pro13 = new Pro13();
//        pro13.romanToInt("MDCXCV");

//        Pro12 pro12 = new Pro12();
//        pro12.intToRoman(58);

//        Pro58 pro58 = new Pro58();
//        System.out.println(pro58.lengthOfLastWord( "luffy is still joyboy"));

//        TriePractice triePractice = new tr
//
//        Pro14 pro14 = new Pro14();
//        System.out.println(pro14.longestCommonPrefix(new String[]{"app", "appl", "apple", "ap", "apply"}));

//        Pro139 pro139 = new Pro139();
//        System.out.println(pro139.wordBreak( "catsandog", new ArrayList<String>(Arrays.asList("cats","dog","sand","and","cat"))));


//        String s = "axc", t = "ahbgdc";
//
//        System.out.println("Pro 392: " + new Pro392().isSubsequence(s, t) );

//        int[] nums = {-1,0,1,2,-1,-4};
//
//        System.out.println("Pro 15: " + new Pro15().threeSum(nums) );


//        int target = 213;
//
//        int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
//
//        System.out.println("Pro 209: " + new Pro209().minSubArrayLen(target, nums) );

//        String s = "abcabcbb";
//        System.out.println("Pro 3: " + new Pro3().lengthOfLongestSubstring(s) );

//        String s = "barfoofoobarthefoobarman";
//        String[] words = {"bar", "foo", "the"};
//
//        System.out.println("Pro 30: " + new Pro30().findSubstring(s, words));


//        String s = "ADOBECODEBANC", t = "ABC";
//        System.out.println("Pro 76: " + new Pro76().minWindow(s, t) );


//        String   s = "paper", t = "title";
//        System.out.println("Pro 205: " + new Pro205().isIsomorphic(s, t));


//        int array[] = new int[]{1,0,1,1};
//
//        int k = 1;
//
//        System.out.println("Pro 219: " + new Pro219().containsNearbyDuplicate(array, k));


//        int array[] = new int[]{0,3,7,2,5,8,4,6,0,1};
//
//
//        System.out.println("Pro 128: " + new Pro128().longestConsecutive(array) );

//        int array[] = new int[]{0,2,3,4,6,8,9};
//
//        System.out.println("Pro 228: " + new Pro228().summaryRanges(array) );

//        int points[][] = new int[][]{{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
//
//        System.out.println("Pro 452: " + new Pro452().findMinArrowShots(points) );


//        String path = "/home//foo/";
//
//        System.out.println("Pro 71: " + new Pro71().simplifyPath(path) );


//        String s = "(7+(4+5+2)-3)+(6+8)";
//
//        System.out.println("Pro 224: " + new Pro224().calculate(s) );


//        int[] array = new int[]{1,2,3,4,0,5,6,0,1,1,3};
//        System.out.println("Pro int: " + new ProInt().removeDupli(array) );


        int arr[] = new int[]{2,4,3};
        int arr1[] = new int[]{5,6,4};


        System.out.println("Pro 2: " + new Pro2().addTwoNumbers(createLinkedList(arr), createLinkedList(arr1)) );

    }


}
//
//    public static boolean isPalindrome(String s) {
//
//        if (s.length()<= 1){
//            return true;
//        }
//
//        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        StringBuilder builder = new StringBuilder(s);
/// /        int fastPointer = s.length()-1;
/// /        for (int i = 0; i<s.length()/2; i++){
/// /            if (s.charAt(i)!= s.charAt(fastPointer)){
/// /                return false;
/// /            }
/// /            fastPointer = fastPointer-1;
/// /        }
//
//
//        if (s.compareTo(builder.reverse().toString()) == 0){
//            return true;
//        }
//
//        return false;
//    }
