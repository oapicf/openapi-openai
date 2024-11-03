package model

import play.api.libs.json._

/**
  * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateFineTuningJobRequestHyperparametersBatchSize(
)

object CreateFineTuningJobRequestHyperparametersBatchSize {
  implicit lazy val createFineTuningJobRequestHyperparametersBatchSizeJsonFormat: Format[CreateFineTuningJobRequestHyperparametersBatchSize] = Json.format[CreateFineTuningJobRequestHyperparametersBatchSize]
}

