package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Controls which conversation the response is added to. Currently supports &#x60;auto&#x60; and &#x60;none&#x60;, with &#x60;auto&#x60; as the default value. The &#x60;auto&#x60; value means that the contents of the response will be added to the default conversation. Set this to &#x60;none&#x60; to create an out-of-band response which  will not add items to default conversation. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Controls which conversation the response is added to. Currently supports `auto` and `none`, with `auto` as the default value. The `auto` value means that the contents of the response will be added to the default conversation. Set this to `none` to create an out-of-band response which  will not add items to default conversation. ")
public class RealtimeResponseCreateParamsConversation   {
  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseCreateParamsConversation realtimeResponseCreateParamsConversation = (RealtimeResponseCreateParamsConversation) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseCreateParamsConversation {\n");
    
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

