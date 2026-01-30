package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
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

