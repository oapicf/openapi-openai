//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_conversation_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_output_item_done.g.dart';

/// Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `response.output_item.done`.
/// * [responseId] - The ID of the Response to which the item belongs.
/// * [outputIndex] - The index of the output item in the Response.
/// * [item] 
@BuiltValue()
abstract class RealtimeServerEventResponseOutputItemDone implements Built<RealtimeServerEventResponseOutputItemDone, RealtimeServerEventResponseOutputItemDoneBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `response.output_item.done`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseOutputItemDoneTypeEnum get type;
  // enum typeEnum {  response.output_item.done,  };

  /// The ID of the Response to which the item belongs.
  @BuiltValueField(wireName: r'response_id')
  String get responseId;

  /// The index of the output item in the Response.
  @BuiltValueField(wireName: r'output_index')
  int get outputIndex;

  @BuiltValueField(wireName: r'item')
  RealtimeConversationItem get item;

  RealtimeServerEventResponseOutputItemDone._();

  factory RealtimeServerEventResponseOutputItemDone([void updates(RealtimeServerEventResponseOutputItemDoneBuilder b)]) = _$RealtimeServerEventResponseOutputItemDone;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseOutputItemDoneBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseOutputItemDone> get serializer => _$RealtimeServerEventResponseOutputItemDoneSerializer();
}

class _$RealtimeServerEventResponseOutputItemDoneSerializer implements PrimitiveSerializer<RealtimeServerEventResponseOutputItemDone> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseOutputItemDone, _$RealtimeServerEventResponseOutputItemDone];

  @override
  final String wireName = r'RealtimeServerEventResponseOutputItemDone';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseOutputItemDone object, {
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
      specifiedType: const FullType(RealtimeServerEventResponseOutputItemDoneTypeEnum),
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
    RealtimeServerEventResponseOutputItemDone object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseOutputItemDoneBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventResponseOutputItemDoneTypeEnum),
          ) as RealtimeServerEventResponseOutputItemDoneTypeEnum;
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
  RealtimeServerEventResponseOutputItemDone deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseOutputItemDoneBuilder();
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

class RealtimeServerEventResponseOutputItemDoneTypeEnum extends EnumClass {

  /// The event type, must be `response.output_item.done`.
  @BuiltValueEnumConst(wireName: r'response.output_item.done')
  static const RealtimeServerEventResponseOutputItemDoneTypeEnum responsePeriodOutputItemPeriodDone = _$realtimeServerEventResponseOutputItemDoneTypeEnum_responsePeriodOutputItemPeriodDone;

  static Serializer<RealtimeServerEventResponseOutputItemDoneTypeEnum> get serializer => _$realtimeServerEventResponseOutputItemDoneTypeEnumSerializer;

  const RealtimeServerEventResponseOutputItemDoneTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseOutputItemDoneTypeEnum> get values => _$realtimeServerEventResponseOutputItemDoneTypeEnumValues;
  static RealtimeServerEventResponseOutputItemDoneTypeEnum valueOf(String name) => _$realtimeServerEventResponseOutputItemDoneTypeEnumValueOf(name);
}

