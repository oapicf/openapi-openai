cmake_minimum_required (VERSION 2.6...3.10.2)
project (CGenerator C)

cmake_policy(SET CMP0063 NEW)

set(CMAKE_C_VISIBILITY_PRESET default)
set(CMAKE_VISIBILITY_INLINES_HIDDEN OFF)
set(CMAKE_WINDOWS_EXPORT_ALL_SYMBOLS ON)
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Werror=implicit-function-declaration")
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Werror=missing-declarations")
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Werror=int-conversion")

option(BUILD_SHARED_LIBS "Build using shared libraries" ON)

find_package(OpenSSL)

if (OPENSSL_FOUND)
    set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -DOPENSSL")
    if(CMAKE_VERSION VERSION_LESS 3.4)
        include_directories(${OPENSSL_INCLUDE_DIR})
        include_directories(${OPENSSL_INCLUDE_DIRS})
        link_directories(${OPENSSL_LIBRARIES})
    endif()
endif()

set(pkgName "openai_api")

# this default version can be overridden in PreTarget.cmake
set(PROJECT_VERSION_MAJOR 0)
set(PROJECT_VERSION_MINOR 0)
set(PROJECT_VERSION_PATCH 1)

if( (DEFINED CURL_INCLUDE_DIR) AND (DEFINED CURL_LIBRARIES))
    include_directories(${CURL_INCLUDE_DIR})
    set(PLATFORM_LIBRARIES ${PLATFORM_LIBRARIES} ${CURL_LIBRARIES} )
else()
    find_package(CURL 7.58.0 REQUIRED)
    if(CURL_FOUND)
        include_directories(${CURL_INCLUDE_DIR})
        set(PLATFORM_LIBRARIES ${PLATFORM_LIBRARIES} ${CURL_LIBRARIES} )
    endif()
endif()

