package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationRequestModel   {
  

  public CreateModerationRequestModel () {

  }

  public CreateModerationRequestModel () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationRequestModel createModerationRequestModel = (CreateModerationRequestModel) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationRequestModel {\n");
    
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
