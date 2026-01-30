package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The details for events with this `type`.
 */
@ApiModel(description="The details for events with this `type`.")

public class AuditLogLoginFailed  {
  
 /**
  * The error code of the failure.
  */
  @ApiModelProperty(value = "The error code of the failure.")
  private String errorCode;

 /**
  * The error message of the failure.
  */
  @ApiModelProperty(value = "The error message of the failure.")
  private String errorMessage;
 /**
  * The error code of the failure.
  * @return errorCode
  */
  @JsonProperty("error_code")
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * Sets the <code>errorCode</code> property.
   */
 public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Sets the <code>errorCode</code> property.
   */
  public AuditLogLoginFailed errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
  * The error message of the failure.
  * @return errorMessage
  */
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Sets the <code>errorMessage</code> property.
   */
 public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Sets the <code>errorMessage</code> property.
   */
  public AuditLogLoginFailed errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
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
    AuditLogLoginFailed auditLogLoginFailed = (AuditLogLoginFailed) o;
    return Objects.equals(this.errorCode, auditLogLoginFailed.errorCode) &&
        Objects.equals(this.errorMessage, auditLogLoginFailed.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogLoginFailed {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

