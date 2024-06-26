/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step\&#39;s status is &#x60;in_progress&#x60;.
 */
public class OASRunStepCompletionUsage implements OAS.MappedProperties {
    /**
     * Number of completion tokens used over the course of the run step.
     * @return completionTokens
     */
    public Integer completionTokens { get; set; }

    /**
     * Number of prompt tokens used over the course of the run step.
     * @return promptTokens
     */
    public Integer promptTokens { get; set; }

    /**
     * Total number of tokens used (prompt + completion).
     * @return totalTokens
     */
    public Integer totalTokens { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'completion_tokens' => 'completionTokens',
        'prompt_tokens' => 'promptTokens',
        'total_tokens' => 'totalTokens'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'completion_tokens' => 'completionTokens',
        'prompt_tokens' => 'promptTokens',
        'total_tokens' => 'totalTokens'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'completion_tokens' => 'completionTokens',
        'prompt_tokens' => 'promptTokens',
        'total_tokens' => 'totalTokens'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASRunStepCompletionUsage getExample() {
        OASRunStepCompletionUsage runStepCompletionUsage = new OASRunStepCompletionUsage();
          runStepCompletionUsage.completionTokens = 0;
          runStepCompletionUsage.promptTokens = 0;
          runStepCompletionUsage.totalTokens = 0;
        return runStepCompletionUsage;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunStepCompletionUsage) {           
            OASRunStepCompletionUsage runStepCompletionUsage = (OASRunStepCompletionUsage) obj;
            return this.completionTokens == runStepCompletionUsage.completionTokens
                && this.promptTokens == runStepCompletionUsage.promptTokens
                && this.totalTokens == runStepCompletionUsage.totalTokens;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (completionTokens == null ? 0 : System.hashCode(completionTokens));
        hashCode = (17 * hashCode) + (promptTokens == null ? 0 : System.hashCode(promptTokens));
        hashCode = (17 * hashCode) + (totalTokens == null ? 0 : System.hashCode(totalTokens));
        return hashCode;
    }
}

