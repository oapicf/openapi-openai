// tslint:disable
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

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpHeaders, HttpQuery } from '../runtime';
import type {
    CreateFineTuningJobRequest,
    FineTuningJob,
    ListFineTuningJobCheckpointsResponse,
    ListFineTuningJobEventsResponse,
    ListPaginatedFineTuningJobsResponse,
} from '../models';

export interface CancelFineTuningJobRequest {
    fineTuningJobId: string;
}

export interface CreateFineTuningJobRequest {
    createFineTuningJobRequest: CreateFineTuningJobRequest;
}

export interface ListFineTuningEventsRequest {
    fineTuningJobId: string;
    after?: string;
    limit?: number;
}

export interface ListFineTuningJobCheckpointsRequest {
    fineTuningJobId: string;
    after?: string;
    limit?: number;
}

export interface ListPaginatedFineTuningJobsRequest {
    after?: string;
    limit?: number;
}

export interface RetrieveFineTuningJobRequest {
    fineTuningJobId: string;
}

/**
 * no description
 */
export class FineTuningApi extends BaseAPI {

    /**
     * Immediately cancel a fine-tune job. 
     */
    cancelFineTuningJob({ fineTuningJobId }: CancelFineTuningJobRequest): Observable<FineTuningJob>
    cancelFineTuningJob({ fineTuningJobId }: CancelFineTuningJobRequest, opts?: OperationOpts): Observable<AjaxResponse<FineTuningJob>>
    cancelFineTuningJob({ fineTuningJobId }: CancelFineTuningJobRequest, opts?: OperationOpts): Observable<FineTuningJob | AjaxResponse<FineTuningJob>> {
        throwIfNullOrUndefined(fineTuningJobId, 'fineTuningJobId', 'cancelFineTuningJob');

        const headers: HttpHeaders = {
        };

        return this.request<FineTuningJob>({
            url: '/fine_tuning/jobs/{fine_tuning_job_id}/cancel'.replace('{fine_tuning_job_id}', encodeURI(fineTuningJobId)),
            method: 'POST',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     */
    createFineTuningJob({ createFineTuningJobRequest }: CreateFineTuningJobRequest): Observable<FineTuningJob>
    createFineTuningJob({ createFineTuningJobRequest }: CreateFineTuningJobRequest, opts?: OperationOpts): Observable<AjaxResponse<FineTuningJob>>
    createFineTuningJob({ createFineTuningJobRequest }: CreateFineTuningJobRequest, opts?: OperationOpts): Observable<FineTuningJob | AjaxResponse<FineTuningJob>> {
        throwIfNullOrUndefined(createFineTuningJobRequest, 'createFineTuningJobRequest', 'createFineTuningJob');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<FineTuningJob>({
            url: '/fine_tuning/jobs',
            method: 'POST',
            headers,
            body: createFineTuningJobRequest,
        }, opts?.responseOpts);
    };

    /**
     * Get status updates for a fine-tuning job. 
     */
    listFineTuningEvents({ fineTuningJobId, after, limit }: ListFineTuningEventsRequest): Observable<ListFineTuningJobEventsResponse>
    listFineTuningEvents({ fineTuningJobId, after, limit }: ListFineTuningEventsRequest, opts?: OperationOpts): Observable<AjaxResponse<ListFineTuningJobEventsResponse>>
    listFineTuningEvents({ fineTuningJobId, after, limit }: ListFineTuningEventsRequest, opts?: OperationOpts): Observable<ListFineTuningJobEventsResponse | AjaxResponse<ListFineTuningJobEventsResponse>> {
        throwIfNullOrUndefined(fineTuningJobId, 'fineTuningJobId', 'listFineTuningEvents');

        const headers: HttpHeaders = {
        };

        const query: HttpQuery = {};

        if (after != null) { query['after'] = after; }
        if (limit != null) { query['limit'] = limit; }

        return this.request<ListFineTuningJobEventsResponse>({
            url: '/fine_tuning/jobs/{fine_tuning_job_id}/events'.replace('{fine_tuning_job_id}', encodeURI(fineTuningJobId)),
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * List checkpoints for a fine-tuning job. 
     */
    listFineTuningJobCheckpoints({ fineTuningJobId, after, limit }: ListFineTuningJobCheckpointsRequest): Observable<ListFineTuningJobCheckpointsResponse>
    listFineTuningJobCheckpoints({ fineTuningJobId, after, limit }: ListFineTuningJobCheckpointsRequest, opts?: OperationOpts): Observable<AjaxResponse<ListFineTuningJobCheckpointsResponse>>
    listFineTuningJobCheckpoints({ fineTuningJobId, after, limit }: ListFineTuningJobCheckpointsRequest, opts?: OperationOpts): Observable<ListFineTuningJobCheckpointsResponse | AjaxResponse<ListFineTuningJobCheckpointsResponse>> {
        throwIfNullOrUndefined(fineTuningJobId, 'fineTuningJobId', 'listFineTuningJobCheckpoints');

        const headers: HttpHeaders = {
        };

        const query: HttpQuery = {};

        if (after != null) { query['after'] = after; }
        if (limit != null) { query['limit'] = limit; }

        return this.request<ListFineTuningJobCheckpointsResponse>({
            url: '/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints'.replace('{fine_tuning_job_id}', encodeURI(fineTuningJobId)),
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * List your organization\'s fine-tuning jobs 
     */
    listPaginatedFineTuningJobs({ after, limit }: ListPaginatedFineTuningJobsRequest): Observable<ListPaginatedFineTuningJobsResponse>
    listPaginatedFineTuningJobs({ after, limit }: ListPaginatedFineTuningJobsRequest, opts?: OperationOpts): Observable<AjaxResponse<ListPaginatedFineTuningJobsResponse>>
    listPaginatedFineTuningJobs({ after, limit }: ListPaginatedFineTuningJobsRequest, opts?: OperationOpts): Observable<ListPaginatedFineTuningJobsResponse | AjaxResponse<ListPaginatedFineTuningJobsResponse>> {

        const headers: HttpHeaders = {
        };

        const query: HttpQuery = {};

        if (after != null) { query['after'] = after; }
        if (limit != null) { query['limit'] = limit; }

        return this.request<ListPaginatedFineTuningJobsResponse>({
            url: '/fine_tuning/jobs',
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     */
    retrieveFineTuningJob({ fineTuningJobId }: RetrieveFineTuningJobRequest): Observable<FineTuningJob>
    retrieveFineTuningJob({ fineTuningJobId }: RetrieveFineTuningJobRequest, opts?: OperationOpts): Observable<AjaxResponse<FineTuningJob>>
    retrieveFineTuningJob({ fineTuningJobId }: RetrieveFineTuningJobRequest, opts?: OperationOpts): Observable<FineTuningJob | AjaxResponse<FineTuningJob>> {
        throwIfNullOrUndefined(fineTuningJobId, 'fineTuningJobId', 'retrieveFineTuningJob');

        const headers: HttpHeaders = {
        };

        return this.request<FineTuningJob>({
            url: '/fine_tuning/jobs/{fine_tuning_job_id}'.replace('{fine_tuning_job_id}', encodeURI(fineTuningJobId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

}
