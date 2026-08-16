//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/chat_completion_request_developer_message_content.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_developer_message.g.dart';

/// Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
///
/// Properties:
/// * [content] 
/// * [role] - The role of the messages author, in this case `developer`.
/// * [name] - An optional name for the participant. Provides the model information to differentiate between participants of the same role.
@BuiltValue()
abstract class ChatCompletionRequestDeveloperMessage implements Built<ChatCompletionRequestDeveloperMessage, ChatCompletionRequestDeveloperMessageBuilder> {
  @BuiltValueField(wireName: r'content')
  ChatCompletionRequestDeveloperMessageContent get content;

  /// The role of the messages author, in this case `developer`.
  @BuiltValueField(wireName: r'role')
  ChatCompletionRequestDeveloperMessageRoleEnum get role;
  // enum roleEnum {  developer,  };

  /// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  @BuiltValueField(wireName: r'name')
  String? get name;

  ChatCompletionRequestDeveloperMessage._();

  factory ChatCompletionRequestDeveloperMessage([void updates(ChatCompletionRequestDeveloperMessageBuilder b)]) = _$ChatCompletionRequestDeveloperMessage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestDeveloperMessageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestDeveloperMessage> get serializer => _$ChatCompletionRequestDeveloperMessageSerializer();
}

class _$ChatCompletionRequestDeveloperMessageSerializer implements PrimitiveSerializer<ChatCompletionRequestDeveloperMessage> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestDeveloperMessage, _$ChatCompletionRequestDeveloperMessage];

  @override
  final String wireName = r'ChatCompletionRequestDeveloperMessage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestDeveloperMessage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'content';
    yield serializers.serialize(
      object.content,
      specifiedType: const FullType(ChatCompletionRequestDeveloperMessageContent),
    );
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(ChatCompletionRequestDeveloperMessageRoleEnum),
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
    ChatCompletionRequestDeveloperMessage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestDeveloperMessageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestDeveloperMessageContent),
          ) as ChatCompletionRequestDeveloperMessageContent;
          result.content.replace(valueDes);
          break;
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestDeveloperMessageRoleEnum),
          ) as ChatCompletionRequestDeveloperMessageRoleEnum;
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
  ChatCompletionRequestDeveloperMessage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestDeveloperMessageBuilder();
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

class ChatCompletionRequestDeveloperMessageRoleEnum extends EnumClass {

  /// The role of the messages author, in this case `developer`.
  @BuiltValueEnumConst(wireName: r'developer')
  static const ChatCompletionRequestDeveloperMessageRoleEnum developer = _$chatCompletionRequestDeveloperMessageRoleEnum_developer;

  static Serializer<ChatCompletionRequestDeveloperMessageRoleEnum> get serializer => _$chatCompletionRequestDeveloperMessageRoleEnumSerializer;

  const ChatCompletionRequestDeveloperMessageRoleEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestDeveloperMessageRoleEnum> get values => _$chatCompletionRequestDeveloperMessageRoleEnumValues;
  static ChatCompletionRequestDeveloperMessageRoleEnum valueOf(String name) => _$chatCompletionRequestDeveloperMessageRoleEnumValueOf(name);
}

