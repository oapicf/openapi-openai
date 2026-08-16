//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_response_create_params_max_response_output_tokens.dart';
import 'package:openapi/src/model/realtime_session_create_request_turn_detection.dart';
import 'package:openapi/src/model/realtime_response_create_params_tools_inner.dart';
import 'package:openapi/src/model/realtime_session_input_audio_transcription.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_session_create_request.g.dart';

/// Realtime session object configuration.
///
/// Properties:
/// * [modalities] - The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
/// * [model] - The Realtime model used for this session. 
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
abstract class RealtimeSessionCreateRequest implements Built<RealtimeSessionCreateRequest, RealtimeSessionCreateRequestBuilder> {
  /// The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  @BuiltValueField(wireName: r'modalities')
  BuiltList<RealtimeSessionCreateRequestModalitiesEnum>? get modalities;
  // enum modalitiesEnum {  text,  audio,  };

  /// The Realtime model used for this session. 
  @BuiltValueField(wireName: r'model')
  RealtimeSessionCreateRequestModelEnum get model;
  // enum modelEnum {  gpt-4o-realtime-preview,  gpt-4o-realtime-preview-2024-10-01,  gpt-4o-realtime-preview-2024-12-17,  gpt-4o-mini-realtime-preview,  gpt-4o-mini-realtime-preview-2024-12-17,  };

  /// The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  @BuiltValueField(wireName: r'instructions')
  String? get instructions;

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueField(wireName: r'voice')
  RealtimeSessionCreateRequestVoiceEnum? get voice;
  // enum voiceEnum {  alloy,  ash,  ballad,  coral,  echo,  sage,  shimmer,  verse,  };

  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueField(wireName: r'input_audio_format')
  RealtimeSessionCreateRequestInputAudioFormatEnum? get inputAudioFormat;
  // enum inputAudioFormatEnum {  pcm16,  g711_ulaw,  g711_alaw,  };

  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueField(wireName: r'output_audio_format')
  RealtimeSessionCreateRequestOutputAudioFormatEnum? get outputAudioFormat;
  // enum outputAudioFormatEnum {  pcm16,  g711_ulaw,  g711_alaw,  };

  @BuiltValueField(wireName: r'input_audio_transcription')
  RealtimeSessionInputAudioTranscription? get inputAudioTranscription;

  @BuiltValueField(wireName: r'turn_detection')
  RealtimeSessionCreateRequestTurnDetection? get turnDetection;

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

  RealtimeSessionCreateRequest._();

  factory RealtimeSessionCreateRequest([void updates(RealtimeSessionCreateRequestBuilder b)]) = _$RealtimeSessionCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeSessionCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeSessionCreateRequest> get serializer => _$RealtimeSessionCreateRequestSerializer();
}

class _$RealtimeSessionCreateRequestSerializer implements PrimitiveSerializer<RealtimeSessionCreateRequest> {
  @override
  final Iterable<Type> types = const [RealtimeSessionCreateRequest, _$RealtimeSessionCreateRequest];

  @override
  final String wireName = r'RealtimeSessionCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeSessionCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.modalities != null) {
      yield r'modalities';
      yield serializers.serialize(
        object.modalities,
        specifiedType: const FullType(BuiltList, [FullType(RealtimeSessionCreateRequestModalitiesEnum)]),
      );
    }
    yield r'model';
    yield serializers.serialize(
      object.model,
      specifiedType: const FullType(RealtimeSessionCreateRequestModelEnum),
    );
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
        specifiedType: const FullType(RealtimeSessionCreateRequestVoiceEnum),
      );
    }
    if (object.inputAudioFormat != null) {
      yield r'input_audio_format';
      yield serializers.serialize(
        object.inputAudioFormat,
        specifiedType: const FullType(RealtimeSessionCreateRequestInputAudioFormatEnum),
      );
    }
    if (object.outputAudioFormat != null) {
      yield r'output_audio_format';
      yield serializers.serialize(
        object.outputAudioFormat,
        specifiedType: const FullType(RealtimeSessionCreateRequestOutputAudioFormatEnum),
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
        specifiedType: const FullType(RealtimeSessionCreateRequestTurnDetection),
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
    RealtimeSessionCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeSessionCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'modalities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RealtimeSessionCreateRequestModalitiesEnum)]),
          ) as BuiltList<RealtimeSessionCreateRequestModalitiesEnum>;
          result.modalities.replace(valueDes);
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionCreateRequestModelEnum),
          ) as RealtimeSessionCreateRequestModelEnum;
          result.model = valueDes;
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
            specifiedType: const FullType(RealtimeSessionCreateRequestVoiceEnum),
          ) as RealtimeSessionCreateRequestVoiceEnum;
          result.voice = valueDes;
          break;
        case r'input_audio_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionCreateRequestInputAudioFormatEnum),
          ) as RealtimeSessionCreateRequestInputAudioFormatEnum;
          result.inputAudioFormat = valueDes;
          break;
        case r'output_audio_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionCreateRequestOutputAudioFormatEnum),
          ) as RealtimeSessionCreateRequestOutputAudioFormatEnum;
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
            specifiedType: const FullType(RealtimeSessionCreateRequestTurnDetection),
          ) as RealtimeSessionCreateRequestTurnDetection;
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
  RealtimeSessionCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeSessionCreateRequestBuilder();
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

class RealtimeSessionCreateRequestModalitiesEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const RealtimeSessionCreateRequestModalitiesEnum text = _$realtimeSessionCreateRequestModalitiesEnum_text;
  @BuiltValueEnumConst(wireName: r'audio')
  static const RealtimeSessionCreateRequestModalitiesEnum audio = _$realtimeSessionCreateRequestModalitiesEnum_audio;

  static Serializer<RealtimeSessionCreateRequestModalitiesEnum> get serializer => _$realtimeSessionCreateRequestModalitiesEnumSerializer;

  const RealtimeSessionCreateRequestModalitiesEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionCreateRequestModalitiesEnum> get values => _$realtimeSessionCreateRequestModalitiesEnumValues;
  static RealtimeSessionCreateRequestModalitiesEnum valueOf(String name) => _$realtimeSessionCreateRequestModalitiesEnumValueOf(name);
}

class RealtimeSessionCreateRequestModelEnum extends EnumClass {

  /// The Realtime model used for this session. 
  @BuiltValueEnumConst(wireName: r'gpt-4o-realtime-preview')
  static const RealtimeSessionCreateRequestModelEnum gpt4oRealtimePreview = _$realtimeSessionCreateRequestModelEnum_gpt4oRealtimePreview;
  /// The Realtime model used for this session. 
  @BuiltValueEnumConst(wireName: r'gpt-4o-realtime-preview-2024-10-01')
  static const RealtimeSessionCreateRequestModelEnum gpt4oRealtimePreview20241001 = _$realtimeSessionCreateRequestModelEnum_gpt4oRealtimePreview20241001;
  /// The Realtime model used for this session. 
  @BuiltValueEnumConst(wireName: r'gpt-4o-realtime-preview-2024-12-17')
  static const RealtimeSessionCreateRequestModelEnum gpt4oRealtimePreview20241217 = _$realtimeSessionCreateRequestModelEnum_gpt4oRealtimePreview20241217;
  /// The Realtime model used for this session. 
  @BuiltValueEnumConst(wireName: r'gpt-4o-mini-realtime-preview')
  static const RealtimeSessionCreateRequestModelEnum gpt4oMiniRealtimePreview = _$realtimeSessionCreateRequestModelEnum_gpt4oMiniRealtimePreview;
  /// The Realtime model used for this session. 
  @BuiltValueEnumConst(wireName: r'gpt-4o-mini-realtime-preview-2024-12-17')
  static const RealtimeSessionCreateRequestModelEnum gpt4oMiniRealtimePreview20241217 = _$realtimeSessionCreateRequestModelEnum_gpt4oMiniRealtimePreview20241217;

  static Serializer<RealtimeSessionCreateRequestModelEnum> get serializer => _$realtimeSessionCreateRequestModelEnumSerializer;

  const RealtimeSessionCreateRequestModelEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionCreateRequestModelEnum> get values => _$realtimeSessionCreateRequestModelEnumValues;
  static RealtimeSessionCreateRequestModelEnum valueOf(String name) => _$realtimeSessionCreateRequestModelEnumValueOf(name);
}

