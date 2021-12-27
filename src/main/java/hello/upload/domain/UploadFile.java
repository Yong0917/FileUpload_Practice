package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName;          //upload 파일 이름
    private String storeFileName;           //저장할때의 파일 이름

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
