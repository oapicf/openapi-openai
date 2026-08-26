package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.AudioResponseFormat
import org.openapitools.server.api.model.CreateSpeechRequest
import org.openapitools.server.api.model.CreateTranscription200Response
import org.openapitools.server.api.model.CreateTranscriptionRequestModel
import org.openapitools.server.api.model.CreateTranslation200Response

@MiskTest(startService = true)
internal class AudioApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var audioApi: AudioApiAction

    /**
     * To test AudioApiAction.createSpeech
     */
    @Test
    fun `should handle createSpeech`() {
        val createSpeechRequest = TODO()
        val response: java.io.File = audioApi.createSpeech(createSpeechRequest)
    }

    /**
     * To test AudioApiAction.createTranscription
     */
    @Test
    fun `should handle createTranscription`() {
        val file = TODO()
        val model = TODO()
        val language = TODO()
        val prompt = TODO()
        val responseFormat = TODO()
        val temperature = TODO()
        val timestampGranularities = TODO()
        val response: CreateTranscription200Response = audioApi.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities)
    }

    /**
     * To test AudioApiAction.createTranslation
     */
    @Test
    fun `should handle createTranslation`() {
        val file = TODO()
        val model = TODO()
        val prompt = TODO()
        val responseFormat = TODO()
        val temperature = TODO()
        val response: CreateTranslation200Response = audioApi.createTranslation(file, model, prompt, responseFormat, temperature)
    }
}
