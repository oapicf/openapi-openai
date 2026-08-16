//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ApiClient {
  ApiClient({this.basePath = 'https://api.openai.com/v1', this.authentication,});

  final String basePath;
  final Authentication? authentication;

  var _client = Client();
  final _defaultHeaderMap = <String, String>{};

  /// Returns the current HTTP [Client] instance to use in this class.
  ///
  /// The return value is guaranteed to never be null.
  Client get client => _client;

  /// Requests to use a new HTTP [Client] in this class.
  set client(Client newClient) {
    _client = newClient;
  }

  Map<String, String> get defaultHeaderMap => _defaultHeaderMap;

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  // We don't use a Map<String, String> for queryParams.
  // If collectionFormat is 'multi', a key might appear multiple times.
  Future<Response> invokeAPI(
    String path,
    String method,
    List<QueryParam> queryParams,
    Object? body,
    Map<String, String> headerParams,
    Map<String, String> formParams,
    String? contentType,
  ) async {
    await authentication?.applyToParams(queryParams, headerParams);

    headerParams.addAll(_defaultHeaderMap);
    if (contentType != null) {
      headerParams['Content-Type'] = contentType;
    }

    final urlEncodedQueryParams = queryParams.map((param) => '$param');
    final queryString = urlEncodedQueryParams.isNotEmpty ? '?${urlEncodedQueryParams.join('&')}' : '';
    final uri = Uri.parse('$basePath$path$queryString');

    try {
      // Special case for uploading a single file which isn't a 'multipart/form-data'.
      if (
        body is MultipartFile && (contentType == null ||
        !contentType.toLowerCase().startsWith('multipart/form-data'))
      ) {
        final request = StreamedRequest(method, uri);
        request.headers.addAll(headerParams);
        request.contentLength = body.length;
        body.finalize().listen(
          request.sink.add,
          onDone: request.sink.close,
          // ignore: avoid_types_on_closure_parameters
          onError: (Object error, StackTrace trace) => request.sink.close(),
          cancelOnError: true,
        );
        final response = await _client.send(request);
        return Response.fromStream(response);
      }

      if (body is MultipartRequest) {
        final request = MultipartRequest(method, uri);
        request.fields.addAll(body.fields);
        request.files.addAll(body.files);
        request.headers.addAll(body.headers);
        request.headers.addAll(headerParams);
        final response = await _client.send(request);
        return Response.fromStream(response);
      }

      final msgBody = contentType == 'application/x-www-form-urlencoded'
        ? formParams
        : await serializeAsync(body);
      final nullableHeaderParams = headerParams.isEmpty ? null : headerParams;

      switch(method) {
        case 'POST': return await _client.post(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'PUT': return await _client.put(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'DELETE': return await _client.delete(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'PATCH': return await _client.patch(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'HEAD': return await _client.head(uri, headers: nullableHeaderParams,);
        case 'GET': return await _client.get(uri, headers: nullableHeaderParams,);
      }
    } on SocketException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'Socket operation failed: $method $path',
        error,
        trace,
      );
    } on TlsException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'TLS/SSL communication failed: $method $path',
        error,
        trace,
      );
    } on IOException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'I/O operation failed: $method $path',
        error,
        trace,
      );
    } on ClientException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'HTTP connection failed: $method $path',
        error,
        trace,
      );
    } on Exception catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'Exception occurred: $method $path',
        error,
        trace,
      );
    }

    throw ApiException(
      HttpStatus.badRequest,
      'Invalid HTTP operation: $method $path',
    );
  }

  Future<dynamic> deserializeAsync(String value, String targetType, {bool growable = false,}) async =>
    // ignore: deprecated_member_use_from_same_package
    deserialize(value, targetType, growable: growable);

  @Deprecated('Scheduled for removal in OpenAPI Generator 6.x. Use deserializeAsync() instead.')
  dynamic deserialize(String value, String targetType, {bool growable = false,}) {
    // Remove all spaces. Necessary for regular expressions as well.
    targetType = targetType.replaceAll(' ', ''); // ignore: parameter_assignments

    // If the expected target type is String, nothing to do...
    return targetType == 'String'
      ? value
      : fromJson(json.decode(value), targetType, growable: growable);
  }

  // ignore: deprecated_member_use_from_same_package
  Future<String> serializeAsync(Object? value) async => serialize(value);

  @Deprecated('Scheduled for removal in OpenAPI Generator 6.x. Use serializeAsync() instead.')
  String serialize(Object? value) => value == null ? '' : json.encode(value);

  /// Returns a native instance of an OpenAPI class matching the [specified type][targetType].
  static dynamic fromJson(dynamic value, String targetType, {bool growable = false,}) {
    try {
      switch (targetType) {
        case 'String':
          return value is String ? value : value.toString();
        case 'int':
          return value is int ? value : int.parse('$value');
        case 'double':
          return value is double ? value : double.parse('$value');
        case 'bool':
          if (value is bool) {
            return value;
          }
          final valueString = '$value'.toLowerCase();
          return valueString == 'true' || valueString == '1';
        case 'DateTime':
          return value is DateTime ? value : DateTime.tryParse(value);
        case 'AdminApiKey':
          return AdminApiKey.fromJson(value);
        case 'AdminApiKeyOwner':
          return AdminApiKeyOwner.fromJson(value);
        case 'AdminApiKeysCreateRequest':
          return AdminApiKeysCreateRequest.fromJson(value);
        case 'AdminApiKeysDelete200Response':
          return AdminApiKeysDelete200Response.fromJson(value);
        case 'ApiKeyList':
          return ApiKeyList.fromJson(value);
        case 'ArrayOfContentPartsInner':
          return ArrayOfContentPartsInner.fromJson(value);
        case 'AssistantObject':
          return AssistantObject.fromJson(value);
        case 'AssistantObjectToolResources':
          return AssistantObjectToolResources.fromJson(value);
        case 'AssistantObjectToolResourcesCodeInterpreter':
          return AssistantObjectToolResourcesCodeInterpreter.fromJson(value);
        case 'AssistantObjectToolResourcesFileSearch':
          return AssistantObjectToolResourcesFileSearch.fromJson(value);
        case 'AssistantObjectToolsInner':
          return AssistantObjectToolsInner.fromJson(value);
        case 'AssistantStreamEvent':
          return AssistantStreamEvent.fromJson(value);
        case 'AssistantToolsCode':
          return AssistantToolsCode.fromJson(value);
        case 'AssistantToolsFileSearch':
          return AssistantToolsFileSearch.fromJson(value);
        case 'AssistantToolsFileSearchFileSearch':
          return AssistantToolsFileSearchFileSearch.fromJson(value);
        case 'AssistantToolsFileSearchTypeOnly':
          return AssistantToolsFileSearchTypeOnly.fromJson(value);
        case 'AssistantToolsFunction':
          return AssistantToolsFunction.fromJson(value);
        case 'AssistantsApiResponseFormatOption':
          return AssistantsApiResponseFormatOption.fromJson(value);
        case 'AssistantsApiToolChoiceOption':
          return AssistantsApiToolChoiceOption.fromJson(value);
        case 'AssistantsNamedToolChoice':
          return AssistantsNamedToolChoice.fromJson(value);
        case 'AssistantsNamedToolChoiceFunction':
          return AssistantsNamedToolChoiceFunction.fromJson(value);
        case 'AudioResponseFormat':
          return AudioResponseFormatTypeTransformer().decode(value);
        case 'AuditLog':
          return AuditLog.fromJson(value);
        case 'AuditLogActor':
          return AuditLogActor.fromJson(value);
        case 'AuditLogActorApiKey':
          return AuditLogActorApiKey.fromJson(value);
        case 'AuditLogActorServiceAccount':
          return AuditLogActorServiceAccount.fromJson(value);
        case 'AuditLogActorSession':
          return AuditLogActorSession.fromJson(value);
        case 'AuditLogActorUser':
          return AuditLogActorUser.fromJson(value);
        case 'AuditLogApiKeyCreated':
          return AuditLogApiKeyCreated.fromJson(value);
        case 'AuditLogApiKeyCreatedData':
          return AuditLogApiKeyCreatedData.fromJson(value);
        case 'AuditLogApiKeyDeleted':
          return AuditLogApiKeyDeleted.fromJson(value);
        case 'AuditLogApiKeyUpdated':
          return AuditLogApiKeyUpdated.fromJson(value);
        case 'AuditLogApiKeyUpdatedChangesRequested':
          return AuditLogApiKeyUpdatedChangesRequested.fromJson(value);
        case 'AuditLogEventType':
          return AuditLogEventTypeTypeTransformer().decode(value);
        case 'AuditLogInviteAccepted':
          return AuditLogInviteAccepted.fromJson(value);
        case 'AuditLogInviteSent':
          return AuditLogInviteSent.fromJson(value);
        case 'AuditLogInviteSentData':
          return AuditLogInviteSentData.fromJson(value);
        case 'AuditLogLoginFailed':
          return AuditLogLoginFailed.fromJson(value);
        case 'AuditLogOrganizationUpdated':
          return AuditLogOrganizationUpdated.fromJson(value);
        case 'AuditLogOrganizationUpdatedChangesRequested':
          return AuditLogOrganizationUpdatedChangesRequested.fromJson(value);
        case 'AuditLogOrganizationUpdatedChangesRequestedSettings':
          return AuditLogOrganizationUpdatedChangesRequestedSettings.fromJson(value);
        case 'AuditLogProject':
          return AuditLogProject.fromJson(value);
        case 'AuditLogProjectArchived':
          return AuditLogProjectArchived.fromJson(value);
        case 'AuditLogProjectCreated':
          return AuditLogProjectCreated.fromJson(value);
        case 'AuditLogProjectCreatedData':
          return AuditLogProjectCreatedData.fromJson(value);
        case 'AuditLogProjectUpdated':
          return AuditLogProjectUpdated.fromJson(value);
        case 'AuditLogProjectUpdatedChangesRequested':
          return AuditLogProjectUpdatedChangesRequested.fromJson(value);
        case 'AuditLogRateLimitDeleted':
          return AuditLogRateLimitDeleted.fromJson(value);
        case 'AuditLogRateLimitUpdated':
          return AuditLogRateLimitUpdated.fromJson(value);
        case 'AuditLogRateLimitUpdatedChangesRequested':
          return AuditLogRateLimitUpdatedChangesRequested.fromJson(value);
        case 'AuditLogServiceAccountCreated':
          return AuditLogServiceAccountCreated.fromJson(value);
        case 'AuditLogServiceAccountCreatedData':
          return AuditLogServiceAccountCreatedData.fromJson(value);
        case 'AuditLogServiceAccountDeleted':
          return AuditLogServiceAccountDeleted.fromJson(value);
        case 'AuditLogServiceAccountUpdated':
          return AuditLogServiceAccountUpdated.fromJson(value);
        case 'AuditLogServiceAccountUpdatedChangesRequested':
          return AuditLogServiceAccountUpdatedChangesRequested.fromJson(value);
        case 'AuditLogUserAdded':
          return AuditLogUserAdded.fromJson(value);
        case 'AuditLogUserAddedData':
          return AuditLogUserAddedData.fromJson(value);
        case 'AuditLogUserDeleted':
          return AuditLogUserDeleted.fromJson(value);
        case 'AuditLogUserUpdated':
          return AuditLogUserUpdated.fromJson(value);
        case 'AuditLogUserUpdatedChangesRequested':
          return AuditLogUserUpdatedChangesRequested.fromJson(value);
        case 'AutoChunkingStrategy':
          return AutoChunkingStrategy.fromJson(value);
        case 'AutoChunkingStrategyRequestParam':
          return AutoChunkingStrategyRequestParam.fromJson(value);
        case 'Batch':
          return Batch.fromJson(value);
        case 'BatchErrors':
          return BatchErrors.fromJson(value);
        case 'BatchErrorsDataInner':
          return BatchErrorsDataInner.fromJson(value);
        case 'BatchRequestCounts':
          return BatchRequestCounts.fromJson(value);
        case 'BatchRequestInput':
          return BatchRequestInput.fromJson(value);
        case 'BatchRequestOutput':
          return BatchRequestOutput.fromJson(value);
        case 'BatchRequestOutputError':
          return BatchRequestOutputError.fromJson(value);
        case 'BatchRequestOutputResponse':
          return BatchRequestOutputResponse.fromJson(value);
        case 'ChatCompletionFunctionCallOption':
          return ChatCompletionFunctionCallOption.fromJson(value);
        case 'ChatCompletionFunctions':
          return ChatCompletionFunctions.fromJson(value);
        case 'ChatCompletionMessageToolCall':
          return ChatCompletionMessageToolCall.fromJson(value);
        case 'ChatCompletionMessageToolCallChunk':
          return ChatCompletionMessageToolCallChunk.fromJson(value);
        case 'ChatCompletionMessageToolCallChunkFunction':
          return ChatCompletionMessageToolCallChunkFunction.fromJson(value);
        case 'ChatCompletionMessageToolCallFunction':
          return ChatCompletionMessageToolCallFunction.fromJson(value);
        case 'ChatCompletionNamedToolChoice':
          return ChatCompletionNamedToolChoice.fromJson(value);
        case 'ChatCompletionRequestAssistantMessage':
          return ChatCompletionRequestAssistantMessage.fromJson(value);
        case 'ChatCompletionRequestAssistantMessageAudio':
          return ChatCompletionRequestAssistantMessageAudio.fromJson(value);
        case 'ChatCompletionRequestAssistantMessageContent':
          return ChatCompletionRequestAssistantMessageContent.fromJson(value);
        case 'ChatCompletionRequestAssistantMessageContentPart':
          return ChatCompletionRequestAssistantMessageContentPart.fromJson(value);
        case 'ChatCompletionRequestAssistantMessageFunctionCall':
          return ChatCompletionRequestAssistantMessageFunctionCall.fromJson(value);
        case 'ChatCompletionRequestDeveloperMessage':
          return ChatCompletionRequestDeveloperMessage.fromJson(value);
        case 'ChatCompletionRequestDeveloperMessageContent':
          return ChatCompletionRequestDeveloperMessageContent.fromJson(value);
        case 'ChatCompletionRequestFunctionMessage':
          return ChatCompletionRequestFunctionMessage.fromJson(value);
        case 'ChatCompletionRequestMessage':
          return ChatCompletionRequestMessage.fromJson(value);
        case 'ChatCompletionRequestMessageContentPartAudio':
          return ChatCompletionRequestMessageContentPartAudio.fromJson(value);
        case 'ChatCompletionRequestMessageContentPartAudioInputAudio':
          return ChatCompletionRequestMessageContentPartAudioInputAudio.fromJson(value);
        case 'ChatCompletionRequestMessageContentPartImage':
          return ChatCompletionRequestMessageContentPartImage.fromJson(value);
        case 'ChatCompletionRequestMessageContentPartImageImageUrl':
          return ChatCompletionRequestMessageContentPartImageImageUrl.fromJson(value);
        case 'ChatCompletionRequestMessageContentPartRefusal':
          return ChatCompletionRequestMessageContentPartRefusal.fromJson(value);
        case 'ChatCompletionRequestMessageContentPartText':
          return ChatCompletionRequestMessageContentPartText.fromJson(value);
        case 'ChatCompletionRequestSystemMessage':
          return ChatCompletionRequestSystemMessage.fromJson(value);
        case 'ChatCompletionRequestSystemMessageContent':
          return ChatCompletionRequestSystemMessageContent.fromJson(value);
        case 'ChatCompletionRequestToolMessage':
          return ChatCompletionRequestToolMessage.fromJson(value);
        case 'ChatCompletionRequestToolMessageContent':
          return ChatCompletionRequestToolMessageContent.fromJson(value);
        case 'ChatCompletionRequestUserMessage':
          return ChatCompletionRequestUserMessage.fromJson(value);
        case 'ChatCompletionRequestUserMessageContent':
          return ChatCompletionRequestUserMessageContent.fromJson(value);
        case 'ChatCompletionRequestUserMessageContentPart':
          return ChatCompletionRequestUserMessageContentPart.fromJson(value);
        case 'ChatCompletionResponseMessage':
          return ChatCompletionResponseMessage.fromJson(value);
        case 'ChatCompletionResponseMessageAudio':
          return ChatCompletionResponseMessageAudio.fromJson(value);
        case 'ChatCompletionResponseMessageFunctionCall':
          return ChatCompletionResponseMessageFunctionCall.fromJson(value);
        case 'ChatCompletionRole':
          return ChatCompletionRoleTypeTransformer().decode(value);
        case 'ChatCompletionStreamOptions':
          return ChatCompletionStreamOptions.fromJson(value);
        case 'ChatCompletionStreamResponseDelta':
          return ChatCompletionStreamResponseDelta.fromJson(value);
        case 'ChatCompletionStreamResponseDeltaFunctionCall':
          return ChatCompletionStreamResponseDeltaFunctionCall.fromJson(value);
        case 'ChatCompletionTokenLogprob':
          return ChatCompletionTokenLogprob.fromJson(value);
        case 'ChatCompletionTokenLogprobTopLogprobsInner':
          return ChatCompletionTokenLogprobTopLogprobsInner.fromJson(value);
        case 'ChatCompletionTool':
          return ChatCompletionTool.fromJson(value);
        case 'ChatCompletionToolChoiceOption':
          return ChatCompletionToolChoiceOption.fromJson(value);
        case 'ChunkingStrategyRequestParam':
          return ChunkingStrategyRequestParam.fromJson(value);
        case 'CompleteUploadRequest':
          return CompleteUploadRequest.fromJson(value);
        case 'CompletionUsage':
          return CompletionUsage.fromJson(value);
        case 'CompletionUsageCompletionTokensDetails':
          return CompletionUsageCompletionTokensDetails.fromJson(value);
        case 'CompletionUsagePromptTokensDetails':
          return CompletionUsagePromptTokensDetails.fromJson(value);
        case 'CostsResult':
          return CostsResult.fromJson(value);
        case 'CostsResultAmount':
          return CostsResultAmount.fromJson(value);
        case 'CreateAssistantRequest':
          return CreateAssistantRequest.fromJson(value);
        case 'CreateAssistantRequestModel':
          return CreateAssistantRequestModel.fromJson(value);
        case 'CreateAssistantRequestToolResources':
          return CreateAssistantRequestToolResources.fromJson(value);
        case 'CreateAssistantRequestToolResourcesCodeInterpreter':
          return CreateAssistantRequestToolResourcesCodeInterpreter.fromJson(value);
        case 'CreateAssistantRequestToolResourcesFileSearch':
          return CreateAssistantRequestToolResourcesFileSearch.fromJson(value);
        case 'CreateAssistantRequestToolResourcesFileSearchVectorStoresInner':
          return CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.fromJson(value);
        case 'CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy':
          return CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.fromJson(value);
        case 'CreateBatchRequest':
          return CreateBatchRequest.fromJson(value);
        case 'CreateChatCompletionFunctionResponse':
          return CreateChatCompletionFunctionResponse.fromJson(value);
        case 'CreateChatCompletionFunctionResponseChoicesInner':
          return CreateChatCompletionFunctionResponseChoicesInner.fromJson(value);
        case 'CreateChatCompletionRequest':
          return CreateChatCompletionRequest.fromJson(value);
        case 'CreateChatCompletionRequestAudio':
          return CreateChatCompletionRequestAudio.fromJson(value);
        case 'CreateChatCompletionRequestFunctionCall':
          return CreateChatCompletionRequestFunctionCall.fromJson(value);
        case 'CreateChatCompletionRequestModel':
          return CreateChatCompletionRequestModel.fromJson(value);
        case 'CreateChatCompletionRequestResponseFormat':
          return CreateChatCompletionRequestResponseFormat.fromJson(value);
        case 'CreateChatCompletionRequestStop':
          return CreateChatCompletionRequestStop.fromJson(value);
        case 'CreateChatCompletionResponse':
          return CreateChatCompletionResponse.fromJson(value);
        case 'CreateChatCompletionResponseChoicesInner':
          return CreateChatCompletionResponseChoicesInner.fromJson(value);
        case 'CreateChatCompletionResponseChoicesInnerLogprobs':
          return CreateChatCompletionResponseChoicesInnerLogprobs.fromJson(value);
        case 'CreateChatCompletionStreamResponse':
          return CreateChatCompletionStreamResponse.fromJson(value);
        case 'CreateChatCompletionStreamResponseChoicesInner':
          return CreateChatCompletionStreamResponseChoicesInner.fromJson(value);
        case 'CreateChatCompletionStreamResponseUsage':
          return CreateChatCompletionStreamResponseUsage.fromJson(value);
        case 'CreateCompletionRequest':
          return CreateCompletionRequest.fromJson(value);
        case 'CreateCompletionRequestModel':
          return CreateCompletionRequestModel.fromJson(value);
        case 'CreateCompletionRequestPrompt':
          return CreateCompletionRequestPrompt.fromJson(value);
        case 'CreateCompletionRequestStop':
          return CreateCompletionRequestStop.fromJson(value);
        case 'CreateCompletionResponse':
          return CreateCompletionResponse.fromJson(value);
        case 'CreateCompletionResponseChoicesInner':
          return CreateCompletionResponseChoicesInner.fromJson(value);
        case 'CreateCompletionResponseChoicesInnerLogprobs':
          return CreateCompletionResponseChoicesInnerLogprobs.fromJson(value);
        case 'CreateEmbeddingRequest':
          return CreateEmbeddingRequest.fromJson(value);
        case 'CreateEmbeddingRequestInput':
          return CreateEmbeddingRequestInput.fromJson(value);
        case 'CreateEmbeddingRequestModel':
          return CreateEmbeddingRequestModel.fromJson(value);
        case 'CreateEmbeddingResponse':
          return CreateEmbeddingResponse.fromJson(value);
        case 'CreateEmbeddingResponseUsage':
          return CreateEmbeddingResponseUsage.fromJson(value);
        case 'CreateFineTuningJobRequest':
          return CreateFineTuningJobRequest.fromJson(value);
        case 'CreateFineTuningJobRequestHyperparameters':
          return CreateFineTuningJobRequestHyperparameters.fromJson(value);
        case 'CreateFineTuningJobRequestHyperparametersBatchSize':
          return CreateFineTuningJobRequestHyperparametersBatchSize.fromJson(value);
        case 'CreateFineTuningJobRequestHyperparametersLearningRateMultiplier':
          return CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.fromJson(value);
        case 'CreateFineTuningJobRequestHyperparametersNEpochs':
          return CreateFineTuningJobRequestHyperparametersNEpochs.fromJson(value);
        case 'CreateFineTuningJobRequestIntegrationsInner':
          return CreateFineTuningJobRequestIntegrationsInner.fromJson(value);
        case 'CreateFineTuningJobRequestIntegrationsInnerWandb':
          return CreateFineTuningJobRequestIntegrationsInnerWandb.fromJson(value);
        case 'CreateFineTuningJobRequestModel':
          return CreateFineTuningJobRequestModel.fromJson(value);
        case 'CreateImageEditRequestModel':
          return CreateImageEditRequestModel.fromJson(value);
        case 'CreateImageRequest':
          return CreateImageRequest.fromJson(value);
        case 'CreateImageRequestModel':
          return CreateImageRequestModel.fromJson(value);
        case 'CreateMessageRequest':
          return CreateMessageRequest.fromJson(value);
        case 'CreateMessageRequestAttachmentsInner':
          return CreateMessageRequestAttachmentsInner.fromJson(value);
        case 'CreateMessageRequestAttachmentsInnerToolsInner':
          return CreateMessageRequestAttachmentsInnerToolsInner.fromJson(value);
        case 'CreateMessageRequestContent':
          return CreateMessageRequestContent.fromJson(value);
        case 'CreateModerationRequest':
          return CreateModerationRequest.fromJson(value);
        case 'CreateModerationRequestInput':
          return CreateModerationRequestInput.fromJson(value);
        case 'CreateModerationRequestInputOneOfInner':
          return CreateModerationRequestInputOneOfInner.fromJson(value);
        case 'CreateModerationRequestInputOneOfInnerOneOf':
          return CreateModerationRequestInputOneOfInnerOneOf.fromJson(value);
        case 'CreateModerationRequestInputOneOfInnerOneOf1':
          return CreateModerationRequestInputOneOfInnerOneOf1.fromJson(value);
        case 'CreateModerationRequestInputOneOfInnerOneOfImageUrl':
          return CreateModerationRequestInputOneOfInnerOneOfImageUrl.fromJson(value);
        case 'CreateModerationRequestModel':
          return CreateModerationRequestModel.fromJson(value);
        case 'CreateModerationResponse':
          return CreateModerationResponse.fromJson(value);
        case 'CreateModerationResponseResultsInner':
          return CreateModerationResponseResultsInner.fromJson(value);
        case 'CreateModerationResponseResultsInnerCategories':
          return CreateModerationResponseResultsInnerCategories.fromJson(value);
        case 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes':
          return CreateModerationResponseResultsInnerCategoryAppliedInputTypes.fromJson(value);
        case 'CreateModerationResponseResultsInnerCategoryScores':
          return CreateModerationResponseResultsInnerCategoryScores.fromJson(value);
        case 'CreateRunRequest':
          return CreateRunRequest.fromJson(value);
        case 'CreateRunRequestModel':
          return CreateRunRequestModel.fromJson(value);
        case 'CreateSpeechRequest':
          return CreateSpeechRequest.fromJson(value);
        case 'CreateSpeechRequestModel':
          return CreateSpeechRequestModel.fromJson(value);
        case 'CreateThreadAndRunRequest':
          return CreateThreadAndRunRequest.fromJson(value);
        case 'CreateThreadAndRunRequestToolResources':
          return CreateThreadAndRunRequestToolResources.fromJson(value);
        case 'CreateThreadAndRunRequestToolsInner':
          return CreateThreadAndRunRequestToolsInner.fromJson(value);
        case 'CreateThreadRequest':
          return CreateThreadRequest.fromJson(value);
        case 'CreateThreadRequestToolResources':
          return CreateThreadRequestToolResources.fromJson(value);
        case 'CreateThreadRequestToolResourcesFileSearch':
          return CreateThreadRequestToolResourcesFileSearch.fromJson(value);
        case 'CreateThreadRequestToolResourcesFileSearchVectorStoresInner':
          return CreateThreadRequestToolResourcesFileSearchVectorStoresInner.fromJson(value);
        case 'CreateTranscription200Response':
          return CreateTranscription200Response.fromJson(value);
        case 'CreateTranscriptionRequestModel':
          return CreateTranscriptionRequestModel.fromJson(value);
        case 'CreateTranscriptionResponseJson':
          return CreateTranscriptionResponseJson.fromJson(value);
        case 'CreateTranscriptionResponseVerboseJson':
          return CreateTranscriptionResponseVerboseJson.fromJson(value);
        case 'CreateTranslation200Response':
          return CreateTranslation200Response.fromJson(value);
        case 'CreateTranslationResponseJson':
          return CreateTranslationResponseJson.fromJson(value);
        case 'CreateTranslationResponseVerboseJson':
          return CreateTranslationResponseVerboseJson.fromJson(value);
        case 'CreateUploadRequest':
          return CreateUploadRequest.fromJson(value);
        case 'CreateVectorStoreFileBatchRequest':
          return CreateVectorStoreFileBatchRequest.fromJson(value);
        case 'CreateVectorStoreFileRequest':
          return CreateVectorStoreFileRequest.fromJson(value);
        case 'CreateVectorStoreRequest':
          return CreateVectorStoreRequest.fromJson(value);
        case 'CreateVectorStoreRequestChunkingStrategy':
          return CreateVectorStoreRequestChunkingStrategy.fromJson(value);
        case 'DefaultProjectErrorResponse':
          return DefaultProjectErrorResponse.fromJson(value);
        case 'DeleteAssistantResponse':
          return DeleteAssistantResponse.fromJson(value);
        case 'DeleteFileResponse':
          return DeleteFileResponse.fromJson(value);
        case 'DeleteMessageResponse':
          return DeleteMessageResponse.fromJson(value);
        case 'DeleteModelResponse':
          return DeleteModelResponse.fromJson(value);
        case 'DeleteThreadResponse':
          return DeleteThreadResponse.fromJson(value);
        case 'DeleteVectorStoreFileResponse':
          return DeleteVectorStoreFileResponse.fromJson(value);
        case 'DeleteVectorStoreResponse':
          return DeleteVectorStoreResponse.fromJson(value);
        case 'DoneEvent':
          return DoneEvent.fromJson(value);
        case 'Embedding':
          return Embedding.fromJson(value);
        case 'Error':
          return Error.fromJson(value);
        case 'ErrorEvent':
          return ErrorEvent.fromJson(value);
        case 'ErrorResponse':
          return ErrorResponse.fromJson(value);
        case 'FileSearchRankingOptions':
          return FileSearchRankingOptions.fromJson(value);
        case 'FineTuneChatCompletionRequestAssistantMessage':
          return FineTuneChatCompletionRequestAssistantMessage.fromJson(value);
        case 'FineTuneChatRequestInput':
          return FineTuneChatRequestInput.fromJson(value);
        case 'FineTuneChatRequestInputMessagesInner':
          return FineTuneChatRequestInputMessagesInner.fromJson(value);
        case 'FineTuneCompletionRequestInput':
          return FineTuneCompletionRequestInput.fromJson(value);
        case 'FineTuneDPOMethod':
          return FineTuneDPOMethod.fromJson(value);
        case 'FineTuneDPOMethodHyperparameters':
          return FineTuneDPOMethodHyperparameters.fromJson(value);
        case 'FineTuneDPOMethodHyperparametersBatchSize':
          return FineTuneDPOMethodHyperparametersBatchSize.fromJson(value);
        case 'FineTuneDPOMethodHyperparametersBeta':
          return FineTuneDPOMethodHyperparametersBeta.fromJson(value);
        case 'FineTuneDPOMethodHyperparametersLearningRateMultiplier':
          return FineTuneDPOMethodHyperparametersLearningRateMultiplier.fromJson(value);
        case 'FineTuneDPOMethodHyperparametersNEpochs':
          return FineTuneDPOMethodHyperparametersNEpochs.fromJson(value);
        case 'FineTuneMethod':
          return FineTuneMethod.fromJson(value);
        case 'FineTunePreferenceRequestInput':
          return FineTunePreferenceRequestInput.fromJson(value);
        case 'FineTunePreferenceRequestInputInput':
          return FineTunePreferenceRequestInputInput.fromJson(value);
        case 'FineTunePreferenceRequestInputPreferredCompletionInner':
          return FineTunePreferenceRequestInputPreferredCompletionInner.fromJson(value);
        case 'FineTuneSupervisedMethod':
          return FineTuneSupervisedMethod.fromJson(value);
        case 'FineTuneSupervisedMethodHyperparameters':
          return FineTuneSupervisedMethodHyperparameters.fromJson(value);
        case 'FineTuningIntegration':
          return FineTuningIntegration.fromJson(value);
        case 'FineTuningJob':
          return FineTuningJob.fromJson(value);
        case 'FineTuningJobCheckpoint':
          return FineTuningJobCheckpoint.fromJson(value);
        case 'FineTuningJobCheckpointMetrics':
          return FineTuningJobCheckpointMetrics.fromJson(value);
        case 'FineTuningJobError':
          return FineTuningJobError.fromJson(value);
        case 'FineTuningJobEvent':
          return FineTuningJobEvent.fromJson(value);
        case 'FineTuningJobHyperparameters':
          return FineTuningJobHyperparameters.fromJson(value);
        case 'FineTuningJobIntegrationsInner':
          return FineTuningJobIntegrationsInner.fromJson(value);
        case 'FunctionObject':
          return FunctionObject.fromJson(value);
        case 'Image':
          return Image.fromJson(value);
        case 'ImagesResponse':
          return ImagesResponse.fromJson(value);
        case 'Invite':
          return Invite.fromJson(value);
        case 'InviteDeleteResponse':
          return InviteDeleteResponse.fromJson(value);
        case 'InviteListResponse':
          return InviteListResponse.fromJson(value);
        case 'InviteProjectsInner':
          return InviteProjectsInner.fromJson(value);
        case 'InviteRequest':
          return InviteRequest.fromJson(value);
        case 'InviteRequestProjectsInner':
          return InviteRequestProjectsInner.fromJson(value);
        case 'ListAssistantsResponse':
          return ListAssistantsResponse.fromJson(value);
        case 'ListAuditLogsEffectiveAtParameter':
          return ListAuditLogsEffectiveAtParameter.fromJson(value);
        case 'ListAuditLogsResponse':
          return ListAuditLogsResponse.fromJson(value);
        case 'ListBatchesResponse':
          return ListBatchesResponse.fromJson(value);
        case 'ListFilesResponse':
          return ListFilesResponse.fromJson(value);
        case 'ListFineTuningJobCheckpointsResponse':
          return ListFineTuningJobCheckpointsResponse.fromJson(value);
        case 'ListFineTuningJobEventsResponse':
          return ListFineTuningJobEventsResponse.fromJson(value);
        case 'ListMessagesResponse':
          return ListMessagesResponse.fromJson(value);
        case 'ListModelsResponse':
          return ListModelsResponse.fromJson(value);
        case 'ListPaginatedFineTuningJobsResponse':
          return ListPaginatedFineTuningJobsResponse.fromJson(value);
        case 'ListRunStepsResponse':
          return ListRunStepsResponse.fromJson(value);
        case 'ListRunsResponse':
          return ListRunsResponse.fromJson(value);
        case 'ListThreadsResponse':
          return ListThreadsResponse.fromJson(value);
        case 'ListVectorStoreFilesResponse':
          return ListVectorStoreFilesResponse.fromJson(value);
        case 'ListVectorStoresResponse':
          return ListVectorStoresResponse.fromJson(value);
        case 'MessageContentImageFileObject':
          return MessageContentImageFileObject.fromJson(value);
        case 'MessageContentImageFileObjectImageFile':
          return MessageContentImageFileObjectImageFile.fromJson(value);
        case 'MessageContentImageUrlObject':
          return MessageContentImageUrlObject.fromJson(value);
        case 'MessageContentImageUrlObjectImageUrl':
          return MessageContentImageUrlObjectImageUrl.fromJson(value);
        case 'MessageContentRefusalObject':
          return MessageContentRefusalObject.fromJson(value);
        case 'MessageContentTextAnnotationsFileCitationObject':
          return MessageContentTextAnnotationsFileCitationObject.fromJson(value);
        case 'MessageContentTextAnnotationsFileCitationObjectFileCitation':
          return MessageContentTextAnnotationsFileCitationObjectFileCitation.fromJson(value);
        case 'MessageContentTextAnnotationsFilePathObject':
          return MessageContentTextAnnotationsFilePathObject.fromJson(value);
        case 'MessageContentTextAnnotationsFilePathObjectFilePath':
          return MessageContentTextAnnotationsFilePathObjectFilePath.fromJson(value);
        case 'MessageContentTextObject':
          return MessageContentTextObject.fromJson(value);
        case 'MessageContentTextObjectText':
          return MessageContentTextObjectText.fromJson(value);
        case 'MessageContentTextObjectTextAnnotationsInner':
          return MessageContentTextObjectTextAnnotationsInner.fromJson(value);
        case 'MessageDeltaContentImageFileObject':
          return MessageDeltaContentImageFileObject.fromJson(value);
        case 'MessageDeltaContentImageFileObjectImageFile':
          return MessageDeltaContentImageFileObjectImageFile.fromJson(value);
        case 'MessageDeltaContentImageUrlObject':
          return MessageDeltaContentImageUrlObject.fromJson(value);
        case 'MessageDeltaContentImageUrlObjectImageUrl':
          return MessageDeltaContentImageUrlObjectImageUrl.fromJson(value);
        case 'MessageDeltaContentRefusalObject':
          return MessageDeltaContentRefusalObject.fromJson(value);
        case 'MessageDeltaContentTextAnnotationsFileCitationObject':
          return MessageDeltaContentTextAnnotationsFileCitationObject.fromJson(value);
        case 'MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation':
          return MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.fromJson(value);
        case 'MessageDeltaContentTextAnnotationsFilePathObject':
          return MessageDeltaContentTextAnnotationsFilePathObject.fromJson(value);
        case 'MessageDeltaContentTextAnnotationsFilePathObjectFilePath':
          return MessageDeltaContentTextAnnotationsFilePathObjectFilePath.fromJson(value);
        case 'MessageDeltaContentTextObject':
          return MessageDeltaContentTextObject.fromJson(value);
        case 'MessageDeltaContentTextObjectText':
          return MessageDeltaContentTextObjectText.fromJson(value);
        case 'MessageDeltaContentTextObjectTextAnnotationsInner':
          return MessageDeltaContentTextObjectTextAnnotationsInner.fromJson(value);
        case 'MessageDeltaObject':
          return MessageDeltaObject.fromJson(value);
        case 'MessageDeltaObjectDelta':
          return MessageDeltaObjectDelta.fromJson(value);
        case 'MessageDeltaObjectDeltaContentInner':
          return MessageDeltaObjectDeltaContentInner.fromJson(value);
        case 'MessageObject':
          return MessageObject.fromJson(value);
        case 'MessageObjectContentInner':
          return MessageObjectContentInner.fromJson(value);
        case 'MessageObjectIncompleteDetails':
          return MessageObjectIncompleteDetails.fromJson(value);
        case 'MessageRequestContentTextObject':
          return MessageRequestContentTextObject.fromJson(value);
        case 'MessageStreamEvent':
          return MessageStreamEvent.fromJson(value);
        case 'MessageStreamEventOneOf':
          return MessageStreamEventOneOf.fromJson(value);
        case 'MessageStreamEventOneOf1':
          return MessageStreamEventOneOf1.fromJson(value);
        case 'MessageStreamEventOneOf2':
          return MessageStreamEventOneOf2.fromJson(value);
        case 'MessageStreamEventOneOf3':
          return MessageStreamEventOneOf3.fromJson(value);
        case 'MessageStreamEventOneOf4':
          return MessageStreamEventOneOf4.fromJson(value);
        case 'Model':
          return Model.fromJson(value);
        case 'ModifyAssistantRequest':
          return ModifyAssistantRequest.fromJson(value);
        case 'ModifyAssistantRequestToolResources':
          return ModifyAssistantRequestToolResources.fromJson(value);
        case 'ModifyAssistantRequestToolResourcesCodeInterpreter':
          return ModifyAssistantRequestToolResourcesCodeInterpreter.fromJson(value);
        case 'ModifyAssistantRequestToolResourcesFileSearch':
          return ModifyAssistantRequestToolResourcesFileSearch.fromJson(value);
        case 'ModifyMessageRequest':
          return ModifyMessageRequest.fromJson(value);
        case 'ModifyRunRequest':
          return ModifyRunRequest.fromJson(value);
        case 'ModifyThreadRequest':
          return ModifyThreadRequest.fromJson(value);
        case 'ModifyThreadRequestToolResources':
          return ModifyThreadRequestToolResources.fromJson(value);
        case 'ModifyThreadRequestToolResourcesFileSearch':
          return ModifyThreadRequestToolResourcesFileSearch.fromJson(value);
        case 'OpenAIFile':
          return OpenAIFile.fromJson(value);
        case 'OtherChunkingStrategyResponseParam':
          return OtherChunkingStrategyResponseParam.fromJson(value);
        case 'PredictionContent':
          return PredictionContent.fromJson(value);
        case 'PredictionContentContent':
          return PredictionContentContent.fromJson(value);
        case 'Project':
          return Project.fromJson(value);
        case 'ProjectApiKey':
          return ProjectApiKey.fromJson(value);
        case 'ProjectApiKeyDeleteResponse':
          return ProjectApiKeyDeleteResponse.fromJson(value);
        case 'ProjectApiKeyListResponse':
          return ProjectApiKeyListResponse.fromJson(value);
        case 'ProjectApiKeyOwner':
          return ProjectApiKeyOwner.fromJson(value);
        case 'ProjectCreateRequest':
          return ProjectCreateRequest.fromJson(value);
        case 'ProjectListResponse':
          return ProjectListResponse.fromJson(value);
        case 'ProjectRateLimit':
          return ProjectRateLimit.fromJson(value);
        case 'ProjectRateLimitListResponse':
          return ProjectRateLimitListResponse.fromJson(value);
        case 'ProjectRateLimitUpdateRequest':
          return ProjectRateLimitUpdateRequest.fromJson(value);
        case 'ProjectServiceAccount':
          return ProjectServiceAccount.fromJson(value);
        case 'ProjectServiceAccountApiKey':
          return ProjectServiceAccountApiKey.fromJson(value);
        case 'ProjectServiceAccountCreateRequest':
          return ProjectServiceAccountCreateRequest.fromJson(value);
        case 'ProjectServiceAccountCreateResponse':
          return ProjectServiceAccountCreateResponse.fromJson(value);
        case 'ProjectServiceAccountDeleteResponse':
          return ProjectServiceAccountDeleteResponse.fromJson(value);
        case 'ProjectServiceAccountListResponse':
          return ProjectServiceAccountListResponse.fromJson(value);
        case 'ProjectUpdateRequest':
          return ProjectUpdateRequest.fromJson(value);
        case 'ProjectUser':
          return ProjectUser.fromJson(value);
        case 'ProjectUserCreateRequest':
          return ProjectUserCreateRequest.fromJson(value);
        case 'ProjectUserDeleteResponse':
          return ProjectUserDeleteResponse.fromJson(value);
        case 'ProjectUserListResponse':
          return ProjectUserListResponse.fromJson(value);
        case 'ProjectUserUpdateRequest':
          return ProjectUserUpdateRequest.fromJson(value);
        case 'RealtimeClientEventConversationItemCreate':
          return RealtimeClientEventConversationItemCreate.fromJson(value);
        case 'RealtimeClientEventConversationItemDelete':
          return RealtimeClientEventConversationItemDelete.fromJson(value);
        case 'RealtimeClientEventConversationItemTruncate':
          return RealtimeClientEventConversationItemTruncate.fromJson(value);
        case 'RealtimeClientEventInputAudioBufferAppend':
          return RealtimeClientEventInputAudioBufferAppend.fromJson(value);
        case 'RealtimeClientEventInputAudioBufferClear':
          return RealtimeClientEventInputAudioBufferClear.fromJson(value);
        case 'RealtimeClientEventInputAudioBufferCommit':
          return RealtimeClientEventInputAudioBufferCommit.fromJson(value);
        case 'RealtimeClientEventResponseCancel':
          return RealtimeClientEventResponseCancel.fromJson(value);
        case 'RealtimeClientEventResponseCreate':
          return RealtimeClientEventResponseCreate.fromJson(value);
        case 'RealtimeClientEventSessionUpdate':
          return RealtimeClientEventSessionUpdate.fromJson(value);
        case 'RealtimeConversationItem':
          return RealtimeConversationItem.fromJson(value);
        case 'RealtimeConversationItemContentInner':
          return RealtimeConversationItemContentInner.fromJson(value);
        case 'RealtimeResponse':
          return RealtimeResponse.fromJson(value);
        case 'RealtimeResponseCreateParams':
          return RealtimeResponseCreateParams.fromJson(value);
        case 'RealtimeResponseCreateParamsConversation':
          return RealtimeResponseCreateParamsConversation.fromJson(value);
        case 'RealtimeResponseCreateParamsMaxResponseOutputTokens':
          return RealtimeResponseCreateParamsMaxResponseOutputTokens.fromJson(value);
        case 'RealtimeResponseCreateParamsToolsInner':
          return RealtimeResponseCreateParamsToolsInner.fromJson(value);
        case 'RealtimeResponseStatusDetails':
          return RealtimeResponseStatusDetails.fromJson(value);
        case 'RealtimeResponseStatusDetailsError':
          return RealtimeResponseStatusDetailsError.fromJson(value);
        case 'RealtimeResponseUsage':
          return RealtimeResponseUsage.fromJson(value);
        case 'RealtimeResponseUsageInputTokenDetails':
          return RealtimeResponseUsageInputTokenDetails.fromJson(value);
        case 'RealtimeResponseUsageOutputTokenDetails':
          return RealtimeResponseUsageOutputTokenDetails.fromJson(value);
        case 'RealtimeServerEventConversationCreated':
          return RealtimeServerEventConversationCreated.fromJson(value);
        case 'RealtimeServerEventConversationCreatedConversation':
          return RealtimeServerEventConversationCreatedConversation.fromJson(value);
        case 'RealtimeServerEventConversationItemCreated':
          return RealtimeServerEventConversationItemCreated.fromJson(value);
        case 'RealtimeServerEventConversationItemDeleted':
          return RealtimeServerEventConversationItemDeleted.fromJson(value);
        case 'RealtimeServerEventConversationItemInputAudioTranscriptionCompleted':
          return RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.fromJson(value);
        case 'RealtimeServerEventConversationItemInputAudioTranscriptionFailed':
          return RealtimeServerEventConversationItemInputAudioTranscriptionFailed.fromJson(value);
        case 'RealtimeServerEventConversationItemInputAudioTranscriptionFailedError':
          return RealtimeServerEventConversationItemInputAudioTranscriptionFailedError.fromJson(value);
        case 'RealtimeServerEventConversationItemTruncated':
          return RealtimeServerEventConversationItemTruncated.fromJson(value);
        case 'RealtimeServerEventError':
          return RealtimeServerEventError.fromJson(value);
        case 'RealtimeServerEventErrorError':
          return RealtimeServerEventErrorError.fromJson(value);
        case 'RealtimeServerEventInputAudioBufferCleared':
          return RealtimeServerEventInputAudioBufferCleared.fromJson(value);
        case 'RealtimeServerEventInputAudioBufferCommitted':
          return RealtimeServerEventInputAudioBufferCommitted.fromJson(value);
        case 'RealtimeServerEventInputAudioBufferSpeechStarted':
          return RealtimeServerEventInputAudioBufferSpeechStarted.fromJson(value);
        case 'RealtimeServerEventInputAudioBufferSpeechStopped':
          return RealtimeServerEventInputAudioBufferSpeechStopped.fromJson(value);
        case 'RealtimeServerEventRateLimitsUpdated':
          return RealtimeServerEventRateLimitsUpdated.fromJson(value);
        case 'RealtimeServerEventRateLimitsUpdatedRateLimitsInner':
          return RealtimeServerEventRateLimitsUpdatedRateLimitsInner.fromJson(value);
        case 'RealtimeServerEventResponseAudioDelta':
          return RealtimeServerEventResponseAudioDelta.fromJson(value);
        case 'RealtimeServerEventResponseAudioDone':
          return RealtimeServerEventResponseAudioDone.fromJson(value);
        case 'RealtimeServerEventResponseAudioTranscriptDelta':
          return RealtimeServerEventResponseAudioTranscriptDelta.fromJson(value);
        case 'RealtimeServerEventResponseAudioTranscriptDone':
          return RealtimeServerEventResponseAudioTranscriptDone.fromJson(value);
        case 'RealtimeServerEventResponseContentPartAdded':
          return RealtimeServerEventResponseContentPartAdded.fromJson(value);
        case 'RealtimeServerEventResponseContentPartAddedPart':
          return RealtimeServerEventResponseContentPartAddedPart.fromJson(value);
        case 'RealtimeServerEventResponseContentPartDone':
          return RealtimeServerEventResponseContentPartDone.fromJson(value);
        case 'RealtimeServerEventResponseContentPartDonePart':
          return RealtimeServerEventResponseContentPartDonePart.fromJson(value);
        case 'RealtimeServerEventResponseCreated':
          return RealtimeServerEventResponseCreated.fromJson(value);
        case 'RealtimeServerEventResponseDone':
          return RealtimeServerEventResponseDone.fromJson(value);
        case 'RealtimeServerEventResponseFunctionCallArgumentsDelta':
          return RealtimeServerEventResponseFunctionCallArgumentsDelta.fromJson(value);
        case 'RealtimeServerEventResponseFunctionCallArgumentsDone':
          return RealtimeServerEventResponseFunctionCallArgumentsDone.fromJson(value);
        case 'RealtimeServerEventResponseOutputItemAdded':
          return RealtimeServerEventResponseOutputItemAdded.fromJson(value);
        case 'RealtimeServerEventResponseOutputItemDone':
          return RealtimeServerEventResponseOutputItemDone.fromJson(value);
        case 'RealtimeServerEventResponseTextDelta':
          return RealtimeServerEventResponseTextDelta.fromJson(value);
        case 'RealtimeServerEventResponseTextDone':
          return RealtimeServerEventResponseTextDone.fromJson(value);
        case 'RealtimeServerEventSessionCreated':
          return RealtimeServerEventSessionCreated.fromJson(value);
        case 'RealtimeServerEventSessionUpdated':
          return RealtimeServerEventSessionUpdated.fromJson(value);
        case 'RealtimeSession':
          return RealtimeSession.fromJson(value);
        case 'RealtimeSessionCreateRequest':
          return RealtimeSessionCreateRequest.fromJson(value);
        case 'RealtimeSessionCreateRequestTurnDetection':
          return RealtimeSessionCreateRequestTurnDetection.fromJson(value);
        case 'RealtimeSessionCreateResponse':
          return RealtimeSessionCreateResponse.fromJson(value);
        case 'RealtimeSessionCreateResponseClientSecret':
          return RealtimeSessionCreateResponseClientSecret.fromJson(value);
        case 'RealtimeSessionCreateResponseTurnDetection':
          return RealtimeSessionCreateResponseTurnDetection.fromJson(value);
        case 'RealtimeSessionInputAudioTranscription':
          return RealtimeSessionInputAudioTranscription.fromJson(value);
        case 'RealtimeSessionModel':
          return RealtimeSessionModel.fromJson(value);
        case 'RealtimeSessionTurnDetection':
          return RealtimeSessionTurnDetection.fromJson(value);
        case 'ResponseFormatJsonObject':
          return ResponseFormatJsonObject.fromJson(value);
        case 'ResponseFormatJsonSchema':
          return ResponseFormatJsonSchema.fromJson(value);
        case 'ResponseFormatJsonSchemaJsonSchema':
          return ResponseFormatJsonSchemaJsonSchema.fromJson(value);
        case 'ResponseFormatText':
          return ResponseFormatText.fromJson(value);
        case 'RunCompletionUsage':
          return RunCompletionUsage.fromJson(value);
        case 'RunObject':
          return RunObject.fromJson(value);
        case 'RunObjectIncompleteDetails':
          return RunObjectIncompleteDetails.fromJson(value);
        case 'RunObjectLastError':
          return RunObjectLastError.fromJson(value);
        case 'RunObjectRequiredAction':
          return RunObjectRequiredAction.fromJson(value);
        case 'RunObjectRequiredActionSubmitToolOutputs':
          return RunObjectRequiredActionSubmitToolOutputs.fromJson(value);
        case 'RunStepCompletionUsage':
          return RunStepCompletionUsage.fromJson(value);
        case 'RunStepDeltaObject':
          return RunStepDeltaObject.fromJson(value);
        case 'RunStepDeltaObjectDelta':
          return RunStepDeltaObjectDelta.fromJson(value);
        case 'RunStepDeltaObjectDeltaStepDetails':
          return RunStepDeltaObjectDeltaStepDetails.fromJson(value);
        case 'RunStepDeltaStepDetailsMessageCreationObject':
          return RunStepDeltaStepDetailsMessageCreationObject.fromJson(value);
        case 'RunStepDeltaStepDetailsMessageCreationObjectMessageCreation':
          return RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsCodeObject':
          return RunStepDeltaStepDetailsToolCallsCodeObject.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter':
          return RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner':
          return RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsCodeOutputImageObject':
          return RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage':
          return RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject':
          return RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsFileSearchObject':
          return RunStepDeltaStepDetailsToolCallsFileSearchObject.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsFunctionObject':
          return RunStepDeltaStepDetailsToolCallsFunctionObject.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsFunctionObjectFunction':
          return RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsObject':
          return RunStepDeltaStepDetailsToolCallsObject.fromJson(value);
        case 'RunStepDeltaStepDetailsToolCallsObjectToolCallsInner':
          return RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.fromJson(value);
        case 'RunStepDetailsMessageCreationObject':
          return RunStepDetailsMessageCreationObject.fromJson(value);
        case 'RunStepDetailsMessageCreationObjectMessageCreation':
          return RunStepDetailsMessageCreationObjectMessageCreation.fromJson(value);
        case 'RunStepDetailsToolCallsCodeObject':
          return RunStepDetailsToolCallsCodeObject.fromJson(value);
        case 'RunStepDetailsToolCallsCodeObjectCodeInterpreter':
          return RunStepDetailsToolCallsCodeObjectCodeInterpreter.fromJson(value);
        case 'RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner':
          return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.fromJson(value);
        case 'RunStepDetailsToolCallsCodeOutputImageObject':
          return RunStepDetailsToolCallsCodeOutputImageObject.fromJson(value);
        case 'RunStepDetailsToolCallsCodeOutputImageObjectImage':
          return RunStepDetailsToolCallsCodeOutputImageObjectImage.fromJson(value);
        case 'RunStepDetailsToolCallsCodeOutputLogsObject':
          return RunStepDetailsToolCallsCodeOutputLogsObject.fromJson(value);
        case 'RunStepDetailsToolCallsFileSearchObject':
          return RunStepDetailsToolCallsFileSearchObject.fromJson(value);
        case 'RunStepDetailsToolCallsFileSearchObjectFileSearch':
          return RunStepDetailsToolCallsFileSearchObjectFileSearch.fromJson(value);
        case 'RunStepDetailsToolCallsFileSearchRankingOptionsObject':
          return RunStepDetailsToolCallsFileSearchRankingOptionsObject.fromJson(value);
        case 'RunStepDetailsToolCallsFileSearchResultObject':
          return RunStepDetailsToolCallsFileSearchResultObject.fromJson(value);
        case 'RunStepDetailsToolCallsFileSearchResultObjectContentInner':
          return RunStepDetailsToolCallsFileSearchResultObjectContentInner.fromJson(value);
        case 'RunStepDetailsToolCallsFunctionObject':
          return RunStepDetailsToolCallsFunctionObject.fromJson(value);
        case 'RunStepDetailsToolCallsFunctionObjectFunction':
          return RunStepDetailsToolCallsFunctionObjectFunction.fromJson(value);
        case 'RunStepDetailsToolCallsObject':
          return RunStepDetailsToolCallsObject.fromJson(value);
        case 'RunStepDetailsToolCallsObjectToolCallsInner':
          return RunStepDetailsToolCallsObjectToolCallsInner.fromJson(value);
        case 'RunStepObject':
          return RunStepObject.fromJson(value);
        case 'RunStepObjectLastError':
          return RunStepObjectLastError.fromJson(value);
        case 'RunStepObjectStepDetails':
          return RunStepObjectStepDetails.fromJson(value);
        case 'RunStepStreamEvent':
          return RunStepStreamEvent.fromJson(value);
        case 'RunStepStreamEventOneOf':
          return RunStepStreamEventOneOf.fromJson(value);
        case 'RunStepStreamEventOneOf1':
          return RunStepStreamEventOneOf1.fromJson(value);
        case 'RunStepStreamEventOneOf2':
          return RunStepStreamEventOneOf2.fromJson(value);
        case 'RunStepStreamEventOneOf3':
          return RunStepStreamEventOneOf3.fromJson(value);
        case 'RunStepStreamEventOneOf4':
          return RunStepStreamEventOneOf4.fromJson(value);
        case 'RunStepStreamEventOneOf5':
          return RunStepStreamEventOneOf5.fromJson(value);
        case 'RunStepStreamEventOneOf6':
          return RunStepStreamEventOneOf6.fromJson(value);
        case 'RunStreamEvent':
          return RunStreamEvent.fromJson(value);
        case 'RunStreamEventOneOf':
          return RunStreamEventOneOf.fromJson(value);
        case 'RunStreamEventOneOf1':
          return RunStreamEventOneOf1.fromJson(value);
        case 'RunStreamEventOneOf2':
          return RunStreamEventOneOf2.fromJson(value);
        case 'RunStreamEventOneOf3':
          return RunStreamEventOneOf3.fromJson(value);
        case 'RunStreamEventOneOf4':
          return RunStreamEventOneOf4.fromJson(value);
        case 'RunStreamEventOneOf5':
          return RunStreamEventOneOf5.fromJson(value);
        case 'RunStreamEventOneOf6':
          return RunStreamEventOneOf6.fromJson(value);
        case 'RunStreamEventOneOf7':
          return RunStreamEventOneOf7.fromJson(value);
        case 'RunStreamEventOneOf8':
          return RunStreamEventOneOf8.fromJson(value);
        case 'RunStreamEventOneOf9':
          return RunStreamEventOneOf9.fromJson(value);
        case 'RunToolCallObject':
          return RunToolCallObject.fromJson(value);
        case 'RunToolCallObjectFunction':
          return RunToolCallObjectFunction.fromJson(value);
        case 'StaticChunkingStrategy':
          return StaticChunkingStrategy.fromJson(value);
        case 'StaticChunkingStrategyRequestParam':
          return StaticChunkingStrategyRequestParam.fromJson(value);
        case 'StaticChunkingStrategyResponseParam':
          return StaticChunkingStrategyResponseParam.fromJson(value);
        case 'StaticChunkingStrategyStatic':
          return StaticChunkingStrategyStatic.fromJson(value);
        case 'SubmitToolOutputsRunRequest':
          return SubmitToolOutputsRunRequest.fromJson(value);
        case 'SubmitToolOutputsRunRequestToolOutputsInner':
          return SubmitToolOutputsRunRequestToolOutputsInner.fromJson(value);
        case 'ThreadObject':
          return ThreadObject.fromJson(value);
        case 'ThreadStreamEvent':
          return ThreadStreamEvent.fromJson(value);
        case 'TranscriptionSegment':
          return TranscriptionSegment.fromJson(value);
        case 'TranscriptionWord':
          return TranscriptionWord.fromJson(value);
        case 'TruncationObject':
          return TruncationObject.fromJson(value);
        case 'UpdateVectorStoreRequest':
          return UpdateVectorStoreRequest.fromJson(value);
        case 'Upload':
          return Upload.fromJson(value);
        case 'UploadPart':
          return UploadPart.fromJson(value);
        case 'UsageAudioSpeechesResult':
          return UsageAudioSpeechesResult.fromJson(value);
        case 'UsageAudioTranscriptionsResult':
          return UsageAudioTranscriptionsResult.fromJson(value);
        case 'UsageCodeInterpreterSessionsResult':
          return UsageCodeInterpreterSessionsResult.fromJson(value);
        case 'UsageCompletionsResult':
          return UsageCompletionsResult.fromJson(value);
        case 'UsageEmbeddingsResult':
          return UsageEmbeddingsResult.fromJson(value);
        case 'UsageImagesResult':
          return UsageImagesResult.fromJson(value);
        case 'UsageModerationsResult':
          return UsageModerationsResult.fromJson(value);
        case 'UsageResponse':
          return UsageResponse.fromJson(value);
        case 'UsageTimeBucket':
          return UsageTimeBucket.fromJson(value);
        case 'UsageTimeBucketResultInner':
          return UsageTimeBucketResultInner.fromJson(value);
        case 'UsageVectorStoresResult':
          return UsageVectorStoresResult.fromJson(value);
        case 'User':
          return User.fromJson(value);
        case 'UserDeleteResponse':
          return UserDeleteResponse.fromJson(value);
        case 'UserListResponse':
          return UserListResponse.fromJson(value);
        case 'UserRoleUpdateRequest':
          return UserRoleUpdateRequest.fromJson(value);
        case 'VectorStoreExpirationAfter':
          return VectorStoreExpirationAfter.fromJson(value);
        case 'VectorStoreFileBatchObject':
          return VectorStoreFileBatchObject.fromJson(value);
        case 'VectorStoreFileBatchObjectFileCounts':
          return VectorStoreFileBatchObjectFileCounts.fromJson(value);
        case 'VectorStoreFileObject':
          return VectorStoreFileObject.fromJson(value);
        case 'VectorStoreFileObjectChunkingStrategy':
          return VectorStoreFileObjectChunkingStrategy.fromJson(value);
        case 'VectorStoreFileObjectLastError':
          return VectorStoreFileObjectLastError.fromJson(value);
        case 'VectorStoreObject':
          return VectorStoreObject.fromJson(value);
        case 'VectorStoreObjectFileCounts':
          return VectorStoreObjectFileCounts.fromJson(value);
        default:
          dynamic match;
          if (value is List && (match = _regList.firstMatch(targetType)?.group(1)) != null) {
            return value
              .map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,))
              .toList(growable: growable);
          }
          if (value is Set && (match = _regSet.firstMatch(targetType)?.group(1)) != null) {
            return value
              .map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,))
              .toSet();
          }
          if (value is Map && (match = _regMap.firstMatch(targetType)?.group(1)) != null) {
            return Map<String, dynamic>.fromIterables(
              value.keys.cast<String>(),
              value.values.map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,)),
            );
          }
      }
    } on Exception catch (error, trace) {
      throw ApiException.withInner(HttpStatus.internalServerError, 'Exception during deserialization.', error, trace,);
    }
    throw ApiException(HttpStatus.internalServerError, 'Could not find a suitable class for deserialization',);
  }
}

