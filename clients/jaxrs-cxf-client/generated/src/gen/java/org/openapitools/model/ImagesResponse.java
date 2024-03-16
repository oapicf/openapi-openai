package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ImagesResponseDataInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImagesResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer created;

  @ApiModelProperty(required = true, value = "")
  private List<ImagesResponseDataInner> data = new ArrayList<>();
 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public ImagesResponse created(Integer created) {
    this.created = created;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<ImagesResponseDataInner> getData() {
    return data;
  }

  public void setData(List<ImagesResponseDataInner> data) {
    this.data = data;
  }

  public ImagesResponse data(List<ImagesResponseDataInner> data) {
    this.data = data;
    return this;
  }

  public ImagesResponse addDataItem(ImagesResponseDataInner dataItem) {
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
    ImagesResponse imagesResponse = (ImagesResponse) o;
    return Objects.equals(this.created, imagesResponse.created) &&
        Objects.equals(this.data, imagesResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagesResponse {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

