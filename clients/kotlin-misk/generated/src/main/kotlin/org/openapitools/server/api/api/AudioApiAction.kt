package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.AudioResponseFormat
import org.openapitools.server.api.model.CreateSpeechRequest
import org.openapitools.server.api.model.CreateTranscription200Response
import org.openapitools.server.api.model.CreateTranscriptionRequestModel
import org.openapitools.server.api.model.CreateTranslation200Response

/**
* @TODO("Fill out implementation")
*/
@Singleton
class AudioApiAction @Inject constructor(
) : WebAction {

    @Post("/audio/speech")
    @Description("Generates audio from the input text.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_OCTETSTREAM /* @todo(unknown) -> application/octet-stream */ )
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createSpeech(
        @Valid @RequestBody createSpeechRequest: CreateSpeechRequest
    ): java.io.File {
        TODO()
    }

    @Post("/audio/transcriptions")
    @Description("Transcribes audio into the input language.")
    @RequestContentType(MediaTypes.FORM_DATA)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createTranscription(
        @Valid file: HttpCall, 
        @RequestPart(value = "model") model: CreateTranscriptionRequestModel , 
        @QueryParam(value = "language") language: kotlin.String? , 
        @QueryParam(value = "prompt") prompt: kotlin.String? , 
        @QueryParam(value = "response_format") responseFormat: AudioResponseFormat , 
        @QueryParam(value = "temperature") temperature: java.math.BigDecimal , 
        @QueryParam(value = "timestamp_granularities[]") timestampGranularities: kotlin.collections.List<kotlin.String>? 
    ): CreateTranscription200Response {
        TODO()
    }

    @Post("/audio/translations")
    @Description("Translates audio into English.")
    @RequestContentType(MediaTypes.FORM_DATA)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun createTranslation(
        @Valid file: HttpCall, 
        @RequestPart(value = "model") model: CreateTranscriptionRequestModel , 
        @QueryParam(value = "prompt") prompt: kotlin.String? , 
        @QueryParam(value = "response_format") responseFormat: AudioResponseFormat , 
        @QueryParam(value = "temperature") temperature: java.math.BigDecimal 
    ): CreateTranslation200Response {
        TODO()
    }
}
