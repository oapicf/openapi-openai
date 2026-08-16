//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_response_create_params_max_response_output_tokens.dart';
import 'package:openapi/src/model/realtime_session_create_response_turn_detection.dart';
import 'package:openapi/src/model/realtime_response_create_params_tools_inner.dart';
import 'package:openapi/src/model/realtime_session_input_audio_transcription.dart';
import 'package:openapi/src/model/realtime_session_create_response_client_secret.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_session_create_response.g.dart';

/// A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
///
/// Properties:
/// * [clientSecret] 
/// * [modalities] - The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
/// * [instructions] - The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
/// * [voice] - The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
/// * [inputAudioFormat] - The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
/// * [outputAudioFormat] - The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
/// * [inputAudioTranscription] 
/// * [turnDetection] 
/// * [tools] - Tools (functions) available to the model.
/// * [toolChoice] - How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
/// * [temperature] - Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
/// * [maxResponseOutputTokens] 
@BuiltValue()
abstract class RealtimeSessionCreateResponse implements Built<RealtimeSessionCreateResponse, RealtimeSessionCreateResponseBuilder> {
  @BuiltValueField(wireName: r'client_secret')
  RealtimeSessionCreateResponseClientSecret? get clientSecret;

  /// The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  @BuiltValueField(wireName: r'modalities')
  BuiltList<RealtimeSessionCreateResponseModalitiesEnum>? get modalities;
  // enum modalitiesEnum {  text,  audio,  };

  /// The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  @BuiltValueField(wireName: r'instructions')
  String? get instructions;

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueField(wireName: r'voice')
  RealtimeSessionCreateResponseVoiceEnum? get voice;
  // enum voiceEnum {  alloy,  ash,  ballad,  coral,  echo,  sage,  shimmer,  verse,  };

  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueField(wireName: r'input_audio_format')
  String? get inputAudioFormat;

  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueField(wireName: r'output_audio_format')
  String? get outputAudioFormat;

  @BuiltValueField(wireName: r'input_audio_transcription')
  RealtimeSessionInputAudioTranscription? get inputAudioTranscription;

  @BuiltValueField(wireName: r'turn_detection')
  RealtimeSessionCreateResponseTurnDetection? get turnDetection;

  /// Tools (functions) available to the model.
  @BuiltValueField(wireName: r'tools')
  BuiltList<RealtimeResponseCreateParamsToolsInner>? get tools;

  /// How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
  @BuiltValueField(wireName: r'tool_choice')
  String? get toolChoice;

  /// Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
  @BuiltValueField(wireName: r'temperature')
  num? get temperature;

  @BuiltValueField(wireName: r'max_response_output_tokens')
  RealtimeResponseCreateParamsMaxResponseOutputTokens? get maxResponseOutputTokens;

  RealtimeSessionCreateResponse._();

  factory RealtimeSessionCreateResponse([void updates(RealtimeSessionCreateResponseBuilder b)]) = _$RealtimeSessionCreateResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeSessionCreateResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeSessionCreateResponse> get serializer => _$RealtimeSessionCreateResponseSerializer();
}

class _$RealtimeSessionCreateResponseSerializer implements PrimitiveSerializer<RealtimeSessionCreateResponse> {
  @override
  final Iterable<Type> types = const [RealtimeSessionCreateResponse, _$RealtimeSessionCreateResponse];

