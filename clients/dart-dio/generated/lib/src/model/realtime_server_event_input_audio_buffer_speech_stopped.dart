//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_input_audio_buffer_speech_stopped.g.dart';

/// Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `input_audio_buffer.speech_stopped`.
/// * [audioEndMs] - Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
/// * [itemId] - The ID of the user message item that will be created.
@BuiltValue()
abstract class RealtimeServerEventInputAudioBufferSpeechStopped implements Built<RealtimeServerEventInputAudioBufferSpeechStopped, RealtimeServerEventInputAudioBufferSpeechStoppedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `input_audio_buffer.speech_stopped`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum get type;
  // enum typeEnum {  input_audio_buffer.speech_stopped,  };

  /// Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
  @BuiltValueField(wireName: r'audio_end_ms')
  int get audioEndMs;

  /// The ID of the user message item that will be created.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  RealtimeServerEventInputAudioBufferSpeechStopped._();

  factory RealtimeServerEventInputAudioBufferSpeechStopped([void updates(RealtimeServerEventInputAudioBufferSpeechStoppedBuilder b)]) = _$RealtimeServerEventInputAudioBufferSpeechStopped;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventInputAudioBufferSpeechStoppedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventInputAudioBufferSpeechStopped> get serializer => _$RealtimeServerEventInputAudioBufferSpeechStoppedSerializer();
}

class _$RealtimeServerEventInputAudioBufferSpeechStoppedSerializer implements PrimitiveSerializer<RealtimeServerEventInputAudioBufferSpeechStopped> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventInputAudioBufferSpeechStopped, _$RealtimeServerEventInputAudioBufferSpeechStopped];

  @override
  final String wireName = r'RealtimeServerEventInputAudioBufferSpeechStopped';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventInputAudioBufferSpeechStopped object, {
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
      specifiedType: const FullType(RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum),
    );
    yield r'audio_end_ms';
    yield serializers.serialize(
      object.audioEndMs,
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
    RealtimeServerEventInputAudioBufferSpeechStopped object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventInputAudioBufferSpeechStoppedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum),
          ) as RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum;
          result.type = valueDes;
          break;
        case r'audio_end_ms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.audioEndMs = valueDes;
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
  RealtimeServerEventInputAudioBufferSpeechStopped deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventInputAudioBufferSpeechStoppedBuilder();
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

class RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum extends EnumClass {

  /// The event type, must be `input_audio_buffer.speech_stopped`.
  @BuiltValueEnumConst(wireName: r'input_audio_buffer.speech_stopped')
  static const RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum inputAudioBufferPeriodSpeechStopped = _$realtimeServerEventInputAudioBufferSpeechStoppedTypeEnum_inputAudioBufferPeriodSpeechStopped;

  static Serializer<RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum> get serializer => _$realtimeServerEventInputAudioBufferSpeechStoppedTypeEnumSerializer;

  const RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum> get values => _$realtimeServerEventInputAudioBufferSpeechStoppedTypeEnumValues;
  static RealtimeServerEventInputAudioBufferSpeechStoppedTypeEnum valueOf(String name) => _$realtimeServerEventInputAudioBufferSpeechStoppedTypeEnumValueOf(name);
}

