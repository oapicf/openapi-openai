/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssistantToolsFileSearchFileSearch;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantToolsFileSearch   {
  


  public enum TypeEnum {
    FILE_SEARCH("file_search");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private AssistantToolsFileSearchFileSearch fileSearch;

  /**
   * The type of tool being defined: `file_search`
   */
  public AssistantToolsFileSearch type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of tool being defined: `file_search`")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   */
  public AssistantToolsFileSearch fileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("file_search")
  public AssistantToolsFileSearchFileSearch getFileSearch() {
    return fileSearch;
  }
  public void setFileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantToolsFileSearch assistantToolsFileSearch = (AssistantToolsFileSearch) o;
    return Objects.equals(type, assistantToolsFileSearch.type) &&
        Objects.equals(fileSearch, assistantToolsFileSearch.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fileSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantToolsFileSearch {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
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

