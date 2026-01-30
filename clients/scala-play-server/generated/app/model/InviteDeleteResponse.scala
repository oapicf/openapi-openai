package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteDeleteResponse.
  * @param `object` The object type, which is always `organization.invite.deleted`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class InviteDeleteResponse(
  `object`: InviteDeleteResponse.Object.Value,
  id: String,
  deleted: Boolean
)

object InviteDeleteResponse {
  implicit lazy val inviteDeleteResponseJsonFormat: Format[InviteDeleteResponse] = Json.format[InviteDeleteResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationInviteDeleted = Value("organization.invite.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

