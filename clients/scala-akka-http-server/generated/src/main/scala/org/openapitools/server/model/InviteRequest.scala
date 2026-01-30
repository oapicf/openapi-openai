package org.openapitools.server.model


/**
 * @param email Send an email to this address for example: ''null''
 * @param role `owner` or `reader` for example: ''null''
 * @param projects An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. for example: ''null''
*/
final case class InviteRequest (
  email: String,
  role: String,
  projects: Option[Seq[InviteRequestProjectsInner]] = None
)

