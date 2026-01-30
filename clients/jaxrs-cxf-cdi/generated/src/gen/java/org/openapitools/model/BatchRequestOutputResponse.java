package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class BatchRequestOutputResponse   {
  
  private Integer statusCode;

  private String requestId;

  private Object body;

  /**
   * The HTTP status code of the response
   **/
  public BatchRequestOutputResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  
  @ApiModelProperty(value = "The HTTP status code of the response")
  @JsonProperty("status_code")
  public Integer getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  /**
   * An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
   **/
  public BatchRequestOutputResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  
  @ApiModelProperty(value = "An unique identifier for the OpenAI API request. Please include this request ID when contacting support.")
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  /**
   * The JSON body of the response
   **/
  public BatchRequestOutputResponse body(Object body) {
    this.body = body;
    return this;
  }

  
  @ApiModelProperty(value = "The JSON body of the response")
  @JsonProperty("body")
  public Object getBody() {
    return body;
  }
  public void setBody(Object body) {
    this.body = body;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

