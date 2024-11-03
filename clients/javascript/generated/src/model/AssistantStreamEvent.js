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
 *
 */

import ApiClient from '../ApiClient';
import DoneEvent from './DoneEvent';
import ErrorEvent from './ErrorEvent';
import MessageStreamEvent from './MessageStreamEvent';
import RunStepStreamEvent from './RunStepStreamEvent';
import RunStreamEvent from './RunStreamEvent';
import ThreadStreamEvent from './ThreadStreamEvent';

/**
 * The AssistantStreamEvent model module.
 * @module model/AssistantStreamEvent
 * @version 1.1.1-pre.0
 */
class AssistantStreamEvent {
    /**
     * Constructs a new <code>AssistantStreamEvent</code>.
     * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
     * @alias module:model/AssistantStreamEvent
     * @param {(module:model/DoneEvent|module:model/ErrorEvent|module:model/MessageStreamEvent|module:model/RunStepStreamEvent|module:model/RunStreamEvent|module:model/ThreadStreamEvent)} instance The actual instance to initialize AssistantStreamEvent.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "ThreadStreamEvent") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                ThreadStreamEvent.validateJSON(instance); // throw an exception if no match
                // create ThreadStreamEvent from JS object
                this.actualInstance = ThreadStreamEvent.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into ThreadStreamEvent
            errorMessages.push("Failed to construct ThreadStreamEvent: " + err)
        }

        try {
            if (typeof instance === "RunStreamEvent") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStreamEvent.validateJSON(instance); // throw an exception if no match
                // create RunStreamEvent from JS object
                this.actualInstance = RunStreamEvent.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStreamEvent
            errorMessages.push("Failed to construct RunStreamEvent: " + err)
        }

        try {
            if (typeof instance === "RunStepStreamEvent") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepStreamEvent.validateJSON(instance); // throw an exception if no match
                // create RunStepStreamEvent from JS object
                this.actualInstance = RunStepStreamEvent.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepStreamEvent
            errorMessages.push("Failed to construct RunStepStreamEvent: " + err)
        }

        try {
            if (typeof instance === "MessageStreamEvent") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                MessageStreamEvent.validateJSON(instance); // throw an exception if no match
                // create MessageStreamEvent from JS object
                this.actualInstance = MessageStreamEvent.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into MessageStreamEvent
            errorMessages.push("Failed to construct MessageStreamEvent: " + err)
        }

        try {
            if (typeof instance === "ErrorEvent") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                ErrorEvent.validateJSON(instance); // throw an exception if no match
                // create ErrorEvent from JS object
                this.actualInstance = ErrorEvent.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into ErrorEvent
            errorMessages.push("Failed to construct ErrorEvent: " + err)
        }

        try {
            if (typeof instance === "DoneEvent") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                DoneEvent.validateJSON(instance); // throw an exception if no match
                // create DoneEvent from JS object
                this.actualInstance = DoneEvent.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into DoneEvent
            errorMessages.push("Failed to construct DoneEvent: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `AssistantStreamEvent` with oneOf schemas DoneEvent, ErrorEvent, MessageStreamEvent, RunStepStreamEvent, RunStreamEvent, ThreadStreamEvent. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `AssistantStreamEvent` with oneOf schemas DoneEvent, ErrorEvent, MessageStreamEvent, RunStepStreamEvent, RunStreamEvent, ThreadStreamEvent. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>AssistantStreamEvent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AssistantStreamEvent} obj Optional instance to populate.
     * @return {module:model/AssistantStreamEvent} The populated <code>AssistantStreamEvent</code> instance.
     */
    static constructFromObject(data, obj) {
        return new AssistantStreamEvent(data);
    }

    /**
     * Gets the actual instance, which can be <code>DoneEvent</code>, <code>ErrorEvent</code>, <code>MessageStreamEvent</code>, <code>RunStepStreamEvent</code>, <code>RunStreamEvent</code>, <code>ThreadStreamEvent</code>.
     * @return {(module:model/DoneEvent|module:model/ErrorEvent|module:model/MessageStreamEvent|module:model/RunStepStreamEvent|module:model/RunStreamEvent|module:model/ThreadStreamEvent)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>DoneEvent</code>, <code>ErrorEvent</code>, <code>MessageStreamEvent</code>, <code>RunStepStreamEvent</code>, <code>RunStreamEvent</code>, <code>ThreadStreamEvent</code>.
     * @param {(module:model/DoneEvent|module:model/ErrorEvent|module:model/MessageStreamEvent|module:model/RunStepStreamEvent|module:model/RunStreamEvent|module:model/ThreadStreamEvent)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = AssistantStreamEvent.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of AssistantStreamEvent from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/AssistantStreamEvent} An instance of AssistantStreamEvent.
     */
    static fromJSON = function(json_string){
        return AssistantStreamEvent.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * @member {module:model/AssistantStreamEvent.EventEnum} event
 */
AssistantStreamEvent.prototype['event'] = undefined;

/**
 * @member {module:model/AssistantStreamEvent.DataEnum} data
 */
AssistantStreamEvent.prototype['data'] = undefined;


AssistantStreamEvent.OneOf = ["DoneEvent", "ErrorEvent", "MessageStreamEvent", "RunStepStreamEvent", "RunStreamEvent", "ThreadStreamEvent"];

export default AssistantStreamEvent;

