//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/realtime_server_event_error_error.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_error.g.dart';

/// Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `error`.
/// * [error] 
@BuiltValue()
abstract class RealtimeServerEventError implements Built<RealtimeServerEventError, RealtimeServerEventErrorBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `error`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventErrorTypeEnum get type;
  // enum typeEnum {  error,  };

  @BuiltValueField(wireName: r'error')
  RealtimeServerEventErrorError get error;

  RealtimeServerEventError._();

  factory RealtimeServerEventError([void updates(RealtimeServerEventErrorBuilder b)]) = _$RealtimeServerEventError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventError> get serializer => _$RealtimeServerEventErrorSerializer();
}

class _$RealtimeServerEventErrorSerializer implements PrimitiveSerializer<RealtimeServerEventError> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventError, _$RealtimeServerEventError];

  @override
  final String wireName = r'RealtimeServerEventError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventError object, {
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
      specifiedType: const FullType(RealtimeServerEventErrorTypeEnum),
    );
    yield r'error';
    yield serializers.serialize(
      object.error,
      specifiedType: const FullType(RealtimeServerEventErrorError),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventErrorBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventErrorTypeEnum),
          ) as RealtimeServerEventErrorTypeEnum;
          result.type = valueDes;
          break;
        case r'error':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeServerEventErrorError),
          ) as RealtimeServerEventErrorError;
          result.error.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventErrorBuilder();
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

class RealtimeServerEventErrorTypeEnum extends EnumClass {

  /// The event type, must be `error`.
  @BuiltValueEnumConst(wireName: r'error')
  static const RealtimeServerEventErrorTypeEnum error = _$realtimeServerEventErrorTypeEnum_error;

  static Serializer<RealtimeServerEventErrorTypeEnum> get serializer => _$realtimeServerEventErrorTypeEnumSerializer;

  const RealtimeServerEventErrorTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventErrorTypeEnum> get values => _$realtimeServerEventErrorTypeEnumValues;
  static RealtimeServerEventErrorTypeEnum valueOf(String name) => _$realtimeServerEventErrorTypeEnumValueOf(name);
}

