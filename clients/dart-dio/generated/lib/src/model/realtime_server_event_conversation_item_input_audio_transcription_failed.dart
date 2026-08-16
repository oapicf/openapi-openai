//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_server_event_conversation_item_input_audio_transcription_failed_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_conversation_item_input_audio_transcription_failed.g.dart';

/// Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `conversation.item.input_audio_transcription.failed`. 
/// * [itemId] - The ID of the user message item.
/// * [contentIndex] - The index of the content part containing the audio.
/// * [error] 
@BuiltValue()
abstract class RealtimeServerEventConversationItemInputAudioTranscriptionFailed implements Built<RealtimeServerEventConversationItemInputAudioTranscriptionFailed, RealtimeServerEventConversationItemInputAudioTranscriptionFailedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `conversation.item.input_audio_transcription.failed`. 
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum get type;
  // enum typeEnum {  conversation.item.input_audio_transcription.failed,  };

  /// The ID of the user message item.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The index of the content part containing the audio.
  @BuiltValueField(wireName: r'content_index')
  int get contentIndex;

  @BuiltValueField(wireName: r'error')
  RealtimeServerEventConversationItemInputAudioTranscriptionFailedError get error;

  RealtimeServerEventConversationItemInputAudioTranscriptionFailed._();

  factory RealtimeServerEventConversationItemInputAudioTranscriptionFailed([void updates(RealtimeServerEventConversationItemInputAudioTranscriptionFailedBuilder b)]) = _$RealtimeServerEventConversationItemInputAudioTranscriptionFailed;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventConversationItemInputAudioTranscriptionFailedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventConversationItemInputAudioTranscriptionFailed> get serializer => _$RealtimeServerEventConversationItemInputAudioTranscriptionFailedSerializer();
}

class _$RealtimeServerEventConversationItemInputAudioTranscriptionFailedSerializer implements PrimitiveSerializer<RealtimeServerEventConversationItemInputAudioTranscriptionFailed> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventConversationItemInputAudioTranscriptionFailed, _$RealtimeServerEventConversationItemInputAudioTranscriptionFailed];

  @override
  final String wireName = r'RealtimeServerEventConversationItemInputAudioTranscriptionFailed';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventConversationItemInputAudioTranscriptionFailed object, {
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
      specifiedType: const FullType(RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum),
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
    yield r'error';
    yield serializers.serialize(
      object.error,
      specifiedType: const FullType(RealtimeServerEventConversationItemInputAudioTranscriptionFailedError),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventConversationItemInputAudioTranscriptionFailed object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventConversationItemInputAudioTranscriptionFailedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum),
          ) as RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum;
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
        case r'error':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeServerEventConversationItemInputAudioTranscriptionFailedError),
          ) as RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;
          result.error.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventConversationItemInputAudioTranscriptionFailed deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventConversationItemInputAudioTranscriptionFailedBuilder();
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

class RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum extends EnumClass {

  /// The event type, must be `conversation.item.input_audio_transcription.failed`. 
  @BuiltValueEnumConst(wireName: r'conversation.item.input_audio_transcription.failed')
  static const RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum conversationPeriodItemPeriodInputAudioTranscriptionPeriodFailed = _$realtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum_conversationPeriodItemPeriodInputAudioTranscriptionPeriodFailed;

  static Serializer<RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum> get serializer => _$realtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnumSerializer;

  const RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum> get values => _$realtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnumValues;
  static RealtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnum valueOf(String name) => _$realtimeServerEventConversationItemInputAudioTranscriptionFailedTypeEnumValueOf(name);
}

