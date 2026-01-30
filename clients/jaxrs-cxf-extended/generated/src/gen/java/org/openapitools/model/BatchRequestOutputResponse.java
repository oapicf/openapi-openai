package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BatchRequestOutputResponse  {
  
 /**
  * The HTTP status code of the response
  */
  @ApiModelProperty(value = "The HTTP status code of the response")
  private Integer statusCode;

 /**
  * An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
  */
  @ApiModelProperty(value = "An unique identifier for the OpenAI API request. Please include this request ID when contacting support.")
  private String requestId;

 /**
  * The JSON body of the response
  */
  @ApiModelProperty(value = "The JSON body of the response")
  private Object body;
 /**
  * The HTTP status code of the response
  * @return statusCode
  */
  @JsonProperty("status_code")
  public Integer getStatusCode() {
    return statusCode;
  }

  /**
   * Sets the <code>statusCode</code> property.
   */
 public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * Sets the <code>statusCode</code> property.
   */
  public BatchRequestOutputResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

 /**
  * An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
  * @return requestId
  */
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }

  /**
   * Sets the <code>requestId</code> property.
   */
 public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Sets the <code>requestId</code> property.
   */
  public BatchRequestOutputResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

 /**
  * The JSON body of the response
  * @return body
  */
  @JsonProperty("body")
  public Object getBody() {
    return body;
  }

  /**
   * Sets the <code>body</code> property.
   */
 public void setBody(Object body) {
    this.body = body;
  }

  /**
   * Sets the <code>body</code> property.
   */
  public BatchRequestOutputResponse body(Object body) {
    this.body = body;
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
    BatchRequestOutputResponse batchRequestOutputResponse = (BatchRequestOutputResponse) o;
    return Objects.equals(this.statusCode, batchRequestOutputResponse.statusCode) &&
        Objects.equals(this.requestId, batchRequestOutputResponse.requestId) &&
        Objects.equals(this.body, batchRequestOutputResponse.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, requestId, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestOutputResponse {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

