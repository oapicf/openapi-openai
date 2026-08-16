//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_conversation_item_deleted.g.dart';

/// Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `conversation.item.deleted`.
/// * [itemId] - The ID of the item that was deleted.
@BuiltValue()
abstract class RealtimeServerEventConversationItemDeleted implements Built<RealtimeServerEventConversationItemDeleted, RealtimeServerEventConversationItemDeletedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `conversation.item.deleted`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventConversationItemDeletedTypeEnum get type;
  // enum typeEnum {  conversation.item.deleted,  };

  /// The ID of the item that was deleted.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  RealtimeServerEventConversationItemDeleted._();

  factory RealtimeServerEventConversationItemDeleted([void updates(RealtimeServerEventConversationItemDeletedBuilder b)]) = _$RealtimeServerEventConversationItemDeleted;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventConversationItemDeletedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventConversationItemDeleted> get serializer => _$RealtimeServerEventConversationItemDeletedSerializer();
}

class _$RealtimeServerEventConversationItemDeletedSerializer implements PrimitiveSerializer<RealtimeServerEventConversationItemDeleted> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventConversationItemDeleted, _$RealtimeServerEventConversationItemDeleted];

  @override
  final String wireName = r'RealtimeServerEventConversationItemDeleted';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventConversationItemDeleted object, {
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
      specifiedType: const FullType(RealtimeServerEventConversationItemDeletedTypeEnum),
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
    RealtimeServerEventConversationItemDeleted object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventConversationItemDeletedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventConversationItemDeletedTypeEnum),
          ) as RealtimeServerEventConversationItemDeletedTypeEnum;
          result.type = valueDes;
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
  RealtimeServerEventConversationItemDeleted deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventConversationItemDeletedBuilder();
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

class RealtimeServerEventConversationItemDeletedTypeEnum extends EnumClass {

  /// The event type, must be `conversation.item.deleted`.
  @BuiltValueEnumConst(wireName: r'conversation.item.deleted')
  static const RealtimeServerEventConversationItemDeletedTypeEnum conversationPeriodItemPeriodDeleted = _$realtimeServerEventConversationItemDeletedTypeEnum_conversationPeriodItemPeriodDeleted;

  static Serializer<RealtimeServerEventConversationItemDeletedTypeEnum> get serializer => _$realtimeServerEventConversationItemDeletedTypeEnumSerializer;

  const RealtimeServerEventConversationItemDeletedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventConversationItemDeletedTypeEnum> get values => _$realtimeServerEventConversationItemDeletedTypeEnumValues;
  static RealtimeServerEventConversationItemDeletedTypeEnum valueOf(String name) => _$realtimeServerEventConversationItemDeletedTypeEnumValueOf(name);
}

