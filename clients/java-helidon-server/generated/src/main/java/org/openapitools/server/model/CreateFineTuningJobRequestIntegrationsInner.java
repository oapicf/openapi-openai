package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateFineTuningJobRequestIntegrationsInner   {


    /**
    * The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
    */
    public enum TypeEnum {
        WANDB("wandb");

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
    private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

    /**
     * Default constructor.
     */
    public CreateFineTuningJobRequestIntegrationsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateFineTuningJobRequestIntegrationsInner.
     *
     * @param type The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported. 
     * @param wandb wandb
     */
    public CreateFineTuningJobRequestIntegrationsInner(
        TypeEnum type, 
        CreateFineTuningJobRequestIntegrationsInnerWandb wandb
    ) {
        this.type = type;
        this.wandb = wandb;
    }



    /**
     * The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get wandb
     * @return wandb
     */
    public CreateFineTuningJobRequestIntegrationsInnerWandb getWandb() {
        return wandb;
    }

    public void setWandb(CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
        this.wandb = wandb;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFineTuningJobRequestIntegrationsInner {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    wandb: ").append(toIndentedString(wandb)).append("\n");
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

