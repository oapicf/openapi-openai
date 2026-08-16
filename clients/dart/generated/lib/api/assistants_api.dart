//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AssistantsApi {
  AssistantsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Cancels a run that is `in_progress`.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to which this run belongs.
  ///
  /// * [String] runId (required):
  ///   The ID of the run to cancel.
  Future<Response> cancelRunWithHttpInfo(String threadId, String runId,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/runs/{run_id}/cancel'
      .replaceAll('{thread_id}', threadId)
      .replaceAll('{run_id}', runId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Cancels a run that is `in_progress`.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to which this run belongs.
  ///
  /// * [String] runId (required):
  ///   The ID of the run to cancel.
  Future<RunObject?> cancelRun(String threadId, String runId,) async {
    final response = await cancelRunWithHttpInfo(threadId, runId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'RunObject',) as RunObject;
    
    }
    return null;
  }

  /// Create an assistant with a model and instructions.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [CreateAssistantRequest] createAssistantRequest (required):
  Future<Response> createAssistantWithHttpInfo(CreateAssistantRequest createAssistantRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/assistants';

    // ignore: prefer_final_locals
    Object? postBody = createAssistantRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Create an assistant with a model and instructions.
  ///
  /// Parameters:
  ///
  /// * [CreateAssistantRequest] createAssistantRequest (required):
  Future<AssistantObject?> createAssistant(CreateAssistantRequest createAssistantRequest,) async {
    final response = await createAssistantWithHttpInfo(createAssistantRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AssistantObject',) as AssistantObject;
    
    }
    return null;
  }

  /// Create a message.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) to create a message for.
  ///
  /// * [CreateMessageRequest] createMessageRequest (required):
  Future<Response> createMessageWithHttpInfo(String threadId, CreateMessageRequest createMessageRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/messages'
      .replaceAll('{thread_id}', threadId);

    // ignore: prefer_final_locals
    Object? postBody = createMessageRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Create a message.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) to create a message for.
  ///
  /// * [CreateMessageRequest] createMessageRequest (required):
  Future<MessageObject?> createMessage(String threadId, CreateMessageRequest createMessageRequest,) async {
    final response = await createMessageWithHttpInfo(threadId, createMessageRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MessageObject',) as MessageObject;
    
    }
    return null;
  }

  /// Create a run.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to run.
  ///
  /// * [CreateRunRequest] createRunRequest (required):
  ///
  /// * [List<String>] includeLeftSquareBracketRightSquareBracket:
  ///   A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  Future<Response> createRunWithHttpInfo(String threadId, CreateRunRequest createRunRequest, { List<String>? includeLeftSquareBracketRightSquareBracket, }) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/runs'
      .replaceAll('{thread_id}', threadId);

    // ignore: prefer_final_locals
    Object? postBody = createRunRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (includeLeftSquareBracketRightSquareBracket != null) {
      queryParams.addAll(_queryParams('multi', 'include[]', includeLeftSquareBracketRightSquareBracket));
    }

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Create a run.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to run.
  ///
  /// * [CreateRunRequest] createRunRequest (required):
  ///
  /// * [List<String>] includeLeftSquareBracketRightSquareBracket:
  ///   A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  Future<RunObject?> createRun(String threadId, CreateRunRequest createRunRequest, { List<String>? includeLeftSquareBracketRightSquareBracket, }) async {
    final response = await createRunWithHttpInfo(threadId, createRunRequest,  includeLeftSquareBracketRightSquareBracket: includeLeftSquareBracketRightSquareBracket, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'RunObject',) as RunObject;
    
    }
    return null;
  }

  /// Create a thread.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [CreateThreadRequest] createThreadRequest:
  Future<Response> createThreadWithHttpInfo({ CreateThreadRequest? createThreadRequest, }) async {
    // ignore: prefer_const_declarations
    final path = r'/threads';

    // ignore: prefer_final_locals
    Object? postBody = createThreadRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Create a thread.
  ///
  /// Parameters:
  ///
  /// * [CreateThreadRequest] createThreadRequest:
  Future<ThreadObject?> createThread({ CreateThreadRequest? createThreadRequest, }) async {
    final response = await createThreadWithHttpInfo( createThreadRequest: createThreadRequest, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ThreadObject',) as ThreadObject;
    
    }
    return null;
  }

  /// Create a thread and run it in one request.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [CreateThreadAndRunRequest] createThreadAndRunRequest (required):
  Future<Response> createThreadAndRunWithHttpInfo(CreateThreadAndRunRequest createThreadAndRunRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/runs';

    // ignore: prefer_final_locals
    Object? postBody = createThreadAndRunRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Create a thread and run it in one request.
  ///
  /// Parameters:
  ///
  /// * [CreateThreadAndRunRequest] createThreadAndRunRequest (required):
  Future<RunObject?> createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest,) async {
    final response = await createThreadAndRunWithHttpInfo(createThreadAndRunRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'RunObject',) as RunObject;
    
    }
    return null;
  }

  /// Delete an assistant.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] assistantId (required):
  ///   The ID of the assistant to delete.
  Future<Response> deleteAssistantWithHttpInfo(String assistantId,) async {
    // ignore: prefer_const_declarations
    final path = r'/assistants/{assistant_id}'
      .replaceAll('{assistant_id}', assistantId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Delete an assistant.
  ///
  /// Parameters:
  ///
  /// * [String] assistantId (required):
  ///   The ID of the assistant to delete.
  Future<DeleteAssistantResponse?> deleteAssistant(String assistantId,) async {
    final response = await deleteAssistantWithHttpInfo(assistantId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeleteAssistantResponse',) as DeleteAssistantResponse;
    
    }
    return null;
  }

  /// Deletes a message.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to which this message belongs.
  ///
  /// * [String] messageId (required):
  ///   The ID of the message to delete.
  Future<Response> deleteMessageWithHttpInfo(String threadId, String messageId,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/messages/{message_id}'
      .replaceAll('{thread_id}', threadId)
      .replaceAll('{message_id}', messageId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Deletes a message.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to which this message belongs.
  ///
  /// * [String] messageId (required):
  ///   The ID of the message to delete.
  Future<DeleteMessageResponse?> deleteMessage(String threadId, String messageId,) async {
    final response = await deleteMessageWithHttpInfo(threadId, messageId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeleteMessageResponse',) as DeleteMessageResponse;
    
    }
    return null;
  }

  /// Delete a thread.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to delete.
  Future<Response> deleteThreadWithHttpInfo(String threadId,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}'
      .replaceAll('{thread_id}', threadId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Delete a thread.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to delete.
  Future<DeleteThreadResponse?> deleteThread(String threadId,) async {
    final response = await deleteThreadWithHttpInfo(threadId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeleteThreadResponse',) as DeleteThreadResponse;
    
    }
    return null;
  }

  /// Retrieves an assistant.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] assistantId (required):
  ///   The ID of the assistant to retrieve.
  Future<Response> getAssistantWithHttpInfo(String assistantId,) async {
    // ignore: prefer_const_declarations
    final path = r'/assistants/{assistant_id}'
      .replaceAll('{assistant_id}', assistantId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Retrieves an assistant.
  ///
  /// Parameters:
  ///
  /// * [String] assistantId (required):
  ///   The ID of the assistant to retrieve.
  Future<AssistantObject?> getAssistant(String assistantId,) async {
    final response = await getAssistantWithHttpInfo(assistantId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AssistantObject',) as AssistantObject;
    
    }
    return null;
  }

  /// Retrieve a message.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
  ///
  /// * [String] messageId (required):
  ///   The ID of the message to retrieve.
  Future<Response> getMessageWithHttpInfo(String threadId, String messageId,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/messages/{message_id}'
      .replaceAll('{thread_id}', threadId)
      .replaceAll('{message_id}', messageId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Retrieve a message.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
  ///
  /// * [String] messageId (required):
  ///   The ID of the message to retrieve.
  Future<MessageObject?> getMessage(String threadId, String messageId,) async {
    final response = await getMessageWithHttpInfo(threadId, messageId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MessageObject',) as MessageObject;
    
    }
    return null;
  }

  /// Retrieves a run.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) that was run.
  ///
  /// * [String] runId (required):
  ///   The ID of the run to retrieve.
  Future<Response> getRunWithHttpInfo(String threadId, String runId,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/runs/{run_id}'
      .replaceAll('{thread_id}', threadId)
      .replaceAll('{run_id}', runId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Retrieves a run.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) that was run.
  ///
  /// * [String] runId (required):
  ///   The ID of the run to retrieve.
  Future<RunObject?> getRun(String threadId, String runId,) async {
    final response = await getRunWithHttpInfo(threadId, runId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'RunObject',) as RunObject;
    
    }
    return null;
  }

  /// Retrieves a run step.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to which the run and run step belongs.
  ///
  /// * [String] runId (required):
  ///   The ID of the run to which the run step belongs.
  ///
  /// * [String] stepId (required):
  ///   The ID of the run step to retrieve.
  ///
  /// * [List<String>] includeLeftSquareBracketRightSquareBracket:
  ///   A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  Future<Response> getRunStepWithHttpInfo(String threadId, String runId, String stepId, { List<String>? includeLeftSquareBracketRightSquareBracket, }) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/runs/{run_id}/steps/{step_id}'
      .replaceAll('{thread_id}', threadId)
      .replaceAll('{run_id}', runId)
      .replaceAll('{step_id}', stepId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (includeLeftSquareBracketRightSquareBracket != null) {
      queryParams.addAll(_queryParams('multi', 'include[]', includeLeftSquareBracketRightSquareBracket));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Retrieves a run step.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to which the run and run step belongs.
  ///
  /// * [String] runId (required):
  ///   The ID of the run to which the run step belongs.
  ///
  /// * [String] stepId (required):
  ///   The ID of the run step to retrieve.
  ///
  /// * [List<String>] includeLeftSquareBracketRightSquareBracket:
  ///   A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  Future<RunStepObject?> getRunStep(String threadId, String runId, String stepId, { List<String>? includeLeftSquareBracketRightSquareBracket, }) async {
    final response = await getRunStepWithHttpInfo(threadId, runId, stepId,  includeLeftSquareBracketRightSquareBracket: includeLeftSquareBracketRightSquareBracket, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'RunStepObject',) as RunStepObject;
    
    }
    return null;
  }

  /// Retrieves a thread.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to retrieve.
  Future<Response> getThreadWithHttpInfo(String threadId,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}'
      .replaceAll('{thread_id}', threadId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Retrieves a thread.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to retrieve.
  Future<ThreadObject?> getThread(String threadId,) async {
    final response = await getThreadWithHttpInfo(threadId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ThreadObject',) as ThreadObject;
    
    }
    return null;
  }

  /// Returns a list of assistants.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  Future<Response> listAssistantsWithHttpInfo({ int? limit, String? order, String? after, String? before, }) async {
    // ignore: prefer_const_declarations
    final path = r'/assistants';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (before != null) {
      queryParams.addAll(_queryParams('', 'before', before));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Returns a list of assistants.
  ///
  /// Parameters:
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  Future<ListAssistantsResponse?> listAssistants({ int? limit, String? order, String? after, String? before, }) async {
    final response = await listAssistantsWithHttpInfo( limit: limit, order: order, after: after, before: before, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListAssistantsResponse',) as ListAssistantsResponse;
    
    }
    return null;
  }

  /// Returns a list of messages for a given thread.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) the messages belong to.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  ///
  /// * [String] runId:
  ///   Filter messages by the run ID that generated them. 
  Future<Response> listMessagesWithHttpInfo(String threadId, { int? limit, String? order, String? after, String? before, String? runId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/messages'
      .replaceAll('{thread_id}', threadId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (before != null) {
      queryParams.addAll(_queryParams('', 'before', before));
    }
    if (runId != null) {
      queryParams.addAll(_queryParams('', 'run_id', runId));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Returns a list of messages for a given thread.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) the messages belong to.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  ///
  /// * [String] runId:
  ///   Filter messages by the run ID that generated them. 
  Future<ListMessagesResponse?> listMessages(String threadId, { int? limit, String? order, String? after, String? before, String? runId, }) async {
    final response = await listMessagesWithHttpInfo(threadId,  limit: limit, order: order, after: after, before: before, runId: runId, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListMessagesResponse',) as ListMessagesResponse;
    
    }
    return null;
  }

  /// Returns a list of run steps belonging to a run.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread the run and run steps belong to.
  ///
  /// * [String] runId (required):
  ///   The ID of the run the run steps belong to.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  ///
  /// * [List<String>] includeLeftSquareBracketRightSquareBracket:
  ///   A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  Future<Response> listRunStepsWithHttpInfo(String threadId, String runId, { int? limit, String? order, String? after, String? before, List<String>? includeLeftSquareBracketRightSquareBracket, }) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/runs/{run_id}/steps'
      .replaceAll('{thread_id}', threadId)
      .replaceAll('{run_id}', runId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (before != null) {
      queryParams.addAll(_queryParams('', 'before', before));
    }
    if (includeLeftSquareBracketRightSquareBracket != null) {
      queryParams.addAll(_queryParams('multi', 'include[]', includeLeftSquareBracketRightSquareBracket));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Returns a list of run steps belonging to a run.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread the run and run steps belong to.
  ///
  /// * [String] runId (required):
  ///   The ID of the run the run steps belong to.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  ///
  /// * [List<String>] includeLeftSquareBracketRightSquareBracket:
  ///   A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  Future<ListRunStepsResponse?> listRunSteps(String threadId, String runId, { int? limit, String? order, String? after, String? before, List<String>? includeLeftSquareBracketRightSquareBracket, }) async {
    final response = await listRunStepsWithHttpInfo(threadId, runId,  limit: limit, order: order, after: after, before: before, includeLeftSquareBracketRightSquareBracket: includeLeftSquareBracketRightSquareBracket, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListRunStepsResponse',) as ListRunStepsResponse;
    
    }
    return null;
  }

  /// Returns a list of runs belonging to a thread.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread the run belongs to.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  Future<Response> listRunsWithHttpInfo(String threadId, { int? limit, String? order, String? after, String? before, }) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/runs'
      .replaceAll('{thread_id}', threadId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (after != null) {
      queryParams.addAll(_queryParams('', 'after', after));
    }
    if (before != null) {
      queryParams.addAll(_queryParams('', 'before', before));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Returns a list of runs belonging to a thread.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread the run belongs to.
  ///
  /// * [int] limit:
  ///   A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
  ///
  /// * [String] order:
  ///   Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
  ///
  /// * [String] after:
  ///   A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  ///
  /// * [String] before:
  ///   A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
  Future<ListRunsResponse?> listRuns(String threadId, { int? limit, String? order, String? after, String? before, }) async {
    final response = await listRunsWithHttpInfo(threadId,  limit: limit, order: order, after: after, before: before, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ListRunsResponse',) as ListRunsResponse;
    
    }
    return null;
  }

  /// Modifies an assistant.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] assistantId (required):
  ///   The ID of the assistant to modify.
  ///
  /// * [ModifyAssistantRequest] modifyAssistantRequest (required):
  Future<Response> modifyAssistantWithHttpInfo(String assistantId, ModifyAssistantRequest modifyAssistantRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/assistants/{assistant_id}'
      .replaceAll('{assistant_id}', assistantId);

    // ignore: prefer_final_locals
    Object? postBody = modifyAssistantRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Modifies an assistant.
  ///
  /// Parameters:
  ///
  /// * [String] assistantId (required):
  ///   The ID of the assistant to modify.
  ///
  /// * [ModifyAssistantRequest] modifyAssistantRequest (required):
  Future<AssistantObject?> modifyAssistant(String assistantId, ModifyAssistantRequest modifyAssistantRequest,) async {
    final response = await modifyAssistantWithHttpInfo(assistantId, modifyAssistantRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AssistantObject',) as AssistantObject;
    
    }
    return null;
  }

  /// Modifies a message.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to which this message belongs.
  ///
  /// * [String] messageId (required):
  ///   The ID of the message to modify.
  ///
  /// * [ModifyMessageRequest] modifyMessageRequest (required):
  Future<Response> modifyMessageWithHttpInfo(String threadId, String messageId, ModifyMessageRequest modifyMessageRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/messages/{message_id}'
      .replaceAll('{thread_id}', threadId)
      .replaceAll('{message_id}', messageId);

    // ignore: prefer_final_locals
    Object? postBody = modifyMessageRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Modifies a message.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to which this message belongs.
  ///
  /// * [String] messageId (required):
  ///   The ID of the message to modify.
  ///
  /// * [ModifyMessageRequest] modifyMessageRequest (required):
  Future<MessageObject?> modifyMessage(String threadId, String messageId, ModifyMessageRequest modifyMessageRequest,) async {
    final response = await modifyMessageWithHttpInfo(threadId, messageId, modifyMessageRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MessageObject',) as MessageObject;
    
    }
    return null;
  }

  /// Modifies a run.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) that was run.
  ///
  /// * [String] runId (required):
  ///   The ID of the run to modify.
  ///
  /// * [ModifyRunRequest] modifyRunRequest (required):
  Future<Response> modifyRunWithHttpInfo(String threadId, String runId, ModifyRunRequest modifyRunRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/runs/{run_id}'
      .replaceAll('{thread_id}', threadId)
      .replaceAll('{run_id}', runId);

    // ignore: prefer_final_locals
    Object? postBody = modifyRunRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Modifies a run.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) that was run.
  ///
  /// * [String] runId (required):
  ///   The ID of the run to modify.
  ///
  /// * [ModifyRunRequest] modifyRunRequest (required):
  Future<RunObject?> modifyRun(String threadId, String runId, ModifyRunRequest modifyRunRequest,) async {
    final response = await modifyRunWithHttpInfo(threadId, runId, modifyRunRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'RunObject',) as RunObject;
    
    }
    return null;
  }

  /// Modifies a thread.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to modify. Only the `metadata` can be modified.
  ///
  /// * [ModifyThreadRequest] modifyThreadRequest (required):
  Future<Response> modifyThreadWithHttpInfo(String threadId, ModifyThreadRequest modifyThreadRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}'
      .replaceAll('{thread_id}', threadId);

    // ignore: prefer_final_locals
    Object? postBody = modifyThreadRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Modifies a thread.
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the thread to modify. Only the `metadata` can be modified.
  ///
  /// * [ModifyThreadRequest] modifyThreadRequest (required):
  Future<ThreadObject?> modifyThread(String threadId, ModifyThreadRequest modifyThreadRequest,) async {
    final response = await modifyThreadWithHttpInfo(threadId, modifyThreadRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ThreadObject',) as ThreadObject;
    
    }
    return null;
  }

  /// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
  ///
  /// * [String] runId (required):
  ///   The ID of the run that requires the tool output submission.
  ///
  /// * [SubmitToolOutputsRunRequest] submitToolOutputsRunRequest (required):
  Future<Response> submitToolOuputsToRunWithHttpInfo(String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/threads/{thread_id}/runs/{run_id}/submit_tool_outputs'
      .replaceAll('{thread_id}', threadId)
      .replaceAll('{run_id}', runId);

    // ignore: prefer_final_locals
    Object? postBody = submitToolOutputsRunRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
  ///
  /// Parameters:
  ///
  /// * [String] threadId (required):
  ///   The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
  ///
  /// * [String] runId (required):
  ///   The ID of the run that requires the tool output submission.
  ///
  /// * [SubmitToolOutputsRunRequest] submitToolOutputsRunRequest (required):
  Future<RunObject?> submitToolOuputsToRun(String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest,) async {
    final response = await submitToolOuputsToRunWithHttpInfo(threadId, runId, submitToolOutputsRunRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'RunObject',) as RunObject;
    
    }
    return null;
  }
}
