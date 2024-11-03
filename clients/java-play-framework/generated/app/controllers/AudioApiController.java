package controllers;

import java.math.BigDecimal;
import apimodels.CreateSpeechRequest;
import apimodels.CreateTranscription200Response;
import apimodels.CreateTranscriptionRequestModel;
import apimodels.CreateTranslation200Response;
import java.io.InputStream;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AudioApiController extends Controller {
    private final AudioApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AudioApiController(Config configuration, AudioApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createSpeech(Http.Request request) throws Exception {
        JsonNode nodecreateSpeechRequest = request.body().asJson();
        CreateSpeechRequest createSpeechRequest;
        if (nodecreateSpeechRequest != null) {
            createSpeechRequest = mapper.readValue(nodecreateSpeechRequest.toString(), CreateSpeechRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createSpeechRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateSpeechRequest' parameter is required");
        }
        return imp.createSpeechHttp(request, createSpeechRequest);
    }

    @ApiAction
    public Result createTranscription(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> body_file = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> _file = body_file.getFile("file");
        if ((_file == null || _file.getFileSize() == 0)) {
            throw new IllegalArgumentException("'file' file cannot be empty");
        }
        String[] valuemodel = request.body().asMultipartFormData().asFormUrlEncoded().get("model");
        CreateTranscriptionRequestModel model;
        if (valuemodel != null) {
            model = valuemodel[0];
        } else {
            throw new IllegalArgumentException("'model' parameter is required");
        }
        String[] valuelanguage = request.body().asMultipartFormData().asFormUrlEncoded().get("language");
        String language;
        if (valuelanguage != null) {
            language = valuelanguage[0];
        } else {
            language = null;
        }
        String[] valueprompt = request.body().asMultipartFormData().asFormUrlEncoded().get("prompt");
        String prompt;
        if (valueprompt != null) {
            prompt = valueprompt[0];
        } else {
            prompt = null;
        }
        String[] valueresponseFormat = request.body().asMultipartFormData().asFormUrlEncoded().get("response_format");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat[0];
        } else {
            responseFormat = "json";
        }
        String[] valuetemperature = request.body().asMultipartFormData().asFormUrlEncoded().get("temperature");
        BigDecimal temperature;
        if (valuetemperature != null) {
            temperature = new BigDecimal(valuetemperature[0]);
        } else {
            temperature = 0;
        }
        String[] timestampGranularitiesArray = request.body().asMultipartFormData().asFormUrlEncoded().get("timestamp_granularities[]");
        List<String> timestampGranularitiesList = OpenAPIUtils.parametersToList("csv", timestampGranularitiesArray);
        List<String> timestampGranularities = new ArrayList<>();
        for (String curParam : timestampGranularitiesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                timestampGranularities.add(curParam);
            }
        }
        return imp.createTranscriptionHttp(request, _file, model, language, prompt, responseFormat, temperature, timestampGranularities);
    }

    @ApiAction
    public Result createTranslation(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> body_file = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> _file = body_file.getFile("file");
        if ((_file == null || _file.getFileSize() == 0)) {
            throw new IllegalArgumentException("'file' file cannot be empty");
        }
        String[] valuemodel = request.body().asMultipartFormData().asFormUrlEncoded().get("model");
        CreateTranscriptionRequestModel model;
        if (valuemodel != null) {
            model = valuemodel[0];
        } else {
            throw new IllegalArgumentException("'model' parameter is required");
        }
        String[] valueprompt = request.body().asMultipartFormData().asFormUrlEncoded().get("prompt");
        String prompt;
        if (valueprompt != null) {
            prompt = valueprompt[0];
        } else {
            prompt = null;
        }
        String[] valueresponseFormat = request.body().asMultipartFormData().asFormUrlEncoded().get("response_format");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat[0];
        } else {
            responseFormat = "json";
        }
        String[] valuetemperature = request.body().asMultipartFormData().asFormUrlEncoded().get("temperature");
        BigDecimal temperature;
        if (valuetemperature != null) {
            temperature = new BigDecimal(valuetemperature[0]);
        } else {
            temperature = 0;
        }
        return imp.createTranslationHttp(request, _file, model, prompt, responseFormat, temperature);
    }

}
