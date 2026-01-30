package org.openapitools.api

import org.openapitools.model.AudioResponseFormat
import org.openapitools.model.CreateSpeechRequest
import org.openapitools.model.CreateTranscription200Response
import org.openapitools.model.CreateTranscriptionRequestModel
import org.openapitools.model.CreateTranslation200Response
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired
import org.openapitools.api.AudioApiController.Companion.BASE_PATH

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${openapi.openAI.base-path:\${api.base-path:$BASE_PATH}}")
class AudioApiController() {

    @Operation(
        summary = "Generates audio from the input text.",
        operationId = "createSpeech",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = org.springframework.core.io.Resource::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_SPEECH /* "/audio/speech" */],
        produces = ["application/octet-stream"],
        consumes = ["application/json"]
    )
    fun createSpeech(
        @Parameter(description = "", required = true) @Valid @RequestBody createSpeechRequest: CreateSpeechRequest
    ): ResponseEntity<org.springframework.core.io.Resource> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Transcribes audio into the input language.",
        operationId = "createTranscription",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = CreateTranscription200Response::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_TRANSCRIPTION /* "/audio/transcriptions" */],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun createTranscription(
        @Parameter(description = "The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ") @Valid @RequestPart("file", required = true) file: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "", required = true) @Valid @RequestPart(value = "model", required = true) model: CreateTranscriptionRequestModel,
        @Parameter(description = "The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ") @Valid @RequestParam(value = "language", required = false) language: kotlin.String?,
        @Parameter(description = "An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. ") @Valid @RequestParam(value = "prompt", required = false) prompt: kotlin.String?,
        @Parameter(description = "", schema = Schema(allowableValues = ["json", "text", "srt", "verbose_json", "vtt"], defaultValue = "json")) @Valid @RequestParam(value = "response_format", required = false) responseFormat: AudioResponseFormat,
        @Parameter(description = "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "temperature", required = false) temperature: java.math.BigDecimal,
        @Parameter(description = "The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. ", schema = Schema(allowableValues = ["word", "segment"])) @Valid @RequestParam(value = "timestamp_granularities[]", required = false) timestampGranularities: kotlin.collections.List<kotlin.String>?
    ): ResponseEntity<CreateTranscription200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Translates audio into English.",
        operationId = "createTranslation",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = CreateTranslation200Response::class))]) ],
        security = [ SecurityRequirement(name = "ApiKeyAuth") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = [PATH_CREATE_TRANSLATION /* "/audio/translations" */],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun createTranslation(
        @Parameter(description = "The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ") @Valid @RequestPart("file", required = true) file: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "", required = true) @Valid @RequestPart(value = "model", required = true) model: CreateTranscriptionRequestModel,
        @Parameter(description = "An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. ") @Valid @RequestParam(value = "prompt", required = false) prompt: kotlin.String?,
        @Parameter(description = "", schema = Schema(allowableValues = ["json", "text", "srt", "verbose_json", "vtt"], defaultValue = "json")) @Valid @RequestParam(value = "response_format", required = false) responseFormat: AudioResponseFormat,
        @Parameter(description = "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "temperature", required = false) temperature: java.math.BigDecimal
    ): ResponseEntity<CreateTranslation200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/v1"
        const val PATH_CREATE_SPEECH: String = "/audio/speech"
        const val PATH_CREATE_TRANSCRIPTION: String = "/audio/transcriptions"
        const val PATH_CREATE_TRANSLATION: String = "/audio/translations"
    }
}
