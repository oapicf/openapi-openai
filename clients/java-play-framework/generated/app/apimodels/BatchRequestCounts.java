package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The request counts for different statuses within the batch.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BatchRequestCounts   {
  @JsonProperty("total")
  @NotNull

  private Integer total;

  @JsonProperty("completed")
  @NotNull

  private Integer completed;

  @JsonProperty("failed")
  @NotNull

  private Integer failed;

  public BatchRequestCounts total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of requests in the batch.
   * @return total
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

