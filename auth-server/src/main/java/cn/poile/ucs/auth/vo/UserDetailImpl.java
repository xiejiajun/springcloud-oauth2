package cn.poile.ucs.auth.vo;import org.springframework.security.core.GrantedAuthority;import org.springframework.security.core.userdetails.UserDetails;import java.util.ArrayList;import java.util.Collection;import java.util.List;/** * @author yaohw * @date 2019-09-25 16:12 */public class UserDetailImpl implements UserDetails {    private String id;    private String username;    private String password;    private String test;    private boolean isEnable;    private Collection<? extends GrantedAuthority> authorities;    @Override    public Collection<? extends GrantedAuthority> getAuthorities() {        return this.authorities;    }    @Override    public String getPassword() {        return this.password;    }    @Override    public String getUsername() {        return this.username;    }    @Override    public boolean isAccountNonExpired() {        return true;    }    @Override    public boolean isAccountNonLocked() {        return true;    }    @Override    public boolean isCredentialsNonExpired() {        return true;    }    @Override    public boolean isEnabled() {        return this.isEnable;    }    public void setEnable(boolean enable) {        isEnable = enable;    }    public void setUsername(String username) {        this.username = username;    }    public void setPassword(String password) {        this.password = password;    }    public void setTest(String test) {        this.test = test;    }    public String getTest() {        return test;    }    public String getId() {        return id;    }    public void setId(String id) {        this.id = id;    }    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {        this.authorities = authorities;    }}