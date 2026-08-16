//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/assistants_api_tool_choice_option.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_thread_and_run_request_tool_resources.dart';
import 'package:openapi/src/model/create_thread_and_run_request_tools_inner.dart';
import 'package:openapi/src/model/create_thread_request.dart';
import 'package:openapi/src/model/create_run_request_model.dart';
import 'package:openapi/src/model/assistants_api_response_format_option.dart';
import 'package:openapi/src/model/truncation_object.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_thread_and_run_request.g.dart';

/// CreateThreadAndRunRequest
///
/// Properties:
/// * [assistantId] - The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
/// * [thread] 
/// * [model] 
/// * [instructions] - Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
/// * [tools] - Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
/// * [toolResources] 
/// * [metadata] - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
/// * [temperature] - What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
/// * [topP] - An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
/// * [stream] - If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
/// * [maxPromptTokens] - The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
/// * [maxCompletionTokens] - The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
/// * [truncationStrategy] 
/// * [toolChoice] 
/// * [parallelToolCalls] - Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
/// * [responseFormat] 
@BuiltValue()
abstract class CreateThreadAndRunRequest implements Built<CreateThreadAndRunRequest, CreateThreadAndRunRequestBuilder> {
  /// The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
  @BuiltValueField(wireName: r'assistant_id')
  String get assistantId;

  @BuiltValueField(wireName: r'thread')
  CreateThreadRequest? get thread;

  @BuiltValueField(wireName: r'model')
  CreateRunRequestModel? get model;

  /// Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
  @BuiltValueField(wireName: r'instructions')
  String? get instructions;

  /// Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
  @BuiltValueField(wireName: r'tools')
  BuiltList<CreateThreadAndRunRequestToolsInner>? get tools;

  @BuiltValueField(wireName: r'tool_resources')
  CreateThreadAndRunRequestToolResources? get toolResources;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  @BuiltValueField(wireName: r'temperature')
  num? get temperature;

  /// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  @BuiltValueField(wireName: r'top_p')
  num? get topP;

  /// If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  @BuiltValueField(wireName: r'stream')
  bool? get stream;

  /// The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
  @BuiltValueField(wireName: r'max_prompt_tokens')
  int? get maxPromptTokens;

  /// The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
  @BuiltValueField(wireName: r'max_completion_tokens')
  int? get maxCompletionTokens;

  @BuiltValueField(wireName: r'truncation_strategy')
  TruncationObject? get truncationStrategy;

  @BuiltValueField(wireName: r'tool_choice')
  AssistantsApiToolChoiceOption? get toolChoice;

  /// Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  @BuiltValueField(wireName: r'parallel_tool_calls')
  bool? get parallelToolCalls;

  @BuiltValueField(wireName: r'response_format')
  AssistantsApiResponseFormatOption? get responseFormat;

  CreateThreadAndRunRequest._();

  factory CreateThreadAndRunRequest([void updates(CreateThreadAndRunRequestBuilder b)]) = _$CreateThreadAndRunRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateThreadAndRunRequestBuilder b) => b
      ..temperature = 1
      ..topP = 1
      ..parallelToolCalls = true;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateThreadAndRunRequest> get serializer => _$CreateThreadAndRunRequestSerializer();
}

class _$CreateThreadAndRunRequestSerializer implements PrimitiveSerializer<CreateThreadAndRunRequest> {
  @override
  final Iterable<Type> types = const [CreateThreadAndRunRequest, _$CreateThreadAndRunRequest];

