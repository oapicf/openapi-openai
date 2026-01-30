package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The request counts for different statuses within the batch.
 */
@ApiModel(description = "The request counts for different statuses within the batch.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchRequestCounts   {
  @JsonProperty("total")
  private Integer total;

  @JsonProperty("completed")
  private Integer completed;

  @JsonProperty("failed")
  private Integer failed;

  public BatchRequestCounts total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of requests in the batch.
   * @return total
  **/
  @ApiModelProperty(required = true, value = "Total number of requests in the batch.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public BatchRequestCounts completed(Integer completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Number of requests that have been completed successfully.
   * @return completed
  **/
  @ApiModelProperty(required = true, value = "Number of requests that have been completed successfully.")
  public Integer getCompleted() {
    return completed;
  }

  public void setCompleted(Integer completed) {
    this.completed = completed;
  }

  public BatchRequestCounts failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Number of requests that have failed.
   * @return failed
  **/
  @ApiModelProperty(required = true, value = "Number of requests that have failed.")
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

