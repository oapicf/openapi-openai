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
import { DoneEvent } from './doneEvent';
import { ErrorEvent } from './errorEvent';
import { MessageStreamEvent } from './messageStreamEvent';
import { RunStepStreamEvent } from './runStepStreamEvent';
import { RunStreamEvent } from './runStreamEvent';
import { ThreadStreamEvent } from './threadStreamEvent';


/**
 * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 */
/**
 * @type AssistantStreamEvent
 * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 * @export
 */
export type AssistantStreamEvent = DoneEvent | ErrorEvent | MessageStreamEvent | RunStepStreamEvent | RunStreamEvent | ThreadStreamEvent;

