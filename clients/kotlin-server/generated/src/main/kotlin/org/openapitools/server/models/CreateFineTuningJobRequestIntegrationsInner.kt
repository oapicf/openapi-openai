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

import org.openapitools.server.models.CreateFineTuningJobRequestIntegrationsInnerType
import org.openapitools.server.models.CreateFineTuningJobRequestIntegrationsInnerWandb

/**
 * 
 * @param type 
 * @param wandb 
 */
data class CreateFineTuningJobRequestIntegrationsInner(
    val type: CreateFineTuningJobRequestIntegrationsInnerType,
    val wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
) 

