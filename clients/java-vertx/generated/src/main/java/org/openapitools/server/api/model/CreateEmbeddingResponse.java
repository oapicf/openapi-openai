package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CreateEmbeddingResponseUsage;
import org.openapitools.server.api.model.Embedding;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEmbeddingResponse   {
  
  private List<Embedding> data = new ArrayList<>();
  private String model;


  public enum ObjectEnum {
    LIST("list");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private CreateEmbeddingResponseUsage usage;

  public CreateEmbeddingResponse () {

  }

  public CreateEmbeddingResponse (List<Embedding> data, String model, ObjectEnum _object, CreateEmbeddingResponseUsage usage) {
    this.data = data;
    this.model = model;
    this._object = _object;
    this.usage = usage;
  }

    
  @JsonProperty("data")
  public List<Embedding> getData() {
    return data;
  }
  public void setData(List<Embedding> data) {
    this.data = data;
  }

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("usage")
  public CreateEmbeddingResponseUsage getUsage() {
    return usage;
  }
  public void setUsage(CreateEmbeddingResponseUsage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmbeddingResponse createEmbeddingResponse = (CreateEmbeddingResponse) o;
    return Objects.equals(data, createEmbeddingResponse.data) &&
        Objects.equals(model, createEmbeddingResponse.model) &&
        Objects.equals(_object, createEmbeddingResponse._object) &&
        Objects.equals(usage, createEmbeddingResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, model, _object, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