/// Primarily intended for use in an isolate.
class DeserializationMessage {
  const DeserializationMessage({
    required this.json,
    required this.targetType,
    this.growable = false,
  });

  /// The JSON value to deserialize.
  final String json;

  /// Target type to deserialize to.
  final String targetType;

  /// Whether to make deserialized lists or maps growable.
  final bool growable;
}

/// Primarily intended for use in an isolate.
Future<dynamic> decodeAsync(DeserializationMessage message) async {
  // Remove all spaces. Necessary for regular expressions as well.
  final targetType = message.targetType.replaceAll(' ', '');

  // If the expected target type is String, nothing to do...
  return targetType == 'String'
    ? message.json
    : json.decode(message.json);
}

/// Primarily intended for use in an isolate.
Future<dynamic> deserializeAsync(DeserializationMessage message) async {
  // Remove all spaces. Necessary for regular expressions as well.
  final targetType = message.targetType.replaceAll(' ', '');

  // If the expected target type is String, nothing to do...
  return targetType == 'String'
    ? message.json
    : ApiClient.fromJson(
        json.decode(message.json),
        targetType,
        growable: message.growable,
      );
}

/// Primarily intended for use in an isolate.
Future<String> serializeAsync(Object? value) async => value == null ? '' : json.encode(value);
