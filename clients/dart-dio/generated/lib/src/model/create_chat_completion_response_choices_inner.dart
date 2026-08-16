//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_chat_completion_response_choices_inner_logprobs.dart';
import 'package:openapi/src/model/chat_completion_response_message.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_chat_completion_response_choices_inner.g.dart';

/// CreateChatCompletionResponseChoicesInner
///
/// Properties:
/// * [finishReason] - The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
/// * [index] - The index of the choice in the list of choices.
/// * [message] 
/// * [logprobs] 
@BuiltValue()
abstract class CreateChatCompletionResponseChoicesInner implements Built<CreateChatCompletionResponseChoicesInner, CreateChatCompletionResponseChoicesInnerBuilder> {
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueField(wireName: r'finish_reason')
  CreateChatCompletionResponseChoicesInnerFinishReasonEnum get finishReason;
  // enum finishReasonEnum {  stop,  length,  tool_calls,  content_filter,  function_call,  };

  /// The index of the choice in the list of choices.
  @BuiltValueField(wireName: r'index')
  int get index;

  @BuiltValueField(wireName: r'message')
  ChatCompletionResponseMessage get message;

  @BuiltValueField(wireName: r'logprobs')
  CreateChatCompletionResponseChoicesInnerLogprobs? get logprobs;

  CreateChatCompletionResponseChoicesInner._();

  factory CreateChatCompletionResponseChoicesInner([void updates(CreateChatCompletionResponseChoicesInnerBuilder b)]) = _$CreateChatCompletionResponseChoicesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionResponseChoicesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionResponseChoicesInner> get serializer => _$CreateChatCompletionResponseChoicesInnerSerializer();
}

class _$CreateChatCompletionResponseChoicesInnerSerializer implements PrimitiveSerializer<CreateChatCompletionResponseChoicesInner> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionResponseChoicesInner, _$CreateChatCompletionResponseChoicesInner];

  @override
  final String wireName = r'CreateChatCompletionResponseChoicesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionResponseChoicesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'finish_reason';
    yield serializers.serialize(
      object.finishReason,
      specifiedType: const FullType(CreateChatCompletionResponseChoicesInnerFinishReasonEnum),
    );
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(ChatCompletionResponseMessage),
    );
    yield r'logprobs';
    yield object.logprobs == null ? null : serializers.serialize(
      object.logprobs,
      specifiedType: const FullType.nullable(CreateChatCompletionResponseChoicesInnerLogprobs),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateChatCompletionResponseChoicesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateChatCompletionResponseChoicesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'finish_reason':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateChatCompletionResponseChoicesInnerFinishReasonEnum),
          ) as CreateChatCompletionResponseChoicesInnerFinishReasonEnum;
          result.finishReason = valueDes;
          break;
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.index = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionResponseMessage),
          ) as ChatCompletionResponseMessage;
          result.message.replace(valueDes);
          break;
        case r'logprobs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateChatCompletionResponseChoicesInnerLogprobs),
          ) as CreateChatCompletionResponseChoicesInnerLogprobs?;
          if (valueDes == null) continue;
          result.logprobs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateChatCompletionResponseChoicesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionResponseChoicesInnerBuilder();
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

class CreateChatCompletionResponseChoicesInnerFinishReasonEnum extends EnumClass {

  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueEnumConst(wireName: r'stop')
  static const CreateChatCompletionResponseChoicesInnerFinishReasonEnum stop = _$createChatCompletionResponseChoicesInnerFinishReasonEnum_stop;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueEnumConst(wireName: r'length')
  static const CreateChatCompletionResponseChoicesInnerFinishReasonEnum length = _$createChatCompletionResponseChoicesInnerFinishReasonEnum_length;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueEnumConst(wireName: r'tool_calls')
  static const CreateChatCompletionResponseChoicesInnerFinishReasonEnum toolCalls = _$createChatCompletionResponseChoicesInnerFinishReasonEnum_toolCalls;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueEnumConst(wireName: r'content_filter')
  static const CreateChatCompletionResponseChoicesInnerFinishReasonEnum contentFilter = _$createChatCompletionResponseChoicesInnerFinishReasonEnum_contentFilter;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  @BuiltValueEnumConst(wireName: r'function_call')
  static const CreateChatCompletionResponseChoicesInnerFinishReasonEnum functionCall = _$createChatCompletionResponseChoicesInnerFinishReasonEnum_functionCall;

  static Serializer<CreateChatCompletionResponseChoicesInnerFinishReasonEnum> get serializer => _$createChatCompletionResponseChoicesInnerFinishReasonEnumSerializer;

  const CreateChatCompletionResponseChoicesInnerFinishReasonEnum._(String name): super(name);

  static BuiltSet<CreateChatCompletionResponseChoicesInnerFinishReasonEnum> get values => _$createChatCompletionResponseChoicesInnerFinishReasonEnumValues;
  static CreateChatCompletionResponseChoicesInnerFinishReasonEnum valueOf(String name) => _$createChatCompletionResponseChoicesInnerFinishReasonEnumValueOf(name);
}

