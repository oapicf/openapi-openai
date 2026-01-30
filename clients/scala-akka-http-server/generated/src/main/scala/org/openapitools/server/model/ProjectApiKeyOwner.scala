package org.openapitools.server.model


/**
 * @param `type` `user` or `service_account` for example: ''null''
 * @param user  for example: ''null''
 * @param serviceAccount  for example: ''null''
*/
final case class ProjectApiKeyOwner (
  `type`: Option[String] = None,
  user: Option[ProjectUser] = None,
  serviceAccount: Option[ProjectServiceAccount] = None
)

