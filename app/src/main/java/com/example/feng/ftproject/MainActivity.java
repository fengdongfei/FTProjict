package com.example.feng.ftproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.feng.ftproject.model.Ass;
import com.example.feng.ftproject.model.BModel;
import com.example.feng.ftproject.model.Bss;
import com.example.feng.ftproject.model.F;
import com.example.feng.ftproject.model.ShopModel;
import com.example.feng.ftproject.model.UserModel;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.ibm.com/developerworks/cn/java/j-djc02113/
 */
public class MainActivity extends AppCompatActivity {

    private List<ShopModel> shopModel = new ArrayList<ShopModel>();
    private List<UserModel> userModel = new ArrayList<UserModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**泛形类test**/
        Box<String> name = new Box<String>("corn");
        Log.e("TFTEST", "name:" + name.getData());
        Box<ShopModel> shop = new Box<ShopModel>(new ShopModel());
        Log.e("TFTEST", "name:" + shop.getData().sName + " -- " + shop.getData().sTime);
        Box<UserModel> user = new Box<UserModel>(new UserModel());
        Log.e("TFTEST", "name:" + user.getData().task + " -- " + user.getData().isFinish);
        BModel bmodel = new BModel();

        /**通配符test**/
//        getExtendData(bmodel);
        getData(user);
        getExtendData(shop);
        new F<Bss>().create(new Ass()).print();

    }

    /**
     * 类型通配符一般是使用 ? 代替具体的类型实参。注意了，此处是类型实参，而不是类型形参！且Box<?>在逻辑上是Box<String>、Box<ShopModel>...
     * 等所有Box<具体类型实参>的父类。由此，我们依然可以定义泛型方法，来完成此类需求。
     **/
    public static void getData(Box<?> data) {
        System.out.println("data :" + data.getData());
    }

    /**
     * 定义一个功能类似于getData()的方法，但对类型实参又有进一步的限制：只能是BModel类及其子类。此时，需要用到类型通配符上限
     * 类型通配符上限通过形如Box<? extends Number>形式定义，相对应的，类型通配符下限为Box<? super Number>形式，其含义与类型通配符上限正好相反
     **/
    public static void getExtendData(Box<? extends BModel> data) {
        System.out.println("data :" + data.getData());
    }

    public static void getSuperData(Box<? super BModel> data) {
        System.out.println("data :" + data.getData());

    }

    //编写一个泛型方法，实现指定位置上的数组元素的交换
    public <T> void swap(T arr[], int pos1, int pos2) {
        T temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    //编写一个泛型方法，接收一个任意数组，并颠倒数组中的所有元素
    public <T> void reverse(T arr[]) {
        int start = 0;//第一个
        int end = arr.length - 1;//最后一个

        while (true) {
            if (start >= end) {
                break;
            }

            T temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }


    }

    //自定义带泛型的方法
    public <T> T funtion(T t) {

        return t;
    }

    public <T, E, K> void b(T t, E e, K k) {

    }

    //静态方法泛型定义在static后
    public static <T> void c(T t) {

    }

}