  @override
  final String wireName = r'CreateThreadAndRunRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateThreadAndRunRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'assistant_id';
    yield serializers.serialize(
      object.assistantId,
      specifiedType: const FullType(String),
    );
    if (object.thread != null) {
      yield r'thread';
      yield serializers.serialize(
        object.thread,
        specifiedType: const FullType(CreateThreadRequest),
      );
    }
    if (object.model != null) {
      yield r'model';
      yield serializers.serialize(
        object.model,
        specifiedType: const FullType.nullable(CreateRunRequestModel),
      );
    }
    if (object.instructions != null) {
      yield r'instructions';
      yield serializers.serialize(
        object.instructions,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.tools != null) {
      yield r'tools';
      yield serializers.serialize(
        object.tools,
        specifiedType: const FullType.nullable(BuiltList, [FullType(CreateThreadAndRunRequestToolsInner)]),
      );
    }
    if (object.toolResources != null) {
      yield r'tool_resources';
      yield serializers.serialize(
        object.toolResources,
        specifiedType: const FullType.nullable(CreateThreadAndRunRequestToolResources),
      );
    }
    if (object.metadata != null) {
      yield r'metadata';
      yield serializers.serialize(
        object.metadata,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
    if (object.temperature != null) {
      yield r'temperature';
      yield serializers.serialize(
        object.temperature,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.topP != null) {
      yield r'top_p';
      yield serializers.serialize(
        object.topP,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.stream != null) {
      yield r'stream';
      yield serializers.serialize(
        object.stream,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.maxPromptTokens != null) {
      yield r'max_prompt_tokens';
      yield serializers.serialize(
        object.maxPromptTokens,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.maxCompletionTokens != null) {
      yield r'max_completion_tokens';
      yield serializers.serialize(
        object.maxCompletionTokens,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.truncationStrategy != null) {
      yield r'truncation_strategy';
      yield serializers.serialize(
        object.truncationStrategy,
        specifiedType: const FullType(TruncationObject),
      );
    }
    if (object.toolChoice != null) {
      yield r'tool_choice';
      yield serializers.serialize(
        object.toolChoice,
        specifiedType: const FullType(AssistantsApiToolChoiceOption),
      );
    }
    if (object.parallelToolCalls != null) {
      yield r'parallel_tool_calls';
      yield serializers.serialize(
        object.parallelToolCalls,
        specifiedType: const FullType(bool),
      );
    }
    if (object.responseFormat != null) {
      yield r'response_format';
      yield serializers.serialize(
        object.responseFormat,
        specifiedType: const FullType(AssistantsApiResponseFormatOption),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateThreadAndRunRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateThreadAndRunRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'assistant_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assistantId = valueDes;
          break;
        case r'thread':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateThreadRequest),
          ) as CreateThreadRequest;
          result.thread.replace(valueDes);
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateRunRequestModel),
          ) as CreateRunRequestModel?;
          if (valueDes == null) continue;
          result.model.replace(valueDes);
          break;
        case r'instructions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.instructions = valueDes;
          break;
        case r'tools':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CreateThreadAndRunRequestToolsInner)]),
          ) as BuiltList<CreateThreadAndRunRequestToolsInner>?;
          if (valueDes == null) continue;
          result.tools.replace(valueDes);
          break;
        case r'tool_resources':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateThreadAndRunRequestToolResources),
          ) as CreateThreadAndRunRequestToolResources?;
          if (valueDes == null) continue;
          result.toolResources.replace(valueDes);
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.metadata = valueDes;
          break;
        case r'temperature':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.temperature = valueDes;
          break;
        case r'top_p':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.topP = valueDes;
          break;
        case r'stream':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.stream = valueDes;
          break;
        case r'max_prompt_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.maxPromptTokens = valueDes;
          break;
        case r'max_completion_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.maxCompletionTokens = valueDes;
          break;
        case r'truncation_strategy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TruncationObject),
          ) as TruncationObject;
          result.truncationStrategy.replace(valueDes);
          break;
        case r'tool_choice':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantsApiToolChoiceOption),
          ) as AssistantsApiToolChoiceOption;
          result.toolChoice.replace(valueDes);
          break;
        case r'parallel_tool_calls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.parallelToolCalls = valueDes;
          break;
        case r'response_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantsApiResponseFormatOption),
          ) as AssistantsApiResponseFormatOption;
          result.responseFormat.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateThreadAndRunRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateThreadAndRunRequestBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

