package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The request counts for different statuses within the batch.
 */
@ApiModel(description="The request counts for different statuses within the batch.")

public class BatchRequestCounts  {
  
 /**
  * Total number of requests in the batch.
  */
  @ApiModelProperty(required = true, value = "Total number of requests in the batch.")
  private Integer total;

 /**
  * Number of requests that have been completed successfully.
  */
  @ApiModelProperty(required = true, value = "Number of requests that have been completed successfully.")
  private Integer completed;

 /**
  * Number of requests that have failed.
  */
  @ApiModelProperty(required = true, value = "Number of requests that have failed.")
  private Integer failed;
 /**
  * Total number of requests in the batch.
  * @return total
  */
  @JsonProperty("total")
  @NotNull
  public Integer getTotal() {
    return total;
  }

  /**
   * Sets the <code>total</code> property.
   */
 public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   * Sets the <code>total</code> property.
   */
  public BatchRequestCounts total(Integer total) {
    this.total = total;
    return this;
  }

 /**
  * Number of requests that have been completed successfully.
  * @return completed
  */
  @JsonProperty("completed")
  @NotNull
  public Integer getCompleted() {
    return completed;
  }

  /**
   * Sets the <code>completed</code> property.
   */
 public void setCompleted(Integer completed) {
    this.completed = completed;
  }

  /**
   * Sets the <code>completed</code> property.
   */
  public BatchRequestCounts completed(Integer completed) {
    this.completed = completed;
    return this;
  }

 /**
  * Number of requests that have failed.
  * @return failed
  */
  @JsonProperty("failed")
  @NotNull
  public Integer getFailed() {
    return failed;
  }

  /**
   * Sets the <code>failed</code> property.
   */
 public void setFailed(Integer failed) {
    this.failed = failed;
  }

  /**
   * Sets the <code>failed</code> property.
   */
  public BatchRequestCounts failed(Integer failed) {
    this.failed = failed;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

