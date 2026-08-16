//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/vector_store_file_object_chunking_strategy.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/vector_store_file_object_last_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'vector_store_file_object.g.dart';

/// A list of files attached to a vector store.
///
/// Properties:
/// * [id] - The identifier, which can be referenced in API endpoints.
/// * [object] - The object type, which is always `vector_store.file`.
/// * [usageBytes] - The total vector store usage in bytes. Note that this may be different from the original file size.
/// * [createdAt] - The Unix timestamp (in seconds) for when the vector store file was created.
/// * [vectorStoreId] - The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
/// * [status] - The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
/// * [lastError] 
/// * [chunkingStrategy] 
@BuiltValue()
abstract class VectorStoreFileObject implements Built<VectorStoreFileObject, VectorStoreFileObjectBuilder> {
  /// The identifier, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `vector_store.file`.
  @BuiltValueField(wireName: r'object')
  VectorStoreFileObjectObjectEnum get object;
  // enum objectEnum {  vector_store.file,  };

  /// The total vector store usage in bytes. Note that this may be different from the original file size.
  @BuiltValueField(wireName: r'usage_bytes')
  int get usageBytes;

  /// The Unix timestamp (in seconds) for when the vector store file was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
  @BuiltValueField(wireName: r'vector_store_id')
  String get vectorStoreId;

  /// The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
  @BuiltValueField(wireName: r'status')
  VectorStoreFileObjectStatusEnum get status;
  // enum statusEnum {  in_progress,  completed,  cancelled,  failed,  };

  @BuiltValueField(wireName: r'last_error')
  VectorStoreFileObjectLastError? get lastError;

  @BuiltValueField(wireName: r'chunking_strategy')
  VectorStoreFileObjectChunkingStrategy? get chunkingStrategy;

  VectorStoreFileObject._();

  factory VectorStoreFileObject([void updates(VectorStoreFileObjectBuilder b)]) = _$VectorStoreFileObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VectorStoreFileObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VectorStoreFileObject> get serializer => _$VectorStoreFileObjectSerializer();
}

class _$VectorStoreFileObjectSerializer implements PrimitiveSerializer<VectorStoreFileObject> {
  @override
  final Iterable<Type> types = const [VectorStoreFileObject, _$VectorStoreFileObject];

  @override
  final String wireName = r'VectorStoreFileObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VectorStoreFileObject object, {
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
      specifiedType: const FullType(VectorStoreFileObjectObjectEnum),
    );
    yield r'usage_bytes';
    yield serializers.serialize(
      object.usageBytes,
      specifiedType: const FullType(int),
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
      specifiedType: const FullType(VectorStoreFileObjectStatusEnum),
    );
    yield r'last_error';
    yield object.lastError == null ? null : serializers.serialize(
      object.lastError,
      specifiedType: const FullType.nullable(VectorStoreFileObjectLastError),
    );
    if (object.chunkingStrategy != null) {
      yield r'chunking_strategy';
      yield serializers.serialize(
        object.chunkingStrategy,
        specifiedType: const FullType(VectorStoreFileObjectChunkingStrategy),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    VectorStoreFileObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VectorStoreFileObjectBuilder result,
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
            specifiedType: const FullType(VectorStoreFileObjectObjectEnum),
          ) as VectorStoreFileObjectObjectEnum;
          result.object = valueDes;
          break;
        case r'usage_bytes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.usageBytes = valueDes;
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
            specifiedType: const FullType(VectorStoreFileObjectStatusEnum),
          ) as VectorStoreFileObjectStatusEnum;
          result.status = valueDes;
          break;
        case r'last_error':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(VectorStoreFileObjectLastError),
          ) as VectorStoreFileObjectLastError?;
          if (valueDes == null) continue;
          result.lastError.replace(valueDes);
          break;
        case r'chunking_strategy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreFileObjectChunkingStrategy),
          ) as VectorStoreFileObjectChunkingStrategy;
          result.chunkingStrategy.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VectorStoreFileObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VectorStoreFileObjectBuilder();
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

class VectorStoreFileObjectObjectEnum extends EnumClass {

  /// The object type, which is always `vector_store.file`.
  @BuiltValueEnumConst(wireName: r'vector_store.file')
  static const VectorStoreFileObjectObjectEnum vectorStorePeriodFile = _$vectorStoreFileObjectObjectEnum_vectorStorePeriodFile;

  static Serializer<VectorStoreFileObjectObjectEnum> get serializer => _$vectorStoreFileObjectObjectEnumSerializer;

  const VectorStoreFileObjectObjectEnum._(String name): super(name);

  static BuiltSet<VectorStoreFileObjectObjectEnum> get values => _$vectorStoreFileObjectObjectEnumValues;
  static VectorStoreFileObjectObjectEnum valueOf(String name) => _$vectorStoreFileObjectObjectEnumValueOf(name);
}

class VectorStoreFileObjectStatusEnum extends EnumClass {

  /// The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
  @BuiltValueEnumConst(wireName: r'in_progress')
  static const VectorStoreFileObjectStatusEnum inProgress = _$vectorStoreFileObjectStatusEnum_inProgress;
  /// The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
  @BuiltValueEnumConst(wireName: r'completed')
  static const VectorStoreFileObjectStatusEnum completed = _$vectorStoreFileObjectStatusEnum_completed;
  /// The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
  @BuiltValueEnumConst(wireName: r'cancelled')
  static const VectorStoreFileObjectStatusEnum cancelled = _$vectorStoreFileObjectStatusEnum_cancelled;
  /// The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
  @BuiltValueEnumConst(wireName: r'failed')
  static const VectorStoreFileObjectStatusEnum failed = _$vectorStoreFileObjectStatusEnum_failed;

  static Serializer<VectorStoreFileObjectStatusEnum> get serializer => _$vectorStoreFileObjectStatusEnumSerializer;

  const VectorStoreFileObjectStatusEnum._(String name): super(name);

  static BuiltSet<VectorStoreFileObjectStatusEnum> get values => _$vectorStoreFileObjectStatusEnumValues;
  static VectorStoreFileObjectStatusEnum valueOf(String name) => _$vectorStoreFileObjectStatusEnumValueOf(name);
}

