package org.openapitools.server.model


/**
 * @param input  for example: ''null''
 * @param model  for example: ''null''
 * @param encodingFormat The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/). for example: ''float''
 * @param dimensions The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.  for example: ''null''
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  for example: ''user-1234''
*/
final case class CreateEmbeddingRequest (
  input: CreateEmbeddingRequestInput,
  model: CreateEmbeddingRequestModel,
  encodingFormat: Option[String] = None,
  dimensions: Option[Int] = None,
  user: Option[String] = None
)

