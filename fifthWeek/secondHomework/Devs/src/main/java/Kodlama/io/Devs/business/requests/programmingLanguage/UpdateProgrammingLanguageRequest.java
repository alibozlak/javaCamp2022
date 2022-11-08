package Kodlama.io.Devs.business.requests.programmingLanguage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProgrammingLanguageRequest {
    private int id;
    private String name;
}
