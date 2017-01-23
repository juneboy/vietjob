package fi.vietjob.dao.zipcodeDAO;

import java.util.List;

import fi.vietjob.bean.zipcode.Zipcode;

public interface ZipcodeDao {
    public int insertZipcode(Zipcode zipcode);
    public int insertListZipcode(List<Zipcode> list);
    public List<Zipcode> getAllZipcode();
    public int editZipcode(Zipcode zipcode);
    public int deleteZipcode(int zipcode);
}
