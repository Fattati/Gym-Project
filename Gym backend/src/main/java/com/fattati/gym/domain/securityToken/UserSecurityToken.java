package com.fattati.gym.domain.securityToken;

import com.fattati.gym.enums.SecurityTokenType;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class UserSecurityToken {
    @Id
    private String token;
    private boolean valid;

    @Enumerated(EnumType.STRING)
    private SecurityTokenType securityTokenType;

    @org.hibernate.annotations.Type(type="uuid-char")
    private UUID userId;

    @Column(length = 65555)
    private Date creationDate;

    @Column(length = 65555)
    private Date changedDate;


    public String getToken() { return token; }

    public void setToken(String token) { this.token = token; }

    public boolean isValid() { return valid; }

    public void setValid(boolean valid) { this.valid = valid; }

    public SecurityTokenType getSecurityTokenType() { return securityTokenType; }

    public void setSecurityTokenType(SecurityTokenType securityTokenType) { this.securityTokenType = securityTokenType; }

    public UUID getUserId() { return userId; }

    public void setUserId(UUID userId) { this.userId = userId; }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(Date changedDate) {
        this.changedDate = changedDate;
    }
}
