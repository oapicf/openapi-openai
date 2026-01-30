package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepObjectLastError   {
  /**
   * One of `server_error` or `rate_limit_exceeded`.
   */
  public enum CodeEnum {
    SERVER_ERROR("server_error"),
    
    RATE_LIMIT_EXCEEDED("rate_limit_exceeded");

    private final String value;

    CodeEnum(String value) {
      this.value = value;
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

  @JsonProperty("code")
  @NotNull

  private CodeEnum code;

  @JsonProperty("message")
  @NotNull

  private String message;

  public RunStepObjectLastError code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * One of `server_error` or `rate_limit_exceeded`.
   * @return code
  **/
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public RunStepObjectLastError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human-readable description of the error.
   * @return message
  **/
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
    return Objects.equals(code, runStepObjectLastError.code) &&
        Objects.equals(message, runStepObjectLastError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

