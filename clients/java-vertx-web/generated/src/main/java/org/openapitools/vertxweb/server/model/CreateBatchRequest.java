package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateBatchRequest   {
  
  private String inputFileId;


  public enum EndpointEnum {
    _V1_CHAT_COMPLETIONS("/v1/chat/completions"),
    _V1_EMBEDDINGS("/v1/embeddings"),
    _V1_COMPLETIONS("/v1/completions");

    private String value;

    EndpointEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EndpointEnum endpoint;


  public enum CompletionWindowEnum {
    _24H("24h");

    private String value;

    CompletionWindowEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CompletionWindowEnum completionWindow;
  private Map<String, String> metadata;

  public CreateBatchRequest () {

  }

  public CreateBatchRequest (String inputFileId, EndpointEnum endpoint, CompletionWindowEnum completionWindow, Map<String, String> metadata) {
    this.inputFileId = inputFileId;
    this.endpoint = endpoint;
    this.completionWindow = completionWindow;
    this.metadata = metadata;
  }

    
  @JsonProperty("input_file_id")
  public String getInputFileId() {
    return inputFileId;
  }
  public void setInputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
  }

    
  @JsonProperty("endpoint")
  public EndpointEnum getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(EndpointEnum endpoint) {
    this.endpoint = endpoint;
  }

    
  @JsonProperty("completion_window")
  public CompletionWindowEnum getCompletionWindow() {
    return completionWindow;
  }
  public void setCompletionWindow(CompletionWindowEnum completionWindow) {
    this.completionWindow = completionWindow;
  }

    
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
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
    CreateBatchRequest createBatchRequest = (CreateBatchRequest) o;
    return Objects.equals(inputFileId, createBatchRequest.inputFileId) &&
        Objects.equals(endpoint, createBatchRequest.endpoint) &&
        Objects.equals(completionWindow, createBatchRequest.completionWindow) &&
        Objects.equals(metadata, createBatchRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFileId, endpoint, completionWindow, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBatchRequest {\n");
    
    sb.append("    inputFileId: ").append(toIndentedString(inputFileId)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    completionWindow: ").append(toIndentedString(completionWindow)).append("\n");
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
