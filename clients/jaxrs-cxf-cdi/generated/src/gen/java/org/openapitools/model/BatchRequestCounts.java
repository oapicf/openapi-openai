package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The request counts for different statuses within the batch.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The request counts for different statuses within the batch.")
public class BatchRequestCounts   {
  
  private Integer total;

  private Integer completed;

  private Integer failed;

  /**
   * Total number of requests in the batch.
   **/
  public BatchRequestCounts total(Integer total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Total number of requests in the batch.")
  @JsonProperty("total")
  @NotNull
  public Integer getTotal() {
    return total;
  }
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
  @JsonProperty("completed")
  @NotNull
  public Integer getCompleted() {
    return completed;
  }
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
  @JsonProperty("failed")
  @NotNull
  public Integer getFailed() {
    return failed;
  }
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

