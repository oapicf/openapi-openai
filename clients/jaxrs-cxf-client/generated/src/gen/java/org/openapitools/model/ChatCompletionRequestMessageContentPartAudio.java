package org.openapitools.model;

import org.openapitools.model.ChatCompletionRequestMessageContentPartAudioInputAudio;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Learn about [audio inputs](/docs/guides/audio). 
 */
@ApiModel(description="Learn about [audio inputs](/docs/guides/audio). ")

public class ChatCompletionRequestMessageContentPartAudio  {
  
public enum TypeEnum {

INPUT_AUDIO(String.valueOf("input_audio"));


    private String value;

    TypeEnum (String v) {
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

 /**
  * The type of the content part. Always `input_audio`.
  */
  @ApiModelProperty(required = true, value = "The type of the content part. Always `input_audio`.")

  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")

  private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;
 /**
   * The type of the content part. Always &#x60;input_audio&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChatCompletionRequestMessageContentPartAudio type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get inputAudio
   * @return inputAudio
  **/
  @JsonProperty("input_audio")
  public ChatCompletionRequestMessageContentPartAudioInputAudio getInputAudio() {
    return inputAudio;
  }

  public void setInputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
  }

  public ChatCompletionRequestMessageContentPartAudio inputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.inputAudio = inputAudio;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

