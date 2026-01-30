package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ModifyThreadRequestToolResources;

/**
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ThreadObject   {
  
  private String id;


  public enum ObjectEnum {
    THREAD("thread");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private Integer createdAt;
  private ModifyThreadRequestToolResources toolResources;
  private Object metadata;

  public ThreadObject () {

  }

  public ThreadObject (String id, ObjectEnum _object, Integer createdAt, ModifyThreadRequestToolResources toolResources, Object metadata) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.toolResources = toolResources;
    this.metadata = metadata;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("tool_resources")
  public ModifyThreadRequestToolResources getToolResources() {
    return toolResources;
  }
  public void setToolResources(ModifyThreadRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

    
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreadObject threadObject = (ThreadObject) o;
    return Objects.equals(id, threadObject.id) &&
        Objects.equals(_object, threadObject._object) &&
        Objects.equals(createdAt, threadObject.createdAt) &&
        Objects.equals(toolResources, threadObject.toolResources) &&
        Objects.equals(metadata, threadObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, toolResources, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    toolResources: ").append(toIndentedString(toolResources)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
