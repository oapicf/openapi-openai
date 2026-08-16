//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_request_system_message_content.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_system_message.g.dart';

/// Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. 
///
/// Properties:
/// * [content] 
/// * [role] - The role of the messages author, in this case `system`.
/// * [name] - An optional name for the participant. Provides the model information to differentiate between participants of the same role.
@BuiltValue()
abstract class ChatCompletionRequestSystemMessage implements Built<ChatCompletionRequestSystemMessage, ChatCompletionRequestSystemMessageBuilder> {
  @BuiltValueField(wireName: r'content')
  ChatCompletionRequestSystemMessageContent get content;

  /// The role of the messages author, in this case `system`.
  @BuiltValueField(wireName: r'role')
  ChatCompletionRequestSystemMessageRoleEnum get role;
  // enum roleEnum {  system,  };

  /// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  @BuiltValueField(wireName: r'name')
  String? get name;

  ChatCompletionRequestSystemMessage._();

  factory ChatCompletionRequestSystemMessage([void updates(ChatCompletionRequestSystemMessageBuilder b)]) = _$ChatCompletionRequestSystemMessage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestSystemMessageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestSystemMessage> get serializer => _$ChatCompletionRequestSystemMessageSerializer();
}

class _$ChatCompletionRequestSystemMessageSerializer implements PrimitiveSerializer<ChatCompletionRequestSystemMessage> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestSystemMessage, _$ChatCompletionRequestSystemMessage];

  @override
  final String wireName = r'ChatCompletionRequestSystemMessage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestSystemMessage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'content';
    yield serializers.serialize(
      object.content,
      specifiedType: const FullType(ChatCompletionRequestSystemMessageContent),
    );
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(ChatCompletionRequestSystemMessageRoleEnum),
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
    ChatCompletionRequestSystemMessage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestSystemMessageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestSystemMessageContent),
          ) as ChatCompletionRequestSystemMessageContent;
          result.content.replace(valueDes);
          break;
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestSystemMessageRoleEnum),
          ) as ChatCompletionRequestSystemMessageRoleEnum;
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
  ChatCompletionRequestSystemMessage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestSystemMessageBuilder();
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

class ChatCompletionRequestSystemMessageRoleEnum extends EnumClass {

  /// The role of the messages author, in this case `system`.
  @BuiltValueEnumConst(wireName: r'system')
  static const ChatCompletionRequestSystemMessageRoleEnum system = _$chatCompletionRequestSystemMessageRoleEnum_system;

  static Serializer<ChatCompletionRequestSystemMessageRoleEnum> get serializer => _$chatCompletionRequestSystemMessageRoleEnumSerializer;

  const ChatCompletionRequestSystemMessageRoleEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestSystemMessageRoleEnum> get values => _$chatCompletionRequestSystemMessageRoleEnumValues;
  static ChatCompletionRequestSystemMessageRoleEnum valueOf(String name) => _$chatCompletionRequestSystemMessageRoleEnumValueOf(name);
}

