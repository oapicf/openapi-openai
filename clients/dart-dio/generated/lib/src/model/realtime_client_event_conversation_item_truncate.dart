//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_client_event_conversation_item_truncate.g.dart';

/// Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  
///
/// Properties:
/// * [eventId] - Optional client-generated ID used to identify this event.
/// * [type] - The event type, must be `conversation.item.truncate`.
/// * [itemId] - The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
/// * [contentIndex] - The index of the content part to truncate. Set this to 0.
/// * [audioEndMs] - Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
@BuiltValue()
abstract class RealtimeClientEventConversationItemTruncate implements Built<RealtimeClientEventConversationItemTruncate, RealtimeClientEventConversationItemTruncateBuilder> {
  /// Optional client-generated ID used to identify this event.
  @BuiltValueField(wireName: r'event_id')
  String? get eventId;

  /// The event type, must be `conversation.item.truncate`.
  @BuiltValueField(wireName: r'type')
  RealtimeClientEventConversationItemTruncateTypeEnum get type;
  // enum typeEnum {  conversation.item.truncate,  };

  /// The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The index of the content part to truncate. Set this to 0.
  @BuiltValueField(wireName: r'content_index')
  int get contentIndex;

  /// Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
  @BuiltValueField(wireName: r'audio_end_ms')
  int get audioEndMs;

  RealtimeClientEventConversationItemTruncate._();

  factory RealtimeClientEventConversationItemTruncate([void updates(RealtimeClientEventConversationItemTruncateBuilder b)]) = _$RealtimeClientEventConversationItemTruncate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeClientEventConversationItemTruncateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeClientEventConversationItemTruncate> get serializer => _$RealtimeClientEventConversationItemTruncateSerializer();
}

class _$RealtimeClientEventConversationItemTruncateSerializer implements PrimitiveSerializer<RealtimeClientEventConversationItemTruncate> {
  @override
  final Iterable<Type> types = const [RealtimeClientEventConversationItemTruncate, _$RealtimeClientEventConversationItemTruncate];

  @override
  final String wireName = r'RealtimeClientEventConversationItemTruncate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeClientEventConversationItemTruncate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventId != null) {
      yield r'event_id';
      yield serializers.serialize(
        object.eventId,
        specifiedType: const FullType(String),
      );
    }
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RealtimeClientEventConversationItemTruncateTypeEnum),
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
    RealtimeClientEventConversationItemTruncate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeClientEventConversationItemTruncateBuilder result,
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
            specifiedType: const FullType(RealtimeClientEventConversationItemTruncateTypeEnum),
          ) as RealtimeClientEventConversationItemTruncateTypeEnum;
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
  RealtimeClientEventConversationItemTruncate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeClientEventConversationItemTruncateBuilder();
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

class RealtimeClientEventConversationItemTruncateTypeEnum extends EnumClass {

  /// The event type, must be `conversation.item.truncate`.
  @BuiltValueEnumConst(wireName: r'conversation.item.truncate')
  static const RealtimeClientEventConversationItemTruncateTypeEnum conversationPeriodItemPeriodTruncate = _$realtimeClientEventConversationItemTruncateTypeEnum_conversationPeriodItemPeriodTruncate;

  static Serializer<RealtimeClientEventConversationItemTruncateTypeEnum> get serializer => _$realtimeClientEventConversationItemTruncateTypeEnumSerializer;

  const RealtimeClientEventConversationItemTruncateTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeClientEventConversationItemTruncateTypeEnum> get values => _$realtimeClientEventConversationItemTruncateTypeEnumValues;
  static RealtimeClientEventConversationItemTruncateTypeEnum valueOf(String name) => _$realtimeClientEventConversationItemTruncateTypeEnumValueOf(name);
}

