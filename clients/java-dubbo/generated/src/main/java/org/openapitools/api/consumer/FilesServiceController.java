package org.openapitools.api.consumer;

import org.openapitools.model.DeleteFileResponse;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.FilesService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/files")
public class FilesServiceController {

    @DubboReference
    private FilesService filesService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public OpenAIFile createFile(
        @RequestParam(name = "_file") org.springframework.web.multipart.MultipartFile _file,
        @RequestParam(name = "purpose") String purpose
    ) {
        return filesService.createFile(_file, purpose);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{file_id}")
    public DeleteFileResponse deleteFile(
        @RequestParam(name = "fileId") String fileId
    ) {
        return filesService.deleteFile(fileId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{file_id}/content")
    public String downloadFile(
        @RequestParam(name = "fileId") String fileId
    ) {
        return filesService.downloadFile(fileId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ListFilesResponse listFiles(
        @RequestParam(name = "purpose") String purpose,
        @RequestParam(name = "limit", defaultValue = "10000") Integer limit,
        @RequestParam(name = "order", defaultValue = "desc") String order,
        @RequestParam(name = "after") String after
    ) {
        return filesService.listFiles(purpose, limit, order, after);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{file_id}")
    public OpenAIFile retrieveFile(
        @RequestParam(name = "fileId") String fileId
    ) {
        return filesService.retrieveFile(fileId);
    }
}
