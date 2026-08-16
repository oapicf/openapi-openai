//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/usage_time_bucket_result_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'usage_time_bucket.g.dart';

/// UsageTimeBucket
///
/// Properties:
/// * [object] 
/// * [startTime] 
/// * [endTime] 
/// * [result] 
@BuiltValue()
abstract class UsageTimeBucket implements Built<UsageTimeBucket, UsageTimeBucketBuilder> {
  @BuiltValueField(wireName: r'object')
  UsageTimeBucketObjectEnum get object;
  // enum objectEnum {  bucket,  };

  @BuiltValueField(wireName: r'start_time')
  int get startTime;

  @BuiltValueField(wireName: r'end_time')
  int get endTime;

  @BuiltValueField(wireName: r'result')
  BuiltList<UsageTimeBucketResultInner> get result;

  UsageTimeBucket._();

  factory UsageTimeBucket([void updates(UsageTimeBucketBuilder b)]) = _$UsageTimeBucket;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsageTimeBucketBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsageTimeBucket> get serializer => _$UsageTimeBucketSerializer();
}

class _$UsageTimeBucketSerializer implements PrimitiveSerializer<UsageTimeBucket> {
  @override
  final Iterable<Type> types = const [UsageTimeBucket, _$UsageTimeBucket];

  @override
  final String wireName = r'UsageTimeBucket';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsageTimeBucket object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UsageTimeBucketObjectEnum),
    );
    yield r'start_time';
    yield serializers.serialize(
      object.startTime,
      specifiedType: const FullType(int),
    );
    yield r'end_time';
    yield serializers.serialize(
      object.endTime,
      specifiedType: const FullType(int),
    );
    yield r'result';
    yield serializers.serialize(
      object.result,
      specifiedType: const FullType(BuiltList, [FullType(UsageTimeBucketResultInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    UsageTimeBucket object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UsageTimeBucketBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UsageTimeBucketObjectEnum),
          ) as UsageTimeBucketObjectEnum;
          result.object = valueDes;
          break;
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.startTime = valueDes;
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.endTime = valueDes;
          break;
        case r'result':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(UsageTimeBucketResultInner)]),
          ) as BuiltList<UsageTimeBucketResultInner>;
          result.result.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UsageTimeBucket deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsageTimeBucketBuilder();
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

class UsageTimeBucketObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'bucket')
  static const UsageTimeBucketObjectEnum bucket = _$usageTimeBucketObjectEnum_bucket;

  static Serializer<UsageTimeBucketObjectEnum> get serializer => _$usageTimeBucketObjectEnumSerializer;

  const UsageTimeBucketObjectEnum._(String name): super(name);

  static BuiltSet<UsageTimeBucketObjectEnum> get values => _$usageTimeBucketObjectEnumValues;
  static UsageTimeBucketObjectEnum valueOf(String name) => _$usageTimeBucketObjectEnumValueOf(name);
}

