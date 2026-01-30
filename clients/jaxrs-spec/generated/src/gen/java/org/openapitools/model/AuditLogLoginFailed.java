package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The details for events with this &#x60;type&#x60;.
 **/
@ApiModel(description = "The details for events with this `type`.")
@JsonTypeName("AuditLog_login_failed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogLoginFailed   {
  private String errorCode;
  private String errorMessage;

  public AuditLogLoginFailed() {
  }

  /**
   * The error code of the failure.
   **/
  public AuditLogLoginFailed errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  
  @ApiModelProperty(value = "The error code of the failure.")
  @JsonProperty("error_code")
  public String getErrorCode() {
    return errorCode;
  }

  @JsonProperty("error_code")
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * The error message of the failure.
   **/
  public AuditLogLoginFailed errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  
  @ApiModelProperty(value = "The error message of the failure.")
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }

  @JsonProperty("error_message")
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

