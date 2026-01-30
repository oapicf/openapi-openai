package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Configuration for input audio transcription, defaults to off and can be  set to &#x60;null&#x60; to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
 **/
@ApiModel(description = "Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. ")
@JsonTypeName("RealtimeSession_input_audio_transcription")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionInputAudioTranscription   {
  private String model;

  public RealtimeSessionInputAudioTranscription() {
  }

  /**
   * The model to use for transcription, &#x60;whisper-1&#x60; is the only currently  supported model. 
   **/
  public RealtimeSessionInputAudioTranscription model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "The model to use for transcription, `whisper-1` is the only currently  supported model. ")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  @JsonProperty("model")
  public void setModel(String model) {
    this.model = model;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeSessionInputAudioTranscription realtimeSessionInputAudioTranscription = (RealtimeSessionInputAudioTranscription) o;
    return Objects.equals(this.model, realtimeSessionInputAudioTranscription.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeSessionInputAudioTranscription {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

