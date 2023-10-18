package lk.ijse.file_uploading.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public class FileUploadController {
    @Autowired
    private FileUploadService fileRepo;

    @PostMapping
    public ResponseUtil uploadFileWithSpringWay(@ModelAttribute ImageDTO dto) {
        fileRepo.saveFileLocation(dto);
        return new ResponseUtil("ok","Successfuly",null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping(path = "/lastImageLoad")
    public ResponseUtil getAllDriver() {
        return new ResponseUtil("OK", "Successfully Loaded. :", fileRepo.getLastImageLocation());
    }
}
