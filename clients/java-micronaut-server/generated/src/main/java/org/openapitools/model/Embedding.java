/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Represents an embedding vector returned by embedding endpoint. 
 */
@Schema(name = "Embedding", description = "Represents an embedding vector returned by embedding endpoint. ")
@JsonPropertyOrder({
  Embedding.JSON_PROPERTY_INDEX,
  Embedding.JSON_PROPERTY_EMBEDDING,
  Embedding.JSON_PROPERTY_OBJECT
})
@JsonTypeName("Embedding")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class Embedding {
    public static final String JSON_PROPERTY_INDEX = "index";
    private Integer index;

    public static final String JSON_PROPERTY_EMBEDDING = "embedding";
    private List<BigDecimal> embedding = new ArrayList<>();

    /**
     * The object type, which is always \&quot;embedding\&quot;.
     */
    public enum ObjectEnum {
        EMBEDDING("embedding");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ObjectEnum fromValue(String value) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_OBJECT = "object";
    private ObjectEnum _object;

    public Embedding(Integer index, List<BigDecimal> embedding, ObjectEnum _object) {
        this.index = index;
        this.embedding = embedding;
        this._object = _object;
    }

    public Embedding index(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * The index of the embedding in the list of embeddings.
     * @return index
     */
    @NotNull
    @Schema(name = "index", description = "The index of the embedding in the list of embeddings.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getIndex() {
        return index;
    }

    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIndex(Integer index) {
        this.index = index;
    }

    public Embedding embedding(List<BigDecimal> embedding) {
        this.embedding = embedding;
        return this;
    }

    public Embedding addEmbeddingItem(BigDecimal embeddingItem) {
        this.embedding.add(embeddingItem);
        return this;
    }

    /**
     * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
     * @return embedding
     */
    @NotNull
    @Schema(name = "embedding", description = "The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_EMBEDDING)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<BigDecimal> getEmbedding() {
        return embedding;
    }

    @JsonProperty(JSON_PROPERTY_EMBEDDING)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEmbedding(List<BigDecimal> embedding) {
        this.embedding = embedding;
    }

    public Embedding _object(ObjectEnum _object) {
        this._object = _object;
        return this;
    }

    /**
     * The object type, which is always \&quot;embedding\&quot;.
     * @return _object
     */
    @NotNull
    @Schema(name = "object", description = "The object type, which is always \"embedding\".", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ObjectEnum getObject() {
        return _object;
    }

    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Embedding embedding = (Embedding) o;
        return Objects.equals(this.index, embedding.index) &&
            Objects.equals(this.embedding, embedding.embedding) &&
            Objects.equals(this._object, embedding._object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, embedding, _object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Embedding {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    embedding: ").append(toIndentedString(embedding)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

