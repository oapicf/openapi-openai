package model

import play.api.libs.json._

/**
  * The API Key used to perform the audit logged action.
  * @param id The tracking id of the API key.
  * @param `type` The type of API key. Can be either `user` or `service_account`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogActorApiKey(
  id: Option[String],
  `type`: Option[AuditLogActorApiKey.Type.Value],
  user: Option[AuditLogActorUser],
  serviceAccount: Option[AuditLogActorServiceAccount]
)

object AuditLogActorApiKey {
  implicit lazy val auditLogActorApiKeyJsonFormat: Format[AuditLogActorApiKey] = Json.format[AuditLogActorApiKey]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val User = Value("user")
    val ServiceAccount = Value("service_account")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

