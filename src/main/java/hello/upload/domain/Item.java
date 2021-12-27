package hello.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;            //id
    private String itemName;    //item이름
    private UploadFile attachFile;  //첨부파일
    private List<UploadFile> imageFiles;        //이미지파일
}
