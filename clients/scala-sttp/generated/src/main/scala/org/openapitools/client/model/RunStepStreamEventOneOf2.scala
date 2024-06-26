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


  /**
   * Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
   */
case class RunStepStreamEventOneOf2(
  event: RunStepStreamEventOneOf2Enums.Event,
  data: RunStepDeltaObject
)

object RunStepStreamEventOneOf2Enums {

  type Event = Event.Value
  object Event extends Enumeration {
    val ThreadRunStepDelta = Value("thread.run.step.delta")
  }

}
