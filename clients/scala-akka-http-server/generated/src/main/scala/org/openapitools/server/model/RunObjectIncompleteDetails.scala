package org.openapitools.server.model


/**
 * Details on why the run is incomplete. Will be `null` if the run is not incomplete.
 *
 * @param reason The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. for example: ''null''
*/
final case class RunObjectIncompleteDetails (
  reason: Option[String] = None
)