set(SRCS
    src/list.c
    src/apiKey.c
    src/apiClient.c
    src/binary.c
    external/cJSON.c
    model/object.c
    model/assistant_file_object.c
    model/assistant_object.c
    model/assistant_object_tools_inner.c
    model/assistant_stream_event.c
    model/assistant_tools_code.c
    model/assistant_tools_function.c
    model/assistant_tools_retrieval.c
    model/assistants_api_named_tool_choice.c
    model/assistants_api_response_format.c
    model/assistants_api_response_format_option.c
    model/assistants_api_tool_choice_option.c
    model/chat_completion_function_call_option.c
    model/chat_completion_functions.c
    model/chat_completion_message_tool_call.c
    model/chat_completion_message_tool_call_chunk.c
    model/chat_completion_message_tool_call_chunk_function.c
    model/chat_completion_message_tool_call_function.c
    model/chat_completion_named_tool_choice.c
    model/chat_completion_named_tool_choice_function.c
    model/chat_completion_request_assistant_message.c
    model/chat_completion_request_assistant_message_function_call.c
    model/chat_completion_request_function_message.c
    model/chat_completion_request_message.c
    model/chat_completion_request_message_content_part.c
    model/chat_completion_request_message_content_part_image.c
    model/chat_completion_request_message_content_part_image_image_url.c
    model/chat_completion_request_message_content_part_text.c
    model/chat_completion_request_system_message.c
    model/chat_completion_request_tool_message.c
    model/chat_completion_request_user_message.c
    model/chat_completion_request_user_message_content.c
    model/chat_completion_response_message.c
    model/chat_completion_role.c
    model/chat_completion_stream_response_delta.c
    model/chat_completion_stream_response_delta_function_call.c
    model/chat_completion_token_logprob.c
    model/chat_completion_token_logprob_top_logprobs_inner.c
    model/chat_completion_tool.c
    model/chat_completion_tool_choice_option.c
    model/completion_usage.c
    model/create_assistant_file_request.c
    model/create_assistant_request.c
    model/create_assistant_request_model.c
    model/create_chat_completion_function_response.c
    model/create_chat_completion_function_response_choices_inner.c
    model/create_chat_completion_request.c
    model/create_chat_completion_request_function_call.c
    model/create_chat_completion_request_model.c
    model/create_chat_completion_request_response_format.c
    model/create_chat_completion_request_stop.c
    model/create_chat_completion_response.c
    model/create_chat_completion_response_choices_inner.c
    model/create_chat_completion_response_choices_inner_logprobs.c
    model/create_chat_completion_stream_response.c
    model/create_chat_completion_stream_response_choices_inner.c
    model/create_completion_request.c
    model/create_completion_request_model.c
    model/create_completion_request_prompt.c
    model/create_completion_request_stop.c
    model/create_completion_response.c
    model/create_completion_response_choices_inner.c
    model/create_completion_response_choices_inner_logprobs.c
    model/create_embedding_request.c
    model/create_embedding_request_input.c
    model/create_embedding_request_model.c
    model/create_embedding_response.c
    model/create_embedding_response_usage.c
    model/create_fine_tuning_job_request.c
    model/create_fine_tuning_job_request_hyperparameters.c
    model/create_fine_tuning_job_request_hyperparameters_batch_size.c
    model/create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier.c
    model/create_fine_tuning_job_request_hyperparameters_n_epochs.c
    model/create_fine_tuning_job_request_integrations_inner.c
    model/create_fine_tuning_job_request_integrations_inner_wandb.c
    model/create_fine_tuning_job_request_model.c
    model/create_image_edit_request_model.c
    model/create_image_request.c
    model/create_image_request_model.c
    model/create_message_request.c
    model/create_moderation_request.c
    model/create_moderation_request_input.c
    model/create_moderation_request_model.c
    model/create_moderation_response.c
    model/create_moderation_response_results_inner.c
    model/create_moderation_response_results_inner_categories.c
    model/create_moderation_response_results_inner_category_scores.c
    model/create_run_request.c
    model/create_run_request_model.c
    model/create_speech_request.c
    model/create_speech_request_model.c
    model/create_thread_and_run_request.c
    model/create_thread_and_run_request_tools_inner.c
    model/create_thread_request.c
    model/create_transcription_200_response.c
    model/create_transcription_request_model.c
    model/create_transcription_response_json.c
    model/create_transcription_response_verbose_json.c
    model/create_translation_200_response.c
    model/create_translation_response_json.c
    model/create_translation_response_verbose_json.c
    model/delete_assistant_file_response.c
    model/delete_assistant_response.c
    model/delete_file_response.c
    model/delete_message_response.c
    model/delete_model_response.c
    model/delete_thread_response.c
    model/done_event.c
    model/embedding.c
    model/error.c
    model/error_event.c
    model/error_response.c
    model/fine_tuning_integration.c
    model/fine_tuning_job.c
    model/fine_tuning_job_checkpoint.c
    model/fine_tuning_job_checkpoint_metrics.c
    model/fine_tuning_job_error.c
    model/fine_tuning_job_event.c
    model/fine_tuning_job_hyperparameters.c
    model/fine_tuning_job_hyperparameters_n_epochs.c
    model/fine_tuning_job_integrations_inner.c
    model/function_object.c
    model/image.c
    model/images_response.c
    model/list_assistant_files_response.c
    model/list_assistants_response.c
    model/list_files_response.c
    model/list_fine_tuning_job_checkpoints_response.c
    model/list_fine_tuning_job_events_response.c
    model/list_message_files_response.c
    model/list_messages_response.c
    model/list_models_response.c
    model/list_paginated_fine_tuning_jobs_response.c
    model/list_run_steps_response.c
    model/list_runs_response.c
    model/list_threads_response.c
    model/message_content_image_file_object.c
    model/message_content_image_file_object_image_file.c
    model/message_content_text_annotations_file_citation_object.c
    model/message_content_text_annotations_file_citation_object_file_citation.c
    model/message_content_text_annotations_file_path_object.c
    model/message_content_text_annotations_file_path_object_file_path.c
    model/message_content_text_object.c
    model/message_content_text_object_text.c
    model/message_content_text_object_text_annotations_inner.c
    model/message_delta_content_image_file_object.c
    model/message_delta_content_image_file_object_image_file.c
    model/message_delta_content_text_annotations_file_citation_object.c
    model/message_delta_content_text_annotations_file_citation_object_file_citation.c
    model/message_delta_content_text_annotations_file_path_object.c
    model/message_delta_content_text_annotations_file_path_object_file_path.c
    model/message_delta_content_text_object.c
    model/message_delta_content_text_object_text.c
    model/message_delta_content_text_object_text_annotations_inner.c
    model/message_delta_object.c
    model/message_delta_object_delta.c
    model/message_delta_object_delta_content_inner.c
    model/message_file_object.c
    model/message_object.c
    model/message_object_content_inner.c
    model/message_object_incomplete_details.c
    model/message_stream_event.c
    model/message_stream_event_one_of.c
    model/message_stream_event_one_of_1.c
    model/message_stream_event_one_of_2.c
    model/message_stream_event_one_of_3.c
    model/message_stream_event_one_of_4.c
    model/model.c
    model/modify_assistant_request.c
    model/modify_message_request.c
    model/modify_run_request.c
    model/modify_thread_request.c
    model/open_ai_file.c
    model/run_completion_usage.c
    model/run_object.c
    model/run_object_incomplete_details.c
    model/run_object_last_error.c
    model/run_object_required_action.c
    model/run_object_required_action_submit_tool_outputs.c
    model/run_step_completion_usage.c
    model/run_step_delta_object.c
    model/run_step_delta_object_delta.c
    model/run_step_delta_object_delta_step_details.c
    model/run_step_delta_step_details_message_creation_object.c
    model/run_step_delta_step_details_message_creation_object_message_creation.c
    model/run_step_delta_step_details_tool_calls_code_object.c
    model/run_step_delta_step_details_tool_calls_code_object_code_interpreter.c
    model/run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner.c
    model/run_step_delta_step_details_tool_calls_code_output_image_object.c
    model/run_step_delta_step_details_tool_calls_code_output_image_object_image.c
    model/run_step_delta_step_details_tool_calls_code_output_logs_object.c
    model/run_step_delta_step_details_tool_calls_function_object.c
    model/run_step_delta_step_details_tool_calls_function_object_function.c
    model/run_step_delta_step_details_tool_calls_object.c
    model/run_step_delta_step_details_tool_calls_object_tool_calls_inner.c
    model/run_step_delta_step_details_tool_calls_retrieval_object.c
    model/run_step_details_message_creation_object.c
    model/run_step_details_message_creation_object_message_creation.c
    model/run_step_details_tool_calls_code_object.c
    model/run_step_details_tool_calls_code_object_code_interpreter.c
    model/run_step_details_tool_calls_code_object_code_interpreter_outputs_inner.c
    model/run_step_details_tool_calls_code_output_image_object.c
    model/run_step_details_tool_calls_code_output_image_object_image.c
    model/run_step_details_tool_calls_code_output_logs_object.c
    model/run_step_details_tool_calls_function_object.c
    model/run_step_details_tool_calls_function_object_function.c
    model/run_step_details_tool_calls_object.c
    model/run_step_details_tool_calls_object_tool_calls_inner.c
    model/run_step_details_tool_calls_retrieval_object.c
    model/run_step_object.c
    model/run_step_object_last_error.c
    model/run_step_object_step_details.c
    model/run_step_stream_event.c
    model/run_step_stream_event_one_of.c
    model/run_step_stream_event_one_of_1.c
    model/run_step_stream_event_one_of_2.c
    model/run_step_stream_event_one_of_3.c
    model/run_step_stream_event_one_of_4.c
    model/run_step_stream_event_one_of_5.c
    model/run_step_stream_event_one_of_6.c
    model/run_stream_event.c
    model/run_stream_event_one_of.c
    model/run_stream_event_one_of_1.c
    model/run_stream_event_one_of_2.c
    model/run_stream_event_one_of_3.c
    model/run_stream_event_one_of_4.c
    model/run_stream_event_one_of_5.c
    model/run_stream_event_one_of_6.c
    model/run_stream_event_one_of_7.c
    model/run_stream_event_one_of_8.c
    model/run_tool_call_object.c
    model/run_tool_call_object_function.c
    model/submit_tool_outputs_run_request.c
    model/submit_tool_outputs_run_request_tool_outputs_inner.c
    model/thread_object.c
    model/thread_stream_event.c
    model/transcription_segment.c
    model/transcription_word.c
    model/truncation_object.c
    api/AssistantsAPI.c
    api/AudioAPI.c
    api/ChatAPI.c
    api/CompletionsAPI.c
    api/EmbeddingsAPI.c
    api/FilesAPI.c
    api/FineTuningAPI.c
    api/ImagesAPI.c
    api/ModelsAPI.c
    api/ModerationsAPI.c

)

