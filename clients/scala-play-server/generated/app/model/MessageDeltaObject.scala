package model

import play.api.libs.json._

/**
  * Represents a message delta i.e. any changed fields on a message during streaming. 
  * @param id The identifier of the message, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `thread.message.delta`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageDeltaObject(
  id: String,
  `object`: MessageDeltaObject.Object.Value,
  delta: MessageDeltaObjectDelta
)

object MessageDeltaObject {
  implicit lazy val messageDeltaObjectJsonFormat: Format[MessageDeltaObject] = Json.format[MessageDeltaObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ThreadMessageDelta = Value("thread.message.delta")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

