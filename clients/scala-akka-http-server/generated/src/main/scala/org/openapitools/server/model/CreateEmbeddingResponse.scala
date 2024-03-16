package org.openapitools.server.model


/**
 * @param `object`  for example: ''null''
 * @param model  for example: ''null''
 * @param data  for example: ''null''
 * @param usage  for example: ''null''
*/
final case class CreateEmbeddingResponse (
  `object`: String,
  model: String,
  data: Seq[CreateEmbeddingResponseDataInner],
  usage: CreateEmbeddingResponseUsage
)

