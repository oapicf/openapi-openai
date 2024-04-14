/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class AudioApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        POST /audio/speech : Generates audio from the input text.
        **/
        rest()
            .securityDefinitions()
                .bearerToken("ApiKeyAuth").end()
            .post("/audio/speech")
                .description("Generates audio from the input text.")
                .id("createSpeechApi")
                .clientRequestValidation(false)
                .bindingMode(RestBindingMode.off)
                .produces("application/octet-stream")
                .outType(org.springframework.core.io.Resource.class)
                .consumes("application/json")
                .type(CreateSpeechRequest.class)
                
                .param()
                    .name("createSpeechRequest")
                    .type(RestParamType.body)
                    .required(true)
                .endParam()
                .to("direct:createSpeech");
        

        /**
        POST /audio/transcriptions : Transcribes audio into the input language.
        **/
        rest()
            .securityDefinitions()
                .bearerToken("ApiKeyAuth").end()
            .post("/audio/transcriptions")
                .description("Transcribes audio into the input language.")
                .id("createTranscriptionApi")
                .clientRequestValidation(false)
                .bindingMode(RestBindingMode.off)
                .produces("application/json")
                .outType(CreateTranscription200Response.class)
                .consumes("multipart/form-data")
                
                .param()
                    .name("file")
                    .type(RestParamType.formData)
                    .required(true)
                    .description("The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ")
                .endParam()
                .param()
                    .name("model")
                    .type(RestParamType.formData)
                    .required(true)
                .endParam()
                .param()
                    .name("language")
                    .type(RestParamType.formData)
                    .required(false)
                    .description("The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ")
                .endParam()
                .param()
                    .name("prompt")
                    .type(RestParamType.formData)
                    .required(false)
                    .description("An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. ")
                .endParam()
                .param()
                    .name("responseFormat")
                    .type(RestParamType.formData)
                    .required(false)
                    .description("The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. ")
                .endParam()
                .param()
                    .name("temperature")
                    .type(RestParamType.formData)
                    .required(false)
                    .description("The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ")
                .endParam()
                .param()
                    .name("timestampGranularities")
                    .type(RestParamType.formData)
                    .required(false)
                    .description("The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. ")
                .endParam()
                .to("direct:createTranscription");
        

        /**
        POST /audio/translations : Translates audio into English.
        **/
        rest()
            .securityDefinitions()
                .bearerToken("ApiKeyAuth").end()
            .post("/audio/translations")
                .description("Translates audio into English.")
                .id("createTranslationApi")
                .clientRequestValidation(false)
                .bindingMode(RestBindingMode.off)
                .produces("application/json")
                .outType(CreateTranslation200Response.class)
                .consumes("multipart/form-data")
                
                .param()
                    .name("file")
                    .type(RestParamType.formData)
                    .required(true)
                    .description("The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ")
                .endParam()
                .param()
                    .name("model")
                    .type(RestParamType.formData)
                    .required(true)
                .endParam()
                .param()
                    .name("prompt")
                    .type(RestParamType.formData)
                    .required(false)
                    .description("An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. ")
                .endParam()
                .param()
                    .name("responseFormat")
                    .type(RestParamType.formData)
                    .required(false)
                    .description("The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. ")
                .endParam()
                .param()
                    .name("temperature")
                    .type(RestParamType.formData)
                    .required(false)
                    .description("The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ")
                .endParam()
                .to("direct:createTranslation");
        
    }
}
