import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions, mergeConfiguration } from '../configuration'
import type { Middleware } from '../middleware';
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { AdminApiKey } from '../models/AdminApiKey';
import { AdminApiKeyOwner } from '../models/AdminApiKeyOwner';
import { AdminApiKeysCreateRequest } from '../models/AdminApiKeysCreateRequest';
import { AdminApiKeysDelete200Response } from '../models/AdminApiKeysDelete200Response';
import { ApiKeyList } from '../models/ApiKeyList';
import { ArrayOfContentPartsInner } from '../models/ArrayOfContentPartsInner';
import { AssistantObject } from '../models/AssistantObject';
import { AssistantObjectToolResources } from '../models/AssistantObjectToolResources';
import { AssistantObjectToolResourcesCodeInterpreter } from '../models/AssistantObjectToolResourcesCodeInterpreter';
import { AssistantObjectToolResourcesFileSearch } from '../models/AssistantObjectToolResourcesFileSearch';
import { AssistantObjectToolsInner } from '../models/AssistantObjectToolsInner';
import { AssistantStreamEvent } from '../models/AssistantStreamEvent';
import { AssistantToolsCode } from '../models/AssistantToolsCode';
import { AssistantToolsFileSearch } from '../models/AssistantToolsFileSearch';
import { AssistantToolsFileSearchFileSearch } from '../models/AssistantToolsFileSearchFileSearch';
import { AssistantToolsFileSearchTypeOnly } from '../models/AssistantToolsFileSearchTypeOnly';
import { AssistantToolsFunction } from '../models/AssistantToolsFunction';
import { AssistantsApiResponseFormatOption } from '../models/AssistantsApiResponseFormatOption';
import { AssistantsApiToolChoiceOption } from '../models/AssistantsApiToolChoiceOption';
import { AssistantsNamedToolChoice } from '../models/AssistantsNamedToolChoice';
import { AssistantsNamedToolChoiceFunction } from '../models/AssistantsNamedToolChoiceFunction';
import { AudioResponseFormat } from '../models/AudioResponseFormat';
import { AuditLog } from '../models/AuditLog';
import { AuditLogActor } from '../models/AuditLogActor';
import { AuditLogActorApiKey } from '../models/AuditLogActorApiKey';
import { AuditLogActorServiceAccount } from '../models/AuditLogActorServiceAccount';
import { AuditLogActorSession } from '../models/AuditLogActorSession';
import { AuditLogActorUser } from '../models/AuditLogActorUser';
import { AuditLogApiKeyCreated } from '../models/AuditLogApiKeyCreated';
import { AuditLogApiKeyCreatedData } from '../models/AuditLogApiKeyCreatedData';
import { AuditLogApiKeyDeleted } from '../models/AuditLogApiKeyDeleted';
import { AuditLogApiKeyUpdated } from '../models/AuditLogApiKeyUpdated';
import { AuditLogApiKeyUpdatedChangesRequested } from '../models/AuditLogApiKeyUpdatedChangesRequested';
import { AuditLogEventType } from '../models/AuditLogEventType';
import { AuditLogInviteAccepted } from '../models/AuditLogInviteAccepted';
import { AuditLogInviteSent } from '../models/AuditLogInviteSent';
import { AuditLogInviteSentData } from '../models/AuditLogInviteSentData';
import { AuditLogLoginFailed } from '../models/AuditLogLoginFailed';
import { AuditLogOrganizationUpdated } from '../models/AuditLogOrganizationUpdated';
import { AuditLogOrganizationUpdatedChangesRequested } from '../models/AuditLogOrganizationUpdatedChangesRequested';
import { AuditLogOrganizationUpdatedChangesRequestedSettings } from '../models/AuditLogOrganizationUpdatedChangesRequestedSettings';
import { AuditLogProject } from '../models/AuditLogProject';
import { AuditLogProjectArchived } from '../models/AuditLogProjectArchived';
import { AuditLogProjectCreated } from '../models/AuditLogProjectCreated';
import { AuditLogProjectCreatedData } from '../models/AuditLogProjectCreatedData';
import { AuditLogProjectUpdated } from '../models/AuditLogProjectUpdated';
import { AuditLogProjectUpdatedChangesRequested } from '../models/AuditLogProjectUpdatedChangesRequested';
import { AuditLogRateLimitDeleted } from '../models/AuditLogRateLimitDeleted';
import { AuditLogRateLimitUpdated } from '../models/AuditLogRateLimitUpdated';
import { AuditLogRateLimitUpdatedChangesRequested } from '../models/AuditLogRateLimitUpdatedChangesRequested';
import { AuditLogServiceAccountCreated } from '../models/AuditLogServiceAccountCreated';
import { AuditLogServiceAccountCreatedData } from '../models/AuditLogServiceAccountCreatedData';
import { AuditLogServiceAccountDeleted } from '../models/AuditLogServiceAccountDeleted';
import { AuditLogServiceAccountUpdated } from '../models/AuditLogServiceAccountUpdated';
import { AuditLogServiceAccountUpdatedChangesRequested } from '../models/AuditLogServiceAccountUpdatedChangesRequested';
import { AuditLogUserAdded } from '../models/AuditLogUserAdded';
import { AuditLogUserAddedData } from '../models/AuditLogUserAddedData';
import { AuditLogUserDeleted } from '../models/AuditLogUserDeleted';
import { AuditLogUserUpdated } from '../models/AuditLogUserUpdated';
import { AuditLogUserUpdatedChangesRequested } from '../models/AuditLogUserUpdatedChangesRequested';
import { AutoChunkingStrategy } from '../models/AutoChunkingStrategy';
import { AutoChunkingStrategyRequestParam } from '../models/AutoChunkingStrategyRequestParam';
import { Batch } from '../models/Batch';
import { BatchErrors } from '../models/BatchErrors';
import { BatchErrorsDataInner } from '../models/BatchErrorsDataInner';
import { BatchRequestCounts } from '../models/BatchRequestCounts';
import { BatchRequestInput } from '../models/BatchRequestInput';
import { BatchRequestOutput } from '../models/BatchRequestOutput';
import { BatchRequestOutputError } from '../models/BatchRequestOutputError';
import { BatchRequestOutputResponse } from '../models/BatchRequestOutputResponse';
import { ChatCompletionFunctionCallOption } from '../models/ChatCompletionFunctionCallOption';
import { ChatCompletionFunctions } from '../models/ChatCompletionFunctions';
import { ChatCompletionMessageToolCall } from '../models/ChatCompletionMessageToolCall';
import { ChatCompletionMessageToolCallChunk } from '../models/ChatCompletionMessageToolCallChunk';
import { ChatCompletionMessageToolCallChunkFunction } from '../models/ChatCompletionMessageToolCallChunkFunction';
import { ChatCompletionMessageToolCallFunction } from '../models/ChatCompletionMessageToolCallFunction';
import { ChatCompletionNamedToolChoice } from '../models/ChatCompletionNamedToolChoice';
import { ChatCompletionRequestAssistantMessage } from '../models/ChatCompletionRequestAssistantMessage';
import { ChatCompletionRequestAssistantMessageAudio } from '../models/ChatCompletionRequestAssistantMessageAudio';
import { ChatCompletionRequestAssistantMessageContent } from '../models/ChatCompletionRequestAssistantMessageContent';
import { ChatCompletionRequestAssistantMessageContentPart } from '../models/ChatCompletionRequestAssistantMessageContentPart';
import { ChatCompletionRequestAssistantMessageFunctionCall } from '../models/ChatCompletionRequestAssistantMessageFunctionCall';
import { ChatCompletionRequestDeveloperMessage } from '../models/ChatCompletionRequestDeveloperMessage';
import { ChatCompletionRequestDeveloperMessageContent } from '../models/ChatCompletionRequestDeveloperMessageContent';
import { ChatCompletionRequestFunctionMessage } from '../models/ChatCompletionRequestFunctionMessage';
import { ChatCompletionRequestMessage } from '../models/ChatCompletionRequestMessage';
import { ChatCompletionRequestMessageContentPartAudio } from '../models/ChatCompletionRequestMessageContentPartAudio';
import { ChatCompletionRequestMessageContentPartAudioInputAudio } from '../models/ChatCompletionRequestMessageContentPartAudioInputAudio';
import { ChatCompletionRequestMessageContentPartImage } from '../models/ChatCompletionRequestMessageContentPartImage';
import { ChatCompletionRequestMessageContentPartImageImageUrl } from '../models/ChatCompletionRequestMessageContentPartImageImageUrl';
import { ChatCompletionRequestMessageContentPartRefusal } from '../models/ChatCompletionRequestMessageContentPartRefusal';
import { ChatCompletionRequestMessageContentPartText } from '../models/ChatCompletionRequestMessageContentPartText';
import { ChatCompletionRequestSystemMessage } from '../models/ChatCompletionRequestSystemMessage';
import { ChatCompletionRequestSystemMessageContent } from '../models/ChatCompletionRequestSystemMessageContent';
import { ChatCompletionRequestToolMessage } from '../models/ChatCompletionRequestToolMessage';
import { ChatCompletionRequestToolMessageContent } from '../models/ChatCompletionRequestToolMessageContent';
import { ChatCompletionRequestUserMessage } from '../models/ChatCompletionRequestUserMessage';
import { ChatCompletionRequestUserMessageContent } from '../models/ChatCompletionRequestUserMessageContent';
import { ChatCompletionRequestUserMessageContentPart } from '../models/ChatCompletionRequestUserMessageContentPart';
import { ChatCompletionResponseMessage } from '../models/ChatCompletionResponseMessage';
import { ChatCompletionResponseMessageAudio } from '../models/ChatCompletionResponseMessageAudio';
import { ChatCompletionResponseMessageFunctionCall } from '../models/ChatCompletionResponseMessageFunctionCall';
import { ChatCompletionRole } from '../models/ChatCompletionRole';
import { ChatCompletionStreamOptions } from '../models/ChatCompletionStreamOptions';
import { ChatCompletionStreamResponseDelta } from '../models/ChatCompletionStreamResponseDelta';
import { ChatCompletionStreamResponseDeltaFunctionCall } from '../models/ChatCompletionStreamResponseDeltaFunctionCall';
import { ChatCompletionTokenLogprob } from '../models/ChatCompletionTokenLogprob';
import { ChatCompletionTokenLogprobTopLogprobsInner } from '../models/ChatCompletionTokenLogprobTopLogprobsInner';
import { ChatCompletionTool } from '../models/ChatCompletionTool';
import { ChatCompletionToolChoiceOption } from '../models/ChatCompletionToolChoiceOption';
import { ChunkingStrategyRequestParam } from '../models/ChunkingStrategyRequestParam';
import { CompleteUploadRequest } from '../models/CompleteUploadRequest';
import { CompletionUsage } from '../models/CompletionUsage';
import { CompletionUsageCompletionTokensDetails } from '../models/CompletionUsageCompletionTokensDetails';
import { CompletionUsagePromptTokensDetails } from '../models/CompletionUsagePromptTokensDetails';
import { CostsResult } from '../models/CostsResult';
import { CostsResultAmount } from '../models/CostsResultAmount';
import { CreateAssistantRequest } from '../models/CreateAssistantRequest';
import { CreateAssistantRequestModel } from '../models/CreateAssistantRequestModel';
import { CreateAssistantRequestToolResources } from '../models/CreateAssistantRequestToolResources';
import { CreateAssistantRequestToolResourcesCodeInterpreter } from '../models/CreateAssistantRequestToolResourcesCodeInterpreter';
import { CreateAssistantRequestToolResourcesFileSearch } from '../models/CreateAssistantRequestToolResourcesFileSearch';
import { CreateAssistantRequestToolResourcesFileSearchVectorStoresInner } from '../models/CreateAssistantRequestToolResourcesFileSearchVectorStoresInner';
import { CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy } from '../models/CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy';
import { CreateBatchRequest } from '../models/CreateBatchRequest';
import { CreateChatCompletionFunctionResponse } from '../models/CreateChatCompletionFunctionResponse';
import { CreateChatCompletionFunctionResponseChoicesInner } from '../models/CreateChatCompletionFunctionResponseChoicesInner';
import { CreateChatCompletionRequest } from '../models/CreateChatCompletionRequest';
import { CreateChatCompletionRequestAudio } from '../models/CreateChatCompletionRequestAudio';
import { CreateChatCompletionRequestFunctionCall } from '../models/CreateChatCompletionRequestFunctionCall';
import { CreateChatCompletionRequestModel } from '../models/CreateChatCompletionRequestModel';
import { CreateChatCompletionRequestResponseFormat } from '../models/CreateChatCompletionRequestResponseFormat';
import { CreateChatCompletionRequestStop } from '../models/CreateChatCompletionRequestStop';
import { CreateChatCompletionResponse } from '../models/CreateChatCompletionResponse';
import { CreateChatCompletionResponseChoicesInner } from '../models/CreateChatCompletionResponseChoicesInner';
import { CreateChatCompletionResponseChoicesInnerLogprobs } from '../models/CreateChatCompletionResponseChoicesInnerLogprobs';
import { CreateChatCompletionStreamResponse } from '../models/CreateChatCompletionStreamResponse';
import { CreateChatCompletionStreamResponseChoicesInner } from '../models/CreateChatCompletionStreamResponseChoicesInner';
import { CreateChatCompletionStreamResponseUsage } from '../models/CreateChatCompletionStreamResponseUsage';
import { CreateCompletionRequest } from '../models/CreateCompletionRequest';
import { CreateCompletionRequestModel } from '../models/CreateCompletionRequestModel';
import { CreateCompletionRequestPrompt } from '../models/CreateCompletionRequestPrompt';
import { CreateCompletionRequestStop } from '../models/CreateCompletionRequestStop';
import { CreateCompletionResponse } from '../models/CreateCompletionResponse';
import { CreateCompletionResponseChoicesInner } from '../models/CreateCompletionResponseChoicesInner';
import { CreateCompletionResponseChoicesInnerLogprobs } from '../models/CreateCompletionResponseChoicesInnerLogprobs';
import { CreateEmbeddingRequest } from '../models/CreateEmbeddingRequest';
import { CreateEmbeddingRequestInput } from '../models/CreateEmbeddingRequestInput';
import { CreateEmbeddingRequestModel } from '../models/CreateEmbeddingRequestModel';
import { CreateEmbeddingResponse } from '../models/CreateEmbeddingResponse';
import { CreateEmbeddingResponseUsage } from '../models/CreateEmbeddingResponseUsage';
import { CreateFineTuningJobRequest } from '../models/CreateFineTuningJobRequest';
import { CreateFineTuningJobRequestHyperparameters } from '../models/CreateFineTuningJobRequestHyperparameters';
import { CreateFineTuningJobRequestHyperparametersBatchSize } from '../models/CreateFineTuningJobRequestHyperparametersBatchSize';
import { CreateFineTuningJobRequestHyperparametersLearningRateMultiplier } from '../models/CreateFineTuningJobRequestHyperparametersLearningRateMultiplier';
import { CreateFineTuningJobRequestHyperparametersNEpochs } from '../models/CreateFineTuningJobRequestHyperparametersNEpochs';
import { CreateFineTuningJobRequestIntegrationsInner } from '../models/CreateFineTuningJobRequestIntegrationsInner';
import { CreateFineTuningJobRequestIntegrationsInnerWandb } from '../models/CreateFineTuningJobRequestIntegrationsInnerWandb';
import { CreateFineTuningJobRequestModel } from '../models/CreateFineTuningJobRequestModel';
import { CreateImageEditRequestModel } from '../models/CreateImageEditRequestModel';
import { CreateImageRequest } from '../models/CreateImageRequest';
import { CreateImageRequestModel } from '../models/CreateImageRequestModel';
import { CreateMessageRequest } from '../models/CreateMessageRequest';
import { CreateMessageRequestAttachmentsInner } from '../models/CreateMessageRequestAttachmentsInner';
import { CreateMessageRequestAttachmentsInnerToolsInner } from '../models/CreateMessageRequestAttachmentsInnerToolsInner';
import { CreateMessageRequestContent } from '../models/CreateMessageRequestContent';
import { CreateModerationRequest } from '../models/CreateModerationRequest';
import { CreateModerationRequestInput } from '../models/CreateModerationRequestInput';
import { CreateModerationRequestInputOneOfInner } from '../models/CreateModerationRequestInputOneOfInner';
import { CreateModerationRequestInputOneOfInnerOneOf } from '../models/CreateModerationRequestInputOneOfInnerOneOf';
import { CreateModerationRequestInputOneOfInnerOneOf1 } from '../models/CreateModerationRequestInputOneOfInnerOneOf1';
import { CreateModerationRequestInputOneOfInnerOneOfImageUrl } from '../models/CreateModerationRequestInputOneOfInnerOneOfImageUrl';
import { CreateModerationRequestModel } from '../models/CreateModerationRequestModel';
import { CreateModerationResponse } from '../models/CreateModerationResponse';
import { CreateModerationResponseResultsInner } from '../models/CreateModerationResponseResultsInner';
import { CreateModerationResponseResultsInnerCategories } from '../models/CreateModerationResponseResultsInnerCategories';
import { CreateModerationResponseResultsInnerCategoryAppliedInputTypes } from '../models/CreateModerationResponseResultsInnerCategoryAppliedInputTypes';
import { CreateModerationResponseResultsInnerCategoryScores } from '../models/CreateModerationResponseResultsInnerCategoryScores';
import { CreateRunRequest } from '../models/CreateRunRequest';
import { CreateRunRequestModel } from '../models/CreateRunRequestModel';
import { CreateSpeechRequest } from '../models/CreateSpeechRequest';
import { CreateSpeechRequestModel } from '../models/CreateSpeechRequestModel';
import { CreateThreadAndRunRequest } from '../models/CreateThreadAndRunRequest';
import { CreateThreadAndRunRequestToolResources } from '../models/CreateThreadAndRunRequestToolResources';
import { CreateThreadAndRunRequestToolsInner } from '../models/CreateThreadAndRunRequestToolsInner';
import { CreateThreadRequest } from '../models/CreateThreadRequest';
import { CreateThreadRequestToolResources } from '../models/CreateThreadRequestToolResources';
import { CreateThreadRequestToolResourcesFileSearch } from '../models/CreateThreadRequestToolResourcesFileSearch';
import { CreateThreadRequestToolResourcesFileSearchVectorStoresInner } from '../models/CreateThreadRequestToolResourcesFileSearchVectorStoresInner';
import { CreateTranscription200Response } from '../models/CreateTranscription200Response';
import { CreateTranscriptionRequestModel } from '../models/CreateTranscriptionRequestModel';
import { CreateTranscriptionResponseJson } from '../models/CreateTranscriptionResponseJson';
import { CreateTranscriptionResponseVerboseJson } from '../models/CreateTranscriptionResponseVerboseJson';
import { CreateTranslation200Response } from '../models/CreateTranslation200Response';
import { CreateTranslationResponseJson } from '../models/CreateTranslationResponseJson';
import { CreateTranslationResponseVerboseJson } from '../models/CreateTranslationResponseVerboseJson';
import { CreateUploadRequest } from '../models/CreateUploadRequest';
import { CreateVectorStoreFileBatchRequest } from '../models/CreateVectorStoreFileBatchRequest';
import { CreateVectorStoreFileRequest } from '../models/CreateVectorStoreFileRequest';
import { CreateVectorStoreRequest } from '../models/CreateVectorStoreRequest';
import { CreateVectorStoreRequestChunkingStrategy } from '../models/CreateVectorStoreRequestChunkingStrategy';
import { DefaultProjectErrorResponse } from '../models/DefaultProjectErrorResponse';
import { DeleteAssistantResponse } from '../models/DeleteAssistantResponse';
import { DeleteFileResponse } from '../models/DeleteFileResponse';
import { DeleteMessageResponse } from '../models/DeleteMessageResponse';
import { DeleteModelResponse } from '../models/DeleteModelResponse';
import { DeleteThreadResponse } from '../models/DeleteThreadResponse';
import { DeleteVectorStoreFileResponse } from '../models/DeleteVectorStoreFileResponse';
import { DeleteVectorStoreResponse } from '../models/DeleteVectorStoreResponse';
import { DoneEvent } from '../models/DoneEvent';
import { Embedding } from '../models/Embedding';
import { ErrorEvent } from '../models/ErrorEvent';
import { ErrorResponse } from '../models/ErrorResponse';
import { FileSearchRankingOptions } from '../models/FileSearchRankingOptions';
import { FineTuneChatCompletionRequestAssistantMessage } from '../models/FineTuneChatCompletionRequestAssistantMessage';
import { FineTuneChatRequestInput } from '../models/FineTuneChatRequestInput';
import { FineTuneChatRequestInputMessagesInner } from '../models/FineTuneChatRequestInputMessagesInner';
import { FineTuneCompletionRequestInput } from '../models/FineTuneCompletionRequestInput';
import { FineTuneDPOMethod } from '../models/FineTuneDPOMethod';
import { FineTuneDPOMethodHyperparameters } from '../models/FineTuneDPOMethodHyperparameters';
import { FineTuneDPOMethodHyperparametersBatchSize } from '../models/FineTuneDPOMethodHyperparametersBatchSize';
import { FineTuneDPOMethodHyperparametersBeta } from '../models/FineTuneDPOMethodHyperparametersBeta';
import { FineTuneDPOMethodHyperparametersLearningRateMultiplier } from '../models/FineTuneDPOMethodHyperparametersLearningRateMultiplier';
import { FineTuneDPOMethodHyperparametersNEpochs } from '../models/FineTuneDPOMethodHyperparametersNEpochs';
import { FineTuneMethod } from '../models/FineTuneMethod';
import { FineTunePreferenceRequestInput } from '../models/FineTunePreferenceRequestInput';
import { FineTunePreferenceRequestInputInput } from '../models/FineTunePreferenceRequestInputInput';
import { FineTunePreferenceRequestInputPreferredCompletionInner } from '../models/FineTunePreferenceRequestInputPreferredCompletionInner';
import { FineTuneSupervisedMethod } from '../models/FineTuneSupervisedMethod';
import { FineTuneSupervisedMethodHyperparameters } from '../models/FineTuneSupervisedMethodHyperparameters';
import { FineTuningIntegration } from '../models/FineTuningIntegration';
import { FineTuningJob } from '../models/FineTuningJob';
import { FineTuningJobCheckpoint } from '../models/FineTuningJobCheckpoint';
import { FineTuningJobCheckpointMetrics } from '../models/FineTuningJobCheckpointMetrics';
import { FineTuningJobError } from '../models/FineTuningJobError';
import { FineTuningJobEvent } from '../models/FineTuningJobEvent';
import { FineTuningJobHyperparameters } from '../models/FineTuningJobHyperparameters';
import { FineTuningJobIntegrationsInner } from '../models/FineTuningJobIntegrationsInner';
import { FunctionObject } from '../models/FunctionObject';
import { Image } from '../models/Image';
import { ImagesResponse } from '../models/ImagesResponse';
import { Invite } from '../models/Invite';
import { InviteDeleteResponse } from '../models/InviteDeleteResponse';
import { InviteListResponse } from '../models/InviteListResponse';
import { InviteProjectsInner } from '../models/InviteProjectsInner';
import { InviteRequest } from '../models/InviteRequest';
import { InviteRequestProjectsInner } from '../models/InviteRequestProjectsInner';
import { ListAssistantsResponse } from '../models/ListAssistantsResponse';
import { ListAuditLogsEffectiveAtParameter } from '../models/ListAuditLogsEffectiveAtParameter';
import { ListAuditLogsResponse } from '../models/ListAuditLogsResponse';
import { ListBatchesResponse } from '../models/ListBatchesResponse';
import { ListFilesResponse } from '../models/ListFilesResponse';
import { ListFineTuningJobCheckpointsResponse } from '../models/ListFineTuningJobCheckpointsResponse';
import { ListFineTuningJobEventsResponse } from '../models/ListFineTuningJobEventsResponse';
import { ListMessagesResponse } from '../models/ListMessagesResponse';
import { ListModelsResponse } from '../models/ListModelsResponse';
import { ListPaginatedFineTuningJobsResponse } from '../models/ListPaginatedFineTuningJobsResponse';
import { ListRunStepsResponse } from '../models/ListRunStepsResponse';
import { ListRunsResponse } from '../models/ListRunsResponse';
import { ListThreadsResponse } from '../models/ListThreadsResponse';
import { ListVectorStoreFilesResponse } from '../models/ListVectorStoreFilesResponse';
import { ListVectorStoresResponse } from '../models/ListVectorStoresResponse';
import { MessageContentImageFileObject } from '../models/MessageContentImageFileObject';
import { MessageContentImageFileObjectImageFile } from '../models/MessageContentImageFileObjectImageFile';
import { MessageContentImageUrlObject } from '../models/MessageContentImageUrlObject';
import { MessageContentImageUrlObjectImageUrl } from '../models/MessageContentImageUrlObjectImageUrl';
import { MessageContentRefusalObject } from '../models/MessageContentRefusalObject';
import { MessageContentTextAnnotationsFileCitationObject } from '../models/MessageContentTextAnnotationsFileCitationObject';
import { MessageContentTextAnnotationsFileCitationObjectFileCitation } from '../models/MessageContentTextAnnotationsFileCitationObjectFileCitation';
import { MessageContentTextAnnotationsFilePathObject } from '../models/MessageContentTextAnnotationsFilePathObject';
import { MessageContentTextAnnotationsFilePathObjectFilePath } from '../models/MessageContentTextAnnotationsFilePathObjectFilePath';
import { MessageContentTextObject } from '../models/MessageContentTextObject';
import { MessageContentTextObjectText } from '../models/MessageContentTextObjectText';
import { MessageContentTextObjectTextAnnotationsInner } from '../models/MessageContentTextObjectTextAnnotationsInner';
import { MessageDeltaContentImageFileObject } from '../models/MessageDeltaContentImageFileObject';
import { MessageDeltaContentImageFileObjectImageFile } from '../models/MessageDeltaContentImageFileObjectImageFile';
import { MessageDeltaContentImageUrlObject } from '../models/MessageDeltaContentImageUrlObject';
import { MessageDeltaContentImageUrlObjectImageUrl } from '../models/MessageDeltaContentImageUrlObjectImageUrl';
import { MessageDeltaContentRefusalObject } from '../models/MessageDeltaContentRefusalObject';
import { MessageDeltaContentTextAnnotationsFileCitationObject } from '../models/MessageDeltaContentTextAnnotationsFileCitationObject';
import { MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation } from '../models/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation';
import { MessageDeltaContentTextAnnotationsFilePathObject } from '../models/MessageDeltaContentTextAnnotationsFilePathObject';
import { MessageDeltaContentTextAnnotationsFilePathObjectFilePath } from '../models/MessageDeltaContentTextAnnotationsFilePathObjectFilePath';
import { MessageDeltaContentTextObject } from '../models/MessageDeltaContentTextObject';
import { MessageDeltaContentTextObjectText } from '../models/MessageDeltaContentTextObjectText';
import { MessageDeltaContentTextObjectTextAnnotationsInner } from '../models/MessageDeltaContentTextObjectTextAnnotationsInner';
import { MessageDeltaObject } from '../models/MessageDeltaObject';
import { MessageDeltaObjectDelta } from '../models/MessageDeltaObjectDelta';
import { MessageDeltaObjectDeltaContentInner } from '../models/MessageDeltaObjectDeltaContentInner';
import { MessageObject } from '../models/MessageObject';
import { MessageObjectContentInner } from '../models/MessageObjectContentInner';
import { MessageObjectIncompleteDetails } from '../models/MessageObjectIncompleteDetails';
import { MessageRequestContentTextObject } from '../models/MessageRequestContentTextObject';
import { MessageStreamEvent } from '../models/MessageStreamEvent';
import { MessageStreamEventOneOf } from '../models/MessageStreamEventOneOf';
import { MessageStreamEventOneOf1 } from '../models/MessageStreamEventOneOf1';
import { MessageStreamEventOneOf2 } from '../models/MessageStreamEventOneOf2';
import { MessageStreamEventOneOf3 } from '../models/MessageStreamEventOneOf3';
import { MessageStreamEventOneOf4 } from '../models/MessageStreamEventOneOf4';
import { Model } from '../models/Model';
import { ModelError } from '../models/ModelError';
import { ModifyAssistantRequest } from '../models/ModifyAssistantRequest';
import { ModifyAssistantRequestToolResources } from '../models/ModifyAssistantRequestToolResources';
import { ModifyAssistantRequestToolResourcesCodeInterpreter } from '../models/ModifyAssistantRequestToolResourcesCodeInterpreter';
import { ModifyAssistantRequestToolResourcesFileSearch } from '../models/ModifyAssistantRequestToolResourcesFileSearch';
import { ModifyMessageRequest } from '../models/ModifyMessageRequest';
import { ModifyRunRequest } from '../models/ModifyRunRequest';
import { ModifyThreadRequest } from '../models/ModifyThreadRequest';
import { ModifyThreadRequestToolResources } from '../models/ModifyThreadRequestToolResources';
import { ModifyThreadRequestToolResourcesFileSearch } from '../models/ModifyThreadRequestToolResourcesFileSearch';
import { OpenAIFile } from '../models/OpenAIFile';
import { OtherChunkingStrategyResponseParam } from '../models/OtherChunkingStrategyResponseParam';
import { PredictionContent } from '../models/PredictionContent';
import { PredictionContentContent } from '../models/PredictionContentContent';
import { Project } from '../models/Project';
import { ProjectApiKey } from '../models/ProjectApiKey';
import { ProjectApiKeyDeleteResponse } from '../models/ProjectApiKeyDeleteResponse';
import { ProjectApiKeyListResponse } from '../models/ProjectApiKeyListResponse';
import { ProjectApiKeyOwner } from '../models/ProjectApiKeyOwner';
import { ProjectCreateRequest } from '../models/ProjectCreateRequest';
import { ProjectListResponse } from '../models/ProjectListResponse';
import { ProjectRateLimit } from '../models/ProjectRateLimit';
import { ProjectRateLimitListResponse } from '../models/ProjectRateLimitListResponse';
import { ProjectRateLimitUpdateRequest } from '../models/ProjectRateLimitUpdateRequest';
import { ProjectServiceAccount } from '../models/ProjectServiceAccount';
import { ProjectServiceAccountApiKey } from '../models/ProjectServiceAccountApiKey';
import { ProjectServiceAccountCreateRequest } from '../models/ProjectServiceAccountCreateRequest';
import { ProjectServiceAccountCreateResponse } from '../models/ProjectServiceAccountCreateResponse';
import { ProjectServiceAccountDeleteResponse } from '../models/ProjectServiceAccountDeleteResponse';
import { ProjectServiceAccountListResponse } from '../models/ProjectServiceAccountListResponse';
import { ProjectUpdateRequest } from '../models/ProjectUpdateRequest';
import { ProjectUser } from '../models/ProjectUser';
import { ProjectUserCreateRequest } from '../models/ProjectUserCreateRequest';
import { ProjectUserDeleteResponse } from '../models/ProjectUserDeleteResponse';
import { ProjectUserListResponse } from '../models/ProjectUserListResponse';
import { ProjectUserUpdateRequest } from '../models/ProjectUserUpdateRequest';
import { RealtimeClientEventConversationItemCreate } from '../models/RealtimeClientEventConversationItemCreate';
import { RealtimeClientEventConversationItemDelete } from '../models/RealtimeClientEventConversationItemDelete';
import { RealtimeClientEventConversationItemTruncate } from '../models/RealtimeClientEventConversationItemTruncate';
import { RealtimeClientEventInputAudioBufferAppend } from '../models/RealtimeClientEventInputAudioBufferAppend';
import { RealtimeClientEventInputAudioBufferClear } from '../models/RealtimeClientEventInputAudioBufferClear';
import { RealtimeClientEventInputAudioBufferCommit } from '../models/RealtimeClientEventInputAudioBufferCommit';
import { RealtimeClientEventResponseCancel } from '../models/RealtimeClientEventResponseCancel';
import { RealtimeClientEventResponseCreate } from '../models/RealtimeClientEventResponseCreate';
import { RealtimeClientEventSessionUpdate } from '../models/RealtimeClientEventSessionUpdate';
import { RealtimeConversationItem } from '../models/RealtimeConversationItem';
import { RealtimeConversationItemContentInner } from '../models/RealtimeConversationItemContentInner';
import { RealtimeResponse } from '../models/RealtimeResponse';
import { RealtimeResponseCreateParams } from '../models/RealtimeResponseCreateParams';
import { RealtimeResponseCreateParamsConversation } from '../models/RealtimeResponseCreateParamsConversation';
import { RealtimeResponseCreateParamsMaxResponseOutputTokens } from '../models/RealtimeResponseCreateParamsMaxResponseOutputTokens';
import { RealtimeResponseCreateParamsToolsInner } from '../models/RealtimeResponseCreateParamsToolsInner';
import { RealtimeResponseStatusDetails } from '../models/RealtimeResponseStatusDetails';
import { RealtimeResponseStatusDetailsError } from '../models/RealtimeResponseStatusDetailsError';
import { RealtimeResponseUsage } from '../models/RealtimeResponseUsage';
import { RealtimeResponseUsageInputTokenDetails } from '../models/RealtimeResponseUsageInputTokenDetails';
import { RealtimeResponseUsageOutputTokenDetails } from '../models/RealtimeResponseUsageOutputTokenDetails';
import { RealtimeServerEventConversationCreated } from '../models/RealtimeServerEventConversationCreated';
import { RealtimeServerEventConversationCreatedConversation } from '../models/RealtimeServerEventConversationCreatedConversation';
import { RealtimeServerEventConversationItemCreated } from '../models/RealtimeServerEventConversationItemCreated';
import { RealtimeServerEventConversationItemDeleted } from '../models/RealtimeServerEventConversationItemDeleted';
import { RealtimeServerEventConversationItemInputAudioTranscriptionCompleted } from '../models/RealtimeServerEventConversationItemInputAudioTranscriptionCompleted';
import { RealtimeServerEventConversationItemInputAudioTranscriptionFailed } from '../models/RealtimeServerEventConversationItemInputAudioTranscriptionFailed';
import { RealtimeServerEventConversationItemInputAudioTranscriptionFailedError } from '../models/RealtimeServerEventConversationItemInputAudioTranscriptionFailedError';
import { RealtimeServerEventConversationItemTruncated } from '../models/RealtimeServerEventConversationItemTruncated';
import { RealtimeServerEventError } from '../models/RealtimeServerEventError';
import { RealtimeServerEventErrorError } from '../models/RealtimeServerEventErrorError';
import { RealtimeServerEventInputAudioBufferCleared } from '../models/RealtimeServerEventInputAudioBufferCleared';
import { RealtimeServerEventInputAudioBufferCommitted } from '../models/RealtimeServerEventInputAudioBufferCommitted';
import { RealtimeServerEventInputAudioBufferSpeechStarted } from '../models/RealtimeServerEventInputAudioBufferSpeechStarted';
import { RealtimeServerEventInputAudioBufferSpeechStopped } from '../models/RealtimeServerEventInputAudioBufferSpeechStopped';
import { RealtimeServerEventRateLimitsUpdated } from '../models/RealtimeServerEventRateLimitsUpdated';
import { RealtimeServerEventRateLimitsUpdatedRateLimitsInner } from '../models/RealtimeServerEventRateLimitsUpdatedRateLimitsInner';
import { RealtimeServerEventResponseAudioDelta } from '../models/RealtimeServerEventResponseAudioDelta';
import { RealtimeServerEventResponseAudioDone } from '../models/RealtimeServerEventResponseAudioDone';
import { RealtimeServerEventResponseAudioTranscriptDelta } from '../models/RealtimeServerEventResponseAudioTranscriptDelta';
import { RealtimeServerEventResponseAudioTranscriptDone } from '../models/RealtimeServerEventResponseAudioTranscriptDone';
import { RealtimeServerEventResponseContentPartAdded } from '../models/RealtimeServerEventResponseContentPartAdded';
import { RealtimeServerEventResponseContentPartAddedPart } from '../models/RealtimeServerEventResponseContentPartAddedPart';
import { RealtimeServerEventResponseContentPartDone } from '../models/RealtimeServerEventResponseContentPartDone';
import { RealtimeServerEventResponseContentPartDonePart } from '../models/RealtimeServerEventResponseContentPartDonePart';
import { RealtimeServerEventResponseCreated } from '../models/RealtimeServerEventResponseCreated';
import { RealtimeServerEventResponseDone } from '../models/RealtimeServerEventResponseDone';
import { RealtimeServerEventResponseFunctionCallArgumentsDelta } from '../models/RealtimeServerEventResponseFunctionCallArgumentsDelta';
import { RealtimeServerEventResponseFunctionCallArgumentsDone } from '../models/RealtimeServerEventResponseFunctionCallArgumentsDone';
import { RealtimeServerEventResponseOutputItemAdded } from '../models/RealtimeServerEventResponseOutputItemAdded';
import { RealtimeServerEventResponseOutputItemDone } from '../models/RealtimeServerEventResponseOutputItemDone';
import { RealtimeServerEventResponseTextDelta } from '../models/RealtimeServerEventResponseTextDelta';
import { RealtimeServerEventResponseTextDone } from '../models/RealtimeServerEventResponseTextDone';
import { RealtimeServerEventSessionCreated } from '../models/RealtimeServerEventSessionCreated';
import { RealtimeServerEventSessionUpdated } from '../models/RealtimeServerEventSessionUpdated';
import { RealtimeSession } from '../models/RealtimeSession';
import { RealtimeSessionCreateRequest } from '../models/RealtimeSessionCreateRequest';
import { RealtimeSessionCreateRequestTurnDetection } from '../models/RealtimeSessionCreateRequestTurnDetection';
import { RealtimeSessionCreateResponse } from '../models/RealtimeSessionCreateResponse';
import { RealtimeSessionCreateResponseClientSecret } from '../models/RealtimeSessionCreateResponseClientSecret';
import { RealtimeSessionCreateResponseTurnDetection } from '../models/RealtimeSessionCreateResponseTurnDetection';
import { RealtimeSessionInputAudioTranscription } from '../models/RealtimeSessionInputAudioTranscription';
import { RealtimeSessionModel } from '../models/RealtimeSessionModel';
import { RealtimeSessionTurnDetection } from '../models/RealtimeSessionTurnDetection';
import { ResponseFormatJsonObject } from '../models/ResponseFormatJsonObject';
import { ResponseFormatJsonSchema } from '../models/ResponseFormatJsonSchema';
import { ResponseFormatJsonSchemaJsonSchema } from '../models/ResponseFormatJsonSchemaJsonSchema';
import { ResponseFormatText } from '../models/ResponseFormatText';
import { RunCompletionUsage } from '../models/RunCompletionUsage';
import { RunObject } from '../models/RunObject';
import { RunObjectIncompleteDetails } from '../models/RunObjectIncompleteDetails';
import { RunObjectLastError } from '../models/RunObjectLastError';
import { RunObjectRequiredAction } from '../models/RunObjectRequiredAction';
import { RunObjectRequiredActionSubmitToolOutputs } from '../models/RunObjectRequiredActionSubmitToolOutputs';
import { RunStepCompletionUsage } from '../models/RunStepCompletionUsage';
import { RunStepDeltaObject } from '../models/RunStepDeltaObject';
import { RunStepDeltaObjectDelta } from '../models/RunStepDeltaObjectDelta';
import { RunStepDeltaObjectDeltaStepDetails } from '../models/RunStepDeltaObjectDeltaStepDetails';
import { RunStepDeltaStepDetailsMessageCreationObject } from '../models/RunStepDeltaStepDetailsMessageCreationObject';
import { RunStepDeltaStepDetailsMessageCreationObjectMessageCreation } from '../models/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation';
import { RunStepDeltaStepDetailsToolCallsCodeObject } from '../models/RunStepDeltaStepDetailsToolCallsCodeObject';
import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter } from '../models/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter';
import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner } from '../models/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
import { RunStepDeltaStepDetailsToolCallsCodeOutputImageObject } from '../models/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject';
import { RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage } from '../models/RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage';
import { RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject } from '../models/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject';
import { RunStepDeltaStepDetailsToolCallsFileSearchObject } from '../models/RunStepDeltaStepDetailsToolCallsFileSearchObject';
import { RunStepDeltaStepDetailsToolCallsFunctionObject } from '../models/RunStepDeltaStepDetailsToolCallsFunctionObject';
import { RunStepDeltaStepDetailsToolCallsFunctionObjectFunction } from '../models/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction';
import { RunStepDeltaStepDetailsToolCallsObject } from '../models/RunStepDeltaStepDetailsToolCallsObject';
import { RunStepDeltaStepDetailsToolCallsObjectToolCallsInner } from '../models/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner';
import { RunStepDetailsMessageCreationObject } from '../models/RunStepDetailsMessageCreationObject';
import { RunStepDetailsMessageCreationObjectMessageCreation } from '../models/RunStepDetailsMessageCreationObjectMessageCreation';
import { RunStepDetailsToolCallsCodeObject } from '../models/RunStepDetailsToolCallsCodeObject';
import { RunStepDetailsToolCallsCodeObjectCodeInterpreter } from '../models/RunStepDetailsToolCallsCodeObjectCodeInterpreter';
import { RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner } from '../models/RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
import { RunStepDetailsToolCallsCodeOutputImageObject } from '../models/RunStepDetailsToolCallsCodeOutputImageObject';
import { RunStepDetailsToolCallsCodeOutputImageObjectImage } from '../models/RunStepDetailsToolCallsCodeOutputImageObjectImage';
import { RunStepDetailsToolCallsCodeOutputLogsObject } from '../models/RunStepDetailsToolCallsCodeOutputLogsObject';
import { RunStepDetailsToolCallsFileSearchObject } from '../models/RunStepDetailsToolCallsFileSearchObject';
import { RunStepDetailsToolCallsFileSearchObjectFileSearch } from '../models/RunStepDetailsToolCallsFileSearchObjectFileSearch';
import { RunStepDetailsToolCallsFileSearchRankingOptionsObject } from '../models/RunStepDetailsToolCallsFileSearchRankingOptionsObject';
import { RunStepDetailsToolCallsFileSearchResultObject } from '../models/RunStepDetailsToolCallsFileSearchResultObject';
import { RunStepDetailsToolCallsFileSearchResultObjectContentInner } from '../models/RunStepDetailsToolCallsFileSearchResultObjectContentInner';
import { RunStepDetailsToolCallsFunctionObject } from '../models/RunStepDetailsToolCallsFunctionObject';
import { RunStepDetailsToolCallsFunctionObjectFunction } from '../models/RunStepDetailsToolCallsFunctionObjectFunction';
import { RunStepDetailsToolCallsObject } from '../models/RunStepDetailsToolCallsObject';
import { RunStepDetailsToolCallsObjectToolCallsInner } from '../models/RunStepDetailsToolCallsObjectToolCallsInner';
import { RunStepObject } from '../models/RunStepObject';
import { RunStepObjectLastError } from '../models/RunStepObjectLastError';
import { RunStepObjectStepDetails } from '../models/RunStepObjectStepDetails';
import { RunStepStreamEvent } from '../models/RunStepStreamEvent';
import { RunStepStreamEventOneOf } from '../models/RunStepStreamEventOneOf';
import { RunStepStreamEventOneOf1 } from '../models/RunStepStreamEventOneOf1';
import { RunStepStreamEventOneOf2 } from '../models/RunStepStreamEventOneOf2';
import { RunStepStreamEventOneOf3 } from '../models/RunStepStreamEventOneOf3';
import { RunStepStreamEventOneOf4 } from '../models/RunStepStreamEventOneOf4';
import { RunStepStreamEventOneOf5 } from '../models/RunStepStreamEventOneOf5';
import { RunStepStreamEventOneOf6 } from '../models/RunStepStreamEventOneOf6';
import { RunStreamEvent } from '../models/RunStreamEvent';
import { RunStreamEventOneOf } from '../models/RunStreamEventOneOf';
import { RunStreamEventOneOf1 } from '../models/RunStreamEventOneOf1';
import { RunStreamEventOneOf2 } from '../models/RunStreamEventOneOf2';
import { RunStreamEventOneOf3 } from '../models/RunStreamEventOneOf3';
import { RunStreamEventOneOf4 } from '../models/RunStreamEventOneOf4';
import { RunStreamEventOneOf5 } from '../models/RunStreamEventOneOf5';
import { RunStreamEventOneOf6 } from '../models/RunStreamEventOneOf6';
import { RunStreamEventOneOf7 } from '../models/RunStreamEventOneOf7';
import { RunStreamEventOneOf8 } from '../models/RunStreamEventOneOf8';
import { RunStreamEventOneOf9 } from '../models/RunStreamEventOneOf9';
import { RunToolCallObject } from '../models/RunToolCallObject';
import { RunToolCallObjectFunction } from '../models/RunToolCallObjectFunction';
import { StaticChunkingStrategy } from '../models/StaticChunkingStrategy';
import { StaticChunkingStrategyRequestParam } from '../models/StaticChunkingStrategyRequestParam';
import { StaticChunkingStrategyResponseParam } from '../models/StaticChunkingStrategyResponseParam';
import { StaticChunkingStrategyStatic } from '../models/StaticChunkingStrategyStatic';
import { SubmitToolOutputsRunRequest } from '../models/SubmitToolOutputsRunRequest';
import { SubmitToolOutputsRunRequestToolOutputsInner } from '../models/SubmitToolOutputsRunRequestToolOutputsInner';
import { ThreadObject } from '../models/ThreadObject';
import { ThreadStreamEvent } from '../models/ThreadStreamEvent';
import { TranscriptionSegment } from '../models/TranscriptionSegment';
import { TranscriptionWord } from '../models/TranscriptionWord';
import { TruncationObject } from '../models/TruncationObject';
import { UpdateVectorStoreRequest } from '../models/UpdateVectorStoreRequest';
import { Upload } from '../models/Upload';
import { UploadPart } from '../models/UploadPart';
import { UsageAudioSpeechesResult } from '../models/UsageAudioSpeechesResult';
import { UsageAudioTranscriptionsResult } from '../models/UsageAudioTranscriptionsResult';
import { UsageCodeInterpreterSessionsResult } from '../models/UsageCodeInterpreterSessionsResult';
import { UsageCompletionsResult } from '../models/UsageCompletionsResult';
import { UsageEmbeddingsResult } from '../models/UsageEmbeddingsResult';
import { UsageImagesResult } from '../models/UsageImagesResult';
import { UsageModerationsResult } from '../models/UsageModerationsResult';
import { UsageResponse } from '../models/UsageResponse';
import { UsageTimeBucket } from '../models/UsageTimeBucket';
import { UsageTimeBucketResultInner } from '../models/UsageTimeBucketResultInner';
import { UsageVectorStoresResult } from '../models/UsageVectorStoresResult';
import { User } from '../models/User';
import { UserDeleteResponse } from '../models/UserDeleteResponse';
import { UserListResponse } from '../models/UserListResponse';
import { UserRoleUpdateRequest } from '../models/UserRoleUpdateRequest';
import { VectorStoreExpirationAfter } from '../models/VectorStoreExpirationAfter';
import { VectorStoreFileBatchObject } from '../models/VectorStoreFileBatchObject';
import { VectorStoreFileBatchObjectFileCounts } from '../models/VectorStoreFileBatchObjectFileCounts';
import { VectorStoreFileObject } from '../models/VectorStoreFileObject';
import { VectorStoreFileObjectChunkingStrategy } from '../models/VectorStoreFileObjectChunkingStrategy';
import { VectorStoreFileObjectLastError } from '../models/VectorStoreFileObjectLastError';
import { VectorStoreObject } from '../models/VectorStoreObject';
import { VectorStoreObjectFileCounts } from '../models/VectorStoreObjectFileCounts';

