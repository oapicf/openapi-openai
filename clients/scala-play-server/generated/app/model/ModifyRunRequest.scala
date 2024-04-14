package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ModifyRunRequest.
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ModifyRunRequest(
  metadata: Option[JsObject]
)

object ModifyRunRequest {
  implicit lazy val modifyRunRequestJsonFormat: Format[ModifyRunRequest] = Json.format[ModifyRunRequest]
}

