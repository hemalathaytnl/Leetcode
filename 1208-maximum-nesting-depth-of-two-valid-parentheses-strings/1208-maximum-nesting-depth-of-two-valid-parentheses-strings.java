class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        var stack = new Stack<Character>();
        var array = new int[seq.length()];
        int i = 0;
        for (char c : seq.toCharArray()) {
            switch (c) {
                case '(' :
                    if (!stack.isEmpty() && stack.peek() == 'A') {
                        array[i] = 1;
                        stack.push('B');
                    }
                    else {
                        array[i] = 0;
                        stack.push('A');
                    }
                    break;
                case ')' :
                    switch (stack.pop()) {
                        case 'A' :
                            array[i] = 0;
                            break;
                        case 'B' :
                            array[i] = 1;
                            break;
                    }
            }
            ++i;
        }
        return array;
    }
}