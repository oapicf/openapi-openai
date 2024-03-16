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

import org.openapitools.server.models.FineTuneEvent

/**
 * 
 * @param `object` 
 * @param `data` 
 */
data class ListFineTuneEventsResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<FineTuneEvent>
) 

