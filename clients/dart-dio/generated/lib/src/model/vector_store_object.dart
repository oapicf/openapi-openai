//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/vector_store_expiration_after.dart';
import 'package:openapi/src/model/vector_store_object_file_counts.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'vector_store_object.g.dart';

/// A vector store is a collection of processed files can be used by the `file_search` tool.
///
/// Properties:
/// * [id] - The identifier, which can be referenced in API endpoints.
/// * [object] - The object type, which is always `vector_store`.
/// * [createdAt] - The Unix timestamp (in seconds) for when the vector store was created.
/// * [name] - The name of the vector store.
/// * [usageBytes] - The total number of bytes used by the files in the vector store.
/// * [fileCounts] 
/// * [status] - The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
/// * [expiresAfter] 
/// * [expiresAt] - The Unix timestamp (in seconds) for when the vector store will expire.
/// * [lastActiveAt] - The Unix timestamp (in seconds) for when the vector store was last active.
/// * [metadata] - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
@BuiltValue()
abstract class VectorStoreObject implements Built<VectorStoreObject, VectorStoreObjectBuilder> {
  /// The identifier, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `vector_store`.
  @BuiltValueField(wireName: r'object')
  VectorStoreObjectObjectEnum get object;
  // enum objectEnum {  vector_store,  };

  /// The Unix timestamp (in seconds) for when the vector store was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The name of the vector store.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The total number of bytes used by the files in the vector store.
  @BuiltValueField(wireName: r'usage_bytes')
  int get usageBytes;

  @BuiltValueField(wireName: r'file_counts')
  VectorStoreObjectFileCounts get fileCounts;

  /// The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
  @BuiltValueField(wireName: r'status')
  VectorStoreObjectStatusEnum get status;
  // enum statusEnum {  expired,  in_progress,  completed,  };

  @BuiltValueField(wireName: r'expires_after')
  VectorStoreExpirationAfter? get expiresAfter;

  /// The Unix timestamp (in seconds) for when the vector store will expire.
  @BuiltValueField(wireName: r'expires_at')
  int? get expiresAt;

  /// The Unix timestamp (in seconds) for when the vector store was last active.
  @BuiltValueField(wireName: r'last_active_at')
  int? get lastActiveAt;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  VectorStoreObject._();

  factory VectorStoreObject([void updates(VectorStoreObjectBuilder b)]) = _$VectorStoreObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VectorStoreObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VectorStoreObject> get serializer => _$VectorStoreObjectSerializer();
}

class _$VectorStoreObjectSerializer implements PrimitiveSerializer<VectorStoreObject> {
  @override
  final Iterable<Type> types = const [VectorStoreObject, _$VectorStoreObject];

  @override
  final String wireName = r'VectorStoreObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VectorStoreObject object, {
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
      specifiedType: const FullType(VectorStoreObjectObjectEnum),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'usage_bytes';
    yield serializers.serialize(
      object.usageBytes,
      specifiedType: const FullType(int),
    );
    yield r'file_counts';
    yield serializers.serialize(
      object.fileCounts,
      specifiedType: const FullType(VectorStoreObjectFileCounts),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(VectorStoreObjectStatusEnum),
    );
    if (object.expiresAfter != null) {
      yield r'expires_after';
      yield serializers.serialize(
        object.expiresAfter,
        specifiedType: const FullType(VectorStoreExpirationAfter),
      );
    }
    if (object.expiresAt != null) {
      yield r'expires_at';
      yield serializers.serialize(
        object.expiresAt,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'last_active_at';
    yield object.lastActiveAt == null ? null : serializers.serialize(
      object.lastActiveAt,
      specifiedType: const FullType.nullable(int),
    );
    yield r'metadata';
    yield object.metadata == null ? null : serializers.serialize(
      object.metadata,
      specifiedType: const FullType.nullable(JsonObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    VectorStoreObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VectorStoreObjectBuilder result,
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
            specifiedType: const FullType(VectorStoreObjectObjectEnum),
          ) as VectorStoreObjectObjectEnum;
          result.object = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'usage_bytes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.usageBytes = valueDes;
          break;
        case r'file_counts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreObjectFileCounts),
          ) as VectorStoreObjectFileCounts;
          result.fileCounts.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreObjectStatusEnum),
          ) as VectorStoreObjectStatusEnum;
          result.status = valueDes;
          break;
        case r'expires_after':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreExpirationAfter),
          ) as VectorStoreExpirationAfter;
          result.expiresAfter.replace(valueDes);
          break;
        case r'expires_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.expiresAt = valueDes;
          break;
        case r'last_active_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.lastActiveAt = valueDes;
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.metadata = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  VectorStoreObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VectorStoreObjectBuilder();
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

class VectorStoreObjectObjectEnum extends EnumClass {

  /// The object type, which is always `vector_store`.
  @BuiltValueEnumConst(wireName: r'vector_store')
  static const VectorStoreObjectObjectEnum vectorStore = _$vectorStoreObjectObjectEnum_vectorStore;

  static Serializer<VectorStoreObjectObjectEnum> get serializer => _$vectorStoreObjectObjectEnumSerializer;

  const VectorStoreObjectObjectEnum._(String name): super(name);

  static BuiltSet<VectorStoreObjectObjectEnum> get values => _$vectorStoreObjectObjectEnumValues;
  static VectorStoreObjectObjectEnum valueOf(String name) => _$vectorStoreObjectObjectEnumValueOf(name);
}

class VectorStoreObjectStatusEnum extends EnumClass {

  /// The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
  @BuiltValueEnumConst(wireName: r'expired')
  static const VectorStoreObjectStatusEnum expired = _$vectorStoreObjectStatusEnum_expired;
  /// The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
  @BuiltValueEnumConst(wireName: r'in_progress')
  static const VectorStoreObjectStatusEnum inProgress = _$vectorStoreObjectStatusEnum_inProgress;
  /// The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
  @BuiltValueEnumConst(wireName: r'completed')
  static const VectorStoreObjectStatusEnum completed = _$vectorStoreObjectStatusEnum_completed;

  static Serializer<VectorStoreObjectStatusEnum> get serializer => _$vectorStoreObjectStatusEnumSerializer;

  const VectorStoreObjectStatusEnum._(String name): super(name);

  static BuiltSet<VectorStoreObjectStatusEnum> get values => _$vectorStoreObjectStatusEnumValues;
  static VectorStoreObjectStatusEnum valueOf(String name) => _$vectorStoreObjectStatusEnumValueOf(name);
}

