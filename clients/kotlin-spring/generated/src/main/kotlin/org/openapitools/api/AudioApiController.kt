package org.openapitools.api

import org.openapitools.model.CreateTranscriptionRequestModel
import org.openapitools.model.CreateTranscriptionResponse
import org.openapitools.model.CreateTranslationResponse
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
@RequestMapping("\${api.base-path:/v1}")
class AudioApiController() {

    @Operation(
        summary = "Transcribes audio into the input language.",
        operationId = "createTranscription",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = CreateTranscriptionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/audio/transcriptions"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun createTranscription(@Parameter(description = "The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. ") @Valid @RequestPart("file", required = true) file: org.springframework.core.io.Resource,@Parameter(description = "", required = true) @RequestParam(value = "model", required = true) model: CreateTranscriptionRequestModel ,@Parameter(description = "An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. ") @RequestParam(value = "prompt", required = false) prompt: kotlin.String? ,@Parameter(description = "The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. ", schema = Schema(defaultValue = "json")) @RequestParam(value = "response_format", required = false) responseFormat: kotlin.String ,@Parameter(description = "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ", schema = Schema(defaultValue = "0")) @RequestParam(value = "temperature", required = false) temperature: java.math.BigDecimal ,@Parameter(description = "The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ") @RequestParam(value = "language", required = false) language: kotlin.String? ): ResponseEntity<CreateTranscriptionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Translates audio into English.",
        operationId = "createTranslation",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = CreateTranslationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/audio/translations"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun createTranslation(@Parameter(description = "The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. ") @Valid @RequestPart("file", required = true) file: org.springframework.core.io.Resource,@Parameter(description = "", required = true) @RequestParam(value = "model", required = true) model: CreateTranscriptionRequestModel ,@Parameter(description = "An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. ") @RequestParam(value = "prompt", required = false) prompt: kotlin.String? ,@Parameter(description = "The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. ", schema = Schema(defaultValue = "json")) @RequestParam(value = "response_format", required = false) responseFormat: kotlin.String ,@Parameter(description = "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ", schema = Schema(defaultValue = "0")) @RequestParam(value = "temperature", required = false) temperature: java.math.BigDecimal ): ResponseEntity<CreateTranslationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
