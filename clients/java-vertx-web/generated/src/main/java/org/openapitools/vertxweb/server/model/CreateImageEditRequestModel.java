package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The model to use for image generation. Only &#x60;dall-e-2&#x60; is supported at this time.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateImageEditRequestModel   {
  

  public CreateImageEditRequestModel () {

  }

  public CreateImageEditRequestModel () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateImageEditRequestModel createImageEditRequestModel = (CreateImageEditRequestModel) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateImageEditRequestModel {\n");
    
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
