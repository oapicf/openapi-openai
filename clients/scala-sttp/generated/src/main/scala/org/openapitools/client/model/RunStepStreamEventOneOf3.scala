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
   * Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
   */
case class RunStepStreamEventOneOf3(
  event: RunStepStreamEventOneOf3Enums.Event,
  data: RunStepObject
)

object RunStepStreamEventOneOf3Enums {

  type Event = Event.Value
  object Event extends Enumeration {
    val ThreadRunStepCompleted = Value("thread.run.step.completed")
  }

}
