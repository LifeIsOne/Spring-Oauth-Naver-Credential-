package shop.miraclecoding.blog.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
@Table(name = "user_tb")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String username;
    private String password;
    private String email;
    private String provider;

    @CreationTimestamp // pc -> db (날짜주입)
    private Timestamp createdAt;

    @Builder
    public User(Integer id, String username, String password, String email, String provider, Timestamp createdAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.provider = provider;
        this.createdAt = createdAt;
    }
}
