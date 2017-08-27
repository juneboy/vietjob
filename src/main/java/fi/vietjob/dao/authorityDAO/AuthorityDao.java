package fi.vietjob.dao.authorityDAO;

import java.util.List;

import fi.vietjob.bean.authority.Authority;

public interface AuthorityDao {
    public List<Authority> getAllAuthority();
    public int insertListAuthority(List<Authority> authorities);
    public int insertAuthority(Authority authority);
    public int editAuthority(Authority authority);
    public int deleteAuthority(int authorityID);
}
