# coding: utf-8

# import models into model package
from openapi_server.models.assistant_file_object import AssistantFileObject
from openapi_server.models.assistant_object import AssistantObject
from openapi_server.models.assistant_object_tools_inner import AssistantObjectToolsInner
from openapi_server.models.assistant_stream_event import AssistantStreamEvent
from openapi_server.models.assistant_tools_code import AssistantToolsCode
from openapi_server.models.assistant_tools_function import AssistantToolsFunction
from openapi_server.models.assistant_tools_retrieval import AssistantToolsRetrieval
from openapi_server.models.assistants_api_named_tool_choice import AssistantsApiNamedToolChoice
from openapi_server.models.assistants_api_response_format import AssistantsApiResponseFormat
from openapi_server.models.assistants_api_response_format_option import AssistantsApiResponseFormatOption
from openapi_server.models.assistants_api_tool_choice_option import AssistantsApiToolChoiceOption
from openapi_server.models.chat_completion_function_call_option import ChatCompletionFunctionCallOption
from openapi_server.models.chat_completion_functions import ChatCompletionFunctions
from openapi_server.models.chat_completion_message_tool_call import ChatCompletionMessageToolCall
from openapi_server.models.chat_completion_message_tool_call_chunk import ChatCompletionMessageToolCallChunk
from openapi_server.models.chat_completion_message_tool_call_chunk_function import ChatCompletionMessageToolCallChunkFunction
from openapi_server.models.chat_completion_message_tool_call_function import ChatCompletionMessageToolCallFunction
from openapi_server.models.chat_completion_named_tool_choice import ChatCompletionNamedToolChoice
from openapi_server.models.chat_completion_named_tool_choice_function import ChatCompletionNamedToolChoiceFunction
from openapi_server.models.chat_completion_request_assistant_message import ChatCompletionRequestAssistantMessage
from openapi_server.models.chat_completion_request_assistant_message_function_call import ChatCompletionRequestAssistantMessageFunctionCall
from openapi_server.models.chat_completion_request_function_message import ChatCompletionRequestFunctionMessage
from openapi_server.models.chat_completion_request_message import ChatCompletionRequestMessage
from openapi_server.models.chat_completion_request_message_content_part import ChatCompletionRequestMessageContentPart
from openapi_server.models.chat_completion_request_message_content_part_image import ChatCompletionRequestMessageContentPartImage
from openapi_server.models.chat_completion_request_message_content_part_image_image_url import ChatCompletionRequestMessageContentPartImageImageUrl
from openapi_server.models.chat_completion_request_message_content_part_text import ChatCompletionRequestMessageContentPartText
from openapi_server.models.chat_completion_request_system_message import ChatCompletionRequestSystemMessage
from openapi_server.models.chat_completion_request_tool_message import ChatCompletionRequestToolMessage
from openapi_server.models.chat_completion_request_user_message import ChatCompletionRequestUserMessage
from openapi_server.models.chat_completion_request_user_message_content import ChatCompletionRequestUserMessageContent
from openapi_server.models.chat_completion_response_message import ChatCompletionResponseMessage
from openapi_server.models.chat_completion_role import ChatCompletionRole
from openapi_server.models.chat_completion_stream_response_delta import ChatCompletionStreamResponseDelta
from openapi_server.models.chat_completion_stream_response_delta_function_call import ChatCompletionStreamResponseDeltaFunctionCall
from openapi_server.models.chat_completion_token_logprob import ChatCompletionTokenLogprob
from openapi_server.models.chat_completion_token_logprob_top_logprobs_inner import ChatCompletionTokenLogprobTopLogprobsInner
from openapi_server.models.chat_completion_tool import ChatCompletionTool
from openapi_server.models.chat_completion_tool_choice_option import ChatCompletionToolChoiceOption
from openapi_server.models.completion_usage import CompletionUsage
from openapi_server.models.create_assistant_file_request import CreateAssistantFileRequest
from openapi_server.models.create_assistant_request import CreateAssistantRequest
from openapi_server.models.create_assistant_request_model import CreateAssistantRequestModel
from openapi_server.models.create_chat_completion_function_response import CreateChatCompletionFunctionResponse
from openapi_server.models.create_chat_completion_function_response_choices_inner import CreateChatCompletionFunctionResponseChoicesInner
from openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest
from openapi_server.models.create_chat_completion_request_function_call import CreateChatCompletionRequestFunctionCall
from openapi_server.models.create_chat_completion_request_model import CreateChatCompletionRequestModel
from openapi_server.models.create_chat_completion_request_response_format import CreateChatCompletionRequestResponseFormat
from openapi_server.models.create_chat_completion_request_stop import CreateChatCompletionRequestStop
from openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse
from openapi_server.models.create_chat_completion_response_choices_inner import CreateChatCompletionResponseChoicesInner
from openapi_server.models.create_chat_completion_response_choices_inner_logprobs import CreateChatCompletionResponseChoicesInnerLogprobs
from openapi_server.models.create_chat_completion_stream_response import CreateChatCompletionStreamResponse
from openapi_server.models.create_chat_completion_stream_response_choices_inner import CreateChatCompletionStreamResponseChoicesInner
from openapi_server.models.create_completion_request import CreateCompletionRequest
from openapi_server.models.create_completion_request_model import CreateCompletionRequestModel
from openapi_server.models.create_completion_request_prompt import CreateCompletionRequestPrompt
from openapi_server.models.create_completion_request_stop import CreateCompletionRequestStop
from openapi_server.models.create_completion_response import CreateCompletionResponse
from openapi_server.models.create_completion_response_choices_inner import CreateCompletionResponseChoicesInner
from openapi_server.models.create_completion_response_choices_inner_logprobs import CreateCompletionResponseChoicesInnerLogprobs
from openapi_server.models.create_embedding_request import CreateEmbeddingRequest
from openapi_server.models.create_embedding_request_input import CreateEmbeddingRequestInput
from openapi_server.models.create_embedding_request_model import CreateEmbeddingRequestModel
from openapi_server.models.create_embedding_response import CreateEmbeddingResponse
from openapi_server.models.create_embedding_response_usage import CreateEmbeddingResponseUsage
from openapi_server.models.create_fine_tuning_job_request import CreateFineTuningJobRequest
from openapi_server.models.create_fine_tuning_job_request_hyperparameters import CreateFineTuningJobRequestHyperparameters
from openapi_server.models.create_fine_tuning_job_request_hyperparameters_batch_size import CreateFineTuningJobRequestHyperparametersBatchSize
from openapi_server.models.create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier import CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
from openapi_server.models.create_fine_tuning_job_request_hyperparameters_n_epochs import CreateFineTuningJobRequestHyperparametersNEpochs
from openapi_server.models.create_fine_tuning_job_request_integrations_inner import CreateFineTuningJobRequestIntegrationsInner
from openapi_server.models.create_fine_tuning_job_request_integrations_inner_type import CreateFineTuningJobRequestIntegrationsInnerType
from openapi_server.models.create_fine_tuning_job_request_integrations_inner_wandb import CreateFineTuningJobRequestIntegrationsInnerWandb
from openapi_server.models.create_fine_tuning_job_request_model import CreateFineTuningJobRequestModel
from openapi_server.models.create_image_edit_request_model import CreateImageEditRequestModel
from openapi_server.models.create_image_request import CreateImageRequest
from openapi_server.models.create_image_request_model import CreateImageRequestModel
from openapi_server.models.create_message_request import CreateMessageRequest
from openapi_server.models.create_moderation_request import CreateModerationRequest
from openapi_server.models.create_moderation_request_input import CreateModerationRequestInput
from openapi_server.models.create_moderation_request_model import CreateModerationRequestModel
from openapi_server.models.create_moderation_response import CreateModerationResponse
from openapi_server.models.create_moderation_response_results_inner import CreateModerationResponseResultsInner
from openapi_server.models.create_moderation_response_results_inner_categories import CreateModerationResponseResultsInnerCategories
from openapi_server.models.create_moderation_response_results_inner_category_scores import CreateModerationResponseResultsInnerCategoryScores
from openapi_server.models.create_run_request import CreateRunRequest
from openapi_server.models.create_run_request_model import CreateRunRequestModel
from openapi_server.models.create_speech_request import CreateSpeechRequest
from openapi_server.models.create_speech_request_model import CreateSpeechRequestModel
from openapi_server.models.create_thread_and_run_request import CreateThreadAndRunRequest
from openapi_server.models.create_thread_and_run_request_tools_inner import CreateThreadAndRunRequestToolsInner
from openapi_server.models.create_thread_request import CreateThreadRequest
from openapi_server.models.create_transcription200_response import CreateTranscription200Response
from openapi_server.models.create_transcription_request_model import CreateTranscriptionRequestModel
from openapi_server.models.create_transcription_response_json import CreateTranscriptionResponseJson
from openapi_server.models.create_transcription_response_verbose_json import CreateTranscriptionResponseVerboseJson
from openapi_server.models.create_translation200_response import CreateTranslation200Response
from openapi_server.models.create_translation_response_json import CreateTranslationResponseJson
from openapi_server.models.create_translation_response_verbose_json import CreateTranslationResponseVerboseJson
from openapi_server.models.delete_assistant_file_response import DeleteAssistantFileResponse
from openapi_server.models.delete_assistant_response import DeleteAssistantResponse
from openapi_server.models.delete_file_response import DeleteFileResponse
from openapi_server.models.delete_message_response import DeleteMessageResponse
from openapi_server.models.delete_model_response import DeleteModelResponse
from openapi_server.models.delete_thread_response import DeleteThreadResponse
from openapi_server.models.done_event import DoneEvent
from openapi_server.models.embedding import Embedding
from openapi_server.models.error import Error
from openapi_server.models.error_event import ErrorEvent
from openapi_server.models.error_response import ErrorResponse
from openapi_server.models.fine_tuning_integration import FineTuningIntegration
from openapi_server.models.fine_tuning_job import FineTuningJob
from openapi_server.models.fine_tuning_job_checkpoint import FineTuningJobCheckpoint
from openapi_server.models.fine_tuning_job_checkpoint_metrics import FineTuningJobCheckpointMetrics
from openapi_server.models.fine_tuning_job_error import FineTuningJobError
from openapi_server.models.fine_tuning_job_event import FineTuningJobEvent
from openapi_server.models.fine_tuning_job_hyperparameters import FineTuningJobHyperparameters
from openapi_server.models.fine_tuning_job_hyperparameters_n_epochs import FineTuningJobHyperparametersNEpochs
from openapi_server.models.fine_tuning_job_integrations_inner import FineTuningJobIntegrationsInner
from openapi_server.models.function_object import FunctionObject
from openapi_server.models.image import Image
from openapi_server.models.images_response import ImagesResponse
from openapi_server.models.list_assistant_files_response import ListAssistantFilesResponse
from openapi_server.models.list_assistants_response import ListAssistantsResponse
from openapi_server.models.list_files_response import ListFilesResponse
from openapi_server.models.list_fine_tuning_job_checkpoints_response import ListFineTuningJobCheckpointsResponse
from openapi_server.models.list_fine_tuning_job_events_response import ListFineTuningJobEventsResponse
from openapi_server.models.list_message_files_response import ListMessageFilesResponse
from openapi_server.models.list_messages_response import ListMessagesResponse
from openapi_server.models.list_models_response import ListModelsResponse
from openapi_server.models.list_paginated_fine_tuning_jobs_response import ListPaginatedFineTuningJobsResponse
from openapi_server.models.list_run_steps_response import ListRunStepsResponse
from openapi_server.models.list_runs_response import ListRunsResponse
from openapi_server.models.list_threads_response import ListThreadsResponse
from openapi_server.models.message_content_image_file_object import MessageContentImageFileObject
from openapi_server.models.message_content_image_file_object_image_file import MessageContentImageFileObjectImageFile
from openapi_server.models.message_content_text_annotations_file_citation_object import MessageContentTextAnnotationsFileCitationObject
from openapi_server.models.message_content_text_annotations_file_citation_object_file_citation import MessageContentTextAnnotationsFileCitationObjectFileCitation
from openapi_server.models.message_content_text_annotations_file_path_object import MessageContentTextAnnotationsFilePathObject
from openapi_server.models.message_content_text_annotations_file_path_object_file_path import MessageContentTextAnnotationsFilePathObjectFilePath
from openapi_server.models.message_content_text_object import MessageContentTextObject
from openapi_server.models.message_content_text_object_text import MessageContentTextObjectText
from openapi_server.models.message_content_text_object_text_annotations_inner import MessageContentTextObjectTextAnnotationsInner
from openapi_server.models.message_delta_content_image_file_object import MessageDeltaContentImageFileObject
from openapi_server.models.message_delta_content_image_file_object_image_file import MessageDeltaContentImageFileObjectImageFile
from openapi_server.models.message_delta_content_text_annotations_file_citation_object import MessageDeltaContentTextAnnotationsFileCitationObject
from openapi_server.models.message_delta_content_text_annotations_file_citation_object_file_citation import MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
from openapi_server.models.message_delta_content_text_annotations_file_path_object import MessageDeltaContentTextAnnotationsFilePathObject
from openapi_server.models.message_delta_content_text_annotations_file_path_object_file_path import MessageDeltaContentTextAnnotationsFilePathObjectFilePath
from openapi_server.models.message_delta_content_text_object import MessageDeltaContentTextObject
from openapi_server.models.message_delta_content_text_object_text import MessageDeltaContentTextObjectText
from openapi_server.models.message_delta_content_text_object_text_annotations_inner import MessageDeltaContentTextObjectTextAnnotationsInner
from openapi_server.models.message_delta_object import MessageDeltaObject
from openapi_server.models.message_delta_object_delta import MessageDeltaObjectDelta
from openapi_server.models.message_delta_object_delta_content_inner import MessageDeltaObjectDeltaContentInner
from openapi_server.models.message_file_object import MessageFileObject
from openapi_server.models.message_object import MessageObject
from openapi_server.models.message_object_content_inner import MessageObjectContentInner
from openapi_server.models.message_object_incomplete_details import MessageObjectIncompleteDetails
from openapi_server.models.message_stream_event import MessageStreamEvent
from openapi_server.models.message_stream_event_one_of import MessageStreamEventOneOf
from openapi_server.models.message_stream_event_one_of1 import MessageStreamEventOneOf1
from openapi_server.models.message_stream_event_one_of2 import MessageStreamEventOneOf2
from openapi_server.models.message_stream_event_one_of3 import MessageStreamEventOneOf3
from openapi_server.models.message_stream_event_one_of4 import MessageStreamEventOneOf4
from openapi_server.models.model import Model
from openapi_server.models.modify_assistant_request import ModifyAssistantRequest
from openapi_server.models.modify_message_request import ModifyMessageRequest
from openapi_server.models.modify_run_request import ModifyRunRequest
from openapi_server.models.modify_thread_request import ModifyThreadRequest
from openapi_server.models.open_ai_file import OpenAIFile
from openapi_server.models.run_completion_usage import RunCompletionUsage
from openapi_server.models.run_object import RunObject
from openapi_server.models.run_object_incomplete_details import RunObjectIncompleteDetails
from openapi_server.models.run_object_last_error import RunObjectLastError
from openapi_server.models.run_object_required_action import RunObjectRequiredAction
from openapi_server.models.run_object_required_action_submit_tool_outputs import RunObjectRequiredActionSubmitToolOutputs
from openapi_server.models.run_step_completion_usage import RunStepCompletionUsage
from openapi_server.models.run_step_delta_object import RunStepDeltaObject
from openapi_server.models.run_step_delta_object_delta import RunStepDeltaObjectDelta
from openapi_server.models.run_step_delta_object_delta_step_details import RunStepDeltaObjectDeltaStepDetails
from openapi_server.models.run_step_delta_step_details_message_creation_object import RunStepDeltaStepDetailsMessageCreationObject
from openapi_server.models.run_step_delta_step_details_message_creation_object_message_creation import RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
from openapi_server.models.run_step_delta_step_details_tool_calls_code_object import RunStepDeltaStepDetailsToolCallsCodeObject
from openapi_server.models.run_step_delta_step_details_tool_calls_code_object_code_interpreter import RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
from openapi_server.models.run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner import RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
from openapi_server.models.run_step_delta_step_details_tool_calls_code_output_image_object import RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
from openapi_server.models.run_step_delta_step_details_tool_calls_code_output_image_object_image import RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
from openapi_server.models.run_step_delta_step_details_tool_calls_code_output_logs_object import RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
from openapi_server.models.run_step_delta_step_details_tool_calls_function_object import RunStepDeltaStepDetailsToolCallsFunctionObject
from openapi_server.models.run_step_delta_step_details_tool_calls_function_object_function import RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
from openapi_server.models.run_step_delta_step_details_tool_calls_object import RunStepDeltaStepDetailsToolCallsObject
from openapi_server.models.run_step_delta_step_details_tool_calls_object_tool_calls_inner import RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
from openapi_server.models.run_step_delta_step_details_tool_calls_retrieval_object import RunStepDeltaStepDetailsToolCallsRetrievalObject
from openapi_server.models.run_step_details_message_creation_object import RunStepDetailsMessageCreationObject
from openapi_server.models.run_step_details_message_creation_object_message_creation import RunStepDetailsMessageCreationObjectMessageCreation
from openapi_server.models.run_step_details_tool_calls_code_object import RunStepDetailsToolCallsCodeObject
from openapi_server.models.run_step_details_tool_calls_code_object_code_interpreter import RunStepDetailsToolCallsCodeObjectCodeInterpreter
from openapi_server.models.run_step_details_tool_calls_code_object_code_interpreter_outputs_inner import RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
from openapi_server.models.run_step_details_tool_calls_code_output_image_object import RunStepDetailsToolCallsCodeOutputImageObject
from openapi_server.models.run_step_details_tool_calls_code_output_image_object_image import RunStepDetailsToolCallsCodeOutputImageObjectImage
from openapi_server.models.run_step_details_tool_calls_code_output_logs_object import RunStepDetailsToolCallsCodeOutputLogsObject
from openapi_server.models.run_step_details_tool_calls_function_object import RunStepDetailsToolCallsFunctionObject
from openapi_server.models.run_step_details_tool_calls_function_object_function import RunStepDetailsToolCallsFunctionObjectFunction
from openapi_server.models.run_step_details_tool_calls_object import RunStepDetailsToolCallsObject
from openapi_server.models.run_step_details_tool_calls_object_tool_calls_inner import RunStepDetailsToolCallsObjectToolCallsInner
from openapi_server.models.run_step_details_tool_calls_retrieval_object import RunStepDetailsToolCallsRetrievalObject
from openapi_server.models.run_step_object import RunStepObject
from openapi_server.models.run_step_object_last_error import RunStepObjectLastError
from openapi_server.models.run_step_object_step_details import RunStepObjectStepDetails
from openapi_server.models.run_step_stream_event import RunStepStreamEvent
from openapi_server.models.run_step_stream_event_one_of import RunStepStreamEventOneOf
from openapi_server.models.run_step_stream_event_one_of1 import RunStepStreamEventOneOf1
from openapi_server.models.run_step_stream_event_one_of2 import RunStepStreamEventOneOf2
from openapi_server.models.run_step_stream_event_one_of3 import RunStepStreamEventOneOf3
from openapi_server.models.run_step_stream_event_one_of4 import RunStepStreamEventOneOf4
from openapi_server.models.run_step_stream_event_one_of5 import RunStepStreamEventOneOf5
from openapi_server.models.run_step_stream_event_one_of6 import RunStepStreamEventOneOf6
from openapi_server.models.run_stream_event import RunStreamEvent
from openapi_server.models.run_stream_event_one_of import RunStreamEventOneOf
from openapi_server.models.run_stream_event_one_of1 import RunStreamEventOneOf1
from openapi_server.models.run_stream_event_one_of2 import RunStreamEventOneOf2
from openapi_server.models.run_stream_event_one_of3 import RunStreamEventOneOf3
from openapi_server.models.run_stream_event_one_of4 import RunStreamEventOneOf4
from openapi_server.models.run_stream_event_one_of5 import RunStreamEventOneOf5
from openapi_server.models.run_stream_event_one_of6 import RunStreamEventOneOf6
from openapi_server.models.run_stream_event_one_of7 import RunStreamEventOneOf7
from openapi_server.models.run_stream_event_one_of8 import RunStreamEventOneOf8
from openapi_server.models.run_tool_call_object import RunToolCallObject
from openapi_server.models.run_tool_call_object_function import RunToolCallObjectFunction
from openapi_server.models.submit_tool_outputs_run_request import SubmitToolOutputsRunRequest
from openapi_server.models.submit_tool_outputs_run_request_tool_outputs_inner import SubmitToolOutputsRunRequestToolOutputsInner
from openapi_server.models.thread_object import ThreadObject
from openapi_server.models.thread_stream_event import ThreadStreamEvent
from openapi_server.models.thread_stream_event_one_of import ThreadStreamEventOneOf
from openapi_server.models.transcription_segment import TranscriptionSegment
from openapi_server.models.transcription_word import TranscriptionWord
from openapi_server.models.truncation_object import TruncationObject
