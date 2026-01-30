package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserDeleteResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserDeleteResponse(
  `object`: UserDeleteResponse.Object.Value,
  id: String,
  deleted: Boolean
)

object UserDeleteResponse {
  implicit lazy val userDeleteResponseJsonFormat: Format[UserDeleteResponse] = Json.format[UserDeleteResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationUserDeleted = Value("organization.user.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

