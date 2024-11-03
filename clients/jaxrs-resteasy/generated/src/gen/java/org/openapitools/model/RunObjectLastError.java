package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The last error associated with this run. Will be `null` if there are no errors.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-03T11:08:49.636855747Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunObjectLastError   {
  

  /**
   * One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.
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
  }

  private CodeEnum code;
  private String message;

  /**
   * One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.")
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

