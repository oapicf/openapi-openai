package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateEmbeddingRequestInput;
import org.openapitools.model.CreateEmbeddingRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CreateEmbeddingRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateEmbeddingRequest   {
  private CreateEmbeddingRequestInput input;
  private CreateEmbeddingRequestModel model;
  public enum EncodingFormatEnum {

    FLOAT(String.valueOf("float")), BASE64(String.valueOf("base64"));


    private String value;

    EncodingFormatEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static EncodingFormatEnum fromString(String s) {
        for (EncodingFormatEnum b : EncodingFormatEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static EncodingFormatEnum fromValue(String value) {
        for (EncodingFormatEnum b : EncodingFormatEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT;
  private Integer dimensions;
  private String user;

  public CreateEmbeddingRequest() {
  }

  @JsonCreator
  public CreateEmbeddingRequest(
    @JsonProperty(required = true, value = "input") CreateEmbeddingRequestInput input,
    @JsonProperty(required = true, value = "model") CreateEmbeddingRequestModel model
  ) {
    this.input = input;
    this.model = model;
  }

  /**
   **/
  public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "input")
  @NotNull @Valid public CreateEmbeddingRequestInput getInput() {
    return input;
  }

  @JsonProperty(required = true, value = "input")
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
  @JsonProperty(required = true, value = "model")
  @NotNull @Valid public CreateEmbeddingRequestModel getModel() {
    return model;
  }

  @JsonProperty(required = true, value = "model")
  public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }

  /**
   * The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
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

  @JsonProperty("encoding_format")
  public void setEncodingFormat(EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
  }

  /**
   * The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models. 
   * minimum: 1
   **/
  public CreateEmbeddingRequest dimensions(Integer dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  
  @ApiModelProperty(value = "The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. ")
  @JsonProperty("dimensions")
   @Min(1)public Integer getDimensions() {
    return dimensions;
  }

  @JsonProperty("dimensions")
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

  @JsonProperty("user")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

