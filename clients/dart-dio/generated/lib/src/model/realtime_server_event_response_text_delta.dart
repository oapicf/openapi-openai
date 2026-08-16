//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_text_delta.g.dart';

/// Returned when the text value of a \"text\" content part is updated.
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `response.text.delta`.
/// * [responseId] - The ID of the response.
/// * [itemId] - The ID of the item.
/// * [outputIndex] - The index of the output item in the response.
/// * [contentIndex] - The index of the content part in the item's content array.
/// * [delta] - The text delta.
@BuiltValue()
abstract class RealtimeServerEventResponseTextDelta implements Built<RealtimeServerEventResponseTextDelta, RealtimeServerEventResponseTextDeltaBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `response.text.delta`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseTextDeltaTypeEnum get type;
  // enum typeEnum {  response.text.delta,  };

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

  /// The text delta.
  @BuiltValueField(wireName: r'delta')
  String get delta;

  RealtimeServerEventResponseTextDelta._();

  factory RealtimeServerEventResponseTextDelta([void updates(RealtimeServerEventResponseTextDeltaBuilder b)]) = _$RealtimeServerEventResponseTextDelta;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseTextDeltaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseTextDelta> get serializer => _$RealtimeServerEventResponseTextDeltaSerializer();
}

class _$RealtimeServerEventResponseTextDeltaSerializer implements PrimitiveSerializer<RealtimeServerEventResponseTextDelta> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseTextDelta, _$RealtimeServerEventResponseTextDelta];

  @override
  final String wireName = r'RealtimeServerEventResponseTextDelta';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseTextDelta object, {
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
      specifiedType: const FullType(RealtimeServerEventResponseTextDeltaTypeEnum),
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
    yield r'delta';
    yield serializers.serialize(
      object.delta,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventResponseTextDelta object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseTextDeltaBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventResponseTextDeltaTypeEnum),
          ) as RealtimeServerEventResponseTextDeltaTypeEnum;
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
        case r'delta':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.delta = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventResponseTextDelta deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseTextDeltaBuilder();
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

class RealtimeServerEventResponseTextDeltaTypeEnum extends EnumClass {

  /// The event type, must be `response.text.delta`.
  @BuiltValueEnumConst(wireName: r'response.text.delta')
  static const RealtimeServerEventResponseTextDeltaTypeEnum responsePeriodTextPeriodDelta = _$realtimeServerEventResponseTextDeltaTypeEnum_responsePeriodTextPeriodDelta;

  static Serializer<RealtimeServerEventResponseTextDeltaTypeEnum> get serializer => _$realtimeServerEventResponseTextDeltaTypeEnumSerializer;

  const RealtimeServerEventResponseTextDeltaTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseTextDeltaTypeEnum> get values => _$realtimeServerEventResponseTextDeltaTypeEnumValues;
  static RealtimeServerEventResponseTextDeltaTypeEnum valueOf(String name) => _$realtimeServerEventResponseTextDeltaTypeEnumValueOf(name);
}

