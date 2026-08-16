//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_conversation_item_truncated.g.dart';

/// Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `conversation.item.truncated`.
/// * [itemId] - The ID of the assistant message item that was truncated.
/// * [contentIndex] - The index of the content part that was truncated.
/// * [audioEndMs] - The duration up to which the audio was truncated, in milliseconds. 
@BuiltValue()
abstract class RealtimeServerEventConversationItemTruncated implements Built<RealtimeServerEventConversationItemTruncated, RealtimeServerEventConversationItemTruncatedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `conversation.item.truncated`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventConversationItemTruncatedTypeEnum get type;
  // enum typeEnum {  conversation.item.truncated,  };

  /// The ID of the assistant message item that was truncated.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The index of the content part that was truncated.
  @BuiltValueField(wireName: r'content_index')
  int get contentIndex;

  /// The duration up to which the audio was truncated, in milliseconds. 
  @BuiltValueField(wireName: r'audio_end_ms')
  int get audioEndMs;

  RealtimeServerEventConversationItemTruncated._();

  factory RealtimeServerEventConversationItemTruncated([void updates(RealtimeServerEventConversationItemTruncatedBuilder b)]) = _$RealtimeServerEventConversationItemTruncated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventConversationItemTruncatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventConversationItemTruncated> get serializer => _$RealtimeServerEventConversationItemTruncatedSerializer();
}

class _$RealtimeServerEventConversationItemTruncatedSerializer implements PrimitiveSerializer<RealtimeServerEventConversationItemTruncated> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventConversationItemTruncated, _$RealtimeServerEventConversationItemTruncated];

  @override
  final String wireName = r'RealtimeServerEventConversationItemTruncated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventConversationItemTruncated object, {
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
      specifiedType: const FullType(RealtimeServerEventConversationItemTruncatedTypeEnum),
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
    yield r'audio_end_ms';
    yield serializers.serialize(
      object.audioEndMs,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventConversationItemTruncated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventConversationItemTruncatedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventConversationItemTruncatedTypeEnum),
          ) as RealtimeServerEventConversationItemTruncatedTypeEnum;
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
        case r'audio_end_ms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.audioEndMs = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventConversationItemTruncated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventConversationItemTruncatedBuilder();
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

class RealtimeServerEventConversationItemTruncatedTypeEnum extends EnumClass {

  /// The event type, must be `conversation.item.truncated`.
  @BuiltValueEnumConst(wireName: r'conversation.item.truncated')
  static const RealtimeServerEventConversationItemTruncatedTypeEnum conversationPeriodItemPeriodTruncated = _$realtimeServerEventConversationItemTruncatedTypeEnum_conversationPeriodItemPeriodTruncated;

  static Serializer<RealtimeServerEventConversationItemTruncatedTypeEnum> get serializer => _$realtimeServerEventConversationItemTruncatedTypeEnumSerializer;

  const RealtimeServerEventConversationItemTruncatedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventConversationItemTruncatedTypeEnum> get values => _$realtimeServerEventConversationItemTruncatedTypeEnumValues;
  static RealtimeServerEventConversationItemTruncatedTypeEnum valueOf(String name) => _$realtimeServerEventConversationItemTruncatedTypeEnumValueOf(name);
}

