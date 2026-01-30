package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BatchErrorsDataInner
 */

@JsonTypeName("Batch_errors_data_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchErrorsDataInner {

  private String code;

  private String message;

  private JsonNullable<String> param = JsonNullable.<String>undefined();

  private JsonNullable<Integer> line = JsonNullable.<Integer>undefined();

  public BatchErrorsDataInner code(String code) {
    this.code = code;
    return this;
  }

  /**
   * An error code identifying the error type.
   * @return code
   */
  
  @Schema(name = "code", description = "An error code identifying the error type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BatchErrorsDataInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable message providing more details about the error.
   * @return message
   */
  
  @Schema(name = "message", description = "A human-readable message providing more details about the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BatchErrorsDataInner param(String param) {
    this.param = JsonNullable.of(param);
    return this;
  }

  /**
   * The name of the parameter that caused the error, if applicable.
   * @return param
   */
  
  @Schema(name = "param", description = "The name of the parameter that caused the error, if applicable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("param")
  public JsonNullable<String> getParam() {
    return param;
  }

  public void setParam(JsonNullable<String> param) {
    this.param = param;
  }

  public BatchErrorsDataInner line(Integer line) {
    this.line = JsonNullable.of(line);
    return this;
  }

  /**
   * The line number of the input file where the error occurred, if applicable.
   * @return line
   */
  
  @Schema(name = "line", description = "The line number of the input file where the error occurred, if applicable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line")
  public JsonNullable<Integer> getLine() {
    return line;
  }

  public void setLine(JsonNullable<Integer> line) {
    this.line = line;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchErrorsDataInner batchErrorsDataInner = (BatchErrorsDataInner) o;
    return Objects.equals(this.code, batchErrorsDataInner.code) &&
        Objects.equals(this.message, batchErrorsDataInner.message) &&
        equalsNullable(this.param, batchErrorsDataInner.param) &&
        equalsNullable(this.line, batchErrorsDataInner.line);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, hashCodeNullable(param), hashCodeNullable(line));
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
    sb.append("class BatchErrorsDataInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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

