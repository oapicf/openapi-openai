package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateFineTuningJobRequest_integrations_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

