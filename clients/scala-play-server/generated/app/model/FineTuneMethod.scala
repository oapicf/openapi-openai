package model

import play.api.libs.json._

/**
  * The method used for fine-tuning.
  * @param `type` The type of method. Is either `supervised` or `dpo`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FineTuneMethod(
  `type`: Option[FineTuneMethod.Type.Value],
  supervised: Option[FineTuneSupervisedMethod],
  dpo: Option[FineTuneDPOMethod]
)

object FineTuneMethod {
  implicit lazy val fineTuneMethodJsonFormat: Format[FineTuneMethod] = Json.format[FineTuneMethod]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Supervised = Value("supervised")
    val Dpo = Value("dpo")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

