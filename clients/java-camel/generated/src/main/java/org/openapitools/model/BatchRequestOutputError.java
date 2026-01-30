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
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 */

@Schema(name = "BatchRequestOutput_error", description = "For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.")
@JsonTypeName("BatchRequestOutput_error")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchRequestOutputError {

  private String code;

  private String message;

  public BatchRequestOutputError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * A machine-readable error code.
   * @return code
   */
  
  @Schema(name = "code", description = "A machine-readable error code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BatchRequestOutputError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable error message.
   * @return message
   */
  
  @Schema(name = "message", description = "A human-readable error message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestOutputError batchRequestOutputError = (BatchRequestOutputError) o;
    return Objects.equals(this.code, batchRequestOutputError.code) &&
        Objects.equals(this.message, batchRequestOutputError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestOutputError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

