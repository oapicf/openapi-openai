package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CreateImageRequest   {
  
  private String prompt;

  private Integer n = 1;


public enum SizeEnum {

    @JsonProperty("256x256") _256X256(String.valueOf("256x256")), @JsonProperty("512x512") _512X512(String.valueOf("512x512")), @JsonProperty("1024x1024") _1024X1024(String.valueOf("1024x1024"));


    private String value;

    SizeEnum(String v) {
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

  private SizeEnum size = SizeEnum._1024X1024;


public enum ResponseFormatEnum {

    @JsonProperty("url") URL(String.valueOf("url")), @JsonProperty("b64_json") B64_JSON(String.valueOf("b64_json"));


    private String value;

    ResponseFormatEnum(String v) {
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

  private ResponseFormatEnum responseFormat = ResponseFormatEnum.URL;

  private String user;

  /**
   * A text description of the desired image(s). The maximum length is 1000 characters.
   **/
  public CreateImageRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  
  @ApiModelProperty(example = "A cute baby sea otter", required = true, value = "A text description of the desired image(s). The maximum length is 1000 characters.")
  @JsonProperty("prompt")
  @NotNull
  public String getPrompt() {
    return prompt;
  }
  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }


  /**
   * The number of images to generate. Must be between 1 and 10.
   * minimum: 1
   * maximum: 10
   **/
  public CreateImageRequest n(Integer n) {
    this.n = n;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "The number of images to generate. Must be between 1 and 10.")
  @JsonProperty("n")
 @Min(1) @Max(10)  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }


  /**
   * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
   **/
  public CreateImageRequest size(SizeEnum size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(example = "1024x1024", value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.")
  @JsonProperty("size")
  public SizeEnum getSize() {
    return size;
  }
  public void setSize(SizeEnum size) {
    this.size = size;
  }


  /**
   * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
   **/
  public CreateImageRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  
  @ApiModelProperty(example = "url", value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.")
  @JsonProperty("response_format")
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }
  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }


  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   **/
  public CreateImageRequest user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

