cmake_minimum_required(VERSION 3.5)

project(QtOpenAPIClient)

set(CMAKE_AUTOMOC ON)

find_package(QT NAMES Qt6 Qt5 REQUIRED COMPONENTS Core Network Gui)
find_package(Qt${QT_VERSION_MAJOR} REQUIRED COMPONENTS Core Network Gui)

include(GNUInstallDirs)
include(CMakePackageConfigHelpers)

add_library(${PROJECT_NAME}
  OAIChatCompletionFunctions.h
  OAIChatCompletionRequestMessage.h
  OAIChatCompletionRequestMessage_function_call.h
  OAIChatCompletionResponseMessage.h
  OAIChatCompletionStreamResponseDelta.h
  OAICreateChatCompletionRequest.h
  OAICreateChatCompletionRequest_function_call.h
  OAICreateChatCompletionRequest_function_call_oneOf.h
  OAICreateChatCompletionRequest_model.h
  OAICreateChatCompletionRequest_stop.h
  OAICreateChatCompletionResponse.h
  OAICreateChatCompletionResponse_choices_inner.h
  OAICreateChatCompletionStreamResponse.h
  OAICreateChatCompletionStreamResponse_choices_inner.h
  OAICreateCompletionRequest.h
  OAICreateCompletionRequest_model.h
  OAICreateCompletionRequest_prompt.h
  OAICreateCompletionRequest_stop.h
  OAICreateCompletionResponse.h
  OAICreateCompletionResponse_choices_inner.h
  OAICreateCompletionResponse_choices_inner_logprobs.h
  OAICreateCompletionResponse_usage.h
  OAICreateEditRequest.h
  OAICreateEditRequest_model.h
  OAICreateEditResponse.h
  OAICreateEditResponse_choices_inner.h
  OAICreateEmbeddingRequest.h
  OAICreateEmbeddingRequest_input.h
  OAICreateEmbeddingRequest_model.h
  OAICreateEmbeddingResponse.h
  OAICreateEmbeddingResponse_data_inner.h
  OAICreateEmbeddingResponse_usage.h
  OAICreateFineTuneRequest.h
  OAICreateFineTuneRequest_model.h
  OAICreateImageRequest.h
  OAICreateModerationRequest.h
  OAICreateModerationRequest_input.h
  OAICreateModerationRequest_model.h
  OAICreateModerationResponse.h
  OAICreateModerationResponse_results_inner.h
  OAICreateModerationResponse_results_inner_categories.h
  OAICreateModerationResponse_results_inner_category_scores.h
  OAICreateTranscriptionRequest_model.h
  OAICreateTranscriptionResponse.h
  OAICreateTranslationResponse.h
  OAIDeleteFileResponse.h
  OAIDeleteModelResponse.h
  OAIError.h
  OAIErrorResponse.h
  OAIFineTune.h
  OAIFineTuneEvent.h
  OAIImagesResponse.h
  OAIImagesResponse_data_inner.h
  OAIListFilesResponse.h
  OAIListFineTuneEventsResponse.h
  OAIListFineTunesResponse.h
  OAIListModelsResponse.h
  OAIModel.h
  OAIOpenAIFile.h
  OAIOpenAIApi.h
  OAIHelpers.h
  OAIHttpRequest.h
  OAIObject.h
  OAIEnum.h
  OAIHttpFileElement.h
  OAIServerConfiguration.h
  OAIServerVariable.h
  OAIOauth.h
  OAIChatCompletionFunctions.cpp
  OAIChatCompletionRequestMessage.cpp
  OAIChatCompletionRequestMessage_function_call.cpp
  OAIChatCompletionResponseMessage.cpp
  OAIChatCompletionStreamResponseDelta.cpp
  OAICreateChatCompletionRequest.cpp
  OAICreateChatCompletionRequest_function_call.cpp
  OAICreateChatCompletionRequest_function_call_oneOf.cpp
  OAICreateChatCompletionRequest_model.cpp
  OAICreateChatCompletionRequest_stop.cpp
  OAICreateChatCompletionResponse.cpp
  OAICreateChatCompletionResponse_choices_inner.cpp
  OAICreateChatCompletionStreamResponse.cpp
  OAICreateChatCompletionStreamResponse_choices_inner.cpp
  OAICreateCompletionRequest.cpp
  OAICreateCompletionRequest_model.cpp
  OAICreateCompletionRequest_prompt.cpp
  OAICreateCompletionRequest_stop.cpp
  OAICreateCompletionResponse.cpp
  OAICreateCompletionResponse_choices_inner.cpp
  OAICreateCompletionResponse_choices_inner_logprobs.cpp
  OAICreateCompletionResponse_usage.cpp
  OAICreateEditRequest.cpp
  OAICreateEditRequest_model.cpp
  OAICreateEditResponse.cpp
  OAICreateEditResponse_choices_inner.cpp
  OAICreateEmbeddingRequest.cpp
  OAICreateEmbeddingRequest_input.cpp
  OAICreateEmbeddingRequest_model.cpp
  OAICreateEmbeddingResponse.cpp
  OAICreateEmbeddingResponse_data_inner.cpp
  OAICreateEmbeddingResponse_usage.cpp
  OAICreateFineTuneRequest.cpp
  OAICreateFineTuneRequest_model.cpp
  OAICreateImageRequest.cpp
  OAICreateModerationRequest.cpp
  OAICreateModerationRequest_input.cpp
  OAICreateModerationRequest_model.cpp
  OAICreateModerationResponse.cpp
  OAICreateModerationResponse_results_inner.cpp
  OAICreateModerationResponse_results_inner_categories.cpp
  OAICreateModerationResponse_results_inner_category_scores.cpp
  OAICreateTranscriptionRequest_model.cpp
  OAICreateTranscriptionResponse.cpp
  OAICreateTranslationResponse.cpp
  OAIDeleteFileResponse.cpp
  OAIDeleteModelResponse.cpp
  OAIError.cpp
  OAIErrorResponse.cpp
  OAIFineTune.cpp
  OAIFineTuneEvent.cpp
  OAIImagesResponse.cpp
  OAIImagesResponse_data_inner.cpp
  OAIListFilesResponse.cpp
  OAIListFineTuneEventsResponse.cpp
  OAIListFineTunesResponse.cpp
  OAIListModelsResponse.cpp
  OAIModel.cpp
  OAIOpenAIFile.cpp
  OAIOpenAIApi.cpp
  OAIHelpers.cpp
  OAIHttpRequest.cpp
  OAIHttpFileElement.cpp
  OAIOauth.cpp
  )

