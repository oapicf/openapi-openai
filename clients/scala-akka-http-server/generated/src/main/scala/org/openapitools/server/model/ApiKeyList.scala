package org.openapitools.server.model


/**
 * @param `object`  for example: ''list''
 * @param data  for example: ''null''
 * @param hasMore  for example: ''false''
 * @param firstId  for example: ''key_abc''
 * @param lastId  for example: ''key_xyz''
*/
final case class ApiKeyList (
  `object`: Option[String] = None,
  data: Option[Seq[AdminApiKey]] = None,
  hasMore: Option[Boolean] = None,
  firstId: Option[String] = None,
  lastId: Option[String] = None
)

