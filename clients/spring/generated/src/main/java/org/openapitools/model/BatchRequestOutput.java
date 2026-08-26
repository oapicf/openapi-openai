package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchRequestOutputError;
import org.openapitools.model.BatchRequestOutputResponse;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The per-line object of the batch output and error files
 */

@Schema(name = "BatchRequestOutput", description = "The per-line object of the batch output and error files")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BatchRequestOutput {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String customId;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<BatchRequestOutputResponse> response = JsonNullable.<BatchRequestOutputResponse>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<BatchRequestOutputError> error = JsonNullable.<BatchRequestOutputError>undefined();

  public BatchRequestOutput id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public BatchRequestOutput customId(@Nullable String customId) {
    this.customId = customId;
    return this;
  }

  /**
   * A developer-provided per-request id that will be used to match outputs to inputs.
   * @return customId
   */
  
  @Schema(name = "custom_id", description = "A developer-provided per-request id that will be used to match outputs to inputs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_id")
  public @Nullable String getCustomId() {
    return customId;
  }

  @JsonProperty("custom_id")
  public void setCustomId(@Nullable String customId) {
    this.customId = customId;
  }

  public BatchRequestOutput response(BatchRequestOutputResponse response) {
    this.response = JsonNullable.of(response);
    return this;
  }

  /**
   * Get response
   * @return response
   */
  @Valid 
  @Schema(name = "response", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response")
  public JsonNullable<BatchRequestOutputResponse> getResponse() {
    return response;
  }

  public void setResponse(JsonNullable<BatchRequestOutputResponse> response) {
    this.response = response;
  }

  public BatchRequestOutput error(BatchRequestOutputError error) {
    this.error = JsonNullable.of(error);
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @Valid 
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public JsonNullable<BatchRequestOutputError> getError() {
    return error;
  }

  public void setError(JsonNullable<BatchRequestOutputError> error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestOutput batchRequestOutput = (BatchRequestOutput) o;
    return Objects.equals(this.id, batchRequestOutput.id) &&
        Objects.equals(this.customId, batchRequestOutput.customId) &&
        equalsNullable(this.response, batchRequestOutput.response) &&
        equalsNullable(this.error, batchRequestOutput.error);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customId, hashCodeNullable(response), hashCodeNullable(error));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestOutput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

