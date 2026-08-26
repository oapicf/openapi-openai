package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Embedding(
    /** The index of the embedding in the list of embeddings. */
    val index: kotlin.Int,
    /** The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  */
    val embedding: kotlin.collections.List<java.math.BigDecimal>,
    /** The object type, which is always \&quot;embedding\&quot;. */
    val `object`: kotlin.String
)
