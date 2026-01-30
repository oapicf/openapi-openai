package org.openapitools.server.model


/**
 * The per-line object of the batch output and error files
 *
 * @param id  for example: ''null''
 * @param customId A developer-provided per-request id that will be used to match outputs to inputs. for example: ''null''
 * @param response  for example: ''null''
 * @param error  for example: ''null''
*/
final case class BatchRequestOutput (
  id: Option[String] = None,
  customId: Option[String] = None,
  response: Option[BatchRequestOutputResponse] = None,
  error: Option[BatchRequestOutputError] = None
)

