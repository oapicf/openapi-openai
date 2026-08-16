//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_session.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_session_created.g.dart';

/// Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `session.created`.
/// * [session] 
@BuiltValue()
abstract class RealtimeServerEventSessionCreated implements Built<RealtimeServerEventSessionCreated, RealtimeServerEventSessionCreatedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `session.created`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventSessionCreatedTypeEnum get type;
  // enum typeEnum {  session.created,  };

  @BuiltValueField(wireName: r'session')
  RealtimeSession get session;

  RealtimeServerEventSessionCreated._();

  factory RealtimeServerEventSessionCreated([void updates(RealtimeServerEventSessionCreatedBuilder b)]) = _$RealtimeServerEventSessionCreated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventSessionCreatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventSessionCreated> get serializer => _$RealtimeServerEventSessionCreatedSerializer();
}

class _$RealtimeServerEventSessionCreatedSerializer implements PrimitiveSerializer<RealtimeServerEventSessionCreated> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventSessionCreated, _$RealtimeServerEventSessionCreated];

  @override
  final String wireName = r'RealtimeServerEventSessionCreated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventSessionCreated object, {
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
      specifiedType: const FullType(RealtimeServerEventSessionCreatedTypeEnum),
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
    RealtimeServerEventSessionCreated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventSessionCreatedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventSessionCreatedTypeEnum),
          ) as RealtimeServerEventSessionCreatedTypeEnum;
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
  RealtimeServerEventSessionCreated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventSessionCreatedBuilder();
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

class RealtimeServerEventSessionCreatedTypeEnum extends EnumClass {

  /// The event type, must be `session.created`.
  @BuiltValueEnumConst(wireName: r'session.created')
  static const RealtimeServerEventSessionCreatedTypeEnum sessionPeriodCreated = _$realtimeServerEventSessionCreatedTypeEnum_sessionPeriodCreated;

  static Serializer<RealtimeServerEventSessionCreatedTypeEnum> get serializer => _$realtimeServerEventSessionCreatedTypeEnumSerializer;

  const RealtimeServerEventSessionCreatedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventSessionCreatedTypeEnum> get values => _$realtimeServerEventSessionCreatedTypeEnumValues;
  static RealtimeServerEventSessionCreatedTypeEnum valueOf(String name) => _$realtimeServerEventSessionCreatedTypeEnumValueOf(name);
}

