package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 */
@ApiModel(description="Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). ")

public class ChatCompletionRequestAssistantMessageAudio  {
  
 /**
  * Unique identifier for a previous audio response from the model. 
  */
  @ApiModelProperty(required = true, value = "Unique identifier for a previous audio response from the model. ")

  private String id;
 /**
   * Unique identifier for a previous audio response from the model. 
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChatCompletionRequestAssistantMessageAudio id(String id) {
    this.id = id;
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
    ChatCompletionRequestAssistantMessageAudio chatCompletionRequestAssistantMessageAudio = (ChatCompletionRequestAssistantMessageAudio) o;
    return Objects.equals(this.id, chatCompletionRequestAssistantMessageAudio.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestAssistantMessageAudio {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

