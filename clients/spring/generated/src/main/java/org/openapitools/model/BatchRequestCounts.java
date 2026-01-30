package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The request counts for different statuses within the batch.
 */

@Schema(name = "Batch_request_counts", description = "The request counts for different statuses within the batch.")
@JsonTypeName("Batch_request_counts")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchRequestCounts {

  private Integer total;

  private Integer completed;

  private Integer failed;

  public BatchRequestCounts() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BatchRequestCounts(Integer total, Integer completed, Integer failed) {
    this.total = total;
    this.completed = completed;
    this.failed = failed;
  }

  public BatchRequestCounts total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of requests in the batch.
   * @return total
   */
  @NotNull 
  @Schema(name = "total", description = "Total number of requests in the batch.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
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
   */
  @NotNull 
  @Schema(name = "completed", description = "Number of requests that have been completed successfully.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("completed")
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
   */
  @NotNull 
  @Schema(name = "failed", description = "Number of requests that have failed.", requiredMode = Schema.RequiredMode.REQUIRED)
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

