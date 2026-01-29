package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.
 */
@ApiModel(description = "The last error associated with this run. Will be `null` if there are no errors.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T10:44:59.856749186Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunObjectLastError   {
  /**
   * One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
   */
  public enum CodeEnum {
    SERVER_ERROR("server_error"),
    
    RATE_LIMIT_EXCEEDED("rate_limit_exceeded"),
    
    INVALID_PROMPT("invalid_prompt");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("code")
  private CodeEnum code;

  @JsonProperty("message")
  private String message;

  public RunObjectLastError code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public RunObjectLastError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human-readable description of the error.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A human-readable description of the error.")
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
    RunObjectLastError runObjectLastError = (RunObjectLastError) o;
    return Objects.equals(this.code, runObjectLastError.code) &&
        Objects.equals(this.message, runObjectLastError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObjectLastError {\n");
    
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

