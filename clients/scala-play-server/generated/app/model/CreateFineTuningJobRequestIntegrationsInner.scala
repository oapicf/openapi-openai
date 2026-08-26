package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateFineTuningJobRequest_integrations_inner.
  * @param `type` The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateFineTuningJobRequestIntegrationsInner(
  `type`: CreateFineTuningJobRequestIntegrationsInner.Type.Value,
  wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)

object CreateFineTuningJobRequestIntegrationsInner {
  implicit lazy val createFineTuningJobRequestIntegrationsInnerJsonFormat: Format[CreateFineTuningJobRequestIntegrationsInner] = Json.format[CreateFineTuningJobRequestIntegrationsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Wandb = Value("wandb")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

