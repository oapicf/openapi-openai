package controllers;

import java.math.BigDecimal;
import apimodels.CreateSpeechRequest;
import apimodels.CreateTranscription200Response;
import apimodels.CreateTranscriptionRequestModel;
import apimodels.CreateTranslation200Response;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudioApiControllerImp extends AudioApiControllerImpInterface {
    @Override
    public InputStream createSpeech(Http.Request request, CreateSpeechRequest createSpeechRequest) throws Exception {
        //Do your magic!!!
        return new FileInputStream("replace this");
    }

    @Override
    public CreateTranscription200Response createTranscription(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String language, String prompt, String responseFormat, BigDecimal temperature, List<String> timestampGranularities) throws Exception {
        //Do your magic!!!
        return new CreateTranscription200Response();
    }

    @Override
    public CreateTranslation200Response createTranslation(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature) throws Exception {
        //Do your magic!!!
        return new CreateTranslation200Response();
    }

}
