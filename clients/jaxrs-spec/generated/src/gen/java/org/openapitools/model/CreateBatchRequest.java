package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("createBatch_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateBatchRequest   {
  private String inputFileId;
  public enum EndpointEnum {

    _V1_CHAT_COMPLETIONS(String.valueOf("/v1/chat/completions")), _V1_EMBEDDINGS(String.valueOf("/v1/embeddings")), _V1_COMPLETIONS(String.valueOf("/v1/completions"));


    private String value;

    EndpointEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static EndpointEnum fromString(String s) {
        for (EndpointEnum b : EndpointEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static EndpointEnum fromValue(String value) {
        for (EndpointEnum b : EndpointEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private EndpointEnum endpoint;
  public enum CompletionWindowEnum {

    _24H(String.valueOf("24h"));


    private String value;

    CompletionWindowEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CompletionWindowEnum fromString(String s) {
        for (CompletionWindowEnum b : CompletionWindowEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static CompletionWindowEnum fromValue(String value) {
        for (CompletionWindowEnum b : CompletionWindowEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CompletionWindowEnum completionWindow;
  private @Valid Map<String, String> metadata;

  public CreateBatchRequest() {
  }

  @JsonCreator
  public CreateBatchRequest(
    @JsonProperty(required = true, value = "input_file_id") String inputFileId,
    @JsonProperty(required = true, value = "endpoint") EndpointEnum endpoint,
    @JsonProperty(required = true, value = "completion_window") CompletionWindowEnum completionWindow
  ) {
    this.inputFileId = inputFileId;
    this.endpoint = endpoint;
    this.completionWindow = completionWindow;
  }

  /**
   * The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose &#x60;batch&#x60;. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
   **/
  public CreateBatchRequest inputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. ")
  @JsonProperty(required = true, value = "input_file_id")
  @NotNull public String getInputFileId() {
    return inputFileId;
  }

  @JsonProperty(required = true, value = "input_file_id")
  public void setInputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
  }

  /**
   * The endpoint to be used for all requests in the batch. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. Note that &#x60;/v1/embeddings&#x60; batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
   **/
  public CreateBatchRequest endpoint(EndpointEnum endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.")
  @JsonProperty(required = true, value = "endpoint")
  @NotNull public EndpointEnum getEndpoint() {
    return endpoint;
  }

  @JsonProperty(required = true, value = "endpoint")
  public void setEndpoint(EndpointEnum endpoint) {
    this.endpoint = endpoint;
  }

  /**
   * The time frame within which the batch should be processed. Currently only &#x60;24h&#x60; is supported.
   **/
  public CreateBatchRequest completionWindow(CompletionWindowEnum completionWindow) {
    this.completionWindow = completionWindow;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The time frame within which the batch should be processed. Currently only `24h` is supported.")
  @JsonProperty(required = true, value = "completion_window")
  @NotNull public CompletionWindowEnum getCompletionWindow() {
    return completionWindow;
  }

  @JsonProperty(required = true, value = "completion_window")
  public void setCompletionWindow(CompletionWindowEnum completionWindow) {
    this.completionWindow = completionWindow;
  }

  /**
   * Optional custom metadata for the batch.
   **/
  public CreateBatchRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Optional custom metadata for the batch.")
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  @JsonProperty("metadata")
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public CreateBatchRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }

    this.metadata.put(key, metadataItem);
    return this;
  }

  public CreateBatchRequest removeMetadataItem(String key) {
    if (this.metadata != null) {
      this.metadata.remove(key);
    }

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
    CreateBatchRequest createBatchRequest = (CreateBatchRequest) o;
    return Objects.equals(this.inputFileId, createBatchRequest.inputFileId) &&
        Objects.equals(this.endpoint, createBatchRequest.endpoint) &&
        Objects.equals(this.completionWindow, createBatchRequest.completionWindow) &&
        Objects.equals(this.metadata, createBatchRequest.metadata);
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

