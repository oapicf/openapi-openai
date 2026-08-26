package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateEmbeddingRequestInput
import org.openapitools.server.api.model.CreateEmbeddingRequestModel
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateEmbeddingRequest(
    val input: CreateEmbeddingRequestInput,
    val model: CreateEmbeddingRequestModel,
    /** The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/). */
    val encodingFormat: kotlin.String? = EncodingFormat.float,
    /** The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models.  */
    val dimensions: kotlin.Int? = null,
    /** A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  */
    val user: kotlin.String? = null
)
