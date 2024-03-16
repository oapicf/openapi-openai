package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.OpenAIFile;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListFilesResponse   {
  
  private String _object;
  private List<OpenAIFile> data = new ArrayList<>();

  public ListFilesResponse () {

  }

  public ListFilesResponse (String _object, List<OpenAIFile> data) {
    this._object = _object;
    this.data = data;
  }

    
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

    
  @JsonProperty("data")
  public List<OpenAIFile> getData() {
    return data;
  }
  public void setData(List<OpenAIFile> data) {
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
    ListFilesResponse listFilesResponse = (ListFilesResponse) o;
    return Objects.equals(_object, listFilesResponse._object) &&
        Objects.equals(data, listFilesResponse.data);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
