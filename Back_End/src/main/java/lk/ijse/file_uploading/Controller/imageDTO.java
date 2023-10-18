package lk.ijse.file_uploading.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class imageDTO {
    private String id;
    private MultipartFile fileString;

    public ImageDTO(MultipartFile fileString) {
        this.fileString = fileString;
    }
}
