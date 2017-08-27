package fi.vietjob.dao.industryDAO;

import java.util.List;

import fi.vietjob.bean.industry.Industry;

public interface IndustryDao {
    public List<Industry> getAllIndustry();
    public Industry findIndustry(String industry);
    public int insertIndustry(Industry industry);
    public int insertListIndustry(List<Industry> industries);
    public int editIndustry(Industry industry);
    public int deleteIndustry(int id);
}
