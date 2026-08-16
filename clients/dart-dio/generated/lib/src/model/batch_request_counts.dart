//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'batch_request_counts.g.dart';

/// The request counts for different statuses within the batch.
///
/// Properties:
/// * [total] - Total number of requests in the batch.
/// * [completed] - Number of requests that have been completed successfully.
/// * [failed] - Number of requests that have failed.
@BuiltValue()
abstract class BatchRequestCounts implements Built<BatchRequestCounts, BatchRequestCountsBuilder> {
  /// Total number of requests in the batch.
  @BuiltValueField(wireName: r'total')
  int get total;

  /// Number of requests that have been completed successfully.
  @BuiltValueField(wireName: r'completed')
  int get completed;

  /// Number of requests that have failed.
  @BuiltValueField(wireName: r'failed')
  int get failed;

  BatchRequestCounts._();

  factory BatchRequestCounts([void updates(BatchRequestCountsBuilder b)]) = _$BatchRequestCounts;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BatchRequestCountsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BatchRequestCounts> get serializer => _$BatchRequestCountsSerializer();
}

class _$BatchRequestCountsSerializer implements PrimitiveSerializer<BatchRequestCounts> {
  @override
  final Iterable<Type> types = const [BatchRequestCounts, _$BatchRequestCounts];

  @override
  final String wireName = r'BatchRequestCounts';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BatchRequestCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'total';
    yield serializers.serialize(
      object.total,
      specifiedType: const FullType(int),
    );
    yield r'completed';
    yield serializers.serialize(
      object.completed,
      specifiedType: const FullType(int),
    );
    yield r'failed';
    yield serializers.serialize(
      object.failed,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BatchRequestCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BatchRequestCountsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'total':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.total = valueDes;
          break;
        case r'completed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.completed = valueDes;
          break;
        case r'failed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.failed = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BatchRequestCounts deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BatchRequestCountsBuilder();
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

