package GRAPHS;
import java.sql.SQLOutput;
import java.util.*;
class Solution3{
    Map<String,Integer> map;
    List<List<String>> ans;
    String begin;
    public List<List<String>> findLadders(String start, String end, List<String> wordList) {
        if(start.length()!=end.length()){
            return ans;
        }
        HashSet<String> set=new HashSet(wordList);
        Queue<String> dict=new LinkedList<>();
        map=new HashMap<>();
        ans=new ArrayList<>();
        dict.add(start);
        map.put(start,1);
        begin=start;
        while(!dict.isEmpty()){
            String temp=dict.poll();
            if(temp.equals(end)){
                break;
            }
            char[] arr=temp.toCharArray();
            for(int i=0;i<temp.length();i++){
                char original=arr[i];
                for(char ch='a';ch<='z';ch++){
                    arr[i]=ch;
                    String st=new String(arr);
                    if(set.contains(st)){
                        set.remove(st);
                        dict.add(st);
                        map.put(st,map.get(temp)+1);
                    }
                }
                arr[i]=original;
            }
        }
        System.out.println(map);
        if(map.containsKey(end)){
            List<String> list=new ArrayList<>();
            list.add(end);
            dfs(end,list);
        }
        return ans;
    }
    private void dfs(String word, List<String> list) {
        if (word.equals(begin)) {
            List<String> temp = new ArrayList<>(list);
            System.out.println("->"+temp);
            Collections.reverse(temp);
            ans.add(temp);
            return;
        }
        char[] arr = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            char original = arr[i];
            for (char ch = 'a'; ch <= 'z'; ch++) {
                arr[i] = ch;
                String st = new String(arr);
                // Fix here: Use "map" instead of "Map"
                if (map.containsKey(st) && map.get(st) < map.get(word)) {
                    System.out.println(st);

                    list.add(st);
                    System.out.println(list);

                    dfs(st, list);
                    list.remove(list.size() - 1);
                }
            }
            arr[i] = original;
        }
    }


}
public class Word_lader {
    public static void main(String[] args) {
        Solution3 s=new Solution3();
        List<List<String>> reults=s.findLadders("qa","sq",new ArrayList<>(Arrays.asList("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye")));
        System.out.println(reults);
    }
}
