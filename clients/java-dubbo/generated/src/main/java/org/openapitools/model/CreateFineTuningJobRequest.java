package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateFineTuningJobRequestHyperparameters;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInner;
import org.openapitools.model.CreateFineTuningJobRequestModel;
import org.openapitools.model.FineTuneMethod;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateFineTuningJobRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("model")
  private CreateFineTuningJobRequestModel model;

  /**
   * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
   */
  @JsonProperty("training_file")
  private String trainingFile;

  @JsonProperty("hyperparameters")
  private CreateFineTuningJobRequestHyperparameters hyperparameters;

  /**
   * A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-4o-mini:openai:custom-model-name:7p4lURel&#x60;. 
   */
  @JsonProperty("suffix")
  private String suffix;

  /**
   * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
   */
  @JsonProperty("validation_file")
  private String validationFile;

  /**
   * A list of integrations to enable for your fine-tuning job.
   */
  @JsonProperty("integrations")
  private List<CreateFineTuningJobRequestIntegrationsInner> integrations;

  /**
   * The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
   */
  @JsonProperty("seed")
  private Integer seed;

  @JsonProperty("method")
  private FineTuneMethod method;

  /**
   * 
   * @return model
   */
  public CreateFineTuningJobRequestModel getModel() {
    return model;
  }

  public void setModel(CreateFineTuningJobRequestModel model) {
    this.model = model;
  }

  /**
   * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
   * @return trainingFile
   */
  public String getTrainingFile() {
    return trainingFile;
  }

  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }

  /**
   * 
   * @return hyperparameters
   */
  public CreateFineTuningJobRequestHyperparameters getHyperparameters() {
    return hyperparameters;
  }

  public void setHyperparameters(CreateFineTuningJobRequestHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

  /**
   * A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-4o-mini:openai:custom-model-name:7p4lURel&#x60;. 
   * @return suffix
   */
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  /**
   * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
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
  public List<CreateFineTuningJobRequestIntegrationsInner> getIntegrations() {
    return integrations;
  }

  public void setIntegrations(List<CreateFineTuningJobRequestIntegrationsInner> integrations) {
    this.integrations = integrations;
  }

  /**
   * The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
   * @return seed
   */
  public Integer getSeed() {
    return seed;
  }

  public void setSeed(Integer seed) {
    this.seed = seed;
  }

  /**
   * 
   * @return method
   */
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
    return Objects.equals(this.model, createFineTuningJobRequest.model) &&
        Objects.equals(this.trainingFile, createFineTuningJobRequest.trainingFile) &&
        Objects.equals(this.hyperparameters, createFineTuningJobRequest.hyperparameters) &&
        Objects.equals(this.suffix, createFineTuningJobRequest.suffix) &&
        Objects.equals(this.validationFile, createFineTuningJobRequest.validationFile) &&
        Objects.equals(this.integrations, createFineTuningJobRequest.integrations) &&
        Objects.equals(this.seed, createFineTuningJobRequest.seed) &&
        Objects.equals(this.method, createFineTuningJobRequest.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, trainingFile, hyperparameters, suffix, validationFile, integrations, seed, method);
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
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
