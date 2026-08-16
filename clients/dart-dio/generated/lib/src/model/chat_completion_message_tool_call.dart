//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/chat_completion_message_tool_call_function.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_message_tool_call.g.dart';

/// ChatCompletionMessageToolCall
///
/// Properties:
/// * [id] - The ID of the tool call.
/// * [type] - The type of the tool. Currently, only `function` is supported.
/// * [function_] 
@BuiltValue()
abstract class ChatCompletionMessageToolCall implements Built<ChatCompletionMessageToolCall, ChatCompletionMessageToolCallBuilder> {
  /// The ID of the tool call.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The type of the tool. Currently, only `function` is supported.
  @BuiltValueField(wireName: r'type')
  ChatCompletionMessageToolCallTypeEnum get type;
  // enum typeEnum {  function,  };

  @BuiltValueField(wireName: r'function')
  ChatCompletionMessageToolCallFunction get function_;

  ChatCompletionMessageToolCall._();

  factory ChatCompletionMessageToolCall([void updates(ChatCompletionMessageToolCallBuilder b)]) = _$ChatCompletionMessageToolCall;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionMessageToolCallBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionMessageToolCall> get serializer => _$ChatCompletionMessageToolCallSerializer();
}

class _$ChatCompletionMessageToolCallSerializer implements PrimitiveSerializer<ChatCompletionMessageToolCall> {
  @override
  final Iterable<Type> types = const [ChatCompletionMessageToolCall, _$ChatCompletionMessageToolCall];

  @override
  final String wireName = r'ChatCompletionMessageToolCall';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionMessageToolCall object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(ChatCompletionMessageToolCallTypeEnum),
    );
    yield r'function';
    yield serializers.serialize(
      object.function_,
      specifiedType: const FullType(ChatCompletionMessageToolCallFunction),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionMessageToolCall object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionMessageToolCallBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionMessageToolCallTypeEnum),
          ) as ChatCompletionMessageToolCallTypeEnum;
          result.type = valueDes;
          break;
        case r'function':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionMessageToolCallFunction),
          ) as ChatCompletionMessageToolCallFunction;
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
  ChatCompletionMessageToolCall deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionMessageToolCallBuilder();
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

class ChatCompletionMessageToolCallTypeEnum extends EnumClass {

  /// The type of the tool. Currently, only `function` is supported.
  @BuiltValueEnumConst(wireName: r'function')
  static const ChatCompletionMessageToolCallTypeEnum function_ = _$chatCompletionMessageToolCallTypeEnum_function_;

  static Serializer<ChatCompletionMessageToolCallTypeEnum> get serializer => _$chatCompletionMessageToolCallTypeEnumSerializer;

  const ChatCompletionMessageToolCallTypeEnum._(String name): super(name);

  static BuiltSet<ChatCompletionMessageToolCallTypeEnum> get values => _$chatCompletionMessageToolCallTypeEnumValues;
  static ChatCompletionMessageToolCallTypeEnum valueOf(String name) => _$chatCompletionMessageToolCallTypeEnumValueOf(name);
}

