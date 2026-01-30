package org.openapitools.server.model


/**
 * @param `object` The object type, which is always `organization.invite.deleted` for example: ''null''
 * @param id  for example: ''null''
 * @param deleted  for example: ''null''
*/
final case class InviteDeleteResponse (
  `object`: String,
  id: String,
  deleted: Boolean
)

