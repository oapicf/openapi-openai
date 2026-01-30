import localVarRequest from 'request';

export * from './adminApiKey';
export * from './adminApiKeyOwner';
export * from './adminApiKeysCreateRequest';
export * from './adminApiKeysDelete200Response';
export * from './apiKeyList';
export * from './arrayOfContentPartsInner';
export * from './assistantObject';
export * from './assistantObjectToolResources';
export * from './assistantObjectToolResourcesCodeInterpreter';
export * from './assistantObjectToolResourcesFileSearch';
export * from './assistantObjectToolsInner';
export * from './assistantStreamEvent';
export * from './assistantToolsCode';
export * from './assistantToolsFileSearch';
export * from './assistantToolsFileSearchFileSearch';
export * from './assistantToolsFileSearchTypeOnly';
export * from './assistantToolsFunction';
export * from './assistantsApiResponseFormatOption';
export * from './assistantsApiToolChoiceOption';
export * from './assistantsNamedToolChoice';
export * from './assistantsNamedToolChoiceFunction';
export * from './audioResponseFormat';
export * from './auditLog';
export * from './auditLogActor';
export * from './auditLogActorApiKey';
export * from './auditLogActorServiceAccount';
export * from './auditLogActorSession';
export * from './auditLogActorUser';
export * from './auditLogApiKeyCreated';
export * from './auditLogApiKeyCreatedData';
export * from './auditLogApiKeyDeleted';
export * from './auditLogApiKeyUpdated';
export * from './auditLogApiKeyUpdatedChangesRequested';
export * from './auditLogEventType';
export * from './auditLogInviteAccepted';
export * from './auditLogInviteSent';
export * from './auditLogInviteSentData';
export * from './auditLogLoginFailed';
export * from './auditLogOrganizationUpdated';
export * from './auditLogOrganizationUpdatedChangesRequested';
export * from './auditLogOrganizationUpdatedChangesRequestedSettings';
export * from './auditLogProject';
export * from './auditLogProjectArchived';
export * from './auditLogProjectCreated';
export * from './auditLogProjectCreatedData';
export * from './auditLogProjectUpdated';
export * from './auditLogProjectUpdatedChangesRequested';
export * from './auditLogRateLimitDeleted';
export * from './auditLogRateLimitUpdated';
export * from './auditLogRateLimitUpdatedChangesRequested';
export * from './auditLogServiceAccountCreated';
export * from './auditLogServiceAccountCreatedData';
export * from './auditLogServiceAccountDeleted';
export * from './auditLogServiceAccountUpdated';
export * from './auditLogServiceAccountUpdatedChangesRequested';
export * from './auditLogUserAdded';
export * from './auditLogUserAddedData';
export * from './auditLogUserDeleted';
export * from './auditLogUserUpdated';
export * from './auditLogUserUpdatedChangesRequested';
export * from './autoChunkingStrategy';
export * from './autoChunkingStrategyRequestParam';
export * from './batch';
export * from './batchErrors';
export * from './batchErrorsDataInner';
export * from './batchRequestCounts';
export * from './batchRequestInput';
export * from './batchRequestOutput';
export * from './batchRequestOutputError';
export * from './batchRequestOutputResponse';
export * from './chatCompletionFunctionCallOption';
export * from './chatCompletionFunctions';
export * from './chatCompletionMessageToolCall';
export * from './chatCompletionMessageToolCallChunk';
export * from './chatCompletionMessageToolCallChunkFunction';
export * from './chatCompletionMessageToolCallFunction';
export * from './chatCompletionNamedToolChoice';
export * from './chatCompletionRequestAssistantMessage';
export * from './chatCompletionRequestAssistantMessageAudio';
export * from './chatCompletionRequestAssistantMessageContent';
export * from './chatCompletionRequestAssistantMessageContentPart';
export * from './chatCompletionRequestAssistantMessageFunctionCall';
export * from './chatCompletionRequestDeveloperMessage';
export * from './chatCompletionRequestDeveloperMessageContent';
export * from './chatCompletionRequestFunctionMessage';
export * from './chatCompletionRequestMessage';
export * from './chatCompletionRequestMessageContentPartAudio';
export * from './chatCompletionRequestMessageContentPartAudioInputAudio';
export * from './chatCompletionRequestMessageContentPartImage';
export * from './chatCompletionRequestMessageContentPartImageImageUrl';
export * from './chatCompletionRequestMessageContentPartRefusal';
export * from './chatCompletionRequestMessageContentPartText';
export * from './chatCompletionRequestSystemMessage';
export * from './chatCompletionRequestSystemMessageContent';
export * from './chatCompletionRequestToolMessage';
export * from './chatCompletionRequestToolMessageContent';
export * from './chatCompletionRequestUserMessage';
export * from './chatCompletionRequestUserMessageContent';
export * from './chatCompletionRequestUserMessageContentPart';
export * from './chatCompletionResponseMessage';
export * from './chatCompletionResponseMessageAudio';
export * from './chatCompletionResponseMessageFunctionCall';
export * from './chatCompletionRole';
export * from './chatCompletionStreamOptions';
export * from './chatCompletionStreamResponseDelta';
export * from './chatCompletionStreamResponseDeltaFunctionCall';
export * from './chatCompletionTokenLogprob';
export * from './chatCompletionTokenLogprobTopLogprobsInner';
export * from './chatCompletionTool';
export * from './chatCompletionToolChoiceOption';
export * from './chunkingStrategyRequestParam';
export * from './completeUploadRequest';
export * from './completionUsage';
export * from './completionUsageCompletionTokensDetails';
export * from './completionUsagePromptTokensDetails';
export * from './costsResult';
export * from './costsResultAmount';
export * from './createAssistantRequest';
export * from './createAssistantRequestModel';
export * from './createAssistantRequestToolResources';
export * from './createAssistantRequestToolResourcesCodeInterpreter';
export * from './createAssistantRequestToolResourcesFileSearch';
export * from './createAssistantRequestToolResourcesFileSearchVectorStoresInner';
export * from './createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy';
export * from './createBatchRequest';
export * from './createChatCompletionFunctionResponse';
export * from './createChatCompletionFunctionResponseChoicesInner';
export * from './createChatCompletionRequest';
export * from './createChatCompletionRequestAudio';
export * from './createChatCompletionRequestFunctionCall';
export * from './createChatCompletionRequestModel';
export * from './createChatCompletionRequestResponseFormat';
export * from './createChatCompletionRequestStop';
export * from './createChatCompletionResponse';
export * from './createChatCompletionResponseChoicesInner';
export * from './createChatCompletionResponseChoicesInnerLogprobs';
export * from './createChatCompletionStreamResponse';
export * from './createChatCompletionStreamResponseChoicesInner';
export * from './createChatCompletionStreamResponseUsage';
export * from './createCompletionRequest';
export * from './createCompletionRequestModel';
export * from './createCompletionRequestPrompt';
export * from './createCompletionRequestStop';
export * from './createCompletionResponse';
export * from './createCompletionResponseChoicesInner';
export * from './createCompletionResponseChoicesInnerLogprobs';
export * from './createEmbeddingRequest';
export * from './createEmbeddingRequestInput';
export * from './createEmbeddingRequestModel';
export * from './createEmbeddingResponse';
export * from './createEmbeddingResponseUsage';
export * from './createFineTuningJobRequest';
export * from './createFineTuningJobRequestHyperparameters';
export * from './createFineTuningJobRequestHyperparametersBatchSize';
export * from './createFineTuningJobRequestHyperparametersLearningRateMultiplier';
export * from './createFineTuningJobRequestHyperparametersNEpochs';
export * from './createFineTuningJobRequestIntegrationsInner';
export * from './createFineTuningJobRequestIntegrationsInnerWandb';
export * from './createFineTuningJobRequestModel';
export * from './createImageEditRequestModel';
export * from './createImageRequest';
export * from './createImageRequestModel';
export * from './createMessageRequest';
export * from './createMessageRequestAttachmentsInner';
export * from './createMessageRequestAttachmentsInnerToolsInner';
export * from './createMessageRequestContent';
export * from './createModerationRequest';
export * from './createModerationRequestInput';
export * from './createModerationRequestInputOneOfInner';
export * from './createModerationRequestInputOneOfInnerOneOf';
export * from './createModerationRequestInputOneOfInnerOneOf1';
export * from './createModerationRequestInputOneOfInnerOneOfImageUrl';
export * from './createModerationRequestModel';
export * from './createModerationResponse';
export * from './createModerationResponseResultsInner';
export * from './createModerationResponseResultsInnerCategories';
export * from './createModerationResponseResultsInnerCategoryAppliedInputTypes';
export * from './createModerationResponseResultsInnerCategoryScores';
export * from './createRunRequest';
export * from './createRunRequestModel';
export * from './createSpeechRequest';
export * from './createSpeechRequestModel';
export * from './createThreadAndRunRequest';
export * from './createThreadAndRunRequestToolResources';
export * from './createThreadAndRunRequestToolsInner';
export * from './createThreadRequest';
export * from './createThreadRequestToolResources';
export * from './createThreadRequestToolResourcesFileSearch';
export * from './createThreadRequestToolResourcesFileSearchVectorStoresInner';
export * from './createTranscription200Response';
export * from './createTranscriptionRequestModel';
export * from './createTranscriptionResponseJson';
export * from './createTranscriptionResponseVerboseJson';
export * from './createTranslation200Response';
export * from './createTranslationResponseJson';
export * from './createTranslationResponseVerboseJson';
export * from './createUploadRequest';
export * from './createVectorStoreFileBatchRequest';
export * from './createVectorStoreFileRequest';
export * from './createVectorStoreRequest';
export * from './createVectorStoreRequestChunkingStrategy';
export * from './defaultProjectErrorResponse';
export * from './deleteAssistantResponse';
export * from './deleteFileResponse';
export * from './deleteMessageResponse';
export * from './deleteModelResponse';
export * from './deleteThreadResponse';
export * from './deleteVectorStoreFileResponse';
export * from './deleteVectorStoreResponse';
export * from './doneEvent';
export * from './embedding';
export * from './errorEvent';
export * from './errorResponse';
export * from './fileSearchRankingOptions';
export * from './fineTuneChatCompletionRequestAssistantMessage';
export * from './fineTuneChatRequestInput';
export * from './fineTuneChatRequestInputMessagesInner';
export * from './fineTuneCompletionRequestInput';
export * from './fineTuneDPOMethod';
export * from './fineTuneDPOMethodHyperparameters';
export * from './fineTuneDPOMethodHyperparametersBatchSize';
export * from './fineTuneDPOMethodHyperparametersBeta';
export * from './fineTuneDPOMethodHyperparametersLearningRateMultiplier';
export * from './fineTuneDPOMethodHyperparametersNEpochs';
export * from './fineTuneMethod';
export * from './fineTunePreferenceRequestInput';
export * from './fineTunePreferenceRequestInputInput';
export * from './fineTunePreferenceRequestInputPreferredCompletionInner';
export * from './fineTuneSupervisedMethod';
export * from './fineTuneSupervisedMethodHyperparameters';
export * from './fineTuningIntegration';
export * from './fineTuningJob';
export * from './fineTuningJobCheckpoint';
export * from './fineTuningJobCheckpointMetrics';
export * from './fineTuningJobError';
export * from './fineTuningJobEvent';
export * from './fineTuningJobHyperparameters';
export * from './fineTuningJobIntegrationsInner';
export * from './functionObject';
export * from './image';
export * from './imagesResponse';
export * from './invite';
export * from './inviteDeleteResponse';
export * from './inviteListResponse';
export * from './inviteProjectsInner';
export * from './inviteRequest';
export * from './inviteRequestProjectsInner';
export * from './listAssistantsResponse';
export * from './listAuditLogsEffectiveAtParameter';
export * from './listAuditLogsResponse';
export * from './listBatchesResponse';
export * from './listFilesResponse';
export * from './listFineTuningJobCheckpointsResponse';
export * from './listFineTuningJobEventsResponse';
export * from './listMessagesResponse';
export * from './listModelsResponse';
export * from './listPaginatedFineTuningJobsResponse';
export * from './listRunStepsResponse';
export * from './listRunsResponse';
export * from './listThreadsResponse';
export * from './listVectorStoreFilesResponse';
export * from './listVectorStoresResponse';
export * from './messageContentImageFileObject';
export * from './messageContentImageFileObjectImageFile';
export * from './messageContentImageUrlObject';
export * from './messageContentImageUrlObjectImageUrl';
export * from './messageContentRefusalObject';
export * from './messageContentTextAnnotationsFileCitationObject';
export * from './messageContentTextAnnotationsFileCitationObjectFileCitation';
export * from './messageContentTextAnnotationsFilePathObject';
export * from './messageContentTextAnnotationsFilePathObjectFilePath';
export * from './messageContentTextObject';
export * from './messageContentTextObjectText';
export * from './messageContentTextObjectTextAnnotationsInner';
export * from './messageDeltaContentImageFileObject';
export * from './messageDeltaContentImageFileObjectImageFile';
export * from './messageDeltaContentImageUrlObject';
export * from './messageDeltaContentImageUrlObjectImageUrl';
export * from './messageDeltaContentRefusalObject';
export * from './messageDeltaContentTextAnnotationsFileCitationObject';
export * from './messageDeltaContentTextAnnotationsFileCitationObjectFileCitation';
export * from './messageDeltaContentTextAnnotationsFilePathObject';
export * from './messageDeltaContentTextAnnotationsFilePathObjectFilePath';
export * from './messageDeltaContentTextObject';
export * from './messageDeltaContentTextObjectText';
export * from './messageDeltaContentTextObjectTextAnnotationsInner';
export * from './messageDeltaObject';
export * from './messageDeltaObjectDelta';
export * from './messageDeltaObjectDeltaContentInner';
export * from './messageObject';
export * from './messageObjectContentInner';
export * from './messageObjectIncompleteDetails';
export * from './messageRequestContentTextObject';
export * from './messageStreamEvent';
export * from './messageStreamEventOneOf';
export * from './messageStreamEventOneOf1';
export * from './messageStreamEventOneOf2';
export * from './messageStreamEventOneOf3';
export * from './messageStreamEventOneOf4';
export * from './model';
export * from './modelError';
export * from './modifyAssistantRequest';
export * from './modifyAssistantRequestToolResources';
export * from './modifyAssistantRequestToolResourcesCodeInterpreter';
export * from './modifyAssistantRequestToolResourcesFileSearch';
export * from './modifyMessageRequest';
export * from './modifyRunRequest';
export * from './modifyThreadRequest';
export * from './modifyThreadRequestToolResources';
export * from './modifyThreadRequestToolResourcesFileSearch';
export * from './openAIFile';
export * from './otherChunkingStrategyResponseParam';
export * from './predictionContent';
export * from './predictionContentContent';
export * from './project';
export * from './projectApiKey';
export * from './projectApiKeyDeleteResponse';
export * from './projectApiKeyListResponse';
export * from './projectApiKeyOwner';
export * from './projectCreateRequest';
export * from './projectListResponse';
export * from './projectRateLimit';
export * from './projectRateLimitListResponse';
export * from './projectRateLimitUpdateRequest';
export * from './projectServiceAccount';
export * from './projectServiceAccountApiKey';
export * from './projectServiceAccountCreateRequest';
export * from './projectServiceAccountCreateResponse';
export * from './projectServiceAccountDeleteResponse';
export * from './projectServiceAccountListResponse';
export * from './projectUpdateRequest';
export * from './projectUser';
export * from './projectUserCreateRequest';
export * from './projectUserDeleteResponse';
export * from './projectUserListResponse';
export * from './projectUserUpdateRequest';
export * from './realtimeClientEventConversationItemCreate';
export * from './realtimeClientEventConversationItemDelete';
export * from './realtimeClientEventConversationItemTruncate';
export * from './realtimeClientEventInputAudioBufferAppend';
export * from './realtimeClientEventInputAudioBufferClear';
export * from './realtimeClientEventInputAudioBufferCommit';
export * from './realtimeClientEventResponseCancel';
export * from './realtimeClientEventResponseCreate';
export * from './realtimeClientEventSessionUpdate';
export * from './realtimeConversationItem';
export * from './realtimeConversationItemContentInner';
export * from './realtimeResponse';
export * from './realtimeResponseCreateParams';
export * from './realtimeResponseCreateParamsConversation';
export * from './realtimeResponseCreateParamsMaxResponseOutputTokens';
export * from './realtimeResponseCreateParamsToolsInner';
export * from './realtimeResponseStatusDetails';
export * from './realtimeResponseStatusDetailsError';
export * from './realtimeResponseUsage';
export * from './realtimeResponseUsageInputTokenDetails';
export * from './realtimeResponseUsageOutputTokenDetails';
export * from './realtimeServerEventConversationCreated';
export * from './realtimeServerEventConversationCreatedConversation';
export * from './realtimeServerEventConversationItemCreated';
export * from './realtimeServerEventConversationItemDeleted';
export * from './realtimeServerEventConversationItemInputAudioTranscriptionCompleted';
export * from './realtimeServerEventConversationItemInputAudioTranscriptionFailed';
export * from './realtimeServerEventConversationItemInputAudioTranscriptionFailedError';
export * from './realtimeServerEventConversationItemTruncated';
export * from './realtimeServerEventError';
export * from './realtimeServerEventErrorError';
export * from './realtimeServerEventInputAudioBufferCleared';
export * from './realtimeServerEventInputAudioBufferCommitted';
export * from './realtimeServerEventInputAudioBufferSpeechStarted';
export * from './realtimeServerEventInputAudioBufferSpeechStopped';
export * from './realtimeServerEventRateLimitsUpdated';
export * from './realtimeServerEventRateLimitsUpdatedRateLimitsInner';
export * from './realtimeServerEventResponseAudioDelta';
export * from './realtimeServerEventResponseAudioDone';
export * from './realtimeServerEventResponseAudioTranscriptDelta';
export * from './realtimeServerEventResponseAudioTranscriptDone';
export * from './realtimeServerEventResponseContentPartAdded';
export * from './realtimeServerEventResponseContentPartAddedPart';
export * from './realtimeServerEventResponseContentPartDone';
export * from './realtimeServerEventResponseContentPartDonePart';
export * from './realtimeServerEventResponseCreated';
export * from './realtimeServerEventResponseDone';
export * from './realtimeServerEventResponseFunctionCallArgumentsDelta';
export * from './realtimeServerEventResponseFunctionCallArgumentsDone';
export * from './realtimeServerEventResponseOutputItemAdded';
export * from './realtimeServerEventResponseOutputItemDone';
export * from './realtimeServerEventResponseTextDelta';
export * from './realtimeServerEventResponseTextDone';
export * from './realtimeServerEventSessionCreated';
export * from './realtimeServerEventSessionUpdated';
export * from './realtimeSession';
export * from './realtimeSessionCreateRequest';
export * from './realtimeSessionCreateRequestTurnDetection';
export * from './realtimeSessionCreateResponse';
export * from './realtimeSessionCreateResponseClientSecret';
export * from './realtimeSessionCreateResponseTurnDetection';
export * from './realtimeSessionInputAudioTranscription';
export * from './realtimeSessionModel';
export * from './realtimeSessionTurnDetection';
export * from './responseFormatJsonObject';
export * from './responseFormatJsonSchema';
export * from './responseFormatJsonSchemaJsonSchema';
export * from './responseFormatText';
export * from './runCompletionUsage';
export * from './runObject';
export * from './runObjectIncompleteDetails';
export * from './runObjectLastError';
export * from './runObjectRequiredAction';
export * from './runObjectRequiredActionSubmitToolOutputs';
export * from './runStepCompletionUsage';
export * from './runStepDeltaObject';
export * from './runStepDeltaObjectDelta';
export * from './runStepDeltaObjectDeltaStepDetails';
export * from './runStepDeltaStepDetailsMessageCreationObject';
export * from './runStepDeltaStepDetailsMessageCreationObjectMessageCreation';
export * from './runStepDeltaStepDetailsToolCallsCodeObject';
export * from './runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter';
export * from './runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
export * from './runStepDeltaStepDetailsToolCallsCodeOutputImageObject';
export * from './runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage';
export * from './runStepDeltaStepDetailsToolCallsCodeOutputLogsObject';
export * from './runStepDeltaStepDetailsToolCallsFileSearchObject';
export * from './runStepDeltaStepDetailsToolCallsFunctionObject';
export * from './runStepDeltaStepDetailsToolCallsFunctionObjectFunction';
export * from './runStepDeltaStepDetailsToolCallsObject';
export * from './runStepDeltaStepDetailsToolCallsObjectToolCallsInner';
export * from './runStepDetailsMessageCreationObject';
export * from './runStepDetailsMessageCreationObjectMessageCreation';
export * from './runStepDetailsToolCallsCodeObject';
export * from './runStepDetailsToolCallsCodeObjectCodeInterpreter';
export * from './runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
export * from './runStepDetailsToolCallsCodeOutputImageObject';
export * from './runStepDetailsToolCallsCodeOutputImageObjectImage';
export * from './runStepDetailsToolCallsCodeOutputLogsObject';
export * from './runStepDetailsToolCallsFileSearchObject';
export * from './runStepDetailsToolCallsFileSearchObjectFileSearch';
export * from './runStepDetailsToolCallsFileSearchRankingOptionsObject';
export * from './runStepDetailsToolCallsFileSearchResultObject';
export * from './runStepDetailsToolCallsFileSearchResultObjectContentInner';
export * from './runStepDetailsToolCallsFunctionObject';
export * from './runStepDetailsToolCallsFunctionObjectFunction';
export * from './runStepDetailsToolCallsObject';
export * from './runStepDetailsToolCallsObjectToolCallsInner';
export * from './runStepObject';
export * from './runStepObjectLastError';
export * from './runStepObjectStepDetails';
export * from './runStepStreamEvent';
export * from './runStepStreamEventOneOf';
export * from './runStepStreamEventOneOf1';
export * from './runStepStreamEventOneOf2';
export * from './runStepStreamEventOneOf3';
export * from './runStepStreamEventOneOf4';
export * from './runStepStreamEventOneOf5';
export * from './runStepStreamEventOneOf6';
export * from './runStreamEvent';
export * from './runStreamEventOneOf';
export * from './runStreamEventOneOf1';
export * from './runStreamEventOneOf2';
export * from './runStreamEventOneOf3';
export * from './runStreamEventOneOf4';
export * from './runStreamEventOneOf5';
export * from './runStreamEventOneOf6';
export * from './runStreamEventOneOf7';
export * from './runStreamEventOneOf8';
export * from './runStreamEventOneOf9';
export * from './runToolCallObject';
export * from './runToolCallObjectFunction';
export * from './staticChunkingStrategy';
export * from './staticChunkingStrategyRequestParam';
export * from './staticChunkingStrategyResponseParam';
export * from './staticChunkingStrategyStatic';
export * from './submitToolOutputsRunRequest';
export * from './submitToolOutputsRunRequestToolOutputsInner';
export * from './threadObject';
export * from './threadStreamEvent';
export * from './transcriptionSegment';
export * from './transcriptionWord';
export * from './truncationObject';
export * from './updateVectorStoreRequest';
export * from './upload';
export * from './uploadPart';
export * from './usageAudioSpeechesResult';
export * from './usageAudioTranscriptionsResult';
export * from './usageCodeInterpreterSessionsResult';
export * from './usageCompletionsResult';
export * from './usageEmbeddingsResult';
export * from './usageImagesResult';
export * from './usageModerationsResult';
export * from './usageResponse';
export * from './usageTimeBucket';
export * from './usageTimeBucketResultInner';
export * from './usageVectorStoresResult';
export * from './user';
export * from './userDeleteResponse';
export * from './userListResponse';
export * from './userRoleUpdateRequest';
export * from './vectorStoreExpirationAfter';
export * from './vectorStoreFileBatchObject';
export * from './vectorStoreFileBatchObjectFileCounts';
export * from './vectorStoreFileObject';
export * from './vectorStoreFileObjectChunkingStrategy';
export * from './vectorStoreFileObjectLastError';
export * from './vectorStoreObject';
export * from './vectorStoreObjectFileCounts';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { AdminApiKey } from './adminApiKey';
import { AdminApiKeyOwner } from './adminApiKeyOwner';
import { AdminApiKeysCreateRequest } from './adminApiKeysCreateRequest';
import { AdminApiKeysDelete200Response } from './adminApiKeysDelete200Response';
import { ApiKeyList } from './apiKeyList';
import { ArrayOfContentPartsInner } from './arrayOfContentPartsInner';
import { AssistantObject } from './assistantObject';
import { AssistantObjectToolResources } from './assistantObjectToolResources';
import { AssistantObjectToolResourcesCodeInterpreter } from './assistantObjectToolResourcesCodeInterpreter';
import { AssistantObjectToolResourcesFileSearch } from './assistantObjectToolResourcesFileSearch';
import { AssistantObjectToolsInner } from './assistantObjectToolsInner';
import { AssistantStreamEvent } from './assistantStreamEvent';
import { AssistantToolsCode } from './assistantToolsCode';
import { AssistantToolsFileSearch } from './assistantToolsFileSearch';
import { AssistantToolsFileSearchFileSearch } from './assistantToolsFileSearchFileSearch';
import { AssistantToolsFileSearchTypeOnly } from './assistantToolsFileSearchTypeOnly';
import { AssistantToolsFunction } from './assistantToolsFunction';
import { AssistantsApiResponseFormatOption } from './assistantsApiResponseFormatOption';
import { AssistantsApiToolChoiceOption } from './assistantsApiToolChoiceOption';
import { AssistantsNamedToolChoice } from './assistantsNamedToolChoice';
import { AssistantsNamedToolChoiceFunction } from './assistantsNamedToolChoiceFunction';
import { AudioResponseFormat } from './audioResponseFormat';
import { AuditLog } from './auditLog';
import { AuditLogActor } from './auditLogActor';
import { AuditLogActorApiKey } from './auditLogActorApiKey';
import { AuditLogActorServiceAccount } from './auditLogActorServiceAccount';
import { AuditLogActorSession } from './auditLogActorSession';
import { AuditLogActorUser } from './auditLogActorUser';
import { AuditLogApiKeyCreated } from './auditLogApiKeyCreated';
import { AuditLogApiKeyCreatedData } from './auditLogApiKeyCreatedData';
import { AuditLogApiKeyDeleted } from './auditLogApiKeyDeleted';
import { AuditLogApiKeyUpdated } from './auditLogApiKeyUpdated';
import { AuditLogApiKeyUpdatedChangesRequested } from './auditLogApiKeyUpdatedChangesRequested';
import { AuditLogEventType } from './auditLogEventType';
import { AuditLogInviteAccepted } from './auditLogInviteAccepted';
import { AuditLogInviteSent } from './auditLogInviteSent';
import { AuditLogInviteSentData } from './auditLogInviteSentData';
import { AuditLogLoginFailed } from './auditLogLoginFailed';
import { AuditLogOrganizationUpdated } from './auditLogOrganizationUpdated';
import { AuditLogOrganizationUpdatedChangesRequested } from './auditLogOrganizationUpdatedChangesRequested';
import { AuditLogOrganizationUpdatedChangesRequestedSettings } from './auditLogOrganizationUpdatedChangesRequestedSettings';
import { AuditLogProject } from './auditLogProject';
import { AuditLogProjectArchived } from './auditLogProjectArchived';
import { AuditLogProjectCreated } from './auditLogProjectCreated';
import { AuditLogProjectCreatedData } from './auditLogProjectCreatedData';
import { AuditLogProjectUpdated } from './auditLogProjectUpdated';
import { AuditLogProjectUpdatedChangesRequested } from './auditLogProjectUpdatedChangesRequested';
import { AuditLogRateLimitDeleted } from './auditLogRateLimitDeleted';
import { AuditLogRateLimitUpdated } from './auditLogRateLimitUpdated';
import { AuditLogRateLimitUpdatedChangesRequested } from './auditLogRateLimitUpdatedChangesRequested';
import { AuditLogServiceAccountCreated } from './auditLogServiceAccountCreated';
import { AuditLogServiceAccountCreatedData } from './auditLogServiceAccountCreatedData';
import { AuditLogServiceAccountDeleted } from './auditLogServiceAccountDeleted';
import { AuditLogServiceAccountUpdated } from './auditLogServiceAccountUpdated';
import { AuditLogServiceAccountUpdatedChangesRequested } from './auditLogServiceAccountUpdatedChangesRequested';
import { AuditLogUserAdded } from './auditLogUserAdded';
import { AuditLogUserAddedData } from './auditLogUserAddedData';
import { AuditLogUserDeleted } from './auditLogUserDeleted';
import { AuditLogUserUpdated } from './auditLogUserUpdated';
import { AuditLogUserUpdatedChangesRequested } from './auditLogUserUpdatedChangesRequested';
import { AutoChunkingStrategy } from './autoChunkingStrategy';
import { AutoChunkingStrategyRequestParam } from './autoChunkingStrategyRequestParam';
import { Batch } from './batch';
import { BatchErrors } from './batchErrors';
import { BatchErrorsDataInner } from './batchErrorsDataInner';
import { BatchRequestCounts } from './batchRequestCounts';
import { BatchRequestInput } from './batchRequestInput';
import { BatchRequestOutput } from './batchRequestOutput';
import { BatchRequestOutputError } from './batchRequestOutputError';
import { BatchRequestOutputResponse } from './batchRequestOutputResponse';
import { ChatCompletionFunctionCallOption } from './chatCompletionFunctionCallOption';
import { ChatCompletionFunctions } from './chatCompletionFunctions';
import { ChatCompletionMessageToolCall } from './chatCompletionMessageToolCall';
import { ChatCompletionMessageToolCallChunk } from './chatCompletionMessageToolCallChunk';
import { ChatCompletionMessageToolCallChunkFunction } from './chatCompletionMessageToolCallChunkFunction';
import { ChatCompletionMessageToolCallFunction } from './chatCompletionMessageToolCallFunction';
import { ChatCompletionNamedToolChoice } from './chatCompletionNamedToolChoice';
import { ChatCompletionRequestAssistantMessage } from './chatCompletionRequestAssistantMessage';
import { ChatCompletionRequestAssistantMessageAudio } from './chatCompletionRequestAssistantMessageAudio';
import { ChatCompletionRequestAssistantMessageContent } from './chatCompletionRequestAssistantMessageContent';
import { ChatCompletionRequestAssistantMessageContentPart } from './chatCompletionRequestAssistantMessageContentPart';
import { ChatCompletionRequestAssistantMessageFunctionCall } from './chatCompletionRequestAssistantMessageFunctionCall';
import { ChatCompletionRequestDeveloperMessage } from './chatCompletionRequestDeveloperMessage';
import { ChatCompletionRequestDeveloperMessageContent } from './chatCompletionRequestDeveloperMessageContent';
import { ChatCompletionRequestFunctionMessage } from './chatCompletionRequestFunctionMessage';
import { ChatCompletionRequestMessage } from './chatCompletionRequestMessage';
import { ChatCompletionRequestMessageContentPartAudio } from './chatCompletionRequestMessageContentPartAudio';
import { ChatCompletionRequestMessageContentPartAudioInputAudio } from './chatCompletionRequestMessageContentPartAudioInputAudio';
import { ChatCompletionRequestMessageContentPartImage } from './chatCompletionRequestMessageContentPartImage';
import { ChatCompletionRequestMessageContentPartImageImageUrl } from './chatCompletionRequestMessageContentPartImageImageUrl';
import { ChatCompletionRequestMessageContentPartRefusal } from './chatCompletionRequestMessageContentPartRefusal';
import { ChatCompletionRequestMessageContentPartText } from './chatCompletionRequestMessageContentPartText';
import { ChatCompletionRequestSystemMessage } from './chatCompletionRequestSystemMessage';
import { ChatCompletionRequestSystemMessageContent } from './chatCompletionRequestSystemMessageContent';
import { ChatCompletionRequestToolMessage } from './chatCompletionRequestToolMessage';
import { ChatCompletionRequestToolMessageContent } from './chatCompletionRequestToolMessageContent';
import { ChatCompletionRequestUserMessage } from './chatCompletionRequestUserMessage';
import { ChatCompletionRequestUserMessageContent } from './chatCompletionRequestUserMessageContent';
import { ChatCompletionRequestUserMessageContentPart } from './chatCompletionRequestUserMessageContentPart';
import { ChatCompletionResponseMessage } from './chatCompletionResponseMessage';
import { ChatCompletionResponseMessageAudio } from './chatCompletionResponseMessageAudio';
import { ChatCompletionResponseMessageFunctionCall } from './chatCompletionResponseMessageFunctionCall';
import { ChatCompletionRole } from './chatCompletionRole';
import { ChatCompletionStreamOptions } from './chatCompletionStreamOptions';
import { ChatCompletionStreamResponseDelta } from './chatCompletionStreamResponseDelta';
import { ChatCompletionStreamResponseDeltaFunctionCall } from './chatCompletionStreamResponseDeltaFunctionCall';
import { ChatCompletionTokenLogprob } from './chatCompletionTokenLogprob';
import { ChatCompletionTokenLogprobTopLogprobsInner } from './chatCompletionTokenLogprobTopLogprobsInner';
import { ChatCompletionTool } from './chatCompletionTool';
import { ChatCompletionToolChoiceOption } from './chatCompletionToolChoiceOption';
import { ChunkingStrategyRequestParam } from './chunkingStrategyRequestParam';
import { CompleteUploadRequest } from './completeUploadRequest';
import { CompletionUsage } from './completionUsage';
import { CompletionUsageCompletionTokensDetails } from './completionUsageCompletionTokensDetails';
import { CompletionUsagePromptTokensDetails } from './completionUsagePromptTokensDetails';
import { CostsResult } from './costsResult';
import { CostsResultAmount } from './costsResultAmount';
import { CreateAssistantRequest } from './createAssistantRequest';
import { CreateAssistantRequestModel } from './createAssistantRequestModel';
import { CreateAssistantRequestToolResources } from './createAssistantRequestToolResources';
import { CreateAssistantRequestToolResourcesCodeInterpreter } from './createAssistantRequestToolResourcesCodeInterpreter';
import { CreateAssistantRequestToolResourcesFileSearch } from './createAssistantRequestToolResourcesFileSearch';
import { CreateAssistantRequestToolResourcesFileSearchVectorStoresInner } from './createAssistantRequestToolResourcesFileSearchVectorStoresInner';
import { CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy } from './createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy';
import { CreateBatchRequest } from './createBatchRequest';
import { CreateChatCompletionFunctionResponse } from './createChatCompletionFunctionResponse';
import { CreateChatCompletionFunctionResponseChoicesInner } from './createChatCompletionFunctionResponseChoicesInner';
import { CreateChatCompletionRequest } from './createChatCompletionRequest';
import { CreateChatCompletionRequestAudio } from './createChatCompletionRequestAudio';
import { CreateChatCompletionRequestFunctionCall } from './createChatCompletionRequestFunctionCall';
import { CreateChatCompletionRequestModel } from './createChatCompletionRequestModel';
import { CreateChatCompletionRequestResponseFormat } from './createChatCompletionRequestResponseFormat';
import { CreateChatCompletionRequestStop } from './createChatCompletionRequestStop';
import { CreateChatCompletionResponse } from './createChatCompletionResponse';
import { CreateChatCompletionResponseChoicesInner } from './createChatCompletionResponseChoicesInner';
import { CreateChatCompletionResponseChoicesInnerLogprobs } from './createChatCompletionResponseChoicesInnerLogprobs';
import { CreateChatCompletionStreamResponse } from './createChatCompletionStreamResponse';
import { CreateChatCompletionStreamResponseChoicesInner } from './createChatCompletionStreamResponseChoicesInner';
import { CreateChatCompletionStreamResponseUsage } from './createChatCompletionStreamResponseUsage';
import { CreateCompletionRequest } from './createCompletionRequest';
import { CreateCompletionRequestModel } from './createCompletionRequestModel';
import { CreateCompletionRequestPrompt } from './createCompletionRequestPrompt';
import { CreateCompletionRequestStop } from './createCompletionRequestStop';
import { CreateCompletionResponse } from './createCompletionResponse';
import { CreateCompletionResponseChoicesInner } from './createCompletionResponseChoicesInner';
import { CreateCompletionResponseChoicesInnerLogprobs } from './createCompletionResponseChoicesInnerLogprobs';
import { CreateEmbeddingRequest } from './createEmbeddingRequest';
import { CreateEmbeddingRequestInput } from './createEmbeddingRequestInput';
import { CreateEmbeddingRequestModel } from './createEmbeddingRequestModel';
import { CreateEmbeddingResponse } from './createEmbeddingResponse';
import { CreateEmbeddingResponseUsage } from './createEmbeddingResponseUsage';
import { CreateFineTuningJobRequest } from './createFineTuningJobRequest';
import { CreateFineTuningJobRequestHyperparameters } from './createFineTuningJobRequestHyperparameters';
import { CreateFineTuningJobRequestHyperparametersBatchSize } from './createFineTuningJobRequestHyperparametersBatchSize';
import { CreateFineTuningJobRequestHyperparametersLearningRateMultiplier } from './createFineTuningJobRequestHyperparametersLearningRateMultiplier';
import { CreateFineTuningJobRequestHyperparametersNEpochs } from './createFineTuningJobRequestHyperparametersNEpochs';
import { CreateFineTuningJobRequestIntegrationsInner } from './createFineTuningJobRequestIntegrationsInner';
import { CreateFineTuningJobRequestIntegrationsInnerWandb } from './createFineTuningJobRequestIntegrationsInnerWandb';
import { CreateFineTuningJobRequestModel } from './createFineTuningJobRequestModel';
import { CreateImageEditRequestModel } from './createImageEditRequestModel';
import { CreateImageRequest } from './createImageRequest';
import { CreateImageRequestModel } from './createImageRequestModel';
import { CreateMessageRequest } from './createMessageRequest';
import { CreateMessageRequestAttachmentsInner } from './createMessageRequestAttachmentsInner';
import { CreateMessageRequestAttachmentsInnerToolsInner } from './createMessageRequestAttachmentsInnerToolsInner';
import { CreateMessageRequestContent } from './createMessageRequestContent';
import { CreateModerationRequest } from './createModerationRequest';
import { CreateModerationRequestInput } from './createModerationRequestInput';
import { CreateModerationRequestInputOneOfInner } from './createModerationRequestInputOneOfInner';
import { CreateModerationRequestInputOneOfInnerOneOf } from './createModerationRequestInputOneOfInnerOneOf';
import { CreateModerationRequestInputOneOfInnerOneOf1 } from './createModerationRequestInputOneOfInnerOneOf1';
import { CreateModerationRequestInputOneOfInnerOneOfImageUrl } from './createModerationRequestInputOneOfInnerOneOfImageUrl';
import { CreateModerationRequestModel } from './createModerationRequestModel';
import { CreateModerationResponse } from './createModerationResponse';
import { CreateModerationResponseResultsInner } from './createModerationResponseResultsInner';
import { CreateModerationResponseResultsInnerCategories } from './createModerationResponseResultsInnerCategories';
import { CreateModerationResponseResultsInnerCategoryAppliedInputTypes } from './createModerationResponseResultsInnerCategoryAppliedInputTypes';
import { CreateModerationResponseResultsInnerCategoryScores } from './createModerationResponseResultsInnerCategoryScores';
import { CreateRunRequest } from './createRunRequest';
import { CreateRunRequestModel } from './createRunRequestModel';
import { CreateSpeechRequest } from './createSpeechRequest';
import { CreateSpeechRequestModel } from './createSpeechRequestModel';
import { CreateThreadAndRunRequest } from './createThreadAndRunRequest';
import { CreateThreadAndRunRequestToolResources } from './createThreadAndRunRequestToolResources';
import { CreateThreadAndRunRequestToolsInner } from './createThreadAndRunRequestToolsInner';
import { CreateThreadRequest } from './createThreadRequest';
import { CreateThreadRequestToolResources } from './createThreadRequestToolResources';
import { CreateThreadRequestToolResourcesFileSearch } from './createThreadRequestToolResourcesFileSearch';
import { CreateThreadRequestToolResourcesFileSearchVectorStoresInner } from './createThreadRequestToolResourcesFileSearchVectorStoresInner';
import { CreateTranscription200Response } from './createTranscription200Response';
import { CreateTranscriptionRequestModel } from './createTranscriptionRequestModel';
import { CreateTranscriptionResponseJson } from './createTranscriptionResponseJson';
import { CreateTranscriptionResponseVerboseJson } from './createTranscriptionResponseVerboseJson';
import { CreateTranslation200Response } from './createTranslation200Response';
import { CreateTranslationResponseJson } from './createTranslationResponseJson';
import { CreateTranslationResponseVerboseJson } from './createTranslationResponseVerboseJson';
import { CreateUploadRequest } from './createUploadRequest';
import { CreateVectorStoreFileBatchRequest } from './createVectorStoreFileBatchRequest';
import { CreateVectorStoreFileRequest } from './createVectorStoreFileRequest';
import { CreateVectorStoreRequest } from './createVectorStoreRequest';
import { CreateVectorStoreRequestChunkingStrategy } from './createVectorStoreRequestChunkingStrategy';
import { DefaultProjectErrorResponse } from './defaultProjectErrorResponse';
import { DeleteAssistantResponse } from './deleteAssistantResponse';
import { DeleteFileResponse } from './deleteFileResponse';
import { DeleteMessageResponse } from './deleteMessageResponse';
import { DeleteModelResponse } from './deleteModelResponse';
import { DeleteThreadResponse } from './deleteThreadResponse';
import { DeleteVectorStoreFileResponse } from './deleteVectorStoreFileResponse';
import { DeleteVectorStoreResponse } from './deleteVectorStoreResponse';
import { DoneEvent } from './doneEvent';
import { Embedding } from './embedding';
import { ErrorEvent } from './errorEvent';
import { ErrorResponse } from './errorResponse';
import { FileSearchRankingOptions } from './fileSearchRankingOptions';
import { FineTuneChatCompletionRequestAssistantMessage } from './fineTuneChatCompletionRequestAssistantMessage';
import { FineTuneChatRequestInput } from './fineTuneChatRequestInput';
import { FineTuneChatRequestInputMessagesInner } from './fineTuneChatRequestInputMessagesInner';
import { FineTuneCompletionRequestInput } from './fineTuneCompletionRequestInput';
import { FineTuneDPOMethod } from './fineTuneDPOMethod';
import { FineTuneDPOMethodHyperparameters } from './fineTuneDPOMethodHyperparameters';
import { FineTuneDPOMethodHyperparametersBatchSize } from './fineTuneDPOMethodHyperparametersBatchSize';
import { FineTuneDPOMethodHyperparametersBeta } from './fineTuneDPOMethodHyperparametersBeta';
import { FineTuneDPOMethodHyperparametersLearningRateMultiplier } from './fineTuneDPOMethodHyperparametersLearningRateMultiplier';
import { FineTuneDPOMethodHyperparametersNEpochs } from './fineTuneDPOMethodHyperparametersNEpochs';
import { FineTuneMethod } from './fineTuneMethod';
import { FineTunePreferenceRequestInput } from './fineTunePreferenceRequestInput';
import { FineTunePreferenceRequestInputInput } from './fineTunePreferenceRequestInputInput';
import { FineTunePreferenceRequestInputPreferredCompletionInner } from './fineTunePreferenceRequestInputPreferredCompletionInner';
import { FineTuneSupervisedMethod } from './fineTuneSupervisedMethod';
import { FineTuneSupervisedMethodHyperparameters } from './fineTuneSupervisedMethodHyperparameters';
import { FineTuningIntegration } from './fineTuningIntegration';
import { FineTuningJob } from './fineTuningJob';
import { FineTuningJobCheckpoint } from './fineTuningJobCheckpoint';
import { FineTuningJobCheckpointMetrics } from './fineTuningJobCheckpointMetrics';
import { FineTuningJobError } from './fineTuningJobError';
import { FineTuningJobEvent } from './fineTuningJobEvent';
import { FineTuningJobHyperparameters } from './fineTuningJobHyperparameters';
import { FineTuningJobIntegrationsInner } from './fineTuningJobIntegrationsInner';
import { FunctionObject } from './functionObject';
import { Image } from './image';
import { ImagesResponse } from './imagesResponse';
import { Invite } from './invite';
import { InviteDeleteResponse } from './inviteDeleteResponse';
import { InviteListResponse } from './inviteListResponse';
import { InviteProjectsInner } from './inviteProjectsInner';
import { InviteRequest } from './inviteRequest';
import { InviteRequestProjectsInner } from './inviteRequestProjectsInner';
import { ListAssistantsResponse } from './listAssistantsResponse';
import { ListAuditLogsEffectiveAtParameter } from './listAuditLogsEffectiveAtParameter';
import { ListAuditLogsResponse } from './listAuditLogsResponse';
import { ListBatchesResponse } from './listBatchesResponse';
import { ListFilesResponse } from './listFilesResponse';
import { ListFineTuningJobCheckpointsResponse } from './listFineTuningJobCheckpointsResponse';
import { ListFineTuningJobEventsResponse } from './listFineTuningJobEventsResponse';
import { ListMessagesResponse } from './listMessagesResponse';
import { ListModelsResponse } from './listModelsResponse';
import { ListPaginatedFineTuningJobsResponse } from './listPaginatedFineTuningJobsResponse';
import { ListRunStepsResponse } from './listRunStepsResponse';
import { ListRunsResponse } from './listRunsResponse';
import { ListThreadsResponse } from './listThreadsResponse';
import { ListVectorStoreFilesResponse } from './listVectorStoreFilesResponse';
import { ListVectorStoresResponse } from './listVectorStoresResponse';
import { MessageContentImageFileObject } from './messageContentImageFileObject';
import { MessageContentImageFileObjectImageFile } from './messageContentImageFileObjectImageFile';
import { MessageContentImageUrlObject } from './messageContentImageUrlObject';
import { MessageContentImageUrlObjectImageUrl } from './messageContentImageUrlObjectImageUrl';
import { MessageContentRefusalObject } from './messageContentRefusalObject';
import { MessageContentTextAnnotationsFileCitationObject } from './messageContentTextAnnotationsFileCitationObject';
import { MessageContentTextAnnotationsFileCitationObjectFileCitation } from './messageContentTextAnnotationsFileCitationObjectFileCitation';
import { MessageContentTextAnnotationsFilePathObject } from './messageContentTextAnnotationsFilePathObject';
import { MessageContentTextAnnotationsFilePathObjectFilePath } from './messageContentTextAnnotationsFilePathObjectFilePath';
import { MessageContentTextObject } from './messageContentTextObject';
import { MessageContentTextObjectText } from './messageContentTextObjectText';
import { MessageContentTextObjectTextAnnotationsInner } from './messageContentTextObjectTextAnnotationsInner';
import { MessageDeltaContentImageFileObject } from './messageDeltaContentImageFileObject';
import { MessageDeltaContentImageFileObjectImageFile } from './messageDeltaContentImageFileObjectImageFile';
import { MessageDeltaContentImageUrlObject } from './messageDeltaContentImageUrlObject';
import { MessageDeltaContentImageUrlObjectImageUrl } from './messageDeltaContentImageUrlObjectImageUrl';
import { MessageDeltaContentRefusalObject } from './messageDeltaContentRefusalObject';
import { MessageDeltaContentTextAnnotationsFileCitationObject } from './messageDeltaContentTextAnnotationsFileCitationObject';
import { MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation } from './messageDeltaContentTextAnnotationsFileCitationObjectFileCitation';
import { MessageDeltaContentTextAnnotationsFilePathObject } from './messageDeltaContentTextAnnotationsFilePathObject';
import { MessageDeltaContentTextAnnotationsFilePathObjectFilePath } from './messageDeltaContentTextAnnotationsFilePathObjectFilePath';
import { MessageDeltaContentTextObject } from './messageDeltaContentTextObject';
import { MessageDeltaContentTextObjectText } from './messageDeltaContentTextObjectText';
import { MessageDeltaContentTextObjectTextAnnotationsInner } from './messageDeltaContentTextObjectTextAnnotationsInner';
import { MessageDeltaObject } from './messageDeltaObject';
import { MessageDeltaObjectDelta } from './messageDeltaObjectDelta';
import { MessageDeltaObjectDeltaContentInner } from './messageDeltaObjectDeltaContentInner';
import { MessageObject } from './messageObject';
import { MessageObjectContentInner } from './messageObjectContentInner';
import { MessageObjectIncompleteDetails } from './messageObjectIncompleteDetails';
import { MessageRequestContentTextObject } from './messageRequestContentTextObject';
import { MessageStreamEvent } from './messageStreamEvent';
import { MessageStreamEventOneOf } from './messageStreamEventOneOf';
import { MessageStreamEventOneOf1 } from './messageStreamEventOneOf1';
import { MessageStreamEventOneOf2 } from './messageStreamEventOneOf2';
import { MessageStreamEventOneOf3 } from './messageStreamEventOneOf3';
import { MessageStreamEventOneOf4 } from './messageStreamEventOneOf4';
import { Model } from './model';
import { ModelError } from './modelError';
import { ModifyAssistantRequest } from './modifyAssistantRequest';
import { ModifyAssistantRequestToolResources } from './modifyAssistantRequestToolResources';
import { ModifyAssistantRequestToolResourcesCodeInterpreter } from './modifyAssistantRequestToolResourcesCodeInterpreter';
import { ModifyAssistantRequestToolResourcesFileSearch } from './modifyAssistantRequestToolResourcesFileSearch';
import { ModifyMessageRequest } from './modifyMessageRequest';
import { ModifyRunRequest } from './modifyRunRequest';
import { ModifyThreadRequest } from './modifyThreadRequest';
import { ModifyThreadRequestToolResources } from './modifyThreadRequestToolResources';
import { ModifyThreadRequestToolResourcesFileSearch } from './modifyThreadRequestToolResourcesFileSearch';
import { OpenAIFile } from './openAIFile';
import { OtherChunkingStrategyResponseParam } from './otherChunkingStrategyResponseParam';
import { PredictionContent } from './predictionContent';
import { PredictionContentContent } from './predictionContentContent';
import { Project } from './project';
import { ProjectApiKey } from './projectApiKey';
import { ProjectApiKeyDeleteResponse } from './projectApiKeyDeleteResponse';
import { ProjectApiKeyListResponse } from './projectApiKeyListResponse';
import { ProjectApiKeyOwner } from './projectApiKeyOwner';
import { ProjectCreateRequest } from './projectCreateRequest';
import { ProjectListResponse } from './projectListResponse';
import { ProjectRateLimit } from './projectRateLimit';
import { ProjectRateLimitListResponse } from './projectRateLimitListResponse';
import { ProjectRateLimitUpdateRequest } from './projectRateLimitUpdateRequest';
import { ProjectServiceAccount } from './projectServiceAccount';
import { ProjectServiceAccountApiKey } from './projectServiceAccountApiKey';
import { ProjectServiceAccountCreateRequest } from './projectServiceAccountCreateRequest';
import { ProjectServiceAccountCreateResponse } from './projectServiceAccountCreateResponse';
import { ProjectServiceAccountDeleteResponse } from './projectServiceAccountDeleteResponse';
import { ProjectServiceAccountListResponse } from './projectServiceAccountListResponse';
import { ProjectUpdateRequest } from './projectUpdateRequest';
import { ProjectUser } from './projectUser';
import { ProjectUserCreateRequest } from './projectUserCreateRequest';
import { ProjectUserDeleteResponse } from './projectUserDeleteResponse';
import { ProjectUserListResponse } from './projectUserListResponse';
import { ProjectUserUpdateRequest } from './projectUserUpdateRequest';
import { RealtimeClientEventConversationItemCreate } from './realtimeClientEventConversationItemCreate';
import { RealtimeClientEventConversationItemDelete } from './realtimeClientEventConversationItemDelete';
import { RealtimeClientEventConversationItemTruncate } from './realtimeClientEventConversationItemTruncate';
import { RealtimeClientEventInputAudioBufferAppend } from './realtimeClientEventInputAudioBufferAppend';
import { RealtimeClientEventInputAudioBufferClear } from './realtimeClientEventInputAudioBufferClear';
import { RealtimeClientEventInputAudioBufferCommit } from './realtimeClientEventInputAudioBufferCommit';
import { RealtimeClientEventResponseCancel } from './realtimeClientEventResponseCancel';
import { RealtimeClientEventResponseCreate } from './realtimeClientEventResponseCreate';
import { RealtimeClientEventSessionUpdate } from './realtimeClientEventSessionUpdate';
import { RealtimeConversationItem } from './realtimeConversationItem';
import { RealtimeConversationItemContentInner } from './realtimeConversationItemContentInner';
import { RealtimeResponse } from './realtimeResponse';
import { RealtimeResponseCreateParams } from './realtimeResponseCreateParams';
import { RealtimeResponseCreateParamsConversation } from './realtimeResponseCreateParamsConversation';
import { RealtimeResponseCreateParamsMaxResponseOutputTokens } from './realtimeResponseCreateParamsMaxResponseOutputTokens';
import { RealtimeResponseCreateParamsToolsInner } from './realtimeResponseCreateParamsToolsInner';
import { RealtimeResponseStatusDetails } from './realtimeResponseStatusDetails';
import { RealtimeResponseStatusDetailsError } from './realtimeResponseStatusDetailsError';
import { RealtimeResponseUsage } from './realtimeResponseUsage';
import { RealtimeResponseUsageInputTokenDetails } from './realtimeResponseUsageInputTokenDetails';
import { RealtimeResponseUsageOutputTokenDetails } from './realtimeResponseUsageOutputTokenDetails';
import { RealtimeServerEventConversationCreated } from './realtimeServerEventConversationCreated';
import { RealtimeServerEventConversationCreatedConversation } from './realtimeServerEventConversationCreatedConversation';
import { RealtimeServerEventConversationItemCreated } from './realtimeServerEventConversationItemCreated';
import { RealtimeServerEventConversationItemDeleted } from './realtimeServerEventConversationItemDeleted';
import { RealtimeServerEventConversationItemInputAudioTranscriptionCompleted } from './realtimeServerEventConversationItemInputAudioTranscriptionCompleted';
import { RealtimeServerEventConversationItemInputAudioTranscriptionFailed } from './realtimeServerEventConversationItemInputAudioTranscriptionFailed';
import { RealtimeServerEventConversationItemInputAudioTranscriptionFailedError } from './realtimeServerEventConversationItemInputAudioTranscriptionFailedError';
import { RealtimeServerEventConversationItemTruncated } from './realtimeServerEventConversationItemTruncated';
import { RealtimeServerEventError } from './realtimeServerEventError';
import { RealtimeServerEventErrorError } from './realtimeServerEventErrorError';
import { RealtimeServerEventInputAudioBufferCleared } from './realtimeServerEventInputAudioBufferCleared';
import { RealtimeServerEventInputAudioBufferCommitted } from './realtimeServerEventInputAudioBufferCommitted';
import { RealtimeServerEventInputAudioBufferSpeechStarted } from './realtimeServerEventInputAudioBufferSpeechStarted';
import { RealtimeServerEventInputAudioBufferSpeechStopped } from './realtimeServerEventInputAudioBufferSpeechStopped';
import { RealtimeServerEventRateLimitsUpdated } from './realtimeServerEventRateLimitsUpdated';
import { RealtimeServerEventRateLimitsUpdatedRateLimitsInner } from './realtimeServerEventRateLimitsUpdatedRateLimitsInner';
import { RealtimeServerEventResponseAudioDelta } from './realtimeServerEventResponseAudioDelta';
import { RealtimeServerEventResponseAudioDone } from './realtimeServerEventResponseAudioDone';
import { RealtimeServerEventResponseAudioTranscriptDelta } from './realtimeServerEventResponseAudioTranscriptDelta';
import { RealtimeServerEventResponseAudioTranscriptDone } from './realtimeServerEventResponseAudioTranscriptDone';
import { RealtimeServerEventResponseContentPartAdded } from './realtimeServerEventResponseContentPartAdded';
import { RealtimeServerEventResponseContentPartAddedPart } from './realtimeServerEventResponseContentPartAddedPart';
import { RealtimeServerEventResponseContentPartDone } from './realtimeServerEventResponseContentPartDone';
import { RealtimeServerEventResponseContentPartDonePart } from './realtimeServerEventResponseContentPartDonePart';
import { RealtimeServerEventResponseCreated } from './realtimeServerEventResponseCreated';
import { RealtimeServerEventResponseDone } from './realtimeServerEventResponseDone';
import { RealtimeServerEventResponseFunctionCallArgumentsDelta } from './realtimeServerEventResponseFunctionCallArgumentsDelta';
import { RealtimeServerEventResponseFunctionCallArgumentsDone } from './realtimeServerEventResponseFunctionCallArgumentsDone';
import { RealtimeServerEventResponseOutputItemAdded } from './realtimeServerEventResponseOutputItemAdded';
import { RealtimeServerEventResponseOutputItemDone } from './realtimeServerEventResponseOutputItemDone';
import { RealtimeServerEventResponseTextDelta } from './realtimeServerEventResponseTextDelta';
import { RealtimeServerEventResponseTextDone } from './realtimeServerEventResponseTextDone';
import { RealtimeServerEventSessionCreated } from './realtimeServerEventSessionCreated';
import { RealtimeServerEventSessionUpdated } from './realtimeServerEventSessionUpdated';
import { RealtimeSession } from './realtimeSession';
import { RealtimeSessionCreateRequest } from './realtimeSessionCreateRequest';
import { RealtimeSessionCreateRequestTurnDetection } from './realtimeSessionCreateRequestTurnDetection';
import { RealtimeSessionCreateResponse } from './realtimeSessionCreateResponse';
import { RealtimeSessionCreateResponseClientSecret } from './realtimeSessionCreateResponseClientSecret';
import { RealtimeSessionCreateResponseTurnDetection } from './realtimeSessionCreateResponseTurnDetection';
import { RealtimeSessionInputAudioTranscription } from './realtimeSessionInputAudioTranscription';
import { RealtimeSessionModel } from './realtimeSessionModel';
import { RealtimeSessionTurnDetection } from './realtimeSessionTurnDetection';
import { ResponseFormatJsonObject } from './responseFormatJsonObject';
import { ResponseFormatJsonSchema } from './responseFormatJsonSchema';
import { ResponseFormatJsonSchemaJsonSchema } from './responseFormatJsonSchemaJsonSchema';
import { ResponseFormatText } from './responseFormatText';
import { RunCompletionUsage } from './runCompletionUsage';
import { RunObject } from './runObject';
import { RunObjectIncompleteDetails } from './runObjectIncompleteDetails';
import { RunObjectLastError } from './runObjectLastError';
import { RunObjectRequiredAction } from './runObjectRequiredAction';
import { RunObjectRequiredActionSubmitToolOutputs } from './runObjectRequiredActionSubmitToolOutputs';
import { RunStepCompletionUsage } from './runStepCompletionUsage';
import { RunStepDeltaObject } from './runStepDeltaObject';
import { RunStepDeltaObjectDelta } from './runStepDeltaObjectDelta';
import { RunStepDeltaObjectDeltaStepDetails } from './runStepDeltaObjectDeltaStepDetails';
import { RunStepDeltaStepDetailsMessageCreationObject } from './runStepDeltaStepDetailsMessageCreationObject';
import { RunStepDeltaStepDetailsMessageCreationObjectMessageCreation } from './runStepDeltaStepDetailsMessageCreationObjectMessageCreation';
import { RunStepDeltaStepDetailsToolCallsCodeObject } from './runStepDeltaStepDetailsToolCallsCodeObject';
import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter } from './runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter';
import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner } from './runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
import { RunStepDeltaStepDetailsToolCallsCodeOutputImageObject } from './runStepDeltaStepDetailsToolCallsCodeOutputImageObject';
import { RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage } from './runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage';
import { RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject } from './runStepDeltaStepDetailsToolCallsCodeOutputLogsObject';
import { RunStepDeltaStepDetailsToolCallsFileSearchObject } from './runStepDeltaStepDetailsToolCallsFileSearchObject';
import { RunStepDeltaStepDetailsToolCallsFunctionObject } from './runStepDeltaStepDetailsToolCallsFunctionObject';
import { RunStepDeltaStepDetailsToolCallsFunctionObjectFunction } from './runStepDeltaStepDetailsToolCallsFunctionObjectFunction';
import { RunStepDeltaStepDetailsToolCallsObject } from './runStepDeltaStepDetailsToolCallsObject';
import { RunStepDeltaStepDetailsToolCallsObjectToolCallsInner } from './runStepDeltaStepDetailsToolCallsObjectToolCallsInner';
import { RunStepDetailsMessageCreationObject } from './runStepDetailsMessageCreationObject';
import { RunStepDetailsMessageCreationObjectMessageCreation } from './runStepDetailsMessageCreationObjectMessageCreation';
import { RunStepDetailsToolCallsCodeObject } from './runStepDetailsToolCallsCodeObject';
import { RunStepDetailsToolCallsCodeObjectCodeInterpreter } from './runStepDetailsToolCallsCodeObjectCodeInterpreter';
import { RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner } from './runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
import { RunStepDetailsToolCallsCodeOutputImageObject } from './runStepDetailsToolCallsCodeOutputImageObject';
import { RunStepDetailsToolCallsCodeOutputImageObjectImage } from './runStepDetailsToolCallsCodeOutputImageObjectImage';
import { RunStepDetailsToolCallsCodeOutputLogsObject } from './runStepDetailsToolCallsCodeOutputLogsObject';
import { RunStepDetailsToolCallsFileSearchObject } from './runStepDetailsToolCallsFileSearchObject';
import { RunStepDetailsToolCallsFileSearchObjectFileSearch } from './runStepDetailsToolCallsFileSearchObjectFileSearch';
import { RunStepDetailsToolCallsFileSearchRankingOptionsObject } from './runStepDetailsToolCallsFileSearchRankingOptionsObject';
import { RunStepDetailsToolCallsFileSearchResultObject } from './runStepDetailsToolCallsFileSearchResultObject';
import { RunStepDetailsToolCallsFileSearchResultObjectContentInner } from './runStepDetailsToolCallsFileSearchResultObjectContentInner';
import { RunStepDetailsToolCallsFunctionObject } from './runStepDetailsToolCallsFunctionObject';
import { RunStepDetailsToolCallsFunctionObjectFunction } from './runStepDetailsToolCallsFunctionObjectFunction';
import { RunStepDetailsToolCallsObject } from './runStepDetailsToolCallsObject';
import { RunStepDetailsToolCallsObjectToolCallsInner } from './runStepDetailsToolCallsObjectToolCallsInner';
import { RunStepObject } from './runStepObject';
import { RunStepObjectLastError } from './runStepObjectLastError';
import { RunStepObjectStepDetails } from './runStepObjectStepDetails';
import { RunStepStreamEvent } from './runStepStreamEvent';
import { RunStepStreamEventOneOf } from './runStepStreamEventOneOf';
import { RunStepStreamEventOneOf1 } from './runStepStreamEventOneOf1';
import { RunStepStreamEventOneOf2 } from './runStepStreamEventOneOf2';
import { RunStepStreamEventOneOf3 } from './runStepStreamEventOneOf3';
import { RunStepStreamEventOneOf4 } from './runStepStreamEventOneOf4';
import { RunStepStreamEventOneOf5 } from './runStepStreamEventOneOf5';
import { RunStepStreamEventOneOf6 } from './runStepStreamEventOneOf6';
import { RunStreamEvent } from './runStreamEvent';
import { RunStreamEventOneOf } from './runStreamEventOneOf';
import { RunStreamEventOneOf1 } from './runStreamEventOneOf1';
import { RunStreamEventOneOf2 } from './runStreamEventOneOf2';
import { RunStreamEventOneOf3 } from './runStreamEventOneOf3';
import { RunStreamEventOneOf4 } from './runStreamEventOneOf4';
import { RunStreamEventOneOf5 } from './runStreamEventOneOf5';
import { RunStreamEventOneOf6 } from './runStreamEventOneOf6';
import { RunStreamEventOneOf7 } from './runStreamEventOneOf7';
import { RunStreamEventOneOf8 } from './runStreamEventOneOf8';
import { RunStreamEventOneOf9 } from './runStreamEventOneOf9';
import { RunToolCallObject } from './runToolCallObject';
import { RunToolCallObjectFunction } from './runToolCallObjectFunction';
import { StaticChunkingStrategy } from './staticChunkingStrategy';
import { StaticChunkingStrategyRequestParam } from './staticChunkingStrategyRequestParam';
import { StaticChunkingStrategyResponseParam } from './staticChunkingStrategyResponseParam';
import { StaticChunkingStrategyStatic } from './staticChunkingStrategyStatic';
import { SubmitToolOutputsRunRequest } from './submitToolOutputsRunRequest';
import { SubmitToolOutputsRunRequestToolOutputsInner } from './submitToolOutputsRunRequestToolOutputsInner';
import { ThreadObject } from './threadObject';
import { ThreadStreamEvent } from './threadStreamEvent';
import { TranscriptionSegment } from './transcriptionSegment';
import { TranscriptionWord } from './transcriptionWord';
import { TruncationObject } from './truncationObject';
import { UpdateVectorStoreRequest } from './updateVectorStoreRequest';
import { Upload } from './upload';
import { UploadPart } from './uploadPart';
import { UsageAudioSpeechesResult } from './usageAudioSpeechesResult';
import { UsageAudioTranscriptionsResult } from './usageAudioTranscriptionsResult';
import { UsageCodeInterpreterSessionsResult } from './usageCodeInterpreterSessionsResult';
import { UsageCompletionsResult } from './usageCompletionsResult';
import { UsageEmbeddingsResult } from './usageEmbeddingsResult';
import { UsageImagesResult } from './usageImagesResult';
import { UsageModerationsResult } from './usageModerationsResult';
import { UsageResponse } from './usageResponse';
import { UsageTimeBucket } from './usageTimeBucket';
import { UsageTimeBucketResultInner } from './usageTimeBucketResultInner';
import { UsageVectorStoresResult } from './usageVectorStoresResult';
import { User } from './user';
import { UserDeleteResponse } from './userDeleteResponse';
import { UserListResponse } from './userListResponse';
import { UserRoleUpdateRequest } from './userRoleUpdateRequest';
import { VectorStoreExpirationAfter } from './vectorStoreExpirationAfter';
import { VectorStoreFileBatchObject } from './vectorStoreFileBatchObject';
import { VectorStoreFileBatchObjectFileCounts } from './vectorStoreFileBatchObjectFileCounts';
import { VectorStoreFileObject } from './vectorStoreFileObject';
import { VectorStoreFileObjectChunkingStrategy } from './vectorStoreFileObjectChunkingStrategy';
import { VectorStoreFileObjectLastError } from './vectorStoreFileObjectLastError';
import { VectorStoreObject } from './vectorStoreObject';
import { VectorStoreObjectFileCounts } from './vectorStoreObjectFileCounts';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "ArrayOfContentPartsInner.TypeEnum": ArrayOfContentPartsInner.TypeEnum,
        "AssistantObject.ObjectEnum": AssistantObject.ObjectEnum,
        "AssistantObjectToolsInner.TypeEnum": AssistantObjectToolsInner.TypeEnum,
        "AssistantStreamEvent.EventEnum": AssistantStreamEvent.EventEnum,
        "AssistantStreamEvent.DataEnum": AssistantStreamEvent.DataEnum,
        "AssistantToolsCode.TypeEnum": AssistantToolsCode.TypeEnum,
        "AssistantToolsFileSearch.TypeEnum": AssistantToolsFileSearch.TypeEnum,
        "AssistantToolsFileSearchTypeOnly.TypeEnum": AssistantToolsFileSearchTypeOnly.TypeEnum,
        "AssistantToolsFunction.TypeEnum": AssistantToolsFunction.TypeEnum,
        "AssistantsApiResponseFormatOption.TypeEnum": AssistantsApiResponseFormatOption.TypeEnum,
        "AssistantsApiToolChoiceOption.TypeEnum": AssistantsApiToolChoiceOption.TypeEnum,
        "AssistantsNamedToolChoice.TypeEnum": AssistantsNamedToolChoice.TypeEnum,
        "AudioResponseFormat": AudioResponseFormat,
        "AuditLogActor.TypeEnum": AuditLogActor.TypeEnum,
        "AuditLogActorApiKey.TypeEnum": AuditLogActorApiKey.TypeEnum,
        "AuditLogEventType": AuditLogEventType,
        "AutoChunkingStrategy.TypeEnum": AutoChunkingStrategy.TypeEnum,
        "AutoChunkingStrategyRequestParam.TypeEnum": AutoChunkingStrategyRequestParam.TypeEnum,
        "Batch.ObjectEnum": Batch.ObjectEnum,
        "Batch.StatusEnum": Batch.StatusEnum,
        "BatchRequestInput.MethodEnum": BatchRequestInput.MethodEnum,
        "ChatCompletionMessageToolCall.TypeEnum": ChatCompletionMessageToolCall.TypeEnum,
        "ChatCompletionMessageToolCallChunk.TypeEnum": ChatCompletionMessageToolCallChunk.TypeEnum,
        "ChatCompletionNamedToolChoice.TypeEnum": ChatCompletionNamedToolChoice.TypeEnum,
        "ChatCompletionRequestAssistantMessage.RoleEnum": ChatCompletionRequestAssistantMessage.RoleEnum,
        "ChatCompletionRequestAssistantMessageContentPart.TypeEnum": ChatCompletionRequestAssistantMessageContentPart.TypeEnum,
        "ChatCompletionRequestDeveloperMessage.RoleEnum": ChatCompletionRequestDeveloperMessage.RoleEnum,
        "ChatCompletionRequestFunctionMessage.RoleEnum": ChatCompletionRequestFunctionMessage.RoleEnum,
        "ChatCompletionRequestMessage.RoleEnum": ChatCompletionRequestMessage.RoleEnum,
        "ChatCompletionRequestMessageContentPartAudio.TypeEnum": ChatCompletionRequestMessageContentPartAudio.TypeEnum,
        "ChatCompletionRequestMessageContentPartAudioInputAudio.FormatEnum": ChatCompletionRequestMessageContentPartAudioInputAudio.FormatEnum,
        "ChatCompletionRequestMessageContentPartImage.TypeEnum": ChatCompletionRequestMessageContentPartImage.TypeEnum,
        "ChatCompletionRequestMessageContentPartImageImageUrl.DetailEnum": ChatCompletionRequestMessageContentPartImageImageUrl.DetailEnum,
        "ChatCompletionRequestMessageContentPartRefusal.TypeEnum": ChatCompletionRequestMessageContentPartRefusal.TypeEnum,
        "ChatCompletionRequestMessageContentPartText.TypeEnum": ChatCompletionRequestMessageContentPartText.TypeEnum,
        "ChatCompletionRequestSystemMessage.RoleEnum": ChatCompletionRequestSystemMessage.RoleEnum,
        "ChatCompletionRequestToolMessage.RoleEnum": ChatCompletionRequestToolMessage.RoleEnum,
        "ChatCompletionRequestUserMessage.RoleEnum": ChatCompletionRequestUserMessage.RoleEnum,
        "ChatCompletionRequestUserMessageContentPart.TypeEnum": ChatCompletionRequestUserMessageContentPart.TypeEnum,
        "ChatCompletionResponseMessage.RoleEnum": ChatCompletionResponseMessage.RoleEnum,
        "ChatCompletionRole": ChatCompletionRole,
        "ChatCompletionStreamResponseDelta.RoleEnum": ChatCompletionStreamResponseDelta.RoleEnum,
        "ChatCompletionTool.TypeEnum": ChatCompletionTool.TypeEnum,
        "ChatCompletionToolChoiceOption.TypeEnum": ChatCompletionToolChoiceOption.TypeEnum,
        "ChunkingStrategyRequestParam.TypeEnum": ChunkingStrategyRequestParam.TypeEnum,
        "CostsResult.ObjectEnum": CostsResult.ObjectEnum,
        "CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.TypeEnum": CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.TypeEnum,
        "CreateBatchRequest.EndpointEnum": CreateBatchRequest.EndpointEnum,
        "CreateBatchRequest.CompletionWindowEnum": CreateBatchRequest.CompletionWindowEnum,
        "CreateChatCompletionFunctionResponse.ObjectEnum": CreateChatCompletionFunctionResponse.ObjectEnum,
        "CreateChatCompletionFunctionResponseChoicesInner.FinishReasonEnum": CreateChatCompletionFunctionResponseChoicesInner.FinishReasonEnum,
        "CreateChatCompletionRequest.ReasoningEffortEnum": CreateChatCompletionRequest.ReasoningEffortEnum,
        "CreateChatCompletionRequest.ModalitiesEnum": CreateChatCompletionRequest.ModalitiesEnum,
        "CreateChatCompletionRequest.ServiceTierEnum": CreateChatCompletionRequest.ServiceTierEnum,
        "CreateChatCompletionRequestAudio.VoiceEnum": CreateChatCompletionRequestAudio.VoiceEnum,
        "CreateChatCompletionRequestAudio.FormatEnum": CreateChatCompletionRequestAudio.FormatEnum,
        "CreateChatCompletionRequestResponseFormat.TypeEnum": CreateChatCompletionRequestResponseFormat.TypeEnum,
        "CreateChatCompletionResponse.ServiceTierEnum": CreateChatCompletionResponse.ServiceTierEnum,
        "CreateChatCompletionResponse.ObjectEnum": CreateChatCompletionResponse.ObjectEnum,
        "CreateChatCompletionResponseChoicesInner.FinishReasonEnum": CreateChatCompletionResponseChoicesInner.FinishReasonEnum,
        "CreateChatCompletionStreamResponse.ServiceTierEnum": CreateChatCompletionStreamResponse.ServiceTierEnum,
        "CreateChatCompletionStreamResponse.ObjectEnum": CreateChatCompletionStreamResponse.ObjectEnum,
        "CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum": CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum,
        "CreateCompletionResponse.ObjectEnum": CreateCompletionResponse.ObjectEnum,
        "CreateCompletionResponseChoicesInner.FinishReasonEnum": CreateCompletionResponseChoicesInner.FinishReasonEnum,
        "CreateEmbeddingRequest.EncodingFormatEnum": CreateEmbeddingRequest.EncodingFormatEnum,
        "CreateEmbeddingResponse.ObjectEnum": CreateEmbeddingResponse.ObjectEnum,
        "CreateFineTuningJobRequestIntegrationsInner.TypeEnum": CreateFineTuningJobRequestIntegrationsInner.TypeEnum,
        "CreateImageRequest.QualityEnum": CreateImageRequest.QualityEnum,
        "CreateImageRequest.ResponseFormatEnum": CreateImageRequest.ResponseFormatEnum,
        "CreateImageRequest.SizeEnum": CreateImageRequest.SizeEnum,
        "CreateImageRequest.StyleEnum": CreateImageRequest.StyleEnum,
        "CreateMessageRequest.RoleEnum": CreateMessageRequest.RoleEnum,
        "CreateMessageRequestAttachmentsInnerToolsInner.TypeEnum": CreateMessageRequestAttachmentsInnerToolsInner.TypeEnum,
        "CreateModerationRequestInputOneOfInner.TypeEnum": CreateModerationRequestInputOneOfInner.TypeEnum,
        "CreateModerationRequestInputOneOfInnerOneOf.TypeEnum": CreateModerationRequestInputOneOfInnerOneOf.TypeEnum,
        "CreateModerationRequestInputOneOfInnerOneOf1.TypeEnum": CreateModerationRequestInputOneOfInnerOneOf1.TypeEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HateEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HateEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HateThreateningEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HateThreateningEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HarassmentEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HarassmentEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HarassmentThreateningEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HarassmentThreateningEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.IllicitEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.IllicitEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.IllicitViolentEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.IllicitViolentEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmIntentEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmIntentEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmInstructionsEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmInstructionsEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SexualEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SexualEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SexualMinorsEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SexualMinorsEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.ViolenceEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.ViolenceEnum,
        "CreateModerationResponseResultsInnerCategoryAppliedInputTypes.ViolenceGraphicEnum": CreateModerationResponseResultsInnerCategoryAppliedInputTypes.ViolenceGraphicEnum,
        "CreateSpeechRequest.VoiceEnum": CreateSpeechRequest.VoiceEnum,
        "CreateSpeechRequest.ResponseFormatEnum": CreateSpeechRequest.ResponseFormatEnum,
        "CreateThreadAndRunRequestToolsInner.TypeEnum": CreateThreadAndRunRequestToolsInner.TypeEnum,
        "CreateUploadRequest.PurposeEnum": CreateUploadRequest.PurposeEnum,
        "CreateVectorStoreRequestChunkingStrategy.TypeEnum": CreateVectorStoreRequestChunkingStrategy.TypeEnum,
        "DeleteAssistantResponse.ObjectEnum": DeleteAssistantResponse.ObjectEnum,
        "DeleteFileResponse.ObjectEnum": DeleteFileResponse.ObjectEnum,
        "DeleteMessageResponse.ObjectEnum": DeleteMessageResponse.ObjectEnum,
        "DeleteThreadResponse.ObjectEnum": DeleteThreadResponse.ObjectEnum,
        "DeleteVectorStoreFileResponse.ObjectEnum": DeleteVectorStoreFileResponse.ObjectEnum,
        "DeleteVectorStoreResponse.ObjectEnum": DeleteVectorStoreResponse.ObjectEnum,
        "DoneEvent.EventEnum": DoneEvent.EventEnum,
        "DoneEvent.DataEnum": DoneEvent.DataEnum,
        "Embedding.ObjectEnum": Embedding.ObjectEnum,
        "ErrorEvent.EventEnum": ErrorEvent.EventEnum,
        "FileSearchRankingOptions.RankerEnum": FileSearchRankingOptions.RankerEnum,
        "FineTuneChatCompletionRequestAssistantMessage.RoleEnum": FineTuneChatCompletionRequestAssistantMessage.RoleEnum,
        "FineTuneChatCompletionRequestAssistantMessage.WeightEnum": FineTuneChatCompletionRequestAssistantMessage.WeightEnum,
        "FineTuneChatRequestInputMessagesInner.RoleEnum": FineTuneChatRequestInputMessagesInner.RoleEnum,
        "FineTuneChatRequestInputMessagesInner.WeightEnum": FineTuneChatRequestInputMessagesInner.WeightEnum,
        "FineTuneMethod.TypeEnum": FineTuneMethod.TypeEnum,
        "FineTunePreferenceRequestInputPreferredCompletionInner.RoleEnum": FineTunePreferenceRequestInputPreferredCompletionInner.RoleEnum,
        "FineTuningIntegration.TypeEnum": FineTuningIntegration.TypeEnum,
        "FineTuningJob.ObjectEnum": FineTuningJob.ObjectEnum,
        "FineTuningJob.StatusEnum": FineTuningJob.StatusEnum,
        "FineTuningJobCheckpoint.ObjectEnum": FineTuningJobCheckpoint.ObjectEnum,
        "FineTuningJobEvent.ObjectEnum": FineTuningJobEvent.ObjectEnum,
        "FineTuningJobEvent.LevelEnum": FineTuningJobEvent.LevelEnum,
        "FineTuningJobEvent.TypeEnum": FineTuningJobEvent.TypeEnum,
        "FineTuningJobIntegrationsInner.TypeEnum": FineTuningJobIntegrationsInner.TypeEnum,
        "Invite.ObjectEnum": Invite.ObjectEnum,
        "Invite.RoleEnum": Invite.RoleEnum,
        "Invite.StatusEnum": Invite.StatusEnum,
        "InviteDeleteResponse.ObjectEnum": InviteDeleteResponse.ObjectEnum,
        "InviteListResponse.ObjectEnum": InviteListResponse.ObjectEnum,
        "InviteProjectsInner.RoleEnum": InviteProjectsInner.RoleEnum,
        "InviteRequest.RoleEnum": InviteRequest.RoleEnum,
        "InviteRequestProjectsInner.RoleEnum": InviteRequestProjectsInner.RoleEnum,
        "ListAuditLogsResponse.ObjectEnum": ListAuditLogsResponse.ObjectEnum,
        "ListBatchesResponse.ObjectEnum": ListBatchesResponse.ObjectEnum,
        "ListFineTuningJobCheckpointsResponse.ObjectEnum": ListFineTuningJobCheckpointsResponse.ObjectEnum,
        "ListFineTuningJobEventsResponse.ObjectEnum": ListFineTuningJobEventsResponse.ObjectEnum,
        "ListModelsResponse.ObjectEnum": ListModelsResponse.ObjectEnum,
        "ListPaginatedFineTuningJobsResponse.ObjectEnum": ListPaginatedFineTuningJobsResponse.ObjectEnum,
        "MessageContentImageFileObject.TypeEnum": MessageContentImageFileObject.TypeEnum,
        "MessageContentImageFileObjectImageFile.DetailEnum": MessageContentImageFileObjectImageFile.DetailEnum,
        "MessageContentImageUrlObject.TypeEnum": MessageContentImageUrlObject.TypeEnum,
        "MessageContentImageUrlObjectImageUrl.DetailEnum": MessageContentImageUrlObjectImageUrl.DetailEnum,
        "MessageContentRefusalObject.TypeEnum": MessageContentRefusalObject.TypeEnum,
        "MessageContentTextAnnotationsFileCitationObject.TypeEnum": MessageContentTextAnnotationsFileCitationObject.TypeEnum,
        "MessageContentTextAnnotationsFilePathObject.TypeEnum": MessageContentTextAnnotationsFilePathObject.TypeEnum,
        "MessageContentTextObject.TypeEnum": MessageContentTextObject.TypeEnum,
        "MessageContentTextObjectTextAnnotationsInner.TypeEnum": MessageContentTextObjectTextAnnotationsInner.TypeEnum,
        "MessageDeltaContentImageFileObject.TypeEnum": MessageDeltaContentImageFileObject.TypeEnum,
        "MessageDeltaContentImageFileObjectImageFile.DetailEnum": MessageDeltaContentImageFileObjectImageFile.DetailEnum,
        "MessageDeltaContentImageUrlObject.TypeEnum": MessageDeltaContentImageUrlObject.TypeEnum,
        "MessageDeltaContentImageUrlObjectImageUrl.DetailEnum": MessageDeltaContentImageUrlObjectImageUrl.DetailEnum,
        "MessageDeltaContentRefusalObject.TypeEnum": MessageDeltaContentRefusalObject.TypeEnum,
        "MessageDeltaContentTextAnnotationsFileCitationObject.TypeEnum": MessageDeltaContentTextAnnotationsFileCitationObject.TypeEnum,
        "MessageDeltaContentTextAnnotationsFilePathObject.TypeEnum": MessageDeltaContentTextAnnotationsFilePathObject.TypeEnum,
        "MessageDeltaContentTextObject.TypeEnum": MessageDeltaContentTextObject.TypeEnum,
        "MessageDeltaContentTextObjectTextAnnotationsInner.TypeEnum": MessageDeltaContentTextObjectTextAnnotationsInner.TypeEnum,
        "MessageDeltaObject.ObjectEnum": MessageDeltaObject.ObjectEnum,
        "MessageDeltaObjectDelta.RoleEnum": MessageDeltaObjectDelta.RoleEnum,
        "MessageDeltaObjectDeltaContentInner.TypeEnum": MessageDeltaObjectDeltaContentInner.TypeEnum,
        "MessageObject.ObjectEnum": MessageObject.ObjectEnum,
        "MessageObject.StatusEnum": MessageObject.StatusEnum,
        "MessageObject.RoleEnum": MessageObject.RoleEnum,
        "MessageObjectContentInner.TypeEnum": MessageObjectContentInner.TypeEnum,
        "MessageObjectIncompleteDetails.ReasonEnum": MessageObjectIncompleteDetails.ReasonEnum,
        "MessageRequestContentTextObject.TypeEnum": MessageRequestContentTextObject.TypeEnum,
        "MessageStreamEvent.EventEnum": MessageStreamEvent.EventEnum,
        "MessageStreamEventOneOf.EventEnum": MessageStreamEventOneOf.EventEnum,
        "MessageStreamEventOneOf1.EventEnum": MessageStreamEventOneOf1.EventEnum,
        "MessageStreamEventOneOf2.EventEnum": MessageStreamEventOneOf2.EventEnum,
        "MessageStreamEventOneOf3.EventEnum": MessageStreamEventOneOf3.EventEnum,
        "MessageStreamEventOneOf4.EventEnum": MessageStreamEventOneOf4.EventEnum,
        "Model.ObjectEnum": Model.ObjectEnum,
        "OpenAIFile.ObjectEnum": OpenAIFile.ObjectEnum,
        "OpenAIFile.PurposeEnum": OpenAIFile.PurposeEnum,
        "OpenAIFile.StatusEnum": OpenAIFile.StatusEnum,
        "OtherChunkingStrategyResponseParam.TypeEnum": OtherChunkingStrategyResponseParam.TypeEnum,
        "PredictionContent.TypeEnum": PredictionContent.TypeEnum,
        "Project.ObjectEnum": Project.ObjectEnum,
        "Project.StatusEnum": Project.StatusEnum,
        "ProjectApiKey.ObjectEnum": ProjectApiKey.ObjectEnum,
        "ProjectApiKeyDeleteResponse.ObjectEnum": ProjectApiKeyDeleteResponse.ObjectEnum,
        "ProjectApiKeyListResponse.ObjectEnum": ProjectApiKeyListResponse.ObjectEnum,
        "ProjectApiKeyOwner.TypeEnum": ProjectApiKeyOwner.TypeEnum,
        "ProjectListResponse.ObjectEnum": ProjectListResponse.ObjectEnum,
        "ProjectRateLimit.ObjectEnum": ProjectRateLimit.ObjectEnum,
        "ProjectRateLimitListResponse.ObjectEnum": ProjectRateLimitListResponse.ObjectEnum,
        "ProjectServiceAccount.ObjectEnum": ProjectServiceAccount.ObjectEnum,
        "ProjectServiceAccount.RoleEnum": ProjectServiceAccount.RoleEnum,
        "ProjectServiceAccountApiKey.ObjectEnum": ProjectServiceAccountApiKey.ObjectEnum,
        "ProjectServiceAccountCreateResponse.ObjectEnum": ProjectServiceAccountCreateResponse.ObjectEnum,
        "ProjectServiceAccountCreateResponse.RoleEnum": ProjectServiceAccountCreateResponse.RoleEnum,
        "ProjectServiceAccountDeleteResponse.ObjectEnum": ProjectServiceAccountDeleteResponse.ObjectEnum,
        "ProjectServiceAccountListResponse.ObjectEnum": ProjectServiceAccountListResponse.ObjectEnum,
        "ProjectUser.ObjectEnum": ProjectUser.ObjectEnum,
        "ProjectUser.RoleEnum": ProjectUser.RoleEnum,
        "ProjectUserCreateRequest.RoleEnum": ProjectUserCreateRequest.RoleEnum,
        "ProjectUserDeleteResponse.ObjectEnum": ProjectUserDeleteResponse.ObjectEnum,
        "ProjectUserUpdateRequest.RoleEnum": ProjectUserUpdateRequest.RoleEnum,
        "RealtimeClientEventConversationItemCreate.TypeEnum": RealtimeClientEventConversationItemCreate.TypeEnum,
        "RealtimeClientEventConversationItemDelete.TypeEnum": RealtimeClientEventConversationItemDelete.TypeEnum,
        "RealtimeClientEventConversationItemTruncate.TypeEnum": RealtimeClientEventConversationItemTruncate.TypeEnum,
        "RealtimeClientEventInputAudioBufferAppend.TypeEnum": RealtimeClientEventInputAudioBufferAppend.TypeEnum,
        "RealtimeClientEventInputAudioBufferClear.TypeEnum": RealtimeClientEventInputAudioBufferClear.TypeEnum,
        "RealtimeClientEventInputAudioBufferCommit.TypeEnum": RealtimeClientEventInputAudioBufferCommit.TypeEnum,
        "RealtimeClientEventResponseCancel.TypeEnum": RealtimeClientEventResponseCancel.TypeEnum,
        "RealtimeClientEventResponseCreate.TypeEnum": RealtimeClientEventResponseCreate.TypeEnum,
        "RealtimeClientEventSessionUpdate.TypeEnum": RealtimeClientEventSessionUpdate.TypeEnum,
        "RealtimeConversationItem.TypeEnum": RealtimeConversationItem.TypeEnum,
        "RealtimeConversationItem.ObjectEnum": RealtimeConversationItem.ObjectEnum,
        "RealtimeConversationItem.StatusEnum": RealtimeConversationItem.StatusEnum,
        "RealtimeConversationItem.RoleEnum": RealtimeConversationItem.RoleEnum,
        "RealtimeConversationItemContentInner.TypeEnum": RealtimeConversationItemContentInner.TypeEnum,
        "RealtimeResponse.ObjectEnum": RealtimeResponse.ObjectEnum,
        "RealtimeResponse.StatusEnum": RealtimeResponse.StatusEnum,
        "RealtimeResponseCreateParams.ModalitiesEnum": RealtimeResponseCreateParams.ModalitiesEnum,
        "RealtimeResponseCreateParams.VoiceEnum": RealtimeResponseCreateParams.VoiceEnum,
        "RealtimeResponseCreateParams.OutputAudioFormatEnum": RealtimeResponseCreateParams.OutputAudioFormatEnum,
        "RealtimeResponseCreateParamsToolsInner.TypeEnum": RealtimeResponseCreateParamsToolsInner.TypeEnum,
        "RealtimeResponseStatusDetails.TypeEnum": RealtimeResponseStatusDetails.TypeEnum,
        "RealtimeResponseStatusDetails.ReasonEnum": RealtimeResponseStatusDetails.ReasonEnum,
        "RealtimeServerEventConversationCreated.TypeEnum": RealtimeServerEventConversationCreated.TypeEnum,
        "RealtimeServerEventConversationItemCreated.TypeEnum": RealtimeServerEventConversationItemCreated.TypeEnum,
        "RealtimeServerEventConversationItemDeleted.TypeEnum": RealtimeServerEventConversationItemDeleted.TypeEnum,
        "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.TypeEnum": RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.TypeEnum,
        "RealtimeServerEventConversationItemInputAudioTranscriptionFailed.TypeEnum": RealtimeServerEventConversationItemInputAudioTranscriptionFailed.TypeEnum,
        "RealtimeServerEventConversationItemTruncated.TypeEnum": RealtimeServerEventConversationItemTruncated.TypeEnum,
        "RealtimeServerEventError.TypeEnum": RealtimeServerEventError.TypeEnum,
        "RealtimeServerEventInputAudioBufferCleared.TypeEnum": RealtimeServerEventInputAudioBufferCleared.TypeEnum,
        "RealtimeServerEventInputAudioBufferCommitted.TypeEnum": RealtimeServerEventInputAudioBufferCommitted.TypeEnum,
        "RealtimeServerEventInputAudioBufferSpeechStarted.TypeEnum": RealtimeServerEventInputAudioBufferSpeechStarted.TypeEnum,
        "RealtimeServerEventInputAudioBufferSpeechStopped.TypeEnum": RealtimeServerEventInputAudioBufferSpeechStopped.TypeEnum,
        "RealtimeServerEventRateLimitsUpdated.TypeEnum": RealtimeServerEventRateLimitsUpdated.TypeEnum,
        "RealtimeServerEventRateLimitsUpdatedRateLimitsInner.NameEnum": RealtimeServerEventRateLimitsUpdatedRateLimitsInner.NameEnum,
        "RealtimeServerEventResponseAudioDelta.TypeEnum": RealtimeServerEventResponseAudioDelta.TypeEnum,
        "RealtimeServerEventResponseAudioDone.TypeEnum": RealtimeServerEventResponseAudioDone.TypeEnum,
        "RealtimeServerEventResponseAudioTranscriptDelta.TypeEnum": RealtimeServerEventResponseAudioTranscriptDelta.TypeEnum,
        "RealtimeServerEventResponseAudioTranscriptDone.TypeEnum": RealtimeServerEventResponseAudioTranscriptDone.TypeEnum,
        "RealtimeServerEventResponseContentPartAdded.TypeEnum": RealtimeServerEventResponseContentPartAdded.TypeEnum,
        "RealtimeServerEventResponseContentPartAddedPart.TypeEnum": RealtimeServerEventResponseContentPartAddedPart.TypeEnum,
        "RealtimeServerEventResponseContentPartDone.TypeEnum": RealtimeServerEventResponseContentPartDone.TypeEnum,
        "RealtimeServerEventResponseContentPartDonePart.TypeEnum": RealtimeServerEventResponseContentPartDonePart.TypeEnum,
        "RealtimeServerEventResponseCreated.TypeEnum": RealtimeServerEventResponseCreated.TypeEnum,
        "RealtimeServerEventResponseDone.TypeEnum": RealtimeServerEventResponseDone.TypeEnum,
        "RealtimeServerEventResponseFunctionCallArgumentsDelta.TypeEnum": RealtimeServerEventResponseFunctionCallArgumentsDelta.TypeEnum,
        "RealtimeServerEventResponseFunctionCallArgumentsDone.TypeEnum": RealtimeServerEventResponseFunctionCallArgumentsDone.TypeEnum,
        "RealtimeServerEventResponseOutputItemAdded.TypeEnum": RealtimeServerEventResponseOutputItemAdded.TypeEnum,
        "RealtimeServerEventResponseOutputItemDone.TypeEnum": RealtimeServerEventResponseOutputItemDone.TypeEnum,
        "RealtimeServerEventResponseTextDelta.TypeEnum": RealtimeServerEventResponseTextDelta.TypeEnum,
        "RealtimeServerEventResponseTextDone.TypeEnum": RealtimeServerEventResponseTextDone.TypeEnum,
        "RealtimeServerEventSessionCreated.TypeEnum": RealtimeServerEventSessionCreated.TypeEnum,
        "RealtimeServerEventSessionUpdated.TypeEnum": RealtimeServerEventSessionUpdated.TypeEnum,
        "RealtimeSession.ModalitiesEnum": RealtimeSession.ModalitiesEnum,
        "RealtimeSession.VoiceEnum": RealtimeSession.VoiceEnum,
        "RealtimeSession.InputAudioFormatEnum": RealtimeSession.InputAudioFormatEnum,
        "RealtimeSession.OutputAudioFormatEnum": RealtimeSession.OutputAudioFormatEnum,
        "RealtimeSessionCreateRequest.ModalitiesEnum": RealtimeSessionCreateRequest.ModalitiesEnum,
        "RealtimeSessionCreateRequest.ModelEnum": RealtimeSessionCreateRequest.ModelEnum,
        "RealtimeSessionCreateRequest.VoiceEnum": RealtimeSessionCreateRequest.VoiceEnum,
        "RealtimeSessionCreateRequest.InputAudioFormatEnum": RealtimeSessionCreateRequest.InputAudioFormatEnum,
        "RealtimeSessionCreateRequest.OutputAudioFormatEnum": RealtimeSessionCreateRequest.OutputAudioFormatEnum,
        "RealtimeSessionCreateResponse.ModalitiesEnum": RealtimeSessionCreateResponse.ModalitiesEnum,
        "RealtimeSessionCreateResponse.VoiceEnum": RealtimeSessionCreateResponse.VoiceEnum,
        "RealtimeSessionTurnDetection.TypeEnum": RealtimeSessionTurnDetection.TypeEnum,
        "ResponseFormatJsonObject.TypeEnum": ResponseFormatJsonObject.TypeEnum,
        "ResponseFormatJsonSchema.TypeEnum": ResponseFormatJsonSchema.TypeEnum,
        "ResponseFormatText.TypeEnum": ResponseFormatText.TypeEnum,
        "RunObject.ObjectEnum": RunObject.ObjectEnum,
        "RunObject.StatusEnum": RunObject.StatusEnum,
        "RunObjectIncompleteDetails.ReasonEnum": RunObjectIncompleteDetails.ReasonEnum,
        "RunObjectLastError.CodeEnum": RunObjectLastError.CodeEnum,
        "RunObjectRequiredAction.TypeEnum": RunObjectRequiredAction.TypeEnum,
        "RunStepDeltaObject.ObjectEnum": RunStepDeltaObject.ObjectEnum,
        "RunStepDeltaObjectDeltaStepDetails.TypeEnum": RunStepDeltaObjectDeltaStepDetails.TypeEnum,
        "RunStepDeltaStepDetailsMessageCreationObject.TypeEnum": RunStepDeltaStepDetailsMessageCreationObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsCodeObject.TypeEnum": RunStepDeltaStepDetailsToolCallsCodeObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum": RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.TypeEnum": RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.TypeEnum": RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsFileSearchObject.TypeEnum": RunStepDeltaStepDetailsToolCallsFileSearchObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsFunctionObject.TypeEnum": RunStepDeltaStepDetailsToolCallsFunctionObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsObject.TypeEnum": RunStepDeltaStepDetailsToolCallsObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.TypeEnum": RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.TypeEnum,
        "RunStepDetailsMessageCreationObject.TypeEnum": RunStepDetailsMessageCreationObject.TypeEnum,
        "RunStepDetailsToolCallsCodeObject.TypeEnum": RunStepDetailsToolCallsCodeObject.TypeEnum,
        "RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum": RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum,
        "RunStepDetailsToolCallsCodeOutputImageObject.TypeEnum": RunStepDetailsToolCallsCodeOutputImageObject.TypeEnum,
        "RunStepDetailsToolCallsCodeOutputLogsObject.TypeEnum": RunStepDetailsToolCallsCodeOutputLogsObject.TypeEnum,
        "RunStepDetailsToolCallsFileSearchObject.TypeEnum": RunStepDetailsToolCallsFileSearchObject.TypeEnum,
        "RunStepDetailsToolCallsFileSearchRankingOptionsObject.RankerEnum": RunStepDetailsToolCallsFileSearchRankingOptionsObject.RankerEnum,
        "RunStepDetailsToolCallsFileSearchResultObjectContentInner.TypeEnum": RunStepDetailsToolCallsFileSearchResultObjectContentInner.TypeEnum,
        "RunStepDetailsToolCallsFunctionObject.TypeEnum": RunStepDetailsToolCallsFunctionObject.TypeEnum,
        "RunStepDetailsToolCallsObject.TypeEnum": RunStepDetailsToolCallsObject.TypeEnum,
        "RunStepDetailsToolCallsObjectToolCallsInner.TypeEnum": RunStepDetailsToolCallsObjectToolCallsInner.TypeEnum,
        "RunStepObject.ObjectEnum": RunStepObject.ObjectEnum,
        "RunStepObject.TypeEnum": RunStepObject.TypeEnum,
        "RunStepObject.StatusEnum": RunStepObject.StatusEnum,
        "RunStepObjectLastError.CodeEnum": RunStepObjectLastError.CodeEnum,
        "RunStepObjectStepDetails.TypeEnum": RunStepObjectStepDetails.TypeEnum,
        "RunStepStreamEvent.EventEnum": RunStepStreamEvent.EventEnum,
        "RunStepStreamEventOneOf.EventEnum": RunStepStreamEventOneOf.EventEnum,
        "RunStepStreamEventOneOf1.EventEnum": RunStepStreamEventOneOf1.EventEnum,
        "RunStepStreamEventOneOf2.EventEnum": RunStepStreamEventOneOf2.EventEnum,
        "RunStepStreamEventOneOf3.EventEnum": RunStepStreamEventOneOf3.EventEnum,
        "RunStepStreamEventOneOf4.EventEnum": RunStepStreamEventOneOf4.EventEnum,
        "RunStepStreamEventOneOf5.EventEnum": RunStepStreamEventOneOf5.EventEnum,
        "RunStepStreamEventOneOf6.EventEnum": RunStepStreamEventOneOf6.EventEnum,
        "RunStreamEvent.EventEnum": RunStreamEvent.EventEnum,
        "RunStreamEventOneOf.EventEnum": RunStreamEventOneOf.EventEnum,
        "RunStreamEventOneOf1.EventEnum": RunStreamEventOneOf1.EventEnum,
        "RunStreamEventOneOf2.EventEnum": RunStreamEventOneOf2.EventEnum,
        "RunStreamEventOneOf3.EventEnum": RunStreamEventOneOf3.EventEnum,
        "RunStreamEventOneOf4.EventEnum": RunStreamEventOneOf4.EventEnum,
        "RunStreamEventOneOf5.EventEnum": RunStreamEventOneOf5.EventEnum,
        "RunStreamEventOneOf6.EventEnum": RunStreamEventOneOf6.EventEnum,
        "RunStreamEventOneOf7.EventEnum": RunStreamEventOneOf7.EventEnum,
        "RunStreamEventOneOf8.EventEnum": RunStreamEventOneOf8.EventEnum,
        "RunStreamEventOneOf9.EventEnum": RunStreamEventOneOf9.EventEnum,
        "RunToolCallObject.TypeEnum": RunToolCallObject.TypeEnum,
        "StaticChunkingStrategy.TypeEnum": StaticChunkingStrategy.TypeEnum,
        "StaticChunkingStrategyRequestParam.TypeEnum": StaticChunkingStrategyRequestParam.TypeEnum,
        "StaticChunkingStrategyResponseParam.TypeEnum": StaticChunkingStrategyResponseParam.TypeEnum,
        "ThreadObject.ObjectEnum": ThreadObject.ObjectEnum,
        "ThreadStreamEvent.EventEnum": ThreadStreamEvent.EventEnum,
        "TruncationObject.TypeEnum": TruncationObject.TypeEnum,
        "Upload.StatusEnum": Upload.StatusEnum,
        "Upload.ObjectEnum": Upload.ObjectEnum,
        "UploadPart.ObjectEnum": UploadPart.ObjectEnum,
        "UsageAudioSpeechesResult.ObjectEnum": UsageAudioSpeechesResult.ObjectEnum,
        "UsageAudioTranscriptionsResult.ObjectEnum": UsageAudioTranscriptionsResult.ObjectEnum,
        "UsageCodeInterpreterSessionsResult.ObjectEnum": UsageCodeInterpreterSessionsResult.ObjectEnum,
        "UsageCompletionsResult.ObjectEnum": UsageCompletionsResult.ObjectEnum,
        "UsageEmbeddingsResult.ObjectEnum": UsageEmbeddingsResult.ObjectEnum,
        "UsageImagesResult.ObjectEnum": UsageImagesResult.ObjectEnum,
        "UsageModerationsResult.ObjectEnum": UsageModerationsResult.ObjectEnum,
        "UsageResponse.ObjectEnum": UsageResponse.ObjectEnum,
        "UsageTimeBucket.ObjectEnum": UsageTimeBucket.ObjectEnum,
        "UsageTimeBucketResultInner.ObjectEnum": UsageTimeBucketResultInner.ObjectEnum,
        "UsageVectorStoresResult.ObjectEnum": UsageVectorStoresResult.ObjectEnum,
        "User.ObjectEnum": User.ObjectEnum,
        "User.RoleEnum": User.RoleEnum,
        "UserDeleteResponse.ObjectEnum": UserDeleteResponse.ObjectEnum,
        "UserListResponse.ObjectEnum": UserListResponse.ObjectEnum,
        "UserRoleUpdateRequest.RoleEnum": UserRoleUpdateRequest.RoleEnum,
        "VectorStoreExpirationAfter.AnchorEnum": VectorStoreExpirationAfter.AnchorEnum,
        "VectorStoreFileBatchObject.ObjectEnum": VectorStoreFileBatchObject.ObjectEnum,
        "VectorStoreFileBatchObject.StatusEnum": VectorStoreFileBatchObject.StatusEnum,
        "VectorStoreFileObject.ObjectEnum": VectorStoreFileObject.ObjectEnum,
        "VectorStoreFileObject.StatusEnum": VectorStoreFileObject.StatusEnum,
        "VectorStoreFileObjectChunkingStrategy.TypeEnum": VectorStoreFileObjectChunkingStrategy.TypeEnum,
        "VectorStoreFileObjectLastError.CodeEnum": VectorStoreFileObjectLastError.CodeEnum,
        "VectorStoreObject.ObjectEnum": VectorStoreObject.ObjectEnum,
        "VectorStoreObject.StatusEnum": VectorStoreObject.StatusEnum,
}

