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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequestModel;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateSpeechRequest
 */
@JsonPropertyOrder({
  CreateSpeechRequest.JSON_PROPERTY_MODEL,
  CreateSpeechRequest.JSON_PROPERTY_INPUT,
  CreateSpeechRequest.JSON_PROPERTY_VOICE,
  CreateSpeechRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  CreateSpeechRequest.JSON_PROPERTY_SPEED
})
@JsonTypeName("CreateSpeechRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateSpeechRequest {
    public static final String JSON_PROPERTY_MODEL = "model";
    private CreateSpeechRequestModel model;

    public static final String JSON_PROPERTY_INPUT = "input";
    private String input;

    /**
     * The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
     */
    public enum VoiceEnum {
        ALLOY("alloy"),
        ECHO("echo"),
        FABLE("fable"),
        ONYX("onyx"),
        NOVA("nova"),
        SHIMMER("shimmer");

        private String value;

        VoiceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VoiceEnum fromValue(String value) {
            for (VoiceEnum b : VoiceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_VOICE = "voice";
    private VoiceEnum voice;

    /**
     * The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
     */
    public enum ResponseFormatEnum {
        MP3("mp3"),
        OPUS("opus"),
        AAC("aac"),
        FLAC("flac"),
        WAV("wav"),
        PCM("pcm");

        private String value;

        ResponseFormatEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResponseFormatEnum fromValue(String value) {
            for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
    private ResponseFormatEnum responseFormat = ResponseFormatEnum.MP3;

    public static final String JSON_PROPERTY_SPEED = "speed";
    private BigDecimal speed = new BigDecimal("1.0");

    public CreateSpeechRequest(CreateSpeechRequestModel model, String input, VoiceEnum voice) {
        this.model = model;
        this.input = input;
        this.voice = voice;
    }

    public CreateSpeechRequest model(CreateSpeechRequestModel model) {
        this.model = model;
        return this;
    }

    /**
     * Get model
     * @return model
     **/
    @Valid
    @NotNull
    @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateSpeechRequestModel getModel() {
        return model;
    }

    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setModel(CreateSpeechRequestModel model) {
        this.model = model;
    }

    public CreateSpeechRequest input(String input) {
        this.input = input;
        return this;
    }

    /**
     * The text to generate audio for. The maximum length is 4096 characters.
     * @return input
     **/
    @NotNull
    @Size(max=4096)
    @Schema(name = "input", description = "The text to generate audio for. The maximum length is 4096 characters.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getInput() {
        return input;
    }

    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setInput(String input) {
        this.input = input;
    }

    public CreateSpeechRequest voice(VoiceEnum voice) {
        this.voice = voice;
        return this;
    }

    /**
     * The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
     * @return voice
     **/
    @NotNull
    @Schema(name = "voice", description = "The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_VOICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public VoiceEnum getVoice() {
        return voice;
    }

    @JsonProperty(JSON_PROPERTY_VOICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVoice(VoiceEnum voice) {
        this.voice = voice;
    }

    public CreateSpeechRequest responseFormat(ResponseFormatEnum responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }

    /**
     * The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
     * @return responseFormat
     **/
    @Nullable
    @Schema(name = "response_format", description = "The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ResponseFormatEnum getResponseFormat() {
        return responseFormat;
    }

    @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResponseFormat(ResponseFormatEnum responseFormat) {
        this.responseFormat = responseFormat;
    }

    public CreateSpeechRequest speed(BigDecimal speed) {
        this.speed = speed;
        return this;
    }

    /**
     * The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.
     * minimum: 0.25
     * maximum: 4.0
     * @return speed
     **/
    @Nullable
    @DecimalMin("0.25")
    @DecimalMax("4.0")
    @Schema(name = "speed", description = "The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SPEED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getSpeed() {
        return speed;
    }

    @JsonProperty(JSON_PROPERTY_SPEED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSpeechRequest createSpeechRequest = (CreateSpeechRequest) o;
        return Objects.equals(this.model, createSpeechRequest.model) &&
            Objects.equals(this.input, createSpeechRequest.input) &&
            Objects.equals(this.voice, createSpeechRequest.voice) &&
            Objects.equals(this.responseFormat, createSpeechRequest.responseFormat) &&
            Objects.equals(this.speed, createSpeechRequest.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, input, voice, responseFormat, speed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSpeechRequest {\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
        sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