class RealtimeSessionCreateRequestVoiceEnum extends EnumClass {

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'alloy')
  static const RealtimeSessionCreateRequestVoiceEnum alloy = _$realtimeSessionCreateRequestVoiceEnum_alloy;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'ash')
  static const RealtimeSessionCreateRequestVoiceEnum ash = _$realtimeSessionCreateRequestVoiceEnum_ash;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'ballad')
  static const RealtimeSessionCreateRequestVoiceEnum ballad = _$realtimeSessionCreateRequestVoiceEnum_ballad;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'coral')
  static const RealtimeSessionCreateRequestVoiceEnum coral = _$realtimeSessionCreateRequestVoiceEnum_coral;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'echo')
  static const RealtimeSessionCreateRequestVoiceEnum echo = _$realtimeSessionCreateRequestVoiceEnum_echo;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'sage')
  static const RealtimeSessionCreateRequestVoiceEnum sage = _$realtimeSessionCreateRequestVoiceEnum_sage;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'shimmer')
  static const RealtimeSessionCreateRequestVoiceEnum shimmer = _$realtimeSessionCreateRequestVoiceEnum_shimmer;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'verse')
  static const RealtimeSessionCreateRequestVoiceEnum verse = _$realtimeSessionCreateRequestVoiceEnum_verse;

  static Serializer<RealtimeSessionCreateRequestVoiceEnum> get serializer => _$realtimeSessionCreateRequestVoiceEnumSerializer;

  const RealtimeSessionCreateRequestVoiceEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionCreateRequestVoiceEnum> get values => _$realtimeSessionCreateRequestVoiceEnumValues;
  static RealtimeSessionCreateRequestVoiceEnum valueOf(String name) => _$realtimeSessionCreateRequestVoiceEnumValueOf(name);
}

class RealtimeSessionCreateRequestInputAudioFormatEnum extends EnumClass {

  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'pcm16')
  static const RealtimeSessionCreateRequestInputAudioFormatEnum pcm16 = _$realtimeSessionCreateRequestInputAudioFormatEnum_pcm16;
  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'g711_ulaw')
  static const RealtimeSessionCreateRequestInputAudioFormatEnum g711Ulaw = _$realtimeSessionCreateRequestInputAudioFormatEnum_g711Ulaw;
  /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'g711_alaw')
  static const RealtimeSessionCreateRequestInputAudioFormatEnum g711Alaw = _$realtimeSessionCreateRequestInputAudioFormatEnum_g711Alaw;

  static Serializer<RealtimeSessionCreateRequestInputAudioFormatEnum> get serializer => _$realtimeSessionCreateRequestInputAudioFormatEnumSerializer;

  const RealtimeSessionCreateRequestInputAudioFormatEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionCreateRequestInputAudioFormatEnum> get values => _$realtimeSessionCreateRequestInputAudioFormatEnumValues;
  static RealtimeSessionCreateRequestInputAudioFormatEnum valueOf(String name) => _$realtimeSessionCreateRequestInputAudioFormatEnumValueOf(name);
}

class RealtimeSessionCreateRequestOutputAudioFormatEnum extends EnumClass {

  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'pcm16')
  static const RealtimeSessionCreateRequestOutputAudioFormatEnum pcm16 = _$realtimeSessionCreateRequestOutputAudioFormatEnum_pcm16;
  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'g711_ulaw')
  static const RealtimeSessionCreateRequestOutputAudioFormatEnum g711Ulaw = _$realtimeSessionCreateRequestOutputAudioFormatEnum_g711Ulaw;
  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'g711_alaw')
  static const RealtimeSessionCreateRequestOutputAudioFormatEnum g711Alaw = _$realtimeSessionCreateRequestOutputAudioFormatEnum_g711Alaw;

  static Serializer<RealtimeSessionCreateRequestOutputAudioFormatEnum> get serializer => _$realtimeSessionCreateRequestOutputAudioFormatEnumSerializer;

  const RealtimeSessionCreateRequestOutputAudioFormatEnum._(String name): super(name);

  static BuiltSet<RealtimeSessionCreateRequestOutputAudioFormatEnum> get values => _$realtimeSessionCreateRequestOutputAudioFormatEnumValues;
  static RealtimeSessionCreateRequestOutputAudioFormatEnum valueOf(String name) => _$realtimeSessionCreateRequestOutputAudioFormatEnumValueOf(name);
}

