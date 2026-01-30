package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchRequestOutputResponse   {
  
  private Integer statusCode;
  private String requestId;
  private Object body;

  public BatchRequestOutputResponse () {

  }

  public BatchRequestOutputResponse (Integer statusCode, String requestId, Object body) {
    this.statusCode = statusCode;
    this.requestId = requestId;
    this.body = body;
  }

    
  @JsonProperty("status_code")
  public Integer getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

    
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

    
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
    return Objects.equals(statusCode, batchRequestOutputResponse.statusCode) &&
        Objects.equals(requestId, batchRequestOutputResponse.requestId) &&
        Objects.equals(body, batchRequestOutputResponse.body);
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
