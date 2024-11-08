/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { SubmitToolOutputsRunRequestToolOutputsInner } from './submitToolOutputsRunRequestToolOutputsInner';


export interface SubmitToolOutputsRunRequest { 
    /**
     * A list of tools for which the outputs are being submitted.
     */
    tool_outputs: Array<SubmitToolOutputsRunRequestToolOutputsInner>;
    /**
     * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
     */
    stream?: boolean | null;
}

