package controllers;

import apimodels.CompleteUploadRequest;
import apimodels.CreateUploadRequest;
import java.io.InputStream;
import apimodels.Upload;
import apimodels.UploadPart;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UploadsApiControllerImp extends UploadsApiControllerImpInterface {
    @Override
    public UploadPart addUploadPart(Http.Request request, String uploadId, Http.MultipartFormData.FilePart<TemporaryFile> data) throws Exception {
        //Do your magic!!!
        return new UploadPart();
    }

    @Override
    public Upload cancelUpload(Http.Request request, String uploadId) throws Exception {
        //Do your magic!!!
        return new Upload();
    }

    @Override
    public Upload completeUpload(Http.Request request, String uploadId, CompleteUploadRequest completeUploadRequest) throws Exception {
        //Do your magic!!!
        return new Upload();
    }

    @Override
    public Upload createUpload(Http.Request request, CreateUploadRequest createUploadRequest) throws Exception {
        //Do your magic!!!
        return new Upload();
    }

}
