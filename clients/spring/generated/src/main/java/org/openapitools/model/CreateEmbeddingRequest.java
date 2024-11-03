package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CreateEmbeddingRequestInput;
import org.openapitools.model.CreateEmbeddingRequestModel;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateEmbeddingRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-03T11:16:04.738790927Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateEmbeddingRequest {

  private CreateEmbeddingRequestInput input;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT;

  private Integer dimensions;

  private String user;

  public CreateEmbeddingRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateEmbeddingRequest(CreateEmbeddingRequestInput input, CreateEmbeddingRequestModel model) {
    this.input = input;
    this.model = model;
  }

  public CreateEmbeddingRequest input(CreateEmbeddingRequestInput input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
   */
  @NotNull @Valid 
  @Schema(name = "input", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("input")
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
   */
  @NotNull @Valid 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
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
   */
  
  @Schema(name = "encoding_format", example = "float", description = "The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encoding_format")
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
   */
  @Min(1) 
  @Schema(name = "dimensions", description = "The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dimensions")
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
   */
  
  @Schema(name = "user", example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

