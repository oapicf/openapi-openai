package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The request counts for different statuses within the batch.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchRequestCounts   {
  
  private Integer total;
  private Integer completed;
  private Integer failed;

  public BatchRequestCounts () {

  }

  public BatchRequestCounts (Integer total, Integer completed, Integer failed) {
    this.total = total;
    this.completed = completed;
    this.failed = failed;
  }

    
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

    
  @JsonProperty("completed")
  public Integer getCompleted() {
    return completed;
  }
  public void setCompleted(Integer completed) {
    this.completed = completed;
  }

    
  @JsonProperty("failed")
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
    return Objects.equals(total, batchRequestCounts.total) &&
        Objects.equals(completed, batchRequestCounts.completed) &&
        Objects.equals(failed, batchRequestCounts.failed);
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
