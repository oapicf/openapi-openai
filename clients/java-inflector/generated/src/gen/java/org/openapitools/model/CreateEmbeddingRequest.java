package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateEmbeddingRequestInput;
import org.openapitools.model.CreateEmbeddingRequestModel;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateEmbeddingRequest   {
  @JsonProperty("input")
  private CreateEmbeddingRequestInput input;

  @JsonProperty("model")
  private CreateEmbeddingRequestModel model;

  /**
   * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
   */
  public enum EncodingFormatEnum {
    FLOAT("float"),
    
    BASE64("base64");

    private String value;

    EncodingFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EncodingFormatEnum fromValue(String text) {
      for (EncodingFormatEnum b : EncodingFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("encoding_format")
  private EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT;

  @JsonProperty("dimensions")
  private Integer dimensions;

  @JsonProperty("user")
  private String user;

  /**
   **/
  public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("input")
  public CreateEmbeddingRequestInput getInput() {
    return input;
  }
  public void setInput(CreateEmbeddingRequestInput input) {
    this.input = input;
  }

  /**
   **/
  public CreateEmbeddingRequest model(CreateEmbeddingRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  public CreateEmbeddingRequestModel getModel() {
    return model;
  }
  public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }

  /**
   * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
   **/
  public CreateEmbeddingRequest encodingFormat(EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
    return this;
  }

  
  @ApiModelProperty(example = "float", value = "The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).")
  @JsonProperty("encoding_format")
  public EncodingFormatEnum getEncodingFormat() {
    return encodingFormat;
  }
  public void setEncodingFormat(EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
  }

  /**
   * The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
   * minimum: 1
   **/
  public CreateEmbeddingRequest dimensions(Integer dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  
  @ApiModelProperty(value = "The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. ")
  @JsonProperty("dimensions")
  public Integer getDimensions() {
    return dimensions;
  }
  public void setDimensions(Integer dimensions) {
    this.dimensions = dimensions;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
   **/
  public CreateEmbeddingRequest user(String user) {
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
    CreateEmbeddingRequest createEmbeddingRequest = (CreateEmbeddingRequest) o;
    return Objects.equals(input, createEmbeddingRequest.input) &&
        Objects.equals(model, createEmbeddingRequest.model) &&
        Objects.equals(encodingFormat, createEmbeddingRequest.encodingFormat) &&
        Objects.equals(dimensions, createEmbeddingRequest.dimensions) &&
        Objects.equals(user, createEmbeddingRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, model, encodingFormat, dimensions, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingRequest {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    encodingFormat: ").append(toIndentedString(encodingFormat)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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

