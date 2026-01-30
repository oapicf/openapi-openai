package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CostsResultAmount;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The aggregated costs details of the specific time bucket.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CostsResult   {
  

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_COSTS_RESULT("organization.costs.result");
    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ObjectEnum _object;
  private CostsResultAmount amount;
  private String lineItem;
  private String projectId;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  @Valid
  public CostsResultAmount getAmount() {
    return amount;
  }
  public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }

  /**
   * When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result.
   **/
  
  @ApiModelProperty(value = "When `group_by=line_item`, this field provides the line item of the grouped costs result.")
  @JsonProperty("line_item")
  public String getLineItem() {
    return lineItem;
  }
  public void setLineItem(String lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result.
   **/
  
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped costs result.")
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostsResult costsResult = (CostsResult) o;
    return Objects.equals(this._object, costsResult._object) &&
        Objects.equals(this.amount, costsResult.amount) &&
        Objects.equals(this.lineItem, costsResult.lineItem) &&
        Objects.equals(this.projectId, costsResult.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, amount, lineItem, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostsResult {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

