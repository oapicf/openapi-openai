package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The per-line object of the batch input file
 */
public class BatchRequestInput implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
   */
  @JsonProperty("custom_id")
  private String customId;

  /**
   * The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported.
   */
  @JsonProperty("method")
  private String method;

  /**
   * The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported.
   */
  @JsonProperty("url")
  private String url;

  /**
   * A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
   * @return customId
   */
  public String getCustomId() {
    return customId;
  }

  public void setCustomId(String customId) {
    this.customId = customId;
  }

  /**
   * The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported.
   * @return method
   */
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  /**
   * The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported.
   * @return url
   */
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
    return Objects.equals(this.customId, batchRequestInput.customId) &&
        Objects.equals(this.method, batchRequestInput.method) &&
        Objects.equals(this.url, batchRequestInput.url);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
