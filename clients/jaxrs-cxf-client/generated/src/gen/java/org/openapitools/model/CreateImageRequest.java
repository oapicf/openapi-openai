package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateImageRequest  {
  
  @ApiModelProperty(example = "A cute baby sea otter", required = true, value = "A text description of the desired image(s). The maximum length is 1000 characters.")
 /**
   * A text description of the desired image(s). The maximum length is 1000 characters.
  **/
  private String prompt;

  @ApiModelProperty(example = "1", value = "The number of images to generate. Must be between 1 and 10.")
 /**
   * The number of images to generate. Must be between 1 and 10.
  **/
  private Integer n = 1;

public enum SizeEnum {

_256X256(String.valueOf("256x256")), _512X512(String.valueOf("512x512")), _1024X1024(String.valueOf("1024x1024"));


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

  @ApiModelProperty(example = "1024x1024", value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.")
 /**
   * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
  **/
  private SizeEnum size = SizeEnum._1024X1024;

public enum ResponseFormatEnum {

URL(String.valueOf("url")), B64_JSON(String.valueOf("b64_json"));


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

  @ApiModelProperty(example = "url", value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.")
 /**
   * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
  **/
  private ResponseFormatEnum responseFormat = ResponseFormatEnum.URL;

  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
 /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  **/
  private String user;
 /**
   * A text description of the desired image(s). The maximum length is 1000 characters.
   * @return prompt
  **/
  @JsonProperty("prompt")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public CreateImageRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

 /**
   * The number of images to generate. Must be between 1 and 10.
   * minimum: 1
   * maximum: 10
   * @return n
  **/
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public CreateImageRequest n(Integer n) {
    this.n = n;
    return this;
  }

 /**
   * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
   * @return size
  **/
  @JsonProperty("size")
  public String getSize() {
    if (size == null) {
      return null;
    }
    return size.value();
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }

  public CreateImageRequest size(SizeEnum size) {
    this.size = size;
    return this;
  }

 /**
   * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
   * @return responseFormat
  **/
  @JsonProperty("response_format")
  public String getResponseFormat() {
    if (responseFormat == null) {
      return null;
    }
    return responseFormat.value();
  }

  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

  public CreateImageRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

 /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

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
        Objects.equals(this.n, createImageRequest.n) &&
        Objects.equals(this.size, createImageRequest.size) &&
        Objects.equals(this.responseFormat, createImageRequest.responseFormat) &&
        Objects.equals(this.user, createImageRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, n, size, responseFormat, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateImageRequest {\n");
    
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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