set(HDRS
    include/apiClient.h
    include/list.h
    include/binary.h
    include/keyValuePair.h
    external/cJSON.h
    model/object.h
    model/any_type.h
    model/assistant_file_object.h
    model/assistant_object.h
    model/assistant_object_tools_inner.h
    model/assistant_stream_event.h
    model/assistant_tools_code.h
    model/assistant_tools_function.h
    model/assistant_tools_retrieval.h
    model/assistants_api_named_tool_choice.h
    model/assistants_api_response_format.h
    model/assistants_api_response_format_option.h
    model/assistants_api_tool_choice_option.h
    model/chat_completion_function_call_option.h
    model/chat_completion_functions.h
    model/chat_completion_message_tool_call.h
    model/chat_completion_message_tool_call_chunk.h
    model/chat_completion_message_tool_call_chunk_function.h
    model/chat_completion_message_tool_call_function.h
    model/chat_completion_named_tool_choice.h
    model/chat_completion_named_tool_choice_function.h
    model/chat_completion_request_assistant_message.h
    model/chat_completion_request_assistant_message_function_call.h
    model/chat_completion_request_function_message.h
    model/chat_completion_request_message.h
    model/chat_completion_request_message_content_part.h
    model/chat_completion_request_message_content_part_image.h
    model/chat_completion_request_message_content_part_image_image_url.h
    model/chat_completion_request_message_content_part_text.h
    model/chat_completion_request_system_message.h
    model/chat_completion_request_tool_message.h
    model/chat_completion_request_user_message.h
    model/chat_completion_request_user_message_content.h
    model/chat_completion_response_message.h
    model/chat_completion_role.h
    model/chat_completion_stream_response_delta.h
    model/chat_completion_stream_response_delta_function_call.h
    model/chat_completion_token_logprob.h
    model/chat_completion_token_logprob_top_logprobs_inner.h
    model/chat_completion_tool.h
    model/chat_completion_tool_choice_option.h
    model/completion_usage.h
    model/create_assistant_file_request.h
    model/create_assistant_request.h
    model/create_assistant_request_model.h
    model/create_chat_completion_function_response.h
    model/create_chat_completion_function_response_choices_inner.h
    model/create_chat_completion_request.h
    model/create_chat_completion_request_function_call.h
    model/create_chat_completion_request_model.h
    model/create_chat_completion_request_response_format.h
    model/create_chat_completion_request_stop.h
    model/create_chat_completion_response.h
    model/create_chat_completion_response_choices_inner.h
    model/create_chat_completion_response_choices_inner_logprobs.h
    model/create_chat_completion_stream_response.h
    model/create_chat_completion_stream_response_choices_inner.h
    model/create_completion_request.h
    model/create_completion_request_model.h
    model/create_completion_request_prompt.h
    model/create_completion_request_stop.h
    model/create_completion_response.h
    model/create_completion_response_choices_inner.h
    model/create_completion_response_choices_inner_logprobs.h
    model/create_embedding_request.h
    model/create_embedding_request_input.h
    model/create_embedding_request_model.h
    model/create_embedding_response.h
    model/create_embedding_response_usage.h
    model/create_fine_tuning_job_request.h
    model/create_fine_tuning_job_request_hyperparameters.h
    model/create_fine_tuning_job_request_hyperparameters_batch_size.h
    model/create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier.h
    model/create_fine_tuning_job_request_hyperparameters_n_epochs.h
    model/create_fine_tuning_job_request_integrations_inner.h
    model/create_fine_tuning_job_request_integrations_inner_wandb.h
    model/create_fine_tuning_job_request_model.h
    model/create_image_edit_request_model.h
    model/create_image_request.h
    model/create_image_request_model.h
    model/create_message_request.h
    model/create_moderation_request.h
    model/create_moderation_request_input.h
    model/create_moderation_request_model.h
    model/create_moderation_response.h
    model/create_moderation_response_results_inner.h
    model/create_moderation_response_results_inner_categories.h
    model/create_moderation_response_results_inner_category_scores.h
    model/create_run_request.h
    model/create_run_request_model.h
    model/create_speech_request.h
    model/create_speech_request_model.h
    model/create_thread_and_run_request.h
    model/create_thread_and_run_request_tools_inner.h
    model/create_thread_request.h
    model/create_transcription_200_response.h
    model/create_transcription_request_model.h
    model/create_transcription_response_json.h
    model/create_transcription_response_verbose_json.h
    model/create_translation_200_response.h
    model/create_translation_response_json.h
    model/create_translation_response_verbose_json.h
    model/delete_assistant_file_response.h
    model/delete_assistant_response.h
    model/delete_file_response.h
    model/delete_message_response.h
    model/delete_model_response.h
    model/delete_thread_response.h
    model/done_event.h
    model/embedding.h
    model/error.h
    model/error_event.h
    model/error_response.h
    model/fine_tuning_integration.h
    model/fine_tuning_job.h
    model/fine_tuning_job_checkpoint.h
    model/fine_tuning_job_checkpoint_metrics.h
    model/fine_tuning_job_error.h
    model/fine_tuning_job_event.h
    model/fine_tuning_job_hyperparameters.h
    model/fine_tuning_job_hyperparameters_n_epochs.h
    model/fine_tuning_job_integrations_inner.h
    model/function_object.h
    model/image.h
    model/images_response.h
    model/list_assistant_files_response.h
    model/list_assistants_response.h
    model/list_files_response.h
    model/list_fine_tuning_job_checkpoints_response.h
    model/list_fine_tuning_job_events_response.h
    model/list_message_files_response.h
    model/list_messages_response.h
    model/list_models_response.h
    model/list_paginated_fine_tuning_jobs_response.h
    model/list_run_steps_response.h
    model/list_runs_response.h
    model/list_threads_response.h
    model/message_content_image_file_object.h
    model/message_content_image_file_object_image_file.h
    model/message_content_text_annotations_file_citation_object.h
    model/message_content_text_annotations_file_citation_object_file_citation.h
    model/message_content_text_annotations_file_path_object.h
    model/message_content_text_annotations_file_path_object_file_path.h
    model/message_content_text_object.h
    model/message_content_text_object_text.h
    model/message_content_text_object_text_annotations_inner.h
    model/message_delta_content_image_file_object.h
    model/message_delta_content_image_file_object_image_file.h
    model/message_delta_content_text_annotations_file_citation_object.h
    model/message_delta_content_text_annotations_file_citation_object_file_citation.h
    model/message_delta_content_text_annotations_file_path_object.h
    model/message_delta_content_text_annotations_file_path_object_file_path.h
    model/message_delta_content_text_object.h
    model/message_delta_content_text_object_text.h
    model/message_delta_content_text_object_text_annotations_inner.h
    model/message_delta_object.h
    model/message_delta_object_delta.h
    model/message_delta_object_delta_content_inner.h
    model/message_file_object.h
    model/message_object.h
    model/message_object_content_inner.h
    model/message_object_incomplete_details.h
    model/message_stream_event.h
    model/message_stream_event_one_of.h
    model/message_stream_event_one_of_1.h
    model/message_stream_event_one_of_2.h
    model/message_stream_event_one_of_3.h
    model/message_stream_event_one_of_4.h
    model/model.h
    model/modify_assistant_request.h
    model/modify_message_request.h
    model/modify_run_request.h
    model/modify_thread_request.h
    model/open_ai_file.h
    model/run_completion_usage.h
    model/run_object.h
    model/run_object_incomplete_details.h
    model/run_object_last_error.h
    model/run_object_required_action.h
    model/run_object_required_action_submit_tool_outputs.h
    model/run_step_completion_usage.h
    model/run_step_delta_object.h
    model/run_step_delta_object_delta.h
    model/run_step_delta_object_delta_step_details.h
    model/run_step_delta_step_details_message_creation_object.h
    model/run_step_delta_step_details_message_creation_object_message_creation.h
    model/run_step_delta_step_details_tool_calls_code_object.h
    model/run_step_delta_step_details_tool_calls_code_object_code_interpreter.h
    model/run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner.h
    model/run_step_delta_step_details_tool_calls_code_output_image_object.h
    model/run_step_delta_step_details_tool_calls_code_output_image_object_image.h
    model/run_step_delta_step_details_tool_calls_code_output_logs_object.h
    model/run_step_delta_step_details_tool_calls_function_object.h
    model/run_step_delta_step_details_tool_calls_function_object_function.h
    model/run_step_delta_step_details_tool_calls_object.h
    model/run_step_delta_step_details_tool_calls_object_tool_calls_inner.h
    model/run_step_delta_step_details_tool_calls_retrieval_object.h
    model/run_step_details_message_creation_object.h
    model/run_step_details_message_creation_object_message_creation.h
    model/run_step_details_tool_calls_code_object.h
    model/run_step_details_tool_calls_code_object_code_interpreter.h
    model/run_step_details_tool_calls_code_object_code_interpreter_outputs_inner.h
    model/run_step_details_tool_calls_code_output_image_object.h
    model/run_step_details_tool_calls_code_output_image_object_image.h
    model/run_step_details_tool_calls_code_output_logs_object.h
    model/run_step_details_tool_calls_function_object.h
    model/run_step_details_tool_calls_function_object_function.h
    model/run_step_details_tool_calls_object.h
    model/run_step_details_tool_calls_object_tool_calls_inner.h
    model/run_step_details_tool_calls_retrieval_object.h
    model/run_step_object.h
    model/run_step_object_last_error.h
    model/run_step_object_step_details.h
    model/run_step_stream_event.h
    model/run_step_stream_event_one_of.h
    model/run_step_stream_event_one_of_1.h
    model/run_step_stream_event_one_of_2.h
    model/run_step_stream_event_one_of_3.h
    model/run_step_stream_event_one_of_4.h
    model/run_step_stream_event_one_of_5.h
    model/run_step_stream_event_one_of_6.h
    model/run_stream_event.h
    model/run_stream_event_one_of.h
    model/run_stream_event_one_of_1.h
    model/run_stream_event_one_of_2.h
    model/run_stream_event_one_of_3.h
    model/run_stream_event_one_of_4.h
    model/run_stream_event_one_of_5.h
    model/run_stream_event_one_of_6.h
    model/run_stream_event_one_of_7.h
    model/run_stream_event_one_of_8.h
    model/run_tool_call_object.h
    model/run_tool_call_object_function.h
    model/submit_tool_outputs_run_request.h
    model/submit_tool_outputs_run_request_tool_outputs_inner.h
    model/thread_object.h
    model/thread_stream_event.h
    model/transcription_segment.h
    model/transcription_word.h
    model/truncation_object.h
    api/AssistantsAPI.h
    api/AudioAPI.h
    api/ChatAPI.h
    api/CompletionsAPI.h
    api/EmbeddingsAPI.h
    api/FilesAPI.h
    api/FineTuningAPI.h
    api/ImagesAPI.h
    api/ModelsAPI.h
    api/ModerationsAPI.h

)

