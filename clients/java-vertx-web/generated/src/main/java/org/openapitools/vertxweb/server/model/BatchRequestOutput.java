package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.BatchRequestOutputError;
import org.openapitools.vertxweb.server.model.BatchRequestOutputResponse;

/**
 * The per-line object of the batch output and error files
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchRequestOutput   {
  
  private String id;
  private String customId;
  private BatchRequestOutputResponse response;
  private BatchRequestOutputError error;

  public BatchRequestOutput () {

  }

  public BatchRequestOutput (String id, String customId, BatchRequestOutputResponse response, BatchRequestOutputError error) {
    this.id = id;
    this.customId = customId;
    this.response = response;
    this.error = error;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("custom_id")
  public String getCustomId() {
    return customId;
  }
  public void setCustomId(String customId) {
    this.customId = customId;
  }

    
  @JsonProperty("response")
  public BatchRequestOutputResponse getResponse() {
    return response;
  }
  public void setResponse(BatchRequestOutputResponse response) {
    this.response = response;
  }

    
  @JsonProperty("error")
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
