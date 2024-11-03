package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.CreateEmbeddingRequestInput;
import org.openapitools.server.api.model.CreateEmbeddingRequestModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEmbeddingRequest   {
  
  private CreateEmbeddingRequestInput input;
  private CreateEmbeddingRequestModel model;


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
      return value;
    }
  }

  private EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT;
  private Integer dimensions;
  private String user;

  public CreateEmbeddingRequest () {

  }

  public CreateEmbeddingRequest (CreateEmbeddingRequestInput input, CreateEmbeddingRequestModel model, EncodingFormatEnum encodingFormat, Integer dimensions, String user) {
    this.input = input;
    this.model = model;
    this.encodingFormat = encodingFormat;
    this.dimensions = dimensions;
    this.user = user;
  }

    
  @JsonProperty("input")
  public CreateEmbeddingRequestInput getInput() {
    return input;
  }
  public void setInput(CreateEmbeddingRequestInput input) {
    this.input = input;
  }

    
  @JsonProperty("model")
  public CreateEmbeddingRequestModel getModel() {
    return model;
  }
  public void setModel(CreateEmbeddingRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("encoding_format")
  public EncodingFormatEnum getEncodingFormat() {
    return encodingFormat;
  }
  public void setEncodingFormat(EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
  }

    
  @JsonProperty("dimensions")
  public Integer getDimensions() {
    return dimensions;
  }
  public void setDimensions(Integer dimensions) {
    this.dimensions = dimensions;
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
