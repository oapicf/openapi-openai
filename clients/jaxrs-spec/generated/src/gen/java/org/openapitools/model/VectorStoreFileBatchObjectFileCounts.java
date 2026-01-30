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



@JsonTypeName("VectorStoreFileBatchObject_file_counts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreFileBatchObjectFileCounts   {
  private Integer inProgress;
  private Integer completed;
  private Integer failed;
  private Integer cancelled;
  private Integer total;

  public VectorStoreFileBatchObjectFileCounts() {
  }

  @JsonCreator
  public VectorStoreFileBatchObjectFileCounts(
    @JsonProperty(required = true, value = "in_progress") Integer inProgress,
    @JsonProperty(required = true, value = "completed") Integer completed,
    @JsonProperty(required = true, value = "failed") Integer failed,
    @JsonProperty(required = true, value = "cancelled") Integer cancelled,
    @JsonProperty(required = true, value = "total") Integer total
  ) {
    this.inProgress = inProgress;
    this.completed = completed;
    this.failed = failed;
    this.cancelled = cancelled;
    this.total = total;
  }

  /**
   * The number of files that are currently being processed.
   **/
  public VectorStoreFileBatchObjectFileCounts inProgress(Integer inProgress) {
    this.inProgress = inProgress;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of files that are currently being processed.")
  @JsonProperty(required = true, value = "in_progress")
  @NotNull public Integer getInProgress() {
    return inProgress;
  }

  @JsonProperty(required = true, value = "in_progress")
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
  @JsonProperty(required = true, value = "completed")
  @NotNull public Integer getCompleted() {
    return completed;
  }

  @JsonProperty(required = true, value = "completed")
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
  @JsonProperty(required = true, value = "failed")
  @NotNull public Integer getFailed() {
    return failed;
  }

  @JsonProperty(required = true, value = "failed")
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
  @JsonProperty(required = true, value = "cancelled")
  @NotNull public Integer getCancelled() {
    return cancelled;
  }

  @JsonProperty(required = true, value = "cancelled")
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
  @JsonProperty(required = true, value = "total")
  @NotNull public Integer getTotal() {
    return total;
  }

  @JsonProperty(required = true, value = "total")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

