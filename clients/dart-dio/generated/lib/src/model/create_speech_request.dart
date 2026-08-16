//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_speech_request_model.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_speech_request.g.dart';

/// CreateSpeechRequest
///
/// Properties:
/// * [model] 
/// * [input] - The text to generate audio for. The maximum length is 4096 characters.
/// * [voice] - The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
/// * [responseFormat] - The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
/// * [speed] - The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
@BuiltValue()
abstract class CreateSpeechRequest implements Built<CreateSpeechRequest, CreateSpeechRequestBuilder> {
  @BuiltValueField(wireName: r'model')
  CreateSpeechRequestModel get model;

  /// The text to generate audio for. The maximum length is 4096 characters.
  @BuiltValueField(wireName: r'input')
  String get input;

  /// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
  @BuiltValueField(wireName: r'voice')
  CreateSpeechRequestVoiceEnum get voice;
  // enum voiceEnum {  alloy,  echo,  fable,  onyx,  nova,  shimmer,  };

  /// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  @BuiltValueField(wireName: r'response_format')
  CreateSpeechRequestResponseFormatEnum? get responseFormat;
  // enum responseFormatEnum {  mp3,  opus,  aac,  flac,  wav,  pcm,  };

  /// The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
  @BuiltValueField(wireName: r'speed')
  num? get speed;

  CreateSpeechRequest._();

  factory CreateSpeechRequest([void updates(CreateSpeechRequestBuilder b)]) = _$CreateSpeechRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateSpeechRequestBuilder b) => b
      ..responseFormat = CreateSpeechRequestResponseFormatEnum.valueOf('mp3')
      ..speed = 1;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateSpeechRequest> get serializer => _$CreateSpeechRequestSerializer();
}

class _$CreateSpeechRequestSerializer implements PrimitiveSerializer<CreateSpeechRequest> {
  @override
  final Iterable<Type> types = const [CreateSpeechRequest, _$CreateSpeechRequest];

  @override
  final String wireName = r'CreateSpeechRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateSpeechRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'model';
    yield serializers.serialize(
      object.model,
      specifiedType: const FullType(CreateSpeechRequestModel),
    );
    yield r'input';
    yield serializers.serialize(
      object.input,
      specifiedType: const FullType(String),
    );
    yield r'voice';
    yield serializers.serialize(
      object.voice,
      specifiedType: const FullType(CreateSpeechRequestVoiceEnum),
    );
    if (object.responseFormat != null) {
      yield r'response_format';
      yield serializers.serialize(
        object.responseFormat,
        specifiedType: const FullType(CreateSpeechRequestResponseFormatEnum),
      );
    }
    if (object.speed != null) {
      yield r'speed';
      yield serializers.serialize(
        object.speed,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateSpeechRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateSpeechRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateSpeechRequestModel),
          ) as CreateSpeechRequestModel;
          result.model.replace(valueDes);
          break;
        case r'input':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.input = valueDes;
          break;
        case r'voice':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateSpeechRequestVoiceEnum),
          ) as CreateSpeechRequestVoiceEnum;
          result.voice = valueDes;
          break;
        case r'response_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateSpeechRequestResponseFormatEnum),
          ) as CreateSpeechRequestResponseFormatEnum;
          result.responseFormat = valueDes;
          break;
        case r'speed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.speed = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateSpeechRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateSpeechRequestBuilder();
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

class CreateSpeechRequestVoiceEnum extends EnumClass {

  /// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
  @BuiltValueEnumConst(wireName: r'alloy')
  static const CreateSpeechRequestVoiceEnum alloy = _$createSpeechRequestVoiceEnum_alloy;
  /// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
  @BuiltValueEnumConst(wireName: r'echo')
  static const CreateSpeechRequestVoiceEnum echo = _$createSpeechRequestVoiceEnum_echo;
  /// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
  @BuiltValueEnumConst(wireName: r'fable')
  static const CreateSpeechRequestVoiceEnum fable = _$createSpeechRequestVoiceEnum_fable;
  /// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
  @BuiltValueEnumConst(wireName: r'onyx')
  static const CreateSpeechRequestVoiceEnum onyx = _$createSpeechRequestVoiceEnum_onyx;
  /// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
  @BuiltValueEnumConst(wireName: r'nova')
  static const CreateSpeechRequestVoiceEnum nova = _$createSpeechRequestVoiceEnum_nova;
  /// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
  @BuiltValueEnumConst(wireName: r'shimmer')
  static const CreateSpeechRequestVoiceEnum shimmer = _$createSpeechRequestVoiceEnum_shimmer;

  static Serializer<CreateSpeechRequestVoiceEnum> get serializer => _$createSpeechRequestVoiceEnumSerializer;

  const CreateSpeechRequestVoiceEnum._(String name): super(name);

  static BuiltSet<CreateSpeechRequestVoiceEnum> get values => _$createSpeechRequestVoiceEnumValues;
  static CreateSpeechRequestVoiceEnum valueOf(String name) => _$createSpeechRequestVoiceEnumValueOf(name);
}

class CreateSpeechRequestResponseFormatEnum extends EnumClass {

  /// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  @BuiltValueEnumConst(wireName: r'mp3')
  static const CreateSpeechRequestResponseFormatEnum mp3 = _$createSpeechRequestResponseFormatEnum_mp3;
  /// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  @BuiltValueEnumConst(wireName: r'opus')
  static const CreateSpeechRequestResponseFormatEnum opus = _$createSpeechRequestResponseFormatEnum_opus;
  /// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  @BuiltValueEnumConst(wireName: r'aac')
  static const CreateSpeechRequestResponseFormatEnum aac = _$createSpeechRequestResponseFormatEnum_aac;
  /// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  @BuiltValueEnumConst(wireName: r'flac')
  static const CreateSpeechRequestResponseFormatEnum flac = _$createSpeechRequestResponseFormatEnum_flac;
  /// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  @BuiltValueEnumConst(wireName: r'wav')
  static const CreateSpeechRequestResponseFormatEnum wav = _$createSpeechRequestResponseFormatEnum_wav;
  /// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  @BuiltValueEnumConst(wireName: r'pcm')
  static const CreateSpeechRequestResponseFormatEnum pcm = _$createSpeechRequestResponseFormatEnum_pcm;

  static Serializer<CreateSpeechRequestResponseFormatEnum> get serializer => _$createSpeechRequestResponseFormatEnumSerializer;

  const CreateSpeechRequestResponseFormatEnum._(String name): super(name);

  static BuiltSet<CreateSpeechRequestResponseFormatEnum> get values => _$createSpeechRequestResponseFormatEnumValues;
  static CreateSpeechRequestResponseFormatEnum valueOf(String name) => _$createSpeechRequestResponseFormatEnumValueOf(name);
}

