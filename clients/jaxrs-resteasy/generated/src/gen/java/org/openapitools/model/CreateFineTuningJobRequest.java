package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T10:45:28.938980301Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateFineTuningJobRequest   {
  
  private CreateFineTuningJobRequestModel model;
  private String trainingFile;
  private CreateFineTuningJobRequestHyperparameters hyperparameters;
  private String suffix;
  private String validationFile;
  private List<@Valid CreateFineTuningJobRequestIntegrationsInner> integrations;
  private Integer seed;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  @NotNull
  @Valid
  public CreateFineTuningJobRequestModel getModel() {
    return model;
  }
  public void setModel(CreateFineTuningJobRequestModel model) {
    this.model = model;
  }

  /**
   * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
   **/
  
  @ApiModelProperty(example = "file-abc123", required = true, value = "The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. ")
  @JsonProperty("training_file")
  @NotNull
  public String getTrainingFile() {
    return trainingFile;
  }
  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hyperparameters")
  @Valid
  public CreateFineTuningJobRequestHyperparameters getHyperparameters() {
    return hyperparameters;
  }
  public void setHyperparameters(CreateFineTuningJobRequestHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

  /**
   * A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel&#x60;. 
   **/
  
  @ApiModelProperty(value = "A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. ")
  @JsonProperty("suffix")
 @Size(min=1,max=40)  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  /**
   * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
   **/
  
  @ApiModelProperty(example = "file-abc123", value = "The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. ")
  @JsonProperty("validation_file")
  public String getValidationFile() {
    return validationFile;
  }
  public void setValidationFile(String validationFile) {
    this.validationFile = validationFile;
  }

  /**
   * A list of integrations to enable for your fine-tuning job.
   **/
  
  @ApiModelProperty(value = "A list of integrations to enable for your fine-tuning job.")
  @JsonProperty("integrations")
  @Valid
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
   **/
  
  @ApiModelProperty(example = "42", value = "The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. ")
  @JsonProperty("seed")
 @Min(0) @Max(2147483647)  public Integer getSeed() {
    return seed;
  }
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

