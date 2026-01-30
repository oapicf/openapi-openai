package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BatchRequestOutputResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BatchRequestOutputResponse   {
  @JsonProperty("status_code")
  
  private Integer statusCode;

  @JsonProperty("request_id")
  
  private String requestId;

  @JsonProperty("body")
  
  private Object body;

  public BatchRequestOutputResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * The HTTP status code of the response
   * @return statusCode
  **/
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public BatchRequestOutputResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public BatchRequestOutputResponse body(Object body) {
    this.body = body;
    return this;
  }

   /**
   * The JSON body of the response
   * @return body
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

