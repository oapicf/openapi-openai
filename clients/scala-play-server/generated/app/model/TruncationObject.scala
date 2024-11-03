package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TruncationObject.
  * @param `type` The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
  * @param lastMessages The number of most recent messages from the thread when constructing the context for the run.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TruncationObject(
  `type`: Option[TruncationObject.Type.Value],
  lastMessages: Option[Int]
)

object TruncationObject {
  implicit lazy val truncationObjectJsonFormat: Format[TruncationObject] = Json.format[TruncationObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Auto = Value("auto")
    val LastMessages = Value("last_messages")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