let typeMap: {[index: string]: any} = {
    "AdminApiKey": AdminApiKey,
    "AdminApiKeyOwner": AdminApiKeyOwner,
    "AdminApiKeysCreateRequest": AdminApiKeysCreateRequest,
    "AdminApiKeysDelete200Response": AdminApiKeysDelete200Response,
    "ApiKeyList": ApiKeyList,
    "ArrayOfContentPartsInner": ArrayOfContentPartsInner,
    "AssistantObject": AssistantObject,
    "AssistantObjectToolResources": AssistantObjectToolResources,
    "AssistantObjectToolResourcesCodeInterpreter": AssistantObjectToolResourcesCodeInterpreter,
    "AssistantObjectToolResourcesFileSearch": AssistantObjectToolResourcesFileSearch,
    "AssistantObjectToolsInner": AssistantObjectToolsInner,
    "AssistantStreamEvent": AssistantStreamEvent,
    "AssistantToolsCode": AssistantToolsCode,
    "AssistantToolsFileSearch": AssistantToolsFileSearch,
    "AssistantToolsFileSearchFileSearch": AssistantToolsFileSearchFileSearch,
    "AssistantToolsFileSearchTypeOnly": AssistantToolsFileSearchTypeOnly,
    "AssistantToolsFunction": AssistantToolsFunction,
    "AssistantsApiResponseFormatOption": AssistantsApiResponseFormatOption,
    "AssistantsApiToolChoiceOption": AssistantsApiToolChoiceOption,
    "AssistantsNamedToolChoice": AssistantsNamedToolChoice,
    "AssistantsNamedToolChoiceFunction": AssistantsNamedToolChoiceFunction,
    "AuditLog": AuditLog,
    "AuditLogActor": AuditLogActor,
    "AuditLogActorApiKey": AuditLogActorApiKey,
    "AuditLogActorServiceAccount": AuditLogActorServiceAccount,
    "AuditLogActorSession": AuditLogActorSession,
    "AuditLogActorUser": AuditLogActorUser,
    "AuditLogApiKeyCreated": AuditLogApiKeyCreated,
    "AuditLogApiKeyCreatedData": AuditLogApiKeyCreatedData,
    "AuditLogApiKeyDeleted": AuditLogApiKeyDeleted,
    "AuditLogApiKeyUpdated": AuditLogApiKeyUpdated,
    "AuditLogApiKeyUpdatedChangesRequested": AuditLogApiKeyUpdatedChangesRequested,
    "AuditLogInviteAccepted": AuditLogInviteAccepted,
    "AuditLogInviteSent": AuditLogInviteSent,
    "AuditLogInviteSentData": AuditLogInviteSentData,
    "AuditLogLoginFailed": AuditLogLoginFailed,
    "AuditLogOrganizationUpdated": AuditLogOrganizationUpdated,
    "AuditLogOrganizationUpdatedChangesRequested": AuditLogOrganizationUpdatedChangesRequested,
    "AuditLogOrganizationUpdatedChangesRequestedSettings": AuditLogOrganizationUpdatedChangesRequestedSettings,
    "AuditLogProject": AuditLogProject,
    "AuditLogProjectArchived": AuditLogProjectArchived,
    "AuditLogProjectCreated": AuditLogProjectCreated,
    "AuditLogProjectCreatedData": AuditLogProjectCreatedData,
    "AuditLogProjectUpdated": AuditLogProjectUpdated,
    "AuditLogProjectUpdatedChangesRequested": AuditLogProjectUpdatedChangesRequested,
    "AuditLogRateLimitDeleted": AuditLogRateLimitDeleted,
    "AuditLogRateLimitUpdated": AuditLogRateLimitUpdated,
    "AuditLogRateLimitUpdatedChangesRequested": AuditLogRateLimitUpdatedChangesRequested,
    "AuditLogServiceAccountCreated": AuditLogServiceAccountCreated,
    "AuditLogServiceAccountCreatedData": AuditLogServiceAccountCreatedData,
    "AuditLogServiceAccountDeleted": AuditLogServiceAccountDeleted,
    "AuditLogServiceAccountUpdated": AuditLogServiceAccountUpdated,
    "AuditLogServiceAccountUpdatedChangesRequested": AuditLogServiceAccountUpdatedChangesRequested,
    "AuditLogUserAdded": AuditLogUserAdded,
    "AuditLogUserAddedData": AuditLogUserAddedData,
    "AuditLogUserDeleted": AuditLogUserDeleted,
    "AuditLogUserUpdated": AuditLogUserUpdated,
    "AuditLogUserUpdatedChangesRequested": AuditLogUserUpdatedChangesRequested,
    "AutoChunkingStrategy": AutoChunkingStrategy,
    "AutoChunkingStrategyRequestParam": AutoChunkingStrategyRequestParam,
    "Batch": Batch,
    "BatchErrors": BatchErrors,
    "BatchErrorsDataInner": BatchErrorsDataInner,
    "BatchRequestCounts": BatchRequestCounts,
    "BatchRequestInput": BatchRequestInput,
    "BatchRequestOutput": BatchRequestOutput,
    "BatchRequestOutputError": BatchRequestOutputError,
    "BatchRequestOutputResponse": BatchRequestOutputResponse,
    "ChatCompletionFunctionCallOption": ChatCompletionFunctionCallOption,
    "ChatCompletionFunctions": ChatCompletionFunctions,
    "ChatCompletionMessageToolCall": ChatCompletionMessageToolCall,
    "ChatCompletionMessageToolCallChunk": ChatCompletionMessageToolCallChunk,
    "ChatCompletionMessageToolCallChunkFunction": ChatCompletionMessageToolCallChunkFunction,
    "ChatCompletionMessageToolCallFunction": ChatCompletionMessageToolCallFunction,
    "ChatCompletionNamedToolChoice": ChatCompletionNamedToolChoice,
    "ChatCompletionRequestAssistantMessage": ChatCompletionRequestAssistantMessage,
    "ChatCompletionRequestAssistantMessageAudio": ChatCompletionRequestAssistantMessageAudio,
    "ChatCompletionRequestAssistantMessageContent": ChatCompletionRequestAssistantMessageContent,
    "ChatCompletionRequestAssistantMessageContentPart": ChatCompletionRequestAssistantMessageContentPart,
    "ChatCompletionRequestAssistantMessageFunctionCall": ChatCompletionRequestAssistantMessageFunctionCall,
    "ChatCompletionRequestDeveloperMessage": ChatCompletionRequestDeveloperMessage,
    "ChatCompletionRequestDeveloperMessageContent": ChatCompletionRequestDeveloperMessageContent,
    "ChatCompletionRequestFunctionMessage": ChatCompletionRequestFunctionMessage,
    "ChatCompletionRequestMessage": ChatCompletionRequestMessage,
    "ChatCompletionRequestMessageContentPartAudio": ChatCompletionRequestMessageContentPartAudio,
    "ChatCompletionRequestMessageContentPartAudioInputAudio": ChatCompletionRequestMessageContentPartAudioInputAudio,
    "ChatCompletionRequestMessageContentPartImage": ChatCompletionRequestMessageContentPartImage,
    "ChatCompletionRequestMessageContentPartImageImageUrl": ChatCompletionRequestMessageContentPartImageImageUrl,
    "ChatCompletionRequestMessageContentPartRefusal": ChatCompletionRequestMessageContentPartRefusal,
    "ChatCompletionRequestMessageContentPartText": ChatCompletionRequestMessageContentPartText,
    "ChatCompletionRequestSystemMessage": ChatCompletionRequestSystemMessage,
    "ChatCompletionRequestSystemMessageContent": ChatCompletionRequestSystemMessageContent,
    "ChatCompletionRequestToolMessage": ChatCompletionRequestToolMessage,
    "ChatCompletionRequestToolMessageContent": ChatCompletionRequestToolMessageContent,
    "ChatCompletionRequestUserMessage": ChatCompletionRequestUserMessage,
    "ChatCompletionRequestUserMessageContent": ChatCompletionRequestUserMessageContent,
    "ChatCompletionRequestUserMessageContentPart": ChatCompletionRequestUserMessageContentPart,
    "ChatCompletionResponseMessage": ChatCompletionResponseMessage,
    "ChatCompletionResponseMessageAudio": ChatCompletionResponseMessageAudio,
    "ChatCompletionResponseMessageFunctionCall": ChatCompletionResponseMessageFunctionCall,
    "ChatCompletionStreamOptions": ChatCompletionStreamOptions,
    "ChatCompletionStreamResponseDelta": ChatCompletionStreamResponseDelta,
    "ChatCompletionStreamResponseDeltaFunctionCall": ChatCompletionStreamResponseDeltaFunctionCall,
    "ChatCompletionTokenLogprob": ChatCompletionTokenLogprob,
    "ChatCompletionTokenLogprobTopLogprobsInner": ChatCompletionTokenLogprobTopLogprobsInner,
    "ChatCompletionTool": ChatCompletionTool,
    "ChatCompletionToolChoiceOption": ChatCompletionToolChoiceOption,
    "ChunkingStrategyRequestParam": ChunkingStrategyRequestParam,
    "CompleteUploadRequest": CompleteUploadRequest,
    "CompletionUsage": CompletionUsage,
    "CompletionUsageCompletionTokensDetails": CompletionUsageCompletionTokensDetails,
    "CompletionUsagePromptTokensDetails": CompletionUsagePromptTokensDetails,
    "CostsResult": CostsResult,
    "CostsResultAmount": CostsResultAmount,
    "CreateAssistantRequest": CreateAssistantRequest,
    "CreateAssistantRequestModel": CreateAssistantRequestModel,
    "CreateAssistantRequestToolResources": CreateAssistantRequestToolResources,
    "CreateAssistantRequestToolResourcesCodeInterpreter": CreateAssistantRequestToolResourcesCodeInterpreter,
    "CreateAssistantRequestToolResourcesFileSearch": CreateAssistantRequestToolResourcesFileSearch,
    "CreateAssistantRequestToolResourcesFileSearchVectorStoresInner": CreateAssistantRequestToolResourcesFileSearchVectorStoresInner,
    "CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy": CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy,
    "CreateBatchRequest": CreateBatchRequest,
    "CreateChatCompletionFunctionResponse": CreateChatCompletionFunctionResponse,
    "CreateChatCompletionFunctionResponseChoicesInner": CreateChatCompletionFunctionResponseChoicesInner,
    "CreateChatCompletionRequest": CreateChatCompletionRequest,
    "CreateChatCompletionRequestAudio": CreateChatCompletionRequestAudio,
    "CreateChatCompletionRequestFunctionCall": CreateChatCompletionRequestFunctionCall,
    "CreateChatCompletionRequestModel": CreateChatCompletionRequestModel,
    "CreateChatCompletionRequestResponseFormat": CreateChatCompletionRequestResponseFormat,
    "CreateChatCompletionRequestStop": CreateChatCompletionRequestStop,
    "CreateChatCompletionResponse": CreateChatCompletionResponse,
    "CreateChatCompletionResponseChoicesInner": CreateChatCompletionResponseChoicesInner,
    "CreateChatCompletionResponseChoicesInnerLogprobs": CreateChatCompletionResponseChoicesInnerLogprobs,
    "CreateChatCompletionStreamResponse": CreateChatCompletionStreamResponse,
    "CreateChatCompletionStreamResponseChoicesInner": CreateChatCompletionStreamResponseChoicesInner,
    "CreateChatCompletionStreamResponseUsage": CreateChatCompletionStreamResponseUsage,
    "CreateCompletionRequest": CreateCompletionRequest,
    "CreateCompletionRequestModel": CreateCompletionRequestModel,
    "CreateCompletionRequestPrompt": CreateCompletionRequestPrompt,
    "CreateCompletionRequestStop": CreateCompletionRequestStop,
    "CreateCompletionResponse": CreateCompletionResponse,
    "CreateCompletionResponseChoicesInner": CreateCompletionResponseChoicesInner,
    "CreateCompletionResponseChoicesInnerLogprobs": CreateCompletionResponseChoicesInnerLogprobs,
    "CreateEmbeddingRequest": CreateEmbeddingRequest,
    "CreateEmbeddingRequestInput": CreateEmbeddingRequestInput,
    "CreateEmbeddingRequestModel": CreateEmbeddingRequestModel,
    "CreateEmbeddingResponse": CreateEmbeddingResponse,
    "CreateEmbeddingResponseUsage": CreateEmbeddingResponseUsage,
    "CreateFineTuningJobRequest": CreateFineTuningJobRequest,
    "CreateFineTuningJobRequestHyperparameters": CreateFineTuningJobRequestHyperparameters,
    "CreateFineTuningJobRequestHyperparametersBatchSize": CreateFineTuningJobRequestHyperparametersBatchSize,
    "CreateFineTuningJobRequestHyperparametersLearningRateMultiplier": CreateFineTuningJobRequestHyperparametersLearningRateMultiplier,
    "CreateFineTuningJobRequestHyperparametersNEpochs": CreateFineTuningJobRequestHyperparametersNEpochs,
    "CreateFineTuningJobRequestIntegrationsInner": CreateFineTuningJobRequestIntegrationsInner,
    "CreateFineTuningJobRequestIntegrationsInnerWandb": CreateFineTuningJobRequestIntegrationsInnerWandb,
    "CreateFineTuningJobRequestModel": CreateFineTuningJobRequestModel,
    "CreateImageEditRequestModel": CreateImageEditRequestModel,
    "CreateImageRequest": CreateImageRequest,
    "CreateImageRequestModel": CreateImageRequestModel,
    "CreateMessageRequest": CreateMessageRequest,
    "CreateMessageRequestAttachmentsInner": CreateMessageRequestAttachmentsInner,
    "CreateMessageRequestAttachmentsInnerToolsInner": CreateMessageRequestAttachmentsInnerToolsInner,
    "CreateMessageRequestContent": CreateMessageRequestContent,
    "CreateModerationRequest": CreateModerationRequest,
    "CreateModerationRequestInput": CreateModerationRequestInput,
    "CreateModerationRequestInputOneOfInner": CreateModerationRequestInputOneOfInner,
    "CreateModerationRequestInputOneOfInnerOneOf": CreateModerationRequestInputOneOfInnerOneOf,
    "CreateModerationRequestInputOneOfInnerOneOf1": CreateModerationRequestInputOneOfInnerOneOf1,
    "CreateModerationRequestInputOneOfInnerOneOfImageUrl": CreateModerationRequestInputOneOfInnerOneOfImageUrl,
    "CreateModerationRequestModel": CreateModerationRequestModel,
    "CreateModerationResponse": CreateModerationResponse,
    "CreateModerationResponseResultsInner": CreateModerationResponseResultsInner,
    "CreateModerationResponseResultsInnerCategories": CreateModerationResponseResultsInnerCategories,
    "CreateModerationResponseResultsInnerCategoryAppliedInputTypes": CreateModerationResponseResultsInnerCategoryAppliedInputTypes,
    "CreateModerationResponseResultsInnerCategoryScores": CreateModerationResponseResultsInnerCategoryScores,
    "CreateRunRequest": CreateRunRequest,
    "CreateRunRequestModel": CreateRunRequestModel,
    "CreateSpeechRequest": CreateSpeechRequest,
    "CreateSpeechRequestModel": CreateSpeechRequestModel,
    "CreateThreadAndRunRequest": CreateThreadAndRunRequest,
    "CreateThreadAndRunRequestToolResources": CreateThreadAndRunRequestToolResources,
    "CreateThreadAndRunRequestToolsInner": CreateThreadAndRunRequestToolsInner,
    "CreateThreadRequest": CreateThreadRequest,
    "CreateThreadRequestToolResources": CreateThreadRequestToolResources,
    "CreateThreadRequestToolResourcesFileSearch": CreateThreadRequestToolResourcesFileSearch,
    "CreateThreadRequestToolResourcesFileSearchVectorStoresInner": CreateThreadRequestToolResourcesFileSearchVectorStoresInner,
    "CreateTranscription200Response": CreateTranscription200Response,
    "CreateTranscriptionRequestModel": CreateTranscriptionRequestModel,
    "CreateTranscriptionResponseJson": CreateTranscriptionResponseJson,
    "CreateTranscriptionResponseVerboseJson": CreateTranscriptionResponseVerboseJson,
    "CreateTranslation200Response": CreateTranslation200Response,
    "CreateTranslationResponseJson": CreateTranslationResponseJson,
    "CreateTranslationResponseVerboseJson": CreateTranslationResponseVerboseJson,
    "CreateUploadRequest": CreateUploadRequest,
    "CreateVectorStoreFileBatchRequest": CreateVectorStoreFileBatchRequest,
    "CreateVectorStoreFileRequest": CreateVectorStoreFileRequest,
    "CreateVectorStoreRequest": CreateVectorStoreRequest,
    "CreateVectorStoreRequestChunkingStrategy": CreateVectorStoreRequestChunkingStrategy,
    "DefaultProjectErrorResponse": DefaultProjectErrorResponse,
    "DeleteAssistantResponse": DeleteAssistantResponse,
    "DeleteFileResponse": DeleteFileResponse,
    "DeleteMessageResponse": DeleteMessageResponse,
    "DeleteModelResponse": DeleteModelResponse,
    "DeleteThreadResponse": DeleteThreadResponse,
    "DeleteVectorStoreFileResponse": DeleteVectorStoreFileResponse,
    "DeleteVectorStoreResponse": DeleteVectorStoreResponse,
    "DoneEvent": DoneEvent,
    "Embedding": Embedding,
    "ErrorEvent": ErrorEvent,
    "ErrorResponse": ErrorResponse,
    "FileSearchRankingOptions": FileSearchRankingOptions,
    "FineTuneChatCompletionRequestAssistantMessage": FineTuneChatCompletionRequestAssistantMessage,
    "FineTuneChatRequestInput": FineTuneChatRequestInput,
    "FineTuneChatRequestInputMessagesInner": FineTuneChatRequestInputMessagesInner,
    "FineTuneCompletionRequestInput": FineTuneCompletionRequestInput,
    "FineTuneDPOMethod": FineTuneDPOMethod,
    "FineTuneDPOMethodHyperparameters": FineTuneDPOMethodHyperparameters,
    "FineTuneDPOMethodHyperparametersBatchSize": FineTuneDPOMethodHyperparametersBatchSize,
    "FineTuneDPOMethodHyperparametersBeta": FineTuneDPOMethodHyperparametersBeta,
    "FineTuneDPOMethodHyperparametersLearningRateMultiplier": FineTuneDPOMethodHyperparametersLearningRateMultiplier,
    "FineTuneDPOMethodHyperparametersNEpochs": FineTuneDPOMethodHyperparametersNEpochs,
    "FineTuneMethod": FineTuneMethod,
    "FineTunePreferenceRequestInput": FineTunePreferenceRequestInput,
    "FineTunePreferenceRequestInputInput": FineTunePreferenceRequestInputInput,
    "FineTunePreferenceRequestInputPreferredCompletionInner": FineTunePreferenceRequestInputPreferredCompletionInner,
    "FineTuneSupervisedMethod": FineTuneSupervisedMethod,
    "FineTuneSupervisedMethodHyperparameters": FineTuneSupervisedMethodHyperparameters,
    "FineTuningIntegration": FineTuningIntegration,
    "FineTuningJob": FineTuningJob,
    "FineTuningJobCheckpoint": FineTuningJobCheckpoint,
    "FineTuningJobCheckpointMetrics": FineTuningJobCheckpointMetrics,
    "FineTuningJobError": FineTuningJobError,
    "FineTuningJobEvent": FineTuningJobEvent,
    "FineTuningJobHyperparameters": FineTuningJobHyperparameters,
    "FineTuningJobIntegrationsInner": FineTuningJobIntegrationsInner,
    "FunctionObject": FunctionObject,
    "Image": Image,
    "ImagesResponse": ImagesResponse,
    "Invite": Invite,
    "InviteDeleteResponse": InviteDeleteResponse,
    "InviteListResponse": InviteListResponse,
    "InviteProjectsInner": InviteProjectsInner,
    "InviteRequest": InviteRequest,
    "InviteRequestProjectsInner": InviteRequestProjectsInner,
    "ListAssistantsResponse": ListAssistantsResponse,
    "ListAuditLogsEffectiveAtParameter": ListAuditLogsEffectiveAtParameter,
    "ListAuditLogsResponse": ListAuditLogsResponse,
    "ListBatchesResponse": ListBatchesResponse,
    "ListFilesResponse": ListFilesResponse,
    "ListFineTuningJobCheckpointsResponse": ListFineTuningJobCheckpointsResponse,
    "ListFineTuningJobEventsResponse": ListFineTuningJobEventsResponse,
    "ListMessagesResponse": ListMessagesResponse,
    "ListModelsResponse": ListModelsResponse,
    "ListPaginatedFineTuningJobsResponse": ListPaginatedFineTuningJobsResponse,
    "ListRunStepsResponse": ListRunStepsResponse,
    "ListRunsResponse": ListRunsResponse,
    "ListThreadsResponse": ListThreadsResponse,
    "ListVectorStoreFilesResponse": ListVectorStoreFilesResponse,
    "ListVectorStoresResponse": ListVectorStoresResponse,
    "MessageContentImageFileObject": MessageContentImageFileObject,
    "MessageContentImageFileObjectImageFile": MessageContentImageFileObjectImageFile,
    "MessageContentImageUrlObject": MessageContentImageUrlObject,
    "MessageContentImageUrlObjectImageUrl": MessageContentImageUrlObjectImageUrl,
    "MessageContentRefusalObject": MessageContentRefusalObject,
    "MessageContentTextAnnotationsFileCitationObject": MessageContentTextAnnotationsFileCitationObject,
    "MessageContentTextAnnotationsFileCitationObjectFileCitation": MessageContentTextAnnotationsFileCitationObjectFileCitation,
    "MessageContentTextAnnotationsFilePathObject": MessageContentTextAnnotationsFilePathObject,
    "MessageContentTextAnnotationsFilePathObjectFilePath": MessageContentTextAnnotationsFilePathObjectFilePath,
    "MessageContentTextObject": MessageContentTextObject,
    "MessageContentTextObjectText": MessageContentTextObjectText,
    "MessageContentTextObjectTextAnnotationsInner": MessageContentTextObjectTextAnnotationsInner,
    "MessageDeltaContentImageFileObject": MessageDeltaContentImageFileObject,
    "MessageDeltaContentImageFileObjectImageFile": MessageDeltaContentImageFileObjectImageFile,
    "MessageDeltaContentImageUrlObject": MessageDeltaContentImageUrlObject,
    "MessageDeltaContentImageUrlObjectImageUrl": MessageDeltaContentImageUrlObjectImageUrl,
    "MessageDeltaContentRefusalObject": MessageDeltaContentRefusalObject,
    "MessageDeltaContentTextAnnotationsFileCitationObject": MessageDeltaContentTextAnnotationsFileCitationObject,
    "MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation": MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation,
    "MessageDeltaContentTextAnnotationsFilePathObject": MessageDeltaContentTextAnnotationsFilePathObject,
    "MessageDeltaContentTextAnnotationsFilePathObjectFilePath": MessageDeltaContentTextAnnotationsFilePathObjectFilePath,
    "MessageDeltaContentTextObject": MessageDeltaContentTextObject,
    "MessageDeltaContentTextObjectText": MessageDeltaContentTextObjectText,
    "MessageDeltaContentTextObjectTextAnnotationsInner": MessageDeltaContentTextObjectTextAnnotationsInner,
    "MessageDeltaObject": MessageDeltaObject,
    "MessageDeltaObjectDelta": MessageDeltaObjectDelta,
    "MessageDeltaObjectDeltaContentInner": MessageDeltaObjectDeltaContentInner,
    "MessageObject": MessageObject,
    "MessageObjectContentInner": MessageObjectContentInner,
    "MessageObjectIncompleteDetails": MessageObjectIncompleteDetails,
    "MessageRequestContentTextObject": MessageRequestContentTextObject,
    "MessageStreamEvent": MessageStreamEvent,
    "MessageStreamEventOneOf": MessageStreamEventOneOf,
    "MessageStreamEventOneOf1": MessageStreamEventOneOf1,
    "MessageStreamEventOneOf2": MessageStreamEventOneOf2,
    "MessageStreamEventOneOf3": MessageStreamEventOneOf3,
    "MessageStreamEventOneOf4": MessageStreamEventOneOf4,
    "Model": Model,
    "ModelError": ModelError,
    "ModifyAssistantRequest": ModifyAssistantRequest,
    "ModifyAssistantRequestToolResources": ModifyAssistantRequestToolResources,
    "ModifyAssistantRequestToolResourcesCodeInterpreter": ModifyAssistantRequestToolResourcesCodeInterpreter,
    "ModifyAssistantRequestToolResourcesFileSearch": ModifyAssistantRequestToolResourcesFileSearch,
    "ModifyMessageRequest": ModifyMessageRequest,
    "ModifyRunRequest": ModifyRunRequest,
    "ModifyThreadRequest": ModifyThreadRequest,
    "ModifyThreadRequestToolResources": ModifyThreadRequestToolResources,
    "ModifyThreadRequestToolResourcesFileSearch": ModifyThreadRequestToolResourcesFileSearch,
    "OpenAIFile": OpenAIFile,
    "OtherChunkingStrategyResponseParam": OtherChunkingStrategyResponseParam,
    "PredictionContent": PredictionContent,
    "PredictionContentContent": PredictionContentContent,
    "Project": Project,
    "ProjectApiKey": ProjectApiKey,
    "ProjectApiKeyDeleteResponse": ProjectApiKeyDeleteResponse,
    "ProjectApiKeyListResponse": ProjectApiKeyListResponse,
    "ProjectApiKeyOwner": ProjectApiKeyOwner,
    "ProjectCreateRequest": ProjectCreateRequest,
    "ProjectListResponse": ProjectListResponse,
    "ProjectRateLimit": ProjectRateLimit,
    "ProjectRateLimitListResponse": ProjectRateLimitListResponse,
    "ProjectRateLimitUpdateRequest": ProjectRateLimitUpdateRequest,
    "ProjectServiceAccount": ProjectServiceAccount,
    "ProjectServiceAccountApiKey": ProjectServiceAccountApiKey,
    "ProjectServiceAccountCreateRequest": ProjectServiceAccountCreateRequest,
    "ProjectServiceAccountCreateResponse": ProjectServiceAccountCreateResponse,
    "ProjectServiceAccountDeleteResponse": ProjectServiceAccountDeleteResponse,
    "ProjectServiceAccountListResponse": ProjectServiceAccountListResponse,
    "ProjectUpdateRequest": ProjectUpdateRequest,
    "ProjectUser": ProjectUser,
    "ProjectUserCreateRequest": ProjectUserCreateRequest,
    "ProjectUserDeleteResponse": ProjectUserDeleteResponse,
    "ProjectUserListResponse": ProjectUserListResponse,
    "ProjectUserUpdateRequest": ProjectUserUpdateRequest,
    "RealtimeClientEventConversationItemCreate": RealtimeClientEventConversationItemCreate,
    "RealtimeClientEventConversationItemDelete": RealtimeClientEventConversationItemDelete,
    "RealtimeClientEventConversationItemTruncate": RealtimeClientEventConversationItemTruncate,
    "RealtimeClientEventInputAudioBufferAppend": RealtimeClientEventInputAudioBufferAppend,
    "RealtimeClientEventInputAudioBufferClear": RealtimeClientEventInputAudioBufferClear,
    "RealtimeClientEventInputAudioBufferCommit": RealtimeClientEventInputAudioBufferCommit,
    "RealtimeClientEventResponseCancel": RealtimeClientEventResponseCancel,
    "RealtimeClientEventResponseCreate": RealtimeClientEventResponseCreate,
    "RealtimeClientEventSessionUpdate": RealtimeClientEventSessionUpdate,
    "RealtimeConversationItem": RealtimeConversationItem,
    "RealtimeConversationItemContentInner": RealtimeConversationItemContentInner,
    "RealtimeResponse": RealtimeResponse,
    "RealtimeResponseCreateParams": RealtimeResponseCreateParams,
    "RealtimeResponseCreateParamsConversation": RealtimeResponseCreateParamsConversation,
    "RealtimeResponseCreateParamsMaxResponseOutputTokens": RealtimeResponseCreateParamsMaxResponseOutputTokens,
    "RealtimeResponseCreateParamsToolsInner": RealtimeResponseCreateParamsToolsInner,
    "RealtimeResponseStatusDetails": RealtimeResponseStatusDetails,
    "RealtimeResponseStatusDetailsError": RealtimeResponseStatusDetailsError,
    "RealtimeResponseUsage": RealtimeResponseUsage,
    "RealtimeResponseUsageInputTokenDetails": RealtimeResponseUsageInputTokenDetails,
    "RealtimeResponseUsageOutputTokenDetails": RealtimeResponseUsageOutputTokenDetails,
    "RealtimeServerEventConversationCreated": RealtimeServerEventConversationCreated,
    "RealtimeServerEventConversationCreatedConversation": RealtimeServerEventConversationCreatedConversation,
    "RealtimeServerEventConversationItemCreated": RealtimeServerEventConversationItemCreated,
    "RealtimeServerEventConversationItemDeleted": RealtimeServerEventConversationItemDeleted,
    "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted": RealtimeServerEventConversationItemInputAudioTranscriptionCompleted,
    "RealtimeServerEventConversationItemInputAudioTranscriptionFailed": RealtimeServerEventConversationItemInputAudioTranscriptionFailed,
    "RealtimeServerEventConversationItemInputAudioTranscriptionFailedError": RealtimeServerEventConversationItemInputAudioTranscriptionFailedError,
    "RealtimeServerEventConversationItemTruncated": RealtimeServerEventConversationItemTruncated,
    "RealtimeServerEventError": RealtimeServerEventError,
    "RealtimeServerEventErrorError": RealtimeServerEventErrorError,
    "RealtimeServerEventInputAudioBufferCleared": RealtimeServerEventInputAudioBufferCleared,
    "RealtimeServerEventInputAudioBufferCommitted": RealtimeServerEventInputAudioBufferCommitted,
    "RealtimeServerEventInputAudioBufferSpeechStarted": RealtimeServerEventInputAudioBufferSpeechStarted,
    "RealtimeServerEventInputAudioBufferSpeechStopped": RealtimeServerEventInputAudioBufferSpeechStopped,
    "RealtimeServerEventRateLimitsUpdated": RealtimeServerEventRateLimitsUpdated,
    "RealtimeServerEventRateLimitsUpdatedRateLimitsInner": RealtimeServerEventRateLimitsUpdatedRateLimitsInner,
    "RealtimeServerEventResponseAudioDelta": RealtimeServerEventResponseAudioDelta,
    "RealtimeServerEventResponseAudioDone": RealtimeServerEventResponseAudioDone,
    "RealtimeServerEventResponseAudioTranscriptDelta": RealtimeServerEventResponseAudioTranscriptDelta,
    "RealtimeServerEventResponseAudioTranscriptDone": RealtimeServerEventResponseAudioTranscriptDone,
    "RealtimeServerEventResponseContentPartAdded": RealtimeServerEventResponseContentPartAdded,
    "RealtimeServerEventResponseContentPartAddedPart": RealtimeServerEventResponseContentPartAddedPart,
    "RealtimeServerEventResponseContentPartDone": RealtimeServerEventResponseContentPartDone,
    "RealtimeServerEventResponseContentPartDonePart": RealtimeServerEventResponseContentPartDonePart,
    "RealtimeServerEventResponseCreated": RealtimeServerEventResponseCreated,
    "RealtimeServerEventResponseDone": RealtimeServerEventResponseDone,
    "RealtimeServerEventResponseFunctionCallArgumentsDelta": RealtimeServerEventResponseFunctionCallArgumentsDelta,
    "RealtimeServerEventResponseFunctionCallArgumentsDone": RealtimeServerEventResponseFunctionCallArgumentsDone,
    "RealtimeServerEventResponseOutputItemAdded": RealtimeServerEventResponseOutputItemAdded,
    "RealtimeServerEventResponseOutputItemDone": RealtimeServerEventResponseOutputItemDone,
    "RealtimeServerEventResponseTextDelta": RealtimeServerEventResponseTextDelta,
    "RealtimeServerEventResponseTextDone": RealtimeServerEventResponseTextDone,
    "RealtimeServerEventSessionCreated": RealtimeServerEventSessionCreated,
    "RealtimeServerEventSessionUpdated": RealtimeServerEventSessionUpdated,
    "RealtimeSession": RealtimeSession,
    "RealtimeSessionCreateRequest": RealtimeSessionCreateRequest,
    "RealtimeSessionCreateRequestTurnDetection": RealtimeSessionCreateRequestTurnDetection,
    "RealtimeSessionCreateResponse": RealtimeSessionCreateResponse,
    "RealtimeSessionCreateResponseClientSecret": RealtimeSessionCreateResponseClientSecret,
    "RealtimeSessionCreateResponseTurnDetection": RealtimeSessionCreateResponseTurnDetection,
    "RealtimeSessionInputAudioTranscription": RealtimeSessionInputAudioTranscription,
    "RealtimeSessionModel": RealtimeSessionModel,
    "RealtimeSessionTurnDetection": RealtimeSessionTurnDetection,
    "ResponseFormatJsonObject": ResponseFormatJsonObject,
    "ResponseFormatJsonSchema": ResponseFormatJsonSchema,
    "ResponseFormatJsonSchemaJsonSchema": ResponseFormatJsonSchemaJsonSchema,
    "ResponseFormatText": ResponseFormatText,
    "RunCompletionUsage": RunCompletionUsage,
    "RunObject": RunObject,
    "RunObjectIncompleteDetails": RunObjectIncompleteDetails,
    "RunObjectLastError": RunObjectLastError,
    "RunObjectRequiredAction": RunObjectRequiredAction,
    "RunObjectRequiredActionSubmitToolOutputs": RunObjectRequiredActionSubmitToolOutputs,
    "RunStepCompletionUsage": RunStepCompletionUsage,
    "RunStepDeltaObject": RunStepDeltaObject,
    "RunStepDeltaObjectDelta": RunStepDeltaObjectDelta,
    "RunStepDeltaObjectDeltaStepDetails": RunStepDeltaObjectDeltaStepDetails,
    "RunStepDeltaStepDetailsMessageCreationObject": RunStepDeltaStepDetailsMessageCreationObject,
    "RunStepDeltaStepDetailsMessageCreationObjectMessageCreation": RunStepDeltaStepDetailsMessageCreationObjectMessageCreation,
    "RunStepDeltaStepDetailsToolCallsCodeObject": RunStepDeltaStepDetailsToolCallsCodeObject,
    "RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter": RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter,
    "RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner": RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner,
    "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject": RunStepDeltaStepDetailsToolCallsCodeOutputImageObject,
    "RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage": RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage,
    "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject": RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject,
    "RunStepDeltaStepDetailsToolCallsFileSearchObject": RunStepDeltaStepDetailsToolCallsFileSearchObject,
    "RunStepDeltaStepDetailsToolCallsFunctionObject": RunStepDeltaStepDetailsToolCallsFunctionObject,
    "RunStepDeltaStepDetailsToolCallsFunctionObjectFunction": RunStepDeltaStepDetailsToolCallsFunctionObjectFunction,
    "RunStepDeltaStepDetailsToolCallsObject": RunStepDeltaStepDetailsToolCallsObject,
    "RunStepDeltaStepDetailsToolCallsObjectToolCallsInner": RunStepDeltaStepDetailsToolCallsObjectToolCallsInner,
    "RunStepDetailsMessageCreationObject": RunStepDetailsMessageCreationObject,
    "RunStepDetailsMessageCreationObjectMessageCreation": RunStepDetailsMessageCreationObjectMessageCreation,
    "RunStepDetailsToolCallsCodeObject": RunStepDetailsToolCallsCodeObject,
    "RunStepDetailsToolCallsCodeObjectCodeInterpreter": RunStepDetailsToolCallsCodeObjectCodeInterpreter,
    "RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner": RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner,
    "RunStepDetailsToolCallsCodeOutputImageObject": RunStepDetailsToolCallsCodeOutputImageObject,
    "RunStepDetailsToolCallsCodeOutputImageObjectImage": RunStepDetailsToolCallsCodeOutputImageObjectImage,
    "RunStepDetailsToolCallsCodeOutputLogsObject": RunStepDetailsToolCallsCodeOutputLogsObject,
    "RunStepDetailsToolCallsFileSearchObject": RunStepDetailsToolCallsFileSearchObject,
    "RunStepDetailsToolCallsFileSearchObjectFileSearch": RunStepDetailsToolCallsFileSearchObjectFileSearch,
    "RunStepDetailsToolCallsFileSearchRankingOptionsObject": RunStepDetailsToolCallsFileSearchRankingOptionsObject,
    "RunStepDetailsToolCallsFileSearchResultObject": RunStepDetailsToolCallsFileSearchResultObject,
    "RunStepDetailsToolCallsFileSearchResultObjectContentInner": RunStepDetailsToolCallsFileSearchResultObjectContentInner,
    "RunStepDetailsToolCallsFunctionObject": RunStepDetailsToolCallsFunctionObject,
    "RunStepDetailsToolCallsFunctionObjectFunction": RunStepDetailsToolCallsFunctionObjectFunction,
    "RunStepDetailsToolCallsObject": RunStepDetailsToolCallsObject,
    "RunStepDetailsToolCallsObjectToolCallsInner": RunStepDetailsToolCallsObjectToolCallsInner,
    "RunStepObject": RunStepObject,
    "RunStepObjectLastError": RunStepObjectLastError,
    "RunStepObjectStepDetails": RunStepObjectStepDetails,
    "RunStepStreamEvent": RunStepStreamEvent,
    "RunStepStreamEventOneOf": RunStepStreamEventOneOf,
    "RunStepStreamEventOneOf1": RunStepStreamEventOneOf1,
    "RunStepStreamEventOneOf2": RunStepStreamEventOneOf2,
    "RunStepStreamEventOneOf3": RunStepStreamEventOneOf3,
    "RunStepStreamEventOneOf4": RunStepStreamEventOneOf4,
    "RunStepStreamEventOneOf5": RunStepStreamEventOneOf5,
    "RunStepStreamEventOneOf6": RunStepStreamEventOneOf6,
    "RunStreamEvent": RunStreamEvent,
    "RunStreamEventOneOf": RunStreamEventOneOf,
    "RunStreamEventOneOf1": RunStreamEventOneOf1,
    "RunStreamEventOneOf2": RunStreamEventOneOf2,
    "RunStreamEventOneOf3": RunStreamEventOneOf3,
    "RunStreamEventOneOf4": RunStreamEventOneOf4,
    "RunStreamEventOneOf5": RunStreamEventOneOf5,
    "RunStreamEventOneOf6": RunStreamEventOneOf6,
    "RunStreamEventOneOf7": RunStreamEventOneOf7,
    "RunStreamEventOneOf8": RunStreamEventOneOf8,
    "RunStreamEventOneOf9": RunStreamEventOneOf9,
    "RunToolCallObject": RunToolCallObject,
    "RunToolCallObjectFunction": RunToolCallObjectFunction,
    "StaticChunkingStrategy": StaticChunkingStrategy,
    "StaticChunkingStrategyRequestParam": StaticChunkingStrategyRequestParam,
    "StaticChunkingStrategyResponseParam": StaticChunkingStrategyResponseParam,
    "StaticChunkingStrategyStatic": StaticChunkingStrategyStatic,
    "SubmitToolOutputsRunRequest": SubmitToolOutputsRunRequest,
    "SubmitToolOutputsRunRequestToolOutputsInner": SubmitToolOutputsRunRequestToolOutputsInner,
    "ThreadObject": ThreadObject,
    "ThreadStreamEvent": ThreadStreamEvent,
    "TranscriptionSegment": TranscriptionSegment,
    "TranscriptionWord": TranscriptionWord,
    "TruncationObject": TruncationObject,
    "UpdateVectorStoreRequest": UpdateVectorStoreRequest,
    "Upload": Upload,
    "UploadPart": UploadPart,
    "UsageAudioSpeechesResult": UsageAudioSpeechesResult,
    "UsageAudioTranscriptionsResult": UsageAudioTranscriptionsResult,
    "UsageCodeInterpreterSessionsResult": UsageCodeInterpreterSessionsResult,
    "UsageCompletionsResult": UsageCompletionsResult,
    "UsageEmbeddingsResult": UsageEmbeddingsResult,
    "UsageImagesResult": UsageImagesResult,
    "UsageModerationsResult": UsageModerationsResult,
    "UsageResponse": UsageResponse,
    "UsageTimeBucket": UsageTimeBucket,
    "UsageTimeBucketResultInner": UsageTimeBucketResultInner,
    "UsageVectorStoresResult": UsageVectorStoresResult,
    "User": User,
    "UserDeleteResponse": UserDeleteResponse,
    "UserListResponse": UserListResponse,
    "UserRoleUpdateRequest": UserRoleUpdateRequest,
    "VectorStoreExpirationAfter": VectorStoreExpirationAfter,
    "VectorStoreFileBatchObject": VectorStoreFileBatchObject,
    "VectorStoreFileBatchObjectFileCounts": VectorStoreFileBatchObjectFileCounts,
    "VectorStoreFileObject": VectorStoreFileObject,
    "VectorStoreFileObjectChunkingStrategy": VectorStoreFileObjectChunkingStrategy,
    "VectorStoreFileObjectLastError": VectorStoreFileObjectLastError,
    "VectorStoreObject": VectorStoreObject,
    "VectorStoreObjectFileCounts": VectorStoreObjectFileCounts,
}

