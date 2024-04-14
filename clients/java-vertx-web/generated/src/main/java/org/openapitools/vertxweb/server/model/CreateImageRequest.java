package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateImageRequestModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public CreateImageRequest () {

  }

  public CreateImageRequest (String prompt, CreateImageRequestModel model, Integer n, QualityEnum quality, ResponseFormatEnum responseFormat, SizeEnum size, StyleEnum style, String user) {
    this.prompt = prompt;
    this.model = model;
    this.n = n;
    this.quality = quality;
    this.responseFormat = responseFormat;
    this.size = size;
    this.style = style;
    this.user = user;
  }

    
  @JsonProperty("prompt")
  public String getPrompt() {
    return prompt;
  }
  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

    
  @JsonProperty("model")
  public CreateImageRequestModel getModel() {
    return model;
  }
  public void setModel(CreateImageRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }

    
  @JsonProperty("quality")
  public QualityEnum getQuality() {
    return quality;
  }
  public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }

    
  @JsonProperty("response_format")
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }
  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

    
  @JsonProperty("size")
  public SizeEnum getSize() {
    return size;
  }
  public void setSize(SizeEnum size) {
    this.size = size;
  }

    
  @JsonProperty("style")
  public StyleEnum getStyle() {
    return style;
  }
  public void setStyle(StyleEnum style) {
    this.style = style;
  }

    
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
