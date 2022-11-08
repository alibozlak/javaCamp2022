package Kodlama.io.Devs.business.requests.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubTechnologyRequest {
    private int subTechnologyId;
    private String subTechnologyName;
    private int programmingLanguageId;
}
