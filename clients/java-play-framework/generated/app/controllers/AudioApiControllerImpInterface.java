package controllers;

import apimodels.AudioResponseFormat;
import java.math.BigDecimal;
import apimodels.CreateSpeechRequest;
import apimodels.CreateTranscription200Response;
import apimodels.CreateTranscriptionRequestModel;
import apimodels.CreateTranslation200Response;
import java.io.InputStream;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class AudioApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createSpeechHttp(Http.Request request, CreateSpeechRequest createSpeechRequest) throws Exception {
        InputStream obj = createSpeech(request, createSpeechRequest);

        return ok(obj);

    }

    public abstract InputStream createSpeech(Http.Request request, CreateSpeechRequest createSpeechRequest) throws Exception;

    public Result createTranscriptionHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String language, String prompt, AudioResponseFormat responseFormat, BigDecimal temperature, List<String> timestampGranularities) throws Exception {
        CreateTranscription200Response obj = createTranscription(request, _file, model, language, prompt, responseFormat, temperature, timestampGranularities);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateTranscription200Response createTranscription(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String language, String prompt, AudioResponseFormat responseFormat, BigDecimal temperature, List<String> timestampGranularities) throws Exception;

    public Result createTranslationHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String prompt, AudioResponseFormat responseFormat, BigDecimal temperature) throws Exception {
        CreateTranslation200Response obj = createTranslation(request, _file, model, prompt, responseFormat, temperature);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateTranslation200Response createTranslation(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String prompt, AudioResponseFormat responseFormat, BigDecimal temperature) throws Exception;

}
