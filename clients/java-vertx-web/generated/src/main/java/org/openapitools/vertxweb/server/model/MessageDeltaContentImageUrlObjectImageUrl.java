package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageDeltaContentImageUrlObjectImageUrl   {
  
  private String url;


  public enum DetailEnum {
    AUTO("auto"),
    LOW("low"),
    HIGH("high");

    private String value;

    DetailEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DetailEnum detail = DetailEnum.AUTO;

  public MessageDeltaContentImageUrlObjectImageUrl () {

  }

  public MessageDeltaContentImageUrlObjectImageUrl (String url, DetailEnum detail) {
    this.url = url;
    this.detail = detail;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("detail")
  public DetailEnum getDetail() {
    return detail;
  }
  public void setDetail(DetailEnum detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaContentImageUrlObjectImageUrl messageDeltaContentImageUrlObjectImageUrl = (MessageDeltaContentImageUrlObjectImageUrl) o;
    return Objects.equals(url, messageDeltaContentImageUrlObjectImageUrl.url) &&
        Objects.equals(detail, messageDeltaContentImageUrlObjectImageUrl.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentImageUrlObjectImageUrl {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
