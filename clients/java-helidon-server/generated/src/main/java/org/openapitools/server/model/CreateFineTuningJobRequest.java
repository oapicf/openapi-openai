package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CreateFineTuningJobRequestHyperparameters;
import org.openapitools.server.model.CreateFineTuningJobRequestIntegrationsInner;
import org.openapitools.server.model.CreateFineTuningJobRequestModel;
import org.openapitools.server.model.FineTuneMethod;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateFineTuningJobRequest   {

    private CreateFineTuningJobRequestModel model;
    private String trainingFile;
    private CreateFineTuningJobRequestHyperparameters hyperparameters;
    private String suffix;
    private String validationFile;
    private List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations;
    private Integer seed;
    private FineTuneMethod method;

    /**
     * Default constructor.
     */
    public CreateFineTuningJobRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateFineTuningJobRequest.
     *
     * @param model model
     * @param trainingFile The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
     * @param hyperparameters hyperparameters
     * @param suffix A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-4o-mini:openai:custom-model-name:7p4lURel&#x60;. 
     * @param validationFile The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
     * @param integrations A list of integrations to enable for your fine-tuning job.
     * @param seed The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
     * @param method method
     */
    public CreateFineTuningJobRequest(
        CreateFineTuningJobRequestModel model, 
        String trainingFile, 
        CreateFineTuningJobRequestHyperparameters hyperparameters, 
        String suffix, 
        String validationFile, 
        List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations, 
        Integer seed, 
        FineTuneMethod method
    ) {
        this.model = model;
        this.trainingFile = trainingFile;
        this.hyperparameters = hyperparameters;
        this.suffix = suffix;
        this.validationFile = validationFile;
        this.integrations = integrations;
        this.seed = seed;
        this.method = method;
    }



    /**
     * Get model
     * @return model
     */
    public CreateFineTuningJobRequestModel getModel() {
        return model;
    }

    public void setModel(CreateFineTuningJobRequestModel model) {
        this.model = model;
    }

    /**
     * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
     * @return trainingFile
     */
    public String getTrainingFile() {
        return trainingFile;
    }

    public void setTrainingFile(String trainingFile) {
        this.trainingFile = trainingFile;
    }

    /**
     * Get hyperparameters
     * @return hyperparameters
     */
    public CreateFineTuningJobRequestHyperparameters getHyperparameters() {
        return hyperparameters;
    }

    public void setHyperparameters(CreateFineTuningJobRequestHyperparameters hyperparameters) {
        this.hyperparameters = hyperparameters;
    }

    /**
     * A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`. 
     * @return suffix
     */
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
     * @return validationFile
     */
    public String getValidationFile() {
        return validationFile;
    }

    public void setValidationFile(String validationFile) {
        this.validationFile = validationFile;
    }

    /**
     * A list of integrations to enable for your fine-tuning job.
     * @return integrations
     */
    public List<@Valid CreateFineTuningJobRequestIntegrationsInner> getIntegrations() {
        return integrations;
    }

    public void setIntegrations(List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations) {
        this.integrations = integrations;
    }

    /**
     * The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
     * minimum: 0
     * maximum: 2147483647
     * @return seed
     */
    public Integer getSeed() {
        return seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    /**
     * Get method
     * @return method
     */
    public FineTuneMethod getMethod() {
        return method;
    }

    public void setMethod(FineTuneMethod method) {
        this.method = method;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFineTuningJobRequest {\n");
        
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    trainingFile: ").append(toIndentedString(trainingFile)).append("\n");
        sb.append("    hyperparameters: ").append(toIndentedString(hyperparameters)).append("\n");
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
        sb.append("    validationFile: ").append(toIndentedString(validationFile)).append("\n");
        sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
        sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

