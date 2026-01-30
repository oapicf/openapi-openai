package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BatchErrorsDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BatchErrorsDataInner   {
  @JsonProperty("code")
  
  private String code;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("param")
  
  private String param;

  @JsonProperty("line")
  
  private Integer line;

  public BatchErrorsDataInner code(String code) {
    this.code = code;
    return this;
  }

   /**
   * An error code identifying the error type.
   * @return code
  **/
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
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BatchErrorsDataInner param(String param) {
    this.param = param;
    return this;
  }

   /**
   * The name of the parameter that caused the error, if applicable.
   * @return param
  **/
  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public BatchErrorsDataInner line(Integer line) {
    this.line = line;
    return this;
  }

   /**
   * The line number of the input file where the error occurred, if applicable.
   * @return line
  **/
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
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
    return Objects.equals(code, batchErrorsDataInner.code) &&
        Objects.equals(message, batchErrorsDataInner.message) &&
        Objects.equals(param, batchErrorsDataInner.param) &&
        Objects.equals(line, batchErrorsDataInner.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, param, line);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

