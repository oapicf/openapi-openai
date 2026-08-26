import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { FineTuningApi } from '../api';
import { CreateFineTuningJobRequest, FineTuningJob, ListFineTuningJobCheckpointsResponse, ListFineTuningJobEventsResponse, ListPaginatedFineTuningJobsResponse,  } from '../models';

@Controller()
export class FineTuningApiController {
  constructor(private readonly fineTuningApi: FineTuningApi) {}

  @Post('/fine_tuning/jobs/:fine_tuning_job_id/cancel')
  cancelFineTuningJob(@Param('fine_tuning_job_id') fineTuningJobId: string, @Req() request: Request): FineTuningJob | Promise<FineTuningJob> | Observable<FineTuningJob> {
    return this.fineTuningApi.cancelFineTuningJob(fineTuningJobId, request);
  }

  @Post('/fine_tuning/jobs')
  createFineTuningJob(@Body() createFineTuningJobRequest: CreateFineTuningJobRequest, @Req() request: Request): FineTuningJob | Promise<FineTuningJob> | Observable<FineTuningJob> {
    return this.fineTuningApi.createFineTuningJob(createFineTuningJobRequest, request);
  }

  @Get('/fine_tuning/jobs/:fine_tuning_job_id/events')
  listFineTuningEvents(@Param('fine_tuning_job_id') fineTuningJobId: string, @Query('after') after: string | undefined, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Req() request: Request): ListFineTuningJobEventsResponse | Promise<ListFineTuningJobEventsResponse> | Observable<ListFineTuningJobEventsResponse> {
    return this.fineTuningApi.listFineTuningEvents(fineTuningJobId, after, limit, request);
  }

  @Get('/fine_tuning/jobs/:fine_tuning_job_id/checkpoints')
  listFineTuningJobCheckpoints(@Param('fine_tuning_job_id') fineTuningJobId: string, @Query('after') after: string | undefined, @Query('limit', new DefaultValuePipe(10)) limit: number | undefined, @Req() request: Request): ListFineTuningJobCheckpointsResponse | Promise<ListFineTuningJobCheckpointsResponse> | Observable<ListFineTuningJobCheckpointsResponse> {
    return this.fineTuningApi.listFineTuningJobCheckpoints(fineTuningJobId, after, limit, request);
  }

  @Get('/fine_tuning/jobs')
  listPaginatedFineTuningJobs(@Query('after') after: string | undefined, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Req() request: Request): ListPaginatedFineTuningJobsResponse | Promise<ListPaginatedFineTuningJobsResponse> | Observable<ListPaginatedFineTuningJobsResponse> {
    return this.fineTuningApi.listPaginatedFineTuningJobs(after, limit, request);
  }

  @Get('/fine_tuning/jobs/:fine_tuning_job_id')
  retrieveFineTuningJob(@Param('fine_tuning_job_id') fineTuningJobId: string, @Req() request: Request): FineTuningJob | Promise<FineTuningJob> | Observable<FineTuningJob> {
    return this.fineTuningApi.retrieveFineTuningJob(fineTuningJobId, request);
  }

} 