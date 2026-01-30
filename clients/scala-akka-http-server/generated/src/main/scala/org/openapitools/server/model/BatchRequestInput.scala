package org.openapitools.server.model


/**
 * The per-line object of the batch input file
 *
 * @param customId A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. for example: ''null''
 * @param method The HTTP method to be used for the request. Currently only `POST` is supported. for example: ''null''
 * @param url The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. for example: ''null''
*/
final case class BatchRequestInput (
  customId: Option[String] = None,
  method: Option[String] = None,
  url: Option[String] = None
)

