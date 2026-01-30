package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CreateEmbeddingRequestInput;
import org.openapitools.model.CreateEmbeddingRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateEmbeddingRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateEmbeddingRequestInput input;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateEmbeddingRequestModel model;

public enum EncodingFormatEnum {

    @JsonProperty("float") FLOAT(String.valueOf("float")),
    @JsonProperty("base64") BASE64(String.valueOf("base64"));

    private String value;

    EncodingFormatEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EncodingFormatEnum fromValue(String value) {
        for (EncodingFormatEnum b : EncodingFormatEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
  */
  @ApiModelProperty(example = "float", value = "The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).")
  private EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT;

 /**
  * The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
  */
  @ApiModelProperty(value = "The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. ")
  private Integer dimensions;

 /**
  * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  */
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). ")
  private String user;
 /**
  * Get input
  * @return input
  */
  @JsonProperty("input")
  @NotNull
  public CreateEmbeddingRequestInput getInput() {
    return input;
  }

  /**
   * Sets the <code>input</code> property.
   */
 public void setInput(CreateEmbeddingRequestInput input) {
    this.input = input;
  }

  /**
   * Sets the <code>input</code> property.
   */
  public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
    this.input = input;
    return this;
  }

 /**
  * Get model
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public CreateEmbeddingRequestModel getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public CreateEmbeddingRequest model(CreateEmbeddingRequestModel model) {
    this.model = model;
    return this;
  }

 /**
  * The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
  * @return encodingFormat
  */
  @JsonProperty("encoding_format")
  public String getEncodingFormat() {
    return encodingFormat == null ? null : encodingFormat.value();
  }

  /**
   * Sets the <code>encodingFormat</code> property.
   */
 public void setEncodingFormat(EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
  }

  /**
   * Sets the <code>encodingFormat</code> property.
   */
  public CreateEmbeddingRequest encodingFormat(EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
    return this;
  }

 /**
  * The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models. 
  * minimum: 1
  * @return dimensions
  */
  @JsonProperty("dimensions")
 @Min(1)  public Integer getDimensions() {
    return dimensions;
  }

  /**
   * Sets the <code>dimensions</code> property.
   */
 public void setDimensions(Integer dimensions) {
    this.dimensions = dimensions;
  }

  /**
   * Sets the <code>dimensions</code> property.
   */
  public CreateEmbeddingRequest dimensions(Integer dimensions) {
    this.dimensions = dimensions;
    return this;
  }

 /**
  * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
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
  public CreateEmbeddingRequest user(String user) {
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
    CreateEmbeddingRequest createEmbeddingRequest = (CreateEmbeddingRequest) o;
    return Objects.equals(this.input, createEmbeddingRequest.input) &&
        Objects.equals(this.model, createEmbeddingRequest.model) &&
        Objects.equals(this.encodingFormat, createEmbeddingRequest.encodingFormat) &&
        Objects.equals(this.dimensions, createEmbeddingRequest.dimensions) &&
        Objects.equals(this.user, createEmbeddingRequest.user);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

