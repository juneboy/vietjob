package fi.vietjob.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.vietjob.bean.authority.Authority;
import fi.vietjob.bean.role.Role;
import fi.vietjob.dao.authorityDAO.AuthorityDao;
import fi.vietjob.dao.roleDAO.RoleDao;

@Controller
@RequestMapping(value = "/secure/main/admin")
public class adminController {
	@Inject
	private AuthorityDao authoritydao;
	@Inject
	private RoleDao roledao;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showAdmin() {
		return "controlpage";
	}
	
	@RequestMapping(value="/authorities.json")
	public @ResponseBody List<Authority> getAuthorityJSON(){
		List<Authority> list = authoritydao.getAllAuthority();
		return list;
	}
	@RequestMapping(value="roles.json")
	public @ResponseBody List<Role> getRoleJSON(){
		List<Role> list = roledao.getAllRole();
		return list;
	}
}
