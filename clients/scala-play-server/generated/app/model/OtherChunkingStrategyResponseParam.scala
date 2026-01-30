package model

import play.api.libs.json._

/**
  * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
  * @param `type` Always `other`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OtherChunkingStrategyResponseParam(
  `type`: OtherChunkingStrategyResponseParam.Type.Value
)

object OtherChunkingStrategyResponseParam {
  implicit lazy val otherChunkingStrategyResponseParamJsonFormat: Format[OtherChunkingStrategyResponseParam] = Json.format[OtherChunkingStrategyResponseParam]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Other = Value("other")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

