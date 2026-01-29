package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ModifyThreadRequest.
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ModifyThreadRequest(
  metadata: Option[JsObject]
)

object ModifyThreadRequest {
  implicit lazy val modifyThreadRequestJsonFormat: Format[ModifyThreadRequest] = Json.format[ModifyThreadRequest]
}

