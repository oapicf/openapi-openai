package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.StaticChunkingStrategy;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class StaticChunkingStrategyRequestParam   {


    /**
    * Always `static`.
    */
    public enum TypeEnum {
        STATIC("static");

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
    private StaticChunkingStrategy _static;

    /**
     * Default constructor.
     */
    public StaticChunkingStrategyRequestParam() {
    // JSON-B / Jackson
    }

    /**
     * Create StaticChunkingStrategyRequestParam.
     *
     * @param type Always &#x60;static&#x60;.
     * @param _static _static
     */
    public StaticChunkingStrategyRequestParam(
        TypeEnum type, 
        StaticChunkingStrategy _static
    ) {
        this.type = type;
        this._static = _static;
    }



    /**
     * Always `static`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get _static
     * @return _static
     */
    public StaticChunkingStrategy getStatic() {
        return _static;
    }

    public void setStatic(StaticChunkingStrategy _static) {
        this._static = _static;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StaticChunkingStrategyRequestParam {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    _static: ").append(toIndentedString(_static)).append("\n");
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

