//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/chunking_strategy_request_param.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_vector_store_file_request.g.dart';

/// CreateVectorStoreFileRequest
///
/// Properties:
/// * [fileId] - A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
/// * [chunkingStrategy] 
@BuiltValue()
abstract class CreateVectorStoreFileRequest implements Built<CreateVectorStoreFileRequest, CreateVectorStoreFileRequestBuilder> {
  /// A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
  @BuiltValueField(wireName: r'file_id')
  String get fileId;

  @BuiltValueField(wireName: r'chunking_strategy')
  ChunkingStrategyRequestParam? get chunkingStrategy;

  CreateVectorStoreFileRequest._();

  factory CreateVectorStoreFileRequest([void updates(CreateVectorStoreFileRequestBuilder b)]) = _$CreateVectorStoreFileRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateVectorStoreFileRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateVectorStoreFileRequest> get serializer => _$CreateVectorStoreFileRequestSerializer();
}

class _$CreateVectorStoreFileRequestSerializer implements PrimitiveSerializer<CreateVectorStoreFileRequest> {
  @override
  final Iterable<Type> types = const [CreateVectorStoreFileRequest, _$CreateVectorStoreFileRequest];

  @override
  final String wireName = r'CreateVectorStoreFileRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateVectorStoreFileRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'file_id';
    yield serializers.serialize(
      object.fileId,
      specifiedType: const FullType(String),
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
    CreateVectorStoreFileRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateVectorStoreFileRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'file_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.fileId = valueDes;
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
  CreateVectorStoreFileRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateVectorStoreFileRequestBuilder();
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

