package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectApiKey_owner.
  * @param `type` `user` or `service_account`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectApiKeyOwner(
  `type`: Option[ProjectApiKeyOwner.Type.Value],
  user: Option[ProjectUser],
  serviceAccount: Option[ProjectServiceAccount]
)

object ProjectApiKeyOwner {
  implicit lazy val projectApiKeyOwnerJsonFormat: Format[ProjectApiKeyOwner] = Json.format[ProjectApiKeyOwner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val User = Value("user")
    val ServiceAccount = Value("service_account")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

