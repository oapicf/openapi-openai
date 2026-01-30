package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ChatCompletionRequestMessageContentPartImageImageUrl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatCompletionRequestMessageContentPartImageImageUrl   {
  @JsonProperty("url")
  @NotNull
@Valid

  private URI url;

  /**
   * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
   */
  public enum DetailEnum {
    AUTO("auto"),
    
    LOW("low"),
    
    HIGH("high");

    private final String value;

    DetailEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DetailEnum fromValue(String value) {
      for (DetailEnum b : DetailEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("detail")
  
  private DetailEnum detail = DetailEnum.AUTO;

  public ChatCompletionRequestMessageContentPartImageImageUrl url(URI url) {
    this.url = url;
    return this;
  }

   /**
   * Either a URL of the image or the base64 encoded image data.
   * @return url
  **/
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public ChatCompletionRequestMessageContentPartImageImageUrl detail(DetailEnum detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
   * @return detail
  **/
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
    ChatCompletionRequestMessageContentPartImageImageUrl chatCompletionRequestMessageContentPartImageImageUrl = (ChatCompletionRequestMessageContentPartImageImageUrl) o;
    return Objects.equals(url, chatCompletionRequestMessageContentPartImageImageUrl.url) &&
        Objects.equals(detail, chatCompletionRequestMessageContentPartImageImageUrl.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, detail);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageContentPartImageImageUrl {\n");
    
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

