package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateFineTuningJobRequestHyperparameters;
import org.openapitools.vertxweb.server.model.CreateFineTuningJobRequestIntegrationsInner;
import org.openapitools.vertxweb.server.model.CreateFineTuningJobRequestModel;
import org.openapitools.vertxweb.server.model.FineTuneMethod;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFineTuningJobRequest   {
  
  private CreateFineTuningJobRequestModel model;
  private String trainingFile;
  private CreateFineTuningJobRequestHyperparameters hyperparameters;
  private String suffix;
  private String validationFile;
  private List<CreateFineTuningJobRequestIntegrationsInner> integrations;
  private Integer seed;
  private FineTuneMethod method;

  public CreateFineTuningJobRequest () {

  }

  public CreateFineTuningJobRequest (CreateFineTuningJobRequestModel model, String trainingFile, CreateFineTuningJobRequestHyperparameters hyperparameters, String suffix, String validationFile, List<CreateFineTuningJobRequestIntegrationsInner> integrations, Integer seed, FineTuneMethod method) {
    this.model = model;
    this.trainingFile = trainingFile;
    this.hyperparameters = hyperparameters;
    this.suffix = suffix;
    this.validationFile = validationFile;
    this.integrations = integrations;
    this.seed = seed;
    this.method = method;
  }

    
  @JsonProperty("model")
  public CreateFineTuningJobRequestModel getModel() {
    return model;
  }
  public void setModel(CreateFineTuningJobRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("training_file")
  public String getTrainingFile() {
    return trainingFile;
  }
  public void setTrainingFile(String trainingFile) {
    this.trainingFile = trainingFile;
  }

    
  @JsonProperty("hyperparameters")
  public CreateFineTuningJobRequestHyperparameters getHyperparameters() {
    return hyperparameters;
  }
  public void setHyperparameters(CreateFineTuningJobRequestHyperparameters hyperparameters) {
    this.hyperparameters = hyperparameters;
  }

    
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

    
  @JsonProperty("validation_file")
  public String getValidationFile() {
    return validationFile;
  }
  public void setValidationFile(String validationFile) {
    this.validationFile = validationFile;
  }

    
  @JsonProperty("integrations")
  public List<CreateFineTuningJobRequestIntegrationsInner> getIntegrations() {
    return integrations;
  }
  public void setIntegrations(List<CreateFineTuningJobRequestIntegrationsInner> integrations) {
    this.integrations = integrations;
  }

    
  @JsonProperty("seed")
  public Integer getSeed() {
    return seed;
  }
  public void setSeed(Integer seed) {
    this.seed = seed;
  }

    
  @JsonProperty("method")
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
