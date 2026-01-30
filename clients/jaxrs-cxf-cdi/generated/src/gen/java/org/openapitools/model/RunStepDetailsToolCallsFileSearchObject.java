package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchObjectFileSearch;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class RunStepDetailsToolCallsFileSearchObject   {
  
  private String id;


public enum TypeEnum {

    @JsonProperty("file_search") FILE_SEARCH(String.valueOf("file_search"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

  /**
   * The ID of the tool call object.
   **/
  public RunStepDetailsToolCallsFileSearchObject id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the tool call object.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call.
   **/
  public RunStepDetailsToolCallsFileSearchObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of tool call. This is always going to be `file_search` for this type of tool call.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public RunStepDetailsToolCallsFileSearchObject fileSearch(RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("file_search")
  @NotNull
  public RunStepDetailsToolCallsFileSearchObjectFileSearch getFileSearch() {
    return fileSearch;
  }
  public void setFileSearch(RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
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
    RunStepDetailsToolCallsFileSearchObject runStepDetailsToolCallsFileSearchObject = (RunStepDetailsToolCallsFileSearchObject) o;
    return Objects.equals(this.id, runStepDetailsToolCallsFileSearchObject.id) &&
        Objects.equals(this.type, runStepDetailsToolCallsFileSearchObject.type) &&
        Objects.equals(this.fileSearch, runStepDetailsToolCallsFileSearchObject.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, fileSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFileSearchObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

