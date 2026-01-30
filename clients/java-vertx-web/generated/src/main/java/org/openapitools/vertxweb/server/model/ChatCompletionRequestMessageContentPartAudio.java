package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessageContentPartAudioInputAudio;

/**
 * Learn about [audio inputs](/docs/guides/audio). 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionRequestMessageContentPartAudio   {
  


  public enum TypeEnum {
    INPUT_AUDIO("input_audio");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

  public ChatCompletionRequestMessageContentPartAudio () {

  }

  public ChatCompletionRequestMessageContentPartAudio (TypeEnum type, ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
    this.type = type;
    this.inputAudio = inputAudio;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("input_audio")
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
    return Objects.equals(type, chatCompletionRequestMessageContentPartAudio.type) &&
        Objects.equals(inputAudio, chatCompletionRequestMessageContentPartAudio.inputAudio);
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
