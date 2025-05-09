/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateFineTuningJobRequestHyperparameters;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInner;
import org.openapitools.model.CreateFineTuningJobRequestModel;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateFineTuningJobRequest
 */
@JsonPropertyOrder({
  CreateFineTuningJobRequest.JSON_PROPERTY_MODEL,
  CreateFineTuningJobRequest.JSON_PROPERTY_TRAINING_FILE,
  CreateFineTuningJobRequest.JSON_PROPERTY_HYPERPARAMETERS,
  CreateFineTuningJobRequest.JSON_PROPERTY_SUFFIX,
  CreateFineTuningJobRequest.JSON_PROPERTY_VALIDATION_FILE,
  CreateFineTuningJobRequest.JSON_PROPERTY_INTEGRATIONS,
  CreateFineTuningJobRequest.JSON_PROPERTY_SEED
})
@JsonTypeName("CreateFineTuningJobRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CreateFineTuningJobRequest {
    public static final String JSON_PROPERTY_MODEL = "model";
    private CreateFineTuningJobRequestModel model;

    public static final String JSON_PROPERTY_TRAINING_FILE = "training_file";
    private String trainingFile;

    public static final String JSON_PROPERTY_HYPERPARAMETERS = "hyperparameters";
    private CreateFineTuningJobRequestHyperparameters hyperparameters;

    public static final String JSON_PROPERTY_SUFFIX = "suffix";
    private String suffix;

    public static final String JSON_PROPERTY_VALIDATION_FILE = "validation_file";
    private String validationFile;

    public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
    private List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations = null;

    public static final String JSON_PROPERTY_SEED = "seed";
    private Integer seed;

    public CreateFineTuningJobRequest(CreateFineTuningJobRequestModel model, String trainingFile) {
        this.model = model;
        this.trainingFile = trainingFile;
    }

    public CreateFineTuningJobRequest model(CreateFineTuningJobRequestModel model) {
        this.model = model;
        return this;
    }

    /**
     * Get model
     * @return model
     */
    @Valid
    @NotNull
    @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateFineTuningJobRequestModel getModel() {
        return model;
    }

    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setModel(CreateFineTuningJobRequestModel model) {
        this.model = model;
    }

    public CreateFineTuningJobRequest trainingFile(String trainingFile) {
        this.trainingFile = trainingFile;
        return this;
    }

    /**
     * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
     * @return trainingFile
     */
    @NotNull
    @Schema(name = "training_file", example = "file-abc123", description = "The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TRAINING_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTrainingFile() {
        return trainingFile;
    }

    @JsonProperty(JSON_PROPERTY_TRAINING_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTrainingFile(String trainingFile) {
        this.trainingFile = trainingFile;
    }

    public CreateFineTuningJobRequest hyperparameters(CreateFineTuningJobRequestHyperparameters hyperparameters) {
        this.hyperparameters = hyperparameters;
        return this;
    }

    /**
     * Get hyperparameters
     * @return hyperparameters
     */
    @Valid
    @Nullable
    @Schema(name = "hyperparameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_HYPERPARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CreateFineTuningJobRequestHyperparameters getHyperparameters() {
        return hyperparameters;
    }

    @JsonProperty(JSON_PROPERTY_HYPERPARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHyperparameters(CreateFineTuningJobRequestHyperparameters hyperparameters) {
        this.hyperparameters = hyperparameters;
    }

    public CreateFineTuningJobRequest suffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel&#x60;. 
     * @return suffix
     */
    @Nullable
    @Size(min=1, max=40)
    @Schema(name = "suffix", description = "A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SUFFIX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSuffix() {
        return suffix;
    }

    @JsonProperty(JSON_PROPERTY_SUFFIX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public CreateFineTuningJobRequest validationFile(String validationFile) {
        this.validationFile = validationFile;
        return this;
    }

    /**
     * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
     * @return validationFile
     */
    @Nullable
    @Schema(name = "validation_file", example = "file-abc123", description = "The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_VALIDATION_FILE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getValidationFile() {
        return validationFile;
    }

    @JsonProperty(JSON_PROPERTY_VALIDATION_FILE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValidationFile(String validationFile) {
        this.validationFile = validationFile;
    }

    public CreateFineTuningJobRequest integrations(List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations) {
        this.integrations = integrations;
        return this;
    }

    public CreateFineTuningJobRequest addIntegrationsItem(CreateFineTuningJobRequestIntegrationsInner integrationsItem) {
        if (this.integrations == null) {
            this.integrations = new ArrayList<>();
        }
        this.integrations.add(integrationsItem);
        return this;
    }

    /**
     * A list of integrations to enable for your fine-tuning job.
     * @return integrations
     */
    @Nullable
    @Schema(name = "integrations", description = "A list of integrations to enable for your fine-tuning job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid CreateFineTuningJobRequestIntegrationsInner> getIntegrations() {
        return integrations;
    }

    @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIntegrations(List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations) {
        this.integrations = integrations;
    }

    public CreateFineTuningJobRequest seed(Integer seed) {
        this.seed = seed;
        return this;
    }

    /**
     * The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
     * minimum: 0
     * maximum: 2147483647
     * @return seed
     */
    @Nullable
    @Min(0)
    @Max(2147483647)
    @Schema(name = "seed", example = "42", description = "The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SEED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getSeed() {
        return seed;
    }

    @JsonProperty(JSON_PROPERTY_SEED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFineTuningJobRequest createFineTuningJobRequest = (CreateFineTuningJobRequest) o;
        return Objects.equals(this.model, createFineTuningJobRequest.model) &&
            Objects.equals(this.trainingFile, createFineTuningJobRequest.trainingFile) &&
            Objects.equals(this.hyperparameters, createFineTuningJobRequest.hyperparameters) &&
            Objects.equals(this.suffix, createFineTuningJobRequest.suffix) &&
            Objects.equals(this.validationFile, createFineTuningJobRequest.validationFile) &&
            Objects.equals(this.integrations, createFineTuningJobRequest.integrations) &&
            Objects.equals(this.seed, createFineTuningJobRequest.seed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, trainingFile, hyperparameters, suffix, validationFile, integrations, seed);
    }

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
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

