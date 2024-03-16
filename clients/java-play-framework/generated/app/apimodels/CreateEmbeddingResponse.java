package apimodels;

import apimodels.CreateEmbeddingResponseDataInner;
import apimodels.CreateEmbeddingResponseUsage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateEmbeddingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateEmbeddingResponse   {
  @JsonProperty("object")
  @NotNull

  private String _object;

  @JsonProperty("model")
  @NotNull

  private String model;

  @JsonProperty("data")
  @NotNull
@Valid

  private List<@Valid CreateEmbeddingResponseDataInner> data = new ArrayList<>();

  @JsonProperty("usage")
  @NotNull
@Valid

  private CreateEmbeddingResponseUsage usage;

  public CreateEmbeddingResponse _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public CreateEmbeddingResponse model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateEmbeddingResponse data(List<@Valid CreateEmbeddingResponseDataInner> data) {
    this.data = data;
    return this;
  }

  public CreateEmbeddingResponse addDataItem(CreateEmbeddingResponseDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<@Valid CreateEmbeddingResponseDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid CreateEmbeddingResponseDataInner> data) {
    this.data = data;
  }

  public CreateEmbeddingResponse usage(CreateEmbeddingResponseUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

