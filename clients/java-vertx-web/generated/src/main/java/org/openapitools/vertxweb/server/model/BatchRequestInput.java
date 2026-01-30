package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The per-line object of the batch input file
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public BatchRequestInput () {

  }

  public BatchRequestInput (String customId, MethodEnum method, String url) {
    this.customId = customId;
    this.method = method;
    this.url = url;
  }

    
  @JsonProperty("custom_id")
  public String getCustomId() {
    return customId;
  }
  public void setCustomId(String customId) {
    this.customId = customId;
  }

    
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }
  public void setMethod(MethodEnum method) {
    this.method = method;
  }

    
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
