//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chunking_strategy_request_param.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_vector_store_file_batch_request.g.dart';

/// CreateVectorStoreFileBatchRequest
///
/// Properties:
/// * [fileIds] - A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
/// * [chunkingStrategy] 
@BuiltValue()
abstract class CreateVectorStoreFileBatchRequest implements Built<CreateVectorStoreFileBatchRequest, CreateVectorStoreFileBatchRequestBuilder> {
  /// A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
  @BuiltValueField(wireName: r'file_ids')
  BuiltList<String> get fileIds;

  @BuiltValueField(wireName: r'chunking_strategy')
  ChunkingStrategyRequestParam? get chunkingStrategy;

  CreateVectorStoreFileBatchRequest._();

  factory CreateVectorStoreFileBatchRequest([void updates(CreateVectorStoreFileBatchRequestBuilder b)]) = _$CreateVectorStoreFileBatchRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateVectorStoreFileBatchRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateVectorStoreFileBatchRequest> get serializer => _$CreateVectorStoreFileBatchRequestSerializer();
}

class _$CreateVectorStoreFileBatchRequestSerializer implements PrimitiveSerializer<CreateVectorStoreFileBatchRequest> {
  @override
  final Iterable<Type> types = const [CreateVectorStoreFileBatchRequest, _$CreateVectorStoreFileBatchRequest];

  @override
  final String wireName = r'CreateVectorStoreFileBatchRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateVectorStoreFileBatchRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'file_ids';
    yield serializers.serialize(
      object.fileIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    if (object.chunkingStrategy != null) {
      yield r'chunking_strategy';
      yield serializers.serialize(
        object.chunkingStrategy,
        specifiedType: const FullType(ChunkingStrategyRequestParam),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateVectorStoreFileBatchRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateVectorStoreFileBatchRequestBuilder result,
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
        case r'chunking_strategy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ChunkingStrategyRequestParam),
          ) as ChunkingStrategyRequestParam;
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
  CreateVectorStoreFileBatchRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateVectorStoreFileBatchRequestBuilder();
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

