package model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Publisher {
    private int id;
    private String name;
    private String email;
    private String phone;
}
