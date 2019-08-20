package main.webapp.getdatabase;

import com.google.gson.Gson;
import main.webapp.driuddemo.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;


/**
 * 得到数据库的数据
 */
public class getDataBase {
    private  JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    /**
     * 获取特定的报文信息
     * @return 返回固定时间范围的数据
     */
    public String  getMessage(String sql){
        List<message> li = template.query(sql, new BeanPropertyRowMapper<message>(message.class));
        if(li.size()!=0)
        {
            return  new Gson().toJson(li);
        }
        else return null;
    }
    public String  getMessage(String sql1,String sql2){
        List<message> li = template.query(sql1, new BeanPropertyRowMapper<message>(message.class));
        List<message> li2 = template.query(sql2, new BeanPropertyRowMapper<message>(message.class));
        if(li.size()!=0)
        {
            li.addAll(li2);
            return new Gson().toJson(li);
        }
        else return null;
    }
}
