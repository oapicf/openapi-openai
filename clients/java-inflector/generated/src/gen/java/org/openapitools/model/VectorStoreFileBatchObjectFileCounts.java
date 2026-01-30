package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreFileBatchObjectFileCounts   {
  @JsonProperty("in_progress")
  private Integer inProgress;

  @JsonProperty("completed")
  private Integer completed;

  @JsonProperty("failed")
  private Integer failed;

  @JsonProperty("cancelled")
  private Integer cancelled;

  @JsonProperty("total")
  private Integer total;

  /**
   * The number of files that are currently being processed.
   **/
  public VectorStoreFileBatchObjectFileCounts inProgress(Integer inProgress) {
    this.inProgress = inProgress;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of files that are currently being processed.")
  @JsonProperty("in_progress")
  public Integer getInProgress() {
    return inProgress;
  }
  public void setInProgress(Integer inProgress) {
    this.inProgress = inProgress;
  }

  /**
   * The number of files that have been processed.
   **/
  public VectorStoreFileBatchObjectFileCounts completed(Integer completed) {
    this.completed = completed;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of files that have been processed.")
  @JsonProperty("completed")
  public Integer getCompleted() {
    return completed;
  }
  public void setCompleted(Integer completed) {
    this.completed = completed;
  }

  /**
   * The number of files that have failed to process.
   **/
  public VectorStoreFileBatchObjectFileCounts failed(Integer failed) {
    this.failed = failed;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of files that have failed to process.")
  @JsonProperty("failed")
  public Integer getFailed() {
    return failed;
  }
  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  /**
   * The number of files that where cancelled.
   **/
  public VectorStoreFileBatchObjectFileCounts cancelled(Integer cancelled) {
    this.cancelled = cancelled;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of files that where cancelled.")
  @JsonProperty("cancelled")
  public Integer getCancelled() {
    return cancelled;
  }
  public void setCancelled(Integer cancelled) {
    this.cancelled = cancelled;
  }

  /**
   * The total number of files.
   **/
  public VectorStoreFileBatchObjectFileCounts total(Integer total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total number of files.")
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
    VectorStoreFileBatchObjectFileCounts vectorStoreFileBatchObjectFileCounts = (VectorStoreFileBatchObjectFileCounts) o;
    return Objects.equals(inProgress, vectorStoreFileBatchObjectFileCounts.inProgress) &&
        Objects.equals(completed, vectorStoreFileBatchObjectFileCounts.completed) &&
        Objects.equals(failed, vectorStoreFileBatchObjectFileCounts.failed) &&
        Objects.equals(cancelled, vectorStoreFileBatchObjectFileCounts.cancelled) &&
        Objects.equals(total, vectorStoreFileBatchObjectFileCounts.total);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

