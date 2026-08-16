//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_client_event_conversation_item_delete.g.dart';

/// Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
///
/// Properties:
/// * [eventId] - Optional client-generated ID used to identify this event.
/// * [type] - The event type, must be `conversation.item.delete`.
/// * [itemId] - The ID of the item to delete.
@BuiltValue()
abstract class RealtimeClientEventConversationItemDelete implements Built<RealtimeClientEventConversationItemDelete, RealtimeClientEventConversationItemDeleteBuilder> {
  /// Optional client-generated ID used to identify this event.
  @BuiltValueField(wireName: r'event_id')
  String? get eventId;

  /// The event type, must be `conversation.item.delete`.
  @BuiltValueField(wireName: r'type')
  RealtimeClientEventConversationItemDeleteTypeEnum get type;
  // enum typeEnum {  conversation.item.delete,  };

  /// The ID of the item to delete.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  RealtimeClientEventConversationItemDelete._();

  factory RealtimeClientEventConversationItemDelete([void updates(RealtimeClientEventConversationItemDeleteBuilder b)]) = _$RealtimeClientEventConversationItemDelete;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeClientEventConversationItemDeleteBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeClientEventConversationItemDelete> get serializer => _$RealtimeClientEventConversationItemDeleteSerializer();
}

class _$RealtimeClientEventConversationItemDeleteSerializer implements PrimitiveSerializer<RealtimeClientEventConversationItemDelete> {
  @override
  final Iterable<Type> types = const [RealtimeClientEventConversationItemDelete, _$RealtimeClientEventConversationItemDelete];

  @override
  final String wireName = r'RealtimeClientEventConversationItemDelete';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeClientEventConversationItemDelete object, {
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
      specifiedType: const FullType(RealtimeClientEventConversationItemDeleteTypeEnum),
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
    RealtimeClientEventConversationItemDelete object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeClientEventConversationItemDeleteBuilder result,
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
            specifiedType: const FullType(RealtimeClientEventConversationItemDeleteTypeEnum),
          ) as RealtimeClientEventConversationItemDeleteTypeEnum;
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
  RealtimeClientEventConversationItemDelete deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeClientEventConversationItemDeleteBuilder();
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

class RealtimeClientEventConversationItemDeleteTypeEnum extends EnumClass {

  /// The event type, must be `conversation.item.delete`.
  @BuiltValueEnumConst(wireName: r'conversation.item.delete')
  static const RealtimeClientEventConversationItemDeleteTypeEnum conversationPeriodItemPeriodDelete = _$realtimeClientEventConversationItemDeleteTypeEnum_conversationPeriodItemPeriodDelete;

  static Serializer<RealtimeClientEventConversationItemDeleteTypeEnum> get serializer => _$realtimeClientEventConversationItemDeleteTypeEnumSerializer;

  const RealtimeClientEventConversationItemDeleteTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeClientEventConversationItemDeleteTypeEnum> get values => _$realtimeClientEventConversationItemDeleteTypeEnumValues;
  static RealtimeClientEventConversationItemDeleteTypeEnum valueOf(String name) => _$realtimeClientEventConversationItemDeleteTypeEnumValueOf(name);
}

