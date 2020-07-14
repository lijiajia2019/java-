/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Test_interface
 * Author:   李佳佳同学
 * Date:     2020/7/14 9:13
 * Description: 测试一下抽象类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package others;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试一下抽象类〉
 *
 * @author 李佳佳同学
 * @create 2020/7/14
 * @since 1.0.0
 */
public class Test_interface {

    interface A{

        int x=1;
        //接口方法不能含有方法体。
//        public int a(int x{
//            System.out.println("a");
//        }
        public void b();
        public void c();
    }

    //一个类实现这个这个接口必须实现里面所有的方法。
    class B implements A{

        @Override
        public void b() {

        }

        @Override
        public void c() {

        }
    }

    //如果抽象类实现这个接口，那么它并不需要完全实现这个
    abstract class C implements A{

    }
}
