package model

import play.api.libs.json._

/**
  * The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateFineTuningJobRequestIntegrationsInnerType(
)

object CreateFineTuningJobRequestIntegrationsInnerType {
  implicit lazy val createFineTuningJobRequestIntegrationsInnerTypeJsonFormat: Format[CreateFineTuningJobRequestIntegrationsInnerType] = Json.format[CreateFineTuningJobRequestIntegrationsInnerType]
}

