package apimodels;

import apimodels.CreateEmbeddingRequestInput;
import apimodels.CreateEmbeddingRequestModel;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateEmbeddingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateEmbeddingRequest   {
  @JsonProperty("input")
  @NotNull
@Valid

  private CreateEmbeddingRequestInput input;

  @JsonProperty("model")
  @NotNull
@Valid

  private CreateEmbeddingRequestModel model;

  /**
   * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
   */
  public enum EncodingFormatEnum {
    FLOAT("float"),
    
    BASE64("base64");

    private final String value;

    EncodingFormatEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("encoding_format")
  
  private EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT;

  @JsonProperty("dimensions")
  @Min(1)

  private Integer dimensions;

  @JsonProperty("user")
  
  private String user;

  public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  public CreateEmbeddingRequestInput getInput() {
    return input;
  }

  public void setInput(CreateEmbeddingRequestInput input) {
    this.input = input;
  }

  public CreateEmbeddingRequest model(CreateEmbeddingRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public CreateEmbeddingRequestModel getModel() {
    return model;
  }

  public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }

  public CreateEmbeddingRequest encodingFormat(EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
    return this;
  }

   /**
   * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
   * @return encodingFormat
  **/
  public EncodingFormatEnum getEncodingFormat() {
    return encodingFormat;
  }

  public void setEncodingFormat(EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
  }

  public CreateEmbeddingRequest dimensions(Integer dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
   * minimum: 1
   * @return dimensions
  **/
  public Integer getDimensions() {
    return dimensions;
  }

  public void setDimensions(Integer dimensions) {
    this.dimensions = dimensions;
  }

  public CreateEmbeddingRequest user(String user) {
    this.user = user;
    return this;
  }

   /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

