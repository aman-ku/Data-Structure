import java.util.*;
import java.util.LinkedList;
class Hash {
    int hsize;
    LinkedList[] buckets;

    public Hash(int hsize) {
        buckets = new LinkedList[hsize];
        for (int i = 0; i < hsize; i++) {
            buckets[i] = new LinkedList();
        }
        this.hsize = hsize;
    }

    public int hashing(int key) {
        int hash = key % hsize;
        if (hash < 0)
            hash += hsize;
        return hash;
    }

    public void insertHash(int key) {
        int hash = hashing(key);
        buckets[hash].add(key);
    }


    public void deleteHash(int key) {
        int hash = hashing(key);

        buckets[hash].remove(key);
    }

    public void displayHashtable() {
        for (int i = 0; i < hsize; i++) {
            System.out.printf("Bucket %d :", i);
            buckets[i].display();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        Hash h=new Hash(n);
        h.insertHash(4);
        h.insertHash(765);
        h.insertHash(450);
        h.insertHash(999);
        h.insertHash(48);
        h.displayHashtable();
    }

}