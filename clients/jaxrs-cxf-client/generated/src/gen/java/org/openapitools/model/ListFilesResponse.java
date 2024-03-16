package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OpenAIFile;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListFilesResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private String _object;

  @ApiModelProperty(required = true, value = "")
  private List<OpenAIFile> data = new ArrayList<>();
 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public ListFilesResponse _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<OpenAIFile> getData() {
    return data;
  }

  public void setData(List<OpenAIFile> data) {
    this.data = data;
  }

  public ListFilesResponse data(List<OpenAIFile> data) {
    this.data = data;
    return this;
  }

  public ListFilesResponse addDataItem(OpenAIFile dataItem) {
    this.data.add(dataItem);
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
    ListFilesResponse listFilesResponse = (ListFilesResponse) o;
    return Objects.equals(this._object, listFilesResponse._object) &&
        Objects.equals(this.data, listFilesResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFilesResponse {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

