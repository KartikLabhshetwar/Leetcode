/*
1816. Truncate Sentence

A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).
For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

T.C = O(n), S.C = O(n)
*/

class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String str[] = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < k-1 ; i++){
            ans.append(str[i]+" ");
        }
        ans.append(str[k-1]);
        
        return ans.toString();
    }
}
