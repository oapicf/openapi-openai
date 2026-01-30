package model

import play.api.libs.json._

/**
  * Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
  * @param `type` The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
  * @param lastMessages The number of most recent messages from the thread when constructing the context for the run.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TruncationObject(
  `type`: TruncationObject.Type.Value,
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

