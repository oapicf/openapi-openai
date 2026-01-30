package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * VectorStoreObjectFileCounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VectorStoreObjectFileCounts   {
  @JsonProperty("in_progress")
  @NotNull

  private Integer inProgress;

  @JsonProperty("completed")
  @NotNull

  private Integer completed;

  @JsonProperty("failed")
  @NotNull

  private Integer failed;

  @JsonProperty("cancelled")
  @NotNull

  private Integer cancelled;

  @JsonProperty("total")
  @NotNull

  private Integer total;

  public VectorStoreObjectFileCounts inProgress(Integer inProgress) {
    this.inProgress = inProgress;
    return this;
  }

   /**
   * The number of files that are currently being processed.
   * @return inProgress
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

