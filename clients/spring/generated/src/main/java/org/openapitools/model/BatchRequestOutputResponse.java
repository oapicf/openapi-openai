package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BatchRequestOutputResponse
 */

@JsonTypeName("BatchRequestOutput_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchRequestOutputResponse {

  private @Nullable Integer statusCode;

  private @Nullable String requestId;

  private @Nullable Object body;

  public BatchRequestOutputResponse statusCode(@Nullable Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The HTTP status code of the response
   * @return statusCode
   */
  
  @Schema(name = "status_code", description = "The HTTP status code of the response", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status_code")
  public @Nullable Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(@Nullable Integer statusCode) {
    this.statusCode = statusCode;
  }

  public BatchRequestOutputResponse requestId(@Nullable String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
   * @return requestId
   */
  
  @Schema(name = "request_id", description = "An unique identifier for the OpenAI API request. Please include this request ID when contacting support.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request_id")
  public @Nullable String getRequestId() {
    return requestId;
  }

  public void setRequestId(@Nullable String requestId) {
    this.requestId = requestId;
  }

  public BatchRequestOutputResponse body(@Nullable Object body) {
    this.body = body;
    return this;
  }

  /**
   * The JSON body of the response
   * @return body
   */
  
  @Schema(name = "body", description = "The JSON body of the response", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public @Nullable Object getBody() {
    return body;
  }

  public void setBody(@Nullable Object body) {
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

