/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models


/**
 * The name and arguments of a function that should be called, as generated by the model.
 * @param name The name of the function to call.
 * @param arguments The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
 */
data class ChatCompletionRequestMessageFunctionCall(
    /* The name of the function to call. */
    val name: kotlin.String? = null,
    /* The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. */
    val arguments: kotlin.String? = null
) 
