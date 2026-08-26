package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.
 */
public class RunObjectLastError implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.
   */
  @JsonProperty("code")
  private String code;

  /**
   * A human-readable description of the error.
   */
  @JsonProperty("message")
  private String message;

  /**
   * One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;.
   * @return code
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A human-readable description of the error.
   * @return message
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
