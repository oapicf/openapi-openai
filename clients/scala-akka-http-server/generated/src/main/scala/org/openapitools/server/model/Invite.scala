package org.openapitools.server.model


/**
 * Represents an individual `invite` to the organization.
 *
 * @param `object` The object type, which is always `organization.invite` for example: ''null''
 * @param id The identifier, which can be referenced in API endpoints for example: ''null''
 * @param email The email address of the individual to whom the invite was sent for example: ''null''
 * @param role `owner` or `reader` for example: ''null''
 * @param status `accepted`,`expired`, or `pending` for example: ''null''
 * @param invitedAt The Unix timestamp (in seconds) of when the invite was sent. for example: ''null''
 * @param expiresAt The Unix timestamp (in seconds) of when the invite expires. for example: ''null''
 * @param acceptedAt The Unix timestamp (in seconds) of when the invite was accepted. for example: ''null''
 * @param projects The projects that were granted membership upon acceptance of the invite. for example: ''null''
*/
final case class Invite (
  `object`: String,
  id: String,
  email: String,
  role: String,
  status: String,
  invitedAt: Int,
  expiresAt: Int,
  acceptedAt: Option[Int] = None,
  projects: Option[Seq[InviteProjectsInner]] = None
)

