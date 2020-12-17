package ssm.pojo;

import java.util.List;
import java.util.Map;

public class UserVO {
    private List<User> users;
    private Map<String,Object>mapuser;

    public void setMapuser(Map<String, Object> mapuser) {
        this.mapuser = mapuser;
    }

    public Map<String, Object> getMapuser() {
        return mapuser;
    }

    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
