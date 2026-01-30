package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VectorStoreObjectFileCounts
 */

@JsonTypeName("VectorStoreObject_file_counts")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreObjectFileCounts {

  private Integer inProgress;

  private Integer completed;

  private Integer failed;

  private Integer cancelled;

  private Integer total;

  public VectorStoreObjectFileCounts() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VectorStoreObjectFileCounts(Integer inProgress, Integer completed, Integer failed, Integer cancelled, Integer total) {
    this.inProgress = inProgress;
    this.completed = completed;
    this.failed = failed;
    this.cancelled = cancelled;
    this.total = total;
  }

  public VectorStoreObjectFileCounts inProgress(Integer inProgress) {
    this.inProgress = inProgress;
    return this;
  }

  /**
   * The number of files that are currently being processed.
   * @return inProgress
   */
  @NotNull 
  @Schema(name = "in_progress", description = "The number of files that are currently being processed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("in_progress")
  public Integer getInProgress() {
    return inProgress;
  }

  public void setInProgress(Integer inProgress) {
    this.inProgress = inProgress;
  }

  public VectorStoreObjectFileCounts completed(Integer completed) {
    this.completed = completed;
    return this;
  }

  /**
   * The number of files that have been successfully processed.
   * @return completed
   */
  @NotNull 
  @Schema(name = "completed", description = "The number of files that have been successfully processed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("completed")
  public Integer getCompleted() {
    return completed;
  }

  public void setCompleted(Integer completed) {
    this.completed = completed;
  }

  public VectorStoreObjectFileCounts failed(Integer failed) {
    this.failed = failed;
    return this;
  }

  /**
   * The number of files that have failed to process.
   * @return failed
   */
  @NotNull 
  @Schema(name = "failed", description = "The number of files that have failed to process.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("failed")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public VectorStoreObjectFileCounts cancelled(Integer cancelled) {
    this.cancelled = cancelled;
    return this;
  }

  /**
   * The number of files that were cancelled.
   * @return cancelled
   */
  @NotNull 
  @Schema(name = "cancelled", description = "The number of files that were cancelled.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cancelled")
  public Integer getCancelled() {
    return cancelled;
  }

  public void setCancelled(Integer cancelled) {
    this.cancelled = cancelled;
  }

  public VectorStoreObjectFileCounts total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of files.
   * @return total
   */
  @NotNull 
  @Schema(name = "total", description = "The total number of files.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

