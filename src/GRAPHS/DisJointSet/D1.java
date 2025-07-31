package GRAPHS.DisJointSet;
class DisJoint{
    public int[] rank;
    public int[] parent;
    DisJoint(int n){
        rank=new int[n+1];
        parent=new int[n+1];
        for(int i=0;i<=n;i++){
            rank[i]=0;
            parent[i]=i;
        }
    }
    public int findP(int x){
        if(x==parent[x]) return x;
        int ultP=findP(parent[x]);
        parent[x]=ultP;
        return ultP;
    }
    public void unionByRank(int x,int y){
        int ultPX=findP(x);
        int ultPY=findP(y);
        if(ultPX==ultPY) return;
        if(rank[ultPX]<rank[ultPY]){
            parent[ultPX]=ultPY;
        }else if(rank[ultPX]>rank[ultPY]){
            parent[ultPY]=ultPX;
        }else{
            parent[ultPX]=ultPY;
            rank[ultPY]+=1;
        }

    }
}
public class D1 {
    public static void main(String[] args) {

    }
}
