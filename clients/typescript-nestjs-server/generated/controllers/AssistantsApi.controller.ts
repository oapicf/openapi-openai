import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { AssistantsApi } from '../api';
import { AssistantObject, CreateAssistantRequest, CreateMessageRequest, CreateRunRequest, CreateThreadAndRunRequest, CreateThreadRequest, DeleteAssistantResponse, DeleteMessageResponse, DeleteThreadResponse, ListAssistantsResponse, ListMessagesResponse, ListRunStepsResponse, ListRunsResponse, MessageObject, ModifyAssistantRequest, ModifyMessageRequest, ModifyRunRequest, ModifyThreadRequest, RunObject, RunStepObject, SubmitToolOutputsRunRequest, ThreadObject,  } from '../models';

@Controller()
export class AssistantsApiController {
  constructor(private readonly assistantsApi: AssistantsApi) {}

  @Post('/threads/:thread_id/runs/:run_id/cancel')
  cancelRun(@Param('thread_id') threadId: string, @Param('run_id') runId: string, @Req() request: Request): RunObject | Promise<RunObject> | Observable<RunObject> {
    return this.assistantsApi.cancelRun(threadId, runId, request);
  }

  @Post('/assistants')
  createAssistant(@Body() createAssistantRequest: CreateAssistantRequest, @Req() request: Request): AssistantObject | Promise<AssistantObject> | Observable<AssistantObject> {
    return this.assistantsApi.createAssistant(createAssistantRequest, request);
  }

  @Post('/threads/:thread_id/messages')
  createMessage(@Param('thread_id') threadId: string, @Body() createMessageRequest: CreateMessageRequest, @Req() request: Request): MessageObject | Promise<MessageObject> | Observable<MessageObject> {
    return this.assistantsApi.createMessage(threadId, createMessageRequest, request);
  }

  @Post('/threads/:thread_id/runs')
  createRun(@Param('thread_id') threadId: string, @Body() createRunRequest: CreateRunRequest, @Query('include[]') include: Array<'step_details.tool_calls[*].file_search.results[*].content'> | undefined, @Req() request: Request): RunObject | Promise<RunObject> | Observable<RunObject> {
    return this.assistantsApi.createRun(threadId, createRunRequest, include, request);
  }

  @Post('/threads')
  createThread(@Body() createThreadRequest: CreateThreadRequest | undefined, @Req() request: Request): ThreadObject | Promise<ThreadObject> | Observable<ThreadObject> {
    return this.assistantsApi.createThread(createThreadRequest, request);
  }

  @Post('/threads/runs')
  createThreadAndRun(@Body() createThreadAndRunRequest: CreateThreadAndRunRequest, @Req() request: Request): RunObject | Promise<RunObject> | Observable<RunObject> {
    return this.assistantsApi.createThreadAndRun(createThreadAndRunRequest, request);
  }

  @Delete('/assistants/:assistant_id')
  deleteAssistant(@Param('assistant_id') assistantId: string, @Req() request: Request): DeleteAssistantResponse | Promise<DeleteAssistantResponse> | Observable<DeleteAssistantResponse> {
    return this.assistantsApi.deleteAssistant(assistantId, request);
  }

  @Delete('/threads/:thread_id/messages/:message_id')
  deleteMessage(@Param('thread_id') threadId: string, @Param('message_id') messageId: string, @Req() request: Request): DeleteMessageResponse | Promise<DeleteMessageResponse> | Observable<DeleteMessageResponse> {
    return this.assistantsApi.deleteMessage(threadId, messageId, request);
  }

  @Delete('/threads/:thread_id')
  deleteThread(@Param('thread_id') threadId: string, @Req() request: Request): DeleteThreadResponse | Promise<DeleteThreadResponse> | Observable<DeleteThreadResponse> {
    return this.assistantsApi.deleteThread(threadId, request);
  }

  @Get('/assistants/:assistant_id')
  getAssistant(@Param('assistant_id') assistantId: string, @Req() request: Request): AssistantObject | Promise<AssistantObject> | Observable<AssistantObject> {
    return this.assistantsApi.getAssistant(assistantId, request);
  }

  @Get('/threads/:thread_id/messages/:message_id')
  getMessage(@Param('thread_id') threadId: string, @Param('message_id') messageId: string, @Req() request: Request): MessageObject | Promise<MessageObject> | Observable<MessageObject> {
    return this.assistantsApi.getMessage(threadId, messageId, request);
  }

  @Get('/threads/:thread_id/runs/:run_id')
  getRun(@Param('thread_id') threadId: string, @Param('run_id') runId: string, @Req() request: Request): RunObject | Promise<RunObject> | Observable<RunObject> {
    return this.assistantsApi.getRun(threadId, runId, request);
  }

