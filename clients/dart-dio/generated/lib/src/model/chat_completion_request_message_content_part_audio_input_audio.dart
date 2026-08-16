//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_message_content_part_audio_input_audio.g.dart';

/// ChatCompletionRequestMessageContentPartAudioInputAudio
///
/// Properties:
/// * [data] - Base64 encoded audio data.
/// * [format] - The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
@BuiltValue()
abstract class ChatCompletionRequestMessageContentPartAudioInputAudio implements Built<ChatCompletionRequestMessageContentPartAudioInputAudio, ChatCompletionRequestMessageContentPartAudioInputAudioBuilder> {
  /// Base64 encoded audio data.
  @BuiltValueField(wireName: r'data')
  String get data;

  /// The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
  @BuiltValueField(wireName: r'format')
  ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum get format;
  // enum formatEnum {  wav,  mp3,  };

  ChatCompletionRequestMessageContentPartAudioInputAudio._();

  factory ChatCompletionRequestMessageContentPartAudioInputAudio([void updates(ChatCompletionRequestMessageContentPartAudioInputAudioBuilder b)]) = _$ChatCompletionRequestMessageContentPartAudioInputAudio;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestMessageContentPartAudioInputAudioBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestMessageContentPartAudioInputAudio> get serializer => _$ChatCompletionRequestMessageContentPartAudioInputAudioSerializer();
}

class _$ChatCompletionRequestMessageContentPartAudioInputAudioSerializer implements PrimitiveSerializer<ChatCompletionRequestMessageContentPartAudioInputAudio> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestMessageContentPartAudioInputAudio, _$ChatCompletionRequestMessageContentPartAudioInputAudio];

  @override
  final String wireName = r'ChatCompletionRequestMessageContentPartAudioInputAudio';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestMessageContentPartAudioInputAudio object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(String),
    );
    yield r'format';
    yield serializers.serialize(
      object.format,
      specifiedType: const FullType(ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestMessageContentPartAudioInputAudio object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestMessageContentPartAudioInputAudioBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.data = valueDes;
          break;
        case r'format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum),
          ) as ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum;
          result.format = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionRequestMessageContentPartAudioInputAudio deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestMessageContentPartAudioInputAudioBuilder();
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

class ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum extends EnumClass {

  /// The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
  @BuiltValueEnumConst(wireName: r'wav')
  static const ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum wav = _$chatCompletionRequestMessageContentPartAudioInputAudioFormatEnum_wav;
  /// The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
  @BuiltValueEnumConst(wireName: r'mp3')
  static const ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum mp3 = _$chatCompletionRequestMessageContentPartAudioInputAudioFormatEnum_mp3;

  static Serializer<ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum> get serializer => _$chatCompletionRequestMessageContentPartAudioInputAudioFormatEnumSerializer;

  const ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum> get values => _$chatCompletionRequestMessageContentPartAudioInputAudioFormatEnumValues;
  static ChatCompletionRequestMessageContentPartAudioInputAudioFormatEnum valueOf(String name) => _$chatCompletionRequestMessageContentPartAudioInputAudioFormatEnumValueOf(name);
}

