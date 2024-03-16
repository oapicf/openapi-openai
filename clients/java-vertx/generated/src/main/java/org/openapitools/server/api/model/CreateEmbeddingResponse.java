package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CreateEmbeddingResponseDataInner;
import org.openapitools.server.api.model.CreateEmbeddingResponseUsage;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEmbeddingResponse   {
  
  private String _object;
  private String model;
  private List<CreateEmbeddingResponseDataInner> data = new ArrayList<>();
  private CreateEmbeddingResponseUsage usage;

  public CreateEmbeddingResponse () {

  }

  public CreateEmbeddingResponse (String _object, String model, List<CreateEmbeddingResponseDataInner> data, CreateEmbeddingResponseUsage usage) {
    this._object = _object;
    this.model = model;
    this.data = data;
    this.usage = usage;
  }

    
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("data")
  public List<CreateEmbeddingResponseDataInner> getData() {
    return data;
  }
  public void setData(List<CreateEmbeddingResponseDataInner> data) {
    this.data = data;
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
    return Objects.equals(_object, createEmbeddingResponse._object) &&
        Objects.equals(model, createEmbeddingResponse.model) &&
        Objects.equals(data, createEmbeddingResponse.data) &&
        Objects.equals(usage, createEmbeddingResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, model, data, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingResponse {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
