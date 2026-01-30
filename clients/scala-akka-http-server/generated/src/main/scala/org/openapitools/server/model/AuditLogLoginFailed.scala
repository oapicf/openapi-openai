package org.openapitools.server.model


/**
 * The details for events with this `type`.
 *
 * @param errorCode The error code of the failure. for example: ''null''
 * @param errorMessage The error message of the failure. for example: ''null''
*/
final case class AuditLogLoginFailed (
  errorCode: Option[String] = None,
  errorMessage: Option[String] = None
)

