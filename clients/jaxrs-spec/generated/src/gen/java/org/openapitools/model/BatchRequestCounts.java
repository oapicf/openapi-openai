package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The request counts for different statuses within the batch.
 **/
@ApiModel(description = "The request counts for different statuses within the batch.")
@JsonTypeName("Batch_request_counts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchRequestCounts   {
  private Integer total;
  private Integer completed;
  private Integer failed;

  public BatchRequestCounts() {
  }

  @JsonCreator
  public BatchRequestCounts(
    @JsonProperty(required = true, value = "total") Integer total,
    @JsonProperty(required = true, value = "completed") Integer completed,
    @JsonProperty(required = true, value = "failed") Integer failed
  ) {
    this.total = total;
    this.completed = completed;
    this.failed = failed;
  }

  /**
   * Total number of requests in the batch.
   **/
  public BatchRequestCounts total(Integer total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Total number of requests in the batch.")
  @JsonProperty(required = true, value = "total")
  @NotNull public Integer getTotal() {
    return total;
  }

  @JsonProperty(required = true, value = "total")
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   * Number of requests that have been completed successfully.
   **/
  public BatchRequestCounts completed(Integer completed) {
    this.completed = completed;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of requests that have been completed successfully.")
  @JsonProperty(required = true, value = "completed")
  @NotNull public Integer getCompleted() {
    return completed;
  }

  @JsonProperty(required = true, value = "completed")
  public void setCompleted(Integer completed) {
    this.completed = completed;
  }

  /**
   * Number of requests that have failed.
   **/
  public BatchRequestCounts failed(Integer failed) {
    this.failed = failed;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of requests that have failed.")
  @JsonProperty(required = true, value = "failed")
  @NotNull public Integer getFailed() {
    return failed;
  }

  @JsonProperty(required = true, value = "failed")
  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestCounts batchRequestCounts = (BatchRequestCounts) o;
    return Objects.equals(this.total, batchRequestCounts.total) &&
        Objects.equals(this.completed, batchRequestCounts.completed) &&
        Objects.equals(this.failed, batchRequestCounts.failed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, completed, failed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestCounts {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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

