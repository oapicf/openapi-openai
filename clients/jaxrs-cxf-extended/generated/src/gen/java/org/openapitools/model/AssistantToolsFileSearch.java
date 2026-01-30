package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AssistantToolsFileSearchFileSearch;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssistantToolsFileSearch  {
  
public enum TypeEnum {

    @JsonProperty("file_search") FILE_SEARCH(String.valueOf("file_search"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The type of tool being defined: `file_search`
  */
  @ApiModelProperty(required = true, value = "The type of tool being defined: `file_search`")
  private TypeEnum type;

  @ApiModelProperty(value = "")
  @Valid
  private AssistantToolsFileSearchFileSearch fileSearch;
 /**
  * The type of tool being defined: &#x60;file_search&#x60;
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public AssistantToolsFileSearch type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get fileSearch
  * @return fileSearch
  */
  @JsonProperty("file_search")
  public AssistantToolsFileSearchFileSearch getFileSearch() {
    return fileSearch;
  }

  /**
   * Sets the <code>fileSearch</code> property.
   */
 public void setFileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  /**
   * Sets the <code>fileSearch</code> property.
   */
  public AssistantToolsFileSearch fileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
    this.fileSearch = fileSearch;
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
    AssistantToolsFileSearch assistantToolsFileSearch = (AssistantToolsFileSearch) o;
    return Objects.equals(this.type, assistantToolsFileSearch.type) &&
        Objects.equals(this.fileSearch, assistantToolsFileSearch.fileSearch);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

