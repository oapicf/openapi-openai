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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateImageRequestModel;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateImageRequest   {
  
  private String prompt;
  private CreateImageRequestModel model = dall-e-2;
  private Integer n = 1;


  public enum QualityEnum {
    STANDARD("standard"),
    HD("hd");

    private String value;

    QualityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private QualityEnum quality = QualityEnum.STANDARD;


  public enum ResponseFormatEnum {
    URL("url"),
    B64_JSON("b64_json");

    private String value;

    ResponseFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ResponseFormatEnum responseFormat = ResponseFormatEnum.URL;


  public enum SizeEnum {
    _256X256("256x256"),
    _512X512("512x512"),
    _1024X1024("1024x1024"),
    _1792X1024("1792x1024"),
    _1024X1792("1024x1792");

    private String value;

    SizeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SizeEnum size = SizeEnum._1024X1024;


  public enum StyleEnum {
    VIVID("vivid"),
    NATURAL("natural");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StyleEnum style = StyleEnum.VIVID;
  private String user;

  /**
   * A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
   */
  public CreateImageRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  
  @ApiModelProperty(example = "A cute baby sea otter", required = true, value = "A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.")
  @JsonProperty("prompt")
  public String getPrompt() {
    return prompt;
  }
  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  /**
   */
  public CreateImageRequest model(CreateImageRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("model")
  public CreateImageRequestModel getModel() {
    return model;
  }
  public void setModel(CreateImageRequestModel model) {
    this.model = model;
  }

  /**
   * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
   * minimum: 1
   * maximum: 10
   */
  public CreateImageRequest n(Integer n) {
    this.n = n;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.")
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }

  /**
   * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
   */
  public CreateImageRequest quality(QualityEnum quality) {
    this.quality = quality;
    return this;
  }

  
  @ApiModelProperty(example = "standard", value = "The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.")
  @JsonProperty("quality")
  public QualityEnum getQuality() {
    return quality;
  }
  public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }

  /**
   * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
   */
  public CreateImageRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  
  @ApiModelProperty(example = "url", value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.")
  @JsonProperty("response_format")
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }
  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

  /**
   * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
   */
  public CreateImageRequest size(SizeEnum size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(example = "1024x1024", value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.")
  @JsonProperty("size")
  public SizeEnum getSize() {
    return size;
  }
  public void setSize(SizeEnum size) {
    this.size = size;
  }

  /**
   * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
   */
  public CreateImageRequest style(StyleEnum style) {
    this.style = style;
    return this;
  }

  
  @ApiModelProperty(example = "vivid", value = "The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.")
  @JsonProperty("style")
  public StyleEnum getStyle() {
    return style;
  }
  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
   */
  public CreateImageRequest user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). ")
  @JsonProperty("user")
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

