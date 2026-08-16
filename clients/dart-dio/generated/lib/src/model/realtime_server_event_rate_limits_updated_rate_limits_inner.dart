//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_rate_limits_updated_rate_limits_inner.g.dart';

/// RealtimeServerEventRateLimitsUpdatedRateLimitsInner
///
/// Properties:
/// * [name] - The name of the rate limit (`requests`, `tokens`). 
/// * [limit] - The maximum allowed value for the rate limit.
/// * [remaining] - The remaining value before the limit is reached.
/// * [resetSeconds] - Seconds until the rate limit resets.
@BuiltValue()
abstract class RealtimeServerEventRateLimitsUpdatedRateLimitsInner implements Built<RealtimeServerEventRateLimitsUpdatedRateLimitsInner, RealtimeServerEventRateLimitsUpdatedRateLimitsInnerBuilder> {
  /// The name of the rate limit (`requests`, `tokens`). 
  @BuiltValueField(wireName: r'name')
  RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum? get name;
  // enum nameEnum {  requests,  tokens,  };

  /// The maximum allowed value for the rate limit.
  @BuiltValueField(wireName: r'limit')
  int? get limit;

  /// The remaining value before the limit is reached.
  @BuiltValueField(wireName: r'remaining')
  int? get remaining;

  /// Seconds until the rate limit resets.
  @BuiltValueField(wireName: r'reset_seconds')
  num? get resetSeconds;

  RealtimeServerEventRateLimitsUpdatedRateLimitsInner._();

  factory RealtimeServerEventRateLimitsUpdatedRateLimitsInner([void updates(RealtimeServerEventRateLimitsUpdatedRateLimitsInnerBuilder b)]) = _$RealtimeServerEventRateLimitsUpdatedRateLimitsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventRateLimitsUpdatedRateLimitsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> get serializer => _$RealtimeServerEventRateLimitsUpdatedRateLimitsInnerSerializer();
}

class _$RealtimeServerEventRateLimitsUpdatedRateLimitsInnerSerializer implements PrimitiveSerializer<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventRateLimitsUpdatedRateLimitsInner, _$RealtimeServerEventRateLimitsUpdatedRateLimitsInner];

  @override
  final String wireName = r'RealtimeServerEventRateLimitsUpdatedRateLimitsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventRateLimitsUpdatedRateLimitsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum),
      );
    }
    if (object.limit != null) {
      yield r'limit';
      yield serializers.serialize(
        object.limit,
        specifiedType: const FullType(int),
      );
    }
    if (object.remaining != null) {
      yield r'remaining';
      yield serializers.serialize(
        object.remaining,
        specifiedType: const FullType(int),
      );
    }
    if (object.resetSeconds != null) {
      yield r'reset_seconds';
      yield serializers.serialize(
        object.resetSeconds,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventRateLimitsUpdatedRateLimitsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventRateLimitsUpdatedRateLimitsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum),
          ) as RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum;
          result.name = valueDes;
          break;
        case r'limit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.limit = valueDes;
          break;
        case r'remaining':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.remaining = valueDes;
          break;
        case r'reset_seconds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.resetSeconds = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventRateLimitsUpdatedRateLimitsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventRateLimitsUpdatedRateLimitsInnerBuilder();
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

class RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum extends EnumClass {

  /// The name of the rate limit (`requests`, `tokens`). 
  @BuiltValueEnumConst(wireName: r'requests')
  static const RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum requests = _$realtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum_requests;
  /// The name of the rate limit (`requests`, `tokens`). 
  @BuiltValueEnumConst(wireName: r'tokens')
  static const RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum tokens = _$realtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum_tokens;

  static Serializer<RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum> get serializer => _$realtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnumSerializer;

  const RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum> get values => _$realtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnumValues;
  static RealtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnum valueOf(String name) => _$realtimeServerEventRateLimitsUpdatedRateLimitsInnerNameEnumValueOf(name);
}

