//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_server_event_response_content_part_done_part.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_content_part_done.g.dart';

/// Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `response.content_part.done`.
/// * [responseId] - The ID of the response.
/// * [itemId] - The ID of the item.
/// * [outputIndex] - The index of the output item in the response.
/// * [contentIndex] - The index of the content part in the item's content array.
/// * [part_] 
@BuiltValue()
abstract class RealtimeServerEventResponseContentPartDone implements Built<RealtimeServerEventResponseContentPartDone, RealtimeServerEventResponseContentPartDoneBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `response.content_part.done`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseContentPartDoneTypeEnum get type;
  // enum typeEnum {  response.content_part.done,  };

  /// The ID of the response.
  @BuiltValueField(wireName: r'response_id')
  String get responseId;

  /// The ID of the item.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The index of the output item in the response.
  @BuiltValueField(wireName: r'output_index')
  int get outputIndex;

  /// The index of the content part in the item's content array.
  @BuiltValueField(wireName: r'content_index')
  int get contentIndex;

  @BuiltValueField(wireName: r'part')
  RealtimeServerEventResponseContentPartDonePart get part_;

  RealtimeServerEventResponseContentPartDone._();

  factory RealtimeServerEventResponseContentPartDone([void updates(RealtimeServerEventResponseContentPartDoneBuilder b)]) = _$RealtimeServerEventResponseContentPartDone;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseContentPartDoneBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseContentPartDone> get serializer => _$RealtimeServerEventResponseContentPartDoneSerializer();
}

class _$RealtimeServerEventResponseContentPartDoneSerializer implements PrimitiveSerializer<RealtimeServerEventResponseContentPartDone> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseContentPartDone, _$RealtimeServerEventResponseContentPartDone];

  @override
  final String wireName = r'RealtimeServerEventResponseContentPartDone';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseContentPartDone object, {
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
      specifiedType: const FullType(RealtimeServerEventResponseContentPartDoneTypeEnum),
    );
    yield r'response_id';
    yield serializers.serialize(
      object.responseId,
      specifiedType: const FullType(String),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'output_index';
    yield serializers.serialize(
      object.outputIndex,
      specifiedType: const FullType(int),
    );
    yield r'content_index';
    yield serializers.serialize(
      object.contentIndex,
      specifiedType: const FullType(int),
    );
    yield r'part';
    yield serializers.serialize(
      object.part_,
      specifiedType: const FullType(RealtimeServerEventResponseContentPartDonePart),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventResponseContentPartDone object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseContentPartDoneBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventResponseContentPartDoneTypeEnum),
          ) as RealtimeServerEventResponseContentPartDoneTypeEnum;
          result.type = valueDes;
          break;
        case r'response_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.responseId = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'output_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.outputIndex = valueDes;
          break;
        case r'content_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.contentIndex = valueDes;
          break;
        case r'part':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeServerEventResponseContentPartDonePart),
          ) as RealtimeServerEventResponseContentPartDonePart;
          result.part_.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventResponseContentPartDone deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseContentPartDoneBuilder();
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

class RealtimeServerEventResponseContentPartDoneTypeEnum extends EnumClass {

  /// The event type, must be `response.content_part.done`.
  @BuiltValueEnumConst(wireName: r'response.content_part.done')
  static const RealtimeServerEventResponseContentPartDoneTypeEnum responsePeriodContentPartPeriodDone = _$realtimeServerEventResponseContentPartDoneTypeEnum_responsePeriodContentPartPeriodDone;

  static Serializer<RealtimeServerEventResponseContentPartDoneTypeEnum> get serializer => _$realtimeServerEventResponseContentPartDoneTypeEnumSerializer;

  const RealtimeServerEventResponseContentPartDoneTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseContentPartDoneTypeEnum> get values => _$realtimeServerEventResponseContentPartDoneTypeEnumValues;
  static RealtimeServerEventResponseContentPartDoneTypeEnum valueOf(String name) => _$realtimeServerEventResponseContentPartDoneTypeEnumValueOf(name);
}

