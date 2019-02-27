package dao;


import domain.Items;


public interface ItemsDao {
    public Items findById(Integer id);
    //道路千万条，安全第一条
    //行车不规范，亲人泪两行
}
