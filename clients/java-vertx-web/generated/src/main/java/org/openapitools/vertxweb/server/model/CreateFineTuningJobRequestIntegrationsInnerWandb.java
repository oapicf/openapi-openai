package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFineTuningJobRequestIntegrationsInnerWandb   {
  
  private String project;
  private String name;
  private String entity;
  private List<String> tags = new ArrayList<>();

  public CreateFineTuningJobRequestIntegrationsInnerWandb () {

  }

  public CreateFineTuningJobRequestIntegrationsInnerWandb (String project, String name, String entity, List<String> tags) {
    this.project = project;
    this.name = name;
    this.entity = entity;
    this.tags = tags;
  }

    
  @JsonProperty("project")
  public String getProject() {
    return project;
  }
  public void setProject(String project) {
    this.project = project;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("entity")
  public String getEntity() {
    return entity;
  }
  public void setEntity(String entity) {
    this.entity = entity;
  }

    
  @JsonProperty("tags")
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
    return Objects.equals(project, createFineTuningJobRequestIntegrationsInnerWandb.project) &&
        Objects.equals(name, createFineTuningJobRequestIntegrationsInnerWandb.name) &&
        Objects.equals(entity, createFineTuningJobRequestIntegrationsInnerWandb.entity) &&
        Objects.equals(tags, createFineTuningJobRequestIntegrationsInnerWandb.tags);
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