include(PreTarget.cmake OPTIONAL)

set(PROJECT_VERSION_STRING "${PROJECT_VERSION_MAJOR}.${PROJECT_VERSION_MINOR}.${PROJECT_VERSION_PATCH}")

# Add library with project file with project name as library name
if(NOT BUILD_STATIC_LIBS)
  add_library(${pkgName} ${SRCS} ${HDRS})
else()
  add_library(${pkgName} STATIC ${SRCS} ${HDRS})
endif()
# Link dependent libraries
if(NOT CMAKE_VERSION VERSION_LESS 3.4)
    target_link_libraries(${pkgName} PRIVATE OpenSSL::SSL OpenSSL::Crypto)
endif()
target_link_libraries(${pkgName} PUBLIC ${CURL_LIBRARIES} )
target_include_directories(
    ${pkgName} PUBLIC $<BUILD_INTERFACE:${PROJECT_SOURCE_DIR}>
    $<INSTALL_INTERFACE:include>
)

include(PostTarget.cmake OPTIONAL)

# installation of libraries, headers, and config files
if (NOT EXISTS ${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in)
    install(TARGETS ${pkgName} DESTINATION lib)
else()
    include(GNUInstallDirs)
    install(TARGETS ${pkgName} DESTINATION lib EXPORT ${pkgName}Targets)

    foreach(HDR_FILE ${HDRS})
        get_filename_component(HDR_DIRECTORY ${HDR_FILE} DIRECTORY)
        get_filename_component(ABSOLUTE_HDR_DIRECTORY ${HDR_DIRECTORY} ABSOLUTE)
        file(RELATIVE_PATH RELATIVE_HDR_PATH ${CMAKE_CURRENT_SOURCE_DIR} ${ABSOLUTE_HDR_DIRECTORY})
        install(FILES ${HDR_FILE} DESTINATION include/${pkgName}/${RELATIVE_HDR_PATH})
    endforeach()

    include(CMakePackageConfigHelpers)
    write_basic_package_version_file(
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}ConfigVersion.cmake"
            VERSION "${PROJECT_VERSION_STRING}"
            COMPATIBILITY AnyNewerVersion
    )

    export(EXPORT ${pkgName}Targets
            FILE "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Targets.cmake"
            NAMESPACE ${pkgName}::
            )

    configure_file(${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Config.cmake"
            @ONLY
            )

    set(ConfigPackageLocation lib/cmake/${pkgName})
    install(EXPORT ${pkgName}Targets
            FILE
            ${pkgName}Targets.cmake
            NAMESPACE
            ${pkgName}::
            DESTINATION
            ${ConfigPackageLocation}
            )
    install(
            FILES
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Config.cmake"
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}ConfigVersion.cmake"
            DESTINATION
            ${ConfigPackageLocation}
    )
