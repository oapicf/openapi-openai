package apimodels;

import apimodels.BatchRequestOutputError;
import apimodels.BatchRequestOutputResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The per-line object of the batch output and error files
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BatchRequestOutput   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("custom_id")
  
  private String customId;

  @JsonProperty("response")
  @Valid

  private BatchRequestOutputResponse response;

  @JsonProperty("error")
  @Valid

  private BatchRequestOutputError error;

  public BatchRequestOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BatchRequestOutput customId(String customId) {
    this.customId = customId;
    return this;
  }

   /**
   * A developer-provided per-request id that will be used to match outputs to inputs.
   * @return customId
  **/
  public String getCustomId() {
    return customId;
  }

  public void setCustomId(String customId) {
    this.customId = customId;
  }

  public BatchRequestOutput response(BatchRequestOutputResponse response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  public BatchRequestOutputResponse getResponse() {
    return response;
  }

  public void setResponse(BatchRequestOutputResponse response) {
    this.response = response;
  }

  public BatchRequestOutput error(BatchRequestOutputError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  public BatchRequestOutputError getError() {
    return error;
  }

  public void setError(BatchRequestOutputError error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestOutput batchRequestOutput = (BatchRequestOutput) o;
    return Objects.equals(id, batchRequestOutput.id) &&
        Objects.equals(customId, batchRequestOutput.customId) &&
        Objects.equals(response, batchRequestOutput.response) &&
        Objects.equals(error, batchRequestOutput.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customId, response, error);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestOutput {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

