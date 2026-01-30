package org.openapitools.server.model


/**
 * @param `object` The object type, which is always `list` for example: ''null''
 * @param data  for example: ''null''
 * @param firstId The first `invite_id` in the retrieved `list` for example: ''null''
 * @param lastId The last `invite_id` in the retrieved `list` for example: ''null''
 * @param hasMore The `has_more` property is used for pagination to indicate there are additional results. for example: ''null''
*/
final case class InviteListResponse (
  `object`: String,
  data: Seq[Invite],
  firstId: Option[String] = None,
  lastId: Option[String] = None,
  hasMore: Option[Boolean] = None
)

