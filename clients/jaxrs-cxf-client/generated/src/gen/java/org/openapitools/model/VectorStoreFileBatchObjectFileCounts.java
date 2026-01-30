package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VectorStoreFileBatchObjectFileCounts  {
  
 /**
  * The number of files that are currently being processed.
  */
  @ApiModelProperty(required = true, value = "The number of files that are currently being processed.")

  private Integer inProgress;

 /**
  * The number of files that have been processed.
  */
  @ApiModelProperty(required = true, value = "The number of files that have been processed.")

  private Integer completed;

 /**
  * The number of files that have failed to process.
  */
  @ApiModelProperty(required = true, value = "The number of files that have failed to process.")

  private Integer failed;

 /**
  * The number of files that where cancelled.
  */
  @ApiModelProperty(required = true, value = "The number of files that where cancelled.")

  private Integer cancelled;

 /**
  * The total number of files.
  */
  @ApiModelProperty(required = true, value = "The total number of files.")

  private Integer total;
 /**
   * The number of files that are currently being processed.
   * @return inProgress
  **/
  @JsonProperty("in_progress")
  public Integer getInProgress() {
    return inProgress;
  }

  public void setInProgress(Integer inProgress) {
    this.inProgress = inProgress;
  }

  public VectorStoreFileBatchObjectFileCounts inProgress(Integer inProgress) {
    this.inProgress = inProgress;
    return this;
  }

 /**
   * The number of files that have been processed.
   * @return completed
  **/
  @JsonProperty("completed")
  public Integer getCompleted() {
    return completed;
  }

  public void setCompleted(Integer completed) {
    this.completed = completed;
  }

  public VectorStoreFileBatchObjectFileCounts completed(Integer completed) {
    this.completed = completed;
    return this;
  }

 /**
   * The number of files that have failed to process.
   * @return failed
  **/
  @JsonProperty("failed")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public VectorStoreFileBatchObjectFileCounts failed(Integer failed) {
    this.failed = failed;
    return this;
  }

 /**
   * The number of files that where cancelled.
   * @return cancelled
  **/
  @JsonProperty("cancelled")
  public Integer getCancelled() {
    return cancelled;
  }

  public void setCancelled(Integer cancelled) {
    this.cancelled = cancelled;
  }

  public VectorStoreFileBatchObjectFileCounts cancelled(Integer cancelled) {
    this.cancelled = cancelled;
    return this;
  }

 /**
   * The total number of files.
   * @return total
  **/
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public VectorStoreFileBatchObjectFileCounts total(Integer total) {
    this.total = total;
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
    VectorStoreFileBatchObjectFileCounts vectorStoreFileBatchObjectFileCounts = (VectorStoreFileBatchObjectFileCounts) o;
    return Objects.equals(this.inProgress, vectorStoreFileBatchObjectFileCounts.inProgress) &&
        Objects.equals(this.completed, vectorStoreFileBatchObjectFileCounts.completed) &&
        Objects.equals(this.failed, vectorStoreFileBatchObjectFileCounts.failed) &&
        Objects.equals(this.cancelled, vectorStoreFileBatchObjectFileCounts.cancelled) &&
        Objects.equals(this.total, vectorStoreFileBatchObjectFileCounts.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inProgress, completed, failed, cancelled, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreFileBatchObjectFileCounts {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

