package Controller;

import bean.User;
import com.jfinal.core.Controller;

import java.util.List;

/**
 * @author chen
 * @date 2019/6/17--20:22
 */
public class HelloWorld extends Controller {
    public void index(){
        //执行sql
        List<User> list = User.dao.find("select * from user");
        System.out.println(list);
        setAttr("users",list);
        renderJsp("index.jsp");
    }
    public void test(){
        renderJsp("index.jsp");
    }

    public void test2(){
        renderJsp("test2.jsp");
    }
}
