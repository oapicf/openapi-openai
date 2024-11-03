/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { FineTuningJobEvent } from './fineTuningJobEvent';


export interface ListFineTuningJobEventsResponse { 
    data: Array<FineTuningJobEvent>;
    object: ListFineTuningJobEventsResponse.ObjectEnum;
}
export namespace ListFineTuningJobEventsResponse {
    export type ObjectEnum = 'list';
    export const ObjectEnum = {
        List: 'list' as ObjectEnum
    };
}


