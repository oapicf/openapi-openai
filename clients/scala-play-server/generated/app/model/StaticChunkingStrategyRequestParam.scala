package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StaticChunkingStrategyRequestParam.
  * @param `type` Always `static`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class StaticChunkingStrategyRequestParam(
  `type`: StaticChunkingStrategyRequestParam.Type.Value,
  static: StaticChunkingStrategy
)

object StaticChunkingStrategyRequestParam {
  implicit lazy val staticChunkingStrategyRequestParamJsonFormat: Format[StaticChunkingStrategyRequestParam] = Json.format[StaticChunkingStrategyRequestParam]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Static = Value("static")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

