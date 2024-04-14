package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The last error associated with this run. Will be `null` if there are no errors.
 **/
@ApiModel(description="The last error associated with this run. Will be `null` if there are no errors.")

public class RunObjectLastError  {
  
public enum CodeEnum {

SERVER_ERROR(String.valueOf("server_error")), RATE_LIMIT_EXCEEDED(String.valueOf("rate_limit_exceeded")), INVALID_PROMPT(String.valueOf("invalid_prompt"));


    private String value;

    CodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String value) {
        for (CodeEnum b : CodeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.")
 /**
   * One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
  **/
  private CodeEnum code;

  @ApiModelProperty(required = true, value = "A human-readable description of the error.")
 /**
   * A human-readable description of the error.
  **/
  private String message;
 /**
   * One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.
   * @return code
  **/
  @JsonProperty("code")
  @NotNull
  public String getCode() {
    if (code == null) {
      return null;
    }
    return code.value();
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public RunObjectLastError code(CodeEnum code) {
    this.code = code;
    return this;
  }

 /**
   * A human-readable description of the error.
   * @return message
  **/
  @JsonProperty("message")
  @NotNull
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RunObjectLastError message(String message) {
    this.message = message;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

