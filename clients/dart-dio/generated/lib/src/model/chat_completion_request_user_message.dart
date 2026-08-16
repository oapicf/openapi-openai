//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_request_user_message_content.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_user_message.g.dart';

/// Messages sent by an end user, containing prompts or additional context information. 
///
/// Properties:
/// * [content] 
/// * [role] - The role of the messages author, in this case `user`.
/// * [name] - An optional name for the participant. Provides the model information to differentiate between participants of the same role.
@BuiltValue()
abstract class ChatCompletionRequestUserMessage implements Built<ChatCompletionRequestUserMessage, ChatCompletionRequestUserMessageBuilder> {
  @BuiltValueField(wireName: r'content')
  ChatCompletionRequestUserMessageContent get content;

  /// The role of the messages author, in this case `user`.
  @BuiltValueField(wireName: r'role')
  ChatCompletionRequestUserMessageRoleEnum get role;
  // enum roleEnum {  user,  };

  /// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  @BuiltValueField(wireName: r'name')
  String? get name;

  ChatCompletionRequestUserMessage._();

  factory ChatCompletionRequestUserMessage([void updates(ChatCompletionRequestUserMessageBuilder b)]) = _$ChatCompletionRequestUserMessage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestUserMessageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestUserMessage> get serializer => _$ChatCompletionRequestUserMessageSerializer();
}

class _$ChatCompletionRequestUserMessageSerializer implements PrimitiveSerializer<ChatCompletionRequestUserMessage> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestUserMessage, _$ChatCompletionRequestUserMessage];

  @override
  final String wireName = r'ChatCompletionRequestUserMessage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestUserMessage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'content';
    yield serializers.serialize(
      object.content,
      specifiedType: const FullType(ChatCompletionRequestUserMessageContent),
    );
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(ChatCompletionRequestUserMessageRoleEnum),
    );
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestUserMessage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestUserMessageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestUserMessageContent),
          ) as ChatCompletionRequestUserMessageContent;
          result.content.replace(valueDes);
          break;
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestUserMessageRoleEnum),
          ) as ChatCompletionRequestUserMessageRoleEnum;
          result.role = valueDes;
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
  ChatCompletionRequestUserMessage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestUserMessageBuilder();
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

class ChatCompletionRequestUserMessageRoleEnum extends EnumClass {

  /// The role of the messages author, in this case `user`.
  @BuiltValueEnumConst(wireName: r'user')
  static const ChatCompletionRequestUserMessageRoleEnum user = _$chatCompletionRequestUserMessageRoleEnum_user;

  static Serializer<ChatCompletionRequestUserMessageRoleEnum> get serializer => _$chatCompletionRequestUserMessageRoleEnumSerializer;

  const ChatCompletionRequestUserMessageRoleEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestUserMessageRoleEnum> get values => _$chatCompletionRequestUserMessageRoleEnumValues;
  static ChatCompletionRequestUserMessageRoleEnum valueOf(String name) => _$chatCompletionRequestUserMessageRoleEnumValueOf(name);
}

