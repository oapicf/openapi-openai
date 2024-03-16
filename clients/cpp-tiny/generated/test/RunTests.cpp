
#include "ChatCompletionFunctionsTest.cpp"

#include "ChatCompletionRequestMessageTest.cpp"

#include "ChatCompletionRequestMessage_function_callTest.cpp"

#include "ChatCompletionResponseMessageTest.cpp"

#include "ChatCompletionStreamResponseDeltaTest.cpp"

#include "CreateChatCompletionRequestTest.cpp"

#include "CreateChatCompletionRequest_function_callTest.cpp"

#include "CreateChatCompletionRequest_function_call_oneOfTest.cpp"

#include "CreateChatCompletionRequest_modelTest.cpp"

#include "CreateChatCompletionRequest_stopTest.cpp"

#include "CreateChatCompletionResponseTest.cpp"

#include "CreateChatCompletionResponse_choices_innerTest.cpp"

#include "CreateChatCompletionStreamResponseTest.cpp"

#include "CreateChatCompletionStreamResponse_choices_innerTest.cpp"

#include "CreateCompletionRequestTest.cpp"

#include "CreateCompletionRequest_modelTest.cpp"

#include "CreateCompletionRequest_promptTest.cpp"

#include "CreateCompletionRequest_stopTest.cpp"

#include "CreateCompletionResponseTest.cpp"

#include "CreateCompletionResponse_choices_innerTest.cpp"

#include "CreateCompletionResponse_choices_inner_logprobsTest.cpp"

#include "CreateCompletionResponse_usageTest.cpp"

#include "CreateEditRequestTest.cpp"

#include "CreateEditRequest_modelTest.cpp"

#include "CreateEditResponseTest.cpp"

#include "CreateEditResponse_choices_innerTest.cpp"

#include "CreateEmbeddingRequestTest.cpp"

#include "CreateEmbeddingRequest_inputTest.cpp"

#include "CreateEmbeddingRequest_modelTest.cpp"

#include "CreateEmbeddingResponseTest.cpp"

#include "CreateEmbeddingResponse_data_innerTest.cpp"

#include "CreateEmbeddingResponse_usageTest.cpp"

#include "CreateFineTuneRequestTest.cpp"

#include "CreateFineTuneRequest_modelTest.cpp"

#include "CreateImageRequestTest.cpp"

#include "CreateModerationRequestTest.cpp"

#include "CreateModerationRequest_inputTest.cpp"

#include "CreateModerationRequest_modelTest.cpp"

#include "CreateModerationResponseTest.cpp"

#include "CreateModerationResponse_results_innerTest.cpp"

#include "CreateModerationResponse_results_inner_categoriesTest.cpp"

#include "CreateModerationResponse_results_inner_category_scoresTest.cpp"

#include "CreateTranscriptionRequest_modelTest.cpp"

#include "CreateTranscriptionResponseTest.cpp"

#include "CreateTranslationResponseTest.cpp"

#include "DeleteFileResponseTest.cpp"

#include "DeleteModelResponseTest.cpp"

#include "ErrorTest.cpp"

#include "ErrorResponseTest.cpp"

#include "FineTuneTest.cpp"

#include "FineTuneEventTest.cpp"

#include "ImagesResponseTest.cpp"

#include "ImagesResponse_data_innerTest.cpp"

#include "ListFilesResponseTest.cpp"

#include "ListFineTuneEventsResponseTest.cpp"

#include "ListFineTunesResponseTest.cpp"

#include "ListModelsResponseTest.cpp"

#include "ModelTest.cpp"

#include "OpenAIFileTest.cpp"



void setUp(){}

void tearDown(){}

