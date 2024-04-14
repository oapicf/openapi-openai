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

import org.openapitools.client.core.ApiModel

case class ListFineTuningJobCheckpointsResponse (
  data: Seq[FineTuningJobCheckpoint],
  `object`: ListFineTuningJobCheckpointsResponseEnums.`Object`,
  firstId: Option[String] = None,
  lastId: Option[String] = None,
  hasMore: Boolean
) extends ApiModel

object ListFineTuningJobCheckpointsResponseEnums {

  type `Object` = `Object`.Value
  object `Object` extends Enumeration {
    val List = Value("list")
  }

}
