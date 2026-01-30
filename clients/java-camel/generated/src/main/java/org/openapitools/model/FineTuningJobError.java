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
 * For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
 */

@Schema(name = "FineTuningJob_error", description = "For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.")
@JsonTypeName("FineTuningJob_error")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningJobError {

  private String code;

  private String message;

  private JsonNullable<String> param = JsonNullable.<String>undefined();

  public FineTuningJobError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FineTuningJobError(String code, String message, String param) {
    this.code = code;
    this.message = message;
    this.param = JsonNullable.of(param);
  }

  public FineTuningJobError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * A machine-readable error code.
   * @return code
   */
  @NotNull 
  @Schema(name = "code", description = "A machine-readable error code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public FineTuningJobError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable error message.
   * @return message
   */
  @NotNull 
  @Schema(name = "message", description = "A human-readable error message.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FineTuningJobError param(String param) {
    this.param = JsonNullable.of(param);
    return this;
  }

  /**
   * The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
   * @return param
   */
  @NotNull 
  @Schema(name = "param", description = "The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("param")
  public JsonNullable<String> getParam() {
    return param;
  }

  public void setParam(JsonNullable<String> param) {
    this.param = param;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuningJobError fineTuningJobError = (FineTuningJobError) o;
    return Objects.equals(this.code, fineTuningJobError.code) &&
        Objects.equals(this.message, fineTuningJobError.message) &&
        Objects.equals(this.param, fineTuningJobError.param);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, param);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
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

