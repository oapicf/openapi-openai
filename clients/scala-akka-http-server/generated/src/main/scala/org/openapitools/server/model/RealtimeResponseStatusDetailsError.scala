package org.openapitools.server.model


/**
 * A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
 *
 * @param `type` The type of error. for example: ''null''
 * @param code Error code, if any. for example: ''null''
*/
final case class RealtimeResponseStatusDetailsError (
  `type`: Option[String] = None,
  code: Option[String] = None
)

