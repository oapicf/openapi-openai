package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CostsResultAmount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The aggregated costs details of the specific time bucket.
 */
@ApiModel(description = "The aggregated costs details of the specific time bucket.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("amount")
  private CostsResultAmount amount;

  @JsonProperty("line_item")
  private String lineItem;

  @JsonProperty("project_id")
  private String projectId;

  public CostsResult _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @ApiModelProperty(required = true, value = "")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public CostsResult amount(CostsResultAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @ApiModelProperty(value = "")
  public CostsResultAmount getAmount() {
    return amount;
  }

  public void setAmount(CostsResultAmount amount) {
    this.amount = amount;
  }

  public CostsResult lineItem(String lineItem) {
    this.lineItem = lineItem;
    return this;
  }

  /**
   * When `group_by=line_item`, this field provides the line item of the grouped costs result.
   * @return lineItem
   */
  @ApiModelProperty(value = "When `group_by=line_item`, this field provides the line item of the grouped costs result.")
  public String getLineItem() {
    return lineItem;
  }

  public void setLineItem(String lineItem) {
    this.lineItem = lineItem;
  }

  public CostsResult projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * When `group_by=project_id`, this field provides the project ID of the grouped costs result.
   * @return projectId
   */
  @ApiModelProperty(value = "When `group_by=project_id`, this field provides the project ID of the grouped costs result.")
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

