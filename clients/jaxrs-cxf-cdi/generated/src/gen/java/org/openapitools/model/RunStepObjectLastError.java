package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The last error associated with this run step. Will be `null` if there are no errors.")
public class RunStepObjectLastError   {
  

public enum CodeEnum {

    @JsonProperty("server_error") SERVER_ERROR(String.valueOf("server_error")), @JsonProperty("rate_limit_exceeded") RATE_LIMIT_EXCEEDED(String.valueOf("rate_limit_exceeded"));


    private String value;

    CodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
        for (CodeEnum b : CodeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CodeEnum code;

  private String message;

  /**
   * One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;.
   **/
  public RunStepObjectLastError code(CodeEnum code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "One of `server_error` or `rate_limit_exceeded`.")
  @JsonProperty("code")
  @NotNull
  public CodeEnum getCode() {
    return code;
  }
  public void setCode(CodeEnum code) {
    this.code = code;
  }


  /**
   * A human-readable description of the error.
   **/
  public RunStepObjectLastError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A human-readable description of the error.")
  @JsonProperty("message")
  @NotNull
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
    RunStepObjectLastError runStepObjectLastError = (RunStepObjectLastError) o;
    return Objects.equals(this.code, runStepObjectLastError.code) &&
        Objects.equals(this.message, runStepObjectLastError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepObjectLastError {\n");
    
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

