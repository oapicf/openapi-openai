//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_request_tool_message_content.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_tool_message.g.dart';

/// ChatCompletionRequestToolMessage
///
/// Properties:
/// * [role] - The role of the messages author, in this case `tool`.
/// * [content] 
/// * [toolCallId] - Tool call that this message is responding to.
@BuiltValue()
abstract class ChatCompletionRequestToolMessage implements Built<ChatCompletionRequestToolMessage, ChatCompletionRequestToolMessageBuilder> {
  /// The role of the messages author, in this case `tool`.
  @BuiltValueField(wireName: r'role')
  ChatCompletionRequestToolMessageRoleEnum get role;
  // enum roleEnum {  tool,  };

  @BuiltValueField(wireName: r'content')
  ChatCompletionRequestToolMessageContent get content;

  /// Tool call that this message is responding to.
  @BuiltValueField(wireName: r'tool_call_id')
  String get toolCallId;

  ChatCompletionRequestToolMessage._();

  factory ChatCompletionRequestToolMessage([void updates(ChatCompletionRequestToolMessageBuilder b)]) = _$ChatCompletionRequestToolMessage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestToolMessageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestToolMessage> get serializer => _$ChatCompletionRequestToolMessageSerializer();
}

class _$ChatCompletionRequestToolMessageSerializer implements PrimitiveSerializer<ChatCompletionRequestToolMessage> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestToolMessage, _$ChatCompletionRequestToolMessage];

  @override
  final String wireName = r'ChatCompletionRequestToolMessage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestToolMessage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'role';
    yield serializers.serialize(
      object.role,
      specifiedType: const FullType(ChatCompletionRequestToolMessageRoleEnum),
    );
    yield r'content';
    yield serializers.serialize(
      object.content,
      specifiedType: const FullType(ChatCompletionRequestToolMessageContent),
    );
    yield r'tool_call_id';
    yield serializers.serialize(
      object.toolCallId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestToolMessage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestToolMessageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'role':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestToolMessageRoleEnum),
          ) as ChatCompletionRequestToolMessageRoleEnum;
          result.role = valueDes;
          break;
        case r'content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestToolMessageContent),
          ) as ChatCompletionRequestToolMessageContent;
          result.content.replace(valueDes);
          break;
        case r'tool_call_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.toolCallId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionRequestToolMessage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestToolMessageBuilder();
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

class ChatCompletionRequestToolMessageRoleEnum extends EnumClass {

  /// The role of the messages author, in this case `tool`.
  @BuiltValueEnumConst(wireName: r'tool')
  static const ChatCompletionRequestToolMessageRoleEnum tool = _$chatCompletionRequestToolMessageRoleEnum_tool;

  static Serializer<ChatCompletionRequestToolMessageRoleEnum> get serializer => _$chatCompletionRequestToolMessageRoleEnumSerializer;

  const ChatCompletionRequestToolMessageRoleEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestToolMessageRoleEnum> get values => _$chatCompletionRequestToolMessageRoleEnumValues;
  static ChatCompletionRequestToolMessageRoleEnum valueOf(String name) => _$chatCompletionRequestToolMessageRoleEnumValueOf(name);
}

