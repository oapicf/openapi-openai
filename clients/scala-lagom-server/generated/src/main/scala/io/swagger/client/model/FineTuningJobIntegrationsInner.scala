/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._

case class FineTuningJobIntegrationsInner (
                  `type`:  Option[FineTuningJobIntegrationsInner&#x60;type&#x60;Enum.FineTuningJobIntegrationsInner&#x60;type&#x60;Enum],
                  wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)

object FineTuningJobIntegrationsInner {
implicit val format: Format[FineTuningJobIntegrationsInner] = Json.format
}

object FineTuningJobIntegrationsInner&#x60;type&#x60;Enum extends Enumeration {
  val   wandb = Value
  type FineTuningJobIntegrationsInner&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[FineTuningJobIntegrationsInner&#x60;type&#x60;Enum.type])
}