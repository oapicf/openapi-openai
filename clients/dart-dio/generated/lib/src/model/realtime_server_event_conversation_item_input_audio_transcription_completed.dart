//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_conversation_item_input_audio_transcription_completed.g.dart';

/// This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `conversation.item.input_audio_transcription.completed`. 
/// * [itemId] - The ID of the user message item containing the audio.
/// * [contentIndex] - The index of the content part containing the audio.
/// * [transcript] - The transcribed text.
@BuiltValue()
abstract class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted implements Built<RealtimeServerEventConversationItemInputAudioTranscriptionCompleted, RealtimeServerEventConversationItemInputAudioTranscriptionCompletedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `conversation.item.input_audio_transcription.completed`. 
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum get type;
  // enum typeEnum {  conversation.item.input_audio_transcription.completed,  };

  /// The ID of the user message item containing the audio.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The index of the content part containing the audio.
  @BuiltValueField(wireName: r'content_index')
  int get contentIndex;

  /// The transcribed text.
  @BuiltValueField(wireName: r'transcript')
  String get transcript;

  RealtimeServerEventConversationItemInputAudioTranscriptionCompleted._();

  factory RealtimeServerEventConversationItemInputAudioTranscriptionCompleted([void updates(RealtimeServerEventConversationItemInputAudioTranscriptionCompletedBuilder b)]) = _$RealtimeServerEventConversationItemInputAudioTranscriptionCompleted;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventConversationItemInputAudioTranscriptionCompletedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventConversationItemInputAudioTranscriptionCompleted> get serializer => _$RealtimeServerEventConversationItemInputAudioTranscriptionCompletedSerializer();
}

class _$RealtimeServerEventConversationItemInputAudioTranscriptionCompletedSerializer implements PrimitiveSerializer<RealtimeServerEventConversationItemInputAudioTranscriptionCompleted> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventConversationItemInputAudioTranscriptionCompleted, _$RealtimeServerEventConversationItemInputAudioTranscriptionCompleted];

  @override
  final String wireName = r'RealtimeServerEventConversationItemInputAudioTranscriptionCompleted';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted object, {
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
      specifiedType: const FullType(RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
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
    RealtimeServerEventConversationItemInputAudioTranscriptionCompleted object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventConversationItemInputAudioTranscriptionCompletedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum),
          ) as RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum;
          result.type = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
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
  RealtimeServerEventConversationItemInputAudioTranscriptionCompleted deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventConversationItemInputAudioTranscriptionCompletedBuilder();
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

class RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum extends EnumClass {

  /// The event type, must be `conversation.item.input_audio_transcription.completed`. 
  @BuiltValueEnumConst(wireName: r'conversation.item.input_audio_transcription.completed')
  static const RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum conversationPeriodItemPeriodInputAudioTranscriptionPeriodCompleted = _$realtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum_conversationPeriodItemPeriodInputAudioTranscriptionPeriodCompleted;

  static Serializer<RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum> get serializer => _$realtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnumSerializer;

  const RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum> get values => _$realtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnumValues;
  static RealtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnum valueOf(String name) => _$realtimeServerEventConversationItemInputAudioTranscriptionCompletedTypeEnumValueOf(name);
}

