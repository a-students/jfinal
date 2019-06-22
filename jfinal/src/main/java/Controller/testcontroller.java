package Controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;

/**
 * @author chen
 * @date 2019/6/18--12:37
 */
public class testcontroller extends Controller {
    public void index(){
        renderText("hello world");
    }
   /* public void test(){
        renderJsp("index.jsp");
    }*/
}
