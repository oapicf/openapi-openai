package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateThreadRequestToolResources;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateThreadRequest  {
  
 /**
  * A list of [messages](/docs/api-reference/messages) to start the thread with.
  */
  @ApiModelProperty(value = "A list of [messages](/docs/api-reference/messages) to start the thread with.")
  @Valid
  private List<@Valid CreateMessageRequest> messages = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private CreateThreadRequestToolResources toolResources;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  private Object metadata;
 /**
  * A list of [messages](/docs/api-reference/messages) to start the thread with.
  * @return messages
  */
  @JsonProperty("messages")
  public List<@Valid CreateMessageRequest> getMessages() {
    return messages;
  }

  /**
   * Sets the <code>messages</code> property.
   */
 public void setMessages(List<@Valid CreateMessageRequest> messages) {
    this.messages = messages;
  }

  /**
   * Sets the <code>messages</code> property.
   */
  public CreateThreadRequest messages(List<@Valid CreateMessageRequest> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Adds a new item to the <code>messages</code> list.
   */
  public CreateThreadRequest addMessagesItem(CreateMessageRequest messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

 /**
  * Get toolResources
  * @return toolResources
  */
  @JsonProperty("tool_resources")
  public CreateThreadRequestToolResources getToolResources() {
    return toolResources;
  }

  /**
   * Sets the <code>toolResources</code> property.
   */
 public void setToolResources(CreateThreadRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

  /**
   * Sets the <code>toolResources</code> property.
   */
  public CreateThreadRequest toolResources(CreateThreadRequestToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  * @return metadata
  */
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
 public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
  public CreateThreadRequest metadata(Object metadata) {
    this.metadata = metadata;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

