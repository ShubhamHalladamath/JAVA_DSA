package Tries;

class Node{
    Node[] links = new Node[26];
    boolean flag = false;
    Node(){

    }
    public boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    public void put(char ch,Node node){
        links[ch-'a']=node;
    }
    public Node get(char ch){
        return links[ch-'a'];
    }
    public void end(){
        flag = true;
    }
}
class Trie {
    Node root;
    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node temp = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.containsKey(ch)){
                temp.put(ch,new Node());
            }
            temp = temp.get(ch);
        }
        temp.end();
    }

    public boolean search(String word) {
        Node temp = root;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.containsKey(ch)) return false;
            temp = temp.get(ch);
        }
        if(temp.flag) return true;
        return false;
    }

    public boolean startsWith(String word) {
        Node temp = root;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.containsKey(ch)) return false;
            temp = temp.get(ch);
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
