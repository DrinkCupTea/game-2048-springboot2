package cn.xie.domain;

public class User {
    private String username;
    private String passwd;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    @Override
    public String toString() {
        return "Users [passwd=" + passwd + ", username=" + username + "]";
    }
}