package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class VectorStoreObjectFileCounts implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The number of files that are currently being processed.
   */
  @JsonProperty("in_progress")
  private Integer inProgress;

  /**
   * The number of files that have been successfully processed.
   */
  @JsonProperty("completed")
  private Integer completed;

  /**
   * The number of files that have failed to process.
   */
  @JsonProperty("failed")
  private Integer failed;

  /**
   * The number of files that were cancelled.
   */
  @JsonProperty("cancelled")
  private Integer cancelled;

  /**
   * The total number of files.
   */
  @JsonProperty("total")
  private Integer total;

  /**
   * The number of files that are currently being processed.
   * @return inProgress
   */
  public Integer getInProgress() {
    return inProgress;
  }

  public void setInProgress(Integer inProgress) {
    this.inProgress = inProgress;
  }

  /**
   * The number of files that have been successfully processed.
   * @return completed
   */
  public Integer getCompleted() {
    return completed;
  }

  public void setCompleted(Integer completed) {
    this.completed = completed;
  }

  /**
   * The number of files that have failed to process.
   * @return failed
   */
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  /**
   * The number of files that were cancelled.
   * @return cancelled
   */
  public Integer getCancelled() {
    return cancelled;
  }

  public void setCancelled(Integer cancelled) {
    this.cancelled = cancelled;
  }

  /**
   * The total number of files.
   * @return total
   */
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorStoreObjectFileCounts vectorStoreObjectFileCounts = (VectorStoreObjectFileCounts) o;
    return Objects.equals(this.inProgress, vectorStoreObjectFileCounts.inProgress) &&
        Objects.equals(this.completed, vectorStoreObjectFileCounts.completed) &&
        Objects.equals(this.failed, vectorStoreObjectFileCounts.failed) &&
        Objects.equals(this.cancelled, vectorStoreObjectFileCounts.cancelled) &&
        Objects.equals(this.total, vectorStoreObjectFileCounts.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inProgress, completed, failed, cancelled, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreObjectFileCounts {\n");
    
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
