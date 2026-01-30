package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CostsResultAmount;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The aggregated costs details of the specific time bucket.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The aggregated costs details of the specific time bucket.")
public class CostsResult   {
  

public enum ObjectEnum {

    @JsonProperty("organization.costs.result") ORGANIZATION_COSTS_RESULT(String.valueOf("organization.costs.result"));


    private String value;

    ObjectEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ObjectEnum _object;

  private CostsResultAmount amount;

  private String lineItem;

  private String projectId;

  /**
   **/
  public CostsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
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
  public CostsResult amount(CostsResultAmount amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("amount")
  public CostsResultAmount getAmount() {
    return amount;
  }
  public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }


  /**
   * When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result.
   **/
  public CostsResult lineItem(String lineItem) {
    this.lineItem = lineItem;
    return this;
  }

  
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
  public CostsResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  
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

