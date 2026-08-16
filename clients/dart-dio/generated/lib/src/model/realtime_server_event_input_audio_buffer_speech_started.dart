//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_input_audio_buffer_speech_started.g.dart';

/// Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `input_audio_buffer.speech_started`.
/// * [audioStartMs] - Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
/// * [itemId] - The ID of the user message item that will be created when speech stops. 
@BuiltValue()
abstract class RealtimeServerEventInputAudioBufferSpeechStarted implements Built<RealtimeServerEventInputAudioBufferSpeechStarted, RealtimeServerEventInputAudioBufferSpeechStartedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `input_audio_buffer.speech_started`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum get type;
  // enum typeEnum {  input_audio_buffer.speech_started,  };

  /// Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
  @BuiltValueField(wireName: r'audio_start_ms')
  int get audioStartMs;

  /// The ID of the user message item that will be created when speech stops. 
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  RealtimeServerEventInputAudioBufferSpeechStarted._();

  factory RealtimeServerEventInputAudioBufferSpeechStarted([void updates(RealtimeServerEventInputAudioBufferSpeechStartedBuilder b)]) = _$RealtimeServerEventInputAudioBufferSpeechStarted;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventInputAudioBufferSpeechStartedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventInputAudioBufferSpeechStarted> get serializer => _$RealtimeServerEventInputAudioBufferSpeechStartedSerializer();
}

class _$RealtimeServerEventInputAudioBufferSpeechStartedSerializer implements PrimitiveSerializer<RealtimeServerEventInputAudioBufferSpeechStarted> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventInputAudioBufferSpeechStarted, _$RealtimeServerEventInputAudioBufferSpeechStarted];

  @override
  final String wireName = r'RealtimeServerEventInputAudioBufferSpeechStarted';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventInputAudioBufferSpeechStarted object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event_id';
    yield serializers.serialize(
      object.eventId,
      specifiedType: const FullType(String),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum),
    );
    yield r'audio_start_ms';
    yield serializers.serialize(
      object.audioStartMs,
      specifiedType: const FullType(int),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventInputAudioBufferSpeechStarted object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventInputAudioBufferSpeechStartedBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.eventId = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum),
          ) as RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum;
          result.type = valueDes;
          break;
        case r'audio_start_ms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.audioStartMs = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventInputAudioBufferSpeechStarted deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventInputAudioBufferSpeechStartedBuilder();
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

class RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum extends EnumClass {

  /// The event type, must be `input_audio_buffer.speech_started`.
  @BuiltValueEnumConst(wireName: r'input_audio_buffer.speech_started')
  static const RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum inputAudioBufferPeriodSpeechStarted = _$realtimeServerEventInputAudioBufferSpeechStartedTypeEnum_inputAudioBufferPeriodSpeechStarted;

  static Serializer<RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum> get serializer => _$realtimeServerEventInputAudioBufferSpeechStartedTypeEnumSerializer;

  const RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum> get values => _$realtimeServerEventInputAudioBufferSpeechStartedTypeEnumValues;
  static RealtimeServerEventInputAudioBufferSpeechStartedTypeEnum valueOf(String name) => _$realtimeServerEventInputAudioBufferSpeechStartedTypeEnumValueOf(name);
}

