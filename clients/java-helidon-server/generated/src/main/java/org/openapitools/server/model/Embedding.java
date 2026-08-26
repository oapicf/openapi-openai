package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents an embedding vector returned by embedding endpoint. 
 */
public class Embedding   {

    private Integer index;
    private List<BigDecimal> embedding = new ArrayList<>();

    /**
    * The object type, which is always \"embedding\".
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
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;

    /**
     * Default constructor.
     */
    public Embedding() {
    // JSON-B / Jackson
    }

    /**
     * Create Embedding.
     *
     * @param index The index of the embedding in the list of embeddings.
     * @param embedding The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
     * @param _object The object type, which is always \&quot;embedding\&quot;.
     */
    public Embedding(
        Integer index, 
        List<BigDecimal> embedding, 
        ObjectEnum _object
    ) {
        this.index = index;
        this.embedding = embedding;
        this._object = _object;
    }



    /**
     * The index of the embedding in the list of embeddings.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
     * @return embedding
     */
    public List<BigDecimal> getEmbedding() {
        return embedding;
    }

    public void setEmbedding(List<BigDecimal> embedding) {
        this.embedding = embedding;
    }

    /**
     * The object type, which is always \"embedding\".
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

