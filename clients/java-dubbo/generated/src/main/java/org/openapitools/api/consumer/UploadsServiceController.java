package org.openapitools.api.consumer;

import org.openapitools.model.CompleteUploadRequest;
import org.openapitools.model.CreateUploadRequest;
import org.openapitools.model.Upload;
import org.openapitools.model.UploadPart;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.UploadsService;
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
@RequestMapping("/uploads")
public class UploadsServiceController {

    @DubboReference
    private UploadsService uploadsService;

    @RequestMapping(method = RequestMethod.POST, value = "/{upload_id}/parts")
    public UploadPart addUploadPart(
        @RequestParam(name = "uploadId") String uploadId,
        @RequestParam(name = "data") org.springframework.web.multipart.MultipartFile data
    ) {
        return uploadsService.addUploadPart(uploadId, data);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{upload_id}/cancel")
    public Upload cancelUpload(
        @RequestParam(name = "uploadId") String uploadId
    ) {
        return uploadsService.cancelUpload(uploadId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{upload_id}/complete")
    public Upload completeUpload(
        @RequestParam(name = "uploadId") String uploadId,
        @RequestParam(name = "completeUploadRequest") CompleteUploadRequest completeUploadRequest
    ) {
        return uploadsService.completeUpload(uploadId, completeUploadRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public Upload createUpload(
        @RequestParam(name = "createUploadRequest") CreateUploadRequest createUploadRequest
    ) {
        return uploadsService.createUpload(createUploadRequest);
    }
}
