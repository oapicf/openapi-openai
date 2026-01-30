package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteListResponse.
  * @param `object` The object type, which is always `list`
  * @param firstId The first `invite_id` in the retrieved `list`
  * @param lastId The last `invite_id` in the retrieved `list`
  * @param hasMore The `has_more` property is used for pagination to indicate there are additional results.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class InviteListResponse(
  `object`: InviteListResponse.Object.Value,
  data: List[Invite],
  firstId: Option[String],
  lastId: Option[String],
  hasMore: Option[Boolean]
)

object InviteListResponse {
  implicit lazy val inviteListResponseJsonFormat: Format[InviteListResponse] = Json.format[InviteListResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

