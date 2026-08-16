//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/assistants_named_tool_choice_function.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_named_tool_choice.g.dart';

/// Specifies a tool the model should use. Use to force the model to call a specific function.
///
/// Properties:
/// * [type] - The type of the tool. Currently, only `function` is supported.
/// * [function_] 
@BuiltValue()
abstract class ChatCompletionNamedToolChoice implements Built<ChatCompletionNamedToolChoice, ChatCompletionNamedToolChoiceBuilder> {
  /// The type of the tool. Currently, only `function` is supported.
  @BuiltValueField(wireName: r'type')
  ChatCompletionNamedToolChoiceTypeEnum get type;
  // enum typeEnum {  function,  };

  @BuiltValueField(wireName: r'function')
  AssistantsNamedToolChoiceFunction get function_;

  ChatCompletionNamedToolChoice._();

  factory ChatCompletionNamedToolChoice([void updates(ChatCompletionNamedToolChoiceBuilder b)]) = _$ChatCompletionNamedToolChoice;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionNamedToolChoiceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionNamedToolChoice> get serializer => _$ChatCompletionNamedToolChoiceSerializer();
}

class _$ChatCompletionNamedToolChoiceSerializer implements PrimitiveSerializer<ChatCompletionNamedToolChoice> {
  @override
  final Iterable<Type> types = const [ChatCompletionNamedToolChoice, _$ChatCompletionNamedToolChoice];

  @override
  final String wireName = r'ChatCompletionNamedToolChoice';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionNamedToolChoice object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(ChatCompletionNamedToolChoiceTypeEnum),
    );
    yield r'function';
    yield serializers.serialize(
      object.function_,
      specifiedType: const FullType(AssistantsNamedToolChoiceFunction),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionNamedToolChoice object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionNamedToolChoiceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionNamedToolChoiceTypeEnum),
          ) as ChatCompletionNamedToolChoiceTypeEnum;
          result.type = valueDes;
          break;
        case r'function':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantsNamedToolChoiceFunction),
          ) as AssistantsNamedToolChoiceFunction;
          result.function_.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionNamedToolChoice deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionNamedToolChoiceBuilder();
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

class ChatCompletionNamedToolChoiceTypeEnum extends EnumClass {

  /// The type of the tool. Currently, only `function` is supported.
  @BuiltValueEnumConst(wireName: r'function')
  static const ChatCompletionNamedToolChoiceTypeEnum function_ = _$chatCompletionNamedToolChoiceTypeEnum_function_;

  static Serializer<ChatCompletionNamedToolChoiceTypeEnum> get serializer => _$chatCompletionNamedToolChoiceTypeEnumSerializer;

  const ChatCompletionNamedToolChoiceTypeEnum._(String name): super(name);

  static BuiltSet<ChatCompletionNamedToolChoiceTypeEnum> get values => _$chatCompletionNamedToolChoiceTypeEnumValues;
  static ChatCompletionNamedToolChoiceTypeEnum valueOf(String name) => _$chatCompletionNamedToolChoiceTypeEnumValueOf(name);
}

