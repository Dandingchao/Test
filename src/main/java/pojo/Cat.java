package pojo;

import Utils.StringUtil;
import lombok.Data;

/**
 * @version Cat.java, v 0.1 2021年09月13日 11:01 上午
 */
@Data
public class Cat {
    private String name;

    public Cat(){
        this.name="不会拓扑的猫";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMe(){
        if (StringUtil.isNullOrBlank(this.name)||!StringUtil.equal(this.name,"不会拓扑的猫")){
            return false;
        }
        return true;
    }
}