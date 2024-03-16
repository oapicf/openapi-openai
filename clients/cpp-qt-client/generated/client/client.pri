QT += network

HEADERS += \
# Models
    $${PWD}/OAIChatCompletionFunctions.h \
    $${PWD}/OAIChatCompletionRequestMessage.h \
    $${PWD}/OAIChatCompletionRequestMessage_function_call.h \
    $${PWD}/OAIChatCompletionResponseMessage.h \
    $${PWD}/OAIChatCompletionStreamResponseDelta.h \
    $${PWD}/OAICreateChatCompletionRequest.h \
    $${PWD}/OAICreateChatCompletionRequest_function_call.h \
    $${PWD}/OAICreateChatCompletionRequest_function_call_oneOf.h \
    $${PWD}/OAICreateChatCompletionRequest_model.h \
    $${PWD}/OAICreateChatCompletionRequest_stop.h \
    $${PWD}/OAICreateChatCompletionResponse.h \
    $${PWD}/OAICreateChatCompletionResponse_choices_inner.h \
    $${PWD}/OAICreateChatCompletionStreamResponse.h \
    $${PWD}/OAICreateChatCompletionStreamResponse_choices_inner.h \
    $${PWD}/OAICreateCompletionRequest.h \
    $${PWD}/OAICreateCompletionRequest_model.h \
    $${PWD}/OAICreateCompletionRequest_prompt.h \
    $${PWD}/OAICreateCompletionRequest_stop.h \
    $${PWD}/OAICreateCompletionResponse.h \
    $${PWD}/OAICreateCompletionResponse_choices_inner.h \
    $${PWD}/OAICreateCompletionResponse_choices_inner_logprobs.h \
    $${PWD}/OAICreateCompletionResponse_usage.h \
    $${PWD}/OAICreateEditRequest.h \
    $${PWD}/OAICreateEditRequest_model.h \
    $${PWD}/OAICreateEditResponse.h \
    $${PWD}/OAICreateEditResponse_choices_inner.h \
    $${PWD}/OAICreateEmbeddingRequest.h \
    $${PWD}/OAICreateEmbeddingRequest_input.h \
    $${PWD}/OAICreateEmbeddingRequest_model.h \
    $${PWD}/OAICreateEmbeddingResponse.h \
    $${PWD}/OAICreateEmbeddingResponse_data_inner.h \
    $${PWD}/OAICreateEmbeddingResponse_usage.h \
    $${PWD}/OAICreateFineTuneRequest.h \
    $${PWD}/OAICreateFineTuneRequest_model.h \
    $${PWD}/OAICreateImageRequest.h \
    $${PWD}/OAICreateModerationRequest.h \
    $${PWD}/OAICreateModerationRequest_input.h \
    $${PWD}/OAICreateModerationRequest_model.h \
    $${PWD}/OAICreateModerationResponse.h \
    $${PWD}/OAICreateModerationResponse_results_inner.h \
    $${PWD}/OAICreateModerationResponse_results_inner_categories.h \
    $${PWD}/OAICreateModerationResponse_results_inner_category_scores.h \
    $${PWD}/OAICreateTranscriptionRequest_model.h \
    $${PWD}/OAICreateTranscriptionResponse.h \
    $${PWD}/OAICreateTranslationResponse.h \
    $${PWD}/OAIDeleteFileResponse.h \
    $${PWD}/OAIDeleteModelResponse.h \
    $${PWD}/OAIError.h \
    $${PWD}/OAIErrorResponse.h \
    $${PWD}/OAIFineTune.h \
    $${PWD}/OAIFineTuneEvent.h \
    $${PWD}/OAIImagesResponse.h \
    $${PWD}/OAIImagesResponse_data_inner.h \
    $${PWD}/OAIListFilesResponse.h \
    $${PWD}/OAIListFineTuneEventsResponse.h \
    $${PWD}/OAIListFineTunesResponse.h \
    $${PWD}/OAIListModelsResponse.h \
    $${PWD}/OAIModel.h \
    $${PWD}/OAIOpenAIFile.h \
# APIs
    $${PWD}/OAIOpenAIApi.h \
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIEnum.h \
    $${PWD}/OAIHttpFileElement.h \
    $${PWD}/OAIServerConfiguration.h \
    $${PWD}/OAIServerVariable.h \
    $${PWD}/OAIOauth.h

