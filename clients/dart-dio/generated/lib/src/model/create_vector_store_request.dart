//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_vector_store_request_chunking_strategy.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/vector_store_expiration_after.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_vector_store_request.g.dart';

/// CreateVectorStoreRequest
///
/// Properties:
/// * [fileIds] - A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
/// * [name] - The name of the vector store.
/// * [expiresAfter] 
/// * [chunkingStrategy] 
/// * [metadata] - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
@BuiltValue()
abstract class CreateVectorStoreRequest implements Built<CreateVectorStoreRequest, CreateVectorStoreRequestBuilder> {
  /// A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
  @BuiltValueField(wireName: r'file_ids')
  BuiltList<String>? get fileIds;

  /// The name of the vector store.
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'expires_after')
  VectorStoreExpirationAfter? get expiresAfter;

  @BuiltValueField(wireName: r'chunking_strategy')
  CreateVectorStoreRequestChunkingStrategy? get chunkingStrategy;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  CreateVectorStoreRequest._();

  factory CreateVectorStoreRequest([void updates(CreateVectorStoreRequestBuilder b)]) = _$CreateVectorStoreRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateVectorStoreRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateVectorStoreRequest> get serializer => _$CreateVectorStoreRequestSerializer();
}

class _$CreateVectorStoreRequestSerializer implements PrimitiveSerializer<CreateVectorStoreRequest> {
  @override
  final Iterable<Type> types = const [CreateVectorStoreRequest, _$CreateVectorStoreRequest];

  @override
  final String wireName = r'CreateVectorStoreRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateVectorStoreRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fileIds != null) {
      yield r'file_ids';
      yield serializers.serialize(
        object.fileIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.expiresAfter != null) {
      yield r'expires_after';
      yield serializers.serialize(
        object.expiresAfter,
        specifiedType: const FullType(VectorStoreExpirationAfter),
      );
    }
    if (object.chunkingStrategy != null) {
      yield r'chunking_strategy';
      yield serializers.serialize(
        object.chunkingStrategy,
        specifiedType: const FullType(CreateVectorStoreRequestChunkingStrategy),
      );
    }
    if (object.metadata != null) {
      yield r'metadata';
      yield serializers.serialize(
        object.metadata,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateVectorStoreRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateVectorStoreRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'file_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.fileIds.replace(valueDes);
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'expires_after':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VectorStoreExpirationAfter),
          ) as VectorStoreExpirationAfter;
          result.expiresAfter.replace(valueDes);
          break;
        case r'chunking_strategy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateVectorStoreRequestChunkingStrategy),
          ) as CreateVectorStoreRequestChunkingStrategy;
          result.chunkingStrategy.replace(valueDes);
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
  CreateVectorStoreRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateVectorStoreRequestBuilder();
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

