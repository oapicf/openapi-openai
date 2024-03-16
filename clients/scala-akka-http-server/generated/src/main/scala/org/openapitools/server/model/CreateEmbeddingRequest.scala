package org.openapitools.server.model


/**
 * @param model  for example: ''null''
 * @param input  for example: ''null''
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  for example: ''user-1234''
*/
final case class CreateEmbeddingRequest (
  model: CreateEmbeddingRequestModel,
  input: CreateEmbeddingRequestInput,
  user: Option[String] = None
)

