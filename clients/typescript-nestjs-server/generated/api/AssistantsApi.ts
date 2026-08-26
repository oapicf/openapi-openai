import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AssistantObject, CreateAssistantRequest, CreateMessageRequest, CreateRunRequest, CreateThreadAndRunRequest, CreateThreadRequest, DeleteAssistantResponse, DeleteMessageResponse, DeleteThreadResponse, ListAssistantsResponse, ListMessagesResponse, ListRunStepsResponse, ListRunsResponse, MessageObject, ModifyAssistantRequest, ModifyMessageRequest, ModifyRunRequest, ModifyThreadRequest, RunObject, RunStepObject, SubmitToolOutputsRunRequest, ThreadObject,  } from '../models';


@Injectable()
export abstract class AssistantsApi {

  abstract cancelRun(threadId: string, runId: string,  request: Request): RunObject | Promise<RunObject> | Observable<RunObject>;


  abstract createAssistant(createAssistantRequest: CreateAssistantRequest,  request: Request): AssistantObject | Promise<AssistantObject> | Observable<AssistantObject>;


  abstract createMessage(threadId: string, createMessageRequest: CreateMessageRequest,  request: Request): MessageObject | Promise<MessageObject> | Observable<MessageObject>;


  abstract createRun(threadId: string, createRunRequest: CreateRunRequest, include: Array<'step_details.tool_calls[*].file_search.results[*].content'> | undefined,  request: Request): RunObject | Promise<RunObject> | Observable<RunObject>;


  abstract createThread(createThreadRequest: CreateThreadRequest | undefined,  request: Request): ThreadObject | Promise<ThreadObject> | Observable<ThreadObject>;


  abstract createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest,  request: Request): RunObject | Promise<RunObject> | Observable<RunObject>;


  abstract deleteAssistant(assistantId: string,  request: Request): DeleteAssistantResponse | Promise<DeleteAssistantResponse> | Observable<DeleteAssistantResponse>;


  abstract deleteMessage(threadId: string, messageId: string,  request: Request): DeleteMessageResponse | Promise<DeleteMessageResponse> | Observable<DeleteMessageResponse>;


  abstract deleteThread(threadId: string,  request: Request): DeleteThreadResponse | Promise<DeleteThreadResponse> | Observable<DeleteThreadResponse>;


  abstract getAssistant(assistantId: string,  request: Request): AssistantObject | Promise<AssistantObject> | Observable<AssistantObject>;


  abstract getMessage(threadId: string, messageId: string,  request: Request): MessageObject | Promise<MessageObject> | Observable<MessageObject>;


  abstract getRun(threadId: string, runId: string,  request: Request): RunObject | Promise<RunObject> | Observable<RunObject>;


  abstract getRunStep(threadId: string, runId: string, stepId: string, include: Array<'step_details.tool_calls[*].file_search.results[*].content'> | undefined,  request: Request): RunStepObject | Promise<RunStepObject> | Observable<RunStepObject>;


  abstract getThread(threadId: string,  request: Request): ThreadObject | Promise<ThreadObject> | Observable<ThreadObject>;


  abstract listAssistants(limit: number | undefined, order: 'asc' | 'desc' | undefined, after: string | undefined, before: string | undefined,  request: Request): ListAssistantsResponse | Promise<ListAssistantsResponse> | Observable<ListAssistantsResponse>;


  abstract listMessages(threadId: string, limit: number | undefined, order: 'asc' | 'desc' | undefined, after: string | undefined, before: string | undefined, runId: string | undefined,  request: Request): ListMessagesResponse | Promise<ListMessagesResponse> | Observable<ListMessagesResponse>;


  abstract listRunSteps(threadId: string, runId: string, limit: number | undefined, order: 'asc' | 'desc' | undefined, after: string | undefined, before: string | undefined, include: Array<'step_details.tool_calls[*].file_search.results[*].content'> | undefined,  request: Request): ListRunStepsResponse | Promise<ListRunStepsResponse> | Observable<ListRunStepsResponse>;


  abstract listRuns(threadId: string, limit: number | undefined, order: 'asc' | 'desc' | undefined, after: string | undefined, before: string | undefined,  request: Request): ListRunsResponse | Promise<ListRunsResponse> | Observable<ListRunsResponse>;


  abstract modifyAssistant(assistantId: string, modifyAssistantRequest: ModifyAssistantRequest,  request: Request): AssistantObject | Promise<AssistantObject> | Observable<AssistantObject>;


  abstract modifyMessage(threadId: string, messageId: string, modifyMessageRequest: ModifyMessageRequest,  request: Request): MessageObject | Promise<MessageObject> | Observable<MessageObject>;


  abstract modifyRun(threadId: string, runId: string, modifyRunRequest: ModifyRunRequest,  request: Request): RunObject | Promise<RunObject> | Observable<RunObject>;


  abstract modifyThread(threadId: string, modifyThreadRequest: ModifyThreadRequest,  request: Request): ThreadObject | Promise<ThreadObject> | Observable<ThreadObject>;


  abstract submitToolOuputsToRun(threadId: string, runId: string, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest,  request: Request): RunObject | Promise<RunObject> | Observable<RunObject>;

} 