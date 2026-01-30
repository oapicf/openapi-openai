/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 */

@ApiModel(description = "For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningJobError   {
  
  private String code;
  private String message;
  private String param;

  /**
   * A machine-readable error code.
   */
  public FineTuningJobError code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A machine-readable error code.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A human-readable error message.
   */
  public FineTuningJobError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A human-readable error message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
   */
  public FineTuningJobError param(String param) {
    this.param = param;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.")
  @JsonProperty("param")
  public String getParam() {
    return param;
  }
  public void setParam(String param) {
    this.param = param;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuningJobError fineTuningJobError = (FineTuningJobError) o;
    return Objects.equals(code, fineTuningJobError.code) &&
        Objects.equals(message, fineTuningJobError.message) &&
        Objects.equals(param, fineTuningJobError.param);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, param);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
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

