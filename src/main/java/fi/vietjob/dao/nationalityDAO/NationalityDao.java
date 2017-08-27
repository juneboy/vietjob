package fi.vietjob.dao.nationalityDAO;

import java.util.List;

import fi.vietjob.bean.nationality.Nationality;

public interface NationalityDao {
    public List<Nationality> getAllNationality();
    public int insertNationality(Nationality na);
    public int insertListNationality(List<Nationality> nationalities);
    public int editNationality(Nationality na);
    public int deleteNationality(int id);
}
