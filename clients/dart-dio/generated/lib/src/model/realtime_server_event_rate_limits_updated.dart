//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/realtime_server_event_rate_limits_updated_rate_limits_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_rate_limits_updated.g.dart';

/// Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `rate_limits.updated`.
/// * [rateLimits] - List of rate limit information.
@BuiltValue()
abstract class RealtimeServerEventRateLimitsUpdated implements Built<RealtimeServerEventRateLimitsUpdated, RealtimeServerEventRateLimitsUpdatedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `rate_limits.updated`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventRateLimitsUpdatedTypeEnum get type;
  // enum typeEnum {  rate_limits.updated,  };

  /// List of rate limit information.
  @BuiltValueField(wireName: r'rate_limits')
  BuiltList<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> get rateLimits;

  RealtimeServerEventRateLimitsUpdated._();

  factory RealtimeServerEventRateLimitsUpdated([void updates(RealtimeServerEventRateLimitsUpdatedBuilder b)]) = _$RealtimeServerEventRateLimitsUpdated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventRateLimitsUpdatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventRateLimitsUpdated> get serializer => _$RealtimeServerEventRateLimitsUpdatedSerializer();
}

class _$RealtimeServerEventRateLimitsUpdatedSerializer implements PrimitiveSerializer<RealtimeServerEventRateLimitsUpdated> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventRateLimitsUpdated, _$RealtimeServerEventRateLimitsUpdated];

  @override
  final String wireName = r'RealtimeServerEventRateLimitsUpdated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventRateLimitsUpdated object, {
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
      specifiedType: const FullType(RealtimeServerEventRateLimitsUpdatedTypeEnum),
    );
    yield r'rate_limits';
    yield serializers.serialize(
      object.rateLimits,
      specifiedType: const FullType(BuiltList, [FullType(RealtimeServerEventRateLimitsUpdatedRateLimitsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventRateLimitsUpdated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventRateLimitsUpdatedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventRateLimitsUpdatedTypeEnum),
          ) as RealtimeServerEventRateLimitsUpdatedTypeEnum;
          result.type = valueDes;
          break;
        case r'rate_limits':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RealtimeServerEventRateLimitsUpdatedRateLimitsInner)]),
          ) as BuiltList<RealtimeServerEventRateLimitsUpdatedRateLimitsInner>;
          result.rateLimits.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventRateLimitsUpdated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventRateLimitsUpdatedBuilder();
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

class RealtimeServerEventRateLimitsUpdatedTypeEnum extends EnumClass {

  /// The event type, must be `rate_limits.updated`.
  @BuiltValueEnumConst(wireName: r'rate_limits.updated')
  static const RealtimeServerEventRateLimitsUpdatedTypeEnum rateLimitsPeriodUpdated = _$realtimeServerEventRateLimitsUpdatedTypeEnum_rateLimitsPeriodUpdated;

  static Serializer<RealtimeServerEventRateLimitsUpdatedTypeEnum> get serializer => _$realtimeServerEventRateLimitsUpdatedTypeEnumSerializer;

  const RealtimeServerEventRateLimitsUpdatedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventRateLimitsUpdatedTypeEnum> get values => _$realtimeServerEventRateLimitsUpdatedTypeEnumValues;
  static RealtimeServerEventRateLimitsUpdatedTypeEnum valueOf(String name) => _$realtimeServerEventRateLimitsUpdatedTypeEnumValueOf(name);
}

