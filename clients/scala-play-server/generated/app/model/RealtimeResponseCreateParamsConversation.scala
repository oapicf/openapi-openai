package model

import play.api.libs.json._

/**
  * Controls which conversation the response is added to. Currently supports `auto` and `none`, with `auto` as the default value. The `auto` value means that the contents of the response will be added to the default conversation. Set this to `none` to create an out-of-band response which  will not add items to default conversation. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeResponseCreateParamsConversation(
)

object RealtimeResponseCreateParamsConversation {
  implicit lazy val realtimeResponseCreateParamsConversationJsonFormat: Format[RealtimeResponseCreateParamsConversation] = Json.format[RealtimeResponseCreateParamsConversation]
}

