package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateFineTuningJobRequestHyperparameters;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInner;
import org.openapitools.model.CreateFineTuningJobRequestModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateFineTuningJobRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-04-14T13:42:15.676976801Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateFineTuningJobRequest   {
  private @Valid CreateFineTuningJobRequestModel model;
  private @Valid String trainingFile;
  private @Valid CreateFineTuningJobRequestHyperparameters hyperparameters;
  private @Valid String suffix;
  private @Valid String validationFile;
  private @Valid List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations;
  private @Valid Integer seed;

  /**
   **/
  public CreateFineTuningJobRequest model(CreateFineTuningJobRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  @NotNull
  public CreateFineTuningJobRequestModel getModel() {
    return model;
  }

  @JsonProperty("model")
  public void setModel(CreateFineTuningJobRequestModel model) {
    this.model = model;
  }

  /**
   * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
   **/
  public CreateFineTuningJobRequest trainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
    return this;
  }

  
  @ApiModelProperty(example = "file-abc123", required = true, value = "The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. ")
  @JsonProperty("training_file")
  @NotNull
  public String getTrainingFile() {
    return trainingFile;
  }

  @JsonProperty("training_file")
  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }

  /**
   **/
  public CreateFineTuningJobRequest hyperparameters(CreateFineTuningJobRequestHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hyperparameters")
  public CreateFineTuningJobRequestHyperparameters getHyperparameters() {
    return hyperparameters;
  }

  @JsonProperty("hyperparameters")
  public void setHyperparameters(CreateFineTuningJobRequestHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

  /**
   * A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel&#x60;. 
   **/
  public CreateFineTuningJobRequest suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  
  @ApiModelProperty(value = "A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. ")
  @JsonProperty("suffix")
 @Size(min=1,max=40)  public String getSuffix() {
    return suffix;
  }

  @JsonProperty("suffix")
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  /**
   * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
   **/
  public CreateFineTuningJobRequest validationFile(String validationFile) {
    this.validationFile = validationFile;
    return this;
  }

  
  @ApiModelProperty(example = "file-abc123", value = "The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. ")
  @JsonProperty("validation_file")
  public String getValidationFile() {
    return validationFile;
  }

  @JsonProperty("validation_file")
  public void setValidationFile(String validationFile) {
    this.validationFile = validationFile;
  }

  /**
   * A list of integrations to enable for your fine-tuning job.
   **/
  public CreateFineTuningJobRequest integrations(List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations) {
    this.integrations = integrations;
    return this;
  }

  
  @ApiModelProperty(value = "A list of integrations to enable for your fine-tuning job.")
  @JsonProperty("integrations")
  public List<CreateFineTuningJobRequestIntegrationsInner> getIntegrations() {
    return integrations;
  }

  @JsonProperty("integrations")
  public void setIntegrations(List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations) {
    this.integrations = integrations;
  }

  public CreateFineTuningJobRequest addIntegrationsItem(CreateFineTuningJobRequestIntegrationsInner integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<>();
    }

    this.integrations.add(integrationsItem);
    return this;
  }

  public CreateFineTuningJobRequest removeIntegrationsItem(CreateFineTuningJobRequestIntegrationsInner integrationsItem) {
    if (integrationsItem != null && this.integrations != null) {
      this.integrations.remove(integrationsItem);
    }

    return this;
  }
  /**
   * The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
   * minimum: 0
   * maximum: 2147483647
   **/
  public CreateFineTuningJobRequest seed(Integer seed) {
    this.seed = seed;
    return this;
  }

  
  @ApiModelProperty(example = "42", value = "The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. ")
  @JsonProperty("seed")
 @Min(0) @Max(2147483647)  public Integer getSeed() {
    return seed;
  }

  @JsonProperty("seed")
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

