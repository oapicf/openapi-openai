//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_server_event_conversation_created_conversation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_conversation_created.g.dart';

/// Returned when a conversation is created. Emitted right after session creation. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `conversation.created`.
/// * [conversation] 
@BuiltValue()
abstract class RealtimeServerEventConversationCreated implements Built<RealtimeServerEventConversationCreated, RealtimeServerEventConversationCreatedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `conversation.created`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventConversationCreatedTypeEnum get type;
  // enum typeEnum {  conversation.created,  };

  @BuiltValueField(wireName: r'conversation')
  RealtimeServerEventConversationCreatedConversation get conversation;

  RealtimeServerEventConversationCreated._();

  factory RealtimeServerEventConversationCreated([void updates(RealtimeServerEventConversationCreatedBuilder b)]) = _$RealtimeServerEventConversationCreated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventConversationCreatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventConversationCreated> get serializer => _$RealtimeServerEventConversationCreatedSerializer();
}

class _$RealtimeServerEventConversationCreatedSerializer implements PrimitiveSerializer<RealtimeServerEventConversationCreated> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventConversationCreated, _$RealtimeServerEventConversationCreated];

  @override
  final String wireName = r'RealtimeServerEventConversationCreated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventConversationCreated object, {
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
      specifiedType: const FullType(RealtimeServerEventConversationCreatedTypeEnum),
    );
    yield r'conversation';
    yield serializers.serialize(
      object.conversation,
      specifiedType: const FullType(RealtimeServerEventConversationCreatedConversation),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventConversationCreated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventConversationCreatedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventConversationCreatedTypeEnum),
          ) as RealtimeServerEventConversationCreatedTypeEnum;
          result.type = valueDes;
          break;
        case r'conversation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeServerEventConversationCreatedConversation),
          ) as RealtimeServerEventConversationCreatedConversation;
          result.conversation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventConversationCreated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventConversationCreatedBuilder();
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

class RealtimeServerEventConversationCreatedTypeEnum extends EnumClass {

  /// The event type, must be `conversation.created`.
  @BuiltValueEnumConst(wireName: r'conversation.created')
  static const RealtimeServerEventConversationCreatedTypeEnum conversationPeriodCreated = _$realtimeServerEventConversationCreatedTypeEnum_conversationPeriodCreated;

  static Serializer<RealtimeServerEventConversationCreatedTypeEnum> get serializer => _$realtimeServerEventConversationCreatedTypeEnumSerializer;

  const RealtimeServerEventConversationCreatedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventConversationCreatedTypeEnum> get values => _$realtimeServerEventConversationCreatedTypeEnumValues;
  static RealtimeServerEventConversationCreatedTypeEnum valueOf(String name) => _$realtimeServerEventConversationCreatedTypeEnumValueOf(name);
}

