package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FineTuningIntegration.
  * @param `type` The type of the integration being enabled for the fine-tuning job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class FineTuningIntegration(
  `type`: FineTuningIntegration.Type.Value,
  wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)

object FineTuningIntegration {
  implicit lazy val fineTuningIntegrationJsonFormat: Format[FineTuningIntegration] = Json.format[FineTuningIntegration]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Wandb = Value("wandb")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

