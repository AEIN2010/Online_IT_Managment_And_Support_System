package oimass.aeintech.loginservice.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "user_accounts")
public class UserAccount {

    @OneToOne
    private User user;

    @Column(unique = true)
    @Id
    private String username;
    private String password;
    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String department;

    @Column(nullable = false)
    private Boolean isActive = true;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
