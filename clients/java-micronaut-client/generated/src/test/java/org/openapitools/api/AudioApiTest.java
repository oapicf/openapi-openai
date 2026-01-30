package org.openapitools.api;

import org.openapitools.model.AudioResponseFormat;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import java.io.File;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for AudioApi
 */
@MicronautTest
public class AudioApiTest {

    @Inject
    AudioApi api;

    
    /**
     * Generates audio from the input text.
     */
    @Test
    @Disabled("Not Implemented")
    public void createSpeechTest() {
        // given
        CreateSpeechRequest createSpeechRequest = new CreateSpeechRequest(null, "example", "example");

        // when
        File body = api.createSpeech(createSpeechRequest).block();

        // then
        // TODO implement the createSpeechTest()
    }

    
    /**
     * Transcribes audio into the input language.
     */
    @Test
    @Disabled("Not Implemented")
    public void createTranscriptionTest() {
        // given
        File _file = null;
        CreateTranscriptionRequestModel model = new CreateTranscriptionRequestModel();
        String language = "example";
        String prompt = "example";
        AudioResponseFormat responseFormat = AudioResponseFormat.fromValue("json");
        BigDecimal temperature = new BigDecimal(78);
        List<String> timestampGranularities = Arrays.asList("example");

        // when
        CreateTranscription200Response body = api.createTranscription(_file, model, language, prompt, responseFormat, temperature, timestampGranularities).block();

        // then
        // TODO implement the createTranscriptionTest()
    }

    
    /**
     * Translates audio into English.
     */
    @Test
    @Disabled("Not Implemented")
    public void createTranslationTest() {
        // given
        File _file = null;
        CreateTranscriptionRequestModel model = new CreateTranscriptionRequestModel();
        String prompt = "example";
        AudioResponseFormat responseFormat = AudioResponseFormat.fromValue("json");
        BigDecimal temperature = new BigDecimal(78);

        // when
        CreateTranslation200Response body = api.createTranslation(_file, model, prompt, responseFormat, temperature).block();

        // then
        // TODO implement the createTranslationTest()
    }

    
}
