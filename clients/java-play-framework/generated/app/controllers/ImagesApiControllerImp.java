package controllers;

import apimodels.CreateImageEditRequestModel;
import apimodels.CreateImageRequest;
import apimodels.ImagesResponse;
import java.io.InputStream;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ImagesApiControllerImp extends ImagesApiControllerImpInterface {
    @Override
    public ImagesResponse createImage(Http.Request request, CreateImageRequest createImageRequest) throws Exception {
        //Do your magic!!!
        return new ImagesResponse();
    }

    @Override
    public ImagesResponse createImageEdit(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, String prompt, Http.MultipartFormData.FilePart<TemporaryFile> mask, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user) throws Exception {
        //Do your magic!!!
        return new ImagesResponse();
    }

    @Override
    public ImagesResponse createImageVariation(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user) throws Exception {
        //Do your magic!!!
        return new ImagesResponse();
    }

}
