package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateThreadRequestToolResources;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CreateThreadRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateThreadRequest   {
  private @Valid List<@Valid CreateMessageRequest> messages = new ArrayList<>();
  private CreateThreadRequestToolResources toolResources;
  private Object metadata;

  public CreateThreadRequest() {
  }

  /**
   * A list of [messages](/docs/api-reference/messages) to start the thread with.
   **/
  public CreateThreadRequest messages(List<@Valid CreateMessageRequest> messages) {
    this.messages = messages;
    return this;
  }

  
  @ApiModelProperty(value = "A list of [messages](/docs/api-reference/messages) to start the thread with.")
  @JsonProperty("messages")
  @Valid public List<@Valid CreateMessageRequest> getMessages() {
    return messages;
  }

  @JsonProperty("messages")
  public void setMessages(List<@Valid CreateMessageRequest> messages) {
    this.messages = messages;
  }

  public CreateThreadRequest addMessagesItem(CreateMessageRequest messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }

    this.messages.add(messagesItem);
    return this;
  }

  public CreateThreadRequest removeMessagesItem(CreateMessageRequest messagesItem) {
    if (messagesItem != null && this.messages != null) {
      this.messages.remove(messagesItem);
    }

    return this;
  }
  /**
   **/
  public CreateThreadRequest toolResources(CreateThreadRequestToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tool_resources")
  @Valid public CreateThreadRequestToolResources getToolResources() {
    return toolResources;
  }

  @JsonProperty("tool_resources")
  public void setToolResources(CreateThreadRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   **/
  public CreateThreadRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  @JsonProperty("metadata")
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateThreadRequest createThreadRequest = (CreateThreadRequest) o;
    return Objects.equals(this.messages, createThreadRequest.messages) &&
        Objects.equals(this.toolResources, createThreadRequest.toolResources) &&
        Objects.equals(this.metadata, createThreadRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, toolResources, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadRequest {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    toolResources: ").append(toIndentedString(toolResources)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

