package config;

import Controller.HelloWorld;
import Controller.testcontroller;
import bean.User;
import com.jfinal.config.*;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

/**
 * @author chen
 * @date 2019/6/17--20:20
 */
public class jfinalconfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        PropKit.use("db.properties");
        constants.setViewType(ViewType.JSP);
        constants.setDevMode(true);//设置为开发者模式
    }
    /*
    * 此方法用来配置jfinal访问路径
    * */
    @Override
    public void configRoute(Routes routes) {
        /*
        * /WEB-INF/view/test/index.jsp
        * */
        routes.setMappingSuperClass(true);
        routes.setBaseViewPath("/WEB-INF/view/");
        routes.add("/", HelloWorld.class,"test");
        routes.add("/hello",testcontroller.class,"test");

    }
    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {
        DruidPlugin druidPlugin = new DruidPlugin(PropKit.get("db.url"), PropKit.get("db.username"), PropKit.get("db.password"));
        plugins.add(druidPlugin);
        ActiveRecordPlugin arp=new ActiveRecordPlugin(druidPlugin);
        arp.setShowSql(true);
        arp.addMapping("user", User.class);
        plugins.add(druidPlugin);
        plugins.add(arp);
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
