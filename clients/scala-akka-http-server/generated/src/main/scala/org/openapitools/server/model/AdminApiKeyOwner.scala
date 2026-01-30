package org.openapitools.server.model


/**
 * @param `type`  for example: ''service_account''
 * @param id  for example: ''sa_456''
 * @param name  for example: ''My Service Account''
 * @param createdAt  for example: ''1711471533''
 * @param role  for example: ''member''
*/
final case class AdminApiKeyOwner (
  `type`: Option[String] = None,
  id: Option[String] = None,
  name: Option[String] = None,
  createdAt: Option[Long] = None,
  role: Option[String] = None
)

