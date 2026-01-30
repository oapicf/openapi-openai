package org.openapitools.controller;

import org.openapitools.model.AudioResponseFormat;
import java.math.BigDecimal;
import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for AudioController
 */
@MicronautTest
public class AudioControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    AudioController controller;

    /**
     * This test is used to validate the implementation of createSpeech() method
     *
     * The method should: Generates audio from the input text.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createSpeechMethodTest() {
        // given
        CreateSpeechRequest createSpeechRequest = new CreateSpeechRequest(null, "example", "example");

        // when
        CompletedFileUpload result = controller.createSpeech(createSpeechRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/audio/speech' to the features of createSpeech() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createSpeechClientApiTest() throws IOException {
        // given
        CreateSpeechRequest body = new CreateSpeechRequest(null, "example", "example");
        String uri = UriTemplate.of("/audio/speech").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@22a85176");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CompletedFileUpload.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createTranscription() method
     *
     * The method should: Transcribes audio into the input language.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createTranscriptionMethodTest() {
        // given
        CompletedFileUpload _file = null;
        CreateTranscriptionRequestModel model = new CreateTranscriptionRequestModel();
        String language = "example";
        String prompt = "example";
        AudioResponseFormat responseFormat = AudioResponseFormat.fromValue("json");
        BigDecimal temperature = new BigDecimal(78);
        List<String> timestampGranularities = Arrays.asList("example");

        // when
        CreateTranscription200Response result = controller.createTranscription(_file, model, language, prompt, responseFormat, temperature, timestampGranularities).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/audio/transcriptions' to the features of createTranscription() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createTranscriptionClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("file", new FileReader(File.createTempFile("test", ".tmp")));
            put("model", new CreateTranscriptionRequestModel());
            put("language", "example");
            put("prompt", "example");
            put("response_format", AudioResponseFormat.fromValue("json"));
            put("temperature", new BigDecimal(78));
            put("timestamp_granularities[]", Arrays.asList("example"));
        }};
        String uri = UriTemplate.of("/audio/transcriptions").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@55d8cb9");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateTranscription200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createTranslation() method
     *
     * The method should: Translates audio into English.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createTranslationMethodTest() {
        // given
        CompletedFileUpload _file = null;
        CreateTranscriptionRequestModel model = new CreateTranscriptionRequestModel();
        String prompt = "example";
        AudioResponseFormat responseFormat = AudioResponseFormat.fromValue("json");
        BigDecimal temperature = new BigDecimal(78);

        // when
        CreateTranslation200Response result = controller.createTranslation(_file, model, prompt, responseFormat, temperature).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/audio/translations' to the features of createTranslation() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createTranslationClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("file", new FileReader(File.createTempFile("test", ".tmp")));
            put("model", new CreateTranscriptionRequestModel());
            put("prompt", "example");
            put("response_format", AudioResponseFormat.fromValue("json"));
            put("temperature", new BigDecimal(78));
        }};
        String uri = UriTemplate.of("/audio/translations").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("[Ljava.lang.String;@4d4630e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateTranslation200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
