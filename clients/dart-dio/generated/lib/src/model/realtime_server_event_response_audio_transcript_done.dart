//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_audio_transcript_done.g.dart';

/// Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `response.audio_transcript.done`.
/// * [responseId] - The ID of the response.
/// * [itemId] - The ID of the item.
/// * [outputIndex] - The index of the output item in the response.
/// * [contentIndex] - The index of the content part in the item's content array.
/// * [transcript] - The final transcript of the audio.
@BuiltValue()
abstract class RealtimeServerEventResponseAudioTranscriptDone implements Built<RealtimeServerEventResponseAudioTranscriptDone, RealtimeServerEventResponseAudioTranscriptDoneBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `response.audio_transcript.done`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseAudioTranscriptDoneTypeEnum get type;
  // enum typeEnum {  response.audio_transcript.done,  };

  /// The ID of the response.
  @BuiltValueField(wireName: r'response_id')
  String get responseId;

  /// The ID of the item.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The index of the output item in the response.
  @BuiltValueField(wireName: r'output_index')
  int get outputIndex;

  /// The index of the content part in the item's content array.
  @BuiltValueField(wireName: r'content_index')
  int get contentIndex;

  /// The final transcript of the audio.
  @BuiltValueField(wireName: r'transcript')
  String get transcript;

  RealtimeServerEventResponseAudioTranscriptDone._();

  factory RealtimeServerEventResponseAudioTranscriptDone([void updates(RealtimeServerEventResponseAudioTranscriptDoneBuilder b)]) = _$RealtimeServerEventResponseAudioTranscriptDone;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseAudioTranscriptDoneBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseAudioTranscriptDone> get serializer => _$RealtimeServerEventResponseAudioTranscriptDoneSerializer();
}

class _$RealtimeServerEventResponseAudioTranscriptDoneSerializer implements PrimitiveSerializer<RealtimeServerEventResponseAudioTranscriptDone> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseAudioTranscriptDone, _$RealtimeServerEventResponseAudioTranscriptDone];

  @override
  final String wireName = r'RealtimeServerEventResponseAudioTranscriptDone';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseAudioTranscriptDone object, {
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
      specifiedType: const FullType(RealtimeServerEventResponseAudioTranscriptDoneTypeEnum),
    );
    yield r'response_id';
    yield serializers.serialize(
      object.responseId,
      specifiedType: const FullType(String),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'output_index';
    yield serializers.serialize(
      object.outputIndex,
      specifiedType: const FullType(int),
    );
    yield r'content_index';
    yield serializers.serialize(
      object.contentIndex,
      specifiedType: const FullType(int),
    );
    yield r'transcript';
    yield serializers.serialize(
      object.transcript,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventResponseAudioTranscriptDone object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseAudioTranscriptDoneBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventResponseAudioTranscriptDoneTypeEnum),
          ) as RealtimeServerEventResponseAudioTranscriptDoneTypeEnum;
          result.type = valueDes;
          break;
        case r'response_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.responseId = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'output_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.outputIndex = valueDes;
          break;
        case r'content_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.contentIndex = valueDes;
          break;
        case r'transcript':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.transcript = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventResponseAudioTranscriptDone deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseAudioTranscriptDoneBuilder();
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

class RealtimeServerEventResponseAudioTranscriptDoneTypeEnum extends EnumClass {

  /// The event type, must be `response.audio_transcript.done`.
  @BuiltValueEnumConst(wireName: r'response.audio_transcript.done')
  static const RealtimeServerEventResponseAudioTranscriptDoneTypeEnum responsePeriodAudioTranscriptPeriodDone = _$realtimeServerEventResponseAudioTranscriptDoneTypeEnum_responsePeriodAudioTranscriptPeriodDone;

  static Serializer<RealtimeServerEventResponseAudioTranscriptDoneTypeEnum> get serializer => _$realtimeServerEventResponseAudioTranscriptDoneTypeEnumSerializer;

  const RealtimeServerEventResponseAudioTranscriptDoneTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseAudioTranscriptDoneTypeEnum> get values => _$realtimeServerEventResponseAudioTranscriptDoneTypeEnumValues;
  static RealtimeServerEventResponseAudioTranscriptDoneTypeEnum valueOf(String name) => _$realtimeServerEventResponseAudioTranscriptDoneTypeEnumValueOf(name);
}

