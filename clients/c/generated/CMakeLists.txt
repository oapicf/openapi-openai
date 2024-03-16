cmake_minimum_required (VERSION 2.6...3.10.2)
project (CGenerator)

cmake_policy(SET CMP0063 NEW)

set(CMAKE_C_VISIBILITY_PRESET default)
set(CMAKE_CXX_VISIBILITY_PRESET default)
set(CMAKE_VISIBILITY_INLINES_HIDDEN OFF)
set(CMAKE_WINDOWS_EXPORT_ALL_SYMBOLS ON)

option(BUILD_SHARED_LIBS "Build using shared libraries" ON)

find_package(OpenSSL)

if (OPENSSL_FOUND)
    message (STATUS "OPENSSL found")

    set(CMAKE_C_FLAGS "-DOPENSSL")
    if(CMAKE_VERSION VERSION_LESS 3.4)
        include_directories(${OPENSSL_INCLUDE_DIR})
        include_directories(${OPENSSL_INCLUDE_DIRS})
        link_directories(${OPENSSL_LIBRARIES})
    endif()

    message(STATUS "Using OpenSSL ${OPENSSL_VERSION}")
else()
    message (STATUS "OpenSSL Not found.")
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
    else(CURL_FOUND)
        message(FATAL_ERROR "Could not find the CURL library and development files.")
    endif()
endif()

set(SRCS
    src/list.c
    src/apiKey.c
    src/apiClient.c
    src/binary.c
    external/cJSON.c
    model/object.c
    model/chat_completion_functions.c
    model/chat_completion_request_message.c
    model/chat_completion_request_message_function_call.c
    model/chat_completion_response_message.c
    model/chat_completion_stream_response_delta.c
    model/create_chat_completion_request.c
    model/create_chat_completion_request_function_call.c
    model/create_chat_completion_request_function_call_one_of.c
    model/create_chat_completion_request_model.c
    model/create_chat_completion_request_stop.c
    model/create_chat_completion_response.c
    model/create_chat_completion_response_choices_inner.c
    model/create_chat_completion_stream_response.c
    model/create_chat_completion_stream_response_choices_inner.c
    model/create_completion_request.c
    model/create_completion_request_model.c
    model/create_completion_request_prompt.c
    model/create_completion_request_stop.c
    model/create_completion_response.c
    model/create_completion_response_choices_inner.c
    model/create_completion_response_choices_inner_logprobs.c
    model/create_completion_response_usage.c
    model/create_edit_request.c
    model/create_edit_request_model.c
    model/create_edit_response.c
    model/create_edit_response_choices_inner.c
    model/create_embedding_request.c
    model/create_embedding_request_input.c
    model/create_embedding_request_model.c
    model/create_embedding_response.c
    model/create_embedding_response_data_inner.c
    model/create_embedding_response_usage.c
    model/create_fine_tune_request.c
    model/create_fine_tune_request_model.c
    model/create_image_request.c
    model/create_moderation_request.c
    model/create_moderation_request_input.c
    model/create_moderation_request_model.c
    model/create_moderation_response.c
    model/create_moderation_response_results_inner.c
    model/create_moderation_response_results_inner_categories.c
    model/create_moderation_response_results_inner_category_scores.c
    model/create_transcription_request_model.c
    model/create_transcription_response.c
    model/create_translation_response.c
    model/delete_file_response.c
    model/delete_model_response.c
    model/error.c
    model/error_response.c
    model/fine_tune.c
    model/fine_tune_event.c
    model/images_response.c
    model/images_response_data_inner.c
    model/list_files_response.c
    model/list_fine_tune_events_response.c
    model/list_fine_tunes_response.c
    model/list_models_response.c
    model/model.c
    model/open_ai_file.c
    api/OpenAIAPI.c

)

set(HDRS
    include/apiClient.h
    include/list.h
    include/binary.h
    include/keyValuePair.h
    external/cJSON.h
    model/object.h
    model/chat_completion_functions.h
    model/chat_completion_request_message.h
    model/chat_completion_request_message_function_call.h
    model/chat_completion_response_message.h
    model/chat_completion_stream_response_delta.h
    model/create_chat_completion_request.h
    model/create_chat_completion_request_function_call.h
    model/create_chat_completion_request_function_call_one_of.h
    model/create_chat_completion_request_model.h
    model/create_chat_completion_request_stop.h
    model/create_chat_completion_response.h
    model/create_chat_completion_response_choices_inner.h
    model/create_chat_completion_stream_response.h
    model/create_chat_completion_stream_response_choices_inner.h
    model/create_completion_request.h
    model/create_completion_request_model.h
    model/create_completion_request_prompt.h
    model/create_completion_request_stop.h
    model/create_completion_response.h
    model/create_completion_response_choices_inner.h
    model/create_completion_response_choices_inner_logprobs.h
    model/create_completion_response_usage.h
    model/create_edit_request.h
    model/create_edit_request_model.h
    model/create_edit_response.h
    model/create_edit_response_choices_inner.h
    model/create_embedding_request.h
    model/create_embedding_request_input.h
    model/create_embedding_request_model.h
    model/create_embedding_response.h
    model/create_embedding_response_data_inner.h
    model/create_embedding_response_usage.h
    model/create_fine_tune_request.h
    model/create_fine_tune_request_model.h
    model/create_image_request.h
    model/create_moderation_request.h
    model/create_moderation_request_input.h
    model/create_moderation_request_model.h
    model/create_moderation_response.h
    model/create_moderation_response_results_inner.h
    model/create_moderation_response_results_inner_categories.h
    model/create_moderation_response_results_inner_category_scores.h
    model/create_transcription_request_model.h
    model/create_transcription_response.h
    model/create_translation_response.h
    model/delete_file_response.h
    model/delete_model_response.h
    model/error.h
    model/error_response.h
    model/fine_tune.h
    model/fine_tune_event.h
    model/images_response.h
    model/images_response_data_inner.h
    model/list_files_response.h
    model/list_fine_tune_events_response.h
    model/list_fine_tunes_response.h
    model/list_models_response.h
    model/model.h
    model/open_ai_file.h
    api/OpenAIAPI.h

)

include(PreTarget.cmake OPTIONAL)

set(PROJECT_VERSION_STRING "${PROJECT_VERSION_MAJOR}.${PROJECT_VERSION_MINOR}.${PROJECT_VERSION_PATCH}")

# Add library with project file with project name as library name
add_library(${pkgName} ${SRCS} ${HDRS})
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
#    unit-tests/manual-OpenAIAPI.c
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
