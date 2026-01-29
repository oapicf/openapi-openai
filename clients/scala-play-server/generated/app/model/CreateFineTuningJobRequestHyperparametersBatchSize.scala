package model

import play.api.libs.json._

/**
  * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateFineTuningJobRequestHyperparametersBatchSize(
)

object CreateFineTuningJobRequestHyperparametersBatchSize {
  implicit lazy val createFineTuningJobRequestHyperparametersBatchSizeJsonFormat: Format[CreateFineTuningJobRequestHyperparametersBatchSize] = Json.format[CreateFineTuningJobRequestHyperparametersBatchSize]
}

