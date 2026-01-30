import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions } from '../configuration'
import type { Middleware } from '../middleware';

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

import { ObservableAssistantsApi } from "./ObservableAPI";
import { AssistantsApiRequestFactory, AssistantsApiResponseProcessor} from "../apis/AssistantsApi";

export interface AssistantsApiCancelRunRequest {
    /**
     * The ID of the thread to which this run belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApicancelRun
     */
    threadId: string
    /**
     * The ID of the run to cancel.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApicancelRun
     */
    runId: string
}

export interface AssistantsApiCreateAssistantRequest {
    /**
     * 
     * @type CreateAssistantRequest
     * @memberof AssistantsApicreateAssistant
     */
    createAssistantRequest: CreateAssistantRequest
}

export interface AssistantsApiCreateMessageRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApicreateMessage
     */
    threadId: string
    /**
     * 
     * @type CreateMessageRequest
     * @memberof AssistantsApicreateMessage
     */
    createMessageRequest: CreateMessageRequest
}

export interface AssistantsApiCreateRunRequest {
    /**
     * The ID of the thread to run.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApicreateRun
     */
    threadId: string
    /**
     * 
     * @type CreateRunRequest
     * @memberof AssistantsApicreateRun
     */
    createRunRequest: CreateRunRequest
    /**
     * A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     * Defaults to: undefined
     * @type Array&lt;&#39;step_details.tool_calls[*].file_search.results[*].content&#39;&gt;
     * @memberof AssistantsApicreateRun
     */
    include?: Array<'step_details.tool_calls[*].file_search.results[*].content'>
}

export interface AssistantsApiCreateThreadRequest {
    /**
     * 
     * @type CreateThreadRequest
     * @memberof AssistantsApicreateThread
     */
    createThreadRequest?: CreateThreadRequest
}

export interface AssistantsApiCreateThreadAndRunRequest {
    /**
     * 
     * @type CreateThreadAndRunRequest
     * @memberof AssistantsApicreateThreadAndRun
     */
    createThreadAndRunRequest: CreateThreadAndRunRequest
}

export interface AssistantsApiDeleteAssistantRequest {
    /**
     * The ID of the assistant to delete.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApideleteAssistant
     */
    assistantId: string
}

export interface AssistantsApiDeleteMessageRequest {
    /**
     * The ID of the thread to which this message belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApideleteMessage
     */
    threadId: string
    /**
     * The ID of the message to delete.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApideleteMessage
     */
    messageId: string
}

export interface AssistantsApiDeleteThreadRequest {
    /**
     * The ID of the thread to delete.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApideleteThread
     */
    threadId: string
}

export interface AssistantsApiGetAssistantRequest {
    /**
     * The ID of the assistant to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetAssistant
     */
    assistantId: string
}

export interface AssistantsApiGetMessageRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetMessage
     */
    threadId: string
    /**
     * The ID of the message to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetMessage
     */
    messageId: string
}

export interface AssistantsApiGetRunRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) that was run.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetRun
     */
    threadId: string
    /**
     * The ID of the run to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetRun
     */
    runId: string
}

export interface AssistantsApiGetRunStepRequest {
    /**
     * The ID of the thread to which the run and run step belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetRunStep
     */
    threadId: string
    /**
     * The ID of the run to which the run step belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetRunStep
     */
    runId: string
    /**
     * The ID of the run step to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetRunStep
     */
    stepId: string
    /**
     * A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     * Defaults to: undefined
     * @type Array&lt;&#39;step_details.tool_calls[*].file_search.results[*].content&#39;&gt;
     * @memberof AssistantsApigetRunStep
     */
    include?: Array<'step_details.tool_calls[*].file_search.results[*].content'>
}

export interface AssistantsApiGetThreadRequest {
    /**
     * The ID of the thread to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetThread
     */
    threadId: string
}

export interface AssistantsApiListAssistantsRequest {
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AssistantsApilistAssistants
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof AssistantsApilistAssistants
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistAssistants
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistAssistants
     */
    before?: string
}

export interface AssistantsApiListMessagesRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) the messages belong to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessages
     */
    threadId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AssistantsApilistMessages
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof AssistantsApilistMessages
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessages
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessages
     */
    before?: string
    /**
     * Filter messages by the run ID that generated them. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessages
     */
    runId?: string
}

export interface AssistantsApiListRunStepsRequest {
    /**
     * The ID of the thread the run and run steps belong to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRunSteps
     */
    threadId: string
    /**
     * The ID of the run the run steps belong to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRunSteps
     */
    runId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AssistantsApilistRunSteps
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof AssistantsApilistRunSteps
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRunSteps
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRunSteps
     */
    before?: string
    /**
     * A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
     * Defaults to: undefined
     * @type Array&lt;&#39;step_details.tool_calls[*].file_search.results[*].content&#39;&gt;
     * @memberof AssistantsApilistRunSteps
     */
    include?: Array<'step_details.tool_calls[*].file_search.results[*].content'>
}

export interface AssistantsApiListRunsRequest {
    /**
     * The ID of the thread the run belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRuns
     */
    threadId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AssistantsApilistRuns
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof AssistantsApilistRuns
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRuns
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRuns
     */
    before?: string
}

export interface AssistantsApiModifyAssistantRequest {
    /**
     * The ID of the assistant to modify.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyAssistant
     */
    assistantId: string
    /**
     * 
     * @type ModifyAssistantRequest
     * @memberof AssistantsApimodifyAssistant
     */
    modifyAssistantRequest: ModifyAssistantRequest
}

export interface AssistantsApiModifyMessageRequest {
    /**
     * The ID of the thread to which this message belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyMessage
     */
    threadId: string
    /**
     * The ID of the message to modify.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyMessage
     */
    messageId: string
    /**
     * 
     * @type ModifyMessageRequest
     * @memberof AssistantsApimodifyMessage
     */
    modifyMessageRequest: ModifyMessageRequest
}

export interface AssistantsApiModifyRunRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) that was run.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyRun
     */
    threadId: string
    /**
     * The ID of the run to modify.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyRun
     */
    runId: string
    /**
     * 
     * @type ModifyRunRequest
     * @memberof AssistantsApimodifyRun
     */
    modifyRunRequest: ModifyRunRequest
}

export interface AssistantsApiModifyThreadRequest {
    /**
     * The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyThread
     */
    threadId: string
    /**
     * 
     * @type ModifyThreadRequest
     * @memberof AssistantsApimodifyThread
     */
    modifyThreadRequest: ModifyThreadRequest
}

export interface AssistantsApiSubmitToolOuputsToRunRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApisubmitToolOuputsToRun
     */
    threadId: string
    /**
     * The ID of the run that requires the tool output submission.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApisubmitToolOuputsToRun
     */
    runId: string
    /**
     * 
     * @type SubmitToolOutputsRunRequest
     * @memberof AssistantsApisubmitToolOuputsToRun
     */
    submitToolOutputsRunRequest: SubmitToolOutputsRunRequest
}

export class ObjectAssistantsApi {
    private api: ObservableAssistantsApi

