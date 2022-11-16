/*
 * 图书类
 * 
 */
public class Book {
    private final int bookID;//图书主键
    private String name;//图书名称
    public String briefIntroduction; //图书的简短介绍
    private int count;//图书总数量
    private int currentCount;//图书当前数量
    private boolean canLend;//图书状态
    public String bookType;//图书类型  如果想要根据类型搜索就开发这个

    private void setCanLend()
    {
        canLend = currentCount == 0 ? false : true;
    }
    
    //出与入图书都应该更新当前图书数量 a:入 b:出
    public void setCurrentCount(boolean a)
    {
        if(a)
            currentCount = ++currentCount >= count ? count : currentCount;
        else
            currentCount = --currentCount < 0 ? 0 : currentCount;
        
        setCanLend();
    }
    //修改名字
    public boolean setName(String name)
    {
        if(name != null && name != "")
        {
            this.name = name;
            return true;
        }
        return false;
    }
    //获取名字
    public String getName()
    {
        return this.name;
    }
    //修改图书总量
    public boolean setCount(int count)
    {
        if(count != 0 && count >= currentCount)
        {
            this.count = count;
            return true;
        }
        return false;
    }
    //获取图书总量
    public int getCount()
    {
        return this.count;
    }

    public Book(int bookID,String name,String briefIntroduction,int count)
    {
        this.bookID = bookID;
        this.name = name;
        this.briefIntroduction = briefIntroduction;
        this.count = count;
        currentCount = count;
        canLend = currentCount == 0 ? false : true;
    }
    public Book(int bookID,String name,int count)
    {
        this(bookID,name,"",count);
    }
    @Override
    public String toString() {
        return String.format("{图书 | ID: %d 名称: %s, 数量: %d/%d, 状态: %s, 简短介绍: %s",
        bookID,
        name,
        currentCount,
        count,
        canLend == true ? "可借出" : "不可借出",
        briefIntroduction
        );
    }
}
