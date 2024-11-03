/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { FineTuningJob } from './fineTuningJob';


export interface ListPaginatedFineTuningJobsResponse { 
    data: Array<FineTuningJob>;
    has_more: boolean;
    object: ListPaginatedFineTuningJobsResponse.ObjectEnum;
}
export namespace ListPaginatedFineTuningJobsResponse {
    export type ObjectEnum = 'list';
    export const ObjectEnum = {
        List: 'list' as ObjectEnum
    };
}