import { AssistantsApiRequestFactory, AssistantsApiResponseProcessor} from "../apis/AssistantsApi";
export class ObservableAssistantsApi {
    private requestFactory: AssistantsApiRequestFactory;
    private responseProcessor: AssistantsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AssistantsApiRequestFactory,
        responseProcessor?: AssistantsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AssistantsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AssistantsApiResponseProcessor();
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param threadId The ID of the thread to which this run belongs.
     * @param runId The ID of the run to cancel.
     */
    public cancelRunWithHttpInfo(threadId: string, runId: string, _options?: ConfigurationOptions): Observable<HttpInfo<RunObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.cancelRun(threadId, runId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.cancelRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param threadId The ID of the thread to which this run belongs.
     * @param runId The ID of the run to cancel.
     */
    public cancelRun(threadId: string, runId: string, _options?: ConfigurationOptions): Observable<RunObject> {
        return this.cancelRunWithHttpInfo(threadId, runId, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

    /**
     * Create an assistant with a model and instructions.
     * @param createAssistantRequest
     */
    public createAssistantWithHttpInfo(createAssistantRequest: CreateAssistantRequest, _options?: ConfigurationOptions): Observable<HttpInfo<AssistantObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createAssistant(createAssistantRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createAssistantWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create an assistant with a model and instructions.
     * @param createAssistantRequest
     */
    public createAssistant(createAssistantRequest: CreateAssistantRequest, _options?: ConfigurationOptions): Observable<AssistantObject> {
        return this.createAssistantWithHttpInfo(createAssistantRequest, _options).pipe(map((apiResponse: HttpInfo<AssistantObject>) => apiResponse.data));
    }

    /**
     * Create a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * @param createMessageRequest
     */
    public createMessageWithHttpInfo(threadId: string, createMessageRequest: CreateMessageRequest, _options?: ConfigurationOptions): Observable<HttpInfo<MessageObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createMessage(threadId, createMessageRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createMessageWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * @param createMessageRequest
     */
    public createMessage(threadId: string, createMessageRequest: CreateMessageRequest, _options?: ConfigurationOptions): Observable<MessageObject> {
        return this.createMessageWithHttpInfo(threadId, createMessageRequest, _options).pipe(map((apiResponse: HttpInfo<MessageObject>) => apiResponse.data));
    }

    /**
     * Create a run.
     * @param threadId The ID of the thread to run.
     * @param createRunRequest
     * @param [include] A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     */
    public createRunWithHttpInfo(threadId: string, createRunRequest: CreateRunRequest, include?: Array<'step_details.tool_calls[*].file_search.results[*].content'>, _options?: ConfigurationOptions): Observable<HttpInfo<RunObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createRun(threadId, createRunRequest, include, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a run.
     * @param threadId The ID of the thread to run.
     * @param createRunRequest
     * @param [include] A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     */
    public createRun(threadId: string, createRunRequest: CreateRunRequest, include?: Array<'step_details.tool_calls[*].file_search.results[*].content'>, _options?: ConfigurationOptions): Observable<RunObject> {
        return this.createRunWithHttpInfo(threadId, createRunRequest, include, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

    /**
     * Create a thread.
     * @param [createThreadRequest]
     */
    public createThreadWithHttpInfo(createThreadRequest?: CreateThreadRequest, _options?: ConfigurationOptions): Observable<HttpInfo<ThreadObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createThread(createThreadRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createThreadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a thread.
     * @param [createThreadRequest]
     */
    public createThread(createThreadRequest?: CreateThreadRequest, _options?: ConfigurationOptions): Observable<ThreadObject> {
        return this.createThreadWithHttpInfo(createThreadRequest, _options).pipe(map((apiResponse: HttpInfo<ThreadObject>) => apiResponse.data));
    }

    /**
     * Create a thread and run it in one request.
     * @param createThreadAndRunRequest
     */
    public createThreadAndRunWithHttpInfo(createThreadAndRunRequest: CreateThreadAndRunRequest, _options?: ConfigurationOptions): Observable<HttpInfo<RunObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createThreadAndRun(createThreadAndRunRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createThreadAndRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a thread and run it in one request.
     * @param createThreadAndRunRequest
     */
    public createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest, _options?: ConfigurationOptions): Observable<RunObject> {
        return this.createThreadAndRunWithHttpInfo(createThreadAndRunRequest, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

    /**
     * Delete an assistant.
     * @param assistantId The ID of the assistant to delete.
     */
    public deleteAssistantWithHttpInfo(assistantId: string, _options?: ConfigurationOptions): Observable<HttpInfo<DeleteAssistantResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteAssistant(assistantId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteAssistantWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete an assistant.
     * @param assistantId The ID of the assistant to delete.
     */
    public deleteAssistant(assistantId: string, _options?: ConfigurationOptions): Observable<DeleteAssistantResponse> {
        return this.deleteAssistantWithHttpInfo(assistantId, _options).pipe(map((apiResponse: HttpInfo<DeleteAssistantResponse>) => apiResponse.data));
    }

    /**
     * Deletes a message.
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to delete.
     */
    public deleteMessageWithHttpInfo(threadId: string, messageId: string, _options?: ConfigurationOptions): Observable<HttpInfo<DeleteMessageResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteMessage(threadId, messageId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteMessageWithHttpInfo(rsp)));
            }));
    }

    /**
     * Deletes a message.
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to delete.
     */
    public deleteMessage(threadId: string, messageId: string, _options?: ConfigurationOptions): Observable<DeleteMessageResponse> {
        return this.deleteMessageWithHttpInfo(threadId, messageId, _options).pipe(map((apiResponse: HttpInfo<DeleteMessageResponse>) => apiResponse.data));
    }

    /**
     * Delete a thread.
     * @param threadId The ID of the thread to delete.
     */
    public deleteThreadWithHttpInfo(threadId: string, _options?: ConfigurationOptions): Observable<HttpInfo<DeleteThreadResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteThread(threadId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteThreadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete a thread.
     * @param threadId The ID of the thread to delete.
     */
    public deleteThread(threadId: string, _options?: ConfigurationOptions): Observable<DeleteThreadResponse> {
        return this.deleteThreadWithHttpInfo(threadId, _options).pipe(map((apiResponse: HttpInfo<DeleteThreadResponse>) => apiResponse.data));
    }

    /**
     * Retrieves an assistant.
     * @param assistantId The ID of the assistant to retrieve.
     */
    public getAssistantWithHttpInfo(assistantId: string, _options?: ConfigurationOptions): Observable<HttpInfo<AssistantObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getAssistant(assistantId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getAssistantWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves an assistant.
     * @param assistantId The ID of the assistant to retrieve.
     */
    public getAssistant(assistantId: string, _options?: ConfigurationOptions): Observable<AssistantObject> {
        return this.getAssistantWithHttpInfo(assistantId, _options).pipe(map((apiResponse: HttpInfo<AssistantObject>) => apiResponse.data));
    }

    /**
     * Retrieve a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * @param messageId The ID of the message to retrieve.
     */
    public getMessageWithHttpInfo(threadId: string, messageId: string, _options?: ConfigurationOptions): Observable<HttpInfo<MessageObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getMessage(threadId, messageId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getMessageWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieve a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * @param messageId The ID of the message to retrieve.
     */
    public getMessage(threadId: string, messageId: string, _options?: ConfigurationOptions): Observable<MessageObject> {
        return this.getMessageWithHttpInfo(threadId, messageId, _options).pipe(map((apiResponse: HttpInfo<MessageObject>) => apiResponse.data));
    }

    /**
     * Retrieves a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to retrieve.
     */
    public getRunWithHttpInfo(threadId: string, runId: string, _options?: ConfigurationOptions): Observable<HttpInfo<RunObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getRun(threadId, runId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to retrieve.
     */
    public getRun(threadId: string, runId: string, _options?: ConfigurationOptions): Observable<RunObject> {
        return this.getRunWithHttpInfo(threadId, runId, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

    /**
     * Retrieves a run step.
     * @param threadId The ID of the thread to which the run and run step belongs.
     * @param runId The ID of the run to which the run step belongs.
     * @param stepId The ID of the run step to retrieve.
     * @param [include] A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     */
    public getRunStepWithHttpInfo(threadId: string, runId: string, stepId: string, include?: Array<'step_details.tool_calls[*].file_search.results[*].content'>, _options?: ConfigurationOptions): Observable<HttpInfo<RunStepObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getRunStep(threadId, runId, stepId, include, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getRunStepWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a run step.
     * @param threadId The ID of the thread to which the run and run step belongs.
     * @param runId The ID of the run to which the run step belongs.
     * @param stepId The ID of the run step to retrieve.
     * @param [include] A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     */
    public getRunStep(threadId: string, runId: string, stepId: string, include?: Array<'step_details.tool_calls[*].file_search.results[*].content'>, _options?: ConfigurationOptions): Observable<RunStepObject> {
        return this.getRunStepWithHttpInfo(threadId, runId, stepId, include, _options).pipe(map((apiResponse: HttpInfo<RunStepObject>) => apiResponse.data));
    }

    /**
     * Retrieves a thread.
     * @param threadId The ID of the thread to retrieve.
     */
    public getThreadWithHttpInfo(threadId: string, _options?: ConfigurationOptions): Observable<HttpInfo<ThreadObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getThread(threadId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getThreadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a thread.
     * @param threadId The ID of the thread to retrieve.
     */
    public getThread(threadId: string, _options?: ConfigurationOptions): Observable<ThreadObject> {
        return this.getThreadWithHttpInfo(threadId, _options).pipe(map((apiResponse: HttpInfo<ThreadObject>) => apiResponse.data));
    }

    /**
     * Returns a list of assistants.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAssistantsWithHttpInfo(limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ListAssistantsResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listAssistants(limit, order, after, before, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listAssistantsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of assistants.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAssistants(limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: ConfigurationOptions): Observable<ListAssistantsResponse> {
        return this.listAssistantsWithHttpInfo(limit, order, after, before, _options).pipe(map((apiResponse: HttpInfo<ListAssistantsResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of messages for a given thread.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param [runId] Filter messages by the run ID that generated them. 
     */
    public listMessagesWithHttpInfo(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, runId?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ListMessagesResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listMessages(threadId, limit, order, after, before, runId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listMessagesWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of messages for a given thread.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param [runId] Filter messages by the run ID that generated them. 
     */
    public listMessages(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, runId?: string, _options?: ConfigurationOptions): Observable<ListMessagesResponse> {
        return this.listMessagesWithHttpInfo(threadId, limit, order, after, before, runId, _options).pipe(map((apiResponse: HttpInfo<ListMessagesResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of run steps belonging to a run.
     * @param threadId The ID of the thread the run and run steps belong to.
     * @param runId The ID of the run the run steps belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param [include] A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     */
    public listRunStepsWithHttpInfo(threadId: string, runId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, include?: Array<'step_details.tool_calls[*].file_search.results[*].content'>, _options?: ConfigurationOptions): Observable<HttpInfo<ListRunStepsResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listRunSteps(threadId, runId, limit, order, after, before, include, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listRunStepsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of run steps belonging to a run.
     * @param threadId The ID of the thread the run and run steps belong to.
     * @param runId The ID of the run the run steps belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param [include] A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     */
    public listRunSteps(threadId: string, runId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, include?: Array<'step_details.tool_calls[*].file_search.results[*].content'>, _options?: ConfigurationOptions): Observable<ListRunStepsResponse> {
        return this.listRunStepsWithHttpInfo(threadId, runId, limit, order, after, before, include, _options).pipe(map((apiResponse: HttpInfo<ListRunStepsResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param threadId The ID of the thread the run belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listRunsWithHttpInfo(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ListRunsResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listRuns(threadId, limit, order, after, before, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listRunsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param threadId The ID of the thread the run belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listRuns(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: ConfigurationOptions): Observable<ListRunsResponse> {
        return this.listRunsWithHttpInfo(threadId, limit, order, after, before, _options).pipe(map((apiResponse: HttpInfo<ListRunsResponse>) => apiResponse.data));
    }

    /**
     * Modifies an assistant.
     * @param assistantId The ID of the assistant to modify.
     * @param modifyAssistantRequest
     */
    public modifyAssistantWithHttpInfo(assistantId: string, modifyAssistantRequest: ModifyAssistantRequest, _options?: ConfigurationOptions): Observable<HttpInfo<AssistantObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.modifyAssistant(assistantId, modifyAssistantRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyAssistantWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies an assistant.
     * @param assistantId The ID of the assistant to modify.
     * @param modifyAssistantRequest
     */
    public modifyAssistant(assistantId: string, modifyAssistantRequest: ModifyAssistantRequest, _options?: ConfigurationOptions): Observable<AssistantObject> {
        return this.modifyAssistantWithHttpInfo(assistantId, modifyAssistantRequest, _options).pipe(map((apiResponse: HttpInfo<AssistantObject>) => apiResponse.data));
    }

    /**
     * Modifies a message.
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to modify.
     * @param modifyMessageRequest
     */
    public modifyMessageWithHttpInfo(threadId: string, messageId: string, modifyMessageRequest: ModifyMessageRequest, _options?: ConfigurationOptions): Observable<HttpInfo<MessageObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.modifyMessage(threadId, messageId, modifyMessageRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyMessageWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies a message.
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to modify.
     * @param modifyMessageRequest
     */
    public modifyMessage(threadId: string, messageId: string, modifyMessageRequest: ModifyMessageRequest, _options?: ConfigurationOptions): Observable<MessageObject> {
        return this.modifyMessageWithHttpInfo(threadId, messageId, modifyMessageRequest, _options).pipe(map((apiResponse: HttpInfo<MessageObject>) => apiResponse.data));
    }

    /**
     * Modifies a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to modify.
     * @param modifyRunRequest
     */
    public modifyRunWithHttpInfo(threadId: string, runId: string, modifyRunRequest: ModifyRunRequest, _options?: ConfigurationOptions): Observable<HttpInfo<RunObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.modifyRun(threadId, runId, modifyRunRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to modify.
     * @param modifyRunRequest
     */
    public modifyRun(threadId: string, runId: string, modifyRunRequest: ModifyRunRequest, _options?: ConfigurationOptions): Observable<RunObject> {
        return this.modifyRunWithHttpInfo(threadId, runId, modifyRunRequest, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

    /**
     * Modifies a thread.
     * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
     * @param modifyThreadRequest
     */
    public modifyThreadWithHttpInfo(threadId: string, modifyThreadRequest: ModifyThreadRequest, _options?: ConfigurationOptions): Observable<HttpInfo<ThreadObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.modifyThread(threadId, modifyThreadRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyThreadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies a thread.
     * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
     * @param modifyThreadRequest
     */
    public modifyThread(threadId: string, modifyThreadRequest: ModifyThreadRequest, _options?: ConfigurationOptions): Observable<ThreadObject> {
        return this.modifyThreadWithHttpInfo(threadId, modifyThreadRequest, _options).pipe(map((apiResponse: HttpInfo<ThreadObject>) => apiResponse.data));
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they\'re all completed. All outputs must be submitted in a single request. 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
     * @param runId The ID of the run that requires the tool output submission.
     * @param submitToolOutputsRunRequest
     */
    public submitToolOuputsToRunWithHttpInfo(threadId: string, runId: string, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest, _options?: ConfigurationOptions): Observable<HttpInfo<RunObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.submitToolOuputsToRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they\'re all completed. All outputs must be submitted in a single request. 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
     * @param runId The ID of the run that requires the tool output submission.
     * @param submitToolOutputsRunRequest
     */
    public submitToolOuputsToRun(threadId: string, runId: string, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest, _options?: ConfigurationOptions): Observable<RunObject> {
        return this.submitToolOuputsToRunWithHttpInfo(threadId, runId, submitToolOutputsRunRequest, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

}

import { AudioApiRequestFactory, AudioApiResponseProcessor} from "../apis/AudioApi";
export class ObservableAudioApi {
    private requestFactory: AudioApiRequestFactory;
    private responseProcessor: AudioApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AudioApiRequestFactory,
        responseProcessor?: AudioApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AudioApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AudioApiResponseProcessor();
    }

    /**
     * Generates audio from the input text.
     * @param createSpeechRequest
     */
    public createSpeechWithHttpInfo(createSpeechRequest: CreateSpeechRequest, _options?: ConfigurationOptions): Observable<HttpInfo<HttpFile>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createSpeech(createSpeechRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createSpeechWithHttpInfo(rsp)));
            }));
    }

    /**
     * Generates audio from the input text.
     * @param createSpeechRequest
     */
    public createSpeech(createSpeechRequest: CreateSpeechRequest, _options?: ConfigurationOptions): Observable<HttpFile> {
        return this.createSpeechWithHttpInfo(createSpeechRequest, _options).pipe(map((apiResponse: HttpInfo<HttpFile>) => apiResponse.data));
    }

    /**
     * Transcribes audio into the input language.
     * @param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model
     * @param [language] The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
     * @param [prompt] An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
     * @param [responseFormat]
     * @param [temperature] The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * @param [timestampGranularities] The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
     */
    public createTranscriptionWithHttpInfo(file: HttpFile, model: CreateTranscriptionRequestModel, language?: string, prompt?: string, responseFormat?: AudioResponseFormat, temperature?: number, timestampGranularities?: Array<string>, _options?: ConfigurationOptions): Observable<HttpInfo<CreateTranscription200Response>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createTranscriptionWithHttpInfo(rsp)));
            }));
    }

    /**
     * Transcribes audio into the input language.
     * @param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model
     * @param [language] The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
     * @param [prompt] An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
     * @param [responseFormat]
     * @param [temperature] The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * @param [timestampGranularities] The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
     */
    public createTranscription(file: HttpFile, model: CreateTranscriptionRequestModel, language?: string, prompt?: string, responseFormat?: AudioResponseFormat, temperature?: number, timestampGranularities?: Array<string>, _options?: ConfigurationOptions): Observable<CreateTranscription200Response> {
        return this.createTranscriptionWithHttpInfo(file, model, language, prompt, responseFormat, temperature, timestampGranularities, _options).pipe(map((apiResponse: HttpInfo<CreateTranscription200Response>) => apiResponse.data));
    }

    /**
     * Translates audio into English.
     * @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model
     * @param [prompt] An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
     * @param [responseFormat]
     * @param [temperature] The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     */
    public createTranslationWithHttpInfo(file: HttpFile, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: AudioResponseFormat, temperature?: number, _options?: ConfigurationOptions): Observable<HttpInfo<CreateTranslation200Response>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createTranslation(file, model, prompt, responseFormat, temperature, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createTranslationWithHttpInfo(rsp)));
            }));
    }

    /**
     * Translates audio into English.
     * @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model
     * @param [prompt] An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
     * @param [responseFormat]
     * @param [temperature] The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     */
    public createTranslation(file: HttpFile, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: AudioResponseFormat, temperature?: number, _options?: ConfigurationOptions): Observable<CreateTranslation200Response> {
        return this.createTranslationWithHttpInfo(file, model, prompt, responseFormat, temperature, _options).pipe(map((apiResponse: HttpInfo<CreateTranslation200Response>) => apiResponse.data));
    }

}

import { AuditLogsApiRequestFactory, AuditLogsApiResponseProcessor} from "../apis/AuditLogsApi";
export class ObservableAuditLogsApi {
    private requestFactory: AuditLogsApiRequestFactory;
    private responseProcessor: AuditLogsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AuditLogsApiRequestFactory,
        responseProcessor?: AuditLogsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AuditLogsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AuditLogsApiResponseProcessor();
    }

    /**
     * List user actions and configuration changes within this organization.
     * @param [effectiveAt] Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.
     * @param [projectIds] Return only events for these projects.
     * @param [eventTypes] Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
     * @param [actorIds] Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
     * @param [actorEmails] Return only events performed by users with these emails.
     * @param [resourceIds] Return only events performed on these targets. For example, a project ID updated.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAuditLogsWithHttpInfo(effectiveAt?: ListAuditLogsEffectiveAtParameter, projectIds?: Array<string>, eventTypes?: Array<AuditLogEventType>, actorIds?: Array<string>, actorEmails?: Array<string>, resourceIds?: Array<string>, limit?: number, after?: string, before?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ListAuditLogsResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listAuditLogsWithHttpInfo(rsp)));
            }));
    }

    /**
     * List user actions and configuration changes within this organization.
     * @param [effectiveAt] Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.
     * @param [projectIds] Return only events for these projects.
     * @param [eventTypes] Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
     * @param [actorIds] Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
     * @param [actorEmails] Return only events performed by users with these emails.
     * @param [resourceIds] Return only events performed on these targets. For example, a project ID updated.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAuditLogs(effectiveAt?: ListAuditLogsEffectiveAtParameter, projectIds?: Array<string>, eventTypes?: Array<AuditLogEventType>, actorIds?: Array<string>, actorEmails?: Array<string>, resourceIds?: Array<string>, limit?: number, after?: string, before?: string, _options?: ConfigurationOptions): Observable<ListAuditLogsResponse> {
        return this.listAuditLogsWithHttpInfo(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before, _options).pipe(map((apiResponse: HttpInfo<ListAuditLogsResponse>) => apiResponse.data));
    }

}

import { BatchApiRequestFactory, BatchApiResponseProcessor} from "../apis/BatchApi";
export class ObservableBatchApi {
    private requestFactory: BatchApiRequestFactory;
    private responseProcessor: BatchApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: BatchApiRequestFactory,
        responseProcessor?: BatchApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new BatchApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new BatchApiResponseProcessor();
    }

    /**
     * Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
     * @param batchId The ID of the batch to cancel.
     */
    public cancelBatchWithHttpInfo(batchId: string, _options?: ConfigurationOptions): Observable<HttpInfo<Batch>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.cancelBatch(batchId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.cancelBatchWithHttpInfo(rsp)));
            }));
    }

    /**
     * Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
     * @param batchId The ID of the batch to cancel.
     */
    public cancelBatch(batchId: string, _options?: ConfigurationOptions): Observable<Batch> {
        return this.cancelBatchWithHttpInfo(batchId, _options).pipe(map((apiResponse: HttpInfo<Batch>) => apiResponse.data));
    }

    /**
     * Creates and executes a batch from an uploaded file of requests
     * @param createBatchRequest
     */
    public createBatchWithHttpInfo(createBatchRequest: CreateBatchRequest, _options?: ConfigurationOptions): Observable<HttpInfo<Batch>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createBatch(createBatchRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createBatchWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates and executes a batch from an uploaded file of requests
     * @param createBatchRequest
     */
    public createBatch(createBatchRequest: CreateBatchRequest, _options?: ConfigurationOptions): Observable<Batch> {
        return this.createBatchWithHttpInfo(createBatchRequest, _options).pipe(map((apiResponse: HttpInfo<Batch>) => apiResponse.data));
    }

    /**
     * List your organization\'s batches.
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     */
    public listBatchesWithHttpInfo(after?: string, limit?: number, _options?: ConfigurationOptions): Observable<HttpInfo<ListBatchesResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listBatches(after, limit, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listBatchesWithHttpInfo(rsp)));
            }));
    }

    /**
     * List your organization\'s batches.
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     */
    public listBatches(after?: string, limit?: number, _options?: ConfigurationOptions): Observable<ListBatchesResponse> {
        return this.listBatchesWithHttpInfo(after, limit, _options).pipe(map((apiResponse: HttpInfo<ListBatchesResponse>) => apiResponse.data));
    }

    /**
     * Retrieves a batch.
     * @param batchId The ID of the batch to retrieve.
     */
    public retrieveBatchWithHttpInfo(batchId: string, _options?: ConfigurationOptions): Observable<HttpInfo<Batch>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.retrieveBatch(batchId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveBatchWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a batch.
     * @param batchId The ID of the batch to retrieve.
     */
    public retrieveBatch(batchId: string, _options?: ConfigurationOptions): Observable<Batch> {
        return this.retrieveBatchWithHttpInfo(batchId, _options).pipe(map((apiResponse: HttpInfo<Batch>) => apiResponse.data));
    }

}

import { ChatApiRequestFactory, ChatApiResponseProcessor} from "../apis/ChatApi";
export class ObservableChatApi {
    private requestFactory: ChatApiRequestFactory;
    private responseProcessor: ChatApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ChatApiRequestFactory,
        responseProcessor?: ChatApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ChatApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ChatApiResponseProcessor();
    }

    /**
     * Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
     * @param createChatCompletionRequest
     */
    public createChatCompletionWithHttpInfo(createChatCompletionRequest: CreateChatCompletionRequest, _options?: ConfigurationOptions): Observable<HttpInfo<CreateChatCompletionResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createChatCompletion(createChatCompletionRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createChatCompletionWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
     * @param createChatCompletionRequest
     */
    public createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest, _options?: ConfigurationOptions): Observable<CreateChatCompletionResponse> {
        return this.createChatCompletionWithHttpInfo(createChatCompletionRequest, _options).pipe(map((apiResponse: HttpInfo<CreateChatCompletionResponse>) => apiResponse.data));
    }

}

import { CompletionsApiRequestFactory, CompletionsApiResponseProcessor} from "../apis/CompletionsApi";
export class ObservableCompletionsApi {
    private requestFactory: CompletionsApiRequestFactory;
    private responseProcessor: CompletionsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CompletionsApiRequestFactory,
        responseProcessor?: CompletionsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CompletionsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CompletionsApiResponseProcessor();
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param createCompletionRequest
     */
    public createCompletionWithHttpInfo(createCompletionRequest: CreateCompletionRequest, _options?: ConfigurationOptions): Observable<HttpInfo<CreateCompletionResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createCompletion(createCompletionRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createCompletionWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param createCompletionRequest
     */
    public createCompletion(createCompletionRequest: CreateCompletionRequest, _options?: ConfigurationOptions): Observable<CreateCompletionResponse> {
        return this.createCompletionWithHttpInfo(createCompletionRequest, _options).pipe(map((apiResponse: HttpInfo<CreateCompletionResponse>) => apiResponse.data));
    }

}

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class ObservableDefaultApi {
    private requestFactory: DefaultApiRequestFactory;
    private responseProcessor: DefaultApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DefaultApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DefaultApiResponseProcessor();
    }

    /**
     * Create a new admin-level API key for the organization.
     * Create an organization admin API key
     * @param adminApiKeysCreateRequest
     */
    public adminApiKeysCreateWithHttpInfo(adminApiKeysCreateRequest: AdminApiKeysCreateRequest, _options?: ConfigurationOptions): Observable<HttpInfo<AdminApiKey>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.adminApiKeysCreate(adminApiKeysCreateRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.adminApiKeysCreateWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a new admin-level API key for the organization.
     * Create an organization admin API key
     * @param adminApiKeysCreateRequest
     */
    public adminApiKeysCreate(adminApiKeysCreateRequest: AdminApiKeysCreateRequest, _options?: ConfigurationOptions): Observable<AdminApiKey> {
        return this.adminApiKeysCreateWithHttpInfo(adminApiKeysCreateRequest, _options).pipe(map((apiResponse: HttpInfo<AdminApiKey>) => apiResponse.data));
    }

    /**
     * Delete the specified admin API key.
     * Delete an organization admin API key
     * @param keyId
     */
    public adminApiKeysDeleteWithHttpInfo(keyId: string, _options?: ConfigurationOptions): Observable<HttpInfo<AdminApiKeysDelete200Response>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.adminApiKeysDelete(keyId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.adminApiKeysDeleteWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete the specified admin API key.
     * Delete an organization admin API key
     * @param keyId
     */
    public adminApiKeysDelete(keyId: string, _options?: ConfigurationOptions): Observable<AdminApiKeysDelete200Response> {
        return this.adminApiKeysDeleteWithHttpInfo(keyId, _options).pipe(map((apiResponse: HttpInfo<AdminApiKeysDelete200Response>) => apiResponse.data));
    }

    /**
     * Get details for a specific organization API key by its ID.
     * Retrieve a single organization API key
     * @param keyId
     */
    public adminApiKeysGetWithHttpInfo(keyId: string, _options?: ConfigurationOptions): Observable<HttpInfo<AdminApiKey>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.adminApiKeysGet(keyId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.adminApiKeysGetWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get details for a specific organization API key by its ID.
     * Retrieve a single organization API key
     * @param keyId
     */
    public adminApiKeysGet(keyId: string, _options?: ConfigurationOptions): Observable<AdminApiKey> {
        return this.adminApiKeysGetWithHttpInfo(keyId, _options).pipe(map((apiResponse: HttpInfo<AdminApiKey>) => apiResponse.data));
    }

    /**
     * Retrieve a paginated list of organization admin API keys.
     * List organization API keys
     * @param [after]
     * @param [order]
     * @param [limit]
     */
    public adminApiKeysListWithHttpInfo(after?: string, order?: 'asc' | 'desc', limit?: number, _options?: ConfigurationOptions): Observable<HttpInfo<ApiKeyList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.adminApiKeysList(after, order, limit, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.adminApiKeysListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieve a paginated list of organization admin API keys.
     * List organization API keys
     * @param [after]
     * @param [order]
     * @param [limit]
     */
    public adminApiKeysList(after?: string, order?: 'asc' | 'desc', limit?: number, _options?: ConfigurationOptions): Observable<ApiKeyList> {
        return this.adminApiKeysListWithHttpInfo(after, order, limit, _options).pipe(map((apiResponse: HttpInfo<ApiKeyList>) => apiResponse.data));
    }

}

import { EmbeddingsApiRequestFactory, EmbeddingsApiResponseProcessor} from "../apis/EmbeddingsApi";
export class ObservableEmbeddingsApi {
    private requestFactory: EmbeddingsApiRequestFactory;
    private responseProcessor: EmbeddingsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EmbeddingsApiRequestFactory,
        responseProcessor?: EmbeddingsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EmbeddingsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EmbeddingsApiResponseProcessor();
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param createEmbeddingRequest
     */
    public createEmbeddingWithHttpInfo(createEmbeddingRequest: CreateEmbeddingRequest, _options?: ConfigurationOptions): Observable<HttpInfo<CreateEmbeddingResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createEmbedding(createEmbeddingRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createEmbeddingWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param createEmbeddingRequest
     */
    public createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest, _options?: ConfigurationOptions): Observable<CreateEmbeddingResponse> {
        return this.createEmbeddingWithHttpInfo(createEmbeddingRequest, _options).pipe(map((apiResponse: HttpInfo<CreateEmbeddingResponse>) => apiResponse.data));
    }

}

import { FilesApiRequestFactory, FilesApiResponseProcessor} from "../apis/FilesApi";
export class ObservableFilesApi {
    private requestFactory: FilesApiRequestFactory;
    private responseProcessor: FilesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: FilesApiRequestFactory,
        responseProcessor?: FilesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new FilesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new FilesApiResponseProcessor();
    }

    /**
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * @param file The File object (not file name) to be uploaded. 
     * @param purpose The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning). 
     */
    public createFileWithHttpInfo(file: HttpFile, purpose: string, _options?: ConfigurationOptions): Observable<HttpInfo<OpenAIFile>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createFile(file, purpose, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * @param file The File object (not file name) to be uploaded. 
     * @param purpose The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning). 
     */
    public createFile(file: HttpFile, purpose: string, _options?: ConfigurationOptions): Observable<OpenAIFile> {
        return this.createFileWithHttpInfo(file, purpose, _options).pipe(map((apiResponse: HttpInfo<OpenAIFile>) => apiResponse.data));
    }

    /**
     * Delete a file.
     * @param fileId The ID of the file to use for this request.
     */
    public deleteFileWithHttpInfo(fileId: string, _options?: ConfigurationOptions): Observable<HttpInfo<DeleteFileResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteFile(fileId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete a file.
     * @param fileId The ID of the file to use for this request.
     */
    public deleteFile(fileId: string, _options?: ConfigurationOptions): Observable<DeleteFileResponse> {
        return this.deleteFileWithHttpInfo(fileId, _options).pipe(map((apiResponse: HttpInfo<DeleteFileResponse>) => apiResponse.data));
    }

    /**
     * Returns the contents of the specified file.
     * @param fileId The ID of the file to use for this request.
     */
    public downloadFileWithHttpInfo(fileId: string, _options?: ConfigurationOptions): Observable<HttpInfo<string>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.downloadFile(fileId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.downloadFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns the contents of the specified file.
     * @param fileId The ID of the file to use for this request.
     */
    public downloadFile(fileId: string, _options?: ConfigurationOptions): Observable<string> {
        return this.downloadFileWithHttpInfo(fileId, _options).pipe(map((apiResponse: HttpInfo<string>) => apiResponse.data));
    }

    /**
     * Returns a list of files.
     * @param [purpose] Only return files with the given purpose.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listFilesWithHttpInfo(purpose?: string, limit?: number, order?: 'asc' | 'desc', after?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ListFilesResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listFiles(purpose, limit, order, after, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listFilesWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of files.
     * @param [purpose] Only return files with the given purpose.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listFiles(purpose?: string, limit?: number, order?: 'asc' | 'desc', after?: string, _options?: ConfigurationOptions): Observable<ListFilesResponse> {
        return this.listFilesWithHttpInfo(purpose, limit, order, after, _options).pipe(map((apiResponse: HttpInfo<ListFilesResponse>) => apiResponse.data));
    }

    /**
     * Returns information about a specific file.
     * @param fileId The ID of the file to use for this request.
     */
    public retrieveFileWithHttpInfo(fileId: string, _options?: ConfigurationOptions): Observable<HttpInfo<OpenAIFile>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.retrieveFile(fileId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns information about a specific file.
     * @param fileId The ID of the file to use for this request.
     */
    public retrieveFile(fileId: string, _options?: ConfigurationOptions): Observable<OpenAIFile> {
        return this.retrieveFileWithHttpInfo(fileId, _options).pipe(map((apiResponse: HttpInfo<OpenAIFile>) => apiResponse.data));
    }

}

import { FineTuningApiRequestFactory, FineTuningApiResponseProcessor} from "../apis/FineTuningApi";
export class ObservableFineTuningApi {
    private requestFactory: FineTuningApiRequestFactory;
    private responseProcessor: FineTuningApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: FineTuningApiRequestFactory,
        responseProcessor?: FineTuningApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new FineTuningApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new FineTuningApiResponseProcessor();
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel. 
     */
    public cancelFineTuningJobWithHttpInfo(fineTuningJobId: string, _options?: ConfigurationOptions): Observable<HttpInfo<FineTuningJob>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.cancelFineTuningJob(fineTuningJobId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.cancelFineTuningJobWithHttpInfo(rsp)));
            }));
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel. 
     */
    public cancelFineTuningJob(fineTuningJobId: string, _options?: ConfigurationOptions): Observable<FineTuningJob> {
        return this.cancelFineTuningJobWithHttpInfo(fineTuningJobId, _options).pipe(map((apiResponse: HttpInfo<FineTuningJob>) => apiResponse.data));
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param createFineTuningJobRequest
     */
    public createFineTuningJobWithHttpInfo(createFineTuningJobRequest: CreateFineTuningJobRequest, _options?: ConfigurationOptions): Observable<HttpInfo<FineTuningJob>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createFineTuningJob(createFineTuningJobRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createFineTuningJobWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param createFineTuningJobRequest
     */
    public createFineTuningJob(createFineTuningJobRequest: CreateFineTuningJobRequest, _options?: ConfigurationOptions): Observable<FineTuningJob> {
        return this.createFineTuningJobWithHttpInfo(createFineTuningJobRequest, _options).pipe(map((apiResponse: HttpInfo<FineTuningJob>) => apiResponse.data));
    }

    /**
     * Get status updates for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for. 
     * @param [after] Identifier for the last event from the previous pagination request.
     * @param [limit] Number of events to retrieve.
     */
    public listFineTuningEventsWithHttpInfo(fineTuningJobId: string, after?: string, limit?: number, _options?: ConfigurationOptions): Observable<HttpInfo<ListFineTuningJobEventsResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listFineTuningEvents(fineTuningJobId, after, limit, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listFineTuningEventsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get status updates for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for. 
     * @param [after] Identifier for the last event from the previous pagination request.
     * @param [limit] Number of events to retrieve.
     */
    public listFineTuningEvents(fineTuningJobId: string, after?: string, limit?: number, _options?: ConfigurationOptions): Observable<ListFineTuningJobEventsResponse> {
        return this.listFineTuningEventsWithHttpInfo(fineTuningJobId, after, limit, _options).pipe(map((apiResponse: HttpInfo<ListFineTuningJobEventsResponse>) => apiResponse.data));
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for. 
     * @param [after] Identifier for the last checkpoint ID from the previous pagination request.
     * @param [limit] Number of checkpoints to retrieve.
     */
    public listFineTuningJobCheckpointsWithHttpInfo(fineTuningJobId: string, after?: string, limit?: number, _options?: ConfigurationOptions): Observable<HttpInfo<ListFineTuningJobCheckpointsResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listFineTuningJobCheckpoints(fineTuningJobId, after, limit, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listFineTuningJobCheckpointsWithHttpInfo(rsp)));
            }));
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for. 
     * @param [after] Identifier for the last checkpoint ID from the previous pagination request.
     * @param [limit] Number of checkpoints to retrieve.
     */
    public listFineTuningJobCheckpoints(fineTuningJobId: string, after?: string, limit?: number, _options?: ConfigurationOptions): Observable<ListFineTuningJobCheckpointsResponse> {
        return this.listFineTuningJobCheckpointsWithHttpInfo(fineTuningJobId, after, limit, _options).pipe(map((apiResponse: HttpInfo<ListFineTuningJobCheckpointsResponse>) => apiResponse.data));
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param [after] Identifier for the last job from the previous pagination request.
     * @param [limit] Number of fine-tuning jobs to retrieve.
     */
    public listPaginatedFineTuningJobsWithHttpInfo(after?: string, limit?: number, _options?: ConfigurationOptions): Observable<HttpInfo<ListPaginatedFineTuningJobsResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listPaginatedFineTuningJobs(after, limit, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listPaginatedFineTuningJobsWithHttpInfo(rsp)));
            }));
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param [after] Identifier for the last job from the previous pagination request.
     * @param [limit] Number of fine-tuning jobs to retrieve.
     */
    public listPaginatedFineTuningJobs(after?: string, limit?: number, _options?: ConfigurationOptions): Observable<ListPaginatedFineTuningJobsResponse> {
        return this.listPaginatedFineTuningJobsWithHttpInfo(after, limit, _options).pipe(map((apiResponse: HttpInfo<ListPaginatedFineTuningJobsResponse>) => apiResponse.data));
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param fineTuningJobId The ID of the fine-tuning job. 
     */
    public retrieveFineTuningJobWithHttpInfo(fineTuningJobId: string, _options?: ConfigurationOptions): Observable<HttpInfo<FineTuningJob>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.retrieveFineTuningJob(fineTuningJobId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveFineTuningJobWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param fineTuningJobId The ID of the fine-tuning job. 
     */
    public retrieveFineTuningJob(fineTuningJobId: string, _options?: ConfigurationOptions): Observable<FineTuningJob> {
        return this.retrieveFineTuningJobWithHttpInfo(fineTuningJobId, _options).pipe(map((apiResponse: HttpInfo<FineTuningJob>) => apiResponse.data));
    }

}

import { ImagesApiRequestFactory, ImagesApiResponseProcessor} from "../apis/ImagesApi";
export class ObservableImagesApi {
    private requestFactory: ImagesApiRequestFactory;
    private responseProcessor: ImagesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ImagesApiRequestFactory,
        responseProcessor?: ImagesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ImagesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ImagesApiResponseProcessor();
    }

    /**
     * Creates an image given a prompt.
     * @param createImageRequest
     */
    public createImageWithHttpInfo(createImageRequest: CreateImageRequest, _options?: ConfigurationOptions): Observable<HttpInfo<ImagesResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createImage(createImageRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createImageWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates an image given a prompt.
     * @param createImageRequest
     */
    public createImage(createImageRequest: CreateImageRequest, _options?: ConfigurationOptions): Observable<ImagesResponse> {
        return this.createImageWithHttpInfo(createImageRequest, _options).pipe(map((apiResponse: HttpInfo<ImagesResponse>) => apiResponse.data));
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
     * @param [mask] An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
     * @param [model]
     * @param [n] The number of images to generate. Must be between 1 and 10.
     * @param [size] The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param [responseFormat] The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * @param [user] A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
     */
    public createImageEditWithHttpInfo(image: HttpFile, prompt: string, mask?: HttpFile, model?: CreateImageEditRequestModel, n?: number, size?: string, responseFormat?: string, user?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ImagesResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createImageEditWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
     * @param [mask] An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
     * @param [model]
     * @param [n] The number of images to generate. Must be between 1 and 10.
     * @param [size] The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param [responseFormat] The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * @param [user] A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
     */
    public createImageEdit(image: HttpFile, prompt: string, mask?: HttpFile, model?: CreateImageEditRequestModel, n?: number, size?: string, responseFormat?: string, user?: string, _options?: ConfigurationOptions): Observable<ImagesResponse> {
        return this.createImageEditWithHttpInfo(image, prompt, mask, model, n, size, responseFormat, user, _options).pipe(map((apiResponse: HttpInfo<ImagesResponse>) => apiResponse.data));
    }

    /**
     * Creates a variation of a given image.
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     * @param [model]
     * @param [n] The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
     * @param [responseFormat] The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * @param [size] The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param [user] A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
     */
    public createImageVariationWithHttpInfo(image: HttpFile, model?: CreateImageEditRequestModel, n?: number, responseFormat?: string, size?: string, user?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ImagesResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createImageVariation(image, model, n, responseFormat, size, user, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createImageVariationWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a variation of a given image.
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     * @param [model]
     * @param [n] The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
     * @param [responseFormat] The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * @param [size] The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param [user] A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
     */
    public createImageVariation(image: HttpFile, model?: CreateImageEditRequestModel, n?: number, responseFormat?: string, size?: string, user?: string, _options?: ConfigurationOptions): Observable<ImagesResponse> {
        return this.createImageVariationWithHttpInfo(image, model, n, responseFormat, size, user, _options).pipe(map((apiResponse: HttpInfo<ImagesResponse>) => apiResponse.data));
    }

}

import { InvitesApiRequestFactory, InvitesApiResponseProcessor} from "../apis/InvitesApi";
export class ObservableInvitesApi {
    private requestFactory: InvitesApiRequestFactory;
    private responseProcessor: InvitesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: InvitesApiRequestFactory,
        responseProcessor?: InvitesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new InvitesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new InvitesApiResponseProcessor();
    }

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     * @param inviteId The ID of the invite to delete.
     */
    public deleteInviteWithHttpInfo(inviteId: string, _options?: ConfigurationOptions): Observable<HttpInfo<InviteDeleteResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteInvite(inviteId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteInviteWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     * @param inviteId The ID of the invite to delete.
     */
    public deleteInvite(inviteId: string, _options?: ConfigurationOptions): Observable<InviteDeleteResponse> {
        return this.deleteInviteWithHttpInfo(inviteId, _options).pipe(map((apiResponse: HttpInfo<InviteDeleteResponse>) => apiResponse.data));
    }

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     * @param inviteRequest The invite request payload.
     */
    public inviteUserWithHttpInfo(inviteRequest: InviteRequest, _options?: ConfigurationOptions): Observable<HttpInfo<Invite>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.inviteUser(inviteRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.inviteUserWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     * @param inviteRequest The invite request payload.
     */
    public inviteUser(inviteRequest: InviteRequest, _options?: ConfigurationOptions): Observable<Invite> {
        return this.inviteUserWithHttpInfo(inviteRequest, _options).pipe(map((apiResponse: HttpInfo<Invite>) => apiResponse.data));
    }

    /**
     * Returns a list of invites in the organization.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listInvitesWithHttpInfo(limit?: number, after?: string, _options?: ConfigurationOptions): Observable<HttpInfo<InviteListResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listInvites(limit, after, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listInvitesWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of invites in the organization.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listInvites(limit?: number, after?: string, _options?: ConfigurationOptions): Observable<InviteListResponse> {
        return this.listInvitesWithHttpInfo(limit, after, _options).pipe(map((apiResponse: HttpInfo<InviteListResponse>) => apiResponse.data));
    }

    /**
     * Retrieves an invite.
     * @param inviteId The ID of the invite to retrieve.
     */
    public retrieveInviteWithHttpInfo(inviteId: string, _options?: ConfigurationOptions): Observable<HttpInfo<Invite>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.retrieveInvite(inviteId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveInviteWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves an invite.
     * @param inviteId The ID of the invite to retrieve.
     */
    public retrieveInvite(inviteId: string, _options?: ConfigurationOptions): Observable<Invite> {
        return this.retrieveInviteWithHttpInfo(inviteId, _options).pipe(map((apiResponse: HttpInfo<Invite>) => apiResponse.data));
    }

}

import { ModelsApiRequestFactory, ModelsApiResponseProcessor} from "../apis/ModelsApi";
export class ObservableModelsApi {
    private requestFactory: ModelsApiRequestFactory;
    private responseProcessor: ModelsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ModelsApiRequestFactory,
        responseProcessor?: ModelsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ModelsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ModelsApiResponseProcessor();
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param model The model to delete
     */
    public deleteModelWithHttpInfo(model: string, _options?: ConfigurationOptions): Observable<HttpInfo<DeleteModelResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteModel(model, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteModelWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param model The model to delete
     */
    public deleteModel(model: string, _options?: ConfigurationOptions): Observable<DeleteModelResponse> {
        return this.deleteModelWithHttpInfo(model, _options).pipe(map((apiResponse: HttpInfo<DeleteModelResponse>) => apiResponse.data));
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     */
    public listModelsWithHttpInfo(_options?: ConfigurationOptions): Observable<HttpInfo<ListModelsResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listModels(_config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listModelsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     */
    public listModels(_options?: ConfigurationOptions): Observable<ListModelsResponse> {
        return this.listModelsWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<ListModelsResponse>) => apiResponse.data));
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param model The ID of the model to use for this request
     */
    public retrieveModelWithHttpInfo(model: string, _options?: ConfigurationOptions): Observable<HttpInfo<Model>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.retrieveModel(model, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveModelWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param model The ID of the model to use for this request
     */
    public retrieveModel(model: string, _options?: ConfigurationOptions): Observable<Model> {
        return this.retrieveModelWithHttpInfo(model, _options).pipe(map((apiResponse: HttpInfo<Model>) => apiResponse.data));
    }

}

import { ModerationsApiRequestFactory, ModerationsApiResponseProcessor} from "../apis/ModerationsApi";
export class ObservableModerationsApi {
    private requestFactory: ModerationsApiRequestFactory;
    private responseProcessor: ModerationsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ModerationsApiRequestFactory,
        responseProcessor?: ModerationsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ModerationsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ModerationsApiResponseProcessor();
    }

    /**
     * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
     * @param createModerationRequest
     */
    public createModerationWithHttpInfo(createModerationRequest: CreateModerationRequest, _options?: ConfigurationOptions): Observable<HttpInfo<CreateModerationResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createModeration(createModerationRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createModerationWithHttpInfo(rsp)));
            }));
    }

    /**
     * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
     * @param createModerationRequest
     */
    public createModeration(createModerationRequest: CreateModerationRequest, _options?: ConfigurationOptions): Observable<CreateModerationResponse> {
        return this.createModerationWithHttpInfo(createModerationRequest, _options).pipe(map((apiResponse: HttpInfo<CreateModerationResponse>) => apiResponse.data));
    }

}

import { ProjectsApiRequestFactory, ProjectsApiResponseProcessor} from "../apis/ProjectsApi";
export class ObservableProjectsApi {
    private requestFactory: ProjectsApiRequestFactory;
    private responseProcessor: ProjectsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ProjectsApiRequestFactory,
        responseProcessor?: ProjectsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ProjectsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ProjectsApiResponseProcessor();
    }

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     * @param projectId The ID of the project.
     */
    public archiveProjectWithHttpInfo(projectId: string, _options?: ConfigurationOptions): Observable<HttpInfo<Project>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.archiveProject(projectId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.archiveProjectWithHttpInfo(rsp)));
            }));
    }

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     * @param projectId The ID of the project.
     */
    public archiveProject(projectId: string, _options?: ConfigurationOptions): Observable<Project> {
        return this.archiveProjectWithHttpInfo(projectId, _options).pipe(map((apiResponse: HttpInfo<Project>) => apiResponse.data));
    }

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     * @param projectCreateRequest The project create request payload.
     */
    public createProjectWithHttpInfo(projectCreateRequest: ProjectCreateRequest, _options?: ConfigurationOptions): Observable<HttpInfo<Project>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createProject(projectCreateRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createProjectWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     * @param projectCreateRequest The project create request payload.
     */
    public createProject(projectCreateRequest: ProjectCreateRequest, _options?: ConfigurationOptions): Observable<Project> {
        return this.createProjectWithHttpInfo(projectCreateRequest, _options).pipe(map((apiResponse: HttpInfo<Project>) => apiResponse.data));
    }

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     * @param projectId The ID of the project.
     * @param projectServiceAccountCreateRequest The project service account create request payload.
     */
    public createProjectServiceAccountWithHttpInfo(projectId: string, projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectServiceAccountCreateResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createProjectServiceAccountWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     * @param projectId The ID of the project.
     * @param projectServiceAccountCreateRequest The project service account create request payload.
     */
    public createProjectServiceAccount(projectId: string, projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest, _options?: ConfigurationOptions): Observable<ProjectServiceAccountCreateResponse> {
        return this.createProjectServiceAccountWithHttpInfo(projectId, projectServiceAccountCreateRequest, _options).pipe(map((apiResponse: HttpInfo<ProjectServiceAccountCreateResponse>) => apiResponse.data));
    }

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     * @param projectId The ID of the project.
     * @param projectUserCreateRequest The project user create request payload.
     */
    public createProjectUserWithHttpInfo(projectId: string, projectUserCreateRequest: ProjectUserCreateRequest, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectUser>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createProjectUser(projectId, projectUserCreateRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createProjectUserWithHttpInfo(rsp)));
            }));
    }

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     * @param projectId The ID of the project.
     * @param projectUserCreateRequest The project user create request payload.
     */
    public createProjectUser(projectId: string, projectUserCreateRequest: ProjectUserCreateRequest, _options?: ConfigurationOptions): Observable<ProjectUser> {
        return this.createProjectUserWithHttpInfo(projectId, projectUserCreateRequest, _options).pipe(map((apiResponse: HttpInfo<ProjectUser>) => apiResponse.data));
    }

    /**
     * Deletes an API key from the project.
     * @param projectId The ID of the project.
     * @param keyId The ID of the API key.
     */
    public deleteProjectApiKeyWithHttpInfo(projectId: string, keyId: string, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectApiKeyDeleteResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteProjectApiKey(projectId, keyId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteProjectApiKeyWithHttpInfo(rsp)));
            }));
    }

    /**
     * Deletes an API key from the project.
     * @param projectId The ID of the project.
     * @param keyId The ID of the API key.
     */
    public deleteProjectApiKey(projectId: string, keyId: string, _options?: ConfigurationOptions): Observable<ProjectApiKeyDeleteResponse> {
        return this.deleteProjectApiKeyWithHttpInfo(projectId, keyId, _options).pipe(map((apiResponse: HttpInfo<ProjectApiKeyDeleteResponse>) => apiResponse.data));
    }

    /**
     * Deletes a service account from the project.
     * @param projectId The ID of the project.
     * @param serviceAccountId The ID of the service account.
     */
    public deleteProjectServiceAccountWithHttpInfo(projectId: string, serviceAccountId: string, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectServiceAccountDeleteResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteProjectServiceAccount(projectId, serviceAccountId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteProjectServiceAccountWithHttpInfo(rsp)));
            }));
    }

    /**
     * Deletes a service account from the project.
     * @param projectId The ID of the project.
     * @param serviceAccountId The ID of the service account.
     */
    public deleteProjectServiceAccount(projectId: string, serviceAccountId: string, _options?: ConfigurationOptions): Observable<ProjectServiceAccountDeleteResponse> {
        return this.deleteProjectServiceAccountWithHttpInfo(projectId, serviceAccountId, _options).pipe(map((apiResponse: HttpInfo<ProjectServiceAccountDeleteResponse>) => apiResponse.data));
    }

    /**
     * Deletes a user from the project.
     * @param projectId The ID of the project.
     * @param userId The ID of the user.
     */
    public deleteProjectUserWithHttpInfo(projectId: string, userId: string, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectUserDeleteResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteProjectUser(projectId, userId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteProjectUserWithHttpInfo(rsp)));
            }));
    }

    /**
     * Deletes a user from the project.
     * @param projectId The ID of the project.
     * @param userId The ID of the user.
     */
    public deleteProjectUser(projectId: string, userId: string, _options?: ConfigurationOptions): Observable<ProjectUserDeleteResponse> {
        return this.deleteProjectUserWithHttpInfo(projectId, userId, _options).pipe(map((apiResponse: HttpInfo<ProjectUserDeleteResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of API keys in the project.
     * @param projectId The ID of the project.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listProjectApiKeysWithHttpInfo(projectId: string, limit?: number, after?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectApiKeyListResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listProjectApiKeys(projectId, limit, after, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listProjectApiKeysWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of API keys in the project.
     * @param projectId The ID of the project.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listProjectApiKeys(projectId: string, limit?: number, after?: string, _options?: ConfigurationOptions): Observable<ProjectApiKeyListResponse> {
        return this.listProjectApiKeysWithHttpInfo(projectId, limit, after, _options).pipe(map((apiResponse: HttpInfo<ProjectApiKeyListResponse>) => apiResponse.data));
    }

    /**
     * Returns the rate limits per model for a project.
     * @param projectId The ID of the project.
     * @param [limit] A limit on the number of objects to be returned. The default is 100. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listProjectRateLimitsWithHttpInfo(projectId: string, limit?: number, after?: string, before?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectRateLimitListResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listProjectRateLimits(projectId, limit, after, before, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listProjectRateLimitsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns the rate limits per model for a project.
     * @param projectId The ID of the project.
     * @param [limit] A limit on the number of objects to be returned. The default is 100. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listProjectRateLimits(projectId: string, limit?: number, after?: string, before?: string, _options?: ConfigurationOptions): Observable<ProjectRateLimitListResponse> {
        return this.listProjectRateLimitsWithHttpInfo(projectId, limit, after, before, _options).pipe(map((apiResponse: HttpInfo<ProjectRateLimitListResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of service accounts in the project.
     * @param projectId The ID of the project.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listProjectServiceAccountsWithHttpInfo(projectId: string, limit?: number, after?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectServiceAccountListResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listProjectServiceAccounts(projectId, limit, after, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listProjectServiceAccountsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of service accounts in the project.
     * @param projectId The ID of the project.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listProjectServiceAccounts(projectId: string, limit?: number, after?: string, _options?: ConfigurationOptions): Observable<ProjectServiceAccountListResponse> {
        return this.listProjectServiceAccountsWithHttpInfo(projectId, limit, after, _options).pipe(map((apiResponse: HttpInfo<ProjectServiceAccountListResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of users in the project.
     * @param projectId The ID of the project.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listProjectUsersWithHttpInfo(projectId: string, limit?: number, after?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectUserListResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listProjectUsers(projectId, limit, after, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listProjectUsersWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of users in the project.
     * @param projectId The ID of the project.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listProjectUsers(projectId: string, limit?: number, after?: string, _options?: ConfigurationOptions): Observable<ProjectUserListResponse> {
        return this.listProjectUsersWithHttpInfo(projectId, limit, after, _options).pipe(map((apiResponse: HttpInfo<ProjectUserListResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of projects.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [includeArchived] If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.
     */
    public listProjectsWithHttpInfo(limit?: number, after?: string, includeArchived?: boolean, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectListResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listProjects(limit, after, includeArchived, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listProjectsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of projects.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [includeArchived] If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.
     */
    public listProjects(limit?: number, after?: string, includeArchived?: boolean, _options?: ConfigurationOptions): Observable<ProjectListResponse> {
        return this.listProjectsWithHttpInfo(limit, after, includeArchived, _options).pipe(map((apiResponse: HttpInfo<ProjectListResponse>) => apiResponse.data));
    }

    /**
     * Modifies a project in the organization.
     * @param projectId The ID of the project.
     * @param projectUpdateRequest The project update request payload.
     */
    public modifyProjectWithHttpInfo(projectId: string, projectUpdateRequest: ProjectUpdateRequest, _options?: ConfigurationOptions): Observable<HttpInfo<Project>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.modifyProject(projectId, projectUpdateRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyProjectWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies a project in the organization.
     * @param projectId The ID of the project.
     * @param projectUpdateRequest The project update request payload.
     */
    public modifyProject(projectId: string, projectUpdateRequest: ProjectUpdateRequest, _options?: ConfigurationOptions): Observable<Project> {
        return this.modifyProjectWithHttpInfo(projectId, projectUpdateRequest, _options).pipe(map((apiResponse: HttpInfo<Project>) => apiResponse.data));
    }

    /**
     * Modifies a user\'s role in the project.
     * @param projectId The ID of the project.
     * @param userId The ID of the user.
     * @param projectUserUpdateRequest The project user update request payload.
     */
    public modifyProjectUserWithHttpInfo(projectId: string, userId: string, projectUserUpdateRequest: ProjectUserUpdateRequest, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectUser>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.modifyProjectUser(projectId, userId, projectUserUpdateRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyProjectUserWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies a user\'s role in the project.
     * @param projectId The ID of the project.
     * @param userId The ID of the user.
     * @param projectUserUpdateRequest The project user update request payload.
     */
    public modifyProjectUser(projectId: string, userId: string, projectUserUpdateRequest: ProjectUserUpdateRequest, _options?: ConfigurationOptions): Observable<ProjectUser> {
        return this.modifyProjectUserWithHttpInfo(projectId, userId, projectUserUpdateRequest, _options).pipe(map((apiResponse: HttpInfo<ProjectUser>) => apiResponse.data));
    }

    /**
     * Retrieves a project.
     * @param projectId The ID of the project.
     */
    public retrieveProjectWithHttpInfo(projectId: string, _options?: ConfigurationOptions): Observable<HttpInfo<Project>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.retrieveProject(projectId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveProjectWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a project.
     * @param projectId The ID of the project.
     */
    public retrieveProject(projectId: string, _options?: ConfigurationOptions): Observable<Project> {
        return this.retrieveProjectWithHttpInfo(projectId, _options).pipe(map((apiResponse: HttpInfo<Project>) => apiResponse.data));
    }

    /**
     * Retrieves an API key in the project.
     * @param projectId The ID of the project.
     * @param keyId The ID of the API key.
     */
    public retrieveProjectApiKeyWithHttpInfo(projectId: string, keyId: string, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectApiKey>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.retrieveProjectApiKey(projectId, keyId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveProjectApiKeyWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves an API key in the project.
     * @param projectId The ID of the project.
     * @param keyId The ID of the API key.
     */
    public retrieveProjectApiKey(projectId: string, keyId: string, _options?: ConfigurationOptions): Observable<ProjectApiKey> {
        return this.retrieveProjectApiKeyWithHttpInfo(projectId, keyId, _options).pipe(map((apiResponse: HttpInfo<ProjectApiKey>) => apiResponse.data));
    }

    /**
     * Retrieves a service account in the project.
     * @param projectId The ID of the project.
     * @param serviceAccountId The ID of the service account.
     */
    public retrieveProjectServiceAccountWithHttpInfo(projectId: string, serviceAccountId: string, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectServiceAccount>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.retrieveProjectServiceAccount(projectId, serviceAccountId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveProjectServiceAccountWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a service account in the project.
     * @param projectId The ID of the project.
     * @param serviceAccountId The ID of the service account.
     */
    public retrieveProjectServiceAccount(projectId: string, serviceAccountId: string, _options?: ConfigurationOptions): Observable<ProjectServiceAccount> {
        return this.retrieveProjectServiceAccountWithHttpInfo(projectId, serviceAccountId, _options).pipe(map((apiResponse: HttpInfo<ProjectServiceAccount>) => apiResponse.data));
    }

    /**
     * Retrieves a user in the project.
     * @param projectId The ID of the project.
     * @param userId The ID of the user.
     */
    public retrieveProjectUserWithHttpInfo(projectId: string, userId: string, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectUser>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.retrieveProjectUser(projectId, userId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveProjectUserWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a user in the project.
     * @param projectId The ID of the project.
     * @param userId The ID of the user.
     */
    public retrieveProjectUser(projectId: string, userId: string, _options?: ConfigurationOptions): Observable<ProjectUser> {
        return this.retrieveProjectUserWithHttpInfo(projectId, userId, _options).pipe(map((apiResponse: HttpInfo<ProjectUser>) => apiResponse.data));
    }

    /**
     * Updates a project rate limit.
     * @param projectId The ID of the project.
     * @param rateLimitId The ID of the rate limit.
     * @param projectRateLimitUpdateRequest The project rate limit update request payload.
     */
    public updateProjectRateLimitsWithHttpInfo(projectId: string, rateLimitId: string, projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest, _options?: ConfigurationOptions): Observable<HttpInfo<ProjectRateLimit>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.updateProjectRateLimitsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Updates a project rate limit.
     * @param projectId The ID of the project.
     * @param rateLimitId The ID of the rate limit.
     * @param projectRateLimitUpdateRequest The project rate limit update request payload.
     */
    public updateProjectRateLimits(projectId: string, rateLimitId: string, projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest, _options?: ConfigurationOptions): Observable<ProjectRateLimit> {
        return this.updateProjectRateLimitsWithHttpInfo(projectId, rateLimitId, projectRateLimitUpdateRequest, _options).pipe(map((apiResponse: HttpInfo<ProjectRateLimit>) => apiResponse.data));
    }

}

import { RealtimeApiRequestFactory, RealtimeApiResponseProcessor} from "../apis/RealtimeApi";
export class ObservableRealtimeApi {
    private requestFactory: RealtimeApiRequestFactory;
    private responseProcessor: RealtimeApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: RealtimeApiRequestFactory,
        responseProcessor?: RealtimeApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new RealtimeApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new RealtimeApiResponseProcessor();
    }

    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
     * @param realtimeSessionCreateRequest Create an ephemeral API key with the given session configuration.
     */
    public createRealtimeSessionWithHttpInfo(realtimeSessionCreateRequest: RealtimeSessionCreateRequest, _options?: ConfigurationOptions): Observable<HttpInfo<RealtimeSessionCreateResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createRealtimeSession(realtimeSessionCreateRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createRealtimeSessionWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
     * @param realtimeSessionCreateRequest Create an ephemeral API key with the given session configuration.
     */
    public createRealtimeSession(realtimeSessionCreateRequest: RealtimeSessionCreateRequest, _options?: ConfigurationOptions): Observable<RealtimeSessionCreateResponse> {
        return this.createRealtimeSessionWithHttpInfo(realtimeSessionCreateRequest, _options).pipe(map((apiResponse: HttpInfo<RealtimeSessionCreateResponse>) => apiResponse.data));
    }

}

import { UploadsApiRequestFactory, UploadsApiResponseProcessor} from "../apis/UploadsApi";
export class ObservableUploadsApi {
    private requestFactory: UploadsApiRequestFactory;
    private responseProcessor: UploadsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: UploadsApiRequestFactory,
        responseProcessor?: UploadsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new UploadsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new UploadsApiResponseProcessor();
    }

    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
     * @param uploadId The ID of the Upload. 
     * @param data The chunk of bytes for this Part. 
     */
    public addUploadPartWithHttpInfo(uploadId: string, data: HttpFile, _options?: ConfigurationOptions): Observable<HttpInfo<UploadPart>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.addUploadPart(uploadId, data, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.addUploadPartWithHttpInfo(rsp)));
            }));
    }

    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
     * @param uploadId The ID of the Upload. 
     * @param data The chunk of bytes for this Part. 
     */
    public addUploadPart(uploadId: string, data: HttpFile, _options?: ConfigurationOptions): Observable<UploadPart> {
        return this.addUploadPartWithHttpInfo(uploadId, data, _options).pipe(map((apiResponse: HttpInfo<UploadPart>) => apiResponse.data));
    }

    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled. 
     * @param uploadId The ID of the Upload. 
     */
    public cancelUploadWithHttpInfo(uploadId: string, _options?: ConfigurationOptions): Observable<HttpInfo<Upload>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.cancelUpload(uploadId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.cancelUploadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled. 
     * @param uploadId The ID of the Upload. 
     */
    public cancelUpload(uploadId: string, _options?: ConfigurationOptions): Observable<Upload> {
        return this.cancelUploadWithHttpInfo(uploadId, _options).pipe(map((apiResponse: HttpInfo<Upload>) => apiResponse.data));
    }

    /**
     * Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
     * @param uploadId The ID of the Upload. 
     * @param completeUploadRequest
     */
    public completeUploadWithHttpInfo(uploadId: string, completeUploadRequest: CompleteUploadRequest, _options?: ConfigurationOptions): Observable<HttpInfo<Upload>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.completeUpload(uploadId, completeUploadRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.completeUploadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
     * @param uploadId The ID of the Upload. 
     * @param completeUploadRequest
     */
    public completeUpload(uploadId: string, completeUploadRequest: CompleteUploadRequest, _options?: ConfigurationOptions): Observable<Upload> {
        return this.completeUploadWithHttpInfo(uploadId, completeUploadRequest, _options).pipe(map((apiResponse: HttpInfo<Upload>) => apiResponse.data));
    }

    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
     * @param createUploadRequest
     */
    public createUploadWithHttpInfo(createUploadRequest: CreateUploadRequest, _options?: ConfigurationOptions): Observable<HttpInfo<Upload>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createUpload(createUploadRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createUploadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
     * @param createUploadRequest
     */
    public createUpload(createUploadRequest: CreateUploadRequest, _options?: ConfigurationOptions): Observable<Upload> {
        return this.createUploadWithHttpInfo(createUploadRequest, _options).pipe(map((apiResponse: HttpInfo<Upload>) => apiResponse.data));
    }

}

import { UsageApiRequestFactory, UsageApiResponseProcessor} from "../apis/UsageApi";
export class ObservableUsageApi {
    private requestFactory: UsageApiRequestFactory;
    private responseProcessor: UsageApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: UsageApiRequestFactory,
        responseProcessor?: UsageApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new UsageApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new UsageApiResponseProcessor();
    }

    /**
     * Get audio speeches usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageAudioSpeechesWithHttpInfo(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<HttpInfo<UsageResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.usageAudioSpeechesWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get audio speeches usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageAudioSpeeches(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<UsageResponse> {
        return this.usageAudioSpeechesWithHttpInfo(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, _options).pipe(map((apiResponse: HttpInfo<UsageResponse>) => apiResponse.data));
    }

    /**
     * Get audio transcriptions usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageAudioTranscriptionsWithHttpInfo(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<HttpInfo<UsageResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.usageAudioTranscriptionsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get audio transcriptions usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageAudioTranscriptions(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<UsageResponse> {
        return this.usageAudioTranscriptionsWithHttpInfo(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, _options).pipe(map((apiResponse: HttpInfo<UsageResponse>) => apiResponse.data));
    }

    /**
     * Get code interpreter sessions usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageCodeInterpreterSessionsWithHttpInfo(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, groupBy?: Array<'project_id'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<HttpInfo<UsageResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.usageCodeInterpreterSessionsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get code interpreter sessions usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageCodeInterpreterSessions(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, groupBy?: Array<'project_id'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<UsageResponse> {
        return this.usageCodeInterpreterSessionsWithHttpInfo(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, _options).pipe(map((apiResponse: HttpInfo<UsageResponse>) => apiResponse.data));
    }

    /**
     * Get completions usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [batch] If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. 
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageCompletionsWithHttpInfo(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, batch?: boolean, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'batch'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<HttpInfo<UsageResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.usageCompletionsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get completions usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [batch] If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. 
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageCompletions(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, batch?: boolean, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'batch'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<UsageResponse> {
        return this.usageCompletionsWithHttpInfo(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page, _options).pipe(map((apiResponse: HttpInfo<UsageResponse>) => apiResponse.data));
    }

    /**
     * Get costs details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only costs for these projects.
     * @param [groupBy] Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.
     * @param [limit] A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageCostsWithHttpInfo(startTime: number, endTime?: number, bucketWidth?: '1d', projectIds?: Array<string>, groupBy?: Array<'project_id' | 'line_item'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<HttpInfo<UsageResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.usageCostsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get costs details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only costs for these projects.
     * @param [groupBy] Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.
     * @param [limit] A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageCosts(startTime: number, endTime?: number, bucketWidth?: '1d', projectIds?: Array<string>, groupBy?: Array<'project_id' | 'line_item'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<UsageResponse> {
        return this.usageCostsWithHttpInfo(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, _options).pipe(map((apiResponse: HttpInfo<UsageResponse>) => apiResponse.data));
    }

    /**
     * Get embeddings usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageEmbeddingsWithHttpInfo(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<HttpInfo<UsageResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.usageEmbeddingsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get embeddings usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageEmbeddings(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<UsageResponse> {
        return this.usageEmbeddingsWithHttpInfo(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, _options).pipe(map((apiResponse: HttpInfo<UsageResponse>) => apiResponse.data));
    }

    /**
     * Get images usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [sources] Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.
     * @param [sizes] Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageImagesWithHttpInfo(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', sources?: Array<'image.generation' | 'image.edit' | 'image.variation'>, sizes?: Array<'256x256' | '512x512' | '1024x1024' | '1792x1792' | '1024x1792'>, projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'size' | 'source'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<HttpInfo<UsageResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.usageImagesWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get images usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [sources] Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.
     * @param [sizes] Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageImages(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', sources?: Array<'image.generation' | 'image.edit' | 'image.variation'>, sizes?: Array<'256x256' | '512x512' | '1024x1024' | '1792x1792' | '1024x1792'>, projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'size' | 'source'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<UsageResponse> {
        return this.usageImagesWithHttpInfo(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, _options).pipe(map((apiResponse: HttpInfo<UsageResponse>) => apiResponse.data));
    }

    /**
     * Get moderations usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageModerationsWithHttpInfo(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<HttpInfo<UsageResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.usageModerationsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get moderations usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [userIds] Return only usage for these users.
     * @param [apiKeyIds] Return only usage for these API keys.
     * @param [models] Return only usage for these models.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageModerations(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, userIds?: Array<string>, apiKeyIds?: Array<string>, models?: Array<string>, groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<UsageResponse> {
        return this.usageModerationsWithHttpInfo(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, _options).pipe(map((apiResponse: HttpInfo<UsageResponse>) => apiResponse.data));
    }

    /**
     * Get vector stores usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageVectorStoresWithHttpInfo(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, groupBy?: Array<'project_id'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<HttpInfo<UsageResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.usageVectorStoresWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get vector stores usage details for the organization.
     * @param startTime Start time (Unix seconds) of the query time range, inclusive.
     * @param [endTime] End time (Unix seconds) of the query time range, exclusive.
     * @param [bucketWidth] Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @param [projectIds] Return only usage for these projects.
     * @param [groupBy] Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
     * @param [limit] Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * @param [page] A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     */
    public usageVectorStores(startTime: number, endTime?: number, bucketWidth?: '1m' | '1h' | '1d', projectIds?: Array<string>, groupBy?: Array<'project_id'>, limit?: number, page?: string, _options?: ConfigurationOptions): Observable<UsageResponse> {
        return this.usageVectorStoresWithHttpInfo(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, _options).pipe(map((apiResponse: HttpInfo<UsageResponse>) => apiResponse.data));
    }

}

import { UsersApiRequestFactory, UsersApiResponseProcessor} from "../apis/UsersApi";
export class ObservableUsersApi {
    private requestFactory: UsersApiRequestFactory;
    private responseProcessor: UsersApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: UsersApiRequestFactory,
        responseProcessor?: UsersApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new UsersApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new UsersApiResponseProcessor();
    }

    /**
     * Deletes a user from the organization.
     * @param userId The ID of the user.
     */
    public deleteUserWithHttpInfo(userId: string, _options?: ConfigurationOptions): Observable<HttpInfo<UserDeleteResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteUser(userId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteUserWithHttpInfo(rsp)));
            }));
    }

    /**
     * Deletes a user from the organization.
     * @param userId The ID of the user.
     */
    public deleteUser(userId: string, _options?: ConfigurationOptions): Observable<UserDeleteResponse> {
        return this.deleteUserWithHttpInfo(userId, _options).pipe(map((apiResponse: HttpInfo<UserDeleteResponse>) => apiResponse.data));
    }

    /**
     * Lists all of the users in the organization.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listUsersWithHttpInfo(limit?: number, after?: string, _options?: ConfigurationOptions): Observable<HttpInfo<UserListResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listUsers(limit, after, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listUsersWithHttpInfo(rsp)));
            }));
    }

    /**
     * Lists all of the users in the organization.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     */
    public listUsers(limit?: number, after?: string, _options?: ConfigurationOptions): Observable<UserListResponse> {
        return this.listUsersWithHttpInfo(limit, after, _options).pipe(map((apiResponse: HttpInfo<UserListResponse>) => apiResponse.data));
    }

    /**
     * Modifies a user\'s role in the organization.
     * @param userId The ID of the user.
     * @param userRoleUpdateRequest The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;.
     */
    public modifyUserWithHttpInfo(userId: string, userRoleUpdateRequest: UserRoleUpdateRequest, _options?: ConfigurationOptions): Observable<HttpInfo<User>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.modifyUser(userId, userRoleUpdateRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyUserWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies a user\'s role in the organization.
     * @param userId The ID of the user.
     * @param userRoleUpdateRequest The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;.
     */
    public modifyUser(userId: string, userRoleUpdateRequest: UserRoleUpdateRequest, _options?: ConfigurationOptions): Observable<User> {
        return this.modifyUserWithHttpInfo(userId, userRoleUpdateRequest, _options).pipe(map((apiResponse: HttpInfo<User>) => apiResponse.data));
    }

    /**
     * Retrieves a user by their identifier.
     * @param userId The ID of the user.
     */
    public retrieveUserWithHttpInfo(userId: string, _options?: ConfigurationOptions): Observable<HttpInfo<User>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.retrieveUser(userId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveUserWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a user by their identifier.
     * @param userId The ID of the user.
     */
    public retrieveUser(userId: string, _options?: ConfigurationOptions): Observable<User> {
        return this.retrieveUserWithHttpInfo(userId, _options).pipe(map((apiResponse: HttpInfo<User>) => apiResponse.data));
    }

}

import { VectorStoresApiRequestFactory, VectorStoresApiResponseProcessor} from "../apis/VectorStoresApi";
export class ObservableVectorStoresApi {
    private requestFactory: VectorStoresApiRequestFactory;
    private responseProcessor: VectorStoresApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: VectorStoresApiRequestFactory,
        responseProcessor?: VectorStoresApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new VectorStoresApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new VectorStoresApiResponseProcessor();
    }

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * @param vectorStoreId The ID of the vector store that the file batch belongs to.
     * @param batchId The ID of the file batch to cancel.
     */
    public cancelVectorStoreFileBatchWithHttpInfo(vectorStoreId: string, batchId: string, _options?: ConfigurationOptions): Observable<HttpInfo<VectorStoreFileBatchObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.cancelVectorStoreFileBatch(vectorStoreId, batchId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.cancelVectorStoreFileBatchWithHttpInfo(rsp)));
            }));
    }

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * @param vectorStoreId The ID of the vector store that the file batch belongs to.
     * @param batchId The ID of the file batch to cancel.
     */
    public cancelVectorStoreFileBatch(vectorStoreId: string, batchId: string, _options?: ConfigurationOptions): Observable<VectorStoreFileBatchObject> {
        return this.cancelVectorStoreFileBatchWithHttpInfo(vectorStoreId, batchId, _options).pipe(map((apiResponse: HttpInfo<VectorStoreFileBatchObject>) => apiResponse.data));
    }

    /**
     * Create a vector store.
     * @param createVectorStoreRequest
     */
    public createVectorStoreWithHttpInfo(createVectorStoreRequest: CreateVectorStoreRequest, _options?: ConfigurationOptions): Observable<HttpInfo<VectorStoreObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createVectorStore(createVectorStoreRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createVectorStoreWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a vector store.
     * @param createVectorStoreRequest
     */
    public createVectorStore(createVectorStoreRequest: CreateVectorStoreRequest, _options?: ConfigurationOptions): Observable<VectorStoreObject> {
        return this.createVectorStoreWithHttpInfo(createVectorStoreRequest, _options).pipe(map((apiResponse: HttpInfo<VectorStoreObject>) => apiResponse.data));
    }

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * @param vectorStoreId The ID of the vector store for which to create a File. 
     * @param createVectorStoreFileRequest
     */
    public createVectorStoreFileWithHttpInfo(vectorStoreId: string, createVectorStoreFileRequest: CreateVectorStoreFileRequest, _options?: ConfigurationOptions): Observable<HttpInfo<VectorStoreFileObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createVectorStoreFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * @param vectorStoreId The ID of the vector store for which to create a File. 
     * @param createVectorStoreFileRequest
     */
    public createVectorStoreFile(vectorStoreId: string, createVectorStoreFileRequest: CreateVectorStoreFileRequest, _options?: ConfigurationOptions): Observable<VectorStoreFileObject> {
        return this.createVectorStoreFileWithHttpInfo(vectorStoreId, createVectorStoreFileRequest, _options).pipe(map((apiResponse: HttpInfo<VectorStoreFileObject>) => apiResponse.data));
    }

    /**
     * Create a vector store file batch.
     * @param vectorStoreId The ID of the vector store for which to create a File Batch. 
     * @param createVectorStoreFileBatchRequest
     */
    public createVectorStoreFileBatchWithHttpInfo(vectorStoreId: string, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest, _options?: ConfigurationOptions): Observable<HttpInfo<VectorStoreFileBatchObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createVectorStoreFileBatchWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a vector store file batch.
     * @param vectorStoreId The ID of the vector store for which to create a File Batch. 
     * @param createVectorStoreFileBatchRequest
     */
    public createVectorStoreFileBatch(vectorStoreId: string, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest, _options?: ConfigurationOptions): Observable<VectorStoreFileBatchObject> {
        return this.createVectorStoreFileBatchWithHttpInfo(vectorStoreId, createVectorStoreFileBatchRequest, _options).pipe(map((apiResponse: HttpInfo<VectorStoreFileBatchObject>) => apiResponse.data));
    }

    /**
     * Delete a vector store.
     * @param vectorStoreId The ID of the vector store to delete.
     */
    public deleteVectorStoreWithHttpInfo(vectorStoreId: string, _options?: ConfigurationOptions): Observable<HttpInfo<DeleteVectorStoreResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteVectorStore(vectorStoreId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteVectorStoreWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete a vector store.
     * @param vectorStoreId The ID of the vector store to delete.
     */
    public deleteVectorStore(vectorStoreId: string, _options?: ConfigurationOptions): Observable<DeleteVectorStoreResponse> {
        return this.deleteVectorStoreWithHttpInfo(vectorStoreId, _options).pipe(map((apiResponse: HttpInfo<DeleteVectorStoreResponse>) => apiResponse.data));
    }

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * @param vectorStoreId The ID of the vector store that the file belongs to.
     * @param fileId The ID of the file to delete.
     */
    public deleteVectorStoreFileWithHttpInfo(vectorStoreId: string, fileId: string, _options?: ConfigurationOptions): Observable<HttpInfo<DeleteVectorStoreFileResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.deleteVectorStoreFile(vectorStoreId, fileId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteVectorStoreFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * @param vectorStoreId The ID of the vector store that the file belongs to.
     * @param fileId The ID of the file to delete.
     */
    public deleteVectorStoreFile(vectorStoreId: string, fileId: string, _options?: ConfigurationOptions): Observable<DeleteVectorStoreFileResponse> {
        return this.deleteVectorStoreFileWithHttpInfo(vectorStoreId, fileId, _options).pipe(map((apiResponse: HttpInfo<DeleteVectorStoreFileResponse>) => apiResponse.data));
    }

    /**
     * Retrieves a vector store.
     * @param vectorStoreId The ID of the vector store to retrieve.
     */
    public getVectorStoreWithHttpInfo(vectorStoreId: string, _options?: ConfigurationOptions): Observable<HttpInfo<VectorStoreObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getVectorStore(vectorStoreId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getVectorStoreWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a vector store.
     * @param vectorStoreId The ID of the vector store to retrieve.
     */
    public getVectorStore(vectorStoreId: string, _options?: ConfigurationOptions): Observable<VectorStoreObject> {
        return this.getVectorStoreWithHttpInfo(vectorStoreId, _options).pipe(map((apiResponse: HttpInfo<VectorStoreObject>) => apiResponse.data));
    }

    /**
     * Retrieves a vector store file.
     * @param vectorStoreId The ID of the vector store that the file belongs to.
     * @param fileId The ID of the file being retrieved.
     */
    public getVectorStoreFileWithHttpInfo(vectorStoreId: string, fileId: string, _options?: ConfigurationOptions): Observable<HttpInfo<VectorStoreFileObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getVectorStoreFile(vectorStoreId, fileId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getVectorStoreFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a vector store file.
     * @param vectorStoreId The ID of the vector store that the file belongs to.
     * @param fileId The ID of the file being retrieved.
     */
    public getVectorStoreFile(vectorStoreId: string, fileId: string, _options?: ConfigurationOptions): Observable<VectorStoreFileObject> {
        return this.getVectorStoreFileWithHttpInfo(vectorStoreId, fileId, _options).pipe(map((apiResponse: HttpInfo<VectorStoreFileObject>) => apiResponse.data));
    }

    /**
     * Retrieves a vector store file batch.
     * @param vectorStoreId The ID of the vector store that the file batch belongs to.
     * @param batchId The ID of the file batch being retrieved.
     */
    public getVectorStoreFileBatchWithHttpInfo(vectorStoreId: string, batchId: string, _options?: ConfigurationOptions): Observable<HttpInfo<VectorStoreFileBatchObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.getVectorStoreFileBatch(vectorStoreId, batchId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getVectorStoreFileBatchWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a vector store file batch.
     * @param vectorStoreId The ID of the vector store that the file batch belongs to.
     * @param batchId The ID of the file batch being retrieved.
     */
    public getVectorStoreFileBatch(vectorStoreId: string, batchId: string, _options?: ConfigurationOptions): Observable<VectorStoreFileBatchObject> {
        return this.getVectorStoreFileBatchWithHttpInfo(vectorStoreId, batchId, _options).pipe(map((apiResponse: HttpInfo<VectorStoreFileBatchObject>) => apiResponse.data));
    }

    /**
     * Returns a list of vector store files in a batch.
     * @param vectorStoreId The ID of the vector store that the files belong to.
     * @param batchId The ID of the file batch that the files belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param [filter] Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
     */
    public listFilesInVectorStoreBatchWithHttpInfo(vectorStoreId: string, batchId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, filter?: 'in_progress' | 'completed' | 'failed' | 'cancelled', _options?: ConfigurationOptions): Observable<HttpInfo<ListVectorStoreFilesResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listFilesInVectorStoreBatchWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of vector store files in a batch.
     * @param vectorStoreId The ID of the vector store that the files belong to.
     * @param batchId The ID of the file batch that the files belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param [filter] Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
     */
    public listFilesInVectorStoreBatch(vectorStoreId: string, batchId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, filter?: 'in_progress' | 'completed' | 'failed' | 'cancelled', _options?: ConfigurationOptions): Observable<ListVectorStoreFilesResponse> {
        return this.listFilesInVectorStoreBatchWithHttpInfo(vectorStoreId, batchId, limit, order, after, before, filter, _options).pipe(map((apiResponse: HttpInfo<ListVectorStoreFilesResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of vector store files.
     * @param vectorStoreId The ID of the vector store that the files belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param [filter] Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
     */
    public listVectorStoreFilesWithHttpInfo(vectorStoreId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, filter?: 'in_progress' | 'completed' | 'failed' | 'cancelled', _options?: ConfigurationOptions): Observable<HttpInfo<ListVectorStoreFilesResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listVectorStoreFilesWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of vector store files.
     * @param vectorStoreId The ID of the vector store that the files belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param [filter] Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
     */
    public listVectorStoreFiles(vectorStoreId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, filter?: 'in_progress' | 'completed' | 'failed' | 'cancelled', _options?: ConfigurationOptions): Observable<ListVectorStoreFilesResponse> {
        return this.listVectorStoreFilesWithHttpInfo(vectorStoreId, limit, order, after, before, filter, _options).pipe(map((apiResponse: HttpInfo<ListVectorStoreFilesResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of vector stores.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listVectorStoresWithHttpInfo(limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: ConfigurationOptions): Observable<HttpInfo<ListVectorStoresResponse>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.listVectorStores(limit, order, after, before, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listVectorStoresWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of vector stores.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listVectorStores(limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: ConfigurationOptions): Observable<ListVectorStoresResponse> {
        return this.listVectorStoresWithHttpInfo(limit, order, after, before, _options).pipe(map((apiResponse: HttpInfo<ListVectorStoresResponse>) => apiResponse.data));
    }

    /**
     * Modifies a vector store.
     * @param vectorStoreId The ID of the vector store to modify.
     * @param updateVectorStoreRequest
     */
    public modifyVectorStoreWithHttpInfo(vectorStoreId: string, updateVectorStoreRequest: UpdateVectorStoreRequest, _options?: ConfigurationOptions): Observable<HttpInfo<VectorStoreObject>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.modifyVectorStore(vectorStoreId, updateVectorStoreRequest, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyVectorStoreWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies a vector store.
     * @param vectorStoreId The ID of the vector store to modify.
     * @param updateVectorStoreRequest
     */
    public modifyVectorStore(vectorStoreId: string, updateVectorStoreRequest: UpdateVectorStoreRequest, _options?: ConfigurationOptions): Observable<VectorStoreObject> {
        return this.modifyVectorStoreWithHttpInfo(vectorStoreId, updateVectorStoreRequest, _options).pipe(map((apiResponse: HttpInfo<VectorStoreObject>) => apiResponse.data));
    }

}
