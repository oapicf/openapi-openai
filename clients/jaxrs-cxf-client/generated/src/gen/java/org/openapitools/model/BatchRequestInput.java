package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The per-line object of the batch input file
 */
@ApiModel(description="The per-line object of the batch input file")

public class BatchRequestInput  {
  
 /**
  * A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
  */
  @ApiModelProperty(value = "A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.")

  private String customId;

public enum MethodEnum {

POST(String.valueOf("POST"));


    private String value;

    MethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
        for (MethodEnum b : MethodEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The HTTP method to be used for the request. Currently only `POST` is supported.
  */
  @ApiModelProperty(value = "The HTTP method to be used for the request. Currently only `POST` is supported.")

  private MethodEnum method;

 /**
  * The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
  */
  @ApiModelProperty(value = "The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.")

  private String url;
 /**
   * A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
   * @return customId
  **/
  @JsonProperty("custom_id")
  public String getCustomId() {
    return customId;
  }

  public void setCustomId(String customId) {
    this.customId = customId;
  }

  public BatchRequestInput customId(String customId) {
    this.customId = customId;
    return this;
  }

 /**
   * The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported.
   * @return method
  **/
  @JsonProperty("method")
  public String getMethod() {
    if (method == null) {
      return null;
    }
    return method.value();
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public BatchRequestInput method(MethodEnum method) {
    this.method = method;
    return this;
  }

 /**
   * The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported.
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public BatchRequestInput url(String url) {
    this.url = url;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

