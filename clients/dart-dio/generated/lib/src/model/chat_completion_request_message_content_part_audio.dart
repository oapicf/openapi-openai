//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_request_message_content_part_audio_input_audio.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_message_content_part_audio.g.dart';

/// Learn about [audio inputs](/docs/guides/audio). 
///
/// Properties:
/// * [type] - The type of the content part. Always `input_audio`.
/// * [inputAudio] 
@BuiltValue()
abstract class ChatCompletionRequestMessageContentPartAudio implements Built<ChatCompletionRequestMessageContentPartAudio, ChatCompletionRequestMessageContentPartAudioBuilder> {
  /// The type of the content part. Always `input_audio`.
  @BuiltValueField(wireName: r'type')
  ChatCompletionRequestMessageContentPartAudioTypeEnum get type;
  // enum typeEnum {  input_audio,  };

  @BuiltValueField(wireName: r'input_audio')
  ChatCompletionRequestMessageContentPartAudioInputAudio get inputAudio;

  ChatCompletionRequestMessageContentPartAudio._();

  factory ChatCompletionRequestMessageContentPartAudio([void updates(ChatCompletionRequestMessageContentPartAudioBuilder b)]) = _$ChatCompletionRequestMessageContentPartAudio;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestMessageContentPartAudioBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestMessageContentPartAudio> get serializer => _$ChatCompletionRequestMessageContentPartAudioSerializer();
}

class _$ChatCompletionRequestMessageContentPartAudioSerializer implements PrimitiveSerializer<ChatCompletionRequestMessageContentPartAudio> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestMessageContentPartAudio, _$ChatCompletionRequestMessageContentPartAudio];

  @override
  final String wireName = r'ChatCompletionRequestMessageContentPartAudio';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestMessageContentPartAudio object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(ChatCompletionRequestMessageContentPartAudioTypeEnum),
    );
    yield r'input_audio';
    yield serializers.serialize(
      object.inputAudio,
      specifiedType: const FullType(ChatCompletionRequestMessageContentPartAudioInputAudio),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestMessageContentPartAudio object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestMessageContentPartAudioBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestMessageContentPartAudioTypeEnum),
          ) as ChatCompletionRequestMessageContentPartAudioTypeEnum;
          result.type = valueDes;
          break;
        case r'input_audio':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestMessageContentPartAudioInputAudio),
          ) as ChatCompletionRequestMessageContentPartAudioInputAudio;
          result.inputAudio.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionRequestMessageContentPartAudio deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestMessageContentPartAudioBuilder();
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

class ChatCompletionRequestMessageContentPartAudioTypeEnum extends EnumClass {

  /// The type of the content part. Always `input_audio`.
  @BuiltValueEnumConst(wireName: r'input_audio')
  static const ChatCompletionRequestMessageContentPartAudioTypeEnum inputAudio = _$chatCompletionRequestMessageContentPartAudioTypeEnum_inputAudio;

  static Serializer<ChatCompletionRequestMessageContentPartAudioTypeEnum> get serializer => _$chatCompletionRequestMessageContentPartAudioTypeEnumSerializer;

  const ChatCompletionRequestMessageContentPartAudioTypeEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestMessageContentPartAudioTypeEnum> get values => _$chatCompletionRequestMessageContentPartAudioTypeEnumValues;
  static ChatCompletionRequestMessageContentPartAudioTypeEnum valueOf(String name) => _$chatCompletionRequestMessageContentPartAudioTypeEnumValueOf(name);
}

