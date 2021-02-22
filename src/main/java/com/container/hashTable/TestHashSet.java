package com.container.hashTable;

import java.util.HashSet;

public class TestHashSet {

    static final int MAXIMUM_CAPACITY = 1 << 30;

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;}


        public static void main(String[] args) {

            System.out.println(tableSizeFor(8));

      /*  int hash = hash("ssss");
        System.out.println(hash);
        int index = hash % 16;
        System.out.println(index);*/


        /*Cache<Integer, String> guavaCache = CacheBuilder

                .newBuilder()

                .expireAfterWrite(3, TimeUnit.HOURS)  //写入后三小时失效

                .initialCapacity(50) //初始化容量50

                .maximumSize(500) //最大容量

                .concurrencyLevel(16).build();  //16个segment，分段锁16


        List l = new ArrayList();*/

        HashSet set = new HashSet();
        Student student1 = new Student("1", "jack");
        Student student2 = new Student("1", "jack");
        set.add(student1);
        set.add(student2);
        System.out.println(set.size());


        /*System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.equals(student2));
        set.add(student1);
        set.add(student2);
        String s = "123";
        System.out.println(set);*/
    }

    public static int hash(Object key) {
        int h;
        System.out.println(key.hashCode());
        System.out.println(key.hashCode() >>> 16);
        System.out.println((h = key.hashCode()) ^ (h >>> 16));
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
