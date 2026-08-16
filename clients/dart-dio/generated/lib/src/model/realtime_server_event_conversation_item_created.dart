//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_conversation_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_conversation_item_created.g.dart';

/// Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `conversation.item.created`.
/// * [previousItemId] - The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
/// * [item] 
@BuiltValue()
abstract class RealtimeServerEventConversationItemCreated implements Built<RealtimeServerEventConversationItemCreated, RealtimeServerEventConversationItemCreatedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `conversation.item.created`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventConversationItemCreatedTypeEnum get type;
  // enum typeEnum {  conversation.item.created,  };

  /// The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
  @BuiltValueField(wireName: r'previous_item_id')
  String get previousItemId;

  @BuiltValueField(wireName: r'item')
  RealtimeConversationItem get item;

  RealtimeServerEventConversationItemCreated._();

  factory RealtimeServerEventConversationItemCreated([void updates(RealtimeServerEventConversationItemCreatedBuilder b)]) = _$RealtimeServerEventConversationItemCreated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventConversationItemCreatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventConversationItemCreated> get serializer => _$RealtimeServerEventConversationItemCreatedSerializer();
}

class _$RealtimeServerEventConversationItemCreatedSerializer implements PrimitiveSerializer<RealtimeServerEventConversationItemCreated> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventConversationItemCreated, _$RealtimeServerEventConversationItemCreated];

  @override
  final String wireName = r'RealtimeServerEventConversationItemCreated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventConversationItemCreated object, {
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
      specifiedType: const FullType(RealtimeServerEventConversationItemCreatedTypeEnum),
    );
    yield r'previous_item_id';
    yield serializers.serialize(
      object.previousItemId,
      specifiedType: const FullType(String),
    );
    yield r'item';
    yield serializers.serialize(
      object.item,
      specifiedType: const FullType(RealtimeConversationItem),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventConversationItemCreated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventConversationItemCreatedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventConversationItemCreatedTypeEnum),
          ) as RealtimeServerEventConversationItemCreatedTypeEnum;
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
  RealtimeServerEventConversationItemCreated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventConversationItemCreatedBuilder();
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

class RealtimeServerEventConversationItemCreatedTypeEnum extends EnumClass {

  /// The event type, must be `conversation.item.created`.
  @BuiltValueEnumConst(wireName: r'conversation.item.created')
  static const RealtimeServerEventConversationItemCreatedTypeEnum conversationPeriodItemPeriodCreated = _$realtimeServerEventConversationItemCreatedTypeEnum_conversationPeriodItemPeriodCreated;

  static Serializer<RealtimeServerEventConversationItemCreatedTypeEnum> get serializer => _$realtimeServerEventConversationItemCreatedTypeEnumSerializer;

  const RealtimeServerEventConversationItemCreatedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventConversationItemCreatedTypeEnum> get values => _$realtimeServerEventConversationItemCreatedTypeEnumValues;
  static RealtimeServerEventConversationItemCreatedTypeEnum valueOf(String name) => _$realtimeServerEventConversationItemCreatedTypeEnumValueOf(name);
}

