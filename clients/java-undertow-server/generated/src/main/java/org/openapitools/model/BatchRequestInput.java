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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The per-line object of the batch input file
 */

@ApiModel(description = "The per-line object of the batch input file")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchRequestInput   {
  
  private String customId;


  public enum MethodEnum {
    POST("POST");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private MethodEnum method;
  private String url;

  /**
   * A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
   */
  public BatchRequestInput customId(String customId) {
    this.customId = customId;
    return this;
  }

  
  @ApiModelProperty(value = "A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.")
  @JsonProperty("custom_id")
  public String getCustomId() {
    return customId;
  }
  public void setCustomId(String customId) {
    this.customId = customId;
  }

  /**
   * The HTTP method to be used for the request. Currently only `POST` is supported.
   */
  public BatchRequestInput method(MethodEnum method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(value = "The HTTP method to be used for the request. Currently only `POST` is supported.")
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }
  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  /**
   * The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
   */
  public BatchRequestInput url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestInput batchRequestInput = (BatchRequestInput) o;
    return Objects.equals(customId, batchRequestInput.customId) &&
        Objects.equals(method, batchRequestInput.method) &&
        Objects.equals(url, batchRequestInput.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customId, method, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestInput {\n");
    
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

