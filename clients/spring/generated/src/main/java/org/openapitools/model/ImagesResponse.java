package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ImagesResponseDataInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ImagesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ImagesResponse {

  private Integer created;

  @Valid
  private List<@Valid ImagesResponseDataInner> data = new ArrayList<>();

  public ImagesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ImagesResponse(Integer created, List<@Valid ImagesResponseDataInner> data) {
    this.created = created;
    this.data = data;
  }

  public ImagesResponse created(Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @NotNull 
  @Schema(name = "created", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public ImagesResponse data(List<@Valid ImagesResponseDataInner> data) {
    this.data = data;
    return this;
  }

  public ImagesResponse addDataItem(ImagesResponseDataInner dataItem) {
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
  public List<@Valid ImagesResponseDataInner> getData() {
    return data;
  }

  public void setData(List<@Valid ImagesResponseDataInner> data) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

