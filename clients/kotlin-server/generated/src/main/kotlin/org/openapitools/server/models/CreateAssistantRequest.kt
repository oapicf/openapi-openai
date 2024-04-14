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
package org.openapitools.server.models

import org.openapitools.server.models.AssistantObjectToolsInner
import org.openapitools.server.models.CreateAssistantRequestModel

/**
 * 
 * @param model 
 * @param name The name of the assistant. The maximum length is 256 characters. 
 * @param description The description of the assistant. The maximum length is 512 characters. 
 * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
 * @param fileIds A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 */
data class CreateAssistantRequest(
    val model: CreateAssistantRequestModel,
    /* The name of the assistant. The maximum length is 256 characters.  */
    val name: kotlin.String? = null,
    /* The description of the assistant. The maximum length is 512 characters.  */
    val description: kotlin.String? = null,
    /* The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
    val instructions: kotlin.String? = null,
    /* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.  */
    val tools: kotlin.collections.List<AssistantObjectToolsInner>? = arrayListOf(),
    /* A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  */
    val fileIds: kotlin.collections.List<kotlin.String>? = arrayListOf(),
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    val metadata: kotlin.Any? = null
) 

