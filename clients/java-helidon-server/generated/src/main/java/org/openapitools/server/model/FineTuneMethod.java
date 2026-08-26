package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FineTuneDPOMethod;
import org.openapitools.server.model.FineTuneSupervisedMethod;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The method used for fine-tuning.
 */
public class FineTuneMethod   {


    /**
    * The type of method. Is either `supervised` or `dpo`.
    */
    public enum TypeEnum {
        SUPERVISED("supervised"),
        DPO("dpo");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private FineTuneSupervisedMethod supervised;
    private FineTuneDPOMethod dpo;

    /**
     * Default constructor.
     */
    public FineTuneMethod() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuneMethod.
     *
     * @param type The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;.
     * @param supervised supervised
     * @param dpo dpo
     */
    public FineTuneMethod(
        TypeEnum type, 
        FineTuneSupervisedMethod supervised, 
        FineTuneDPOMethod dpo
    ) {
        this.type = type;
        this.supervised = supervised;
        this.dpo = dpo;
    }



    /**
     * The type of method. Is either `supervised` or `dpo`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get supervised
     * @return supervised
     */
    public FineTuneSupervisedMethod getSupervised() {
        return supervised;
    }

    public void setSupervised(FineTuneSupervisedMethod supervised) {
        this.supervised = supervised;
    }

    /**
     * Get dpo
     * @return dpo
     */
    public FineTuneDPOMethod getDpo() {
        return dpo;
    }

    public void setDpo(FineTuneDPOMethod dpo) {
        this.dpo = dpo;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuneMethod {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    supervised: ").append(toIndentedString(supervised)).append("\n");
        sb.append("    dpo: ").append(toIndentedString(dpo)).append("\n");
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

