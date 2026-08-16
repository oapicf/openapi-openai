//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_session_create_request.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_client_event_session_update.g.dart';

/// Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
///
/// Properties:
/// * [eventId] - Optional client-generated ID used to identify this event.
/// * [type] - The event type, must be `session.update`.
/// * [session] 
@BuiltValue()
abstract class RealtimeClientEventSessionUpdate implements Built<RealtimeClientEventSessionUpdate, RealtimeClientEventSessionUpdateBuilder> {
  /// Optional client-generated ID used to identify this event.
  @BuiltValueField(wireName: r'event_id')
  String? get eventId;

  /// The event type, must be `session.update`.
  @BuiltValueField(wireName: r'type')
  RealtimeClientEventSessionUpdateTypeEnum get type;
  // enum typeEnum {  session.update,  };

  @BuiltValueField(wireName: r'session')
  RealtimeSessionCreateRequest get session;

  RealtimeClientEventSessionUpdate._();

  factory RealtimeClientEventSessionUpdate([void updates(RealtimeClientEventSessionUpdateBuilder b)]) = _$RealtimeClientEventSessionUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeClientEventSessionUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeClientEventSessionUpdate> get serializer => _$RealtimeClientEventSessionUpdateSerializer();
}

class _$RealtimeClientEventSessionUpdateSerializer implements PrimitiveSerializer<RealtimeClientEventSessionUpdate> {
  @override
  final Iterable<Type> types = const [RealtimeClientEventSessionUpdate, _$RealtimeClientEventSessionUpdate];

  @override
  final String wireName = r'RealtimeClientEventSessionUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeClientEventSessionUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventId != null) {
      yield r'event_id';
      yield serializers.serialize(
        object.eventId,
        specifiedType: const FullType(String),
      );
    }
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RealtimeClientEventSessionUpdateTypeEnum),
    );
    yield r'session';
    yield serializers.serialize(
      object.session,
      specifiedType: const FullType(RealtimeSessionCreateRequest),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeClientEventSessionUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeClientEventSessionUpdateBuilder result,
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
            specifiedType: const FullType(RealtimeClientEventSessionUpdateTypeEnum),
          ) as RealtimeClientEventSessionUpdateTypeEnum;
          result.type = valueDes;
          break;
        case r'session':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeSessionCreateRequest),
          ) as RealtimeSessionCreateRequest;
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
  RealtimeClientEventSessionUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeClientEventSessionUpdateBuilder();
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

class RealtimeClientEventSessionUpdateTypeEnum extends EnumClass {

  /// The event type, must be `session.update`.
  @BuiltValueEnumConst(wireName: r'session.update')
  static const RealtimeClientEventSessionUpdateTypeEnum sessionPeriodUpdate = _$realtimeClientEventSessionUpdateTypeEnum_sessionPeriodUpdate;

  static Serializer<RealtimeClientEventSessionUpdateTypeEnum> get serializer => _$realtimeClientEventSessionUpdateTypeEnumSerializer;

  const RealtimeClientEventSessionUpdateTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeClientEventSessionUpdateTypeEnum> get values => _$realtimeClientEventSessionUpdateTypeEnumValues;
  static RealtimeClientEventSessionUpdateTypeEnum valueOf(String name) => _$realtimeClientEventSessionUpdateTypeEnumValueOf(name);
}

