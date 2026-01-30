package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The last error associated with this vector store file. Will be `null` if there are no errors.
 */
@ApiModel(description="The last error associated with this vector store file. Will be `null` if there are no errors.")

public class VectorStoreFileObjectLastError  {
  
public enum CodeEnum {

SERVER_ERROR(String.valueOf("server_error")), UNSUPPORTED_FILE(String.valueOf("unsupported_file")), INVALID_FILE(String.valueOf("invalid_file"));


    private String value;

    CodeEnum (String v) {
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

 /**
  * One of `server_error` or `rate_limit_exceeded`.
  */
  @ApiModelProperty(required = true, value = "One of `server_error` or `rate_limit_exceeded`.")

  private CodeEnum code;

 /**
  * A human-readable description of the error.
  */
  @ApiModelProperty(required = true, value = "A human-readable description of the error.")

  private String message;
 /**
   * One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;.
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    if (code == null) {
      return null;
    }
    return code.value();
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public VectorStoreFileObjectLastError code(CodeEnum code) {
    this.code = code;
    return this;
  }

 /**
   * A human-readable description of the error.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public VectorStoreFileObjectLastError message(String message) {
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
    VectorStoreFileObjectLastError vectorStoreFileObjectLastError = (VectorStoreFileObjectLastError) o;
    return Objects.equals(this.code, vectorStoreFileObjectLastError.code) &&
        Objects.equals(this.message, vectorStoreFileObjectLastError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreFileObjectLastError {\n");
    
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

