package org.openapitools.server.model


/**
 * @param gt Return only events whose `effective_at` (Unix seconds) is greater than this value. for example: ''null''
 * @param gte Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value. for example: ''null''
 * @param lt Return only events whose `effective_at` (Unix seconds) is less than this value. for example: ''null''
 * @param lte Return only events whose `effective_at` (Unix seconds) is less than or equal to this value. for example: ''null''
*/
final case class ListAuditLogsEffectiveAtParameter (
  gt: Option[Int] = None,
  gte: Option[Int] = None,
  lt: Option[Int] = None,
  lte: Option[Int] = None
)

