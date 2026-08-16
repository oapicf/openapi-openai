//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_import

import 'package:one_of_serializer/any_of_serializer.dart';
import 'package:one_of_serializer/one_of_serializer.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:built_value/standard_json_plugin.dart';
import 'package:built_value/iso_8601_date_time_serializer.dart';
import 'package:openapi/src/date_serializer.dart';
import 'package:openapi/src/model/date.dart';

import 'package:openapi/src/model/admin_api_key.dart';
import 'package:openapi/src/model/admin_api_key_owner.dart';
import 'package:openapi/src/model/admin_api_keys_create_request.dart';
import 'package:openapi/src/model/admin_api_keys_delete200_response.dart';
import 'package:openapi/src/model/api_key_list.dart';
import 'package:openapi/src/model/array_of_content_parts_inner.dart';
import 'package:openapi/src/model/assistant_object.dart';
import 'package:openapi/src/model/assistant_object_tool_resources.dart';
import 'package:openapi/src/model/assistant_object_tool_resources_code_interpreter.dart';
import 'package:openapi/src/model/assistant_object_tool_resources_file_search.dart';
import 'package:openapi/src/model/assistant_object_tools_inner.dart';
import 'package:openapi/src/model/assistant_stream_event.dart';
import 'package:openapi/src/model/assistant_tools_code.dart';
import 'package:openapi/src/model/assistant_tools_file_search.dart';
import 'package:openapi/src/model/assistant_tools_file_search_file_search.dart';
import 'package:openapi/src/model/assistant_tools_file_search_type_only.dart';
import 'package:openapi/src/model/assistant_tools_function.dart';
import 'package:openapi/src/model/assistants_api_response_format_option.dart';
import 'package:openapi/src/model/assistants_api_tool_choice_option.dart';
import 'package:openapi/src/model/assistants_named_tool_choice.dart';
import 'package:openapi/src/model/assistants_named_tool_choice_function.dart';
import 'package:openapi/src/model/audio_response_format.dart';
import 'package:openapi/src/model/audit_log.dart';
import 'package:openapi/src/model/audit_log_actor.dart';
import 'package:openapi/src/model/audit_log_actor_api_key.dart';
import 'package:openapi/src/model/audit_log_actor_service_account.dart';
import 'package:openapi/src/model/audit_log_actor_session.dart';
import 'package:openapi/src/model/audit_log_actor_user.dart';
import 'package:openapi/src/model/audit_log_api_key_created.dart';
import 'package:openapi/src/model/audit_log_api_key_created_data.dart';
import 'package:openapi/src/model/audit_log_api_key_deleted.dart';
import 'package:openapi/src/model/audit_log_api_key_updated.dart';
import 'package:openapi/src/model/audit_log_api_key_updated_changes_requested.dart';
import 'package:openapi/src/model/audit_log_event_type.dart';
import 'package:openapi/src/model/audit_log_invite_accepted.dart';
import 'package:openapi/src/model/audit_log_invite_sent.dart';
import 'package:openapi/src/model/audit_log_invite_sent_data.dart';
import 'package:openapi/src/model/audit_log_login_failed.dart';
import 'package:openapi/src/model/audit_log_organization_updated.dart';
import 'package:openapi/src/model/audit_log_organization_updated_changes_requested.dart';
import 'package:openapi/src/model/audit_log_organization_updated_changes_requested_settings.dart';
import 'package:openapi/src/model/audit_log_project.dart';
import 'package:openapi/src/model/audit_log_project_archived.dart';
import 'package:openapi/src/model/audit_log_project_created.dart';
import 'package:openapi/src/model/audit_log_project_created_data.dart';
import 'package:openapi/src/model/audit_log_project_updated.dart';
import 'package:openapi/src/model/audit_log_project_updated_changes_requested.dart';
import 'package:openapi/src/model/audit_log_rate_limit_deleted.dart';
import 'package:openapi/src/model/audit_log_rate_limit_updated.dart';
import 'package:openapi/src/model/audit_log_rate_limit_updated_changes_requested.dart';
import 'package:openapi/src/model/audit_log_service_account_created.dart';
import 'package:openapi/src/model/audit_log_service_account_created_data.dart';
import 'package:openapi/src/model/audit_log_service_account_deleted.dart';
import 'package:openapi/src/model/audit_log_service_account_updated.dart';
import 'package:openapi/src/model/audit_log_service_account_updated_changes_requested.dart';
import 'package:openapi/src/model/audit_log_user_added.dart';
import 'package:openapi/src/model/audit_log_user_added_data.dart';
import 'package:openapi/src/model/audit_log_user_deleted.dart';
import 'package:openapi/src/model/audit_log_user_updated.dart';
import 'package:openapi/src/model/audit_log_user_updated_changes_requested.dart';
import 'package:openapi/src/model/auto_chunking_strategy.dart';
import 'package:openapi/src/model/auto_chunking_strategy_request_param.dart';
import 'package:openapi/src/model/batch.dart';
import 'package:openapi/src/model/batch_errors.dart';
import 'package:openapi/src/model/batch_errors_data_inner.dart';
import 'package:openapi/src/model/batch_request_counts.dart';
import 'package:openapi/src/model/batch_request_input.dart';
import 'package:openapi/src/model/batch_request_output.dart';
import 'package:openapi/src/model/batch_request_output_error.dart';
import 'package:openapi/src/model/batch_request_output_response.dart';
import 'package:openapi/src/model/chat_completion_function_call_option.dart';
import 'package:openapi/src/model/chat_completion_functions.dart';
import 'package:openapi/src/model/chat_completion_message_tool_call.dart';
import 'package:openapi/src/model/chat_completion_message_tool_call_chunk.dart';
import 'package:openapi/src/model/chat_completion_message_tool_call_chunk_function.dart';
import 'package:openapi/src/model/chat_completion_message_tool_call_function.dart';
import 'package:openapi/src/model/chat_completion_named_tool_choice.dart';
import 'package:openapi/src/model/chat_completion_request_assistant_message.dart';
import 'package:openapi/src/model/chat_completion_request_assistant_message_audio.dart';
import 'package:openapi/src/model/chat_completion_request_assistant_message_content.dart';
import 'package:openapi/src/model/chat_completion_request_assistant_message_content_part.dart';
import 'package:openapi/src/model/chat_completion_request_assistant_message_function_call.dart';
import 'package:openapi/src/model/chat_completion_request_developer_message.dart';
import 'package:openapi/src/model/chat_completion_request_developer_message_content.dart';
import 'package:openapi/src/model/chat_completion_request_function_message.dart';
import 'package:openapi/src/model/chat_completion_request_message.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_audio.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_audio_input_audio.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_image.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_image_image_url.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_refusal.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_text.dart';
import 'package:openapi/src/model/chat_completion_request_system_message.dart';
import 'package:openapi/src/model/chat_completion_request_system_message_content.dart';
import 'package:openapi/src/model/chat_completion_request_tool_message.dart';
import 'package:openapi/src/model/chat_completion_request_tool_message_content.dart';
import 'package:openapi/src/model/chat_completion_request_user_message.dart';
import 'package:openapi/src/model/chat_completion_request_user_message_content.dart';
import 'package:openapi/src/model/chat_completion_request_user_message_content_part.dart';
import 'package:openapi/src/model/chat_completion_response_message.dart';
import 'package:openapi/src/model/chat_completion_response_message_audio.dart';
import 'package:openapi/src/model/chat_completion_response_message_function_call.dart';
import 'package:openapi/src/model/chat_completion_role.dart';
import 'package:openapi/src/model/chat_completion_stream_options.dart';
import 'package:openapi/src/model/chat_completion_stream_response_delta.dart';
import 'package:openapi/src/model/chat_completion_stream_response_delta_function_call.dart';
import 'package:openapi/src/model/chat_completion_token_logprob.dart';
import 'package:openapi/src/model/chat_completion_token_logprob_top_logprobs_inner.dart';
import 'package:openapi/src/model/chat_completion_tool.dart';
import 'package:openapi/src/model/chat_completion_tool_choice_option.dart';
import 'package:openapi/src/model/chunking_strategy_request_param.dart';
import 'package:openapi/src/model/complete_upload_request.dart';
import 'package:openapi/src/model/completion_usage.dart';
import 'package:openapi/src/model/completion_usage_completion_tokens_details.dart';
import 'package:openapi/src/model/completion_usage_prompt_tokens_details.dart';
import 'package:openapi/src/model/costs_result.dart';
import 'package:openapi/src/model/costs_result_amount.dart';
import 'package:openapi/src/model/create_assistant_request.dart';
import 'package:openapi/src/model/create_assistant_request_model.dart';
import 'package:openapi/src/model/create_assistant_request_tool_resources.dart';
import 'package:openapi/src/model/create_assistant_request_tool_resources_code_interpreter.dart';
import 'package:openapi/src/model/create_assistant_request_tool_resources_file_search.dart';
import 'package:openapi/src/model/create_assistant_request_tool_resources_file_search_vector_stores_inner.dart';
import 'package:openapi/src/model/create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy.dart';
import 'package:openapi/src/model/create_batch_request.dart';
import 'package:openapi/src/model/create_chat_completion_function_response.dart';
import 'package:openapi/src/model/create_chat_completion_function_response_choices_inner.dart';
import 'package:openapi/src/model/create_chat_completion_request.dart';
import 'package:openapi/src/model/create_chat_completion_request_audio.dart';
import 'package:openapi/src/model/create_chat_completion_request_function_call.dart';
import 'package:openapi/src/model/create_chat_completion_request_model.dart';
import 'package:openapi/src/model/create_chat_completion_request_response_format.dart';
import 'package:openapi/src/model/create_chat_completion_request_stop.dart';
import 'package:openapi/src/model/create_chat_completion_response.dart';
import 'package:openapi/src/model/create_chat_completion_response_choices_inner.dart';
import 'package:openapi/src/model/create_chat_completion_response_choices_inner_logprobs.dart';
import 'package:openapi/src/model/create_chat_completion_stream_response.dart';
import 'package:openapi/src/model/create_chat_completion_stream_response_choices_inner.dart';
import 'package:openapi/src/model/create_chat_completion_stream_response_usage.dart';
import 'package:openapi/src/model/create_completion_request.dart';
import 'package:openapi/src/model/create_completion_request_model.dart';
import 'package:openapi/src/model/create_completion_request_prompt.dart';
import 'package:openapi/src/model/create_completion_request_stop.dart';
import 'package:openapi/src/model/create_completion_response.dart';
import 'package:openapi/src/model/create_completion_response_choices_inner.dart';
import 'package:openapi/src/model/create_completion_response_choices_inner_logprobs.dart';
import 'package:openapi/src/model/create_embedding_request.dart';
import 'package:openapi/src/model/create_embedding_request_input.dart';
import 'package:openapi/src/model/create_embedding_request_model.dart';
import 'package:openapi/src/model/create_embedding_response.dart';
import 'package:openapi/src/model/create_embedding_response_usage.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_hyperparameters.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_hyperparameters_batch_size.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_hyperparameters_n_epochs.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_integrations_inner.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_integrations_inner_wandb.dart';
import 'package:openapi/src/model/create_fine_tuning_job_request_model.dart';
import 'package:openapi/src/model/create_image_edit_request_model.dart';
import 'package:openapi/src/model/create_image_request.dart';
import 'package:openapi/src/model/create_image_request_model.dart';
import 'package:openapi/src/model/create_message_request.dart';
import 'package:openapi/src/model/create_message_request_attachments_inner.dart';
import 'package:openapi/src/model/create_message_request_attachments_inner_tools_inner.dart';
import 'package:openapi/src/model/create_message_request_content.dart';
import 'package:openapi/src/model/create_moderation_request.dart';
import 'package:openapi/src/model/create_moderation_request_input.dart';
import 'package:openapi/src/model/create_moderation_request_input_one_of_inner.dart';
import 'package:openapi/src/model/create_moderation_request_input_one_of_inner_one_of.dart';
import 'package:openapi/src/model/create_moderation_request_input_one_of_inner_one_of1.dart';
import 'package:openapi/src/model/create_moderation_request_input_one_of_inner_one_of_image_url.dart';
import 'package:openapi/src/model/create_moderation_request_model.dart';
import 'package:openapi/src/model/create_moderation_response.dart';
import 'package:openapi/src/model/create_moderation_response_results_inner.dart';
import 'package:openapi/src/model/create_moderation_response_results_inner_categories.dart';
import 'package:openapi/src/model/create_moderation_response_results_inner_category_applied_input_types.dart';
import 'package:openapi/src/model/create_moderation_response_results_inner_category_scores.dart';
import 'package:openapi/src/model/create_run_request.dart';
import 'package:openapi/src/model/create_run_request_model.dart';
import 'package:openapi/src/model/create_speech_request.dart';
import 'package:openapi/src/model/create_speech_request_model.dart';
import 'package:openapi/src/model/create_thread_and_run_request.dart';
import 'package:openapi/src/model/create_thread_and_run_request_tool_resources.dart';
import 'package:openapi/src/model/create_thread_and_run_request_tools_inner.dart';
import 'package:openapi/src/model/create_thread_request.dart';
import 'package:openapi/src/model/create_thread_request_tool_resources.dart';
import 'package:openapi/src/model/create_thread_request_tool_resources_file_search.dart';
import 'package:openapi/src/model/create_thread_request_tool_resources_file_search_vector_stores_inner.dart';
import 'package:openapi/src/model/create_transcription200_response.dart';
import 'package:openapi/src/model/create_transcription_request_model.dart';
import 'package:openapi/src/model/create_transcription_response_json.dart';
import 'package:openapi/src/model/create_transcription_response_verbose_json.dart';
import 'package:openapi/src/model/create_translation200_response.dart';
import 'package:openapi/src/model/create_translation_response_json.dart';
import 'package:openapi/src/model/create_translation_response_verbose_json.dart';
import 'package:openapi/src/model/create_upload_request.dart';
import 'package:openapi/src/model/create_vector_store_file_batch_request.dart';
import 'package:openapi/src/model/create_vector_store_file_request.dart';
import 'package:openapi/src/model/create_vector_store_request.dart';
import 'package:openapi/src/model/create_vector_store_request_chunking_strategy.dart';
import 'package:openapi/src/model/default_project_error_response.dart';
import 'package:openapi/src/model/delete_assistant_response.dart';
import 'package:openapi/src/model/delete_file_response.dart';
import 'package:openapi/src/model/delete_message_response.dart';
import 'package:openapi/src/model/delete_model_response.dart';
import 'package:openapi/src/model/delete_thread_response.dart';
import 'package:openapi/src/model/delete_vector_store_file_response.dart';
import 'package:openapi/src/model/delete_vector_store_response.dart';
import 'package:openapi/src/model/done_event.dart';
import 'package:openapi/src/model/embedding.dart';
import 'package:openapi/src/model/error.dart';
import 'package:openapi/src/model/error_event.dart';
import 'package:openapi/src/model/error_response.dart';
import 'package:openapi/src/model/file_search_ranking_options.dart';
import 'package:openapi/src/model/fine_tune_chat_completion_request_assistant_message.dart';
import 'package:openapi/src/model/fine_tune_chat_request_input.dart';
import 'package:openapi/src/model/fine_tune_chat_request_input_messages_inner.dart';
import 'package:openapi/src/model/fine_tune_completion_request_input.dart';
import 'package:openapi/src/model/fine_tune_dpo_method.dart';
import 'package:openapi/src/model/fine_tune_dpo_method_hyperparameters.dart';
import 'package:openapi/src/model/fine_tune_dpo_method_hyperparameters_batch_size.dart';
import 'package:openapi/src/model/fine_tune_dpo_method_hyperparameters_beta.dart';
import 'package:openapi/src/model/fine_tune_dpo_method_hyperparameters_learning_rate_multiplier.dart';
import 'package:openapi/src/model/fine_tune_dpo_method_hyperparameters_n_epochs.dart';
import 'package:openapi/src/model/fine_tune_method.dart';
import 'package:openapi/src/model/fine_tune_preference_request_input.dart';
import 'package:openapi/src/model/fine_tune_preference_request_input_input.dart';
import 'package:openapi/src/model/fine_tune_preference_request_input_preferred_completion_inner.dart';
import 'package:openapi/src/model/fine_tune_supervised_method.dart';
import 'package:openapi/src/model/fine_tune_supervised_method_hyperparameters.dart';
import 'package:openapi/src/model/fine_tuning_integration.dart';
import 'package:openapi/src/model/fine_tuning_job.dart';
import 'package:openapi/src/model/fine_tuning_job_checkpoint.dart';
import 'package:openapi/src/model/fine_tuning_job_checkpoint_metrics.dart';
import 'package:openapi/src/model/fine_tuning_job_error.dart';
import 'package:openapi/src/model/fine_tuning_job_event.dart';
import 'package:openapi/src/model/fine_tuning_job_hyperparameters.dart';
import 'package:openapi/src/model/fine_tuning_job_integrations_inner.dart';
import 'package:openapi/src/model/function_object.dart';
import 'package:openapi/src/model/image.dart';
import 'package:openapi/src/model/images_response.dart';
import 'package:openapi/src/model/invite.dart';
import 'package:openapi/src/model/invite_delete_response.dart';
import 'package:openapi/src/model/invite_list_response.dart';
import 'package:openapi/src/model/invite_projects_inner.dart';
import 'package:openapi/src/model/invite_request.dart';
import 'package:openapi/src/model/invite_request_projects_inner.dart';
import 'package:openapi/src/model/list_assistants_response.dart';
import 'package:openapi/src/model/list_audit_logs_effective_at_parameter.dart';
import 'package:openapi/src/model/list_audit_logs_response.dart';
import 'package:openapi/src/model/list_batches_response.dart';
import 'package:openapi/src/model/list_files_response.dart';
import 'package:openapi/src/model/list_fine_tuning_job_checkpoints_response.dart';
import 'package:openapi/src/model/list_fine_tuning_job_events_response.dart';
import 'package:openapi/src/model/list_messages_response.dart';
import 'package:openapi/src/model/list_models_response.dart';
import 'package:openapi/src/model/list_paginated_fine_tuning_jobs_response.dart';
import 'package:openapi/src/model/list_run_steps_response.dart';
import 'package:openapi/src/model/list_runs_response.dart';
import 'package:openapi/src/model/list_threads_response.dart';
import 'package:openapi/src/model/list_vector_store_files_response.dart';
import 'package:openapi/src/model/list_vector_stores_response.dart';
import 'package:openapi/src/model/message_content_image_file_object.dart';
import 'package:openapi/src/model/message_content_image_file_object_image_file.dart';
import 'package:openapi/src/model/message_content_image_url_object.dart';
import 'package:openapi/src/model/message_content_image_url_object_image_url.dart';
import 'package:openapi/src/model/message_content_refusal_object.dart';
import 'package:openapi/src/model/message_content_text_annotations_file_citation_object.dart';
import 'package:openapi/src/model/message_content_text_annotations_file_citation_object_file_citation.dart';
import 'package:openapi/src/model/message_content_text_annotations_file_path_object.dart';
import 'package:openapi/src/model/message_content_text_annotations_file_path_object_file_path.dart';
import 'package:openapi/src/model/message_content_text_object.dart';
import 'package:openapi/src/model/message_content_text_object_text.dart';
import 'package:openapi/src/model/message_content_text_object_text_annotations_inner.dart';
import 'package:openapi/src/model/message_delta_content_image_file_object.dart';
import 'package:openapi/src/model/message_delta_content_image_file_object_image_file.dart';
import 'package:openapi/src/model/message_delta_content_image_url_object.dart';
import 'package:openapi/src/model/message_delta_content_image_url_object_image_url.dart';
import 'package:openapi/src/model/message_delta_content_refusal_object.dart';
import 'package:openapi/src/model/message_delta_content_text_annotations_file_citation_object.dart';
import 'package:openapi/src/model/message_delta_content_text_annotations_file_citation_object_file_citation.dart';
import 'package:openapi/src/model/message_delta_content_text_annotations_file_path_object.dart';
import 'package:openapi/src/model/message_delta_content_text_annotations_file_path_object_file_path.dart';
import 'package:openapi/src/model/message_delta_content_text_object.dart';
import 'package:openapi/src/model/message_delta_content_text_object_text.dart';
import 'package:openapi/src/model/message_delta_content_text_object_text_annotations_inner.dart';
import 'package:openapi/src/model/message_delta_object.dart';
import 'package:openapi/src/model/message_delta_object_delta.dart';
import 'package:openapi/src/model/message_delta_object_delta_content_inner.dart';
import 'package:openapi/src/model/message_object.dart';
import 'package:openapi/src/model/message_object_content_inner.dart';
import 'package:openapi/src/model/message_object_incomplete_details.dart';
import 'package:openapi/src/model/message_request_content_text_object.dart';
import 'package:openapi/src/model/message_stream_event.dart';
import 'package:openapi/src/model/message_stream_event_one_of.dart';
import 'package:openapi/src/model/message_stream_event_one_of1.dart';
import 'package:openapi/src/model/message_stream_event_one_of2.dart';
import 'package:openapi/src/model/message_stream_event_one_of3.dart';
import 'package:openapi/src/model/message_stream_event_one_of4.dart';
import 'package:openapi/src/model/model.dart';
import 'package:openapi/src/model/modify_assistant_request.dart';
import 'package:openapi/src/model/modify_assistant_request_tool_resources.dart';
import 'package:openapi/src/model/modify_assistant_request_tool_resources_code_interpreter.dart';
import 'package:openapi/src/model/modify_assistant_request_tool_resources_file_search.dart';
import 'package:openapi/src/model/modify_message_request.dart';
import 'package:openapi/src/model/modify_run_request.dart';
import 'package:openapi/src/model/modify_thread_request.dart';
import 'package:openapi/src/model/modify_thread_request_tool_resources.dart';
import 'package:openapi/src/model/modify_thread_request_tool_resources_file_search.dart';
import 'package:openapi/src/model/open_ai_file.dart';
import 'package:openapi/src/model/other_chunking_strategy_response_param.dart';
import 'package:openapi/src/model/prediction_content.dart';
import 'package:openapi/src/model/prediction_content_content.dart';
import 'package:openapi/src/model/project.dart';
import 'package:openapi/src/model/project_api_key.dart';
import 'package:openapi/src/model/project_api_key_delete_response.dart';
import 'package:openapi/src/model/project_api_key_list_response.dart';
import 'package:openapi/src/model/project_api_key_owner.dart';
import 'package:openapi/src/model/project_create_request.dart';
import 'package:openapi/src/model/project_list_response.dart';
import 'package:openapi/src/model/project_rate_limit.dart';
import 'package:openapi/src/model/project_rate_limit_list_response.dart';
import 'package:openapi/src/model/project_rate_limit_update_request.dart';
import 'package:openapi/src/model/project_service_account.dart';
import 'package:openapi/src/model/project_service_account_api_key.dart';
import 'package:openapi/src/model/project_service_account_create_request.dart';
import 'package:openapi/src/model/project_service_account_create_response.dart';
import 'package:openapi/src/model/project_service_account_delete_response.dart';
import 'package:openapi/src/model/project_service_account_list_response.dart';
import 'package:openapi/src/model/project_update_request.dart';
import 'package:openapi/src/model/project_user.dart';
import 'package:openapi/src/model/project_user_create_request.dart';
import 'package:openapi/src/model/project_user_delete_response.dart';
import 'package:openapi/src/model/project_user_list_response.dart';
import 'package:openapi/src/model/project_user_update_request.dart';
import 'package:openapi/src/model/realtime_client_event_conversation_item_create.dart';
import 'package:openapi/src/model/realtime_client_event_conversation_item_delete.dart';
import 'package:openapi/src/model/realtime_client_event_conversation_item_truncate.dart';
import 'package:openapi/src/model/realtime_client_event_input_audio_buffer_append.dart';
import 'package:openapi/src/model/realtime_client_event_input_audio_buffer_clear.dart';
import 'package:openapi/src/model/realtime_client_event_input_audio_buffer_commit.dart';
import 'package:openapi/src/model/realtime_client_event_response_cancel.dart';
import 'package:openapi/src/model/realtime_client_event_response_create.dart';
import 'package:openapi/src/model/realtime_client_event_session_update.dart';
import 'package:openapi/src/model/realtime_conversation_item.dart';
import 'package:openapi/src/model/realtime_conversation_item_content_inner.dart';
import 'package:openapi/src/model/realtime_response.dart';
import 'package:openapi/src/model/realtime_response_create_params.dart';
import 'package:openapi/src/model/realtime_response_create_params_conversation.dart';
import 'package:openapi/src/model/realtime_response_create_params_max_response_output_tokens.dart';
import 'package:openapi/src/model/realtime_response_create_params_tools_inner.dart';
import 'package:openapi/src/model/realtime_response_status_details.dart';
import 'package:openapi/src/model/realtime_response_status_details_error.dart';
import 'package:openapi/src/model/realtime_response_usage.dart';
import 'package:openapi/src/model/realtime_response_usage_input_token_details.dart';
import 'package:openapi/src/model/realtime_response_usage_output_token_details.dart';
import 'package:openapi/src/model/realtime_server_event_conversation_created.dart';
import 'package:openapi/src/model/realtime_server_event_conversation_created_conversation.dart';
import 'package:openapi/src/model/realtime_server_event_conversation_item_created.dart';
import 'package:openapi/src/model/realtime_server_event_conversation_item_deleted.dart';
import 'package:openapi/src/model/realtime_server_event_conversation_item_input_audio_transcription_completed.dart';
import 'package:openapi/src/model/realtime_server_event_conversation_item_input_audio_transcription_failed.dart';
import 'package:openapi/src/model/realtime_server_event_conversation_item_input_audio_transcription_failed_error.dart';
import 'package:openapi/src/model/realtime_server_event_conversation_item_truncated.dart';
import 'package:openapi/src/model/realtime_server_event_error.dart';
import 'package:openapi/src/model/realtime_server_event_error_error.dart';
import 'package:openapi/src/model/realtime_server_event_input_audio_buffer_cleared.dart';
import 'package:openapi/src/model/realtime_server_event_input_audio_buffer_committed.dart';
import 'package:openapi/src/model/realtime_server_event_input_audio_buffer_speech_started.dart';
import 'package:openapi/src/model/realtime_server_event_input_audio_buffer_speech_stopped.dart';
import 'package:openapi/src/model/realtime_server_event_rate_limits_updated.dart';
import 'package:openapi/src/model/realtime_server_event_rate_limits_updated_rate_limits_inner.dart';
import 'package:openapi/src/model/realtime_server_event_response_audio_delta.dart';
import 'package:openapi/src/model/realtime_server_event_response_audio_done.dart';
import 'package:openapi/src/model/realtime_server_event_response_audio_transcript_delta.dart';
import 'package:openapi/src/model/realtime_server_event_response_audio_transcript_done.dart';
import 'package:openapi/src/model/realtime_server_event_response_content_part_added.dart';
import 'package:openapi/src/model/realtime_server_event_response_content_part_added_part.dart';
import 'package:openapi/src/model/realtime_server_event_response_content_part_done.dart';
import 'package:openapi/src/model/realtime_server_event_response_content_part_done_part.dart';
import 'package:openapi/src/model/realtime_server_event_response_created.dart';
import 'package:openapi/src/model/realtime_server_event_response_done.dart';
import 'package:openapi/src/model/realtime_server_event_response_function_call_arguments_delta.dart';
import 'package:openapi/src/model/realtime_server_event_response_function_call_arguments_done.dart';
import 'package:openapi/src/model/realtime_server_event_response_output_item_added.dart';
import 'package:openapi/src/model/realtime_server_event_response_output_item_done.dart';
import 'package:openapi/src/model/realtime_server_event_response_text_delta.dart';
import 'package:openapi/src/model/realtime_server_event_response_text_done.dart';
import 'package:openapi/src/model/realtime_server_event_session_created.dart';
import 'package:openapi/src/model/realtime_server_event_session_updated.dart';
import 'package:openapi/src/model/realtime_session.dart';
import 'package:openapi/src/model/realtime_session_create_request.dart';
import 'package:openapi/src/model/realtime_session_create_request_turn_detection.dart';
import 'package:openapi/src/model/realtime_session_create_response.dart';
import 'package:openapi/src/model/realtime_session_create_response_client_secret.dart';
import 'package:openapi/src/model/realtime_session_create_response_turn_detection.dart';
import 'package:openapi/src/model/realtime_session_input_audio_transcription.dart';
import 'package:openapi/src/model/realtime_session_model.dart';
import 'package:openapi/src/model/realtime_session_turn_detection.dart';
import 'package:openapi/src/model/response_format_json_object.dart';
import 'package:openapi/src/model/response_format_json_schema.dart';
import 'package:openapi/src/model/response_format_json_schema_json_schema.dart';
import 'package:openapi/src/model/response_format_text.dart';
import 'package:openapi/src/model/run_completion_usage.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:openapi/src/model/run_object_incomplete_details.dart';
import 'package:openapi/src/model/run_object_last_error.dart';
import 'package:openapi/src/model/run_object_required_action.dart';
import 'package:openapi/src/model/run_object_required_action_submit_tool_outputs.dart';
import 'package:openapi/src/model/run_step_completion_usage.dart';
import 'package:openapi/src/model/run_step_delta_object.dart';
import 'package:openapi/src/model/run_step_delta_object_delta.dart';
import 'package:openapi/src/model/run_step_delta_object_delta_step_details.dart';
import 'package:openapi/src/model/run_step_delta_step_details_message_creation_object.dart';
import 'package:openapi/src/model/run_step_delta_step_details_message_creation_object_message_creation.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_object.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_object_code_interpreter.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_output_image_object.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_output_image_object_image.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_code_output_logs_object.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_file_search_object.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_function_object.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_function_object_function.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_object.dart';
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_object_tool_calls_inner.dart';
import 'package:openapi/src/model/run_step_details_message_creation_object.dart';
import 'package:openapi/src/model/run_step_details_message_creation_object_message_creation.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_object_code_interpreter.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_object_code_interpreter_outputs_inner.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_output_image_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_output_image_object_image.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_code_output_logs_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_object_file_search.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_ranking_options_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_result_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_result_object_content_inner.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_function_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_function_object_function.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_object.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_object_tool_calls_inner.dart';
import 'package:openapi/src/model/run_step_object.dart';
import 'package:openapi/src/model/run_step_object_last_error.dart';
import 'package:openapi/src/model/run_step_object_step_details.dart';
import 'package:openapi/src/model/run_step_stream_event.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of1.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of2.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of3.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of4.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of5.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of6.dart';
import 'package:openapi/src/model/run_stream_event.dart';
import 'package:openapi/src/model/run_stream_event_one_of.dart';
import 'package:openapi/src/model/run_stream_event_one_of1.dart';
import 'package:openapi/src/model/run_stream_event_one_of2.dart';
import 'package:openapi/src/model/run_stream_event_one_of3.dart';
import 'package:openapi/src/model/run_stream_event_one_of4.dart';
import 'package:openapi/src/model/run_stream_event_one_of5.dart';
import 'package:openapi/src/model/run_stream_event_one_of6.dart';
import 'package:openapi/src/model/run_stream_event_one_of7.dart';
import 'package:openapi/src/model/run_stream_event_one_of8.dart';
import 'package:openapi/src/model/run_stream_event_one_of9.dart';
import 'package:openapi/src/model/run_tool_call_object.dart';
import 'package:openapi/src/model/run_tool_call_object_function.dart';
import 'package:openapi/src/model/static_chunking_strategy.dart';
import 'package:openapi/src/model/static_chunking_strategy_request_param.dart';
import 'package:openapi/src/model/static_chunking_strategy_response_param.dart';
import 'package:openapi/src/model/static_chunking_strategy_static.dart';
import 'package:openapi/src/model/submit_tool_outputs_run_request.dart';
import 'package:openapi/src/model/submit_tool_outputs_run_request_tool_outputs_inner.dart';
import 'package:openapi/src/model/thread_object.dart';
import 'package:openapi/src/model/thread_stream_event.dart';
import 'package:openapi/src/model/transcription_segment.dart';
import 'package:openapi/src/model/transcription_word.dart';
import 'package:openapi/src/model/truncation_object.dart';
import 'package:openapi/src/model/update_vector_store_request.dart';
import 'package:openapi/src/model/upload.dart';
import 'package:openapi/src/model/upload_part.dart';
import 'package:openapi/src/model/usage_audio_speeches_result.dart';
import 'package:openapi/src/model/usage_audio_transcriptions_result.dart';
import 'package:openapi/src/model/usage_code_interpreter_sessions_result.dart';
import 'package:openapi/src/model/usage_completions_result.dart';
import 'package:openapi/src/model/usage_embeddings_result.dart';
import 'package:openapi/src/model/usage_images_result.dart';
import 'package:openapi/src/model/usage_moderations_result.dart';
import 'package:openapi/src/model/usage_response.dart';
import 'package:openapi/src/model/usage_time_bucket.dart';
import 'package:openapi/src/model/usage_time_bucket_result_inner.dart';
import 'package:openapi/src/model/usage_vector_stores_result.dart';
import 'package:openapi/src/model/user.dart';
import 'package:openapi/src/model/user_delete_response.dart';
import 'package:openapi/src/model/user_list_response.dart';
import 'package:openapi/src/model/user_role_update_request.dart';
import 'package:openapi/src/model/vector_store_expiration_after.dart';
import 'package:openapi/src/model/vector_store_file_batch_object.dart';
import 'package:openapi/src/model/vector_store_file_batch_object_file_counts.dart';
import 'package:openapi/src/model/vector_store_file_object.dart';
import 'package:openapi/src/model/vector_store_file_object_chunking_strategy.dart';
import 'package:openapi/src/model/vector_store_file_object_last_error.dart';
import 'package:openapi/src/model/vector_store_object.dart';
import 'package:openapi/src/model/vector_store_object_file_counts.dart';

