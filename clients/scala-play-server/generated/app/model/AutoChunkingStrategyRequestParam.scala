package model

import play.api.libs.json._

/**
  * The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
  * @param `type` Always `auto`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AutoChunkingStrategyRequestParam(
  `type`: AutoChunkingStrategyRequestParam.Type.Value
)

object AutoChunkingStrategyRequestParam {
  implicit lazy val autoChunkingStrategyRequestParamJsonFormat: Format[AutoChunkingStrategyRequestParam] = Json.format[AutoChunkingStrategyRequestParam]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Auto = Value("auto")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

