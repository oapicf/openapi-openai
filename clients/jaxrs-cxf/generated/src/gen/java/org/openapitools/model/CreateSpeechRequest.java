package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateSpeechRequest  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private CreateSpeechRequestModel model;

 /**
  * The text to generate audio for. The maximum length is 4096 characters.
  */
  @ApiModelProperty(required = true, value = "The text to generate audio for. The maximum length is 4096 characters.")

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

 /**
  * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
  */
  @ApiModelProperty(required = true, value = "The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).")

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

 /**
  * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  */
  @ApiModelProperty(value = "The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.")

  private ResponseFormatEnum responseFormat = ResponseFormatEnum.MP3;

 /**
  * The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
  */
  @ApiModelProperty(value = "The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.")

  @Valid

  private BigDecimal speed = new BigDecimal("1");
 /**
   * Get model
   * @return model
  **/
  @JsonProperty("model")
  @NotNull
  public CreateSpeechRequestModel getModel() {
    return model;
  }

  public void setModel(CreateSpeechRequestModel model) {
    this.model = model;
  }

  public CreateSpeechRequest model(CreateSpeechRequestModel model) {
    this.model = model;
    return this;
  }

 /**
   * The text to generate audio for. The maximum length is 4096 characters.
   * @return input
  **/
  @JsonProperty("input")
  @NotNull
 @Size(max=4096)  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public CreateSpeechRequest input(String input) {
    this.input = input;
    return this;
  }

 /**
   * The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
   * @return voice
  **/
  @JsonProperty("voice")
  @NotNull
  public String getVoice() {
    if (voice == null) {
      return null;
    }
    return voice.value();
  }

  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  public CreateSpeechRequest voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

 /**
   * The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
   * @return responseFormat
  **/
  @JsonProperty("response_format")
  public String getResponseFormat() {
    if (responseFormat == null) {
      return null;
    }
    return responseFormat.value();
  }

  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

  public CreateSpeechRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

 /**
   * The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.
   * minimum: 0.25
   * maximum: 4
   * @return speed
  **/
  @JsonProperty("speed")
 @DecimalMin("0.25") @DecimalMax("4")  public BigDecimal getSpeed() {
    return speed;
  }

  public void setSpeed(BigDecimal speed) {
    this.speed = speed;
  }

  public CreateSpeechRequest speed(BigDecimal speed) {
    this.speed = speed;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

