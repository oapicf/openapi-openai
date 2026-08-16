//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_done.g.dart';

/// Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `response.done`.
/// * [response] 
@BuiltValue()
abstract class RealtimeServerEventResponseDone implements Built<RealtimeServerEventResponseDone, RealtimeServerEventResponseDoneBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `response.done`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseDoneTypeEnum get type;
  // enum typeEnum {  response.done,  };

  @BuiltValueField(wireName: r'response')
  RealtimeResponse get response;

  RealtimeServerEventResponseDone._();

  factory RealtimeServerEventResponseDone([void updates(RealtimeServerEventResponseDoneBuilder b)]) = _$RealtimeServerEventResponseDone;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseDoneBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseDone> get serializer => _$RealtimeServerEventResponseDoneSerializer();
}

class _$RealtimeServerEventResponseDoneSerializer implements PrimitiveSerializer<RealtimeServerEventResponseDone> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseDone, _$RealtimeServerEventResponseDone];

  @override
  final String wireName = r'RealtimeServerEventResponseDone';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseDone object, {
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
      specifiedType: const FullType(RealtimeServerEventResponseDoneTypeEnum),
    );
    yield r'response';
    yield serializers.serialize(
      object.response,
      specifiedType: const FullType(RealtimeResponse),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventResponseDone object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseDoneBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventResponseDoneTypeEnum),
          ) as RealtimeServerEventResponseDoneTypeEnum;
          result.type = valueDes;
          break;
        case r'response':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeResponse),
          ) as RealtimeResponse;
          result.response.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventResponseDone deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseDoneBuilder();
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

class RealtimeServerEventResponseDoneTypeEnum extends EnumClass {

  /// The event type, must be `response.done`.
  @BuiltValueEnumConst(wireName: r'response.done')
  static const RealtimeServerEventResponseDoneTypeEnum responsePeriodDone = _$realtimeServerEventResponseDoneTypeEnum_responsePeriodDone;

  static Serializer<RealtimeServerEventResponseDoneTypeEnum> get serializer => _$realtimeServerEventResponseDoneTypeEnumSerializer;

  const RealtimeServerEventResponseDoneTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseDoneTypeEnum> get values => _$realtimeServerEventResponseDoneTypeEnumValues;
  static RealtimeServerEventResponseDoneTypeEnum valueOf(String name) => _$realtimeServerEventResponseDoneTypeEnumValueOf(name);
}

