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
package org.openapitools.server.api.model

import org.openapitools.server.api.model.DoneEvent
import org.openapitools.server.api.model.ErrorEvent
import org.openapitools.server.api.model.MessageStreamEvent
import org.openapitools.server.api.model.RunStepStreamEvent
import org.openapitools.server.api.model.RunStreamEvent
import org.openapitools.server.api.model.ThreadStreamEvent

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 * @param event 
 * @param &#x60;data&#x60; 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AssistantStreamEvent (
    @SerializedName("event") private val _event: AssistantStreamEvent.Event?,
    @SerializedName("`data`") private val _`data`: AssistantStreamEvent.&#x60;Data&#x60;?
) {

    /**
    * 
    * Values: done
    */
    enum class Event(val value: kotlin.String){
    
        done("done");
    
    }

    /**
    * 
    * Values: Left_Square_BracketDONERight_Square_Bracket
    */
    enum class &#x60;Data&#x60;(val value: kotlin.String){
    
        Left_Square_BracketDONERight_Square_Bracket("[DONE]");
    
    }

        val event get() = _event ?: throw IllegalArgumentException("event is required")
                    
        val `data` get() = _`data` ?: throw IllegalArgumentException("`data` is required")
                    
}

