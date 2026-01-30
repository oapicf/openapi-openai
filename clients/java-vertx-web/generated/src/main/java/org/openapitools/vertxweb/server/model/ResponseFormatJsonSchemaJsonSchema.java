package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseFormatJsonSchemaJsonSchema   {
  
  private String description;
  private String name;
  private Map<String, Object> schema = new HashMap<>();
  private Boolean strict = false;

  public ResponseFormatJsonSchemaJsonSchema () {

  }

  public ResponseFormatJsonSchemaJsonSchema (String description, String name, Map<String, Object> schema, Boolean strict) {
    this.description = description;
    this.name = name;
    this.schema = schema;
    this.strict = strict;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("schema")
  public Map<String, Object> getSchema() {
    return schema;
  }
  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }

    
  @JsonProperty("strict")
  public Boolean getStrict() {
    return strict;
  }
  public void setStrict(Boolean strict) {
    this.strict = strict;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseFormatJsonSchemaJsonSchema responseFormatJsonSchemaJsonSchema = (ResponseFormatJsonSchemaJsonSchema) o;
    return Objects.equals(description, responseFormatJsonSchemaJsonSchema.description) &&
        Objects.equals(name, responseFormatJsonSchemaJsonSchema.name) &&
        Objects.equals(schema, responseFormatJsonSchemaJsonSchema.schema) &&
        Objects.equals(strict, responseFormatJsonSchemaJsonSchema.strict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, schema, strict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseFormatJsonSchemaJsonSchema {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    strict: ").append(toIndentedString(strict)).append("\n");
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
