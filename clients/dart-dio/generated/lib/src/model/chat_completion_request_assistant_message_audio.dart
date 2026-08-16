//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_assistant_message_audio.g.dart';

/// Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
///
/// Properties:
/// * [id] - Unique identifier for a previous audio response from the model. 
@BuiltValue()
abstract class ChatCompletionRequestAssistantMessageAudio implements Built<ChatCompletionRequestAssistantMessageAudio, ChatCompletionRequestAssistantMessageAudioBuilder> {
  /// Unique identifier for a previous audio response from the model. 
  @BuiltValueField(wireName: r'id')
  String get id;

  ChatCompletionRequestAssistantMessageAudio._();

  factory ChatCompletionRequestAssistantMessageAudio([void updates(ChatCompletionRequestAssistantMessageAudioBuilder b)]) = _$ChatCompletionRequestAssistantMessageAudio;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestAssistantMessageAudioBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestAssistantMessageAudio> get serializer => _$ChatCompletionRequestAssistantMessageAudioSerializer();
}

class _$ChatCompletionRequestAssistantMessageAudioSerializer implements PrimitiveSerializer<ChatCompletionRequestAssistantMessageAudio> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestAssistantMessageAudio, _$ChatCompletionRequestAssistantMessageAudio];

  @override
  final String wireName = r'ChatCompletionRequestAssistantMessageAudio';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestAssistantMessageAudio object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestAssistantMessageAudio object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestAssistantMessageAudioBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionRequestAssistantMessageAudio deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestAssistantMessageAudioBuilder();
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

