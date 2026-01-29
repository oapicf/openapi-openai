package org.openapitools.api

import org.openapitools.model.CreateSpeechRequest
import org.openapitools.model.CreateTranscription200Response
import org.openapitools.model.CreateTranscriptionRequestModel
import org.openapitools.model.CreateTranslation200Response
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class AudioApiTest {

    private val api: AudioApiController = AudioApiController()

    /**
     * To test AudioApiController.createSpeech
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createSpeechTest() {
        val createSpeechRequest: CreateSpeechRequest = TODO()
        
        val response: ResponseEntity<org.springframework.core.io.Resource> = api.createSpeech(createSpeechRequest)

        // TODO: test validations
    }

    /**
     * To test AudioApiController.createTranscription
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createTranscriptionTest() {
        val file: org.springframework.web.multipart.MultipartFile = TODO()
        val model: CreateTranscriptionRequestModel = TODO()
        val language: kotlin.String? = TODO()
        val prompt: kotlin.String? = TODO()
        val responseFormat: kotlin.String = TODO()
        val temperature: java.math.BigDecimal = TODO()
        val timestampGranularities: kotlin.collections.List<kotlin.String>? = TODO()
        
        val response: ResponseEntity<CreateTranscription200Response> = api.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities)

        // TODO: test validations
    }

    /**
     * To test AudioApiController.createTranslation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createTranslationTest() {
        val file: org.springframework.web.multipart.MultipartFile = TODO()
        val model: CreateTranscriptionRequestModel = TODO()
        val prompt: kotlin.String? = TODO()
        val responseFormat: kotlin.String = TODO()
        val temperature: java.math.BigDecimal = TODO()
        
        val response: ResponseEntity<CreateTranslation200Response> = api.createTranslation(file, model, prompt, responseFormat, temperature)

        // TODO: test validations
    }
}
