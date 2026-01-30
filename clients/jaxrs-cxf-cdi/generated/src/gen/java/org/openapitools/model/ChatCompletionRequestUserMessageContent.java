package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import java.util.List;
import org.openapitools.model.ChatCompletionRequestUserMessageContentPart;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The contents of the user message. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The contents of the user message. ")
public class ChatCompletionRequestUserMessageContent   {
  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestUserMessageContent chatCompletionRequestUserMessageContent = (ChatCompletionRequestUserMessageContent) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestUserMessageContent {\n");
    
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