void runTests(){
    
    
    RUN_TEST(test_ChatCompletionFunctions_name_is_assigned_from_json);
    
    
    RUN_TEST(test_ChatCompletionFunctions_description_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_ChatCompletionRequestMessage_role_is_assigned_from_json);
    
    
    RUN_TEST(test_ChatCompletionRequestMessage_content_is_assigned_from_json);
    
    
    RUN_TEST(test_ChatCompletionRequestMessage_name_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_ChatCompletionRequestMessage_function_call_name_is_assigned_from_json);
    
    
    RUN_TEST(test_ChatCompletionRequestMessage_function_call_arguments_is_assigned_from_json);
    
    
    
    RUN_TEST(test_ChatCompletionResponseMessage_role_is_assigned_from_json);
    
    
    RUN_TEST(test_ChatCompletionResponseMessage_content_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_ChatCompletionStreamResponseDelta_role_is_assigned_from_json);
    
    
    RUN_TEST(test_ChatCompletionStreamResponseDelta_content_is_assigned_from_json);
    
    
    
    
    
    
    
    
    RUN_TEST(test_CreateChatCompletionRequest_temperature_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionRequest_top_p_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionRequest_n_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionRequest_stream_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionRequest_max_tokens_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionRequest_presence_penalty_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionRequest_frequency_penalty_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionRequest_user_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionRequest_function_call_name_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionRequest_function_call_oneOf_name_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_CreateChatCompletionResponse_id_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionResponse_object_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionResponse_created_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionResponse_model_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_CreateChatCompletionResponse_choices_inner_index_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionResponse_choices_inner_finish_reason_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_id_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_object_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_created_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_model_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_choices_inner_index_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_choices_inner_finish_reason_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_CreateCompletionRequest_suffix_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_max_tokens_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_temperature_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_top_p_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_n_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_stream_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_logprobs_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_echo_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateCompletionRequest_presence_penalty_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_frequency_penalty_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_best_of_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateCompletionRequest_user_is_assigned_from_json);
    
    
    
    
    
    
    RUN_TEST(test_CreateCompletionResponse_id_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_object_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_created_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_model_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_CreateCompletionResponse_choices_inner_text_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_choices_inner_index_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateCompletionResponse_choices_inner_finish_reason_is_assigned_from_json);
    
    
    
    
    
    
    
    
    RUN_TEST(test_CreateCompletionResponse_usage_prompt_tokens_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_usage_completion_tokens_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_usage_total_tokens_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_CreateEditRequest_input_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateEditRequest_instruction_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateEditRequest_n_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateEditRequest_temperature_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateEditRequest_top_p_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_CreateEditResponse_object_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateEditResponse_created_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_CreateEditResponse_choices_inner_text_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateEditResponse_choices_inner_index_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateEditResponse_choices_inner_finish_reason_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_CreateEmbeddingRequest_user_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_CreateEmbeddingResponse_object_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateEmbeddingResponse_model_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_CreateEmbeddingResponse_data_inner_index_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateEmbeddingResponse_data_inner_object_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_CreateEmbeddingResponse_usage_prompt_tokens_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateEmbeddingResponse_usage_total_tokens_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateFineTuneRequest_training_file_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_validation_file_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateFineTuneRequest_n_epochs_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_batch_size_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_learning_rate_multiplier_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_prompt_loss_weight_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_compute_classification_metrics_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_classification_n_classes_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_classification_positive_class_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateFineTuneRequest_suffix_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_CreateImageRequest_prompt_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateImageRequest_n_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateImageRequest_size_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateImageRequest_response_format_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateImageRequest_user_is_assigned_from_json);
    
    
    
    
    
    
    
    
    RUN_TEST(test_CreateModerationResponse_id_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_model_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_flagged_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_hate_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_hatethreatening_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_selfharm_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_sexual_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_sexualminors_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_violence_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_violencegraphic_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_hate_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_hatethreatening_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_selfharm_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_sexual_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_sexualminors_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_violence_is_assigned_from_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_violencegraphic_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_CreateTranscriptionResponse_text_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CreateTranslationResponse_text_is_assigned_from_json);
    
    
    
    RUN_TEST(test_DeleteFileResponse_id_is_assigned_from_json);
    
    
    RUN_TEST(test_DeleteFileResponse_object_is_assigned_from_json);
    
    
    RUN_TEST(test_DeleteFileResponse_deleted_is_assigned_from_json);
    
    
    
    RUN_TEST(test_DeleteModelResponse_id_is_assigned_from_json);
    
    
    RUN_TEST(test_DeleteModelResponse_object_is_assigned_from_json);
    
    
    RUN_TEST(test_DeleteModelResponse_deleted_is_assigned_from_json);
    
    
    
    RUN_TEST(test_Error_type_is_assigned_from_json);
    
    
    RUN_TEST(test_Error_message_is_assigned_from_json);
    
    
    RUN_TEST(test_Error_param_is_assigned_from_json);
    
    
    RUN_TEST(test_Error_code_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_FineTune_id_is_assigned_from_json);
    
    
    RUN_TEST(test_FineTune_object_is_assigned_from_json);
    
    
    RUN_TEST(test_FineTune_created_at_is_assigned_from_json);
    
    
    RUN_TEST(test_FineTune_updated_at_is_assigned_from_json);
    
    
    RUN_TEST(test_FineTune_model_is_assigned_from_json);
    
    
    RUN_TEST(test_FineTune_fine_tuned_model_is_assigned_from_json);
    
    
    RUN_TEST(test_FineTune_organization_id_is_assigned_from_json);
    
    
    RUN_TEST(test_FineTune_status_is_assigned_from_json);
    
    
    
    
    
    
    
    
    RUN_TEST(test_FineTuneEvent_object_is_assigned_from_json);
    
    
    RUN_TEST(test_FineTuneEvent_created_at_is_assigned_from_json);
    
    
    RUN_TEST(test_FineTuneEvent_level_is_assigned_from_json);
    
    
    RUN_TEST(test_FineTuneEvent_message_is_assigned_from_json);
    
    
    
    RUN_TEST(test_ImagesResponse_created_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_ImagesResponse_data_inner_url_is_assigned_from_json);
    
    
    RUN_TEST(test_ImagesResponse_data_inner_b64_json_is_assigned_from_json);
    
    
    
    RUN_TEST(test_ListFilesResponse_object_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_ListFineTuneEventsResponse_object_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_ListFineTunesResponse_object_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_ListModelsResponse_object_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_Model_id_is_assigned_from_json);
    
    
    RUN_TEST(test_Model_object_is_assigned_from_json);
    
    
    RUN_TEST(test_Model_created_is_assigned_from_json);
    
    
    RUN_TEST(test_Model_owned_by_is_assigned_from_json);
    
    
    
    RUN_TEST(test_OpenAIFile_id_is_assigned_from_json);
    
    
    RUN_TEST(test_OpenAIFile_object_is_assigned_from_json);
    
    
    RUN_TEST(test_OpenAIFile_bytes_is_assigned_from_json);
    
    
    RUN_TEST(test_OpenAIFile_created_at_is_assigned_from_json);
    
    
    RUN_TEST(test_OpenAIFile_filename_is_assigned_from_json);
    
    
    RUN_TEST(test_OpenAIFile_purpose_is_assigned_from_json);
    
    
    RUN_TEST(test_OpenAIFile_status_is_assigned_from_json);
    
    
    

    
    
    RUN_TEST(test_ChatCompletionFunctions_name_is_converted_to_json);
    
    
    RUN_TEST(test_ChatCompletionFunctions_description_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_ChatCompletionRequestMessage_role_is_converted_to_json);
    
    
    RUN_TEST(test_ChatCompletionRequestMessage_content_is_converted_to_json);
    
    
    RUN_TEST(test_ChatCompletionRequestMessage_name_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_ChatCompletionRequestMessage_function_call_name_is_converted_to_json);
    
    
    RUN_TEST(test_ChatCompletionRequestMessage_function_call_arguments_is_converted_to_json);
    
    
    
    RUN_TEST(test_ChatCompletionResponseMessage_role_is_converted_to_json);
    
    
    RUN_TEST(test_ChatCompletionResponseMessage_content_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_ChatCompletionStreamResponseDelta_role_is_converted_to_json);
    
    
    RUN_TEST(test_ChatCompletionStreamResponseDelta_content_is_converted_to_json);
    
    
    
    
    
    
    
    
    RUN_TEST(test_CreateChatCompletionRequest_temperature_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionRequest_top_p_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionRequest_n_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionRequest_stream_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionRequest_max_tokens_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionRequest_presence_penalty_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionRequest_frequency_penalty_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionRequest_user_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionRequest_function_call_name_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionRequest_function_call_oneOf_name_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_CreateChatCompletionResponse_id_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionResponse_object_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionResponse_created_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionResponse_model_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_CreateChatCompletionResponse_choices_inner_index_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionResponse_choices_inner_finish_reason_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_id_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_object_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_created_is_converted_to_json);
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_model_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_choices_inner_index_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateChatCompletionStreamResponse_choices_inner_finish_reason_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_CreateCompletionRequest_suffix_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_max_tokens_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_temperature_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_top_p_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_n_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_stream_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_logprobs_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_echo_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateCompletionRequest_presence_penalty_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_frequency_penalty_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionRequest_best_of_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateCompletionRequest_user_is_converted_to_json);
    
    
    
    
    
    
    RUN_TEST(test_CreateCompletionResponse_id_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_object_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_created_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_model_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_CreateCompletionResponse_choices_inner_text_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_choices_inner_index_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateCompletionResponse_choices_inner_finish_reason_is_converted_to_json);
    
    
    
    
    
    
    
    
    RUN_TEST(test_CreateCompletionResponse_usage_prompt_tokens_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_usage_completion_tokens_is_converted_to_json);
    
    
    RUN_TEST(test_CreateCompletionResponse_usage_total_tokens_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_CreateEditRequest_input_is_converted_to_json);
    
    
    RUN_TEST(test_CreateEditRequest_instruction_is_converted_to_json);
    
    
    RUN_TEST(test_CreateEditRequest_n_is_converted_to_json);
    
    
    RUN_TEST(test_CreateEditRequest_temperature_is_converted_to_json);
    
    
    RUN_TEST(test_CreateEditRequest_top_p_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_CreateEditResponse_object_is_converted_to_json);
    
    
    RUN_TEST(test_CreateEditResponse_created_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_CreateEditResponse_choices_inner_text_is_converted_to_json);
    
    
    RUN_TEST(test_CreateEditResponse_choices_inner_index_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateEditResponse_choices_inner_finish_reason_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_CreateEmbeddingRequest_user_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_CreateEmbeddingResponse_object_is_converted_to_json);
    
    
    RUN_TEST(test_CreateEmbeddingResponse_model_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_CreateEmbeddingResponse_data_inner_index_is_converted_to_json);
    
    
    RUN_TEST(test_CreateEmbeddingResponse_data_inner_object_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_CreateEmbeddingResponse_usage_prompt_tokens_is_converted_to_json);
    
    
    RUN_TEST(test_CreateEmbeddingResponse_usage_total_tokens_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateFineTuneRequest_training_file_is_converted_to_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_validation_file_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateFineTuneRequest_n_epochs_is_converted_to_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_batch_size_is_converted_to_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_learning_rate_multiplier_is_converted_to_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_prompt_loss_weight_is_converted_to_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_compute_classification_metrics_is_converted_to_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_classification_n_classes_is_converted_to_json);
    
    
    RUN_TEST(test_CreateFineTuneRequest_classification_positive_class_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateFineTuneRequest_suffix_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_CreateImageRequest_prompt_is_converted_to_json);
    
    
    RUN_TEST(test_CreateImageRequest_n_is_converted_to_json);
    
    
    RUN_TEST(test_CreateImageRequest_size_is_converted_to_json);
    
    
    RUN_TEST(test_CreateImageRequest_response_format_is_converted_to_json);
    
    
    RUN_TEST(test_CreateImageRequest_user_is_converted_to_json);
    
    
    
    
    
    
    
    
    RUN_TEST(test_CreateModerationResponse_id_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_model_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_flagged_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_hate_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_hatethreatening_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_selfharm_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_sexual_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_sexualminors_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_violence_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_categories_violencegraphic_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_hate_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_hatethreatening_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_selfharm_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_sexual_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_sexualminors_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_violence_is_converted_to_json);
    
    
    RUN_TEST(test_CreateModerationResponse_results_inner_category_scores_violencegraphic_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_CreateTranscriptionResponse_text_is_converted_to_json);
    
    
    
    RUN_TEST(test_CreateTranslationResponse_text_is_converted_to_json);
    
    
    
    RUN_TEST(test_DeleteFileResponse_id_is_converted_to_json);
    
    
    RUN_TEST(test_DeleteFileResponse_object_is_converted_to_json);
    
    
    RUN_TEST(test_DeleteFileResponse_deleted_is_converted_to_json);
    
    
    
    RUN_TEST(test_DeleteModelResponse_id_is_converted_to_json);
    
    
    RUN_TEST(test_DeleteModelResponse_object_is_converted_to_json);
    
    
    RUN_TEST(test_DeleteModelResponse_deleted_is_converted_to_json);
    
    
    
    RUN_TEST(test_Error_type_is_converted_to_json);
    
    
    RUN_TEST(test_Error_message_is_converted_to_json);
    
    
    RUN_TEST(test_Error_param_is_converted_to_json);
    
    
    RUN_TEST(test_Error_code_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_FineTune_id_is_converted_to_json);
    
    
    RUN_TEST(test_FineTune_object_is_converted_to_json);
    
    
    RUN_TEST(test_FineTune_created_at_is_converted_to_json);
    
    
    RUN_TEST(test_FineTune_updated_at_is_converted_to_json);
    
    
    RUN_TEST(test_FineTune_model_is_converted_to_json);
    
    
    RUN_TEST(test_FineTune_fine_tuned_model_is_converted_to_json);
    
    
    RUN_TEST(test_FineTune_organization_id_is_converted_to_json);
    
    
    RUN_TEST(test_FineTune_status_is_converted_to_json);
    
    
    
    
    
    
    
    
    RUN_TEST(test_FineTuneEvent_object_is_converted_to_json);
    
    
    RUN_TEST(test_FineTuneEvent_created_at_is_converted_to_json);
    
    
    RUN_TEST(test_FineTuneEvent_level_is_converted_to_json);
    
    
    RUN_TEST(test_FineTuneEvent_message_is_converted_to_json);
    
    
    
    RUN_TEST(test_ImagesResponse_created_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_ImagesResponse_data_inner_url_is_converted_to_json);
    
    
    RUN_TEST(test_ImagesResponse_data_inner_b64_json_is_converted_to_json);
    
    
    
    RUN_TEST(test_ListFilesResponse_object_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_ListFineTuneEventsResponse_object_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_ListFineTunesResponse_object_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_ListModelsResponse_object_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_Model_id_is_converted_to_json);
    
    
    RUN_TEST(test_Model_object_is_converted_to_json);
    
    
    RUN_TEST(test_Model_created_is_converted_to_json);
    
    
    RUN_TEST(test_Model_owned_by_is_converted_to_json);
    
    
    
    RUN_TEST(test_OpenAIFile_id_is_converted_to_json);
    
    
    RUN_TEST(test_OpenAIFile_object_is_converted_to_json);
    
    
    RUN_TEST(test_OpenAIFile_bytes_is_converted_to_json);
    
    
    RUN_TEST(test_OpenAIFile_created_at_is_converted_to_json);
    
    
    RUN_TEST(test_OpenAIFile_filename_is_converted_to_json);
    
    
    RUN_TEST(test_OpenAIFile_purpose_is_converted_to_json);
    
    
    RUN_TEST(test_OpenAIFile_status_is_converted_to_json);
    
    
    


}

int main(void) {
    UNITY_BEGIN();
    runTests();
    return UNITY_END();
}

void setup() {
    UNITY_BEGIN();
    runTests();
    UNITY_END();
}

void loop() {

}
