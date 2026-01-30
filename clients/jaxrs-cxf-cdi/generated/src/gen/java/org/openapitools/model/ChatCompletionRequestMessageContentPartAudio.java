package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestMessageContentPartAudioInputAudio;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Learn about [audio inputs](/docs/guides/audio). 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Learn about [audio inputs](/docs/guides/audio). ")
public class ChatCompletionRequestMessageContentPartAudio   {
  

public enum TypeEnum {

    @JsonProperty("input_audio") INPUT_AUDIO(String.valueOf("input_audio"));


    private String value;

    TypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private TypeEnum type;

  private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

  /**
   * The type of the content part. Always &#x60;input_audio&#x60;.
   **/
  public ChatCompletionRequestMessageContentPartAudio type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of the content part. Always `input_audio`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public ChatCompletionRequestMessageContentPartAudio inputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("input_audio")
  @NotNull
  public ChatCompletionRequestMessageContentPartAudioInputAudio getInputAudio() {
    return inputAudio;
  }
  public void setInputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestMessageContentPartAudio chatCompletionRequestMessageContentPartAudio = (ChatCompletionRequestMessageContentPartAudio) o;
    return Objects.equals(this.type, chatCompletionRequestMessageContentPartAudio.type) &&
        Objects.equals(this.inputAudio, chatCompletionRequestMessageContentPartAudio.inputAudio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inputAudio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageContentPartAudio {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inputAudio: ").append(toIndentedString(inputAudio)).append("\n");
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

