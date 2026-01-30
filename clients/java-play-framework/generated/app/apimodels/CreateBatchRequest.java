package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateBatchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateBatchRequest   {
  @JsonProperty("input_file_id")
  @NotNull

  private String inputFileId;

  /**
   * The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
   */
  public enum EndpointEnum {
    _V1_CHAT_COMPLETIONS("/v1/chat/completions"),
    
    _V1_EMBEDDINGS("/v1/embeddings"),
    
    _V1_COMPLETIONS("/v1/completions");

    private final String value;

    EndpointEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("endpoint")
  @NotNull

  private EndpointEnum endpoint;

  /**
   * The time frame within which the batch should be processed. Currently only `24h` is supported.
   */
  public enum CompletionWindowEnum {
    _24H("24h");

    private final String value;

    CompletionWindowEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("completion_window")
  @NotNull

  private CompletionWindowEnum completionWindow;

  @JsonProperty("metadata")
  
  private Map<String, String> metadata = null;

  public CreateBatchRequest inputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
    return this;
  }

   /**
   * The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
   * @return inputFileId
  **/
  public String getInputFileId() {
    return inputFileId;
  }

  public void setInputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
  }

  public CreateBatchRequest endpoint(EndpointEnum endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
   * @return endpoint
  **/
  public EndpointEnum getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(EndpointEnum endpoint) {
    this.endpoint = endpoint;
  }

  public CreateBatchRequest completionWindow(CompletionWindowEnum completionWindow) {
    this.completionWindow = completionWindow;
    return this;
  }

   /**
   * The time frame within which the batch should be processed. Currently only `24h` is supported.
   * @return completionWindow
  **/
  public CompletionWindowEnum getCompletionWindow() {
    return completionWindow;
  }

  public void setCompletionWindow(CompletionWindowEnum completionWindow) {
    this.completionWindow = completionWindow;
  }

  public CreateBatchRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateBatchRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Optional custom metadata for the batch.
   * @return metadata
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

