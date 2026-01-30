package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CreateSpeechRequest   {
  
  private CreateSpeechRequestModel model;

  private String input;


public enum VoiceEnum {

    @JsonProperty("alloy") ALLOY(String.valueOf("alloy")), @JsonProperty("echo") ECHO(String.valueOf("echo")), @JsonProperty("fable") FABLE(String.valueOf("fable")), @JsonProperty("onyx") ONYX(String.valueOf("onyx")), @JsonProperty("nova") NOVA(String.valueOf("nova")), @JsonProperty("shimmer") SHIMMER(String.valueOf("shimmer"));


    private String value;

    VoiceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

    @JsonProperty("mp3") MP3(String.valueOf("mp3")), @JsonProperty("opus") OPUS(String.valueOf("opus")), @JsonProperty("aac") AAC(String.valueOf("aac")), @JsonProperty("flac") FLAC(String.valueOf("flac")), @JsonProperty("wav") WAV(String.valueOf("wav")), @JsonProperty("pcm") PCM(String.valueOf("pcm"));


    private String value;

    ResponseFormatEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

  /**
   **/
  public CreateSpeechRequest model(CreateSpeechRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  @NotNull
  public CreateSpeechRequestModel getModel() {
    return model;
  }
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
  @JsonProperty("input")
  @NotNull
 @Size(max=4096)  public String getInput() {
    return input;
  }
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
  @JsonProperty("voice")
  @NotNull
  public VoiceEnum getVoice() {
    return voice;
  }
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
 @DecimalMin("0.25") @DecimalMax("4")  public BigDecimal getSpeed() {
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

