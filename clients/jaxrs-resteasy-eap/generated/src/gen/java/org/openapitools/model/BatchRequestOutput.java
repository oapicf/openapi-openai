package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchRequestOutputError;
import org.openapitools.model.BatchRequestOutputResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The per-line object of the batch output and error files")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchRequestOutput   {
  
  private String id;
  private String customId;
  private BatchRequestOutputResponse response;
  private BatchRequestOutputError error;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * A developer-provided per-request id that will be used to match outputs to inputs.
   **/
  
  @ApiModelProperty(value = "A developer-provided per-request id that will be used to match outputs to inputs.")
  @JsonProperty("custom_id")
  public String getCustomId() {
    return customId;
  }
  public void setCustomId(String customId) {
    this.customId = customId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("response")
  public BatchRequestOutputResponse getResponse() {
    return response;
  }
  public void setResponse(BatchRequestOutputResponse response) {
    this.response = response;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.id, batchRequestOutput.id) &&
        Objects.equals(this.customId, batchRequestOutput.customId) &&
        Objects.equals(this.response, batchRequestOutput.response) &&
        Objects.equals(this.error, batchRequestOutput.error);
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

