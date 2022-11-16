import java.util.HashMap;
/*
 *  书架类
 */
public class BookRack {
    //采用单一模式 无法创建BookRack对象 （需创建，引用getInstance）
    private static BookRack INSTANCE;
    private BookRack(){}
    public BookRack getInstance()
    {
        if(INSTANCE == null)
            INSTANCE = new BookRack();
        return INSTANCE;
    }

    private HashMap<Integer,Book> Books = new HashMap<Integer,Book>(); //储存图书 （ID 图书）
    

    public void addBook()
    {
        //增加
        //需判断图书ID是否已经存在
    }
    public void deleteBook()
    {
        //删除
    }
    public void alterBook()
    {
        //修改
    }
}