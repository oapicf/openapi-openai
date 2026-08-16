//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/vector_store_file_batch_object_file_counts.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'vector_store_file_batch_object.g.dart';

/// A batch of files attached to a vector store.
///
/// Properties:
/// * [id] - The identifier, which can be referenced in API endpoints.
/// * [object] - The object type, which is always `vector_store.file_batch`.
/// * [createdAt] - The Unix timestamp (in seconds) for when the vector store files batch was created.
/// * [vectorStoreId] - The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
/// * [status] - The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
/// * [fileCounts] 
@BuiltValue()
abstract class VectorStoreFileBatchObject implements Built<VectorStoreFileBatchObject, VectorStoreFileBatchObjectBuilder> {
  /// The identifier, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `vector_store.file_batch`.
  @BuiltValueField(wireName: r'object')
  VectorStoreFileBatchObjectObjectEnum get object;
  // enum objectEnum {  vector_store.files_batch,  };

  /// The Unix timestamp (in seconds) for when the vector store files batch was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
  @BuiltValueField(wireName: r'vector_store_id')
  String get vectorStoreId;

  /// The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
  @BuiltValueField(wireName: r'status')
  VectorStoreFileBatchObjectStatusEnum get status;
  // enum statusEnum {  in_progress,  completed,  cancelled,  failed,  };

  @BuiltValueField(wireName: r'file_counts')
  VectorStoreFileBatchObjectFileCounts get fileCounts;

  VectorStoreFileBatchObject._();

  factory VectorStoreFileBatchObject([void updates(VectorStoreFileBatchObjectBuilder b)]) = _$VectorStoreFileBatchObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VectorStoreFileBatchObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VectorStoreFileBatchObject> get serializer => _$VectorStoreFileBatchObjectSerializer();
}

class _$VectorStoreFileBatchObjectSerializer implements PrimitiveSerializer<VectorStoreFileBatchObject> {
  @override
  final Iterable<Type> types = const [VectorStoreFileBatchObject, _$VectorStoreFileBatchObject];

  @override
  final String wireName = r'VectorStoreFileBatchObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VectorStoreFileBatchObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(VectorStoreFileBatchObjectObjectEnum),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'vector_store_id';
    yield serializers.serialize(
      object.vectorStoreId,
      specifiedType: const FullType(String),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(VectorStoreFileBatchObjectStatusEnum),
    );
    yield r'file_counts';
    yield serializers.serialize(
      object.fileCounts,
      specifiedType: const FullType(VectorStoreFileBatchObjectFileCounts),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    VectorStoreFileBatchObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VectorStoreFileBatchObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreFileBatchObjectObjectEnum),
          ) as VectorStoreFileBatchObjectObjectEnum;
          result.object = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'vector_store_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.vectorStoreId = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreFileBatchObjectStatusEnum),
          ) as VectorStoreFileBatchObjectStatusEnum;
          result.status = valueDes;
          break;
        case r'file_counts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreFileBatchObjectFileCounts),
          ) as VectorStoreFileBatchObjectFileCounts;
          result.fileCounts.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VectorStoreFileBatchObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VectorStoreFileBatchObjectBuilder();
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

class VectorStoreFileBatchObjectObjectEnum extends EnumClass {

  /// The object type, which is always `vector_store.file_batch`.
  @BuiltValueEnumConst(wireName: r'vector_store.files_batch')
  static const VectorStoreFileBatchObjectObjectEnum vectorStorePeriodFilesBatch = _$vectorStoreFileBatchObjectObjectEnum_vectorStorePeriodFilesBatch;

  static Serializer<VectorStoreFileBatchObjectObjectEnum> get serializer => _$vectorStoreFileBatchObjectObjectEnumSerializer;

  const VectorStoreFileBatchObjectObjectEnum._(String name): super(name);

  static BuiltSet<VectorStoreFileBatchObjectObjectEnum> get values => _$vectorStoreFileBatchObjectObjectEnumValues;
  static VectorStoreFileBatchObjectObjectEnum valueOf(String name) => _$vectorStoreFileBatchObjectObjectEnumValueOf(name);
}

class VectorStoreFileBatchObjectStatusEnum extends EnumClass {

  /// The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
  @BuiltValueEnumConst(wireName: r'in_progress')
  static const VectorStoreFileBatchObjectStatusEnum inProgress = _$vectorStoreFileBatchObjectStatusEnum_inProgress;
  /// The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
  @BuiltValueEnumConst(wireName: r'completed')
  static const VectorStoreFileBatchObjectStatusEnum completed = _$vectorStoreFileBatchObjectStatusEnum_completed;
  /// The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
  @BuiltValueEnumConst(wireName: r'cancelled')
  static const VectorStoreFileBatchObjectStatusEnum cancelled = _$vectorStoreFileBatchObjectStatusEnum_cancelled;
  /// The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
  @BuiltValueEnumConst(wireName: r'failed')
  static const VectorStoreFileBatchObjectStatusEnum failed = _$vectorStoreFileBatchObjectStatusEnum_failed;

  static Serializer<VectorStoreFileBatchObjectStatusEnum> get serializer => _$vectorStoreFileBatchObjectStatusEnumSerializer;

  const VectorStoreFileBatchObjectStatusEnum._(String name): super(name);

  static BuiltSet<VectorStoreFileBatchObjectStatusEnum> get values => _$vectorStoreFileBatchObjectStatusEnumValues;
  static VectorStoreFileBatchObjectStatusEnum valueOf(String name) => _$vectorStoreFileBatchObjectStatusEnumValueOf(name);
}

