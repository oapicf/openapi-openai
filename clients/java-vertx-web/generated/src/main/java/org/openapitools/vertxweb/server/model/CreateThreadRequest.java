package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateMessageRequest;
import org.openapitools.vertxweb.server.model.CreateThreadRequestToolResources;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateThreadRequest   {
  
  private List<CreateMessageRequest> messages = new ArrayList<>();
  private CreateThreadRequestToolResources toolResources;
  private Object metadata;

  public CreateThreadRequest () {

  }

  public CreateThreadRequest (List<CreateMessageRequest> messages, CreateThreadRequestToolResources toolResources, Object metadata) {
    this.messages = messages;
    this.toolResources = toolResources;
    this.metadata = metadata;
  }

    
  @JsonProperty("messages")
  public List<CreateMessageRequest> getMessages() {
    return messages;
  }
  public void setMessages(List<CreateMessageRequest> messages) {
    this.messages = messages;
  }

    
  @JsonProperty("tool_resources")
  public CreateThreadRequestToolResources getToolResources() {
    return toolResources;
  }
  public void setToolResources(CreateThreadRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

    
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
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
    return Objects.equals(messages, createThreadRequest.messages) &&
        Objects.equals(toolResources, createThreadRequest.toolResources) &&
        Objects.equals(metadata, createThreadRequest.metadata);
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
