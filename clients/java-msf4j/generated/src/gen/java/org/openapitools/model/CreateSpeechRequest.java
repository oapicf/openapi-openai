package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequestModel;

/**
 * CreateSpeechRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T10:44:59.856749186Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateSpeechRequest   {
  @JsonProperty("model")
  private CreateSpeechRequestModel model;

  @JsonProperty("input")
  private String input;

  /**
   * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VoiceEnum fromValue(String text) {
      for (VoiceEnum b : VoiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("voice")
  private VoiceEnum voice;

  /**
   * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResponseFormatEnum fromValue(String text) {
      for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("response_format")
  private ResponseFormatEnum responseFormat = ResponseFormatEnum.MP3;

  @JsonProperty("speed")
  private BigDecimal speed = new BigDecimal("1.0");

  public CreateSpeechRequest model(CreateSpeechRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(required = true, value = "")
  public CreateSpeechRequestModel getModel() {
    return model;
  }

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
  @ApiModelProperty(required = true, value = "The text to generate audio for. The maximum length is 4096 characters.")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public CreateSpeechRequest voice(VoiceEnum voice) {
    this.voice = voice;
    return this;
  }

   /**
   * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
   * @return voice
  **/
  @ApiModelProperty(required = true, value = "The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).")
  public VoiceEnum getVoice() {
    return voice;
  }

  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

  public CreateSpeechRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
   * @return responseFormat
  **/
  @ApiModelProperty(value = "The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.")
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

  public CreateSpeechRequest speed(BigDecimal speed) {
    this.speed = speed;
    return this;
  }

   /**
   * The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
   * minimum: 0.25
   * maximum: 4.0
   * @return speed
  **/
  @ApiModelProperty(value = "The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.")
  public BigDecimal getSpeed() {
    return speed;
  }

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

