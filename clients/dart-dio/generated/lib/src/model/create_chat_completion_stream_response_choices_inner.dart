//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/chat_completion_stream_response_delta.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_chat_completion_response_choices_inner_logprobs.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_chat_completion_stream_response_choices_inner.g.dart';

/// CreateChatCompletionStreamResponseChoicesInner
///
/// Properties:
/// * [delta] 
/// * [logprobs] 
/// * [finishReason] - The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
/// * [index] - The index of the choice in the list of choices.
@BuiltValue()
abstract class CreateChatCompletionStreamResponseChoicesInner implements Built<CreateChatCompletionStreamResponseChoicesInner, CreateChatCompletionStreamResponseChoicesInnerBuilder> {
  @BuiltValueField(wireName: r'delta')
  ChatCompletionStreamResponseDelta get delta;

  @BuiltValueField(wireName: r'logprobs')
  CreateChatCompletionResponseChoicesInnerLogprobs? get logprobs;

  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueField(wireName: r'finish_reason')
  CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum? get finishReason;
  // enum finishReasonEnum {  stop,  length,  tool_calls,  content_filter,  function_call,  };

  /// The index of the choice in the list of choices.
  @BuiltValueField(wireName: r'index')
  int get index;

  CreateChatCompletionStreamResponseChoicesInner._();

  factory CreateChatCompletionStreamResponseChoicesInner([void updates(CreateChatCompletionStreamResponseChoicesInnerBuilder b)]) = _$CreateChatCompletionStreamResponseChoicesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionStreamResponseChoicesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionStreamResponseChoicesInner> get serializer => _$CreateChatCompletionStreamResponseChoicesInnerSerializer();
}

class _$CreateChatCompletionStreamResponseChoicesInnerSerializer implements PrimitiveSerializer<CreateChatCompletionStreamResponseChoicesInner> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionStreamResponseChoicesInner, _$CreateChatCompletionStreamResponseChoicesInner];

  @override
  final String wireName = r'CreateChatCompletionStreamResponseChoicesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionStreamResponseChoicesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'delta';
    yield serializers.serialize(
      object.delta,
      specifiedType: const FullType(ChatCompletionStreamResponseDelta),
    );
    if (object.logprobs != null) {
      yield r'logprobs';
      yield serializers.serialize(
        object.logprobs,
        specifiedType: const FullType.nullable(CreateChatCompletionResponseChoicesInnerLogprobs),
      );
    }
    yield r'finish_reason';
    yield object.finishReason == null ? null : serializers.serialize(
      object.finishReason,
      specifiedType: const FullType.nullable(CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum),
    );
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateChatCompletionStreamResponseChoicesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateChatCompletionStreamResponseChoicesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'delta':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionStreamResponseDelta),
          ) as ChatCompletionStreamResponseDelta;
          result.delta.replace(valueDes);
          break;
        case r'logprobs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateChatCompletionResponseChoicesInnerLogprobs),
          ) as CreateChatCompletionResponseChoicesInnerLogprobs?;
          if (valueDes == null) continue;
          result.logprobs.replace(valueDes);
          break;
        case r'finish_reason':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum),
          ) as CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum?;
          if (valueDes == null) continue;
          result.finishReason = valueDes;
          break;
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.index = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateChatCompletionStreamResponseChoicesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionStreamResponseChoicesInnerBuilder();
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

class CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum extends EnumClass {

  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueEnumConst(wireName: r'stop')
  static const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum stop = _$createChatCompletionStreamResponseChoicesInnerFinishReasonEnum_stop;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueEnumConst(wireName: r'length')
  static const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum length = _$createChatCompletionStreamResponseChoicesInnerFinishReasonEnum_length;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueEnumConst(wireName: r'tool_calls')
  static const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum toolCalls = _$createChatCompletionStreamResponseChoicesInnerFinishReasonEnum_toolCalls;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueEnumConst(wireName: r'content_filter')
  static const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum contentFilter = _$createChatCompletionStreamResponseChoicesInnerFinishReasonEnum_contentFilter;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueEnumConst(wireName: r'function_call')
  static const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum functionCall = _$createChatCompletionStreamResponseChoicesInnerFinishReasonEnum_functionCall;

  static Serializer<CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum> get serializer => _$createChatCompletionStreamResponseChoicesInnerFinishReasonEnumSerializer;

  const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum._(String name): super(name);

  static BuiltSet<CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum> get values => _$createChatCompletionStreamResponseChoicesInnerFinishReasonEnumValues;
  static CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum valueOf(String name) => _$createChatCompletionStreamResponseChoicesInnerFinishReasonEnumValueOf(name);
}