part 'serializers.g.dart';

@SerializersFor([
  AdminApiKey,
  AdminApiKeyOwner,
  AdminApiKeysCreateRequest,
  AdminApiKeysDelete200Response,
  ApiKeyList,
  ArrayOfContentPartsInner,
  AssistantObject,
  AssistantObjectToolResources,
  AssistantObjectToolResourcesCodeInterpreter,
  AssistantObjectToolResourcesFileSearch,
  AssistantObjectToolsInner,
  AssistantStreamEvent,
  AssistantToolsCode,
  AssistantToolsFileSearch,
  AssistantToolsFileSearchFileSearch,
  AssistantToolsFileSearchTypeOnly,
  AssistantToolsFunction,
  AssistantsApiResponseFormatOption,
  AssistantsApiToolChoiceOption,
  AssistantsNamedToolChoice,
  AssistantsNamedToolChoiceFunction,
  AudioResponseFormat,
  AuditLog,
  AuditLogActor,
  AuditLogActorApiKey,
  AuditLogActorServiceAccount,
  AuditLogActorSession,
  AuditLogActorUser,
  AuditLogApiKeyCreated,
  AuditLogApiKeyCreatedData,
  AuditLogApiKeyDeleted,
  AuditLogApiKeyUpdated,
  AuditLogApiKeyUpdatedChangesRequested,
  AuditLogEventType,
  AuditLogInviteAccepted,
  AuditLogInviteSent,
  AuditLogInviteSentData,
  AuditLogLoginFailed,
  AuditLogOrganizationUpdated,
  AuditLogOrganizationUpdatedChangesRequested,
  AuditLogOrganizationUpdatedChangesRequestedSettings,
  AuditLogProject,
  AuditLogProjectArchived,
  AuditLogProjectCreated,
  AuditLogProjectCreatedData,
  AuditLogProjectUpdated,
  AuditLogProjectUpdatedChangesRequested,
  AuditLogRateLimitDeleted,
  AuditLogRateLimitUpdated,
  AuditLogRateLimitUpdatedChangesRequested,
  AuditLogServiceAccountCreated,
  AuditLogServiceAccountCreatedData,
  AuditLogServiceAccountDeleted,
  AuditLogServiceAccountUpdated,
  AuditLogServiceAccountUpdatedChangesRequested,
  AuditLogUserAdded,
  AuditLogUserAddedData,
  AuditLogUserDeleted,
  AuditLogUserUpdated,
  AuditLogUserUpdatedChangesRequested,
  AutoChunkingStrategy,
  AutoChunkingStrategyRequestParam,
  Batch,
  BatchErrors,
  BatchErrorsDataInner,
  BatchRequestCounts,
  BatchRequestInput,
  BatchRequestOutput,
  BatchRequestOutputError,
  BatchRequestOutputResponse,
  ChatCompletionFunctionCallOption,
  ChatCompletionFunctions,
  ChatCompletionMessageToolCall,
  ChatCompletionMessageToolCallChunk,
  ChatCompletionMessageToolCallChunkFunction,
  ChatCompletionMessageToolCallFunction,
  ChatCompletionNamedToolChoice,
  ChatCompletionRequestAssistantMessage,$ChatCompletionRequestAssistantMessage,
  ChatCompletionRequestAssistantMessageAudio,
  ChatCompletionRequestAssistantMessageContent,
  ChatCompletionRequestAssistantMessageContentPart,
  ChatCompletionRequestAssistantMessageFunctionCall,
  ChatCompletionRequestDeveloperMessage,
  ChatCompletionRequestDeveloperMessageContent,
  ChatCompletionRequestFunctionMessage,
  ChatCompletionRequestMessage,
  ChatCompletionRequestMessageContentPartAudio,
  ChatCompletionRequestMessageContentPartAudioInputAudio,
  ChatCompletionRequestMessageContentPartImage,
  ChatCompletionRequestMessageContentPartImageImageUrl,
  ChatCompletionRequestMessageContentPartRefusal,
  ChatCompletionRequestMessageContentPartText,
  ChatCompletionRequestSystemMessage,
  ChatCompletionRequestSystemMessageContent,
  ChatCompletionRequestToolMessage,
  ChatCompletionRequestToolMessageContent,
  ChatCompletionRequestUserMessage,
  ChatCompletionRequestUserMessageContent,
  ChatCompletionRequestUserMessageContentPart,
  ChatCompletionResponseMessage,
  ChatCompletionResponseMessageAudio,
  ChatCompletionResponseMessageFunctionCall,
  ChatCompletionRole,
  ChatCompletionStreamOptions,
  ChatCompletionStreamResponseDelta,
  ChatCompletionStreamResponseDeltaFunctionCall,
  ChatCompletionTokenLogprob,
  ChatCompletionTokenLogprobTopLogprobsInner,
  ChatCompletionTool,
  ChatCompletionToolChoiceOption,
  ChunkingStrategyRequestParam,
  CompleteUploadRequest,
  CompletionUsage,
  CompletionUsageCompletionTokensDetails,
  CompletionUsagePromptTokensDetails,
  CostsResult,
  CostsResultAmount,
  CreateAssistantRequest,
  CreateAssistantRequestModel,
  CreateAssistantRequestToolResources,
  CreateAssistantRequestToolResourcesCodeInterpreter,
  CreateAssistantRequestToolResourcesFileSearch,
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInner,
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy,
  CreateBatchRequest,
  CreateChatCompletionFunctionResponse,
  CreateChatCompletionFunctionResponseChoicesInner,
  CreateChatCompletionRequest,
  CreateChatCompletionRequestAudio,
  CreateChatCompletionRequestFunctionCall,
  CreateChatCompletionRequestModel,
  CreateChatCompletionRequestResponseFormat,
  CreateChatCompletionRequestStop,
  CreateChatCompletionResponse,
  CreateChatCompletionResponseChoicesInner,
  CreateChatCompletionResponseChoicesInnerLogprobs,
  CreateChatCompletionStreamResponse,
  CreateChatCompletionStreamResponseChoicesInner,
  CreateChatCompletionStreamResponseUsage,
  CreateCompletionRequest,
  CreateCompletionRequestModel,
  CreateCompletionRequestPrompt,
  CreateCompletionRequestStop,
  CreateCompletionResponse,
  CreateCompletionResponseChoicesInner,
  CreateCompletionResponseChoicesInnerLogprobs,
  CreateEmbeddingRequest,
  CreateEmbeddingRequestInput,
  CreateEmbeddingRequestModel,
  CreateEmbeddingResponse,
  CreateEmbeddingResponseUsage,
  CreateFineTuningJobRequest,
  CreateFineTuningJobRequestHyperparameters,
  CreateFineTuningJobRequestHyperparametersBatchSize,
  CreateFineTuningJobRequestHyperparametersLearningRateMultiplier,
  CreateFineTuningJobRequestHyperparametersNEpochs,
  CreateFineTuningJobRequestIntegrationsInner,
  CreateFineTuningJobRequestIntegrationsInnerWandb,
  CreateFineTuningJobRequestModel,
  CreateImageEditRequestModel,
  CreateImageRequest,
  CreateImageRequestModel,
  CreateMessageRequest,
  CreateMessageRequestAttachmentsInner,
  CreateMessageRequestAttachmentsInnerToolsInner,
  CreateMessageRequestContent,
  CreateModerationRequest,
  CreateModerationRequestInput,
  CreateModerationRequestInputOneOfInner,
  CreateModerationRequestInputOneOfInnerOneOf,
  CreateModerationRequestInputOneOfInnerOneOf1,
  CreateModerationRequestInputOneOfInnerOneOfImageUrl,
  CreateModerationRequestModel,
  CreateModerationResponse,
  CreateModerationResponseResultsInner,
  CreateModerationResponseResultsInnerCategories,
  CreateModerationResponseResultsInnerCategoryAppliedInputTypes,
  CreateModerationResponseResultsInnerCategoryScores,
  CreateRunRequest,
  CreateRunRequestModel,
  CreateSpeechRequest,
  CreateSpeechRequestModel,
  CreateThreadAndRunRequest,
  CreateThreadAndRunRequestToolResources,
  CreateThreadAndRunRequestToolsInner,
  CreateThreadRequest,
  CreateThreadRequestToolResources,
  CreateThreadRequestToolResourcesFileSearch,
  CreateThreadRequestToolResourcesFileSearchVectorStoresInner,
  CreateTranscription200Response,
  CreateTranscriptionRequestModel,
  CreateTranscriptionResponseJson,
  CreateTranscriptionResponseVerboseJson,
  CreateTranslation200Response,
  CreateTranslationResponseJson,
  CreateTranslationResponseVerboseJson,
  CreateUploadRequest,
  CreateVectorStoreFileBatchRequest,
  CreateVectorStoreFileRequest,
  CreateVectorStoreRequest,
  CreateVectorStoreRequestChunkingStrategy,
  DefaultProjectErrorResponse,
  DeleteAssistantResponse,
  DeleteFileResponse,
  DeleteMessageResponse,
  DeleteModelResponse,
  DeleteThreadResponse,
  DeleteVectorStoreFileResponse,
  DeleteVectorStoreResponse,
  DoneEvent,
  Embedding,
  Error,
  ErrorEvent,
  ErrorResponse,
  FileSearchRankingOptions,
  FineTuneChatCompletionRequestAssistantMessage,
  FineTuneChatRequestInput,
  FineTuneChatRequestInputMessagesInner,
  FineTuneCompletionRequestInput,
  FineTuneDPOMethod,
  FineTuneDPOMethodHyperparameters,
  FineTuneDPOMethodHyperparametersBatchSize,
  FineTuneDPOMethodHyperparametersBeta,
  FineTuneDPOMethodHyperparametersLearningRateMultiplier,
  FineTuneDPOMethodHyperparametersNEpochs,
  FineTuneMethod,
  FineTunePreferenceRequestInput,
  FineTunePreferenceRequestInputInput,
  FineTunePreferenceRequestInputPreferredCompletionInner,
  FineTuneSupervisedMethod,
  FineTuneSupervisedMethodHyperparameters,
  FineTuningIntegration,
  FineTuningJob,
  FineTuningJobCheckpoint,
  FineTuningJobCheckpointMetrics,
  FineTuningJobError,
  FineTuningJobEvent,
  FineTuningJobHyperparameters,
  FineTuningJobIntegrationsInner,
  FunctionObject,
  Image,
  ImagesResponse,
  Invite,
  InviteDeleteResponse,
  InviteListResponse,
  InviteProjectsInner,
  InviteRequest,
  InviteRequestProjectsInner,
  ListAssistantsResponse,
  ListAuditLogsEffectiveAtParameter,
  ListAuditLogsResponse,
  ListBatchesResponse,
  ListFilesResponse,
  ListFineTuningJobCheckpointsResponse,
  ListFineTuningJobEventsResponse,
  ListMessagesResponse,
  ListModelsResponse,
  ListPaginatedFineTuningJobsResponse,
  ListRunStepsResponse,
  ListRunsResponse,
  ListThreadsResponse,
  ListVectorStoreFilesResponse,
  ListVectorStoresResponse,
  MessageContentImageFileObject,
  MessageContentImageFileObjectImageFile,
  MessageContentImageUrlObject,
  MessageContentImageUrlObjectImageUrl,
  MessageContentRefusalObject,
  MessageContentTextAnnotationsFileCitationObject,
  MessageContentTextAnnotationsFileCitationObjectFileCitation,
  MessageContentTextAnnotationsFilePathObject,
  MessageContentTextAnnotationsFilePathObjectFilePath,
  MessageContentTextObject,
  MessageContentTextObjectText,
  MessageContentTextObjectTextAnnotationsInner,
  MessageDeltaContentImageFileObject,
  MessageDeltaContentImageFileObjectImageFile,
  MessageDeltaContentImageUrlObject,
  MessageDeltaContentImageUrlObjectImageUrl,
  MessageDeltaContentRefusalObject,
  MessageDeltaContentTextAnnotationsFileCitationObject,
  MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation,
  MessageDeltaContentTextAnnotationsFilePathObject,
  MessageDeltaContentTextAnnotationsFilePathObjectFilePath,
  MessageDeltaContentTextObject,
  MessageDeltaContentTextObjectText,
  MessageDeltaContentTextObjectTextAnnotationsInner,
  MessageDeltaObject,
  MessageDeltaObjectDelta,
  MessageDeltaObjectDeltaContentInner,
  MessageObject,
  MessageObjectContentInner,
  MessageObjectIncompleteDetails,
  MessageRequestContentTextObject,
  MessageStreamEvent,
  MessageStreamEventOneOf,
  MessageStreamEventOneOf1,
  MessageStreamEventOneOf2,
  MessageStreamEventOneOf3,
  MessageStreamEventOneOf4,
  Model,
  ModifyAssistantRequest,
  ModifyAssistantRequestToolResources,
  ModifyAssistantRequestToolResourcesCodeInterpreter,
  ModifyAssistantRequestToolResourcesFileSearch,
  ModifyMessageRequest,
  ModifyRunRequest,
  ModifyThreadRequest,
  ModifyThreadRequestToolResources,
  ModifyThreadRequestToolResourcesFileSearch,
  OpenAIFile,
  OtherChunkingStrategyResponseParam,
  PredictionContent,
  PredictionContentContent,
  Project,
  ProjectApiKey,
  ProjectApiKeyDeleteResponse,
  ProjectApiKeyListResponse,
  ProjectApiKeyOwner,
  ProjectCreateRequest,
  ProjectListResponse,
  ProjectRateLimit,
  ProjectRateLimitListResponse,
  ProjectRateLimitUpdateRequest,
  ProjectServiceAccount,
  ProjectServiceAccountApiKey,
  ProjectServiceAccountCreateRequest,
  ProjectServiceAccountCreateResponse,
  ProjectServiceAccountDeleteResponse,
  ProjectServiceAccountListResponse,
  ProjectUpdateRequest,
  ProjectUser,
  ProjectUserCreateRequest,
  ProjectUserDeleteResponse,
  ProjectUserListResponse,
  ProjectUserUpdateRequest,
  RealtimeClientEventConversationItemCreate,
  RealtimeClientEventConversationItemDelete,
  RealtimeClientEventConversationItemTruncate,
  RealtimeClientEventInputAudioBufferAppend,
  RealtimeClientEventInputAudioBufferClear,
  RealtimeClientEventInputAudioBufferCommit,
  RealtimeClientEventResponseCancel,
  RealtimeClientEventResponseCreate,
  RealtimeClientEventSessionUpdate,
  RealtimeConversationItem,
  RealtimeConversationItemContentInner,
  RealtimeResponse,
  RealtimeResponseCreateParams,
  RealtimeResponseCreateParamsConversation,
  RealtimeResponseCreateParamsMaxResponseOutputTokens,
  RealtimeResponseCreateParamsToolsInner,
  RealtimeResponseStatusDetails,
  RealtimeResponseStatusDetailsError,
  RealtimeResponseUsage,
  RealtimeResponseUsageInputTokenDetails,
  RealtimeResponseUsageOutputTokenDetails,
  RealtimeServerEventConversationCreated,
  RealtimeServerEventConversationCreatedConversation,
  RealtimeServerEventConversationItemCreated,
  RealtimeServerEventConversationItemDeleted,
  RealtimeServerEventConversationItemInputAudioTranscriptionCompleted,
  RealtimeServerEventConversationItemInputAudioTranscriptionFailed,
  RealtimeServerEventConversationItemInputAudioTranscriptionFailedError,
  RealtimeServerEventConversationItemTruncated,
  RealtimeServerEventError,
  RealtimeServerEventErrorError,
  RealtimeServerEventInputAudioBufferCleared,
  RealtimeServerEventInputAudioBufferCommitted,
  RealtimeServerEventInputAudioBufferSpeechStarted,
  RealtimeServerEventInputAudioBufferSpeechStopped,
  RealtimeServerEventRateLimitsUpdated,
  RealtimeServerEventRateLimitsUpdatedRateLimitsInner,
  RealtimeServerEventResponseAudioDelta,
  RealtimeServerEventResponseAudioDone,
  RealtimeServerEventResponseAudioTranscriptDelta,
  RealtimeServerEventResponseAudioTranscriptDone,
  RealtimeServerEventResponseContentPartAdded,
  RealtimeServerEventResponseContentPartAddedPart,
  RealtimeServerEventResponseContentPartDone,
  RealtimeServerEventResponseContentPartDonePart,
  RealtimeServerEventResponseCreated,
  RealtimeServerEventResponseDone,
  RealtimeServerEventResponseFunctionCallArgumentsDelta,
  RealtimeServerEventResponseFunctionCallArgumentsDone,
  RealtimeServerEventResponseOutputItemAdded,
  RealtimeServerEventResponseOutputItemDone,
  RealtimeServerEventResponseTextDelta,
  RealtimeServerEventResponseTextDone,
  RealtimeServerEventSessionCreated,
  RealtimeServerEventSessionUpdated,
  RealtimeSession,
  RealtimeSessionCreateRequest,
  RealtimeSessionCreateRequestTurnDetection,
  RealtimeSessionCreateResponse,
  RealtimeSessionCreateResponseClientSecret,
  RealtimeSessionCreateResponseTurnDetection,
  RealtimeSessionInputAudioTranscription,
  RealtimeSessionModel,
  RealtimeSessionTurnDetection,
  ResponseFormatJsonObject,
  ResponseFormatJsonSchema,
  ResponseFormatJsonSchemaJsonSchema,
  ResponseFormatText,
  RunCompletionUsage,
  RunObject,
  RunObjectIncompleteDetails,
  RunObjectLastError,
  RunObjectRequiredAction,
  RunObjectRequiredActionSubmitToolOutputs,
  RunStepCompletionUsage,
  RunStepDeltaObject,
  RunStepDeltaObjectDelta,
  RunStepDeltaObjectDeltaStepDetails,
  RunStepDeltaStepDetailsMessageCreationObject,
  RunStepDeltaStepDetailsMessageCreationObjectMessageCreation,
  RunStepDeltaStepDetailsToolCallsCodeObject,
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter,
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner,
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject,
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage,
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject,
  RunStepDeltaStepDetailsToolCallsFileSearchObject,
  RunStepDeltaStepDetailsToolCallsFunctionObject,
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction,
  RunStepDeltaStepDetailsToolCallsObject,
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner,
  RunStepDetailsMessageCreationObject,
  RunStepDetailsMessageCreationObjectMessageCreation,
  RunStepDetailsToolCallsCodeObject,
  RunStepDetailsToolCallsCodeObjectCodeInterpreter,
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner,
  RunStepDetailsToolCallsCodeOutputImageObject,
  RunStepDetailsToolCallsCodeOutputImageObjectImage,
  RunStepDetailsToolCallsCodeOutputLogsObject,
  RunStepDetailsToolCallsFileSearchObject,
  RunStepDetailsToolCallsFileSearchObjectFileSearch,
  RunStepDetailsToolCallsFileSearchRankingOptionsObject,
  RunStepDetailsToolCallsFileSearchResultObject,
  RunStepDetailsToolCallsFileSearchResultObjectContentInner,
  RunStepDetailsToolCallsFunctionObject,
  RunStepDetailsToolCallsFunctionObjectFunction,
  RunStepDetailsToolCallsObject,
  RunStepDetailsToolCallsObjectToolCallsInner,
  RunStepObject,
  RunStepObjectLastError,
  RunStepObjectStepDetails,
  RunStepStreamEvent,
  RunStepStreamEventOneOf,
  RunStepStreamEventOneOf1,
  RunStepStreamEventOneOf2,
  RunStepStreamEventOneOf3,
  RunStepStreamEventOneOf4,
  RunStepStreamEventOneOf5,
  RunStepStreamEventOneOf6,
  RunStreamEvent,
  RunStreamEventOneOf,
  RunStreamEventOneOf1,
  RunStreamEventOneOf2,
  RunStreamEventOneOf3,
  RunStreamEventOneOf4,
  RunStreamEventOneOf5,
  RunStreamEventOneOf6,
  RunStreamEventOneOf7,
  RunStreamEventOneOf8,
  RunStreamEventOneOf9,
  RunToolCallObject,
  RunToolCallObjectFunction,
  StaticChunkingStrategy,
  StaticChunkingStrategyRequestParam,
  StaticChunkingStrategyResponseParam,
  StaticChunkingStrategyStatic,
  SubmitToolOutputsRunRequest,
  SubmitToolOutputsRunRequestToolOutputsInner,
  ThreadObject,
  ThreadStreamEvent,
  TranscriptionSegment,
  TranscriptionWord,
  TruncationObject,
  UpdateVectorStoreRequest,
  Upload,
  UploadPart,
  UsageAudioSpeechesResult,
  UsageAudioTranscriptionsResult,
  UsageCodeInterpreterSessionsResult,
  UsageCompletionsResult,
  UsageEmbeddingsResult,
  UsageImagesResult,
  UsageModerationsResult,
  UsageResponse,
  UsageTimeBucket,
  UsageTimeBucketResultInner,
  UsageVectorStoresResult,
  User,
  UserDeleteResponse,
  UserListResponse,
  UserRoleUpdateRequest,
  VectorStoreExpirationAfter,
  VectorStoreFileBatchObject,
  VectorStoreFileBatchObjectFileCounts,
  VectorStoreFileObject,
  VectorStoreFileObjectChunkingStrategy,
  VectorStoreFileObjectLastError,
  VectorStoreObject,
  VectorStoreObjectFileCounts,
])
Serializers serializers = (_$serializers.toBuilder()
      ..addBuilderFactory(
        const FullType(BuiltMap, [FullType(String), FullType(num)]),
        () => MapBuilder<String, num>(),
      )
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(String)]),
        () => ListBuilder<String>(),
      )
      ..addBuilderFactory(
        const FullType(BuiltList, [FullType(AuditLogEventType)]),
        () => ListBuilder<AuditLogEventType>(),
      )
      ..add(ChatCompletionRequestAssistantMessage.serializer)
      ..add(const OneOfSerializer())
      ..add(const AnyOfSerializer())
      ..add(const DateSerializer())
      ..add(Iso8601DateTimeSerializer())
    ).build();

Serializers standardSerializers =
    (serializers.toBuilder()..addPlugin(StandardJsonPlugin())).build();