target_include_directories(${PROJECT_NAME}
    PUBLIC
        $<BUILD_INTERFACE:${CMAKE_CURRENT_SOURCE_DIR}>
        $<INSTALL_INTERFACE:${CMAKE_INSTALL_INCLUDEDIR}>
)

target_link_libraries(${PROJECT_NAME}
    PUBLIC
        Qt${QT_VERSION_MAJOR}::Core
        Qt${QT_VERSION_MAJOR}::Network
        Qt${QT_VERSION_MAJOR}::Gui

)

configure_package_config_file(${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in
    "${CMAKE_CURRENT_BINARY_DIR}/${PROJECT_NAME}Config.cmake"
    INSTALL_DESTINATION "${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}"
)

install(
    TARGETS ${PROJECT_NAME}
    EXPORT ${PROJECT_NAME}Targets
    LIBRARY DESTINATION "${CMAKE_INSTALL_LIBDIR}"
    ARCHIVE DESTINATION "${CMAKE_INSTALL_LIBDIR}"
    RUNTIME DESTINATION "${CMAKE_INSTALL_BINDIR}"
    INCLUDES DESTINATION "${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}"
)

install(
    FILES ${HEADER_FILES}
    DESTINATION ${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}
)

install(
    FILES "${CMAKE_CURRENT_BINARY_DIR}/${PROJECT_NAME}Config.cmake"
    DESTINATION ${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}
)

install(
    EXPORT ${PROJECT_NAME}Targets
    DESTINATION ${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}
)
