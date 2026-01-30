package model

import play.api.libs.json._

/**
  * Ephemeral key returned by the API.
  * @param value Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
  * @param expiresAt Timestamp for when the token expires. Currently, all tokens expire after one minute. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeSessionCreateResponseClientSecret(
  value: Option[String],
  expiresAt: Option[Int]
)

object RealtimeSessionCreateResponseClientSecret {
  implicit lazy val realtimeSessionCreateResponseClientSecretJsonFormat: Format[RealtimeSessionCreateResponseClientSecret] = Json.format[RealtimeSessionCreateResponseClientSecret]
}