SOURCES += \
# Models
    $${PWD}/OAIChatCompletionFunctions.cpp \
    $${PWD}/OAIChatCompletionRequestMessage.cpp \
    $${PWD}/OAIChatCompletionRequestMessage_function_call.cpp \
    $${PWD}/OAIChatCompletionResponseMessage.cpp \
    $${PWD}/OAIChatCompletionStreamResponseDelta.cpp \
    $${PWD}/OAICreateChatCompletionRequest.cpp \
    $${PWD}/OAICreateChatCompletionRequest_function_call.cpp \
    $${PWD}/OAICreateChatCompletionRequest_function_call_oneOf.cpp \
    $${PWD}/OAICreateChatCompletionRequest_model.cpp \
    $${PWD}/OAICreateChatCompletionRequest_stop.cpp \
    $${PWD}/OAICreateChatCompletionResponse.cpp \
    $${PWD}/OAICreateChatCompletionResponse_choices_inner.cpp \
    $${PWD}/OAICreateChatCompletionStreamResponse.cpp \
    $${PWD}/OAICreateChatCompletionStreamResponse_choices_inner.cpp \
    $${PWD}/OAICreateCompletionRequest.cpp \
    $${PWD}/OAICreateCompletionRequest_model.cpp \
    $${PWD}/OAICreateCompletionRequest_prompt.cpp \
    $${PWD}/OAICreateCompletionRequest_stop.cpp \
    $${PWD}/OAICreateCompletionResponse.cpp \
    $${PWD}/OAICreateCompletionResponse_choices_inner.cpp \
    $${PWD}/OAICreateCompletionResponse_choices_inner_logprobs.cpp \
    $${PWD}/OAICreateCompletionResponse_usage.cpp \
    $${PWD}/OAICreateEditRequest.cpp \
    $${PWD}/OAICreateEditRequest_model.cpp \
    $${PWD}/OAICreateEditResponse.cpp \
    $${PWD}/OAICreateEditResponse_choices_inner.cpp \
    $${PWD}/OAICreateEmbeddingRequest.cpp \
    $${PWD}/OAICreateEmbeddingRequest_input.cpp \
    $${PWD}/OAICreateEmbeddingRequest_model.cpp \
    $${PWD}/OAICreateEmbeddingResponse.cpp \
    $${PWD}/OAICreateEmbeddingResponse_data_inner.cpp \
    $${PWD}/OAICreateEmbeddingResponse_usage.cpp \
    $${PWD}/OAICreateFineTuneRequest.cpp \
    $${PWD}/OAICreateFineTuneRequest_model.cpp \
    $${PWD}/OAICreateImageRequest.cpp \
    $${PWD}/OAICreateModerationRequest.cpp \
    $${PWD}/OAICreateModerationRequest_input.cpp \
    $${PWD}/OAICreateModerationRequest_model.cpp \
    $${PWD}/OAICreateModerationResponse.cpp \
    $${PWD}/OAICreateModerationResponse_results_inner.cpp \
    $${PWD}/OAICreateModerationResponse_results_inner_categories.cpp \
    $${PWD}/OAICreateModerationResponse_results_inner_category_scores.cpp \
    $${PWD}/OAICreateTranscriptionRequest_model.cpp \
    $${PWD}/OAICreateTranscriptionResponse.cpp \
    $${PWD}/OAICreateTranslationResponse.cpp \
    $${PWD}/OAIDeleteFileResponse.cpp \
    $${PWD}/OAIDeleteModelResponse.cpp \
    $${PWD}/OAIError.cpp \
    $${PWD}/OAIErrorResponse.cpp \
    $${PWD}/OAIFineTune.cpp \
    $${PWD}/OAIFineTuneEvent.cpp \
    $${PWD}/OAIImagesResponse.cpp \
    $${PWD}/OAIImagesResponse_data_inner.cpp \
    $${PWD}/OAIListFilesResponse.cpp \
    $${PWD}/OAIListFineTuneEventsResponse.cpp \
    $${PWD}/OAIListFineTunesResponse.cpp \
    $${PWD}/OAIListModelsResponse.cpp \
    $${PWD}/OAIModel.cpp \
    $${PWD}/OAIOpenAIFile.cpp \
# APIs
    $${PWD}/OAIOpenAIApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp \
    $${PWD}/OAIHttpFileElement.cpp \
    $${PWD}/OAIOauth.cpp
