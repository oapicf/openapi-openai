package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). ")
public class ChatCompletionRequestAssistantMessageAudio   {
  
  private String id;

  /**
   * Unique identifier for a previous audio response from the model. 
   **/
  public ChatCompletionRequestAssistantMessageAudio id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier for a previous audio response from the model. ")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

