package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The per-line object of the batch input file
 */

@Schema(name = "BatchRequestInput", description = "The per-line object of the batch input file")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchRequestInput {

  private String customId;

  /**
   * The HTTP method to be used for the request. Currently only `POST` is supported.
   */
  public enum MethodEnum {
    POST("POST");

    private final String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  public BatchRequestInput customId(String customId) {
    this.customId = customId;
    return this;
  }

  /**
   * A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
   * @return customId
   */
  
  @Schema(name = "custom_id", description = "A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_id")
  public String getCustomId() {
    return customId;
  }

  public void setCustomId(String customId) {
    this.customId = customId;
  }

  public BatchRequestInput method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * The HTTP method to be used for the request. Currently only `POST` is supported.
   * @return method
   */
  
  @Schema(name = "method", description = "The HTTP method to be used for the request. Currently only `POST` is supported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public BatchRequestInput url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
   * @return url
   */
  
  @Schema(name = "url", description = "The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

