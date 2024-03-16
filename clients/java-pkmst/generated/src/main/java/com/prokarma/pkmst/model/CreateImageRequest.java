package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateImageRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-16T01:12:49.513446343Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateImageRequest   {
  @JsonProperty("prompt")
  private String prompt;

  @JsonProperty("n")
  private Integer n = 1;

  /**
   * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
   */
  public enum SizeEnum {
    _256X256("256x256"),
    
    _512X512("512x512"),
    
    _1024X1024("1024x1024");

    private String value;

    SizeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SizeEnum fromValue(String text) {
      for (SizeEnum b : SizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("size")
  private SizeEnum size = SizeEnum._1024X1024;

  /**
   * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResponseFormatEnum fromValue(String text) {
      for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("response_format")
  private ResponseFormatEnum responseFormat = ResponseFormatEnum.URL;

  @JsonProperty("user")
  private String user;

  public CreateImageRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

   /**
   * A text description of the desired image(s). The maximum length is 1000 characters.
   * @return prompt
  **/
  @ApiModelProperty(example = "A cute baby sea otter", required = true, value = "A text description of the desired image(s). The maximum length is 1000 characters.")
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public CreateImageRequest n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * The number of images to generate. Must be between 1 and 10.
   * minimum: 1
   * maximum: 10
   * @return n
  **/
  @ApiModelProperty(example = "1", value = "The number of images to generate. Must be between 1 and 10.")
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public CreateImageRequest size(SizeEnum size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
   * @return size
  **/
  @ApiModelProperty(example = "1024x1024", value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.")
  public SizeEnum getSize() {
    return size;
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }

  public CreateImageRequest responseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
   * @return responseFormat
  **/
  @ApiModelProperty(example = "url", value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.")
  public ResponseFormatEnum getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(ResponseFormatEnum responseFormat) {
    this.responseFormat = responseFormat;
  }

  public CreateImageRequest user(String user) {
    this.user = user;
    return this;
  }

   /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  **/
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
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

