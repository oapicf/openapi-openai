//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_session.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_session_updated.g.dart';

/// Returned when a session is updated with a `session.update` event, unless  there is an error. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `session.updated`.
/// * [session] 
@BuiltValue()
abstract class RealtimeServerEventSessionUpdated implements Built<RealtimeServerEventSessionUpdated, RealtimeServerEventSessionUpdatedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `session.updated`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventSessionUpdatedTypeEnum get type;
  // enum typeEnum {  session.updated,  };

  @BuiltValueField(wireName: r'session')
  RealtimeSession get session;

  RealtimeServerEventSessionUpdated._();

  factory RealtimeServerEventSessionUpdated([void updates(RealtimeServerEventSessionUpdatedBuilder b)]) = _$RealtimeServerEventSessionUpdated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventSessionUpdatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventSessionUpdated> get serializer => _$RealtimeServerEventSessionUpdatedSerializer();
}

class _$RealtimeServerEventSessionUpdatedSerializer implements PrimitiveSerializer<RealtimeServerEventSessionUpdated> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventSessionUpdated, _$RealtimeServerEventSessionUpdated];

  @override
  final String wireName = r'RealtimeServerEventSessionUpdated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventSessionUpdated object, {
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
      specifiedType: const FullType(RealtimeServerEventSessionUpdatedTypeEnum),
    );
    yield r'session';
    yield serializers.serialize(
      object.session,
      specifiedType: const FullType(RealtimeSession),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventSessionUpdated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventSessionUpdatedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventSessionUpdatedTypeEnum),
          ) as RealtimeServerEventSessionUpdatedTypeEnum;
          result.type = valueDes;
          break;
        case r'session':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSession),
          ) as RealtimeSession;
          result.session.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventSessionUpdated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventSessionUpdatedBuilder();
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

class RealtimeServerEventSessionUpdatedTypeEnum extends EnumClass {

  /// The event type, must be `session.updated`.
  @BuiltValueEnumConst(wireName: r'session.updated')
  static const RealtimeServerEventSessionUpdatedTypeEnum sessionPeriodUpdated = _$realtimeServerEventSessionUpdatedTypeEnum_sessionPeriodUpdated;

  static Serializer<RealtimeServerEventSessionUpdatedTypeEnum> get serializer => _$realtimeServerEventSessionUpdatedTypeEnumSerializer;

  const RealtimeServerEventSessionUpdatedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventSessionUpdatedTypeEnum> get values => _$realtimeServerEventSessionUpdatedTypeEnumValues;
  static RealtimeServerEventSessionUpdatedTypeEnum valueOf(String name) => _$realtimeServerEventSessionUpdatedTypeEnumValueOf(name);
}

