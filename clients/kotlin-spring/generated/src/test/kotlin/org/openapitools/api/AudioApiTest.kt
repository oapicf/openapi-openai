package org.openapitools.api

import org.openapitools.model.CreateTranscriptionRequestModel
import org.openapitools.model.CreateTranscriptionResponse
import org.openapitools.model.CreateTranslationResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class AudioApiTest {

    private val api: AudioApiController = AudioApiController()

    /**
     * To test AudioApiController.createTranscription
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createTranscriptionTest() {
        val file: org.springframework.core.io.Resource = TODO()
        val model: CreateTranscriptionRequestModel = TODO()
        val prompt: kotlin.String? = TODO()
        val responseFormat: kotlin.String = TODO()
        val temperature: java.math.BigDecimal = TODO()
        val language: kotlin.String? = TODO()
        val response: ResponseEntity<CreateTranscriptionResponse> = api.createTranscription(file, model, prompt, responseFormat, temperature, language)

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
        val file: org.springframework.core.io.Resource = TODO()
        val model: CreateTranscriptionRequestModel = TODO()
        val prompt: kotlin.String? = TODO()
        val responseFormat: kotlin.String = TODO()
        val temperature: java.math.BigDecimal = TODO()
        val response: ResponseEntity<CreateTranslationResponse> = api.createTranslation(file, model, prompt, responseFormat, temperature)

        // TODO: test validations
    }
}
