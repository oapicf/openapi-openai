package org.openapitools.server.model


/**
 * @param id Project's public ID for example: ''null''
 * @param role Project membership role for example: ''null''
*/
final case class InviteProjectsInner (
  id: Option[String] = None,
  role: Option[String] = None
)

