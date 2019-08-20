package main.webapp.driuddemo;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.Map;

/**
 * 构建mySQL模板
 */
public class mySQL {
    private JdbcTemplate template;
    private String sql="select * from demo";
    private String sql1="select * from demo where '年龄'=23";
    //创建删除数据表
    {
        //表名，和各个字段
        String sql1="CREATE TABLE table_name (column_name column_type)";
        String sql2="DROP TABLE table_name";
    }
    //增删改用updata()执行
    //在表中插入一条数据
    {
        //对应表中的字段进行插入
        String sql1="insert into table_name ( field1, field2,...fieldN )values( value1, value2,...valueN )";
        //对应表中默认的字段,对插入值执行时确定
        sql1="insert into demo values(?,?,?)";
        template.update(sql1,"syj",1996,"234453");
    }
    //在表中删除一条数据
    {
        //DELETE FROM table_name [WHERE Clause]
        //如果没有指定 WHERE 子句，MySQL 表中的所有记录将被删除。
        //你可以在 WHERE 子句中指定任何条件
        //您可以在单个表中一次性删除记录。
        //字段名不用加双引号
        String sql3="delete from table_name where 姓名='宋莹炯'";
    }
    //在表中更新数据
    {
        //updata [LOW_PRIORITY] [IGNORE] table_name
        //SET
        //    column_name1 = expr1,
        //    column_name2 = expr2,
        //    ...
        //WHERE
        //    condition;
        //在上面UPDATE语句中：
        //MySQL在UPDATE语句中支持两个修饰符。
        //
        // LOW_PRIORITY修饰符指示UPDATE语句延迟更新，直到没有从表中读取数据的连接。
        // LOW_PRIORITY对仅使用表级锁定的存储引擎(例如MyISAM，MERGE，MEMORY)生效
        //首先，在UPDATE关键字后面指定要更新数据的表名。
        // 其次，SET子句指定要修改的列和新值。要更新多个列，请使用以逗号分隔的列表,以字面值，表达式或子查询的形式在每列的赋值中来提供要设置的值。
        // 第三，使用WHERE子句中的条件指定要更新的行。WHERE子句是可选的。 如果省略WHERE子句，则UPDATE语句将更新表中的所有行。
        //请注意，WHERE子句非常重要，所以不应该忘记指定更新的条件。 有时，您可能只想改变一行; 但是，可能会忘记写上WHERE子句，导致意外更新表中的所有行
        String sql4="updata table_name set field1=new-value1, field2=new-value2 where field1=old-value";
        String sql5="updata employees set  email=mary.new@yiibai.com where employeeNumber = 1056";
    }
    //查询数据
    {
        String sql2="select column_name,column_name from table_name where cause limit n offset n";
        //查询表的数据
        //查询语句中你可以使用一个或者多个表，表之间使用逗号(,)分割，并使用WHERE语句来设定查询条件。
        //column_name 表示查询某一列数据
        //SELECT 命令可以读取一条或者多条记录。
        //你可以使用星号（*）来代替其他字段，SELECT语句会返回表的所有字段数据
        //你可以使用 WHERE 语句来包含任何条件。
        //你可以使用 LIMIT 属性来设定返回的记录数。
        //你可以通过OFFSET指定SELECT语句开始查询的数据偏移量。默认情况下偏移量为0


        //1  使用select语句查询一个数据   select* from 数据表名;
        //2  查询表中的一个字段或多个字段 select 字段1,字段2 from 数据表;
        //3  查询表中指定的数据信息   select* from数据表名order by id desc limit 2,1;查询的数据按id 倒序排序          
        //4  查询指定路径  Select* from 数据表 where 属性 = ‘…’;
        //5  带in关键字的查询  Select* from 数据表 where 字段 [not] in (字段值1，字段值2…字段值n);  最适于数组作为查询条件 查询到字段值为..的数据
        //6  带BETWEEN and 的范围查询 select * from 数据表 where 字段 [not] between 取值1 and 取值2；  查询取值1和取值范围的数据
        //7  带like的字符匹配查询
          //(1)select * from 数据表 where 属性 like '%SQL%'；//查询属性中包含SQL字符的数据
          //(2)select * from 数据表 where 属性 like 'a%b';// //查询属性中以a开头以b结尾的字符串的数据
          //(3)select * from 数据表 where 属性 like 'm_n';//查询属性中以m开头以n结尾的3个字符的数据，中间的‘_’只能代表一个字符
        //8  带AND的多条件查询  select * from library where price=50 and name like 'myS_L';
        //9 带OR的多条件查询  select * from library where price=50 or price=99
        //10用distinct关键字去除结果中的重复行 select distinct name from library;
        //11 用ORDER BY 关键字对查询结果排序  select * from library orderby id desc;倒序排列      asc;//正序排列
        //12用GROUP BY关键字分组查询查询的次序  select name,price from library GROUP BY price;
            //GROUP BY 关键字与 GROU_CONCAT函数一起使用  selectname,GROUP_CONCAT(price) from library GROUP BY name;
            //按多个字段进行分组  selectid,name,price from library GROUP BY name,price;//当price字段的值相等时，再按照name字段分组
        //13  用LIMIT限制查询结果的数量   select * from library orderby id asc limit 2,3; //取两条数据，正序，从第三条开始
        sql2="select * from runoob_tbl";

        sql2="select id from demo where id='1' limit 4,1";

    }
    //匹配数据
    {
        //select field1, field2,...fieldN  from table_name  where field1 like condition1 [AND [OR]] filed2 = 'somevalue'
        //你可以在 WHERE 子句中指定任何条件。
        //你可以在 WHERE 子句中使用LIKE子句。
        //你可以使用LIKE子句代替等号 =。
        //LIKE 通常与 % 一同使用，类似于一个元字符的搜索。
        //你可以使用 AND 或者 OR 指定一个或多个条件。
        //你可以在 DELETE 或 UPDATE 命令中使用 WHERE...LIKE 子句来指定条件。

        //在 where like 的条件查询中，SQL 提供了四种匹配方式。
        //   %：表示任意 0 个或多个字符。可匹配任意类型和长度的字符，有些情况下若是中文，请使用两个百分号（%%）表示。
        //   _：表示任意单个字符。匹配单个任意字符，它常用来限制表达式的字符长度语句。
        //   []：表示括号内所列字符中的一个（类似正则表达式）。指定一个字符、字符串或范围，要求所匹配对象为它们中的任一个。
        //   [^] ：表示不在括号所列之内的单个字符。其取值和 [] 相同，但它要求所匹配对象为指定字符以外的任一个字符。

        //查询以 java 字段开头的信息。
        String sql1="SELECT * FROM position WHERE name LIKE 'java%'";
        //查询包含 java 字段的信息。
        String sql2="SELECT * FROM position WHERE name LIKE '%java%'";
        //查询以 java 字段结尾的信息。
        String sql3="SELECT * FROM position WHERE name LIKE '%java'";
    }
    //合并查询数据
    {
        //select expression1, expression2, ... expression_n
        //from tables
        //[conditions]
        //union [ALL | DISTINCT]
        //select expression1, expression2, ... expression_n
        //from tables
        //[where conditions];

        //参数
        //expression1, expression2, ... expression_n: 要检索的列。
        //tables: 要检索的数据表。
        //WHERE conditions: 可选， 检索条件。
        //DISTINCT: 可选，删除结果集中重复的数据。默认情况下 UNION 操作符已经删除了重复数据，所以 DISTINCT 修饰符对结果没啥影响。
        //ALL: 可选，返回所有结果集，包含重复数据。
        String sql1="select country, name from Websites where country='CN' union all  select country, app_name from apps where country='CN' order by country";
    }
    //JdbcTemplate 查询操作函数query类均可动态传入参数

    //JdbcTemplate 查询操作函数query 将结果封装成一个javabean对象list<Student>集合
    {
        //query(),
        //可以传入参数
        //query参数 RowMapper
        //一般使用BeanPropertyRowMapper实现类，可以完成数到JavaBean的自动封装
        //new BeanPropertyRowMapper<类型>(类型.class)自定义的javabean封装
        List<Student> li = template.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
    }
    //查询操作函数queryForMap 查询结果封装成map集合 用于查询返回一个结果
    {
        //可动态传入参数
         Map<String, Object> stu=template.queryForMap(sql1);
    }
    // 查询操作函数queryForList 查询一条结果封装map,然后把所有map集合数据封装成list集合
    {
        //queryForList()
        //可动态传入参数
        List<Map<String,Object>> list = template.queryForList(sql);
    }
    // 查询操作函数queryObject 将结果封装成对象
    {
        Student student = template.queryForObject(sql1, new BeanPropertyRowMapper<Student>());
    }
    //查询总记录数
    {
        //select count(*) from [table_name]
        String sql1="select count(年龄) from demo";
        Long total=template.queryForObject(sql1, Long.class);
        System.out.println(total);
    }

}
