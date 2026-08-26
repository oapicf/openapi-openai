package org.openapitools.server.model;

import org.openapitools.server.model.CreateModerationRequestInput;
import org.openapitools.server.model.CreateModerationRequestModel;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateModerationRequest   {

    private CreateModerationRequestInput input;
    private CreateModerationRequestModel model;

    /**
     * Default constructor.
     */
    public CreateModerationRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateModerationRequest.
     *
     * @param input input
     * @param model model
     */
    public CreateModerationRequest(
        CreateModerationRequestInput input, 
        CreateModerationRequestModel model
    ) {
        this.input = input;
        this.model = model;
    }



    /**
     * Get input
     * @return input
     */
    public CreateModerationRequestInput getInput() {
        return input;
    }

    public void setInput(CreateModerationRequestInput input) {
        this.input = input;
    }

    /**
     * Get model
     * @return model
     */
    public CreateModerationRequestModel getModel() {
        return model;
    }

    public void setModel(CreateModerationRequestModel model) {
        this.model = model;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModerationRequest {\n");
        
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

