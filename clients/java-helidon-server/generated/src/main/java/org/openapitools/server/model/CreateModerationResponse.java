package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CreateModerationResponseResultsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents if a given text input is potentially harmful.
 */
public class CreateModerationResponse   {

    private String id;
    private String model;
    private List<@Valid CreateModerationResponseResultsInner> results = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateModerationResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateModerationResponse.
     *
     * @param id The unique identifier for the moderation request.
     * @param model The model used to generate the moderation results.
     * @param results A list of moderation objects.
     */
    public CreateModerationResponse(
        String id, 
        String model, 
        List<@Valid CreateModerationResponseResultsInner> results
    ) {
        this.id = id;
        this.model = model;
        this.results = results;
    }



    /**
     * The unique identifier for the moderation request.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The model used to generate the moderation results.
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * A list of moderation objects.
     * @return results
     */
    public List<@Valid CreateModerationResponseResultsInner> getResults() {
        return results;
    }

    public void setResults(List<@Valid CreateModerationResponseResultsInner> results) {
        this.results = results;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModerationResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