  @Get('/threads/:thread_id/runs/:run_id/steps/:step_id')
  getRunStep(@Param('thread_id') threadId: string, @Param('run_id') runId: string, @Param('step_id') stepId: string, @Query('include[]') include: Array<'step_details.tool_calls[*].file_search.results[*].content'> | undefined, @Req() request: Request): RunStepObject | Promise<RunStepObject> | Observable<RunStepObject> {
    return this.assistantsApi.getRunStep(threadId, runId, stepId, include, request);
  }

  @Get('/threads/:thread_id')
  getThread(@Param('thread_id') threadId: string, @Req() request: Request): ThreadObject | Promise<ThreadObject> | Observable<ThreadObject> {
    return this.assistantsApi.getThread(threadId, request);
  }

  @Get('/assistants')
  listAssistants(@Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('order', new DefaultValuePipe('desc')) order: 'asc' | 'desc' | undefined, @Query('after') after: string | undefined, @Query('before') before: string | undefined, @Req() request: Request): ListAssistantsResponse | Promise<ListAssistantsResponse> | Observable<ListAssistantsResponse> {
    return this.assistantsApi.listAssistants(limit, order, after, before, request);
  }

  @Get('/threads/:thread_id/messages')
  listMessages(@Param('thread_id') threadId: string, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('order', new DefaultValuePipe('desc')) order: 'asc' | 'desc' | undefined, @Query('after') after: string | undefined, @Query('before') before: string | undefined, @Query('run_id') runId: string | undefined, @Req() request: Request): ListMessagesResponse | Promise<ListMessagesResponse> | Observable<ListMessagesResponse> {
    return this.assistantsApi.listMessages(threadId, limit, order, after, before, runId, request);
  }

  @Get('/threads/:thread_id/runs/:run_id/steps')
  listRunSteps(@Param('thread_id') threadId: string, @Param('run_id') runId: string, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('order', new DefaultValuePipe('desc')) order: 'asc' | 'desc' | undefined, @Query('after') after: string | undefined, @Query('before') before: string | undefined, @Query('include[]') include: Array<'step_details.tool_calls[*].file_search.results[*].content'> | undefined, @Req() request: Request): ListRunStepsResponse | Promise<ListRunStepsResponse> | Observable<ListRunStepsResponse> {
    return this.assistantsApi.listRunSteps(threadId, runId, limit, order, after, before, include, request);
  }

  @Get('/threads/:thread_id/runs')
  listRuns(@Param('thread_id') threadId: string, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('order', new DefaultValuePipe('desc')) order: 'asc' | 'desc' | undefined, @Query('after') after: string | undefined, @Query('before') before: string | undefined, @Req() request: Request): ListRunsResponse | Promise<ListRunsResponse> | Observable<ListRunsResponse> {
    return this.assistantsApi.listRuns(threadId, limit, order, after, before, request);
  }

  @Post('/assistants/:assistant_id')
  modifyAssistant(@Param('assistant_id') assistantId: string, @Body() modifyAssistantRequest: ModifyAssistantRequest, @Req() request: Request): AssistantObject | Promise<AssistantObject> | Observable<AssistantObject> {
    return this.assistantsApi.modifyAssistant(assistantId, modifyAssistantRequest, request);
  }

  @Post('/threads/:thread_id/messages/:message_id')
  modifyMessage(@Param('thread_id') threadId: string, @Param('message_id') messageId: string, @Body() modifyMessageRequest: ModifyMessageRequest, @Req() request: Request): MessageObject | Promise<MessageObject> | Observable<MessageObject> {
    return this.assistantsApi.modifyMessage(threadId, messageId, modifyMessageRequest, request);
  }

  @Post('/threads/:thread_id/runs/:run_id')
  modifyRun(@Param('thread_id') threadId: string, @Param('run_id') runId: string, @Body() modifyRunRequest: ModifyRunRequest, @Req() request: Request): RunObject | Promise<RunObject> | Observable<RunObject> {
    return this.assistantsApi.modifyRun(threadId, runId, modifyRunRequest, request);
  }

  @Post('/threads/:thread_id')
  modifyThread(@Param('thread_id') threadId: string, @Body() modifyThreadRequest: ModifyThreadRequest, @Req() request: Request): ThreadObject | Promise<ThreadObject> | Observable<ThreadObject> {
    return this.assistantsApi.modifyThread(threadId, modifyThreadRequest, request);
  }

  @Post('/threads/:thread_id/runs/:run_id/submit_tool_outputs')
  submitToolOuputsToRun(@Param('thread_id') threadId: string, @Param('run_id') runId: string, @Body() submitToolOutputsRunRequest: SubmitToolOutputsRunRequest, @Req() request: Request): RunObject | Promise<RunObject> | Observable<RunObject> {
    return this.assistantsApi.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest, request);
  }

} 