package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CreateSpeechRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateSpeechRequest   {
  private CreateSpeechRequestModel model;
  private String input;
  public enum VoiceEnum {

    ALLOY(String.valueOf("alloy")), ECHO(String.valueOf("echo")), FABLE(String.valueOf("fable")), ONYX(String.valueOf("onyx")), NOVA(String.valueOf("nova")), SHIMMER(String.valueOf("shimmer"));


    private String value;

    VoiceEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static VoiceEnum fromString(String s) {
        for (VoiceEnum b : VoiceEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private VoiceEnum voice;
  public enum ResponseFormatEnum {

    MP3(String.valueOf("mp3")), OPUS(String.valueOf("opus")), AAC(String.valueOf("aac")), FLAC(String.valueOf("flac")), WAV(String.valueOf("wav")), PCM(String.valueOf("pcm"));


    private String value;

    ResponseFormatEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ResponseFormatEnum fromString(String s) {
        for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private ResponseFormatEnum responseFormat = ResponseFormatEnum.MP3;
  private BigDecimal speed = new BigDecimal("1");

  public CreateSpeechRequest() {
  }

  @JsonCreator
  public CreateSpeechRequest(
    @JsonProperty(required = true, value = "model") CreateSpeechRequestModel model,
    @JsonProperty(required = true, value = "input") String input,
    @JsonProperty(required = true, value = "voice") VoiceEnum voice
  ) {
    this.model = model;
    this.input = input;
    this.voice = voice;
  }

  /**
   **/
  public CreateSpeechRequest model(CreateSpeechRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "model")
  @NotNull @Valid public CreateSpeechRequestModel getModel() {
    return model;
  }

  @JsonProperty(required = true, value = "model")
  public void setModel(CreateSpeechRequestModel model) {
    this.model = model;
  }

  /**
   * The text to generate audio for. The maximum length is 4096 characters.
   **/
  public CreateSpeechRequest input(String input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The text to generate audio for. The maximum length is 4096 characters.")
  @JsonProperty(required = true, value = "input")
  @NotNull  @Size(max=4096)public String getInput() {
    return input;
  }

  @JsonProperty(required = true, value = "input")
  public void setInput(String input) {
    this.input = input;
  }

  /**
   * The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
   **/
  public CreateSpeechRequest voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).")
  @JsonProperty(required = true, value = "voice")
  @NotNull public VoiceEnum getVoice() {
    return voice;
  }

  @JsonProperty(required = true, value = "voice")
  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  /**
   * The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
   **/
  public CreateSpeechRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  
  @ApiModelProperty(value = "The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.")
  @JsonProperty("response_format")
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }

  @JsonProperty("response_format")
  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

  /**
   * The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.
   * minimum: 0.25
   * maximum: 4
   **/
  public CreateSpeechRequest speed(BigDecimal speed) {
    this.speed = speed;
    return this;
  }

  
  @ApiModelProperty(value = "The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.")
  @JsonProperty("speed")
  @Valid  @DecimalMin("0.25") @DecimalMax("4")public BigDecimal getSpeed() {
    return speed;
  }

  @JsonProperty("speed")
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

