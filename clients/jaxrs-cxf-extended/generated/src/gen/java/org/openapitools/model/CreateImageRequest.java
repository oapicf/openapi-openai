package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateImageRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateImageRequest  {
  
 /**
  * A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
  */
  @ApiModelProperty(example = "A cute baby sea otter", required = true, value = "A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.")
  private String prompt;

  @ApiModelProperty(value = "")
  @Valid
  private CreateImageRequestModel model = dall-e-2;

 /**
  * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
  */
  @ApiModelProperty(example = "1", value = "The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.")
  private Integer n = 1;

public enum QualityEnum {

    @JsonProperty("standard") STANDARD(String.valueOf("standard")),
    @JsonProperty("hd") HD(String.valueOf("hd"));

    private String value;

    QualityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static QualityEnum fromValue(String value) {
        for (QualityEnum b : QualityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
  */
  @ApiModelProperty(example = "standard", value = "The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.")
  private QualityEnum quality = QualityEnum.STANDARD;

public enum ResponseFormatEnum {

    @JsonProperty("url") URL(String.valueOf("url")),
    @JsonProperty("b64_json") B64_JSON(String.valueOf("b64_json"));

    private String value;

    ResponseFormatEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResponseFormatEnum fromValue(String value) {
        for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  */
  @ApiModelProperty(example = "url", value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.")
  private ResponseFormatEnum responseFormat = ResponseFormatEnum.URL;

public enum SizeEnum {

    @JsonProperty("256x256") _256X256(String.valueOf("256x256")),
    @JsonProperty("512x512") _512X512(String.valueOf("512x512")),
    @JsonProperty("1024x1024") _1024X1024(String.valueOf("1024x1024")),
    @JsonProperty("1792x1024") _1792X1024(String.valueOf("1792x1024")),
    @JsonProperty("1024x1792") _1024X1792(String.valueOf("1024x1792"));

    private String value;

    SizeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SizeEnum fromValue(String value) {
        for (SizeEnum b : SizeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
  */
  @ApiModelProperty(example = "1024x1024", value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.")
  private SizeEnum size = SizeEnum._1024X1024;

public enum StyleEnum {

    @JsonProperty("vivid") VIVID(String.valueOf("vivid")),
    @JsonProperty("natural") NATURAL(String.valueOf("natural"));

    private String value;

    StyleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StyleEnum fromValue(String value) {
        for (StyleEnum b : StyleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
  */
  @ApiModelProperty(example = "vivid", value = "The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.")
  private StyleEnum style = StyleEnum.VIVID;

 /**
  * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  */
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
  private String user;
 /**
  * A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;.
  * @return prompt
  */
  @JsonProperty("prompt")
  @NotNull
  public String getPrompt() {
    return prompt;
  }

  /**
   * Sets the <code>prompt</code> property.
   */
 public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  /**
   * Sets the <code>prompt</code> property.
   */
  public CreateImageRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

 /**
  * Get model
  * @return model
  */
  @JsonProperty("model")
  public CreateImageRequestModel getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(CreateImageRequestModel model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public CreateImageRequest model(CreateImageRequestModel model) {
    this.model = model;
    return this;
  }

 /**
  * The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
  * minimum: 1
  * maximum: 10
  * @return n
  */
  @JsonProperty("n")
 @Min(1) @Max(10)  public Integer getN() {
    return n;
  }

  /**
   * Sets the <code>n</code> property.
   */
 public void setN(Integer n) {
    this.n = n;
  }

  /**
   * Sets the <code>n</code> property.
   */
  public CreateImageRequest n(Integer n) {
    this.n = n;
    return this;
  }

 /**
  * The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;.
  * @return quality
  */
  @JsonProperty("quality")
  public String getQuality() {
    return quality == null ? null : quality.value();
  }

  /**
   * Sets the <code>quality</code> property.
   */
 public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }

  /**
   * Sets the <code>quality</code> property.
   */
  public CreateImageRequest quality(QualityEnum quality) {
    this.quality = quality;
    return this;
  }

 /**
  * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
  * @return responseFormat
  */
  @JsonProperty("response_format")
  public String getResponseFormat() {
    return responseFormat == null ? null : responseFormat.value();
  }

  /**
   * Sets the <code>responseFormat</code> property.
   */
 public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

  /**
   * Sets the <code>responseFormat</code> property.
   */
  public CreateImageRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

 /**
  * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models.
  * @return size
  */
  @JsonProperty("size")
  public String getSize() {
    return size == null ? null : size.value();
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(SizeEnum size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public CreateImageRequest size(SizeEnum size) {
    this.size = size;
    return this;
  }

 /**
  * The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;.
  * @return style
  */
  @JsonProperty("style")
  public String getStyle() {
    return style == null ? null : style.value();
  }

  /**
   * Sets the <code>style</code> property.
   */
 public void setStyle(StyleEnum style) {
    this.style = style;
  }

  /**
   * Sets the <code>style</code> property.
   */
  public CreateImageRequest style(StyleEnum style) {
    this.style = style;
    return this;
  }

 /**
  * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  * @return user
  */
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(String user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public CreateImageRequest user(String user) {
    this.user = user;
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
    CreateImageRequest createImageRequest = (CreateImageRequest) o;
    return Objects.equals(this.prompt, createImageRequest.prompt) &&
        Objects.equals(this.model, createImageRequest.model) &&
        Objects.equals(this.n, createImageRequest.n) &&
        Objects.equals(this.quality, createImageRequest.quality) &&
        Objects.equals(this.responseFormat, createImageRequest.responseFormat) &&
        Objects.equals(this.size, createImageRequest.size) &&
        Objects.equals(this.style, createImageRequest.style) &&
        Objects.equals(this.user, createImageRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, model, n, quality, responseFormat, size, style, user);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