endif()

# make installation packages
include(Packing.cmake OPTIONAL)

# Setting file variables to null
set(SRCS "")
set(HDRS "")


## This section shows how to use the above compiled library to compile the source files
## set source files
#set(SRCS
#    unit-tests/manual-AssistantsAPI.c
#    unit-tests/manual-AudioAPI.c
#    unit-tests/manual-ChatAPI.c
#    unit-tests/manual-CompletionsAPI.c
#    unit-tests/manual-EmbeddingsAPI.c
#    unit-tests/manual-FilesAPI.c
#    unit-tests/manual-FineTuningAPI.c
#    unit-tests/manual-ImagesAPI.c
#    unit-tests/manual-ModelsAPI.c
#    unit-tests/manual-ModerationsAPI.c
#)

##set header files
#set(HDRS
#)

## loop over all files in SRCS variable
#foreach(SOURCE_FILE ${SRCS})
#    # Get only the file name from the file as add_executable does not support executable with slash("/")
#    get_filename_component(FILE_NAME_ONLY ${SOURCE_FILE} NAME_WE)
#    # Remove .c from the file name and set it as executable name
#    string( REPLACE ".c" "" EXECUTABLE_FILE ${FILE_NAME_ONLY})
#    # Add executable for every source file in  SRCS
#    add_executable(unit-${EXECUTABLE_FILE} ${SOURCE_FILE})
#    # Link above created library to executable and dependent library curl
#    target_link_libraries(unit-${EXECUTABLE_FILE} ${CURL_LIBRARIES} ${pkgName} )
#endforeach(SOURCE_FILE ${SRCS})
