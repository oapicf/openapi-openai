package org.openapitools.api.interfaces;

import org.openapitools.model.AudioResponseFormat;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface AudioService {

    /**
     * Generates audio from the input text.
     * 
     *
     * @param createSpeechRequest  (required)
     * @return org.springframework.web.multipart.MultipartFile
     */
    org.springframework.web.multipart.MultipartFile createSpeech(
        CreateSpeechRequest createSpeechRequest
    );

    /**
     * Transcribes audio into the input language.
     * 
     *
     * @param _file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  (required)
     * @param model  (required)
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  (optional)
     * @param responseFormat  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param timestampGranularities The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)
     * @return CreateTranscription200Response
     */
    CreateTranscription200Response createTranscription(
        org.springframework.web.multipart.MultipartFile _file,
        CreateTranscriptionRequestModel model,
        String language,
        String prompt,
        AudioResponseFormat responseFormat,
        BigDecimal temperature,
        List<String> timestampGranularities
    );

    /**
     * Translates audio into English.
     * 
     *
     * @param _file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  (required)
     * @param model  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  (optional)
     * @param responseFormat  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @return CreateTranslation200Response
     */
    CreateTranslation200Response createTranslation(
        org.springframework.web.multipart.MultipartFile _file,
        CreateTranscriptionRequestModel model,
        String prompt,
        AudioResponseFormat responseFormat,
        BigDecimal temperature
    );
}
