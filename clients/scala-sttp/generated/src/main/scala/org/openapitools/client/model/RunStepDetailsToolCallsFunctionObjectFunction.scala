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
   * The definition of the function that was called.
   */
case class RunStepDetailsToolCallsFunctionObjectFunction(
  /* The name of the function. */
  name: String,
  /* The arguments passed to the function. */
  arguments: String,
  /* The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. */
  output: String
)

