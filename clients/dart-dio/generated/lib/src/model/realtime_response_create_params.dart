//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_conversation_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_response_create_params_max_response_output_tokens.dart';
import 'package:openapi/src/model/realtime_response_create_params_conversation.dart';
import 'package:openapi/src/model/realtime_response_create_params_tools_inner.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_response_create_params.g.dart';

/// Create a new Realtime response with these parameters
///
/// Properties:
/// * [modalities] - The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
/// * [instructions] - The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
/// * [voice] - The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
/// * [outputAudioFormat] - The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
/// * [tools] - Tools (functions) available to the model.
/// * [toolChoice] - How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
/// * [temperature] - Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
/// * [maxResponseOutputTokens] 
/// * [conversation] 
/// * [metadata] - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
/// * [input] - Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
@BuiltValue()
abstract class RealtimeResponseCreateParams implements Built<RealtimeResponseCreateParams, RealtimeResponseCreateParamsBuilder> {
  /// The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  @BuiltValueField(wireName: r'modalities')
  BuiltList<RealtimeResponseCreateParamsModalitiesEnum>? get modalities;
  // enum modalitiesEnum {  text,  audio,  };

  /// The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  @BuiltValueField(wireName: r'instructions')
  String? get instructions;

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueField(wireName: r'voice')
  RealtimeResponseCreateParamsVoiceEnum? get voice;
  // enum voiceEnum {  alloy,  ash,  ballad,  coral,  echo,  sage,  shimmer,  verse,  };

  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueField(wireName: r'output_audio_format')
  RealtimeResponseCreateParamsOutputAudioFormatEnum? get outputAudioFormat;
  // enum outputAudioFormatEnum {  pcm16,  g711_ulaw,  g711_alaw,  };

  /// Tools (functions) available to the model.
  @BuiltValueField(wireName: r'tools')
  BuiltList<RealtimeResponseCreateParamsToolsInner>? get tools;

  /// How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
  @BuiltValueField(wireName: r'tool_choice')
  String? get toolChoice;

  /// Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
  @BuiltValueField(wireName: r'temperature')
  num? get temperature;

  @BuiltValueField(wireName: r'max_response_output_tokens')
  RealtimeResponseCreateParamsMaxResponseOutputTokens? get maxResponseOutputTokens;

  @BuiltValueField(wireName: r'conversation')
  RealtimeResponseCreateParamsConversation? get conversation;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  /// Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
  @BuiltValueField(wireName: r'input')
  BuiltList<RealtimeConversationItem>? get input;

  RealtimeResponseCreateParams._();

  factory RealtimeResponseCreateParams([void updates(RealtimeResponseCreateParamsBuilder b)]) = _$RealtimeResponseCreateParams;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeResponseCreateParamsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeResponseCreateParams> get serializer => _$RealtimeResponseCreateParamsSerializer();
}

class _$RealtimeResponseCreateParamsSerializer implements PrimitiveSerializer<RealtimeResponseCreateParams> {
  @override
  final Iterable<Type> types = const [RealtimeResponseCreateParams, _$RealtimeResponseCreateParams];

  @override
  final String wireName = r'RealtimeResponseCreateParams';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeResponseCreateParams object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.modalities != null) {
      yield r'modalities';
      yield serializers.serialize(
        object.modalities,
        specifiedType: const FullType(BuiltList, [FullType(RealtimeResponseCreateParamsModalitiesEnum)]),
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
        specifiedType: const FullType(RealtimeResponseCreateParamsVoiceEnum),
      );
    }
    if (object.outputAudioFormat != null) {
      yield r'output_audio_format';
      yield serializers.serialize(
        object.outputAudioFormat,
        specifiedType: const FullType(RealtimeResponseCreateParamsOutputAudioFormatEnum),
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
    if (object.conversation != null) {
      yield r'conversation';
      yield serializers.serialize(
        object.conversation,
        specifiedType: const FullType(RealtimeResponseCreateParamsConversation),
      );
    }
    if (object.metadata != null) {
      yield r'metadata';
      yield serializers.serialize(
        object.metadata,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
    if (object.input != null) {
      yield r'input';
      yield serializers.serialize(
        object.input,
        specifiedType: const FullType(BuiltList, [FullType(RealtimeConversationItem)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeResponseCreateParams object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeResponseCreateParamsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'modalities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RealtimeResponseCreateParamsModalitiesEnum)]),
          ) as BuiltList<RealtimeResponseCreateParamsModalitiesEnum>;
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
            specifiedType: const FullType(RealtimeResponseCreateParamsVoiceEnum),
          ) as RealtimeResponseCreateParamsVoiceEnum;
          result.voice = valueDes;
          break;
        case r'output_audio_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponseCreateParamsOutputAudioFormatEnum),
          ) as RealtimeResponseCreateParamsOutputAudioFormatEnum;
          result.outputAudioFormat = valueDes;
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
        case r'conversation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponseCreateParamsConversation),
          ) as RealtimeResponseCreateParamsConversation;
          result.conversation.replace(valueDes);
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.metadata = valueDes;
          break;
        case r'input':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RealtimeConversationItem)]),
          ) as BuiltList<RealtimeConversationItem>;
          result.input.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeResponseCreateParams deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeResponseCreateParamsBuilder();
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

class RealtimeResponseCreateParamsModalitiesEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'text')
  static const RealtimeResponseCreateParamsModalitiesEnum text = _$realtimeResponseCreateParamsModalitiesEnum_text;
  @BuiltValueEnumConst(wireName: r'audio')
  static const RealtimeResponseCreateParamsModalitiesEnum audio = _$realtimeResponseCreateParamsModalitiesEnum_audio;

  static Serializer<RealtimeResponseCreateParamsModalitiesEnum> get serializer => _$realtimeResponseCreateParamsModalitiesEnumSerializer;

  const RealtimeResponseCreateParamsModalitiesEnum._(String name): super(name);

  static BuiltSet<RealtimeResponseCreateParamsModalitiesEnum> get values => _$realtimeResponseCreateParamsModalitiesEnumValues;
  static RealtimeResponseCreateParamsModalitiesEnum valueOf(String name) => _$realtimeResponseCreateParamsModalitiesEnumValueOf(name);
}

class RealtimeResponseCreateParamsVoiceEnum extends EnumClass {

  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'alloy')
  static const RealtimeResponseCreateParamsVoiceEnum alloy = _$realtimeResponseCreateParamsVoiceEnum_alloy;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'ash')
  static const RealtimeResponseCreateParamsVoiceEnum ash = _$realtimeResponseCreateParamsVoiceEnum_ash;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'ballad')
  static const RealtimeResponseCreateParamsVoiceEnum ballad = _$realtimeResponseCreateParamsVoiceEnum_ballad;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'coral')
  static const RealtimeResponseCreateParamsVoiceEnum coral = _$realtimeResponseCreateParamsVoiceEnum_coral;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'echo')
  static const RealtimeResponseCreateParamsVoiceEnum echo = _$realtimeResponseCreateParamsVoiceEnum_echo;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'sage')
  static const RealtimeResponseCreateParamsVoiceEnum sage = _$realtimeResponseCreateParamsVoiceEnum_sage;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'shimmer')
  static const RealtimeResponseCreateParamsVoiceEnum shimmer = _$realtimeResponseCreateParamsVoiceEnum_shimmer;
  /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  @BuiltValueEnumConst(wireName: r'verse')
  static const RealtimeResponseCreateParamsVoiceEnum verse = _$realtimeResponseCreateParamsVoiceEnum_verse;

  static Serializer<RealtimeResponseCreateParamsVoiceEnum> get serializer => _$realtimeResponseCreateParamsVoiceEnumSerializer;

  const RealtimeResponseCreateParamsVoiceEnum._(String name): super(name);

  static BuiltSet<RealtimeResponseCreateParamsVoiceEnum> get values => _$realtimeResponseCreateParamsVoiceEnumValues;
  static RealtimeResponseCreateParamsVoiceEnum valueOf(String name) => _$realtimeResponseCreateParamsVoiceEnumValueOf(name);
}

class RealtimeResponseCreateParamsOutputAudioFormatEnum extends EnumClass {

  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'pcm16')
  static const RealtimeResponseCreateParamsOutputAudioFormatEnum pcm16 = _$realtimeResponseCreateParamsOutputAudioFormatEnum_pcm16;
  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'g711_ulaw')
  static const RealtimeResponseCreateParamsOutputAudioFormatEnum g711Ulaw = _$realtimeResponseCreateParamsOutputAudioFormatEnum_g711Ulaw;
  /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  @BuiltValueEnumConst(wireName: r'g711_alaw')
  static const RealtimeResponseCreateParamsOutputAudioFormatEnum g711Alaw = _$realtimeResponseCreateParamsOutputAudioFormatEnum_g711Alaw;

  static Serializer<RealtimeResponseCreateParamsOutputAudioFormatEnum> get serializer => _$realtimeResponseCreateParamsOutputAudioFormatEnumSerializer;

  const RealtimeResponseCreateParamsOutputAudioFormatEnum._(String name): super(name);

  static BuiltSet<RealtimeResponseCreateParamsOutputAudioFormatEnum> get values => _$realtimeResponseCreateParamsOutputAudioFormatEnumValues;
  static RealtimeResponseCreateParamsOutputAudioFormatEnum valueOf(String name) => _$realtimeResponseCreateParamsOutputAudioFormatEnumValueOf(name);
}

