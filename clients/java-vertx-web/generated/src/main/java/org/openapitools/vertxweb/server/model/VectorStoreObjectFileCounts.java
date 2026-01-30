package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VectorStoreObjectFileCounts   {
  
  private Integer inProgress;
  private Integer completed;
  private Integer failed;
  private Integer cancelled;
  private Integer total;

  public VectorStoreObjectFileCounts () {

  }

  public VectorStoreObjectFileCounts (Integer inProgress, Integer completed, Integer failed, Integer cancelled, Integer total) {
    this.inProgress = inProgress;
    this.completed = completed;
    this.failed = failed;
    this.cancelled = cancelled;
    this.total = total;
  }

    
  @JsonProperty("in_progress")
  public Integer getInProgress() {
    return inProgress;
  }
  public void setInProgress(Integer inProgress) {
    this.inProgress = inProgress;
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

    
  @JsonProperty("cancelled")
  public Integer getCancelled() {
    return cancelled;
  }
  public void setCancelled(Integer cancelled) {
    this.cancelled = cancelled;
  }

    
  @JsonProperty("total")
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
    return Objects.equals(inProgress, vectorStoreObjectFileCounts.inProgress) &&
        Objects.equals(completed, vectorStoreObjectFileCounts.completed) &&
        Objects.equals(failed, vectorStoreObjectFileCounts.failed) &&
        Objects.equals(cancelled, vectorStoreObjectFileCounts.cancelled) &&
        Objects.equals(total, vectorStoreObjectFileCounts.total);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
