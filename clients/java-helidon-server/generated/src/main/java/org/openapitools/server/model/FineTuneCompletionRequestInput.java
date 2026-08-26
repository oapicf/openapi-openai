package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The per-line training example of a fine-tuning input file for completions models
 */
public class FineTuneCompletionRequestInput   {

    private String prompt;
    private String completion;

    /**
     * Default constructor.
     */
    public FineTuneCompletionRequestInput() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuneCompletionRequestInput.
     *
     * @param prompt The input prompt for this training example.
     * @param completion The desired completion for this training example.
     */
    public FineTuneCompletionRequestInput(
        String prompt, 
        String completion
    ) {
        this.prompt = prompt;
        this.completion = completion;
    }



    /**
     * The input prompt for this training example.
     * @return prompt
     */
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    /**
     * The desired completion for this training example.
     * @return completion
     */
    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuneCompletionRequestInput {\n");
        
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
        sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
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

