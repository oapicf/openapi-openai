package model

import play.api.libs.json._

/**
  * The actor who performed the audit logged action.
  * @param `type` The type of actor. Is either `session` or `api_key`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogActor(
  `type`: Option[AuditLogActor.Type.Value],
  session: Option[AuditLogActorSession],
  apiKey: Option[AuditLogActorApiKey]
)

object AuditLogActor {
  implicit lazy val auditLogActorJsonFormat: Format[AuditLogActor] = Json.format[AuditLogActor]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Session = Value("session")
    val ApiKey = Value("api_key")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

