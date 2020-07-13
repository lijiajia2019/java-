/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: TestArrayList
 * Author:   李佳佳同学
 * Date:     2020/7/14 0:55
 * Description: ArrayListApi
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈ArrayListApi〉
 *
 * @author 李佳佳同学
 * @create 2020/7/14
 * @since 1.0.0
 */

//增加：add() 删除：根据下标删除：remove(index)  根据具体的元素删除remove(Object); 修改：set(index,value)
    //查：是否包含；是否包含；contains()   根据索引下标值查找：get(index)  indexOf(element)该元素第一次出现的下标
    //lastIndexOf(elements) 该元素最后一次出现新的下标。
//
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        ArrayList list2=new ArrayList();

        System.out.println(list1.isEmpty());

        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        list2.add(4);
        list1.addAll(list2);
        System.out.println(list1);

        //contains是否包含
        System.out.println(list1.contains(1));

        //get(index)根据下标查找对应的value。
        System.out.println("get(int index)"+list1.get(0));

        //indexof 该元素最后一次出现位置的索引。
        System.out.println("indexOf "+list1.indexOf(1));

        //lastIndexOf()
        System.out.println("lastIndexOf"+list1.lastIndexOf(1));

        //迭代：
        System.out.println("迭代");
        Iterator it=list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("删除：remove(Object ) ;remove(int index); removeAll(Collection c)");
        ArrayList list3=new ArrayList();
        list3.add(1);
        list3.add(3);
        list1.removeAll(list3);
        System.out.println(list1);


        //修改：set(index,value)
        list1.set(0,3);
        System.out.println(list1);

        //集合元素大小：
        System.out.println("size()" +list3.size());

        //toArray();
       ArrayList list4=new ArrayList();
       list4.add(5);
       list4.add(3);
       list4.add(6);
       Object [] ob=list4.toArray();
        System.out.println(Arrays.toString(ob));

    }
}
