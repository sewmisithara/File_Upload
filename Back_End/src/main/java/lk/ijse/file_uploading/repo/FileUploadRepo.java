package lk.ijse.file_uploading.repo;

import lk.ijse.file_uploading.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FileUploadRepo extends JpaRepository<Image, Integer> {
    @Query(value = "SELECT fileString FROM Image ORDER BY id DESC LIMIT 1;", nativeQuery = true)
    String getLastImageLocation();

}
