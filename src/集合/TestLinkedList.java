/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: TestLinkedList
 * Author:   李佳佳同学
 * Date:     2020/7/14 1:39
 * Description: LinkedList API
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 集合;

import java.util.LinkedList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈LinkedList API〉
 * LinkedLsit java.util包下。
 *
 * @author 李佳佳同学
 * @create 2020/7/14
 * @since 1.0.0
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list1=new LinkedList();

        //增加add(添加到尾部）。
        list1.add(1);
        list1.add(2);
        System.out.println(list1);

        //addFirst;
        list1.addFirst(0);
        System.out.println(list1);

        //addLast 添加到尾部。
        list1.addLast(3);
        System.out.println(list1);

        //clear 清除所有。
       // list1.clear();
       // System.out.println("clear() "+list1);

        //contains 是否包含：
        System.out.println("list1.contains(1) "+list1.contains(1));

        //element() 检索但是不删除此列表的头，就是第一个元素的意思？
        System.out.println("list1.element"+list1.element());
        System.out.println(list1);

        //获取功能：get(int index) getFirst() getLast()
        System.out.println("get(int index) "+list1.get(0));
        System.out.println("getFirst() "+list1.getFirst());
        System.out.println("getLast() " + list1.getLast());

        System.out.println(list1);


        System.out.println("indexOf(Object o1),lastIndexOf(Object o2) 根据元素返回索引下标。如果不存在这个数，就返回-1.");
        LinkedList list2=new LinkedList();
        list2.add("lisi");
        list2.add("zhangsan");
        list2.add("wangwu");
        list2.add("wangwu");
        System.out.println("list2.indexOf()"+list2.indexOf("lisi"));
        System.out.println("list2.lastIndexOf()"+list2.lastIndexOf("wangwu"));
        System.out.println("测试异常情况"+list2.indexOf("llllll"));

        //offer 添加到尾部。 注意：三个offer 返回的是boolean值。
        list2.offer("liliu");
        System.out.println("list2.offer"+list2);
        System.out.println("list2.offerFirst()"+list2.offerFirst("first"));
        System.out.println("list2.offerLast"+list2.offerLast("Last"));

        System.out.println("peek 查找但是不删除，返回E。如果列表为空");
        LinkedList list3=new LinkedList();
        System.out.println(list3.peek());
        list3.offer(1);
        list3.offer(2);
        System.out.println(list3.peekFirst());
        System.out.println(list3.peekLast());

        System.out.println("poll弹出，返回E，并且删除。如果列表为空，则返回null。pop也一样，删除并且弹出。");
        System.out.println("poll"+list3.poll());
        System.out.println("pollLast"+list3.pollLast());

        System.out.println("push,往前追加，意思是添加到前面。");
        System.out.println(list3);
        list3.push(1);
        list3.push(2);
        System.out.println(list3);

        System.out.println("删除元数remove() ① E e remove(int index)  ② E e remove()删除第一个并且弹出。③boolean remove(Object o)" +
                "E e removeFirst() ⑤E e removeLast()");

        LinkedList list4=new LinkedList();
        list4.offer(1);
        list4.add(2);
        list4.offerLast(3);
        list4.addLast(4);
        System.out.println(list4);
        System.out.println(list4.remove());
        System.out.println(list4);






















    }

}