// Check if a string starts with another string without using es6 features
function startsWith(str: string, match: string): boolean {
    return str.substring(0, match.length) === match;
}

// Check if a string ends with another string without using es6 features
function endsWith(str: string, match: string): boolean {
    return str.length >= match.length && str.substring(str.length - match.length) === match;
}

const nullableSuffix = " | null";
const optionalSuffix = " | undefined";
const arrayPrefix = "Array<";
const arraySuffix = ">";
const mapPrefix = "{ [key: string]: ";
const mapSuffix = "; }";

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string): any {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (endsWith(type, nullableSuffix)) {
            let subType: string = type.slice(0, -nullableSuffix.length); // Type | null => Type
            return ObjectSerializer.serialize(data, subType);
        } else if (endsWith(type, optionalSuffix)) {
            let subType: string = type.slice(0, -optionalSuffix.length); // Type | undefined => Type
            return ObjectSerializer.serialize(data, subType);
        } else if (startsWith(type, arrayPrefix)) {
            let subType: string = type.slice(arrayPrefix.length, -arraySuffix.length); // Array<Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (startsWith(type, mapPrefix)) {
            let subType: string = type.slice(mapPrefix.length, -mapSuffix.length); // { [key: string]: Type; } => Type
            let transformedData: { [key: string]: any } = {};
            for (let key in data) {
                transformedData[key] = ObjectSerializer.serialize(
                    data[key],
                    subType,
                );
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string): any {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (endsWith(type, nullableSuffix)) {
            let subType: string = type.slice(0, -nullableSuffix.length); // Type | null => Type
            return ObjectSerializer.deserialize(data, subType);
        } else if (endsWith(type, optionalSuffix)) {
            let subType: string = type.slice(0, -optionalSuffix.length); // Type | undefined => Type
            return ObjectSerializer.deserialize(data, subType);
        } else if (startsWith(type, arrayPrefix)) {
            let subType: string = type.slice(arrayPrefix.length, -arraySuffix.length); // Array<Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (startsWith(type, mapPrefix)) {
            let subType: string = type.slice(mapPrefix.length, -mapSuffix.length); // { [key: string]: Type; } => Type
            let transformedData: { [key: string]: any } = {};
            for (let key in data) {
                transformedData[key] = ObjectSerializer.deserialize(
                    data[key],
                    subType,
                );
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
