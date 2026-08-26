package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FineTunePreferenceRequestInputInput;
import org.openapitools.server.model.FineTunePreferenceRequestInputPreferredCompletionInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 */
public class FineTunePreferenceRequestInput   {

    private FineTunePreferenceRequestInputInput input;
    private List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion = new ArrayList<>();
    private List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion = new ArrayList<>();

    /**
     * Default constructor.
     */
    public FineTunePreferenceRequestInput() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTunePreferenceRequestInput.
     *
     * @param input input
     * @param preferredCompletion The preferred completion message for the output.
     * @param nonPreferredCompletion The non-preferred completion message for the output.
     */
    public FineTunePreferenceRequestInput(
        FineTunePreferenceRequestInputInput input, 
        List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion, 
        List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion
    ) {
        this.input = input;
        this.preferredCompletion = preferredCompletion;
        this.nonPreferredCompletion = nonPreferredCompletion;
    }



    /**
     * Get input
     * @return input
     */
    public FineTunePreferenceRequestInputInput getInput() {
        return input;
    }

    public void setInput(FineTunePreferenceRequestInputInput input) {
        this.input = input;
    }

    /**
     * The preferred completion message for the output.
     * @return preferredCompletion
     */
    public List<FineTunePreferenceRequestInputPreferredCompletionInner> getPreferredCompletion() {
        return preferredCompletion;
    }

    public void setPreferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> preferredCompletion) {
        this.preferredCompletion = preferredCompletion;
    }

    /**
     * The non-preferred completion message for the output.
     * @return nonPreferredCompletion
     */
    public List<FineTunePreferenceRequestInputPreferredCompletionInner> getNonPreferredCompletion() {
        return nonPreferredCompletion;
    }

    public void setNonPreferredCompletion(List<FineTunePreferenceRequestInputPreferredCompletionInner> nonPreferredCompletion) {
        this.nonPreferredCompletion = nonPreferredCompletion;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTunePreferenceRequestInput {\n");
        
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    preferredCompletion: ").append(toIndentedString(preferredCompletion)).append("\n");
        sb.append("    nonPreferredCompletion: ").append(toIndentedString(nonPreferredCompletion)).append("\n");
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

