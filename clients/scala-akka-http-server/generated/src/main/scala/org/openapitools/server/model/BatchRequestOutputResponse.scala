package org.openapitools.server.model


/**
 * @param statusCode The HTTP status code of the response for example: ''null''
 * @param requestId An unique identifier for the OpenAI API request. Please include this request ID when contacting support. for example: ''null''
 * @param body The JSON body of the response for example: ''null''
*/
final case class BatchRequestOutputResponse (
  statusCode: Option[Int] = None,
  requestId: Option[String] = None,
  body: Option[Any] = None
)

