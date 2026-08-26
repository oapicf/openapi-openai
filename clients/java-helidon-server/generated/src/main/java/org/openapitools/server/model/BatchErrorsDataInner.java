package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BatchErrorsDataInner   {

    private String code;
    private String message;
    private String param;
    private Integer line;

    /**
     * Default constructor.
     */
    public BatchErrorsDataInner() {
    // JSON-B / Jackson
    }

    /**
     * Create BatchErrorsDataInner.
     *
     * @param code An error code identifying the error type.
     * @param message A human-readable message providing more details about the error.
     * @param param The name of the parameter that caused the error, if applicable.
     * @param line The line number of the input file where the error occurred, if applicable.
     */
    public BatchErrorsDataInner(
        String code, 
        String message, 
        String param, 
        Integer line
    ) {
        this.code = code;
        this.message = message;
        this.param = param;
        this.line = line;
    }



    /**
     * An error code identifying the error type.
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * A human-readable message providing more details about the error.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The name of the parameter that caused the error, if applicable.
     * @return param
     */
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    /**
     * The line number of the input file where the error occurred, if applicable.
     * @return line
     */
    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchErrorsDataInner {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
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

