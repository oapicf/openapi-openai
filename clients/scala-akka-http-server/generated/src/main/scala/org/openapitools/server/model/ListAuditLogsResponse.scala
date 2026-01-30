package org.openapitools.server.model


/**
 * @param `object`  for example: ''null''
 * @param data  for example: ''null''
 * @param firstId  for example: ''audit_log-defb456h8dks''
 * @param lastId  for example: ''audit_log-hnbkd8s93s''
 * @param hasMore  for example: ''null''
*/
final case class ListAuditLogsResponse (
  `object`: String,
  data: Seq[AuditLog],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

