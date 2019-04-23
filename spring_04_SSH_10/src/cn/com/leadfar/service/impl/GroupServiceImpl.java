package cn.com.leadfar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.leadfar.dao.GroupDao;
import cn.com.leadfar.model.Group;
import cn.com.leadfar.service.GroupService;

@Service("groupService")
public class GroupServiceImpl implements GroupService {

	@Resource
	private GroupDao groupDao;

	@Override
	public List<Group> findAllGroups() {
		List<Group> groups = null;

		groups = groupDao.findAllGroups();

//		Group g = new Group("kdjfkdjfsdkjf");
//		groupDao.save(g);
		
		return groups;
	}

	@Override
	public Group findGroup(int gid) {
		return groupDao.findById(gid);
	}

	@Override
	public Group saveGroup(Group g) {
		groupDao.save(g);
		
		return g;
//		Group returnGroup = null;
//		Group oldGroup = groupDao.findByName(g.getName());
//		
//		if(oldGroup == null){
//			groupDao.save(g);
//			returnGroup = g;
//		}else{
//			returnGroup = oldGroup;
//		}
//
//		return returnGroup;
	}

}
