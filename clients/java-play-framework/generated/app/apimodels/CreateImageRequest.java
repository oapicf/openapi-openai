package apimodels;

import apimodels.CreateImageRequestModel;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateImageRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateImageRequest   {
  @JsonProperty("prompt")
  @NotNull

  private String prompt;

  @JsonProperty("model")
  @Valid

  private CreateImageRequestModel model = dall-e-2;

  @JsonProperty("n")
  @Min(1)
@Max(10)

  private Integer n = 1;

  /**
   * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
   */
  public enum QualityEnum {
    STANDARD("standard"),
    
    HD("hd");

    private final String value;

    QualityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QualityEnum fromValue(String value) {
      for (QualityEnum b : QualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("quality")
  
  private QualityEnum quality = QualityEnum.STANDARD;

  /**
   * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
   */
  public enum ResponseFormatEnum {
    URL("url"),
    
    B64_JSON("b64_json");

    private final String value;

    ResponseFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResponseFormatEnum fromValue(String value) {
      for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("response_format")
  
  private ResponseFormatEnum responseFormat = ResponseFormatEnum.URL;

  /**
   * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
   */
  public enum SizeEnum {
    _256X256("256x256"),
    
    _512X512("512x512"),
    
    _1024X1024("1024x1024"),
    
    _1792X1024("1792x1024"),
    
    _1024X1792("1024x1792");

    private final String value;

    SizeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SizeEnum fromValue(String value) {
      for (SizeEnum b : SizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("size")
  
  private SizeEnum size = SizeEnum._1024X1024;

  /**
   * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
   */
  public enum StyleEnum {
    VIVID("vivid"),
    
    NATURAL("natural");

    private final String value;

    StyleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StyleEnum fromValue(String value) {
      for (StyleEnum b : StyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("style")
  
  private StyleEnum style = StyleEnum.VIVID;

  @JsonProperty("user")
  
  private String user;

  public CreateImageRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
   * @return prompt
  **/
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public CreateImageRequest model(CreateImageRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public CreateImageRequestModel getModel() {
    return model;
  }

  public void setModel(CreateImageRequestModel model) {
    this.model = model;
  }

  public CreateImageRequest n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
   * minimum: 1
   * maximum: 10
   * @return n
  **/
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public CreateImageRequest quality(QualityEnum quality) {
    this.quality = quality;
    return this;
  }

   /**
   * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
   * @return quality
  **/
  public QualityEnum getQuality() {
    return quality;
  }

  public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }

  public CreateImageRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
   * @return responseFormat
  **/
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

  public CreateImageRequest size(SizeEnum size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
   * @return size
  **/
  public SizeEnum getSize() {
    return size;
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }

  public CreateImageRequest style(StyleEnum style) {
    this.style = style;
    return this;
  }

   /**
   * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
   * @return style
  **/
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public CreateImageRequest user(String user) {
    this.user = user;
    return this;
  }

   /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  **/
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateImageRequest createImageRequest = (CreateImageRequest) o;
    return Objects.equals(prompt, createImageRequest.prompt) &&
        Objects.equals(model, createImageRequest.model) &&
        Objects.equals(n, createImageRequest.n) &&
        Objects.equals(quality, createImageRequest.quality) &&
        Objects.equals(responseFormat, createImageRequest.responseFormat) &&
        Objects.equals(size, createImageRequest.size) &&
        Objects.equals(style, createImageRequest.style) &&
        Objects.equals(user, createImageRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, model, n, quality, responseFormat, size, style, user);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateImageRequest {\n");
    
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

