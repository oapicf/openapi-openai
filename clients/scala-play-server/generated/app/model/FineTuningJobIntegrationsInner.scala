package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FineTuningJob_integrations_inner.
  * @param `type` The type of the integration being enabled for the fine-tuning job
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class FineTuningJobIntegrationsInner(
  `type`: FineTuningJobIntegrationsInner.Type.Value,
  wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)

object FineTuningJobIntegrationsInner {
  implicit lazy val fineTuningJobIntegrationsInnerJsonFormat: Format[FineTuningJobIntegrationsInner] = Json.format[FineTuningJobIntegrationsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Wandb = Value("wandb")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

