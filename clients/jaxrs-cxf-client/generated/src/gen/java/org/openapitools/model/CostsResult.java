package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CostsResultAmount;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The aggregated costs details of the specific time bucket.
 */
@ApiModel(description="The aggregated costs details of the specific time bucket.")

public class CostsResult  {
  
public enum ObjectEnum {

ORGANIZATION_COSTS_RESULT(String.valueOf("organization.costs.result"));


    private String value;

    ObjectEnum (String v) {
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

  @ApiModelProperty(required = true, value = "")

  private ObjectEnum _object;

  @ApiModelProperty(value = "")

  private CostsResultAmount amount;

 /**
  * When `group_by=line_item`, this field provides the line item of the grouped costs result.
  */
  @ApiModelProperty(value = "When `group_by=line_item`, this field provides the line item of the grouped costs result.")

  private String lineItem;

 /**
  * When `group_by=project_id`, this field provides the project ID of the grouped costs result.
  */
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped costs result.")

  private String projectId;
 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public CostsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("amount")
  public CostsResultAmount getAmount() {
    return amount;
  }

  public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }

  public CostsResult amount(CostsResultAmount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result.
   * @return lineItem
  **/
  @JsonProperty("line_item")
  public String getLineItem() {
    return lineItem;
  }

  public void setLineItem(String lineItem) {
    this.lineItem = lineItem;
  }

  public CostsResult lineItem(String lineItem) {
    this.lineItem = lineItem;
    return this;
  }

 /**
   * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result.
   * @return projectId
  **/
  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public CostsResult projectId(String projectId) {
    this.projectId = projectId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

