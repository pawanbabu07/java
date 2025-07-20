import java.util.LinkedList;

public class HashMapImplmentation {
    static class HashMap<K, V> {
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key= key;
                this.value= value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]= new LinkedList<>();
            }
        } 

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di =0;
            for(int i = 0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return  -1;
        }

        private  void rehash(){
            LinkedList<Node> oldBuck[]=buckets;
            buckets = new  LinkedList[N*2];
            N = 2*N;
            for(int i=0; i<buckets.length; i++){
                buckets[i]=new LinkedList<>();
            }
            //nodes -> odd in bucket
            for(int i=0;i<oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        
        private int hashFunction(K key){
            int hc= key.hashCode();
            return  Math.abs(hc)%N;
        }
        
        public void put(K key, V value){
            int bi= hashFunction(key);
            int di= searchInLL(key, bi);

            if(di!=-1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;
            if(lambda >2.0){
                rehash();
            }

        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("china", 100);
        hm.put("india", 150);
        hm.put("nepal", 20);
    }
}
