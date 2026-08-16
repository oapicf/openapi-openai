//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_function_message.g.dart';

/// ChatCompletionRequestFunctionMessage
///
/// Properties:
/// * [role] - The role of the messages author, in this case `function`.
/// * [content] - The contents of the function message.
/// * [name] - The name of the function to call.
@Deprecated('ChatCompletionRequestFunctionMessage has been deprecated')
@BuiltValue()
abstract class ChatCompletionRequestFunctionMessage implements Built<ChatCompletionRequestFunctionMessage, ChatCompletionRequestFunctionMessageBuilder> {
  /// The role of the messages author, in this case `function`.
  @BuiltValueField(wireName: r'role')
  ChatCompletionRequestFunctionMessageRoleEnum get role;
  // enum roleEnum {  function,  };

  /// The contents of the function message.
  @BuiltValueField(wireName: r'content')
  String? get content;

  /// The name of the function to call.
  @BuiltValueField(wireName: r'name')
  String get name;

  ChatCompletionRequestFunctionMessage._();

  factory ChatCompletionRequestFunctionMessage([void updates(ChatCompletionRequestFunctionMessageBuilder b)]) = _$ChatCompletionRequestFunctionMessage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestFunctionMessageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestFunctionMessage> get serializer => _$ChatCompletionRequestFunctionMessageSerializer();
}

class _$ChatCompletionRequestFunctionMessageSerializer implements PrimitiveSerializer<ChatCompletionRequestFunctionMessage> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestFunctionMessage, _$ChatCompletionRequestFunctionMessage];

  @override
  final String wireName = r'ChatCompletionRequestFunctionMessage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestFunctionMessage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(ChatCompletionRequestFunctionMessageRoleEnum),
    );
    yield r'content';
    yield object.content == null ? null : serializers.serialize(
      object.content,
      specifiedType: const FullType.nullable(String),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestFunctionMessage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestFunctionMessageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestFunctionMessageRoleEnum),
          ) as ChatCompletionRequestFunctionMessageRoleEnum;
          result.role = valueDes;
          break;
        case r'content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.content = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionRequestFunctionMessage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestFunctionMessageBuilder();
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

@Deprecated('ChatCompletionRequestFunctionMessageRoleEnum has been deprecated')
class ChatCompletionRequestFunctionMessageRoleEnum extends EnumClass {

  /// The role of the messages author, in this case `function`.
  @BuiltValueEnumConst(wireName: r'function')
  static const ChatCompletionRequestFunctionMessageRoleEnum function_ = _$chatCompletionRequestFunctionMessageRoleEnum_function_;

  static Serializer<ChatCompletionRequestFunctionMessageRoleEnum> get serializer => _$chatCompletionRequestFunctionMessageRoleEnumSerializer;

  const ChatCompletionRequestFunctionMessageRoleEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestFunctionMessageRoleEnum> get values => _$chatCompletionRequestFunctionMessageRoleEnumValues;
  static ChatCompletionRequestFunctionMessageRoleEnum valueOf(String name) => _$chatCompletionRequestFunctionMessageRoleEnumValueOf(name);
}

