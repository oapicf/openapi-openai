package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
 **/
@ApiModel(description="The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. ")

public class CreateFineTuningJobRequestIntegrationsInnerWandb  {
  
  @ApiModelProperty(example = "my-wandb-project", required = true, value = "The name of the project that the new run will be created under. ")
 /**
   * The name of the project that the new run will be created under. 
  **/
  private String project;

  @ApiModelProperty(value = "A display name to set for the run. If not set, we will use the Job ID as the name. ")
 /**
   * A display name to set for the run. If not set, we will use the Job ID as the name. 
  **/
  private String name;

  @ApiModelProperty(value = "The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. ")
 /**
   * The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
  **/
  private String entity;

  @ApiModelProperty(value = "A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". ")
 /**
   * A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". 
  **/
  private List<String> tags;
 /**
   * The name of the project that the new run will be created under. 
   * @return project
  **/
  @JsonProperty("project")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public CreateFineTuningJobRequestIntegrationsInnerWandb project(String project) {
    this.project = project;
    return this;
  }

 /**
   * A display name to set for the run. If not set, we will use the Job ID as the name. 
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFineTuningJobRequestIntegrationsInnerWandb name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
   * @return entity
  **/
  @JsonProperty("entity")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public CreateFineTuningJobRequestIntegrationsInnerWandb entity(String entity) {
    this.entity = entity;
    return this;
  }

 /**
   * A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \&quot;openai/finetune\&quot;, \&quot;openai/{base-model}\&quot;, \&quot;openai/{ftjob-abcdef}\&quot;. 
   * @return tags
  **/
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CreateFineTuningJobRequestIntegrationsInnerWandb tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateFineTuningJobRequestIntegrationsInnerWandb addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFineTuningJobRequestIntegrationsInnerWandb createFineTuningJobRequestIntegrationsInnerWandb = (CreateFineTuningJobRequestIntegrationsInnerWandb) o;
    return Objects.equals(this.project, createFineTuningJobRequestIntegrationsInnerWandb.project) &&
        Objects.equals(this.name, createFineTuningJobRequestIntegrationsInnerWandb.name) &&
        Objects.equals(this.entity, createFineTuningJobRequestIntegrationsInnerWandb.entity) &&
        Objects.equals(this.tags, createFineTuningJobRequestIntegrationsInnerWandb.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, name, entity, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFineTuningJobRequestIntegrationsInnerWandb {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

