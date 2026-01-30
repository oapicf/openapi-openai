package org.openapitools.server.model


/**
 * @param `object`  for example: ''organization.admin_api_key''
 * @param id  for example: ''key_abc''
 * @param name  for example: ''Administration Key''
 * @param redactedValue  for example: ''sk-admin...def''
 * @param value  for example: ''sk-admin-1234abcd''
 * @param createdAt  for example: ''1711471533''
 * @param owner  for example: ''null''
*/
final case class AdminApiKey (
  `object`: Option[String] = None,
  id: Option[String] = None,
  name: Option[String] = None,
  redactedValue: Option[String] = None,
  value: Option[String] = None,
  createdAt: Option[Long] = None,
  owner: Option[AdminApiKeyOwner] = None
)

