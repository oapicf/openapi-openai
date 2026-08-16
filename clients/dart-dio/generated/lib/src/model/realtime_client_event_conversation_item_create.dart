//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_conversation_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_client_event_conversation_item_create.g.dart';

/// Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 
///
/// Properties:
/// * [eventId] - Optional client-generated ID used to identify this event.
/// * [type] - The event type, must be `conversation.item.create`.
/// * [previousItemId] - The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
/// * [item] 
@BuiltValue()
abstract class RealtimeClientEventConversationItemCreate implements Built<RealtimeClientEventConversationItemCreate, RealtimeClientEventConversationItemCreateBuilder> {
  /// Optional client-generated ID used to identify this event.
  @BuiltValueField(wireName: r'event_id')
  String? get eventId;

  /// The event type, must be `conversation.item.create`.
  @BuiltValueField(wireName: r'type')
  RealtimeClientEventConversationItemCreateTypeEnum get type;
  // enum typeEnum {  conversation.item.create,  };

  /// The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
  @BuiltValueField(wireName: r'previous_item_id')
  String? get previousItemId;

  @BuiltValueField(wireName: r'item')
  RealtimeConversationItem get item;

  RealtimeClientEventConversationItemCreate._();

  factory RealtimeClientEventConversationItemCreate([void updates(RealtimeClientEventConversationItemCreateBuilder b)]) = _$RealtimeClientEventConversationItemCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeClientEventConversationItemCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeClientEventConversationItemCreate> get serializer => _$RealtimeClientEventConversationItemCreateSerializer();
}

class _$RealtimeClientEventConversationItemCreateSerializer implements PrimitiveSerializer<RealtimeClientEventConversationItemCreate> {
  @override
  final Iterable<Type> types = const [RealtimeClientEventConversationItemCreate, _$RealtimeClientEventConversationItemCreate];

  @override
  final String wireName = r'RealtimeClientEventConversationItemCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeClientEventConversationItemCreate object, {
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
      specifiedType: const FullType(RealtimeClientEventConversationItemCreateTypeEnum),
    );
    if (object.previousItemId != null) {
      yield r'previous_item_id';
      yield serializers.serialize(
        object.previousItemId,
        specifiedType: const FullType(String),
      );
    }
    yield r'item';
    yield serializers.serialize(
      object.item,
      specifiedType: const FullType(RealtimeConversationItem),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeClientEventConversationItemCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeClientEventConversationItemCreateBuilder result,
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
            specifiedType: const FullType(RealtimeClientEventConversationItemCreateTypeEnum),
          ) as RealtimeClientEventConversationItemCreateTypeEnum;
          result.type = valueDes;
          break;
        case r'previous_item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.previousItemId = valueDes;
          break;
        case r'item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeConversationItem),
          ) as RealtimeConversationItem;
          result.item.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeClientEventConversationItemCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeClientEventConversationItemCreateBuilder();
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

class RealtimeClientEventConversationItemCreateTypeEnum extends EnumClass {

  /// The event type, must be `conversation.item.create`.
  @BuiltValueEnumConst(wireName: r'conversation.item.create')
  static const RealtimeClientEventConversationItemCreateTypeEnum conversationPeriodItemPeriodCreate = _$realtimeClientEventConversationItemCreateTypeEnum_conversationPeriodItemPeriodCreate;

  static Serializer<RealtimeClientEventConversationItemCreateTypeEnum> get serializer => _$realtimeClientEventConversationItemCreateTypeEnumSerializer;

  const RealtimeClientEventConversationItemCreateTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeClientEventConversationItemCreateTypeEnum> get values => _$realtimeClientEventConversationItemCreateTypeEnumValues;
  static RealtimeClientEventConversationItemCreateTypeEnum valueOf(String name) => _$realtimeClientEventConversationItemCreateTypeEnumValueOf(name);
}

