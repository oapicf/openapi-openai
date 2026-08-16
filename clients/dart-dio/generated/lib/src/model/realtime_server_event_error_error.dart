//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_error_error.g.dart';

/// Details of the error.
///
/// Properties:
/// * [type] - The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
/// * [code] - Error code, if any.
/// * [message] - A human-readable error message.
/// * [param] - Parameter related to the error, if any.
/// * [eventId] - The event_id of the client event that caused the error, if applicable. 
@BuiltValue()
abstract class RealtimeServerEventErrorError implements Built<RealtimeServerEventErrorError, RealtimeServerEventErrorErrorBuilder> {
  /// The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
  @BuiltValueField(wireName: r'type')
  String get type;

  /// Error code, if any.
  @BuiltValueField(wireName: r'code')
  String? get code;

  /// A human-readable error message.
  @BuiltValueField(wireName: r'message')
  String get message;

  /// Parameter related to the error, if any.
  @BuiltValueField(wireName: r'param')
  String? get param;

  /// The event_id of the client event that caused the error, if applicable. 
  @BuiltValueField(wireName: r'event_id')
  String? get eventId;

  RealtimeServerEventErrorError._();

  factory RealtimeServerEventErrorError([void updates(RealtimeServerEventErrorErrorBuilder b)]) = _$RealtimeServerEventErrorError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventErrorErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventErrorError> get serializer => _$RealtimeServerEventErrorErrorSerializer();
}

class _$RealtimeServerEventErrorErrorSerializer implements PrimitiveSerializer<RealtimeServerEventErrorError> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventErrorError, _$RealtimeServerEventErrorError];

  @override
  final String wireName = r'RealtimeServerEventErrorError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventErrorError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(String),
    );
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(String),
    );
    if (object.param != null) {
      yield r'param';
      yield serializers.serialize(
        object.param,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.eventId != null) {
      yield r'event_id';
      yield serializers.serialize(
        object.eventId,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventErrorError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventErrorErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.type = valueDes;
          break;
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        case r'param':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.param = valueDes;
          break;
        case r'event_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.eventId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventErrorError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventErrorErrorBuilder();
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