  @override
  final String wireName = r'RealtimeSessionCreateResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeSessionCreateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.clientSecret != null) {
      yield r'client_secret';
      yield serializers.serialize(
        object.clientSecret,
        specifiedType: const FullType(RealtimeSessionCreateResponseClientSecret),
      );
    }
    if (object.modalities != null) {
      yield r'modalities';
      yield serializers.serialize(
        object.modalities,
        specifiedType: const FullType(BuiltList, [FullType(RealtimeSessionCreateResponseModalitiesEnum)]),
      );
    }
    if (object.instructions != null) {
      yield r'instructions';
      yield serializers.serialize(
        object.instructions,
        specifiedType: const FullType(String),
      );
    }
    if (object.voice != null) {
      yield r'voice';
      yield serializers.serialize(
        object.voice,
        specifiedType: const FullType(RealtimeSessionCreateResponseVoiceEnum),
      );
    }
    if (object.inputAudioFormat != null) {
      yield r'input_audio_format';
      yield serializers.serialize(
        object.inputAudioFormat,
        specifiedType: const FullType(String),
      );
    }
    if (object.outputAudioFormat != null) {
      yield r'output_audio_format';
      yield serializers.serialize(
        object.outputAudioFormat,
        specifiedType: const FullType(String),
      );
    }
    if (object.inputAudioTranscription != null) {
      yield r'input_audio_transcription';
      yield serializers.serialize(
        object.inputAudioTranscription,
        specifiedType: const FullType(RealtimeSessionInputAudioTranscription),
      );
    }
    if (object.turnDetection != null) {
      yield r'turn_detection';
      yield serializers.serialize(
        object.turnDetection,
        specifiedType: const FullType(RealtimeSessionCreateResponseTurnDetection),
      );
    }
    if (object.tools != null) {
      yield r'tools';
      yield serializers.serialize(
        object.tools,
        specifiedType: const FullType(BuiltList, [FullType(RealtimeResponseCreateParamsToolsInner)]),
      );
    }
    if (object.toolChoice != null) {
      yield r'tool_choice';
      yield serializers.serialize(
        object.toolChoice,
        specifiedType: const FullType(String),
      );
    }
    if (object.temperature != null) {
      yield r'temperature';
      yield serializers.serialize(
        object.temperature,
        specifiedType: const FullType(num),
      );
    }
    if (object.maxResponseOutputTokens != null) {
      yield r'max_response_output_tokens';
      yield serializers.serialize(
        object.maxResponseOutputTokens,
        specifiedType: const FullType(RealtimeResponseCreateParamsMaxResponseOutputTokens),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeSessionCreateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeSessionCreateResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'client_secret':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionCreateResponseClientSecret),
          ) as RealtimeSessionCreateResponseClientSecret;
          result.clientSecret.replace(valueDes);
          break;
        case r'modalities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RealtimeSessionCreateResponseModalitiesEnum)]),
          ) as BuiltList<RealtimeSessionCreateResponseModalitiesEnum>;
          result.modalities.replace(valueDes);
          break;
        case r'instructions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.instructions = valueDes;
          break;
        case r'voice':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionCreateResponseVoiceEnum),
          ) as RealtimeSessionCreateResponseVoiceEnum;
          result.voice = valueDes;
          break;
        case r'input_audio_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.inputAudioFormat = valueDes;
          break;
        case r'output_audio_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.outputAudioFormat = valueDes;
          break;
        case r'input_audio_transcription':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionInputAudioTranscription),
          ) as RealtimeSessionInputAudioTranscription;
          result.inputAudioTranscription.replace(valueDes);
          break;
        case r'turn_detection':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionCreateResponseTurnDetection),
          ) as RealtimeSessionCreateResponseTurnDetection;
          result.turnDetection.replace(valueDes);
          break;
        case r'tools':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RealtimeResponseCreateParamsToolsInner)]),
          ) as BuiltList<RealtimeResponseCreateParamsToolsInner>;
          result.tools.replace(valueDes);
          break;
        case r'tool_choice':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.toolChoice = valueDes;
          break;
        case r'temperature':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.temperature = valueDes;
          break;
        case r'max_response_output_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponseCreateParamsMaxResponseOutputTokens),
          ) as RealtimeResponseCreateParamsMaxResponseOutputTokens;
          result.maxResponseOutputTokens.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeSessionCreateResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeSessionCreateResponseBuilder();
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

class RealtimeSessionCreateResponseModalitiesEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const RealtimeSessionCreateResponseModalitiesEnum text = _$realtimeSessionCreateResponseModalitiesEnum_text;
  @BuiltValueEnumConst(wireName: r'audio')
  static const RealtimeSessionCreateResponseModalitiesEnum audio = _$realtimeSessionCreateResponseModalitiesEnum_audio;

  static Serializer<RealtimeSessionCreateResponseModalitiesEnum> get serializer => _$realtimeSessionCreateResponseModalitiesEnumSerializer;

  const RealtimeSessionCreateResponseModalitiesEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionCreateResponseModalitiesEnum> get values => _$realtimeSessionCreateResponseModalitiesEnumValues;
  static RealtimeSessionCreateResponseModalitiesEnum valueOf(String name) => _$realtimeSessionCreateResponseModalitiesEnumValueOf(name);
}

class RealtimeSessionCreateResponseVoiceEnum extends EnumClass {

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'alloy')
  static const RealtimeSessionCreateResponseVoiceEnum alloy = _$realtimeSessionCreateResponseVoiceEnum_alloy;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'ash')
  static const RealtimeSessionCreateResponseVoiceEnum ash = _$realtimeSessionCreateResponseVoiceEnum_ash;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'ballad')
  static const RealtimeSessionCreateResponseVoiceEnum ballad = _$realtimeSessionCreateResponseVoiceEnum_ballad;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'coral')
  static const RealtimeSessionCreateResponseVoiceEnum coral = _$realtimeSessionCreateResponseVoiceEnum_coral;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'echo')
  static const RealtimeSessionCreateResponseVoiceEnum echo = _$realtimeSessionCreateResponseVoiceEnum_echo;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'sage')
  static const RealtimeSessionCreateResponseVoiceEnum sage = _$realtimeSessionCreateResponseVoiceEnum_sage;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'shimmer')
  static const RealtimeSessionCreateResponseVoiceEnum shimmer = _$realtimeSessionCreateResponseVoiceEnum_shimmer;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'verse')
  static const RealtimeSessionCreateResponseVoiceEnum verse = _$realtimeSessionCreateResponseVoiceEnum_verse;

  static Serializer<RealtimeSessionCreateResponseVoiceEnum> get serializer => _$realtimeSessionCreateResponseVoiceEnumSerializer;

  const RealtimeSessionCreateResponseVoiceEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionCreateResponseVoiceEnum> get values => _$realtimeSessionCreateResponseVoiceEnumValues;
  static RealtimeSessionCreateResponseVoiceEnum valueOf(String name) => _$realtimeSessionCreateResponseVoiceEnumValueOf(name);
}

