//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_response_message.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_chat_completion_function_response_choices_inner.g.dart';

/// CreateChatCompletionFunctionResponseChoicesInner
///
/// Properties:
/// * [finishReason] - The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
/// * [index] - The index of the choice in the list of choices.
/// * [message] 
@BuiltValue()
abstract class CreateChatCompletionFunctionResponseChoicesInner implements Built<CreateChatCompletionFunctionResponseChoicesInner, CreateChatCompletionFunctionResponseChoicesInnerBuilder> {
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
  @BuiltValueField(wireName: r'finish_reason')
  CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum get finishReason;
  // enum finishReasonEnum {  stop,  length,  function_call,  content_filter,  };

  /// The index of the choice in the list of choices.
  @BuiltValueField(wireName: r'index')
  int get index;

  @BuiltValueField(wireName: r'message')
  ChatCompletionResponseMessage get message;

  CreateChatCompletionFunctionResponseChoicesInner._();

  factory CreateChatCompletionFunctionResponseChoicesInner([void updates(CreateChatCompletionFunctionResponseChoicesInnerBuilder b)]) = _$CreateChatCompletionFunctionResponseChoicesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionFunctionResponseChoicesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionFunctionResponseChoicesInner> get serializer => _$CreateChatCompletionFunctionResponseChoicesInnerSerializer();
}

class _$CreateChatCompletionFunctionResponseChoicesInnerSerializer implements PrimitiveSerializer<CreateChatCompletionFunctionResponseChoicesInner> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionFunctionResponseChoicesInner, _$CreateChatCompletionFunctionResponseChoicesInner];

  @override
  final String wireName = r'CreateChatCompletionFunctionResponseChoicesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionFunctionResponseChoicesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'finish_reason';
    yield serializers.serialize(
      object.finishReason,
      specifiedType: const FullType(CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum),
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
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateChatCompletionFunctionResponseChoicesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateChatCompletionFunctionResponseChoicesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'finish_reason':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum),
          ) as CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum;
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateChatCompletionFunctionResponseChoicesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionFunctionResponseChoicesInnerBuilder();
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

class CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum extends EnumClass {

  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
  @BuiltValueEnumConst(wireName: r'stop')
  static const CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum stop = _$createChatCompletionFunctionResponseChoicesInnerFinishReasonEnum_stop;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
  @BuiltValueEnumConst(wireName: r'length')
  static const CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum length = _$createChatCompletionFunctionResponseChoicesInnerFinishReasonEnum_length;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
  @BuiltValueEnumConst(wireName: r'function_call')
  static const CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum functionCall = _$createChatCompletionFunctionResponseChoicesInnerFinishReasonEnum_functionCall;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
  @BuiltValueEnumConst(wireName: r'content_filter')
  static const CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum contentFilter = _$createChatCompletionFunctionResponseChoicesInnerFinishReasonEnum_contentFilter;

  static Serializer<CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum> get serializer => _$createChatCompletionFunctionResponseChoicesInnerFinishReasonEnumSerializer;

  const CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum._(String name): super(name);

  static BuiltSet<CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum> get values => _$createChatCompletionFunctionResponseChoicesInnerFinishReasonEnumValues;
  static CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum valueOf(String name) => _$createChatCompletionFunctionResponseChoicesInnerFinishReasonEnumValueOf(name);
}

