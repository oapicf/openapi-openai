//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_created.g.dart';

/// Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `response.created`.
/// * [response] 
@BuiltValue()
abstract class RealtimeServerEventResponseCreated implements Built<RealtimeServerEventResponseCreated, RealtimeServerEventResponseCreatedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `response.created`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseCreatedTypeEnum get type;
  // enum typeEnum {  response.created,  };

  @BuiltValueField(wireName: r'response')
  RealtimeResponse get response;

  RealtimeServerEventResponseCreated._();

  factory RealtimeServerEventResponseCreated([void updates(RealtimeServerEventResponseCreatedBuilder b)]) = _$RealtimeServerEventResponseCreated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseCreatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseCreated> get serializer => _$RealtimeServerEventResponseCreatedSerializer();
}

class _$RealtimeServerEventResponseCreatedSerializer implements PrimitiveSerializer<RealtimeServerEventResponseCreated> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseCreated, _$RealtimeServerEventResponseCreated];

  @override
  final String wireName = r'RealtimeServerEventResponseCreated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseCreated object, {
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
      specifiedType: const FullType(RealtimeServerEventResponseCreatedTypeEnum),
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
    RealtimeServerEventResponseCreated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseCreatedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventResponseCreatedTypeEnum),
          ) as RealtimeServerEventResponseCreatedTypeEnum;
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
  RealtimeServerEventResponseCreated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseCreatedBuilder();
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

class RealtimeServerEventResponseCreatedTypeEnum extends EnumClass {

  /// The event type, must be `response.created`.
  @BuiltValueEnumConst(wireName: r'response.created')
  static const RealtimeServerEventResponseCreatedTypeEnum responsePeriodCreated = _$realtimeServerEventResponseCreatedTypeEnum_responsePeriodCreated;

  static Serializer<RealtimeServerEventResponseCreatedTypeEnum> get serializer => _$realtimeServerEventResponseCreatedTypeEnumSerializer;

  const RealtimeServerEventResponseCreatedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseCreatedTypeEnum> get values => _$realtimeServerEventResponseCreatedTypeEnumValues;
  static RealtimeServerEventResponseCreatedTypeEnum valueOf(String name) => _$realtimeServerEventResponseCreatedTypeEnumValueOf(name);
}

