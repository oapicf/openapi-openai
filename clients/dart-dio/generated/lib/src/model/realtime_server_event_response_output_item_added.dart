//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_conversation_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_output_item_added.g.dart';

/// Returned when a new Item is created during Response generation.
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `response.output_item.added`.
/// * [responseId] - The ID of the Response to which the item belongs.
/// * [outputIndex] - The index of the output item in the Response.
/// * [item] 
@BuiltValue()
abstract class RealtimeServerEventResponseOutputItemAdded implements Built<RealtimeServerEventResponseOutputItemAdded, RealtimeServerEventResponseOutputItemAddedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `response.output_item.added`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseOutputItemAddedTypeEnum get type;
  // enum typeEnum {  response.output_item.added,  };

  /// The ID of the Response to which the item belongs.
  @BuiltValueField(wireName: r'response_id')
  String get responseId;

  /// The index of the output item in the Response.
  @BuiltValueField(wireName: r'output_index')
  int get outputIndex;

  @BuiltValueField(wireName: r'item')
  RealtimeConversationItem get item;

  RealtimeServerEventResponseOutputItemAdded._();

  factory RealtimeServerEventResponseOutputItemAdded([void updates(RealtimeServerEventResponseOutputItemAddedBuilder b)]) = _$RealtimeServerEventResponseOutputItemAdded;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseOutputItemAddedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseOutputItemAdded> get serializer => _$RealtimeServerEventResponseOutputItemAddedSerializer();
}

class _$RealtimeServerEventResponseOutputItemAddedSerializer implements PrimitiveSerializer<RealtimeServerEventResponseOutputItemAdded> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseOutputItemAdded, _$RealtimeServerEventResponseOutputItemAdded];

  @override
  final String wireName = r'RealtimeServerEventResponseOutputItemAdded';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseOutputItemAdded object, {
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
      specifiedType: const FullType(RealtimeServerEventResponseOutputItemAddedTypeEnum),
    );
    yield r'response_id';
    yield serializers.serialize(
      object.responseId,
      specifiedType: const FullType(String),
    );
    yield r'output_index';
    yield serializers.serialize(
      object.outputIndex,
      specifiedType: const FullType(int),
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
    RealtimeServerEventResponseOutputItemAdded object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseOutputItemAddedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventResponseOutputItemAddedTypeEnum),
          ) as RealtimeServerEventResponseOutputItemAddedTypeEnum;
          result.type = valueDes;
          break;
        case r'response_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.responseId = valueDes;
          break;
        case r'output_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.outputIndex = valueDes;
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
  RealtimeServerEventResponseOutputItemAdded deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseOutputItemAddedBuilder();
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

class RealtimeServerEventResponseOutputItemAddedTypeEnum extends EnumClass {

  /// The event type, must be `response.output_item.added`.
  @BuiltValueEnumConst(wireName: r'response.output_item.added')
  static const RealtimeServerEventResponseOutputItemAddedTypeEnum responsePeriodOutputItemPeriodAdded = _$realtimeServerEventResponseOutputItemAddedTypeEnum_responsePeriodOutputItemPeriodAdded;

  static Serializer<RealtimeServerEventResponseOutputItemAddedTypeEnum> get serializer => _$realtimeServerEventResponseOutputItemAddedTypeEnumSerializer;

  const RealtimeServerEventResponseOutputItemAddedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseOutputItemAddedTypeEnum> get values => _$realtimeServerEventResponseOutputItemAddedTypeEnumValues;
  static RealtimeServerEventResponseOutputItemAddedTypeEnum valueOf(String name) => _$realtimeServerEventResponseOutputItemAddedTypeEnumValueOf(name);
}

