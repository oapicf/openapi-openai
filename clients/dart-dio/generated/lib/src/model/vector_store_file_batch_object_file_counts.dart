//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'vector_store_file_batch_object_file_counts.g.dart';

/// VectorStoreFileBatchObjectFileCounts
///
/// Properties:
/// * [inProgress] - The number of files that are currently being processed.
/// * [completed] - The number of files that have been processed.
/// * [failed] - The number of files that have failed to process.
/// * [cancelled] - The number of files that where cancelled.
/// * [total] - The total number of files.
@BuiltValue()
abstract class VectorStoreFileBatchObjectFileCounts implements Built<VectorStoreFileBatchObjectFileCounts, VectorStoreFileBatchObjectFileCountsBuilder> {
  /// The number of files that are currently being processed.
  @BuiltValueField(wireName: r'in_progress')
  int get inProgress;

  /// The number of files that have been processed.
  @BuiltValueField(wireName: r'completed')
  int get completed;

  /// The number of files that have failed to process.
  @BuiltValueField(wireName: r'failed')
  int get failed;

  /// The number of files that where cancelled.
  @BuiltValueField(wireName: r'cancelled')
  int get cancelled;

  /// The total number of files.
  @BuiltValueField(wireName: r'total')
  int get total;

  VectorStoreFileBatchObjectFileCounts._();

  factory VectorStoreFileBatchObjectFileCounts([void updates(VectorStoreFileBatchObjectFileCountsBuilder b)]) = _$VectorStoreFileBatchObjectFileCounts;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VectorStoreFileBatchObjectFileCountsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VectorStoreFileBatchObjectFileCounts> get serializer => _$VectorStoreFileBatchObjectFileCountsSerializer();
}

class _$VectorStoreFileBatchObjectFileCountsSerializer implements PrimitiveSerializer<VectorStoreFileBatchObjectFileCounts> {
  @override
  final Iterable<Type> types = const [VectorStoreFileBatchObjectFileCounts, _$VectorStoreFileBatchObjectFileCounts];

  @override
  final String wireName = r'VectorStoreFileBatchObjectFileCounts';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VectorStoreFileBatchObjectFileCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'in_progress';
    yield serializers.serialize(
      object.inProgress,
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
    yield r'cancelled';
    yield serializers.serialize(
      object.cancelled,
      specifiedType: const FullType(int),
    );
    yield r'total';
    yield serializers.serialize(
      object.total,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    VectorStoreFileBatchObjectFileCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VectorStoreFileBatchObjectFileCountsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'in_progress':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.inProgress = valueDes;
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
        case r'cancelled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.cancelled = valueDes;
          break;
        case r'total':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.total = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VectorStoreFileBatchObjectFileCounts deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VectorStoreFileBatchObjectFileCountsBuilder();
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

