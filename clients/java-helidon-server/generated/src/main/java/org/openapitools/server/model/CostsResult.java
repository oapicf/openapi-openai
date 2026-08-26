package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CostsResultAmount;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The aggregated costs details of the specific time bucket.
 */
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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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


    private ObjectEnum _object;
    private CostsResultAmount amount;
    private String lineItem;
    private String projectId;

    /**
     * Default constructor.
     */
    public CostsResult() {
    // JSON-B / Jackson
    }

    /**
     * Create CostsResult.
     *
     * @param _object _object
     * @param amount amount
     * @param lineItem When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result.
     * @param projectId When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result.
     */
    public CostsResult(
        ObjectEnum _object, 
        CostsResultAmount amount, 
        String lineItem, 
        String projectId
    ) {
        this._object = _object;
        this.amount = amount;
        this.lineItem = lineItem;
        this.projectId = projectId;
    }



    /**
     * Get _object
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * Get amount
     * @return amount
     */
    public CostsResultAmount getAmount() {
        return amount;
    }

    public void setAmount(CostsResultAmount amount) {
        this.amount = amount;
    }

    /**
     * When `group_by=line_item`, this field provides the line item of the grouped costs result.
     * @return lineItem
     */
    public String getLineItem() {
        return lineItem;
    }

    public void setLineItem(String lineItem) {
        this.lineItem = lineItem;
    }

    /**
     * When `group_by=project_id`, this field provides the project ID of the grouped costs result.
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

