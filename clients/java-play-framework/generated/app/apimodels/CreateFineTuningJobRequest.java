package apimodels;

import apimodels.CreateFineTuningJobRequestHyperparameters;
import apimodels.CreateFineTuningJobRequestIntegrationsInner;
import apimodels.CreateFineTuningJobRequestModel;
import apimodels.FineTuneMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateFineTuningJobRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateFineTuningJobRequest   {
  @JsonProperty("model")
  @NotNull
@Valid

  private CreateFineTuningJobRequestModel model;

  @JsonProperty("training_file")
  @NotNull

  private String trainingFile;

  @JsonProperty("hyperparameters")
  @Valid

  private CreateFineTuningJobRequestHyperparameters hyperparameters;

  @JsonProperty("suffix")
  @Size(min=1,max=64)

  private String suffix;

  @JsonProperty("validation_file")
  
  private String validationFile;

  @JsonProperty("integrations")
  @Valid

  private List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations = null;

  @JsonProperty("seed")
  @Min(0)
@Max(2147483647)

  private Integer seed;

  @JsonProperty("method")
  @Valid

  private FineTuneMethod method;

  public CreateFineTuningJobRequest model(CreateFineTuningJobRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public CreateFineTuningJobRequestModel getModel() {
    return model;
  }

  public void setModel(CreateFineTuningJobRequestModel model) {
    this.model = model;
  }

  public CreateFineTuningJobRequest trainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
    return this;
  }

   /**
   * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
   * @return trainingFile
  **/
  public String getTrainingFile() {
    return trainingFile;
  }

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
  **/
  public CreateFineTuningJobRequestHyperparameters getHyperparameters() {
    return hyperparameters;
  }

  public void setHyperparameters(CreateFineTuningJobRequestHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

  public CreateFineTuningJobRequest suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`. 
   * @return suffix
  **/
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public CreateFineTuningJobRequest validationFile(String validationFile) {
    this.validationFile = validationFile;
    return this;
  }

   /**
   * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
   * @return validationFile
  **/
  public String getValidationFile() {
    return validationFile;
  }

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
  **/
  public List<@Valid CreateFineTuningJobRequestIntegrationsInner> getIntegrations() {
    return integrations;
  }

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
  **/
  public Integer getSeed() {
    return seed;
  }

  public void setSeed(Integer seed) {
    this.seed = seed;
  }

  public CreateFineTuningJobRequest method(FineTuneMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  public FineTuneMethod getMethod() {
    return method;
  }

  public void setMethod(FineTuneMethod method) {
    this.method = method;
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
    return Objects.equals(model, createFineTuningJobRequest.model) &&
        Objects.equals(trainingFile, createFineTuningJobRequest.trainingFile) &&
        Objects.equals(hyperparameters, createFineTuningJobRequest.hyperparameters) &&
        Objects.equals(suffix, createFineTuningJobRequest.suffix) &&
        Objects.equals(validationFile, createFineTuningJobRequest.validationFile) &&
        Objects.equals(integrations, createFineTuningJobRequest.integrations) &&
        Objects.equals(seed, createFineTuningJobRequest.seed) &&
        Objects.equals(method, createFineTuningJobRequest.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, trainingFile, hyperparameters, suffix, validationFile, integrations, seed, method);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

