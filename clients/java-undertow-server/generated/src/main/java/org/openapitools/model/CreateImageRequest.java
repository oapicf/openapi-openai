/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI document version: 2.0.0
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-16T01:12:58.923191288Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateImageRequest   {
  
  private String prompt;
  private Integer n = 1;


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
      return value;
    }
  }

  private SizeEnum size = SizeEnum._1024X1024;


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
  private String user;

  /**
   * A text description of the desired image(s). The maximum length is 1000 characters.
   */
  public CreateImageRequest prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  
  @ApiModelProperty(example = "A cute baby sea otter", required = true, value = "A text description of the desired image(s). The maximum length is 1000 characters.")
  @JsonProperty("prompt")
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
   */
  public CreateImageRequest n(Integer n) {
    this.n = n;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "The number of images to generate. Must be between 1 and 10.")
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }

  /**
   * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
   */
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
   * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
   */
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
   */
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
    return Objects.equals(prompt, createImageRequest.prompt) &&
        Objects.equals(n, createImageRequest.n) &&
        Objects.equals(size, createImageRequest.size) &&
        Objects.equals(responseFormat, createImageRequest.responseFormat) &&
        Objects.equals(user, createImageRequest.user);
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

