package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Model;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListModelsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-16T01:13:12.257183065Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListModelsResponse {

  private String _object;

  @Valid
  private List<@Valid Model> data = new ArrayList<>();

  public ListModelsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListModelsResponse(String _object, List<@Valid Model> data) {
    this._object = _object;
    this.data = data;
  }

  public ListModelsResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
  */
  @NotNull 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public ListModelsResponse data(List<@Valid Model> data) {
    this.data = data;
    return this;
  }

  public ListModelsResponse addDataItem(Model dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid Model> getData() {
    return data;
  }

  public void setData(List<@Valid Model> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListModelsResponse listModelsResponse = (ListModelsResponse) o;
    return Objects.equals(this._object, listModelsResponse._object) &&
        Objects.equals(this.data, listModelsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListModelsResponse {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

