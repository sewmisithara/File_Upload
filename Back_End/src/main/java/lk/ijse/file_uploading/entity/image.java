package lk.ijse.file_uploading.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fileString;

    public Image(String fileString) {
        this.fileString = fileString;
    }
}
