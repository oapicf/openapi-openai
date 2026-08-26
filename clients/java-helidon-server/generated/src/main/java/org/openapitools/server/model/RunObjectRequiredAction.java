package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunObjectRequiredActionSubmitToolOutputs;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details on the action required to continue the run. Will be `null` if no action is required.
 */
public class RunObjectRequiredAction   {


    /**
    * For now, this is always `submit_tool_outputs`.
    */
    public enum TypeEnum {
        SUBMIT_TOOL_OUTPUTS("submit_tool_outputs");

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
    private RunObjectRequiredActionSubmitToolOutputs submitToolOutputs;

    /**
     * Default constructor.
     */
    public RunObjectRequiredAction() {
    // JSON-B / Jackson
    }

    /**
     * Create RunObjectRequiredAction.
     *
     * @param type For now, this is always &#x60;submit_tool_outputs&#x60;.
     * @param submitToolOutputs submitToolOutputs
     */
    public RunObjectRequiredAction(
        TypeEnum type, 
        RunObjectRequiredActionSubmitToolOutputs submitToolOutputs
    ) {
        this.type = type;
        this.submitToolOutputs = submitToolOutputs;
    }



    /**
     * For now, this is always `submit_tool_outputs`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get submitToolOutputs
     * @return submitToolOutputs
     */
    public RunObjectRequiredActionSubmitToolOutputs getSubmitToolOutputs() {
        return submitToolOutputs;
    }

    public void setSubmitToolOutputs(RunObjectRequiredActionSubmitToolOutputs submitToolOutputs) {
        this.submitToolOutputs = submitToolOutputs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunObjectRequiredAction {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    submitToolOutputs: ").append(toIndentedString(submitToolOutputs)).append("\n");
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

