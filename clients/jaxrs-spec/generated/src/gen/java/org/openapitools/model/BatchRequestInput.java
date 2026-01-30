package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The per-line object of the batch input file
 **/
@ApiModel(description = "The per-line object of the batch input file")
@JsonTypeName("BatchRequestInput")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchRequestInput   {
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static MethodEnum fromString(String s) {
        for (MethodEnum b : MethodEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static MethodEnum fromValue(String value) {
        for (MethodEnum b : MethodEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private MethodEnum method;
  private String url;

  public BatchRequestInput() {
  }

  /**
   * A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
   **/
  public BatchRequestInput customId(String customId) {
    this.customId = customId;
    return this;
  }

  
  @ApiModelProperty(value = "A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.")
  @JsonProperty("custom_id")
  public String getCustomId() {
    return customId;
  }

  @JsonProperty("custom_id")
  public void setCustomId(String customId) {
    this.customId = customId;
  }

  /**
   * The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported.
   **/
  public BatchRequestInput method(MethodEnum method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(value = "The HTTP method to be used for the request. Currently only `POST` is supported.")
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }

  @JsonProperty("method")
  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  /**
   * The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported.
   **/
  public BatchRequestInput url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

