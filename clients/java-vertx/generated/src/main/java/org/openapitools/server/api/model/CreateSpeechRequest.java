package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.api.model.CreateSpeechRequestModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSpeechRequest   {
  
  private CreateSpeechRequestModel model;
  private String input;


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
      return value;
    }
  }

  private VoiceEnum voice;


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
      return value;
    }
  }

  private ResponseFormatEnum responseFormat = ResponseFormatEnum.MP3;
  private BigDecimal speed = new BigDecimal("1.0");

  public CreateSpeechRequest () {

  }

  public CreateSpeechRequest (CreateSpeechRequestModel model, String input, VoiceEnum voice, ResponseFormatEnum responseFormat, BigDecimal speed) {
    this.model = model;
    this.input = input;
    this.voice = voice;
    this.responseFormat = responseFormat;
    this.speed = speed;
  }

    
  @JsonProperty("model")
  public CreateSpeechRequestModel getModel() {
    return model;
  }
  public void setModel(CreateSpeechRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("input")
  public String getInput() {
    return input;
  }
  public void setInput(String input) {
    this.input = input;
  }

    
  @JsonProperty("voice")
  public VoiceEnum getVoice() {
    return voice;
  }
  public void setVoice(VoiceEnum voice) {
    this.voice = voice;
  }

    
  @JsonProperty("response_format")
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }
  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

    
  @JsonProperty("speed")
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
    return Objects.equals(model, createSpeechRequest.model) &&
        Objects.equals(input, createSpeechRequest.input) &&
        Objects.equals(voice, createSpeechRequest.voice) &&
        Objects.equals(responseFormat, createSpeechRequest.responseFormat) &&
        Objects.equals(speed, createSpeechRequest.speed);
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
