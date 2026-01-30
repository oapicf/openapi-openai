package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 */
@ApiModel(description = "For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchRequestOutputError   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  public BatchRequestOutputError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * A machine-readable error code.
   * @return code
   */
  @ApiModelProperty(value = "A machine-readable error code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BatchRequestOutputError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable error message.
   * @return message
   */
  @ApiModelProperty(value = "A human-readable error message.")
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
    BatchRequestOutputError batchRequestOutputError = (BatchRequestOutputError) o;
    return Objects.equals(this.code, batchRequestOutputError.code) &&
        Objects.equals(this.message, batchRequestOutputError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestOutputError {\n");
    
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

