package org.openapitools.server.model


/**
 * @param id  for example: ''key_abc''
 * @param `object`  for example: ''organization.admin_api_key.deleted''
 * @param deleted  for example: ''true''
*/
final case class AdminApiKeysDelete200Response (
  id: Option[String] = None,
  `object`: Option[String] = None,
  deleted: Option[Boolean] = None
)

