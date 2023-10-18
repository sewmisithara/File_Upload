package lk.ijse.file_uploading.Controller;

import org.springframework.web.multipart.MultipartFile;

public class imageDTO {
    private String id;
    private MultipartFile fileString;

    public ImageDTO(MultipartFile fileString) {
        this.fileString = fileString;
    }
}
