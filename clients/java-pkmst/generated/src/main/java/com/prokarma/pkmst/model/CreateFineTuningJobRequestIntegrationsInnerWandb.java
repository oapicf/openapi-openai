package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
 */
@ApiModel(description = "The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-03T11:07:18.723034005Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateFineTuningJobRequestIntegrationsInnerWandb   {
  @JsonProperty("project")
  private String project;

  @JsonProperty("name")
  private String name;

  @JsonProperty("entity")
  private String entity;

  @JsonProperty("tags")
  
  private List<String> tags = null;

  public CreateFineTuningJobRequestIntegrationsInnerWandb project(String project) {
    this.project = project;
    return this;
  }

  /**
   * The name of the project that the new run will be created under. 
   * @return project
   */
  @ApiModelProperty(example = "my-wandb-project", required = true, value = "The name of the project that the new run will be created under. ")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public CreateFineTuningJobRequestIntegrationsInnerWandb name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A display name to set for the run. If not set, we will use the Job ID as the name. 
   * @return name
   */
  @ApiModelProperty(value = "A display name to set for the run. If not set, we will use the Job ID as the name. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFineTuningJobRequestIntegrationsInnerWandb entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
   * @return entity
   */
  @ApiModelProperty(value = "The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. ")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public CreateFineTuningJobRequestIntegrationsInnerWandb tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateFineTuningJobRequestIntegrationsInnerWandb addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". 
   * @return tags
   */
  @ApiModelProperty(value = "A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". ")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

