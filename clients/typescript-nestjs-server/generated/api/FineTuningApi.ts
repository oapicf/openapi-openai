import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CreateFineTuningJobRequest, FineTuningJob, ListFineTuningJobCheckpointsResponse, ListFineTuningJobEventsResponse, ListPaginatedFineTuningJobsResponse,  } from '../models';


@Injectable()
export abstract class FineTuningApi {

  abstract cancelFineTuningJob(fineTuningJobId: string,  request: Request): FineTuningJob | Promise<FineTuningJob> | Observable<FineTuningJob>;


  abstract createFineTuningJob(createFineTuningJobRequest: CreateFineTuningJobRequest,  request: Request): FineTuningJob | Promise<FineTuningJob> | Observable<FineTuningJob>;


  abstract listFineTuningEvents(fineTuningJobId: string, after: string | undefined, limit: number | undefined,  request: Request): ListFineTuningJobEventsResponse | Promise<ListFineTuningJobEventsResponse> | Observable<ListFineTuningJobEventsResponse>;


  abstract listFineTuningJobCheckpoints(fineTuningJobId: string, after: string | undefined, limit: number | undefined,  request: Request): ListFineTuningJobCheckpointsResponse | Promise<ListFineTuningJobCheckpointsResponse> | Observable<ListFineTuningJobCheckpointsResponse>;


  abstract listPaginatedFineTuningJobs(after: string | undefined, limit: number | undefined,  request: Request): ListPaginatedFineTuningJobsResponse | Promise<ListPaginatedFineTuningJobsResponse> | Observable<ListPaginatedFineTuningJobsResponse>;


  abstract retrieveFineTuningJob(fineTuningJobId: string,  request: Request): FineTuningJob | Promise<FineTuningJob> | Observable<FineTuningJob>;

} 