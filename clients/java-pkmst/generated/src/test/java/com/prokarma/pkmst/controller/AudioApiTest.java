/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.math.BigDecimal;
import com.prokarma.pkmst.model.CreateSpeechRequest;
import com.prokarma.pkmst.model.CreateTranscription200Response;
import com.prokarma.pkmst.model.CreateTranscriptionRequestModel;
import com.prokarma.pkmst.model.CreateTranslation200Response;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for AudioApi
 */
@Ignore
public class AudioApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final AudioApi api = new AudioApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Generates audio from the input text.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createSpeechTest() throws Exception {
        CreateSpeechRequest createSpeechRequest = null;
    ResponseEntity<File> response = api.createSpeech(createSpeechRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Transcribes audio into the input language.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTranscriptionTest() throws Exception {
        MultipartFile _file = null;
        CreateTranscriptionRequestModel model = null;
        String language = null;
        String prompt = null;
        String responseFormat = null;
        BigDecimal temperature = null;
        List<String> timestampGranularities = null;
    ResponseEntity<CreateTranscription200Response> response = api.createTranscription(_file, model, language, prompt, responseFormat, temperature, timestampGranularities , accept);

        // TODO: test validations
    }
    
    /**
     * Translates audio into English.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTranslationTest() throws Exception {
        MultipartFile _file = null;
        CreateTranscriptionRequestModel model = null;
        String prompt = null;
        String responseFormat = null;
        BigDecimal temperature = null;
    ResponseEntity<CreateTranslation200Response> response = api.createTranslation(_file, model, prompt, responseFormat, temperature , accept);

        // TODO: test validations
    }
    
}
