package Spring.JPA.entities;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "Guardian Name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "Guardian Email")
        ),
        @AttributeOverride(
                name = "phoneNumber",
                column = @Column(name = "Phone Number")
        )
})
public class Guardian {

    private String name;

    private String email;

    private String phoneNumber;
}