    public constructor(configuration: Configuration, requestFactory?: AssistantsApiRequestFactory, responseProcessor?: AssistantsApiResponseProcessor) {
        this.api = new ObservableAssistantsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param param the request object
     */
    public cancelRunWithHttpInfo(param: AssistantsApiCancelRunRequest, options?: ConfigurationOptions): Promise<HttpInfo<RunObject>> {
        return this.api.cancelRunWithHttpInfo(param.threadId, param.runId,  options).toPromise();
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param param the request object
     */
    public cancelRun(param: AssistantsApiCancelRunRequest, options?: ConfigurationOptions): Promise<RunObject> {
        return this.api.cancelRun(param.threadId, param.runId,  options).toPromise();
    }

    /**
     * Create an assistant with a model and instructions.
     * @param param the request object
     */
    public createAssistantWithHttpInfo(param: AssistantsApiCreateAssistantRequest, options?: ConfigurationOptions): Promise<HttpInfo<AssistantObject>> {
        return this.api.createAssistantWithHttpInfo(param.createAssistantRequest,  options).toPromise();
    }

    /**
     * Create an assistant with a model and instructions.
     * @param param the request object
     */
    public createAssistant(param: AssistantsApiCreateAssistantRequest, options?: ConfigurationOptions): Promise<AssistantObject> {
        return this.api.createAssistant(param.createAssistantRequest,  options).toPromise();
    }

    /**
     * Create a message.
     * @param param the request object
     */
    public createMessageWithHttpInfo(param: AssistantsApiCreateMessageRequest, options?: ConfigurationOptions): Promise<HttpInfo<MessageObject>> {
        return this.api.createMessageWithHttpInfo(param.threadId, param.createMessageRequest,  options).toPromise();
    }

    /**
     * Create a message.
     * @param param the request object
     */
    public createMessage(param: AssistantsApiCreateMessageRequest, options?: ConfigurationOptions): Promise<MessageObject> {
        return this.api.createMessage(param.threadId, param.createMessageRequest,  options).toPromise();
    }

    /**
     * Create a run.
     * @param param the request object
     */
    public createRunWithHttpInfo(param: AssistantsApiCreateRunRequest, options?: ConfigurationOptions): Promise<HttpInfo<RunObject>> {
        return this.api.createRunWithHttpInfo(param.threadId, param.createRunRequest, param.include,  options).toPromise();
    }

    /**
     * Create a run.
     * @param param the request object
     */
    public createRun(param: AssistantsApiCreateRunRequest, options?: ConfigurationOptions): Promise<RunObject> {
        return this.api.createRun(param.threadId, param.createRunRequest, param.include,  options).toPromise();
    }

    /**
     * Create a thread.
     * @param param the request object
     */
    public createThreadWithHttpInfo(param: AssistantsApiCreateThreadRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ThreadObject>> {
        return this.api.createThreadWithHttpInfo(param.createThreadRequest,  options).toPromise();
    }

    /**
     * Create a thread.
     * @param param the request object
     */
    public createThread(param: AssistantsApiCreateThreadRequest = {}, options?: ConfigurationOptions): Promise<ThreadObject> {
        return this.api.createThread(param.createThreadRequest,  options).toPromise();
    }

    /**
     * Create a thread and run it in one request.
     * @param param the request object
     */
    public createThreadAndRunWithHttpInfo(param: AssistantsApiCreateThreadAndRunRequest, options?: ConfigurationOptions): Promise<HttpInfo<RunObject>> {
        return this.api.createThreadAndRunWithHttpInfo(param.createThreadAndRunRequest,  options).toPromise();
    }

    /**
     * Create a thread and run it in one request.
     * @param param the request object
     */
    public createThreadAndRun(param: AssistantsApiCreateThreadAndRunRequest, options?: ConfigurationOptions): Promise<RunObject> {
        return this.api.createThreadAndRun(param.createThreadAndRunRequest,  options).toPromise();
    }

    /**
     * Delete an assistant.
     * @param param the request object
     */
    public deleteAssistantWithHttpInfo(param: AssistantsApiDeleteAssistantRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeleteAssistantResponse>> {
        return this.api.deleteAssistantWithHttpInfo(param.assistantId,  options).toPromise();
    }

    /**
     * Delete an assistant.
     * @param param the request object
     */
    public deleteAssistant(param: AssistantsApiDeleteAssistantRequest, options?: ConfigurationOptions): Promise<DeleteAssistantResponse> {
        return this.api.deleteAssistant(param.assistantId,  options).toPromise();
    }

    /**
     * Deletes a message.
     * @param param the request object
     */
    public deleteMessageWithHttpInfo(param: AssistantsApiDeleteMessageRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeleteMessageResponse>> {
        return this.api.deleteMessageWithHttpInfo(param.threadId, param.messageId,  options).toPromise();
    }

    /**
     * Deletes a message.
     * @param param the request object
     */
    public deleteMessage(param: AssistantsApiDeleteMessageRequest, options?: ConfigurationOptions): Promise<DeleteMessageResponse> {
        return this.api.deleteMessage(param.threadId, param.messageId,  options).toPromise();
    }

    /**
     * Delete a thread.
     * @param param the request object
     */
    public deleteThreadWithHttpInfo(param: AssistantsApiDeleteThreadRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeleteThreadResponse>> {
        return this.api.deleteThreadWithHttpInfo(param.threadId,  options).toPromise();
    }

    /**
     * Delete a thread.
     * @param param the request object
     */
    public deleteThread(param: AssistantsApiDeleteThreadRequest, options?: ConfigurationOptions): Promise<DeleteThreadResponse> {
        return this.api.deleteThread(param.threadId,  options).toPromise();
    }

    /**
     * Retrieves an assistant.
     * @param param the request object
     */
    public getAssistantWithHttpInfo(param: AssistantsApiGetAssistantRequest, options?: ConfigurationOptions): Promise<HttpInfo<AssistantObject>> {
        return this.api.getAssistantWithHttpInfo(param.assistantId,  options).toPromise();
    }

    /**
     * Retrieves an assistant.
     * @param param the request object
     */
    public getAssistant(param: AssistantsApiGetAssistantRequest, options?: ConfigurationOptions): Promise<AssistantObject> {
        return this.api.getAssistant(param.assistantId,  options).toPromise();
    }

    /**
     * Retrieve a message.
     * @param param the request object
     */
    public getMessageWithHttpInfo(param: AssistantsApiGetMessageRequest, options?: ConfigurationOptions): Promise<HttpInfo<MessageObject>> {
        return this.api.getMessageWithHttpInfo(param.threadId, param.messageId,  options).toPromise();
    }

    /**
     * Retrieve a message.
     * @param param the request object
     */
    public getMessage(param: AssistantsApiGetMessageRequest, options?: ConfigurationOptions): Promise<MessageObject> {
        return this.api.getMessage(param.threadId, param.messageId,  options).toPromise();
    }

    /**
     * Retrieves a run.
     * @param param the request object
     */
    public getRunWithHttpInfo(param: AssistantsApiGetRunRequest, options?: ConfigurationOptions): Promise<HttpInfo<RunObject>> {
        return this.api.getRunWithHttpInfo(param.threadId, param.runId,  options).toPromise();
    }

    /**
     * Retrieves a run.
     * @param param the request object
     */
    public getRun(param: AssistantsApiGetRunRequest, options?: ConfigurationOptions): Promise<RunObject> {
        return this.api.getRun(param.threadId, param.runId,  options).toPromise();
    }

    /**
     * Retrieves a run step.
     * @param param the request object
     */
    public getRunStepWithHttpInfo(param: AssistantsApiGetRunStepRequest, options?: ConfigurationOptions): Promise<HttpInfo<RunStepObject>> {
        return this.api.getRunStepWithHttpInfo(param.threadId, param.runId, param.stepId, param.include,  options).toPromise();
    }

    /**
     * Retrieves a run step.
     * @param param the request object
     */
    public getRunStep(param: AssistantsApiGetRunStepRequest, options?: ConfigurationOptions): Promise<RunStepObject> {
        return this.api.getRunStep(param.threadId, param.runId, param.stepId, param.include,  options).toPromise();
    }

    /**
     * Retrieves a thread.
     * @param param the request object
     */
    public getThreadWithHttpInfo(param: AssistantsApiGetThreadRequest, options?: ConfigurationOptions): Promise<HttpInfo<ThreadObject>> {
        return this.api.getThreadWithHttpInfo(param.threadId,  options).toPromise();
    }

    /**
     * Retrieves a thread.
     * @param param the request object
     */
    public getThread(param: AssistantsApiGetThreadRequest, options?: ConfigurationOptions): Promise<ThreadObject> {
        return this.api.getThread(param.threadId,  options).toPromise();
    }

    /**
     * Returns a list of assistants.
     * @param param the request object
     */
    public listAssistantsWithHttpInfo(param: AssistantsApiListAssistantsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListAssistantsResponse>> {
        return this.api.listAssistantsWithHttpInfo(param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of assistants.
     * @param param the request object
     */
    public listAssistants(param: AssistantsApiListAssistantsRequest = {}, options?: ConfigurationOptions): Promise<ListAssistantsResponse> {
        return this.api.listAssistants(param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of messages for a given thread.
     * @param param the request object
     */
    public listMessagesWithHttpInfo(param: AssistantsApiListMessagesRequest, options?: ConfigurationOptions): Promise<HttpInfo<ListMessagesResponse>> {
        return this.api.listMessagesWithHttpInfo(param.threadId, param.limit, param.order, param.after, param.before, param.runId,  options).toPromise();
    }

    /**
     * Returns a list of messages for a given thread.
     * @param param the request object
     */
    public listMessages(param: AssistantsApiListMessagesRequest, options?: ConfigurationOptions): Promise<ListMessagesResponse> {
        return this.api.listMessages(param.threadId, param.limit, param.order, param.after, param.before, param.runId,  options).toPromise();
    }

    /**
     * Returns a list of run steps belonging to a run.
     * @param param the request object
     */
    public listRunStepsWithHttpInfo(param: AssistantsApiListRunStepsRequest, options?: ConfigurationOptions): Promise<HttpInfo<ListRunStepsResponse>> {
        return this.api.listRunStepsWithHttpInfo(param.threadId, param.runId, param.limit, param.order, param.after, param.before, param.include,  options).toPromise();
    }

    /**
     * Returns a list of run steps belonging to a run.
     * @param param the request object
     */
    public listRunSteps(param: AssistantsApiListRunStepsRequest, options?: ConfigurationOptions): Promise<ListRunStepsResponse> {
        return this.api.listRunSteps(param.threadId, param.runId, param.limit, param.order, param.after, param.before, param.include,  options).toPromise();
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param param the request object
     */
    public listRunsWithHttpInfo(param: AssistantsApiListRunsRequest, options?: ConfigurationOptions): Promise<HttpInfo<ListRunsResponse>> {
        return this.api.listRunsWithHttpInfo(param.threadId, param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param param the request object
     */
    public listRuns(param: AssistantsApiListRunsRequest, options?: ConfigurationOptions): Promise<ListRunsResponse> {
        return this.api.listRuns(param.threadId, param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Modifies an assistant.
     * @param param the request object
     */
    public modifyAssistantWithHttpInfo(param: AssistantsApiModifyAssistantRequest, options?: ConfigurationOptions): Promise<HttpInfo<AssistantObject>> {
        return this.api.modifyAssistantWithHttpInfo(param.assistantId, param.modifyAssistantRequest,  options).toPromise();
    }

    /**
     * Modifies an assistant.
     * @param param the request object
     */
    public modifyAssistant(param: AssistantsApiModifyAssistantRequest, options?: ConfigurationOptions): Promise<AssistantObject> {
        return this.api.modifyAssistant(param.assistantId, param.modifyAssistantRequest,  options).toPromise();
    }

    /**
     * Modifies a message.
     * @param param the request object
     */
    public modifyMessageWithHttpInfo(param: AssistantsApiModifyMessageRequest, options?: ConfigurationOptions): Promise<HttpInfo<MessageObject>> {
        return this.api.modifyMessageWithHttpInfo(param.threadId, param.messageId, param.modifyMessageRequest,  options).toPromise();
    }

    /**
     * Modifies a message.
     * @param param the request object
     */
    public modifyMessage(param: AssistantsApiModifyMessageRequest, options?: ConfigurationOptions): Promise<MessageObject> {
        return this.api.modifyMessage(param.threadId, param.messageId, param.modifyMessageRequest,  options).toPromise();
    }

    /**
     * Modifies a run.
     * @param param the request object
     */
    public modifyRunWithHttpInfo(param: AssistantsApiModifyRunRequest, options?: ConfigurationOptions): Promise<HttpInfo<RunObject>> {
        return this.api.modifyRunWithHttpInfo(param.threadId, param.runId, param.modifyRunRequest,  options).toPromise();
    }

    /**
     * Modifies a run.
     * @param param the request object
     */
    public modifyRun(param: AssistantsApiModifyRunRequest, options?: ConfigurationOptions): Promise<RunObject> {
        return this.api.modifyRun(param.threadId, param.runId, param.modifyRunRequest,  options).toPromise();
    }

    /**
     * Modifies a thread.
     * @param param the request object
     */
    public modifyThreadWithHttpInfo(param: AssistantsApiModifyThreadRequest, options?: ConfigurationOptions): Promise<HttpInfo<ThreadObject>> {
        return this.api.modifyThreadWithHttpInfo(param.threadId, param.modifyThreadRequest,  options).toPromise();
    }

    /**
     * Modifies a thread.
     * @param param the request object
     */
    public modifyThread(param: AssistantsApiModifyThreadRequest, options?: ConfigurationOptions): Promise<ThreadObject> {
        return this.api.modifyThread(param.threadId, param.modifyThreadRequest,  options).toPromise();
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they\'re all completed. All outputs must be submitted in a single request. 
     * @param param the request object
     */
    public submitToolOuputsToRunWithHttpInfo(param: AssistantsApiSubmitToolOuputsToRunRequest, options?: ConfigurationOptions): Promise<HttpInfo<RunObject>> {
        return this.api.submitToolOuputsToRunWithHttpInfo(param.threadId, param.runId, param.submitToolOutputsRunRequest,  options).toPromise();
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they\'re all completed. All outputs must be submitted in a single request. 
     * @param param the request object
     */
    public submitToolOuputsToRun(param: AssistantsApiSubmitToolOuputsToRunRequest, options?: ConfigurationOptions): Promise<RunObject> {
        return this.api.submitToolOuputsToRun(param.threadId, param.runId, param.submitToolOutputsRunRequest,  options).toPromise();
    }

}

import { ObservableAudioApi } from "./ObservableAPI";
import { AudioApiRequestFactory, AudioApiResponseProcessor} from "../apis/AudioApi";

export interface AudioApiCreateSpeechRequest {
    /**
     * 
     * @type CreateSpeechRequest
     * @memberof AudioApicreateSpeech
     */
    createSpeechRequest: CreateSpeechRequest
}

export interface AudioApiCreateTranscriptionRequest {
    /**
     * The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof AudioApicreateTranscription
     */
    file: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type CreateTranscriptionRequestModel
     * @memberof AudioApicreateTranscription
     */
    model: CreateTranscriptionRequestModel
    /**
     * The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
     * Defaults to: undefined
     * @type string
     * @memberof AudioApicreateTranscription
     */
    language?: string
    /**
     * An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
     * Defaults to: undefined
     * @type string
     * @memberof AudioApicreateTranscription
     */
    prompt?: string
    /**
     * 
     * Defaults to: undefined
     * @type AudioResponseFormat
     * @memberof AudioApicreateTranscription
     */
    responseFormat?: AudioResponseFormat
    /**
     * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * Defaults to: 0
     * @type number
     * @memberof AudioApicreateTranscription
     */
    temperature?: number
    /**
     * The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AudioApicreateTranscription
     */
    timestampGranularities?: Array<string>
}

export interface AudioApiCreateTranslationRequest {
    /**
     * The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof AudioApicreateTranslation
     */
    file: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type CreateTranscriptionRequestModel
     * @memberof AudioApicreateTranslation
     */
    model: CreateTranscriptionRequestModel
    /**
     * An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
     * Defaults to: undefined
     * @type string
     * @memberof AudioApicreateTranslation
     */
    prompt?: string
    /**
     * 
     * Defaults to: undefined
     * @type AudioResponseFormat
     * @memberof AudioApicreateTranslation
     */
    responseFormat?: AudioResponseFormat
    /**
     * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * Defaults to: 0
     * @type number
     * @memberof AudioApicreateTranslation
     */
    temperature?: number
}

export class ObjectAudioApi {
    private api: ObservableAudioApi

    public constructor(configuration: Configuration, requestFactory?: AudioApiRequestFactory, responseProcessor?: AudioApiResponseProcessor) {
        this.api = new ObservableAudioApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Generates audio from the input text.
     * @param param the request object
     */
    public createSpeechWithHttpInfo(param: AudioApiCreateSpeechRequest, options?: ConfigurationOptions): Promise<HttpInfo<HttpFile>> {
        return this.api.createSpeechWithHttpInfo(param.createSpeechRequest,  options).toPromise();
    }

    /**
     * Generates audio from the input text.
     * @param param the request object
     */
    public createSpeech(param: AudioApiCreateSpeechRequest, options?: ConfigurationOptions): Promise<HttpFile> {
        return this.api.createSpeech(param.createSpeechRequest,  options).toPromise();
    }

    /**
     * Transcribes audio into the input language.
     * @param param the request object
     */
    public createTranscriptionWithHttpInfo(param: AudioApiCreateTranscriptionRequest, options?: ConfigurationOptions): Promise<HttpInfo<CreateTranscription200Response>> {
        return this.api.createTranscriptionWithHttpInfo(param.file, param.model, param.language, param.prompt, param.responseFormat, param.temperature, param.timestampGranularities,  options).toPromise();
    }

    /**
     * Transcribes audio into the input language.
     * @param param the request object
     */
    public createTranscription(param: AudioApiCreateTranscriptionRequest, options?: ConfigurationOptions): Promise<CreateTranscription200Response> {
        return this.api.createTranscription(param.file, param.model, param.language, param.prompt, param.responseFormat, param.temperature, param.timestampGranularities,  options).toPromise();
    }

    /**
     * Translates audio into English.
     * @param param the request object
     */
    public createTranslationWithHttpInfo(param: AudioApiCreateTranslationRequest, options?: ConfigurationOptions): Promise<HttpInfo<CreateTranslation200Response>> {
        return this.api.createTranslationWithHttpInfo(param.file, param.model, param.prompt, param.responseFormat, param.temperature,  options).toPromise();
    }

    /**
     * Translates audio into English.
     * @param param the request object
     */
    public createTranslation(param: AudioApiCreateTranslationRequest, options?: ConfigurationOptions): Promise<CreateTranslation200Response> {
        return this.api.createTranslation(param.file, param.model, param.prompt, param.responseFormat, param.temperature,  options).toPromise();
    }

}

import { ObservableAuditLogsApi } from "./ObservableAPI";
import { AuditLogsApiRequestFactory, AuditLogsApiResponseProcessor} from "../apis/AuditLogsApi";

export interface AuditLogsApiListAuditLogsRequest {
    /**
     * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.
     * Defaults to: undefined
     * @type ListAuditLogsEffectiveAtParameter
     * @memberof AuditLogsApilistAuditLogs
     */
    effectiveAt?: ListAuditLogsEffectiveAtParameter
    /**
     * Return only events for these projects.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AuditLogsApilistAuditLogs
     */
    projectIds?: Array<string>
    /**
     * Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
     * Defaults to: undefined
     * @type Array&lt;AuditLogEventType&gt;
     * @memberof AuditLogsApilistAuditLogs
     */
    eventTypes?: Array<AuditLogEventType>
    /**
     * Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AuditLogsApilistAuditLogs
     */
    actorIds?: Array<string>
    /**
     * Return only events performed by users with these emails.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AuditLogsApilistAuditLogs
     */
    actorEmails?: Array<string>
    /**
     * Return only events performed on these targets. For example, a project ID updated.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AuditLogsApilistAuditLogs
     */
    resourceIds?: Array<string>
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AuditLogsApilistAuditLogs
     */
    limit?: number
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AuditLogsApilistAuditLogs
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AuditLogsApilistAuditLogs
     */
    before?: string
}

export class ObjectAuditLogsApi {
    private api: ObservableAuditLogsApi

    public constructor(configuration: Configuration, requestFactory?: AuditLogsApiRequestFactory, responseProcessor?: AuditLogsApiResponseProcessor) {
        this.api = new ObservableAuditLogsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List user actions and configuration changes within this organization.
     * @param param the request object
     */
    public listAuditLogsWithHttpInfo(param: AuditLogsApiListAuditLogsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListAuditLogsResponse>> {
        return this.api.listAuditLogsWithHttpInfo(param.effectiveAt, param.projectIds, param.eventTypes, param.actorIds, param.actorEmails, param.resourceIds, param.limit, param.after, param.before,  options).toPromise();
    }

    /**
     * List user actions and configuration changes within this organization.
     * @param param the request object
     */
    public listAuditLogs(param: AuditLogsApiListAuditLogsRequest = {}, options?: ConfigurationOptions): Promise<ListAuditLogsResponse> {
        return this.api.listAuditLogs(param.effectiveAt, param.projectIds, param.eventTypes, param.actorIds, param.actorEmails, param.resourceIds, param.limit, param.after, param.before,  options).toPromise();
    }

}

import { ObservableBatchApi } from "./ObservableAPI";
import { BatchApiRequestFactory, BatchApiResponseProcessor} from "../apis/BatchApi";

export interface BatchApiCancelBatchRequest {
    /**
     * The ID of the batch to cancel.
     * Defaults to: undefined
     * @type string
     * @memberof BatchApicancelBatch
     */
    batchId: string
}

export interface BatchApiCreateBatchRequest {
    /**
     * 
     * @type CreateBatchRequest
     * @memberof BatchApicreateBatch
     */
    createBatchRequest: CreateBatchRequest
}

export interface BatchApiListBatchesRequest {
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof BatchApilistBatches
     */
    after?: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof BatchApilistBatches
     */
    limit?: number
}

export interface BatchApiRetrieveBatchRequest {
    /**
     * The ID of the batch to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof BatchApiretrieveBatch
     */
    batchId: string
}

export class ObjectBatchApi {
    private api: ObservableBatchApi

    public constructor(configuration: Configuration, requestFactory?: BatchApiRequestFactory, responseProcessor?: BatchApiResponseProcessor) {
        this.api = new ObservableBatchApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
     * @param param the request object
     */
    public cancelBatchWithHttpInfo(param: BatchApiCancelBatchRequest, options?: ConfigurationOptions): Promise<HttpInfo<Batch>> {
        return this.api.cancelBatchWithHttpInfo(param.batchId,  options).toPromise();
    }

    /**
     * Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
     * @param param the request object
     */
    public cancelBatch(param: BatchApiCancelBatchRequest, options?: ConfigurationOptions): Promise<Batch> {
        return this.api.cancelBatch(param.batchId,  options).toPromise();
    }

    /**
     * Creates and executes a batch from an uploaded file of requests
     * @param param the request object
     */
    public createBatchWithHttpInfo(param: BatchApiCreateBatchRequest, options?: ConfigurationOptions): Promise<HttpInfo<Batch>> {
        return this.api.createBatchWithHttpInfo(param.createBatchRequest,  options).toPromise();
    }

    /**
     * Creates and executes a batch from an uploaded file of requests
     * @param param the request object
     */
    public createBatch(param: BatchApiCreateBatchRequest, options?: ConfigurationOptions): Promise<Batch> {
        return this.api.createBatch(param.createBatchRequest,  options).toPromise();
    }

    /**
     * List your organization\'s batches.
     * @param param the request object
     */
    public listBatchesWithHttpInfo(param: BatchApiListBatchesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListBatchesResponse>> {
        return this.api.listBatchesWithHttpInfo(param.after, param.limit,  options).toPromise();
    }

    /**
     * List your organization\'s batches.
     * @param param the request object
     */
    public listBatches(param: BatchApiListBatchesRequest = {}, options?: ConfigurationOptions): Promise<ListBatchesResponse> {
        return this.api.listBatches(param.after, param.limit,  options).toPromise();
    }

    /**
     * Retrieves a batch.
     * @param param the request object
     */
    public retrieveBatchWithHttpInfo(param: BatchApiRetrieveBatchRequest, options?: ConfigurationOptions): Promise<HttpInfo<Batch>> {
        return this.api.retrieveBatchWithHttpInfo(param.batchId,  options).toPromise();
    }

    /**
     * Retrieves a batch.
     * @param param the request object
     */
    public retrieveBatch(param: BatchApiRetrieveBatchRequest, options?: ConfigurationOptions): Promise<Batch> {
        return this.api.retrieveBatch(param.batchId,  options).toPromise();
    }

}

import { ObservableChatApi } from "./ObservableAPI";
import { ChatApiRequestFactory, ChatApiResponseProcessor} from "../apis/ChatApi";

export interface ChatApiCreateChatCompletionRequest {
    /**
     * 
     * @type CreateChatCompletionRequest
     * @memberof ChatApicreateChatCompletion
     */
    createChatCompletionRequest: CreateChatCompletionRequest
}

export class ObjectChatApi {
    private api: ObservableChatApi

    public constructor(configuration: Configuration, requestFactory?: ChatApiRequestFactory, responseProcessor?: ChatApiResponseProcessor) {
        this.api = new ObservableChatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
     * @param param the request object
     */
    public createChatCompletionWithHttpInfo(param: ChatApiCreateChatCompletionRequest, options?: ConfigurationOptions): Promise<HttpInfo<CreateChatCompletionResponse>> {
        return this.api.createChatCompletionWithHttpInfo(param.createChatCompletionRequest,  options).toPromise();
    }

    /**
     * Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
     * @param param the request object
     */
    public createChatCompletion(param: ChatApiCreateChatCompletionRequest, options?: ConfigurationOptions): Promise<CreateChatCompletionResponse> {
        return this.api.createChatCompletion(param.createChatCompletionRequest,  options).toPromise();
    }

}

import { ObservableCompletionsApi } from "./ObservableAPI";
import { CompletionsApiRequestFactory, CompletionsApiResponseProcessor} from "../apis/CompletionsApi";

export interface CompletionsApiCreateCompletionRequest {
    /**
     * 
     * @type CreateCompletionRequest
     * @memberof CompletionsApicreateCompletion
     */
    createCompletionRequest: CreateCompletionRequest
}

export class ObjectCompletionsApi {
    private api: ObservableCompletionsApi

    public constructor(configuration: Configuration, requestFactory?: CompletionsApiRequestFactory, responseProcessor?: CompletionsApiResponseProcessor) {
        this.api = new ObservableCompletionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param param the request object
     */
    public createCompletionWithHttpInfo(param: CompletionsApiCreateCompletionRequest, options?: ConfigurationOptions): Promise<HttpInfo<CreateCompletionResponse>> {
        return this.api.createCompletionWithHttpInfo(param.createCompletionRequest,  options).toPromise();
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param param the request object
     */
    public createCompletion(param: CompletionsApiCreateCompletionRequest, options?: ConfigurationOptions): Promise<CreateCompletionResponse> {
        return this.api.createCompletion(param.createCompletionRequest,  options).toPromise();
    }

}

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiAdminApiKeysCreateRequest {
    /**
     * 
     * @type AdminApiKeysCreateRequest
     * @memberof DefaultApiadminApiKeysCreate
     */
    adminApiKeysCreateRequest: AdminApiKeysCreateRequest
}

export interface DefaultApiAdminApiKeysDeleteRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiadminApiKeysDelete
     */
    keyId: string
}

export interface DefaultApiAdminApiKeysGetRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiadminApiKeysGet
     */
    keyId: string
}

export interface DefaultApiAdminApiKeysListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApiadminApiKeysList
     */
    after?: string
    /**
     * 
     * Defaults to: &#39;asc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof DefaultApiadminApiKeysList
     */
    order?: 'asc' | 'desc'
    /**
     * 
     * Defaults to: 20
     * @type number
     * @memberof DefaultApiadminApiKeysList
     */
    limit?: number
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a new admin-level API key for the organization.
     * Create an organization admin API key
     * @param param the request object
     */
    public adminApiKeysCreateWithHttpInfo(param: DefaultApiAdminApiKeysCreateRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdminApiKey>> {
        return this.api.adminApiKeysCreateWithHttpInfo(param.adminApiKeysCreateRequest,  options).toPromise();
    }

    /**
     * Create a new admin-level API key for the organization.
     * Create an organization admin API key
     * @param param the request object
     */
    public adminApiKeysCreate(param: DefaultApiAdminApiKeysCreateRequest, options?: ConfigurationOptions): Promise<AdminApiKey> {
        return this.api.adminApiKeysCreate(param.adminApiKeysCreateRequest,  options).toPromise();
    }

    /**
     * Delete the specified admin API key.
     * Delete an organization admin API key
     * @param param the request object
     */
    public adminApiKeysDeleteWithHttpInfo(param: DefaultApiAdminApiKeysDeleteRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdminApiKeysDelete200Response>> {
        return this.api.adminApiKeysDeleteWithHttpInfo(param.keyId,  options).toPromise();
    }

    /**
     * Delete the specified admin API key.
     * Delete an organization admin API key
     * @param param the request object
     */
    public adminApiKeysDelete(param: DefaultApiAdminApiKeysDeleteRequest, options?: ConfigurationOptions): Promise<AdminApiKeysDelete200Response> {
        return this.api.adminApiKeysDelete(param.keyId,  options).toPromise();
    }

    /**
     * Get details for a specific organization API key by its ID.
     * Retrieve a single organization API key
     * @param param the request object
     */
    public adminApiKeysGetWithHttpInfo(param: DefaultApiAdminApiKeysGetRequest, options?: ConfigurationOptions): Promise<HttpInfo<AdminApiKey>> {
        return this.api.adminApiKeysGetWithHttpInfo(param.keyId,  options).toPromise();
    }

    /**
     * Get details for a specific organization API key by its ID.
     * Retrieve a single organization API key
     * @param param the request object
     */
    public adminApiKeysGet(param: DefaultApiAdminApiKeysGetRequest, options?: ConfigurationOptions): Promise<AdminApiKey> {
        return this.api.adminApiKeysGet(param.keyId,  options).toPromise();
    }

    /**
     * Retrieve a paginated list of organization admin API keys.
     * List organization API keys
     * @param param the request object
     */
    public adminApiKeysListWithHttpInfo(param: DefaultApiAdminApiKeysListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ApiKeyList>> {
        return this.api.adminApiKeysListWithHttpInfo(param.after, param.order, param.limit,  options).toPromise();
    }

    /**
     * Retrieve a paginated list of organization admin API keys.
     * List organization API keys
     * @param param the request object
     */
    public adminApiKeysList(param: DefaultApiAdminApiKeysListRequest = {}, options?: ConfigurationOptions): Promise<ApiKeyList> {
        return this.api.adminApiKeysList(param.after, param.order, param.limit,  options).toPromise();
    }

}

import { ObservableEmbeddingsApi } from "./ObservableAPI";
import { EmbeddingsApiRequestFactory, EmbeddingsApiResponseProcessor} from "../apis/EmbeddingsApi";

export interface EmbeddingsApiCreateEmbeddingRequest {
    /**
     * 
     * @type CreateEmbeddingRequest
     * @memberof EmbeddingsApicreateEmbedding
     */
    createEmbeddingRequest: CreateEmbeddingRequest
}

export class ObjectEmbeddingsApi {
    private api: ObservableEmbeddingsApi

    public constructor(configuration: Configuration, requestFactory?: EmbeddingsApiRequestFactory, responseProcessor?: EmbeddingsApiResponseProcessor) {
        this.api = new ObservableEmbeddingsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param param the request object
     */
    public createEmbeddingWithHttpInfo(param: EmbeddingsApiCreateEmbeddingRequest, options?: ConfigurationOptions): Promise<HttpInfo<CreateEmbeddingResponse>> {
        return this.api.createEmbeddingWithHttpInfo(param.createEmbeddingRequest,  options).toPromise();
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param param the request object
     */
    public createEmbedding(param: EmbeddingsApiCreateEmbeddingRequest, options?: ConfigurationOptions): Promise<CreateEmbeddingResponse> {
        return this.api.createEmbedding(param.createEmbeddingRequest,  options).toPromise();
    }

}

import { ObservableFilesApi } from "./ObservableAPI";
import { FilesApiRequestFactory, FilesApiResponseProcessor} from "../apis/FilesApi";

export interface FilesApiCreateFileRequest {
    /**
     * The File object (not file name) to be uploaded. 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof FilesApicreateFile
     */
    file: HttpFile
    /**
     * The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning). 
     * Defaults to: undefined
     * @type string
     * @memberof FilesApicreateFile
     */
    purpose: string
}

export interface FilesApiDeleteFileRequest {
    /**
     * The ID of the file to use for this request.
     * Defaults to: undefined
     * @type string
     * @memberof FilesApideleteFile
     */
    fileId: string
}

export interface FilesApiDownloadFileRequest {
    /**
     * The ID of the file to use for this request.
     * Defaults to: undefined
     * @type string
     * @memberof FilesApidownloadFile
     */
    fileId: string
}

export interface FilesApiListFilesRequest {
    /**
     * Only return files with the given purpose.
     * Defaults to: undefined
     * @type string
     * @memberof FilesApilistFiles
     */
    purpose?: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
     * Defaults to: 10000
     * @type number
     * @memberof FilesApilistFiles
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof FilesApilistFiles
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof FilesApilistFiles
     */
    after?: string
}

export interface FilesApiRetrieveFileRequest {
    /**
     * The ID of the file to use for this request.
     * Defaults to: undefined
     * @type string
     * @memberof FilesApiretrieveFile
     */
    fileId: string
}

export class ObjectFilesApi {
    private api: ObservableFilesApi

    public constructor(configuration: Configuration, requestFactory?: FilesApiRequestFactory, responseProcessor?: FilesApiResponseProcessor) {
        this.api = new ObservableFilesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * @param param the request object
     */
    public createFileWithHttpInfo(param: FilesApiCreateFileRequest, options?: ConfigurationOptions): Promise<HttpInfo<OpenAIFile>> {
        return this.api.createFileWithHttpInfo(param.file, param.purpose,  options).toPromise();
    }

    /**
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * @param param the request object
     */
    public createFile(param: FilesApiCreateFileRequest, options?: ConfigurationOptions): Promise<OpenAIFile> {
        return this.api.createFile(param.file, param.purpose,  options).toPromise();
    }

    /**
     * Delete a file.
     * @param param the request object
     */
    public deleteFileWithHttpInfo(param: FilesApiDeleteFileRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeleteFileResponse>> {
        return this.api.deleteFileWithHttpInfo(param.fileId,  options).toPromise();
    }

    /**
     * Delete a file.
     * @param param the request object
     */
    public deleteFile(param: FilesApiDeleteFileRequest, options?: ConfigurationOptions): Promise<DeleteFileResponse> {
        return this.api.deleteFile(param.fileId,  options).toPromise();
    }

    /**
     * Returns the contents of the specified file.
     * @param param the request object
     */
    public downloadFileWithHttpInfo(param: FilesApiDownloadFileRequest, options?: ConfigurationOptions): Promise<HttpInfo<string>> {
        return this.api.downloadFileWithHttpInfo(param.fileId,  options).toPromise();
    }

    /**
     * Returns the contents of the specified file.
     * @param param the request object
     */
    public downloadFile(param: FilesApiDownloadFileRequest, options?: ConfigurationOptions): Promise<string> {
        return this.api.downloadFile(param.fileId,  options).toPromise();
    }

    /**
     * Returns a list of files.
     * @param param the request object
     */
    public listFilesWithHttpInfo(param: FilesApiListFilesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListFilesResponse>> {
        return this.api.listFilesWithHttpInfo(param.purpose, param.limit, param.order, param.after,  options).toPromise();
    }

    /**
     * Returns a list of files.
     * @param param the request object
     */
    public listFiles(param: FilesApiListFilesRequest = {}, options?: ConfigurationOptions): Promise<ListFilesResponse> {
        return this.api.listFiles(param.purpose, param.limit, param.order, param.after,  options).toPromise();
    }

    /**
     * Returns information about a specific file.
     * @param param the request object
     */
    public retrieveFileWithHttpInfo(param: FilesApiRetrieveFileRequest, options?: ConfigurationOptions): Promise<HttpInfo<OpenAIFile>> {
        return this.api.retrieveFileWithHttpInfo(param.fileId,  options).toPromise();
    }

    /**
     * Returns information about a specific file.
     * @param param the request object
     */
    public retrieveFile(param: FilesApiRetrieveFileRequest, options?: ConfigurationOptions): Promise<OpenAIFile> {
        return this.api.retrieveFile(param.fileId,  options).toPromise();
    }

}

import { ObservableFineTuningApi } from "./ObservableAPI";
import { FineTuningApiRequestFactory, FineTuningApiResponseProcessor} from "../apis/FineTuningApi";

export interface FineTuningApiCancelFineTuningJobRequest {
    /**
     * The ID of the fine-tuning job to cancel. 
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApicancelFineTuningJob
     */
    fineTuningJobId: string
}

export interface FineTuningApiCreateFineTuningJobRequest {
    /**
     * 
     * @type CreateFineTuningJobRequest
     * @memberof FineTuningApicreateFineTuningJob
     */
    createFineTuningJobRequest: CreateFineTuningJobRequest
}

export interface FineTuningApiListFineTuningEventsRequest {
    /**
     * The ID of the fine-tuning job to get events for. 
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApilistFineTuningEvents
     */
    fineTuningJobId: string
    /**
     * Identifier for the last event from the previous pagination request.
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApilistFineTuningEvents
     */
    after?: string
    /**
     * Number of events to retrieve.
     * Defaults to: 20
     * @type number
     * @memberof FineTuningApilistFineTuningEvents
     */
    limit?: number
}

export interface FineTuningApiListFineTuningJobCheckpointsRequest {
    /**
     * The ID of the fine-tuning job to get checkpoints for. 
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApilistFineTuningJobCheckpoints
     */
    fineTuningJobId: string
    /**
     * Identifier for the last checkpoint ID from the previous pagination request.
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApilistFineTuningJobCheckpoints
     */
    after?: string
    /**
     * Number of checkpoints to retrieve.
     * Defaults to: 10
     * @type number
     * @memberof FineTuningApilistFineTuningJobCheckpoints
     */
    limit?: number
}

export interface FineTuningApiListPaginatedFineTuningJobsRequest {
    /**
     * Identifier for the last job from the previous pagination request.
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApilistPaginatedFineTuningJobs
     */
    after?: string
    /**
     * Number of fine-tuning jobs to retrieve.
     * Defaults to: 20
     * @type number
     * @memberof FineTuningApilistPaginatedFineTuningJobs
     */
    limit?: number
}

export interface FineTuningApiRetrieveFineTuningJobRequest {
    /**
     * The ID of the fine-tuning job. 
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApiretrieveFineTuningJob
     */
    fineTuningJobId: string
}

export class ObjectFineTuningApi {
    private api: ObservableFineTuningApi

    public constructor(configuration: Configuration, requestFactory?: FineTuningApiRequestFactory, responseProcessor?: FineTuningApiResponseProcessor) {
        this.api = new ObservableFineTuningApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param param the request object
     */
    public cancelFineTuningJobWithHttpInfo(param: FineTuningApiCancelFineTuningJobRequest, options?: ConfigurationOptions): Promise<HttpInfo<FineTuningJob>> {
        return this.api.cancelFineTuningJobWithHttpInfo(param.fineTuningJobId,  options).toPromise();
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param param the request object
     */
    public cancelFineTuningJob(param: FineTuningApiCancelFineTuningJobRequest, options?: ConfigurationOptions): Promise<FineTuningJob> {
        return this.api.cancelFineTuningJob(param.fineTuningJobId,  options).toPromise();
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public createFineTuningJobWithHttpInfo(param: FineTuningApiCreateFineTuningJobRequest, options?: ConfigurationOptions): Promise<HttpInfo<FineTuningJob>> {
        return this.api.createFineTuningJobWithHttpInfo(param.createFineTuningJobRequest,  options).toPromise();
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public createFineTuningJob(param: FineTuningApiCreateFineTuningJobRequest, options?: ConfigurationOptions): Promise<FineTuningJob> {
        return this.api.createFineTuningJob(param.createFineTuningJobRequest,  options).toPromise();
    }

    /**
     * Get status updates for a fine-tuning job. 
     * @param param the request object
     */
    public listFineTuningEventsWithHttpInfo(param: FineTuningApiListFineTuningEventsRequest, options?: ConfigurationOptions): Promise<HttpInfo<ListFineTuningJobEventsResponse>> {
        return this.api.listFineTuningEventsWithHttpInfo(param.fineTuningJobId, param.after, param.limit,  options).toPromise();
    }

    /**
     * Get status updates for a fine-tuning job. 
     * @param param the request object
     */
    public listFineTuningEvents(param: FineTuningApiListFineTuningEventsRequest, options?: ConfigurationOptions): Promise<ListFineTuningJobEventsResponse> {
        return this.api.listFineTuningEvents(param.fineTuningJobId, param.after, param.limit,  options).toPromise();
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * @param param the request object
     */
    public listFineTuningJobCheckpointsWithHttpInfo(param: FineTuningApiListFineTuningJobCheckpointsRequest, options?: ConfigurationOptions): Promise<HttpInfo<ListFineTuningJobCheckpointsResponse>> {
        return this.api.listFineTuningJobCheckpointsWithHttpInfo(param.fineTuningJobId, param.after, param.limit,  options).toPromise();
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * @param param the request object
     */
    public listFineTuningJobCheckpoints(param: FineTuningApiListFineTuningJobCheckpointsRequest, options?: ConfigurationOptions): Promise<ListFineTuningJobCheckpointsResponse> {
        return this.api.listFineTuningJobCheckpoints(param.fineTuningJobId, param.after, param.limit,  options).toPromise();
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param param the request object
     */
    public listPaginatedFineTuningJobsWithHttpInfo(param: FineTuningApiListPaginatedFineTuningJobsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListPaginatedFineTuningJobsResponse>> {
        return this.api.listPaginatedFineTuningJobsWithHttpInfo(param.after, param.limit,  options).toPromise();
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param param the request object
     */
    public listPaginatedFineTuningJobs(param: FineTuningApiListPaginatedFineTuningJobsRequest = {}, options?: ConfigurationOptions): Promise<ListPaginatedFineTuningJobsResponse> {
        return this.api.listPaginatedFineTuningJobs(param.after, param.limit,  options).toPromise();
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public retrieveFineTuningJobWithHttpInfo(param: FineTuningApiRetrieveFineTuningJobRequest, options?: ConfigurationOptions): Promise<HttpInfo<FineTuningJob>> {
        return this.api.retrieveFineTuningJobWithHttpInfo(param.fineTuningJobId,  options).toPromise();
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public retrieveFineTuningJob(param: FineTuningApiRetrieveFineTuningJobRequest, options?: ConfigurationOptions): Promise<FineTuningJob> {
        return this.api.retrieveFineTuningJob(param.fineTuningJobId,  options).toPromise();
    }

}

import { ObservableImagesApi } from "./ObservableAPI";
import { ImagesApiRequestFactory, ImagesApiResponseProcessor} from "../apis/ImagesApi";

export interface ImagesApiCreateImageRequest {
    /**
     * 
     * @type CreateImageRequest
     * @memberof ImagesApicreateImage
     */
    createImageRequest: CreateImageRequest
}

export interface ImagesApiCreateImageEditRequest {
    /**
     * The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
     * Defaults to: undefined
     * @type HttpFile
     * @memberof ImagesApicreateImageEdit
     */
    image: HttpFile
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters.
     * Defaults to: undefined
     * @type string
     * @memberof ImagesApicreateImageEdit
     */
    prompt: string
    /**
     * An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
     * Defaults to: undefined
     * @type HttpFile
     * @memberof ImagesApicreateImageEdit
     */
    mask?: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type CreateImageEditRequestModel
     * @memberof ImagesApicreateImageEdit
     */
    model?: CreateImageEditRequestModel
    /**
     * The number of images to generate. Must be between 1 and 10.
     * Minimum: 1
     * Maximum: 10
     * Defaults to: 1
     * @type number
     * @memberof ImagesApicreateImageEdit
     */
    n?: number
    /**
     * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * Defaults to: &#39;1024x1024&#39;
     * @type string
     * @memberof ImagesApicreateImageEdit
     */
    size?: string
    /**
     * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * Defaults to: &#39;url&#39;
     * @type string
     * @memberof ImagesApicreateImageEdit
     */
    responseFormat?: string
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
     * Defaults to: undefined
     * @type string
     * @memberof ImagesApicreateImageEdit
     */
    user?: string
}

export interface ImagesApiCreateImageVariationRequest {
    /**
     * The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     * Defaults to: undefined
     * @type HttpFile
     * @memberof ImagesApicreateImageVariation
     */
    image: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type CreateImageEditRequestModel
     * @memberof ImagesApicreateImageVariation
     */
    model?: CreateImageEditRequestModel
    /**
     * The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
     * Minimum: 1
     * Maximum: 10
     * Defaults to: 1
     * @type number
     * @memberof ImagesApicreateImageVariation
     */
    n?: number
    /**
     * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * Defaults to: &#39;url&#39;
     * @type string
     * @memberof ImagesApicreateImageVariation
     */
    responseFormat?: string
    /**
     * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * Defaults to: &#39;1024x1024&#39;
     * @type string
     * @memberof ImagesApicreateImageVariation
     */
    size?: string
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
     * Defaults to: undefined
     * @type string
     * @memberof ImagesApicreateImageVariation
     */
    user?: string
}

export class ObjectImagesApi {
    private api: ObservableImagesApi

    public constructor(configuration: Configuration, requestFactory?: ImagesApiRequestFactory, responseProcessor?: ImagesApiResponseProcessor) {
        this.api = new ObservableImagesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates an image given a prompt.
     * @param param the request object
     */
    public createImageWithHttpInfo(param: ImagesApiCreateImageRequest, options?: ConfigurationOptions): Promise<HttpInfo<ImagesResponse>> {
        return this.api.createImageWithHttpInfo(param.createImageRequest,  options).toPromise();
    }

    /**
     * Creates an image given a prompt.
     * @param param the request object
     */
    public createImage(param: ImagesApiCreateImageRequest, options?: ConfigurationOptions): Promise<ImagesResponse> {
        return this.api.createImage(param.createImageRequest,  options).toPromise();
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param param the request object
     */
    public createImageEditWithHttpInfo(param: ImagesApiCreateImageEditRequest, options?: ConfigurationOptions): Promise<HttpInfo<ImagesResponse>> {
        return this.api.createImageEditWithHttpInfo(param.image, param.prompt, param.mask, param.model, param.n, param.size, param.responseFormat, param.user,  options).toPromise();
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param param the request object
     */
    public createImageEdit(param: ImagesApiCreateImageEditRequest, options?: ConfigurationOptions): Promise<ImagesResponse> {
        return this.api.createImageEdit(param.image, param.prompt, param.mask, param.model, param.n, param.size, param.responseFormat, param.user,  options).toPromise();
    }

    /**
     * Creates a variation of a given image.
     * @param param the request object
     */
    public createImageVariationWithHttpInfo(param: ImagesApiCreateImageVariationRequest, options?: ConfigurationOptions): Promise<HttpInfo<ImagesResponse>> {
        return this.api.createImageVariationWithHttpInfo(param.image, param.model, param.n, param.responseFormat, param.size, param.user,  options).toPromise();
    }

    /**
     * Creates a variation of a given image.
     * @param param the request object
     */
    public createImageVariation(param: ImagesApiCreateImageVariationRequest, options?: ConfigurationOptions): Promise<ImagesResponse> {
        return this.api.createImageVariation(param.image, param.model, param.n, param.responseFormat, param.size, param.user,  options).toPromise();
    }

}

import { ObservableInvitesApi } from "./ObservableAPI";
import { InvitesApiRequestFactory, InvitesApiResponseProcessor} from "../apis/InvitesApi";

export interface InvitesApiDeleteInviteRequest {
    /**
     * The ID of the invite to delete.
     * Defaults to: undefined
     * @type string
     * @memberof InvitesApideleteInvite
     */
    inviteId: string
}

export interface InvitesApiInviteUserRequest {
    /**
     * The invite request payload.
     * @type InviteRequest
     * @memberof InvitesApiinviteUser
     */
    inviteRequest: InviteRequest
}

export interface InvitesApiListInvitesRequest {
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof InvitesApilistInvites
     */
    limit?: number
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof InvitesApilistInvites
     */
    after?: string
}

export interface InvitesApiRetrieveInviteRequest {
    /**
     * The ID of the invite to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof InvitesApiretrieveInvite
     */
    inviteId: string
}

export class ObjectInvitesApi {
    private api: ObservableInvitesApi

    public constructor(configuration: Configuration, requestFactory?: InvitesApiRequestFactory, responseProcessor?: InvitesApiResponseProcessor) {
        this.api = new ObservableInvitesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     * @param param the request object
     */
    public deleteInviteWithHttpInfo(param: InvitesApiDeleteInviteRequest, options?: ConfigurationOptions): Promise<HttpInfo<InviteDeleteResponse>> {
        return this.api.deleteInviteWithHttpInfo(param.inviteId,  options).toPromise();
    }

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     * @param param the request object
     */
    public deleteInvite(param: InvitesApiDeleteInviteRequest, options?: ConfigurationOptions): Promise<InviteDeleteResponse> {
        return this.api.deleteInvite(param.inviteId,  options).toPromise();
    }

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     * @param param the request object
     */
    public inviteUserWithHttpInfo(param: InvitesApiInviteUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<Invite>> {
        return this.api.inviteUserWithHttpInfo(param.inviteRequest,  options).toPromise();
    }

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     * @param param the request object
     */
    public inviteUser(param: InvitesApiInviteUserRequest, options?: ConfigurationOptions): Promise<Invite> {
        return this.api.inviteUser(param.inviteRequest,  options).toPromise();
    }

    /**
     * Returns a list of invites in the organization.
     * @param param the request object
     */
    public listInvitesWithHttpInfo(param: InvitesApiListInvitesRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<InviteListResponse>> {
        return this.api.listInvitesWithHttpInfo(param.limit, param.after,  options).toPromise();
    }

    /**
     * Returns a list of invites in the organization.
     * @param param the request object
     */
    public listInvites(param: InvitesApiListInvitesRequest = {}, options?: ConfigurationOptions): Promise<InviteListResponse> {
        return this.api.listInvites(param.limit, param.after,  options).toPromise();
    }

    /**
     * Retrieves an invite.
     * @param param the request object
     */
    public retrieveInviteWithHttpInfo(param: InvitesApiRetrieveInviteRequest, options?: ConfigurationOptions): Promise<HttpInfo<Invite>> {
        return this.api.retrieveInviteWithHttpInfo(param.inviteId,  options).toPromise();
    }

    /**
     * Retrieves an invite.
     * @param param the request object
     */
    public retrieveInvite(param: InvitesApiRetrieveInviteRequest, options?: ConfigurationOptions): Promise<Invite> {
        return this.api.retrieveInvite(param.inviteId,  options).toPromise();
    }

}

import { ObservableModelsApi } from "./ObservableAPI";
import { ModelsApiRequestFactory, ModelsApiResponseProcessor} from "../apis/ModelsApi";

export interface ModelsApiDeleteModelRequest {
    /**
     * The model to delete
     * Defaults to: undefined
     * @type string
     * @memberof ModelsApideleteModel
     */
    model: string
}

export interface ModelsApiListModelsRequest {
}

export interface ModelsApiRetrieveModelRequest {
    /**
     * The ID of the model to use for this request
     * Defaults to: undefined
     * @type string
     * @memberof ModelsApiretrieveModel
     */
    model: string
}

export class ObjectModelsApi {
    private api: ObservableModelsApi

    public constructor(configuration: Configuration, requestFactory?: ModelsApiRequestFactory, responseProcessor?: ModelsApiResponseProcessor) {
        this.api = new ObservableModelsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param param the request object
     */
    public deleteModelWithHttpInfo(param: ModelsApiDeleteModelRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeleteModelResponse>> {
        return this.api.deleteModelWithHttpInfo(param.model,  options).toPromise();
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param param the request object
     */
    public deleteModel(param: ModelsApiDeleteModelRequest, options?: ConfigurationOptions): Promise<DeleteModelResponse> {
        return this.api.deleteModel(param.model,  options).toPromise();
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param param the request object
     */
    public listModelsWithHttpInfo(param: ModelsApiListModelsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListModelsResponse>> {
        return this.api.listModelsWithHttpInfo( options).toPromise();
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param param the request object
     */
    public listModels(param: ModelsApiListModelsRequest = {}, options?: ConfigurationOptions): Promise<ListModelsResponse> {
        return this.api.listModels( options).toPromise();
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param param the request object
     */
    public retrieveModelWithHttpInfo(param: ModelsApiRetrieveModelRequest, options?: ConfigurationOptions): Promise<HttpInfo<Model>> {
        return this.api.retrieveModelWithHttpInfo(param.model,  options).toPromise();
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param param the request object
     */
    public retrieveModel(param: ModelsApiRetrieveModelRequest, options?: ConfigurationOptions): Promise<Model> {
        return this.api.retrieveModel(param.model,  options).toPromise();
    }

}

import { ObservableModerationsApi } from "./ObservableAPI";
import { ModerationsApiRequestFactory, ModerationsApiResponseProcessor} from "../apis/ModerationsApi";

export interface ModerationsApiCreateModerationRequest {
    /**
     * 
     * @type CreateModerationRequest
     * @memberof ModerationsApicreateModeration
     */
    createModerationRequest: CreateModerationRequest
}

export class ObjectModerationsApi {
    private api: ObservableModerationsApi

    public constructor(configuration: Configuration, requestFactory?: ModerationsApiRequestFactory, responseProcessor?: ModerationsApiResponseProcessor) {
        this.api = new ObservableModerationsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
     * @param param the request object
     */
    public createModerationWithHttpInfo(param: ModerationsApiCreateModerationRequest, options?: ConfigurationOptions): Promise<HttpInfo<CreateModerationResponse>> {
        return this.api.createModerationWithHttpInfo(param.createModerationRequest,  options).toPromise();
    }

    /**
     * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
     * @param param the request object
     */
    public createModeration(param: ModerationsApiCreateModerationRequest, options?: ConfigurationOptions): Promise<CreateModerationResponse> {
        return this.api.createModeration(param.createModerationRequest,  options).toPromise();
    }

}

import { ObservableProjectsApi } from "./ObservableAPI";
import { ProjectsApiRequestFactory, ProjectsApiResponseProcessor} from "../apis/ProjectsApi";

export interface ProjectsApiArchiveProjectRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApiarchiveProject
     */
    projectId: string
}

export interface ProjectsApiCreateProjectRequest {
    /**
     * The project create request payload.
     * @type ProjectCreateRequest
     * @memberof ProjectsApicreateProject
     */
    projectCreateRequest: ProjectCreateRequest
}

export interface ProjectsApiCreateProjectServiceAccountRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApicreateProjectServiceAccount
     */
    projectId: string
    /**
     * The project service account create request payload.
     * @type ProjectServiceAccountCreateRequest
     * @memberof ProjectsApicreateProjectServiceAccount
     */
    projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest
}

export interface ProjectsApiCreateProjectUserRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApicreateProjectUser
     */
    projectId: string
    /**
     * The project user create request payload.
     * @type ProjectUserCreateRequest
     * @memberof ProjectsApicreateProjectUser
     */
    projectUserCreateRequest: ProjectUserCreateRequest
}

export interface ProjectsApiDeleteProjectApiKeyRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApideleteProjectApiKey
     */
    projectId: string
    /**
     * The ID of the API key.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApideleteProjectApiKey
     */
    keyId: string
}

export interface ProjectsApiDeleteProjectServiceAccountRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApideleteProjectServiceAccount
     */
    projectId: string
    /**
     * The ID of the service account.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApideleteProjectServiceAccount
     */
    serviceAccountId: string
}

export interface ProjectsApiDeleteProjectUserRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApideleteProjectUser
     */
    projectId: string
    /**
     * The ID of the user.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApideleteProjectUser
     */
    userId: string
}

export interface ProjectsApiListProjectApiKeysRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApilistProjectApiKeys
     */
    projectId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof ProjectsApilistProjectApiKeys
     */
    limit?: number
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApilistProjectApiKeys
     */
    after?: string
}

export interface ProjectsApiListProjectRateLimitsRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApilistProjectRateLimits
     */
    projectId: string
    /**
     * A limit on the number of objects to be returned. The default is 100. 
     * Defaults to: 100
     * @type number
     * @memberof ProjectsApilistProjectRateLimits
     */
    limit?: number
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApilistProjectRateLimits
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApilistProjectRateLimits
     */
    before?: string
}

export interface ProjectsApiListProjectServiceAccountsRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApilistProjectServiceAccounts
     */
    projectId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof ProjectsApilistProjectServiceAccounts
     */
    limit?: number
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApilistProjectServiceAccounts
     */
    after?: string
}

export interface ProjectsApiListProjectUsersRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApilistProjectUsers
     */
    projectId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof ProjectsApilistProjectUsers
     */
    limit?: number
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApilistProjectUsers
     */
    after?: string
}

export interface ProjectsApiListProjectsRequest {
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof ProjectsApilistProjects
     */
    limit?: number
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApilistProjects
     */
    after?: string
    /**
     * If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.
     * Defaults to: false
     * @type boolean
     * @memberof ProjectsApilistProjects
     */
    includeArchived?: boolean
}

export interface ProjectsApiModifyProjectRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApimodifyProject
     */
    projectId: string
    /**
     * The project update request payload.
     * @type ProjectUpdateRequest
     * @memberof ProjectsApimodifyProject
     */
    projectUpdateRequest: ProjectUpdateRequest
}

export interface ProjectsApiModifyProjectUserRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApimodifyProjectUser
     */
    projectId: string
    /**
     * The ID of the user.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApimodifyProjectUser
     */
    userId: string
    /**
     * The project user update request payload.
     * @type ProjectUserUpdateRequest
     * @memberof ProjectsApimodifyProjectUser
     */
    projectUserUpdateRequest: ProjectUserUpdateRequest
}

export interface ProjectsApiRetrieveProjectRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApiretrieveProject
     */
    projectId: string
}

export interface ProjectsApiRetrieveProjectApiKeyRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApiretrieveProjectApiKey
     */
    projectId: string
    /**
     * The ID of the API key.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApiretrieveProjectApiKey
     */
    keyId: string
}

export interface ProjectsApiRetrieveProjectServiceAccountRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApiretrieveProjectServiceAccount
     */
    projectId: string
    /**
     * The ID of the service account.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApiretrieveProjectServiceAccount
     */
    serviceAccountId: string
}

export interface ProjectsApiRetrieveProjectUserRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApiretrieveProjectUser
     */
    projectId: string
    /**
     * The ID of the user.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApiretrieveProjectUser
     */
    userId: string
}

export interface ProjectsApiUpdateProjectRateLimitsRequest {
    /**
     * The ID of the project.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApiupdateProjectRateLimits
     */
    projectId: string
    /**
     * The ID of the rate limit.
     * Defaults to: undefined
     * @type string
     * @memberof ProjectsApiupdateProjectRateLimits
     */
    rateLimitId: string
    /**
     * The project rate limit update request payload.
     * @type ProjectRateLimitUpdateRequest
     * @memberof ProjectsApiupdateProjectRateLimits
     */
    projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest
}

export class ObjectProjectsApi {
    private api: ObservableProjectsApi

    public constructor(configuration: Configuration, requestFactory?: ProjectsApiRequestFactory, responseProcessor?: ProjectsApiResponseProcessor) {
        this.api = new ObservableProjectsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     * @param param the request object
     */
    public archiveProjectWithHttpInfo(param: ProjectsApiArchiveProjectRequest, options?: ConfigurationOptions): Promise<HttpInfo<Project>> {
        return this.api.archiveProjectWithHttpInfo(param.projectId,  options).toPromise();
    }

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     * @param param the request object
     */
    public archiveProject(param: ProjectsApiArchiveProjectRequest, options?: ConfigurationOptions): Promise<Project> {
        return this.api.archiveProject(param.projectId,  options).toPromise();
    }

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     * @param param the request object
     */
    public createProjectWithHttpInfo(param: ProjectsApiCreateProjectRequest, options?: ConfigurationOptions): Promise<HttpInfo<Project>> {
        return this.api.createProjectWithHttpInfo(param.projectCreateRequest,  options).toPromise();
    }

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     * @param param the request object
     */
    public createProject(param: ProjectsApiCreateProjectRequest, options?: ConfigurationOptions): Promise<Project> {
        return this.api.createProject(param.projectCreateRequest,  options).toPromise();
    }

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     * @param param the request object
     */
    public createProjectServiceAccountWithHttpInfo(param: ProjectsApiCreateProjectServiceAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectServiceAccountCreateResponse>> {
        return this.api.createProjectServiceAccountWithHttpInfo(param.projectId, param.projectServiceAccountCreateRequest,  options).toPromise();
    }

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     * @param param the request object
     */
    public createProjectServiceAccount(param: ProjectsApiCreateProjectServiceAccountRequest, options?: ConfigurationOptions): Promise<ProjectServiceAccountCreateResponse> {
        return this.api.createProjectServiceAccount(param.projectId, param.projectServiceAccountCreateRequest,  options).toPromise();
    }

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     * @param param the request object
     */
    public createProjectUserWithHttpInfo(param: ProjectsApiCreateProjectUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectUser>> {
        return this.api.createProjectUserWithHttpInfo(param.projectId, param.projectUserCreateRequest,  options).toPromise();
    }

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     * @param param the request object
     */
    public createProjectUser(param: ProjectsApiCreateProjectUserRequest, options?: ConfigurationOptions): Promise<ProjectUser> {
        return this.api.createProjectUser(param.projectId, param.projectUserCreateRequest,  options).toPromise();
    }

    /**
     * Deletes an API key from the project.
     * @param param the request object
     */
    public deleteProjectApiKeyWithHttpInfo(param: ProjectsApiDeleteProjectApiKeyRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectApiKeyDeleteResponse>> {
        return this.api.deleteProjectApiKeyWithHttpInfo(param.projectId, param.keyId,  options).toPromise();
    }

    /**
     * Deletes an API key from the project.
     * @param param the request object
     */
    public deleteProjectApiKey(param: ProjectsApiDeleteProjectApiKeyRequest, options?: ConfigurationOptions): Promise<ProjectApiKeyDeleteResponse> {
        return this.api.deleteProjectApiKey(param.projectId, param.keyId,  options).toPromise();
    }

    /**
     * Deletes a service account from the project.
     * @param param the request object
     */
    public deleteProjectServiceAccountWithHttpInfo(param: ProjectsApiDeleteProjectServiceAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectServiceAccountDeleteResponse>> {
        return this.api.deleteProjectServiceAccountWithHttpInfo(param.projectId, param.serviceAccountId,  options).toPromise();
    }

    /**
     * Deletes a service account from the project.
     * @param param the request object
     */
    public deleteProjectServiceAccount(param: ProjectsApiDeleteProjectServiceAccountRequest, options?: ConfigurationOptions): Promise<ProjectServiceAccountDeleteResponse> {
        return this.api.deleteProjectServiceAccount(param.projectId, param.serviceAccountId,  options).toPromise();
    }

    /**
     * Deletes a user from the project.
     * @param param the request object
     */
    public deleteProjectUserWithHttpInfo(param: ProjectsApiDeleteProjectUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectUserDeleteResponse>> {
        return this.api.deleteProjectUserWithHttpInfo(param.projectId, param.userId,  options).toPromise();
    }

    /**
     * Deletes a user from the project.
     * @param param the request object
     */
    public deleteProjectUser(param: ProjectsApiDeleteProjectUserRequest, options?: ConfigurationOptions): Promise<ProjectUserDeleteResponse> {
        return this.api.deleteProjectUser(param.projectId, param.userId,  options).toPromise();
    }

    /**
     * Returns a list of API keys in the project.
     * @param param the request object
     */
    public listProjectApiKeysWithHttpInfo(param: ProjectsApiListProjectApiKeysRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectApiKeyListResponse>> {
        return this.api.listProjectApiKeysWithHttpInfo(param.projectId, param.limit, param.after,  options).toPromise();
    }

    /**
     * Returns a list of API keys in the project.
     * @param param the request object
     */
    public listProjectApiKeys(param: ProjectsApiListProjectApiKeysRequest, options?: ConfigurationOptions): Promise<ProjectApiKeyListResponse> {
        return this.api.listProjectApiKeys(param.projectId, param.limit, param.after,  options).toPromise();
    }

    /**
     * Returns the rate limits per model for a project.
     * @param param the request object
     */
    public listProjectRateLimitsWithHttpInfo(param: ProjectsApiListProjectRateLimitsRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectRateLimitListResponse>> {
        return this.api.listProjectRateLimitsWithHttpInfo(param.projectId, param.limit, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns the rate limits per model for a project.
     * @param param the request object
     */
    public listProjectRateLimits(param: ProjectsApiListProjectRateLimitsRequest, options?: ConfigurationOptions): Promise<ProjectRateLimitListResponse> {
        return this.api.listProjectRateLimits(param.projectId, param.limit, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of service accounts in the project.
     * @param param the request object
     */
    public listProjectServiceAccountsWithHttpInfo(param: ProjectsApiListProjectServiceAccountsRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectServiceAccountListResponse>> {
        return this.api.listProjectServiceAccountsWithHttpInfo(param.projectId, param.limit, param.after,  options).toPromise();
    }

    /**
     * Returns a list of service accounts in the project.
     * @param param the request object
     */
    public listProjectServiceAccounts(param: ProjectsApiListProjectServiceAccountsRequest, options?: ConfigurationOptions): Promise<ProjectServiceAccountListResponse> {
        return this.api.listProjectServiceAccounts(param.projectId, param.limit, param.after,  options).toPromise();
    }

    /**
     * Returns a list of users in the project.
     * @param param the request object
     */
    public listProjectUsersWithHttpInfo(param: ProjectsApiListProjectUsersRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectUserListResponse>> {
        return this.api.listProjectUsersWithHttpInfo(param.projectId, param.limit, param.after,  options).toPromise();
    }

    /**
     * Returns a list of users in the project.
     * @param param the request object
     */
    public listProjectUsers(param: ProjectsApiListProjectUsersRequest, options?: ConfigurationOptions): Promise<ProjectUserListResponse> {
        return this.api.listProjectUsers(param.projectId, param.limit, param.after,  options).toPromise();
    }

    /**
     * Returns a list of projects.
     * @param param the request object
     */
    public listProjectsWithHttpInfo(param: ProjectsApiListProjectsRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ProjectListResponse>> {
        return this.api.listProjectsWithHttpInfo(param.limit, param.after, param.includeArchived,  options).toPromise();
    }

    /**
     * Returns a list of projects.
     * @param param the request object
     */
    public listProjects(param: ProjectsApiListProjectsRequest = {}, options?: ConfigurationOptions): Promise<ProjectListResponse> {
        return this.api.listProjects(param.limit, param.after, param.includeArchived,  options).toPromise();
    }

    /**
     * Modifies a project in the organization.
     * @param param the request object
     */
    public modifyProjectWithHttpInfo(param: ProjectsApiModifyProjectRequest, options?: ConfigurationOptions): Promise<HttpInfo<Project>> {
        return this.api.modifyProjectWithHttpInfo(param.projectId, param.projectUpdateRequest,  options).toPromise();
    }

    /**
     * Modifies a project in the organization.
     * @param param the request object
     */
    public modifyProject(param: ProjectsApiModifyProjectRequest, options?: ConfigurationOptions): Promise<Project> {
        return this.api.modifyProject(param.projectId, param.projectUpdateRequest,  options).toPromise();
    }

    /**
     * Modifies a user\'s role in the project.
     * @param param the request object
     */
    public modifyProjectUserWithHttpInfo(param: ProjectsApiModifyProjectUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectUser>> {
        return this.api.modifyProjectUserWithHttpInfo(param.projectId, param.userId, param.projectUserUpdateRequest,  options).toPromise();
    }

    /**
     * Modifies a user\'s role in the project.
     * @param param the request object
     */
    public modifyProjectUser(param: ProjectsApiModifyProjectUserRequest, options?: ConfigurationOptions): Promise<ProjectUser> {
        return this.api.modifyProjectUser(param.projectId, param.userId, param.projectUserUpdateRequest,  options).toPromise();
    }

    /**
     * Retrieves a project.
     * @param param the request object
     */
    public retrieveProjectWithHttpInfo(param: ProjectsApiRetrieveProjectRequest, options?: ConfigurationOptions): Promise<HttpInfo<Project>> {
        return this.api.retrieveProjectWithHttpInfo(param.projectId,  options).toPromise();
    }

    /**
     * Retrieves a project.
     * @param param the request object
     */
    public retrieveProject(param: ProjectsApiRetrieveProjectRequest, options?: ConfigurationOptions): Promise<Project> {
        return this.api.retrieveProject(param.projectId,  options).toPromise();
    }

    /**
     * Retrieves an API key in the project.
     * @param param the request object
     */
    public retrieveProjectApiKeyWithHttpInfo(param: ProjectsApiRetrieveProjectApiKeyRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectApiKey>> {
        return this.api.retrieveProjectApiKeyWithHttpInfo(param.projectId, param.keyId,  options).toPromise();
    }

    /**
     * Retrieves an API key in the project.
     * @param param the request object
     */
    public retrieveProjectApiKey(param: ProjectsApiRetrieveProjectApiKeyRequest, options?: ConfigurationOptions): Promise<ProjectApiKey> {
        return this.api.retrieveProjectApiKey(param.projectId, param.keyId,  options).toPromise();
    }

    /**
     * Retrieves a service account in the project.
     * @param param the request object
     */
    public retrieveProjectServiceAccountWithHttpInfo(param: ProjectsApiRetrieveProjectServiceAccountRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectServiceAccount>> {
        return this.api.retrieveProjectServiceAccountWithHttpInfo(param.projectId, param.serviceAccountId,  options).toPromise();
    }

    /**
     * Retrieves a service account in the project.
     * @param param the request object
     */
    public retrieveProjectServiceAccount(param: ProjectsApiRetrieveProjectServiceAccountRequest, options?: ConfigurationOptions): Promise<ProjectServiceAccount> {
        return this.api.retrieveProjectServiceAccount(param.projectId, param.serviceAccountId,  options).toPromise();
    }

    /**
     * Retrieves a user in the project.
     * @param param the request object
     */
    public retrieveProjectUserWithHttpInfo(param: ProjectsApiRetrieveProjectUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectUser>> {
        return this.api.retrieveProjectUserWithHttpInfo(param.projectId, param.userId,  options).toPromise();
    }

    /**
     * Retrieves a user in the project.
     * @param param the request object
     */
    public retrieveProjectUser(param: ProjectsApiRetrieveProjectUserRequest, options?: ConfigurationOptions): Promise<ProjectUser> {
        return this.api.retrieveProjectUser(param.projectId, param.userId,  options).toPromise();
    }

    /**
     * Updates a project rate limit.
     * @param param the request object
     */
    public updateProjectRateLimitsWithHttpInfo(param: ProjectsApiUpdateProjectRateLimitsRequest, options?: ConfigurationOptions): Promise<HttpInfo<ProjectRateLimit>> {
        return this.api.updateProjectRateLimitsWithHttpInfo(param.projectId, param.rateLimitId, param.projectRateLimitUpdateRequest,  options).toPromise();
    }

    /**
     * Updates a project rate limit.
     * @param param the request object
     */
    public updateProjectRateLimits(param: ProjectsApiUpdateProjectRateLimitsRequest, options?: ConfigurationOptions): Promise<ProjectRateLimit> {
        return this.api.updateProjectRateLimits(param.projectId, param.rateLimitId, param.projectRateLimitUpdateRequest,  options).toPromise();
    }

}

import { ObservableRealtimeApi } from "./ObservableAPI";
import { RealtimeApiRequestFactory, RealtimeApiResponseProcessor} from "../apis/RealtimeApi";

export interface RealtimeApiCreateRealtimeSessionRequest {
    /**
     * Create an ephemeral API key with the given session configuration.
     * @type RealtimeSessionCreateRequest
     * @memberof RealtimeApicreateRealtimeSession
     */
    realtimeSessionCreateRequest: RealtimeSessionCreateRequest
}

export class ObjectRealtimeApi {
    private api: ObservableRealtimeApi

    public constructor(configuration: Configuration, requestFactory?: RealtimeApiRequestFactory, responseProcessor?: RealtimeApiResponseProcessor) {
        this.api = new ObservableRealtimeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
     * @param param the request object
     */
    public createRealtimeSessionWithHttpInfo(param: RealtimeApiCreateRealtimeSessionRequest, options?: ConfigurationOptions): Promise<HttpInfo<RealtimeSessionCreateResponse>> {
        return this.api.createRealtimeSessionWithHttpInfo(param.realtimeSessionCreateRequest,  options).toPromise();
    }

    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
     * @param param the request object
     */
    public createRealtimeSession(param: RealtimeApiCreateRealtimeSessionRequest, options?: ConfigurationOptions): Promise<RealtimeSessionCreateResponse> {
        return this.api.createRealtimeSession(param.realtimeSessionCreateRequest,  options).toPromise();
    }

}

import { ObservableUploadsApi } from "./ObservableAPI";
import { UploadsApiRequestFactory, UploadsApiResponseProcessor} from "../apis/UploadsApi";

export interface UploadsApiAddUploadPartRequest {
    /**
     * The ID of the Upload. 
     * Defaults to: undefined
     * @type string
     * @memberof UploadsApiaddUploadPart
     */
    uploadId: string
    /**
     * The chunk of bytes for this Part. 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof UploadsApiaddUploadPart
     */
    data: HttpFile
}

export interface UploadsApiCancelUploadRequest {
    /**
     * The ID of the Upload. 
     * Defaults to: undefined
     * @type string
     * @memberof UploadsApicancelUpload
     */
    uploadId: string
}

export interface UploadsApiCompleteUploadRequest {
    /**
     * The ID of the Upload. 
     * Defaults to: undefined
     * @type string
     * @memberof UploadsApicompleteUpload
     */
    uploadId: string
    /**
     * 
     * @type CompleteUploadRequest
     * @memberof UploadsApicompleteUpload
     */
    completeUploadRequest: CompleteUploadRequest
}

export interface UploadsApiCreateUploadRequest {
    /**
     * 
     * @type CreateUploadRequest
     * @memberof UploadsApicreateUpload
     */
    createUploadRequest: CreateUploadRequest
}

export class ObjectUploadsApi {
    private api: ObservableUploadsApi

    public constructor(configuration: Configuration, requestFactory?: UploadsApiRequestFactory, responseProcessor?: UploadsApiResponseProcessor) {
        this.api = new ObservableUploadsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
     * @param param the request object
     */
    public addUploadPartWithHttpInfo(param: UploadsApiAddUploadPartRequest, options?: ConfigurationOptions): Promise<HttpInfo<UploadPart>> {
        return this.api.addUploadPartWithHttpInfo(param.uploadId, param.data,  options).toPromise();
    }

    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
     * @param param the request object
     */
    public addUploadPart(param: UploadsApiAddUploadPartRequest, options?: ConfigurationOptions): Promise<UploadPart> {
        return this.api.addUploadPart(param.uploadId, param.data,  options).toPromise();
    }

    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled. 
     * @param param the request object
     */
    public cancelUploadWithHttpInfo(param: UploadsApiCancelUploadRequest, options?: ConfigurationOptions): Promise<HttpInfo<Upload>> {
        return this.api.cancelUploadWithHttpInfo(param.uploadId,  options).toPromise();
    }

    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled. 
     * @param param the request object
     */
    public cancelUpload(param: UploadsApiCancelUploadRequest, options?: ConfigurationOptions): Promise<Upload> {
        return this.api.cancelUpload(param.uploadId,  options).toPromise();
    }

    /**
     * Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
     * @param param the request object
     */
    public completeUploadWithHttpInfo(param: UploadsApiCompleteUploadRequest, options?: ConfigurationOptions): Promise<HttpInfo<Upload>> {
        return this.api.completeUploadWithHttpInfo(param.uploadId, param.completeUploadRequest,  options).toPromise();
    }

    /**
     * Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
     * @param param the request object
     */
    public completeUpload(param: UploadsApiCompleteUploadRequest, options?: ConfigurationOptions): Promise<Upload> {
        return this.api.completeUpload(param.uploadId, param.completeUploadRequest,  options).toPromise();
    }

    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
     * @param param the request object
     */
    public createUploadWithHttpInfo(param: UploadsApiCreateUploadRequest, options?: ConfigurationOptions): Promise<HttpInfo<Upload>> {
        return this.api.createUploadWithHttpInfo(param.createUploadRequest,  options).toPromise();
    }

    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
     * @param param the request object
     */
    public createUpload(param: UploadsApiCreateUploadRequest, options?: ConfigurationOptions): Promise<Upload> {
        return this.api.createUpload(param.createUploadRequest,  options).toPromise();
    }

}

import { ObservableUsageApi } from "./ObservableAPI";
import { UsageApiRequestFactory, UsageApiResponseProcessor} from "../apis/UsageApi";

export interface UsageApiUsageAudioSpeechesRequest {
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageAudioSpeeches
     */
    startTime: number
    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageAudioSpeeches
     */
    endTime?: number
    /**
     * Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * Defaults to: &#39;1d&#39;
     * @type &#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;
     * @memberof UsageApiusageAudioSpeeches
     */
    bucketWidth?: '1m' | '1h' | '1d'
    /**
     * Return only usage for these projects.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageAudioSpeeches
     */
    projectIds?: Array<string>
    /**
     * Return only usage for these users.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageAudioSpeeches
     */
    userIds?: Array<string>
    /**
     * Return only usage for these API keys.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageAudioSpeeches
     */
    apiKeyIds?: Array<string>
    /**
     * Return only usage for these models.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageAudioSpeeches
     */
    models?: Array<string>
    /**
     * Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * Defaults to: undefined
     * @type Array&lt;&#39;project_id&#39; | &#39;user_id&#39; | &#39;api_key_id&#39; | &#39;model&#39;&gt;
     * @memberof UsageApiusageAudioSpeeches
     */
    groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>
    /**
     * Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageAudioSpeeches
     */
    limit?: number
    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * Defaults to: undefined
     * @type string
     * @memberof UsageApiusageAudioSpeeches
     */
    page?: string
}

export interface UsageApiUsageAudioTranscriptionsRequest {
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageAudioTranscriptions
     */
    startTime: number
    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageAudioTranscriptions
     */
    endTime?: number
    /**
     * Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * Defaults to: &#39;1d&#39;
     * @type &#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;
     * @memberof UsageApiusageAudioTranscriptions
     */
    bucketWidth?: '1m' | '1h' | '1d'
    /**
     * Return only usage for these projects.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageAudioTranscriptions
     */
    projectIds?: Array<string>
    /**
     * Return only usage for these users.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageAudioTranscriptions
     */
    userIds?: Array<string>
    /**
     * Return only usage for these API keys.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageAudioTranscriptions
     */
    apiKeyIds?: Array<string>
    /**
     * Return only usage for these models.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageAudioTranscriptions
     */
    models?: Array<string>
    /**
     * Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * Defaults to: undefined
     * @type Array&lt;&#39;project_id&#39; | &#39;user_id&#39; | &#39;api_key_id&#39; | &#39;model&#39;&gt;
     * @memberof UsageApiusageAudioTranscriptions
     */
    groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>
    /**
     * Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageAudioTranscriptions
     */
    limit?: number
    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * Defaults to: undefined
     * @type string
     * @memberof UsageApiusageAudioTranscriptions
     */
    page?: string
}

export interface UsageApiUsageCodeInterpreterSessionsRequest {
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageCodeInterpreterSessions
     */
    startTime: number
    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageCodeInterpreterSessions
     */
    endTime?: number
    /**
     * Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * Defaults to: &#39;1d&#39;
     * @type &#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;
     * @memberof UsageApiusageCodeInterpreterSessions
     */
    bucketWidth?: '1m' | '1h' | '1d'
    /**
     * Return only usage for these projects.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageCodeInterpreterSessions
     */
    projectIds?: Array<string>
    /**
     * Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
     * Defaults to: undefined
     * @type Array&lt;&#39;project_id&#39;&gt;
     * @memberof UsageApiusageCodeInterpreterSessions
     */
    groupBy?: Array<'project_id'>
    /**
     * Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageCodeInterpreterSessions
     */
    limit?: number
    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * Defaults to: undefined
     * @type string
     * @memberof UsageApiusageCodeInterpreterSessions
     */
    page?: string
}

export interface UsageApiUsageCompletionsRequest {
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageCompletions
     */
    startTime: number
    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageCompletions
     */
    endTime?: number
    /**
     * Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * Defaults to: &#39;1d&#39;
     * @type &#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;
     * @memberof UsageApiusageCompletions
     */
    bucketWidth?: '1m' | '1h' | '1d'
    /**
     * Return only usage for these projects.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageCompletions
     */
    projectIds?: Array<string>
    /**
     * Return only usage for these users.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageCompletions
     */
    userIds?: Array<string>
    /**
     * Return only usage for these API keys.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageCompletions
     */
    apiKeyIds?: Array<string>
    /**
     * Return only usage for these models.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageCompletions
     */
    models?: Array<string>
    /**
     * If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. 
     * Defaults to: undefined
     * @type boolean
     * @memberof UsageApiusageCompletions
     */
    batch?: boolean
    /**
     * Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.
     * Defaults to: undefined
     * @type Array&lt;&#39;project_id&#39; | &#39;user_id&#39; | &#39;api_key_id&#39; | &#39;model&#39; | &#39;batch&#39;&gt;
     * @memberof UsageApiusageCompletions
     */
    groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'batch'>
    /**
     * Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageCompletions
     */
    limit?: number
    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * Defaults to: undefined
     * @type string
     * @memberof UsageApiusageCompletions
     */
    page?: string
}

export interface UsageApiUsageCostsRequest {
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageCosts
     */
    startTime: number
    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageCosts
     */
    endTime?: number
    /**
     * Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.
     * Defaults to: &#39;1d&#39;
     * @type &#39;1d&#39;
     * @memberof UsageApiusageCosts
     */
    bucketWidth?: '1d'
    /**
     * Return only costs for these projects.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageCosts
     */
    projectIds?: Array<string>
    /**
     * Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.
     * Defaults to: undefined
     * @type Array&lt;&#39;project_id&#39; | &#39;line_item&#39;&gt;
     * @memberof UsageApiusageCosts
     */
    groupBy?: Array<'project_id' | 'line_item'>
    /**
     * A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
     * Defaults to: 7
     * @type number
     * @memberof UsageApiusageCosts
     */
    limit?: number
    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * Defaults to: undefined
     * @type string
     * @memberof UsageApiusageCosts
     */
    page?: string
}

export interface UsageApiUsageEmbeddingsRequest {
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageEmbeddings
     */
    startTime: number
    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageEmbeddings
     */
    endTime?: number
    /**
     * Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * Defaults to: &#39;1d&#39;
     * @type &#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;
     * @memberof UsageApiusageEmbeddings
     */
    bucketWidth?: '1m' | '1h' | '1d'
    /**
     * Return only usage for these projects.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageEmbeddings
     */
    projectIds?: Array<string>
    /**
     * Return only usage for these users.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageEmbeddings
     */
    userIds?: Array<string>
    /**
     * Return only usage for these API keys.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageEmbeddings
     */
    apiKeyIds?: Array<string>
    /**
     * Return only usage for these models.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageEmbeddings
     */
    models?: Array<string>
    /**
     * Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * Defaults to: undefined
     * @type Array&lt;&#39;project_id&#39; | &#39;user_id&#39; | &#39;api_key_id&#39; | &#39;model&#39;&gt;
     * @memberof UsageApiusageEmbeddings
     */
    groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>
    /**
     * Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageEmbeddings
     */
    limit?: number
    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * Defaults to: undefined
     * @type string
     * @memberof UsageApiusageEmbeddings
     */
    page?: string
}

export interface UsageApiUsageImagesRequest {
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageImages
     */
    startTime: number
    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageImages
     */
    endTime?: number
    /**
     * Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * Defaults to: &#39;1d&#39;
     * @type &#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;
     * @memberof UsageApiusageImages
     */
    bucketWidth?: '1m' | '1h' | '1d'
    /**
     * Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.
     * Defaults to: undefined
     * @type Array&lt;&#39;image.generation&#39; | &#39;image.edit&#39; | &#39;image.variation&#39;&gt;
     * @memberof UsageApiusageImages
     */
    sources?: Array<'image.generation' | 'image.edit' | 'image.variation'>
    /**
     * Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.
     * Defaults to: undefined
     * @type Array&lt;&#39;256x256&#39; | &#39;512x512&#39; | &#39;1024x1024&#39; | &#39;1792x1792&#39; | &#39;1024x1792&#39;&gt;
     * @memberof UsageApiusageImages
     */
    sizes?: Array<'256x256' | '512x512' | '1024x1024' | '1792x1792' | '1024x1792'>
    /**
     * Return only usage for these projects.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageImages
     */
    projectIds?: Array<string>
    /**
     * Return only usage for these users.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageImages
     */
    userIds?: Array<string>
    /**
     * Return only usage for these API keys.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageImages
     */
    apiKeyIds?: Array<string>
    /**
     * Return only usage for these models.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageImages
     */
    models?: Array<string>
    /**
     * Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.
     * Defaults to: undefined
     * @type Array&lt;&#39;project_id&#39; | &#39;user_id&#39; | &#39;api_key_id&#39; | &#39;model&#39; | &#39;size&#39; | &#39;source&#39;&gt;
     * @memberof UsageApiusageImages
     */
    groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'size' | 'source'>
    /**
     * Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageImages
     */
    limit?: number
    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * Defaults to: undefined
     * @type string
     * @memberof UsageApiusageImages
     */
    page?: string
}

export interface UsageApiUsageModerationsRequest {
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageModerations
     */
    startTime: number
    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageModerations
     */
    endTime?: number
    /**
     * Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * Defaults to: &#39;1d&#39;
     * @type &#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;
     * @memberof UsageApiusageModerations
     */
    bucketWidth?: '1m' | '1h' | '1d'
    /**
     * Return only usage for these projects.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageModerations
     */
    projectIds?: Array<string>
    /**
     * Return only usage for these users.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageModerations
     */
    userIds?: Array<string>
    /**
     * Return only usage for these API keys.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageModerations
     */
    apiKeyIds?: Array<string>
    /**
     * Return only usage for these models.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageModerations
     */
    models?: Array<string>
    /**
     * Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
     * Defaults to: undefined
     * @type Array&lt;&#39;project_id&#39; | &#39;user_id&#39; | &#39;api_key_id&#39; | &#39;model&#39;&gt;
     * @memberof UsageApiusageModerations
     */
    groupBy?: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>
    /**
     * Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageModerations
     */
    limit?: number
    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * Defaults to: undefined
     * @type string
     * @memberof UsageApiusageModerations
     */
    page?: string
}

export interface UsageApiUsageVectorStoresRequest {
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageVectorStores
     */
    startTime: number
    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageVectorStores
     */
    endTime?: number
    /**
     * Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * Defaults to: &#39;1d&#39;
     * @type &#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;
     * @memberof UsageApiusageVectorStores
     */
    bucketWidth?: '1m' | '1h' | '1d'
    /**
     * Return only usage for these projects.
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof UsageApiusageVectorStores
     */
    projectIds?: Array<string>
    /**
     * Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
     * Defaults to: undefined
     * @type Array&lt;&#39;project_id&#39;&gt;
     * @memberof UsageApiusageVectorStores
     */
    groupBy?: Array<'project_id'>
    /**
     * Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
     * Defaults to: undefined
     * @type number
     * @memberof UsageApiusageVectorStores
     */
    limit?: number
    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * Defaults to: undefined
     * @type string
     * @memberof UsageApiusageVectorStores
     */
    page?: string
}

export class ObjectUsageApi {
    private api: ObservableUsageApi

    public constructor(configuration: Configuration, requestFactory?: UsageApiRequestFactory, responseProcessor?: UsageApiResponseProcessor) {
        this.api = new ObservableUsageApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get audio speeches usage details for the organization.
     * @param param the request object
     */
    public usageAudioSpeechesWithHttpInfo(param: UsageApiUsageAudioSpeechesRequest, options?: ConfigurationOptions): Promise<HttpInfo<UsageResponse>> {
        return this.api.usageAudioSpeechesWithHttpInfo(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get audio speeches usage details for the organization.
     * @param param the request object
     */
    public usageAudioSpeeches(param: UsageApiUsageAudioSpeechesRequest, options?: ConfigurationOptions): Promise<UsageResponse> {
        return this.api.usageAudioSpeeches(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get audio transcriptions usage details for the organization.
     * @param param the request object
     */
    public usageAudioTranscriptionsWithHttpInfo(param: UsageApiUsageAudioTranscriptionsRequest, options?: ConfigurationOptions): Promise<HttpInfo<UsageResponse>> {
        return this.api.usageAudioTranscriptionsWithHttpInfo(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get audio transcriptions usage details for the organization.
     * @param param the request object
     */
    public usageAudioTranscriptions(param: UsageApiUsageAudioTranscriptionsRequest, options?: ConfigurationOptions): Promise<UsageResponse> {
        return this.api.usageAudioTranscriptions(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get code interpreter sessions usage details for the organization.
     * @param param the request object
     */
    public usageCodeInterpreterSessionsWithHttpInfo(param: UsageApiUsageCodeInterpreterSessionsRequest, options?: ConfigurationOptions): Promise<HttpInfo<UsageResponse>> {
        return this.api.usageCodeInterpreterSessionsWithHttpInfo(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get code interpreter sessions usage details for the organization.
     * @param param the request object
     */
    public usageCodeInterpreterSessions(param: UsageApiUsageCodeInterpreterSessionsRequest, options?: ConfigurationOptions): Promise<UsageResponse> {
        return this.api.usageCodeInterpreterSessions(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get completions usage details for the organization.
     * @param param the request object
     */
    public usageCompletionsWithHttpInfo(param: UsageApiUsageCompletionsRequest, options?: ConfigurationOptions): Promise<HttpInfo<UsageResponse>> {
        return this.api.usageCompletionsWithHttpInfo(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.batch, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get completions usage details for the organization.
     * @param param the request object
     */
    public usageCompletions(param: UsageApiUsageCompletionsRequest, options?: ConfigurationOptions): Promise<UsageResponse> {
        return this.api.usageCompletions(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.batch, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get costs details for the organization.
     * @param param the request object
     */
    public usageCostsWithHttpInfo(param: UsageApiUsageCostsRequest, options?: ConfigurationOptions): Promise<HttpInfo<UsageResponse>> {
        return this.api.usageCostsWithHttpInfo(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get costs details for the organization.
     * @param param the request object
     */
    public usageCosts(param: UsageApiUsageCostsRequest, options?: ConfigurationOptions): Promise<UsageResponse> {
        return this.api.usageCosts(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get embeddings usage details for the organization.
     * @param param the request object
     */
    public usageEmbeddingsWithHttpInfo(param: UsageApiUsageEmbeddingsRequest, options?: ConfigurationOptions): Promise<HttpInfo<UsageResponse>> {
        return this.api.usageEmbeddingsWithHttpInfo(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get embeddings usage details for the organization.
     * @param param the request object
     */
    public usageEmbeddings(param: UsageApiUsageEmbeddingsRequest, options?: ConfigurationOptions): Promise<UsageResponse> {
        return this.api.usageEmbeddings(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get images usage details for the organization.
     * @param param the request object
     */
    public usageImagesWithHttpInfo(param: UsageApiUsageImagesRequest, options?: ConfigurationOptions): Promise<HttpInfo<UsageResponse>> {
        return this.api.usageImagesWithHttpInfo(param.startTime, param.endTime, param.bucketWidth, param.sources, param.sizes, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get images usage details for the organization.
     * @param param the request object
     */
    public usageImages(param: UsageApiUsageImagesRequest, options?: ConfigurationOptions): Promise<UsageResponse> {
        return this.api.usageImages(param.startTime, param.endTime, param.bucketWidth, param.sources, param.sizes, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get moderations usage details for the organization.
     * @param param the request object
     */
    public usageModerationsWithHttpInfo(param: UsageApiUsageModerationsRequest, options?: ConfigurationOptions): Promise<HttpInfo<UsageResponse>> {
        return this.api.usageModerationsWithHttpInfo(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get moderations usage details for the organization.
     * @param param the request object
     */
    public usageModerations(param: UsageApiUsageModerationsRequest, options?: ConfigurationOptions): Promise<UsageResponse> {
        return this.api.usageModerations(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.userIds, param.apiKeyIds, param.models, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get vector stores usage details for the organization.
     * @param param the request object
     */
    public usageVectorStoresWithHttpInfo(param: UsageApiUsageVectorStoresRequest, options?: ConfigurationOptions): Promise<HttpInfo<UsageResponse>> {
        return this.api.usageVectorStoresWithHttpInfo(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.groupBy, param.limit, param.page,  options).toPromise();
    }

    /**
     * Get vector stores usage details for the organization.
     * @param param the request object
     */
    public usageVectorStores(param: UsageApiUsageVectorStoresRequest, options?: ConfigurationOptions): Promise<UsageResponse> {
        return this.api.usageVectorStores(param.startTime, param.endTime, param.bucketWidth, param.projectIds, param.groupBy, param.limit, param.page,  options).toPromise();
    }

}

import { ObservableUsersApi } from "./ObservableAPI";
import { UsersApiRequestFactory, UsersApiResponseProcessor} from "../apis/UsersApi";

export interface UsersApiDeleteUserRequest {
    /**
     * The ID of the user.
     * Defaults to: undefined
     * @type string
     * @memberof UsersApideleteUser
     */
    userId: string
}

export interface UsersApiListUsersRequest {
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof UsersApilistUsers
     */
    limit?: number
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof UsersApilistUsers
     */
    after?: string
}

export interface UsersApiModifyUserRequest {
    /**
     * The ID of the user.
     * Defaults to: undefined
     * @type string
     * @memberof UsersApimodifyUser
     */
    userId: string
    /**
     * The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;.
     * @type UserRoleUpdateRequest
     * @memberof UsersApimodifyUser
     */
    userRoleUpdateRequest: UserRoleUpdateRequest
}

export interface UsersApiRetrieveUserRequest {
    /**
     * The ID of the user.
     * Defaults to: undefined
     * @type string
     * @memberof UsersApiretrieveUser
     */
    userId: string
}

export class ObjectUsersApi {
    private api: ObservableUsersApi

    public constructor(configuration: Configuration, requestFactory?: UsersApiRequestFactory, responseProcessor?: UsersApiResponseProcessor) {
        this.api = new ObservableUsersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Deletes a user from the organization.
     * @param param the request object
     */
    public deleteUserWithHttpInfo(param: UsersApiDeleteUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<UserDeleteResponse>> {
        return this.api.deleteUserWithHttpInfo(param.userId,  options).toPromise();
    }

    /**
     * Deletes a user from the organization.
     * @param param the request object
     */
    public deleteUser(param: UsersApiDeleteUserRequest, options?: ConfigurationOptions): Promise<UserDeleteResponse> {
        return this.api.deleteUser(param.userId,  options).toPromise();
    }

    /**
     * Lists all of the users in the organization.
     * @param param the request object
     */
    public listUsersWithHttpInfo(param: UsersApiListUsersRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<UserListResponse>> {
        return this.api.listUsersWithHttpInfo(param.limit, param.after,  options).toPromise();
    }

    /**
     * Lists all of the users in the organization.
     * @param param the request object
     */
    public listUsers(param: UsersApiListUsersRequest = {}, options?: ConfigurationOptions): Promise<UserListResponse> {
        return this.api.listUsers(param.limit, param.after,  options).toPromise();
    }

    /**
     * Modifies a user\'s role in the organization.
     * @param param the request object
     */
    public modifyUserWithHttpInfo(param: UsersApiModifyUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<User>> {
        return this.api.modifyUserWithHttpInfo(param.userId, param.userRoleUpdateRequest,  options).toPromise();
    }

    /**
     * Modifies a user\'s role in the organization.
     * @param param the request object
     */
    public modifyUser(param: UsersApiModifyUserRequest, options?: ConfigurationOptions): Promise<User> {
        return this.api.modifyUser(param.userId, param.userRoleUpdateRequest,  options).toPromise();
    }

    /**
     * Retrieves a user by their identifier.
     * @param param the request object
     */
    public retrieveUserWithHttpInfo(param: UsersApiRetrieveUserRequest, options?: ConfigurationOptions): Promise<HttpInfo<User>> {
        return this.api.retrieveUserWithHttpInfo(param.userId,  options).toPromise();
    }

    /**
     * Retrieves a user by their identifier.
     * @param param the request object
     */
    public retrieveUser(param: UsersApiRetrieveUserRequest, options?: ConfigurationOptions): Promise<User> {
        return this.api.retrieveUser(param.userId,  options).toPromise();
    }

}

import { ObservableVectorStoresApi } from "./ObservableAPI";
import { VectorStoresApiRequestFactory, VectorStoresApiResponseProcessor} from "../apis/VectorStoresApi";

export interface VectorStoresApiCancelVectorStoreFileBatchRequest {
    /**
     * The ID of the vector store that the file batch belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApicancelVectorStoreFileBatch
     */
    vectorStoreId: string
    /**
     * The ID of the file batch to cancel.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApicancelVectorStoreFileBatch
     */
    batchId: string
}

export interface VectorStoresApiCreateVectorStoreRequest {
    /**
     * 
     * @type CreateVectorStoreRequest
     * @memberof VectorStoresApicreateVectorStore
     */
    createVectorStoreRequest: CreateVectorStoreRequest
}

export interface VectorStoresApiCreateVectorStoreFileRequest {
    /**
     * The ID of the vector store for which to create a File. 
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApicreateVectorStoreFile
     */
    vectorStoreId: string
    /**
     * 
     * @type CreateVectorStoreFileRequest
     * @memberof VectorStoresApicreateVectorStoreFile
     */
    createVectorStoreFileRequest: CreateVectorStoreFileRequest
}

export interface VectorStoresApiCreateVectorStoreFileBatchRequest {
    /**
     * The ID of the vector store for which to create a File Batch. 
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApicreateVectorStoreFileBatch
     */
    vectorStoreId: string
    /**
     * 
     * @type CreateVectorStoreFileBatchRequest
     * @memberof VectorStoresApicreateVectorStoreFileBatch
     */
    createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest
}

export interface VectorStoresApiDeleteVectorStoreRequest {
    /**
     * The ID of the vector store to delete.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApideleteVectorStore
     */
    vectorStoreId: string
}

export interface VectorStoresApiDeleteVectorStoreFileRequest {
    /**
     * The ID of the vector store that the file belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApideleteVectorStoreFile
     */
    vectorStoreId: string
    /**
     * The ID of the file to delete.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApideleteVectorStoreFile
     */
    fileId: string
}

export interface VectorStoresApiGetVectorStoreRequest {
    /**
     * The ID of the vector store to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApigetVectorStore
     */
    vectorStoreId: string
}

export interface VectorStoresApiGetVectorStoreFileRequest {
    /**
     * The ID of the vector store that the file belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApigetVectorStoreFile
     */
    vectorStoreId: string
    /**
     * The ID of the file being retrieved.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApigetVectorStoreFile
     */
    fileId: string
}

export interface VectorStoresApiGetVectorStoreFileBatchRequest {
    /**
     * The ID of the vector store that the file batch belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApigetVectorStoreFileBatch
     */
    vectorStoreId: string
    /**
     * The ID of the file batch being retrieved.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApigetVectorStoreFileBatch
     */
    batchId: string
}

export interface VectorStoresApiListFilesInVectorStoreBatchRequest {
    /**
     * The ID of the vector store that the files belong to.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApilistFilesInVectorStoreBatch
     */
    vectorStoreId: string
    /**
     * The ID of the file batch that the files belong to.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApilistFilesInVectorStoreBatch
     */
    batchId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof VectorStoresApilistFilesInVectorStoreBatch
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof VectorStoresApilistFilesInVectorStoreBatch
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApilistFilesInVectorStoreBatch
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApilistFilesInVectorStoreBatch
     */
    before?: string
    /**
     * Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
     * Defaults to: undefined
     * @type &#39;in_progress&#39; | &#39;completed&#39; | &#39;failed&#39; | &#39;cancelled&#39;
     * @memberof VectorStoresApilistFilesInVectorStoreBatch
     */
    filter?: 'in_progress' | 'completed' | 'failed' | 'cancelled'
}

export interface VectorStoresApiListVectorStoreFilesRequest {
    /**
     * The ID of the vector store that the files belong to.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApilistVectorStoreFiles
     */
    vectorStoreId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof VectorStoresApilistVectorStoreFiles
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof VectorStoresApilistVectorStoreFiles
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApilistVectorStoreFiles
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApilistVectorStoreFiles
     */
    before?: string
    /**
     * Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.
     * Defaults to: undefined
     * @type &#39;in_progress&#39; | &#39;completed&#39; | &#39;failed&#39; | &#39;cancelled&#39;
     * @memberof VectorStoresApilistVectorStoreFiles
     */
    filter?: 'in_progress' | 'completed' | 'failed' | 'cancelled'
}

export interface VectorStoresApiListVectorStoresRequest {
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof VectorStoresApilistVectorStores
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof VectorStoresApilistVectorStores
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApilistVectorStores
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApilistVectorStores
     */
    before?: string
}

export interface VectorStoresApiModifyVectorStoreRequest {
    /**
     * The ID of the vector store to modify.
     * Defaults to: undefined
     * @type string
     * @memberof VectorStoresApimodifyVectorStore
     */
    vectorStoreId: string
    /**
     * 
     * @type UpdateVectorStoreRequest
     * @memberof VectorStoresApimodifyVectorStore
     */
    updateVectorStoreRequest: UpdateVectorStoreRequest
}

export class ObjectVectorStoresApi {
    private api: ObservableVectorStoresApi

    public constructor(configuration: Configuration, requestFactory?: VectorStoresApiRequestFactory, responseProcessor?: VectorStoresApiResponseProcessor) {
        this.api = new ObservableVectorStoresApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * @param param the request object
     */
    public cancelVectorStoreFileBatchWithHttpInfo(param: VectorStoresApiCancelVectorStoreFileBatchRequest, options?: ConfigurationOptions): Promise<HttpInfo<VectorStoreFileBatchObject>> {
        return this.api.cancelVectorStoreFileBatchWithHttpInfo(param.vectorStoreId, param.batchId,  options).toPromise();
    }

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * @param param the request object
     */
    public cancelVectorStoreFileBatch(param: VectorStoresApiCancelVectorStoreFileBatchRequest, options?: ConfigurationOptions): Promise<VectorStoreFileBatchObject> {
        return this.api.cancelVectorStoreFileBatch(param.vectorStoreId, param.batchId,  options).toPromise();
    }

    /**
     * Create a vector store.
     * @param param the request object
     */
    public createVectorStoreWithHttpInfo(param: VectorStoresApiCreateVectorStoreRequest, options?: ConfigurationOptions): Promise<HttpInfo<VectorStoreObject>> {
        return this.api.createVectorStoreWithHttpInfo(param.createVectorStoreRequest,  options).toPromise();
    }

    /**
     * Create a vector store.
     * @param param the request object
     */
    public createVectorStore(param: VectorStoresApiCreateVectorStoreRequest, options?: ConfigurationOptions): Promise<VectorStoreObject> {
        return this.api.createVectorStore(param.createVectorStoreRequest,  options).toPromise();
    }

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * @param param the request object
     */
    public createVectorStoreFileWithHttpInfo(param: VectorStoresApiCreateVectorStoreFileRequest, options?: ConfigurationOptions): Promise<HttpInfo<VectorStoreFileObject>> {
        return this.api.createVectorStoreFileWithHttpInfo(param.vectorStoreId, param.createVectorStoreFileRequest,  options).toPromise();
    }

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * @param param the request object
     */
    public createVectorStoreFile(param: VectorStoresApiCreateVectorStoreFileRequest, options?: ConfigurationOptions): Promise<VectorStoreFileObject> {
        return this.api.createVectorStoreFile(param.vectorStoreId, param.createVectorStoreFileRequest,  options).toPromise();
    }

    /**
     * Create a vector store file batch.
     * @param param the request object
     */
    public createVectorStoreFileBatchWithHttpInfo(param: VectorStoresApiCreateVectorStoreFileBatchRequest, options?: ConfigurationOptions): Promise<HttpInfo<VectorStoreFileBatchObject>> {
        return this.api.createVectorStoreFileBatchWithHttpInfo(param.vectorStoreId, param.createVectorStoreFileBatchRequest,  options).toPromise();
    }

    /**
     * Create a vector store file batch.
     * @param param the request object
     */
    public createVectorStoreFileBatch(param: VectorStoresApiCreateVectorStoreFileBatchRequest, options?: ConfigurationOptions): Promise<VectorStoreFileBatchObject> {
        return this.api.createVectorStoreFileBatch(param.vectorStoreId, param.createVectorStoreFileBatchRequest,  options).toPromise();
    }

    /**
     * Delete a vector store.
     * @param param the request object
     */
    public deleteVectorStoreWithHttpInfo(param: VectorStoresApiDeleteVectorStoreRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeleteVectorStoreResponse>> {
        return this.api.deleteVectorStoreWithHttpInfo(param.vectorStoreId,  options).toPromise();
    }

    /**
     * Delete a vector store.
     * @param param the request object
     */
    public deleteVectorStore(param: VectorStoresApiDeleteVectorStoreRequest, options?: ConfigurationOptions): Promise<DeleteVectorStoreResponse> {
        return this.api.deleteVectorStore(param.vectorStoreId,  options).toPromise();
    }

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * @param param the request object
     */
    public deleteVectorStoreFileWithHttpInfo(param: VectorStoresApiDeleteVectorStoreFileRequest, options?: ConfigurationOptions): Promise<HttpInfo<DeleteVectorStoreFileResponse>> {
        return this.api.deleteVectorStoreFileWithHttpInfo(param.vectorStoreId, param.fileId,  options).toPromise();
    }

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * @param param the request object
     */
    public deleteVectorStoreFile(param: VectorStoresApiDeleteVectorStoreFileRequest, options?: ConfigurationOptions): Promise<DeleteVectorStoreFileResponse> {
        return this.api.deleteVectorStoreFile(param.vectorStoreId, param.fileId,  options).toPromise();
    }

    /**
     * Retrieves a vector store.
     * @param param the request object
     */
    public getVectorStoreWithHttpInfo(param: VectorStoresApiGetVectorStoreRequest, options?: ConfigurationOptions): Promise<HttpInfo<VectorStoreObject>> {
        return this.api.getVectorStoreWithHttpInfo(param.vectorStoreId,  options).toPromise();
    }

    /**
     * Retrieves a vector store.
     * @param param the request object
     */
    public getVectorStore(param: VectorStoresApiGetVectorStoreRequest, options?: ConfigurationOptions): Promise<VectorStoreObject> {
        return this.api.getVectorStore(param.vectorStoreId,  options).toPromise();
    }

    /**
     * Retrieves a vector store file.
     * @param param the request object
     */
    public getVectorStoreFileWithHttpInfo(param: VectorStoresApiGetVectorStoreFileRequest, options?: ConfigurationOptions): Promise<HttpInfo<VectorStoreFileObject>> {
        return this.api.getVectorStoreFileWithHttpInfo(param.vectorStoreId, param.fileId,  options).toPromise();
    }

    /**
     * Retrieves a vector store file.
     * @param param the request object
     */
    public getVectorStoreFile(param: VectorStoresApiGetVectorStoreFileRequest, options?: ConfigurationOptions): Promise<VectorStoreFileObject> {
        return this.api.getVectorStoreFile(param.vectorStoreId, param.fileId,  options).toPromise();
    }

    /**
     * Retrieves a vector store file batch.
     * @param param the request object
     */
    public getVectorStoreFileBatchWithHttpInfo(param: VectorStoresApiGetVectorStoreFileBatchRequest, options?: ConfigurationOptions): Promise<HttpInfo<VectorStoreFileBatchObject>> {
        return this.api.getVectorStoreFileBatchWithHttpInfo(param.vectorStoreId, param.batchId,  options).toPromise();
    }

    /**
     * Retrieves a vector store file batch.
     * @param param the request object
     */
    public getVectorStoreFileBatch(param: VectorStoresApiGetVectorStoreFileBatchRequest, options?: ConfigurationOptions): Promise<VectorStoreFileBatchObject> {
        return this.api.getVectorStoreFileBatch(param.vectorStoreId, param.batchId,  options).toPromise();
    }

    /**
     * Returns a list of vector store files in a batch.
     * @param param the request object
     */
    public listFilesInVectorStoreBatchWithHttpInfo(param: VectorStoresApiListFilesInVectorStoreBatchRequest, options?: ConfigurationOptions): Promise<HttpInfo<ListVectorStoreFilesResponse>> {
        return this.api.listFilesInVectorStoreBatchWithHttpInfo(param.vectorStoreId, param.batchId, param.limit, param.order, param.after, param.before, param.filter,  options).toPromise();
    }

    /**
     * Returns a list of vector store files in a batch.
     * @param param the request object
     */
    public listFilesInVectorStoreBatch(param: VectorStoresApiListFilesInVectorStoreBatchRequest, options?: ConfigurationOptions): Promise<ListVectorStoreFilesResponse> {
        return this.api.listFilesInVectorStoreBatch(param.vectorStoreId, param.batchId, param.limit, param.order, param.after, param.before, param.filter,  options).toPromise();
    }

    /**
     * Returns a list of vector store files.
     * @param param the request object
     */
    public listVectorStoreFilesWithHttpInfo(param: VectorStoresApiListVectorStoreFilesRequest, options?: ConfigurationOptions): Promise<HttpInfo<ListVectorStoreFilesResponse>> {
        return this.api.listVectorStoreFilesWithHttpInfo(param.vectorStoreId, param.limit, param.order, param.after, param.before, param.filter,  options).toPromise();
    }

    /**
     * Returns a list of vector store files.
     * @param param the request object
     */
    public listVectorStoreFiles(param: VectorStoresApiListVectorStoreFilesRequest, options?: ConfigurationOptions): Promise<ListVectorStoreFilesResponse> {
        return this.api.listVectorStoreFiles(param.vectorStoreId, param.limit, param.order, param.after, param.before, param.filter,  options).toPromise();
    }

    /**
     * Returns a list of vector stores.
     * @param param the request object
     */
    public listVectorStoresWithHttpInfo(param: VectorStoresApiListVectorStoresRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<ListVectorStoresResponse>> {
        return this.api.listVectorStoresWithHttpInfo(param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of vector stores.
     * @param param the request object
     */
    public listVectorStores(param: VectorStoresApiListVectorStoresRequest = {}, options?: ConfigurationOptions): Promise<ListVectorStoresResponse> {
        return this.api.listVectorStores(param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Modifies a vector store.
     * @param param the request object
     */
    public modifyVectorStoreWithHttpInfo(param: VectorStoresApiModifyVectorStoreRequest, options?: ConfigurationOptions): Promise<HttpInfo<VectorStoreObject>> {
        return this.api.modifyVectorStoreWithHttpInfo(param.vectorStoreId, param.updateVectorStoreRequest,  options).toPromise();
    }

    /**
     * Modifies a vector store.
     * @param param the request object
     */
    public modifyVectorStore(param: VectorStoresApiModifyVectorStoreRequest, options?: ConfigurationOptions): Promise<VectorStoreObject> {
        return this.api.modifyVectorStore(param.vectorStoreId, param.updateVectorStoreRequest,  options).toPromise();
    }

}
