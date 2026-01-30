package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The details for events with this &#x60;type&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AuditLogLoginFailed   {
  @JsonProperty("error_code")
  
  private String errorCode;

  @JsonProperty("error_message")
  
  private String errorMessage;

  public AuditLogLoginFailed errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error code of the failure.
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public AuditLogLoginFailed errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message of the failure.
   * @return errorMessage
  **/
  public String getErrorMessage() {
    return errorMessage;
  }

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
    return Objects.equals(errorCode, auditLogLoginFailed.errorCode) &&
        Objects.equals(errorMessage, auditLogLoginFailed.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

