package org.openapitools.api.consumer;

import org.openapitools.model.AudioResponseFormat;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.AudioService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/audio")
public class AudioServiceController {

    @DubboReference
    private AudioService audioService;

    @RequestMapping(method = RequestMethod.POST, value = "/speech")
    public org.springframework.web.multipart.MultipartFile createSpeech(
        @RequestParam(name = "createSpeechRequest") CreateSpeechRequest createSpeechRequest
    ) {
        return audioService.createSpeech(createSpeechRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/transcriptions")
    public CreateTranscription200Response createTranscription(
        @RequestParam(name = "_file") org.springframework.web.multipart.MultipartFile _file,
        @RequestParam(name = "model") CreateTranscriptionRequestModel model,
        @RequestParam(name = "language") String language,
        @RequestParam(name = "prompt") String prompt,
        @RequestParam(name = "responseFormat", defaultValue = "json") AudioResponseFormat responseFormat,
        @RequestParam(name = "temperature", defaultValue = "0") BigDecimal temperature,
        @RequestParam(name = "timestampGranularities") List<String> timestampGranularities
    ) {
        return audioService.createTranscription(_file, model, language, prompt, responseFormat, temperature, timestampGranularities);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/translations")
    public CreateTranslation200Response createTranslation(
        @RequestParam(name = "_file") org.springframework.web.multipart.MultipartFile _file,
        @RequestParam(name = "model") CreateTranscriptionRequestModel model,
        @RequestParam(name = "prompt") String prompt,
        @RequestParam(name = "responseFormat", defaultValue = "json") AudioResponseFormat responseFormat,
        @RequestParam(name = "temperature", defaultValue = "0") BigDecimal temperature
    ) {
        return audioService.createTranslation(_file, model, prompt, responseFormat, temperature);
    }
}
