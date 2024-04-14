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
package org.openapitools.client.model


case class ListModelsResponse(
  `object`: ListModelsResponseEnums.`Object`,
  data: Seq[Model]
)

object ListModelsResponseEnums {

  type `Object` = `Object`.Value
  object `Object` extends Enumeration {
    val List = Value("list")
  }

}
