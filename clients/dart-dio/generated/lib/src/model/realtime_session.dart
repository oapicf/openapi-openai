//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_session_model.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_response_create_params_max_response_output_tokens.dart';
import 'package:openapi/src/model/realtime_session_turn_detection.dart';
import 'package:openapi/src/model/realtime_response_create_params_tools_inner.dart';
import 'package:openapi/src/model/realtime_session_input_audio_transcription.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_session.g.dart';

/// Realtime session object configuration.
///
/// Properties:
/// * [id] - Unique identifier for the session object. 
/// * [modalities] - The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
/// * [model] 
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
abstract class RealtimeSession implements Built<RealtimeSession, RealtimeSessionBuilder> {
  /// Unique identifier for the session object. 
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  @BuiltValueField(wireName: r'modalities')
  BuiltList<RealtimeSessionModalitiesEnum>? get modalities;
  // enum modalitiesEnum {  text,  audio,  };

  @BuiltValueField(wireName: r'model')
  RealtimeSessionModel? get model;

  /// The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  @BuiltValueField(wireName: r'instructions')
  String? get instructions;

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueField(wireName: r'voice')
  RealtimeSessionVoiceEnum? get voice;
  // enum voiceEnum {  alloy,  ash,  ballad,  coral,  echo,  sage,  shimmer,  verse,  };

  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueField(wireName: r'input_audio_format')
  RealtimeSessionInputAudioFormatEnum? get inputAudioFormat;
  // enum inputAudioFormatEnum {  pcm16,  g711_ulaw,  g711_alaw,  };

  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueField(wireName: r'output_audio_format')
  RealtimeSessionOutputAudioFormatEnum? get outputAudioFormat;
  // enum outputAudioFormatEnum {  pcm16,  g711_ulaw,  g711_alaw,  };

  @BuiltValueField(wireName: r'input_audio_transcription')
  RealtimeSessionInputAudioTranscription? get inputAudioTranscription;

  @BuiltValueField(wireName: r'turn_detection')
  RealtimeSessionTurnDetection? get turnDetection;

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

  RealtimeSession._();

  factory RealtimeSession([void updates(RealtimeSessionBuilder b)]) = _$RealtimeSession;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeSessionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeSession> get serializer => _$RealtimeSessionSerializer();
}

class _$RealtimeSessionSerializer implements PrimitiveSerializer<RealtimeSession> {
  @override
  final Iterable<Type> types = const [RealtimeSession, _$RealtimeSession];

  @override
  final String wireName = r'RealtimeSession';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeSession object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.modalities != null) {
      yield r'modalities';
      yield serializers.serialize(
        object.modalities,
        specifiedType: const FullType(BuiltList, [FullType(RealtimeSessionModalitiesEnum)]),
      );
    }
    if (object.model != null) {
      yield r'model';
      yield serializers.serialize(
        object.model,
        specifiedType: const FullType(RealtimeSessionModel),
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
        specifiedType: const FullType(RealtimeSessionVoiceEnum),
      );
    }
    if (object.inputAudioFormat != null) {
      yield r'input_audio_format';
      yield serializers.serialize(
        object.inputAudioFormat,
        specifiedType: const FullType(RealtimeSessionInputAudioFormatEnum),
      );
    }
    if (object.outputAudioFormat != null) {
      yield r'output_audio_format';
      yield serializers.serialize(
        object.outputAudioFormat,
        specifiedType: const FullType(RealtimeSessionOutputAudioFormatEnum),
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
        specifiedType: const FullType.nullable(RealtimeSessionTurnDetection),
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
    RealtimeSession object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeSessionBuilder result,
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
        case r'modalities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RealtimeSessionModalitiesEnum)]),
          ) as BuiltList<RealtimeSessionModalitiesEnum>;
          result.modalities.replace(valueDes);
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionModel),
          ) as RealtimeSessionModel;
          result.model.replace(valueDes);
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
            specifiedType: const FullType(RealtimeSessionVoiceEnum),
          ) as RealtimeSessionVoiceEnum;
          result.voice = valueDes;
          break;
        case r'input_audio_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionInputAudioFormatEnum),
          ) as RealtimeSessionInputAudioFormatEnum;
          result.inputAudioFormat = valueDes;
          break;
        case r'output_audio_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionOutputAudioFormatEnum),
          ) as RealtimeSessionOutputAudioFormatEnum;
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
            specifiedType: const FullType.nullable(RealtimeSessionTurnDetection),
          ) as RealtimeSessionTurnDetection?;
          if (valueDes == null) continue;
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
  RealtimeSession deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeSessionBuilder();
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

class RealtimeSessionModalitiesEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const RealtimeSessionModalitiesEnum text = _$realtimeSessionModalitiesEnum_text;
  @BuiltValueEnumConst(wireName: r'audio')
  static const RealtimeSessionModalitiesEnum audio = _$realtimeSessionModalitiesEnum_audio;

  static Serializer<RealtimeSessionModalitiesEnum> get serializer => _$realtimeSessionModalitiesEnumSerializer;

  const RealtimeSessionModalitiesEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionModalitiesEnum> get values => _$realtimeSessionModalitiesEnumValues;
  static RealtimeSessionModalitiesEnum valueOf(String name) => _$realtimeSessionModalitiesEnumValueOf(name);
}

class RealtimeSessionVoiceEnum extends EnumClass {

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'alloy')
  static const RealtimeSessionVoiceEnum alloy = _$realtimeSessionVoiceEnum_alloy;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'ash')
  static const RealtimeSessionVoiceEnum ash = _$realtimeSessionVoiceEnum_ash;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'ballad')
  static const RealtimeSessionVoiceEnum ballad = _$realtimeSessionVoiceEnum_ballad;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'coral')
  static const RealtimeSessionVoiceEnum coral = _$realtimeSessionVoiceEnum_coral;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'echo')
  static const RealtimeSessionVoiceEnum echo = _$realtimeSessionVoiceEnum_echo;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'sage')
  static const RealtimeSessionVoiceEnum sage = _$realtimeSessionVoiceEnum_sage;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'shimmer')
  static const RealtimeSessionVoiceEnum shimmer = _$realtimeSessionVoiceEnum_shimmer;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'verse')
  static const RealtimeSessionVoiceEnum verse = _$realtimeSessionVoiceEnum_verse;

  static Serializer<RealtimeSessionVoiceEnum> get serializer => _$realtimeSessionVoiceEnumSerializer;

  const RealtimeSessionVoiceEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionVoiceEnum> get values => _$realtimeSessionVoiceEnumValues;
  static RealtimeSessionVoiceEnum valueOf(String name) => _$realtimeSessionVoiceEnumValueOf(name);
}

class RealtimeSessionInputAudioFormatEnum extends EnumClass {

  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'pcm16')
  static const RealtimeSessionInputAudioFormatEnum pcm16 = _$realtimeSessionInputAudioFormatEnum_pcm16;
  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'g711_ulaw')
  static const RealtimeSessionInputAudioFormatEnum g711Ulaw = _$realtimeSessionInputAudioFormatEnum_g711Ulaw;
  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'g711_alaw')
  static const RealtimeSessionInputAudioFormatEnum g711Alaw = _$realtimeSessionInputAudioFormatEnum_g711Alaw;

  static Serializer<RealtimeSessionInputAudioFormatEnum> get serializer => _$realtimeSessionInputAudioFormatEnumSerializer;

  const RealtimeSessionInputAudioFormatEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionInputAudioFormatEnum> get values => _$realtimeSessionInputAudioFormatEnumValues;
  static RealtimeSessionInputAudioFormatEnum valueOf(String name) => _$realtimeSessionInputAudioFormatEnumValueOf(name);
}

class RealtimeSessionOutputAudioFormatEnum extends EnumClass {

  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'pcm16')
  static const RealtimeSessionOutputAudioFormatEnum pcm16 = _$realtimeSessionOutputAudioFormatEnum_pcm16;
  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'g711_ulaw')
  static const RealtimeSessionOutputAudioFormatEnum g711Ulaw = _$realtimeSessionOutputAudioFormatEnum_g711Ulaw;
  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'g711_alaw')
  static const RealtimeSessionOutputAudioFormatEnum g711Alaw = _$realtimeSessionOutputAudioFormatEnum_g711Alaw;

  static Serializer<RealtimeSessionOutputAudioFormatEnum> get serializer => _$realtimeSessionOutputAudioFormatEnumSerializer;

  const RealtimeSessionOutputAudioFormatEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionOutputAudioFormatEnum> get values => _$realtimeSessionOutputAudioFormatEnumValues;
  static RealtimeSessionOutputAudioFormatEnum valueOf(String name) => _$realtimeSessionOutputAudioFormatEnumValueOf(name);
}

