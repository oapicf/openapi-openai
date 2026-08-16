//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_client_event_response_cancel.g.dart';

/// Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
///
/// Properties:
/// * [eventId] - Optional client-generated ID used to identify this event.
/// * [type] - The event type, must be `response.cancel`.
/// * [responseId] - A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
@BuiltValue()
abstract class RealtimeClientEventResponseCancel implements Built<RealtimeClientEventResponseCancel, RealtimeClientEventResponseCancelBuilder> {
  /// Optional client-generated ID used to identify this event.
  @BuiltValueField(wireName: r'event_id')
  String? get eventId;

  /// The event type, must be `response.cancel`.
  @BuiltValueField(wireName: r'type')
  RealtimeClientEventResponseCancelTypeEnum get type;
  // enum typeEnum {  response.cancel,  };

  /// A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
  @BuiltValueField(wireName: r'response_id')
  String? get responseId;

  RealtimeClientEventResponseCancel._();

  factory RealtimeClientEventResponseCancel([void updates(RealtimeClientEventResponseCancelBuilder b)]) = _$RealtimeClientEventResponseCancel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeClientEventResponseCancelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeClientEventResponseCancel> get serializer => _$RealtimeClientEventResponseCancelSerializer();
}

class _$RealtimeClientEventResponseCancelSerializer implements PrimitiveSerializer<RealtimeClientEventResponseCancel> {
  @override
  final Iterable<Type> types = const [RealtimeClientEventResponseCancel, _$RealtimeClientEventResponseCancel];

  @override
  final String wireName = r'RealtimeClientEventResponseCancel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeClientEventResponseCancel object, {
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
      specifiedType: const FullType(RealtimeClientEventResponseCancelTypeEnum),
    );
    if (object.responseId != null) {
      yield r'response_id';
      yield serializers.serialize(
        object.responseId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeClientEventResponseCancel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeClientEventResponseCancelBuilder result,
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
            specifiedType: const FullType(RealtimeClientEventResponseCancelTypeEnum),
          ) as RealtimeClientEventResponseCancelTypeEnum;
          result.type = valueDes;
          break;
        case r'response_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.responseId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeClientEventResponseCancel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeClientEventResponseCancelBuilder();
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

class RealtimeClientEventResponseCancelTypeEnum extends EnumClass {

  /// The event type, must be `response.cancel`.
  @BuiltValueEnumConst(wireName: r'response.cancel')
  static const RealtimeClientEventResponseCancelTypeEnum responsePeriodCancel = _$realtimeClientEventResponseCancelTypeEnum_responsePeriodCancel;

  static Serializer<RealtimeClientEventResponseCancelTypeEnum> get serializer => _$realtimeClientEventResponseCancelTypeEnumSerializer;

  const RealtimeClientEventResponseCancelTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeClientEventResponseCancelTypeEnum> get values => _$realtimeClientEventResponseCancelTypeEnumValues;
  static RealtimeClientEventResponseCancelTypeEnum valueOf(String name) => _$realtimeClientEventResponseCancelTypeEnumValueOf(name);
}

