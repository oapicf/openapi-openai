package org.openapitools.server.model


/**
 * @param index  for example: ''null''
 * @param `object`  for example: ''null''
 * @param embedding  for example: ''null''
*/
final case class CreateEmbeddingResponseDataInner (
  index: Int,
  `object`: String,
  embedding: Seq[Double]
)

