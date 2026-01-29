package org.openapitools.server.model


/**
 * Represents an embedding vector returned by embedding endpoint. 
 *
 * @param index The index of the embedding in the list of embeddings. for example: ''null''
 * @param embedding The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  for example: ''null''
 * @param `object` The object type, which is always \"embedding\". for example: ''null''
*/
final case class Embedding (
  index: Int,
  embedding: Seq[Double],
  `object`: String
)

