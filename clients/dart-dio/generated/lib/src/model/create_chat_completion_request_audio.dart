//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_chat_completion_request_audio.g.dart';

/// Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
///
/// Properties:
/// * [voice] - The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
/// * [format] - Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
@BuiltValue()
abstract class CreateChatCompletionRequestAudio implements Built<CreateChatCompletionRequestAudio, CreateChatCompletionRequestAudioBuilder> {
  /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  @BuiltValueField(wireName: r'voice')
  CreateChatCompletionRequestAudioVoiceEnum get voice;
  // enum voiceEnum {  alloy,  ash,  ballad,  coral,  echo,  sage,  shimmer,  verse,  };

  /// Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
  @BuiltValueField(wireName: r'format')
  CreateChatCompletionRequestAudioFormatEnum get format;
  // enum formatEnum {  wav,  mp3,  flac,  opus,  pcm16,  };

  CreateChatCompletionRequestAudio._();

  factory CreateChatCompletionRequestAudio([void updates(CreateChatCompletionRequestAudioBuilder b)]) = _$CreateChatCompletionRequestAudio;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionRequestAudioBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionRequestAudio> get serializer => _$CreateChatCompletionRequestAudioSerializer();
}

class _$CreateChatCompletionRequestAudioSerializer implements PrimitiveSerializer<CreateChatCompletionRequestAudio> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionRequestAudio, _$CreateChatCompletionRequestAudio];

  @override
  final String wireName = r'CreateChatCompletionRequestAudio';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionRequestAudio object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'voice';
    yield serializers.serialize(
      object.voice,
      specifiedType: const FullType(CreateChatCompletionRequestAudioVoiceEnum),
    );
    yield r'format';
    yield serializers.serialize(
      object.format,
      specifiedType: const FullType(CreateChatCompletionRequestAudioFormatEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateChatCompletionRequestAudio object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateChatCompletionRequestAudioBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'voice':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateChatCompletionRequestAudioVoiceEnum),
          ) as CreateChatCompletionRequestAudioVoiceEnum;
          result.voice = valueDes;
          break;
        case r'format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateChatCompletionRequestAudioFormatEnum),
          ) as CreateChatCompletionRequestAudioFormatEnum;
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
  CreateChatCompletionRequestAudio deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionRequestAudioBuilder();
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

class CreateChatCompletionRequestAudioVoiceEnum extends EnumClass {

  /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  @BuiltValueEnumConst(wireName: r'alloy')
  static const CreateChatCompletionRequestAudioVoiceEnum alloy = _$createChatCompletionRequestAudioVoiceEnum_alloy;
  /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  @BuiltValueEnumConst(wireName: r'ash')
  static const CreateChatCompletionRequestAudioVoiceEnum ash = _$createChatCompletionRequestAudioVoiceEnum_ash;
  /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  @BuiltValueEnumConst(wireName: r'ballad')
  static const CreateChatCompletionRequestAudioVoiceEnum ballad = _$createChatCompletionRequestAudioVoiceEnum_ballad;
  /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  @BuiltValueEnumConst(wireName: r'coral')
  static const CreateChatCompletionRequestAudioVoiceEnum coral = _$createChatCompletionRequestAudioVoiceEnum_coral;
  /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  @BuiltValueEnumConst(wireName: r'echo')
  static const CreateChatCompletionRequestAudioVoiceEnum echo = _$createChatCompletionRequestAudioVoiceEnum_echo;
  /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  @BuiltValueEnumConst(wireName: r'sage')
  static const CreateChatCompletionRequestAudioVoiceEnum sage = _$createChatCompletionRequestAudioVoiceEnum_sage;
  /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  @BuiltValueEnumConst(wireName: r'shimmer')
  static const CreateChatCompletionRequestAudioVoiceEnum shimmer = _$createChatCompletionRequestAudioVoiceEnum_shimmer;
  /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  @BuiltValueEnumConst(wireName: r'verse')
  static const CreateChatCompletionRequestAudioVoiceEnum verse = _$createChatCompletionRequestAudioVoiceEnum_verse;

  static Serializer<CreateChatCompletionRequestAudioVoiceEnum> get serializer => _$createChatCompletionRequestAudioVoiceEnumSerializer;

  const CreateChatCompletionRequestAudioVoiceEnum._(String name): super(name);

  static BuiltSet<CreateChatCompletionRequestAudioVoiceEnum> get values => _$createChatCompletionRequestAudioVoiceEnumValues;
  static CreateChatCompletionRequestAudioVoiceEnum valueOf(String name) => _$createChatCompletionRequestAudioVoiceEnumValueOf(name);
}

class CreateChatCompletionRequestAudioFormatEnum extends EnumClass {

  /// Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
  @BuiltValueEnumConst(wireName: r'wav')
  static const CreateChatCompletionRequestAudioFormatEnum wav = _$createChatCompletionRequestAudioFormatEnum_wav;
  /// Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
  @BuiltValueEnumConst(wireName: r'mp3')
  static const CreateChatCompletionRequestAudioFormatEnum mp3 = _$createChatCompletionRequestAudioFormatEnum_mp3;
  /// Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
  @BuiltValueEnumConst(wireName: r'flac')
  static const CreateChatCompletionRequestAudioFormatEnum flac = _$createChatCompletionRequestAudioFormatEnum_flac;
  /// Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
  @BuiltValueEnumConst(wireName: r'opus')
  static const CreateChatCompletionRequestAudioFormatEnum opus = _$createChatCompletionRequestAudioFormatEnum_opus;
  /// Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
  @BuiltValueEnumConst(wireName: r'pcm16')
  static const CreateChatCompletionRequestAudioFormatEnum pcm16 = _$createChatCompletionRequestAudioFormatEnum_pcm16;

  static Serializer<CreateChatCompletionRequestAudioFormatEnum> get serializer => _$createChatCompletionRequestAudioFormatEnumSerializer;

  const CreateChatCompletionRequestAudioFormatEnum._(String name): super(name);

  static BuiltSet<CreateChatCompletionRequestAudioFormatEnum> get values => _$createChatCompletionRequestAudioFormatEnumValues;
  static CreateChatCompletionRequestAudioFormatEnum valueOf(String name) => _$createChatCompletionRequestAudioFormatEnumValueOf(name);
}

