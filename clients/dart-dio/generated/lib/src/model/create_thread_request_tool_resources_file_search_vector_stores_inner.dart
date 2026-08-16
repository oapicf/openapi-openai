//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_thread_request_tool_resources_file_search_vector_stores_inner.g.dart';

/// CreateThreadRequestToolResourcesFileSearchVectorStoresInner
///
/// Properties:
/// * [fileIds] - A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
/// * [chunkingStrategy] 
/// * [metadata] - Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
@BuiltValue()
abstract class CreateThreadRequestToolResourcesFileSearchVectorStoresInner implements Built<CreateThreadRequestToolResourcesFileSearchVectorStoresInner, CreateThreadRequestToolResourcesFileSearchVectorStoresInnerBuilder> {
  /// A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
  @BuiltValueField(wireName: r'file_ids')
  BuiltList<String>? get fileIds;

  @BuiltValueField(wireName: r'chunking_strategy')
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy? get chunkingStrategy;

  /// Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  CreateThreadRequestToolResourcesFileSearchVectorStoresInner._();

  factory CreateThreadRequestToolResourcesFileSearchVectorStoresInner([void updates(CreateThreadRequestToolResourcesFileSearchVectorStoresInnerBuilder b)]) = _$CreateThreadRequestToolResourcesFileSearchVectorStoresInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateThreadRequestToolResourcesFileSearchVectorStoresInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> get serializer => _$CreateThreadRequestToolResourcesFileSearchVectorStoresInnerSerializer();
}

class _$CreateThreadRequestToolResourcesFileSearchVectorStoresInnerSerializer implements PrimitiveSerializer<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> {
  @override
  final Iterable<Type> types = const [CreateThreadRequestToolResourcesFileSearchVectorStoresInner, _$CreateThreadRequestToolResourcesFileSearchVectorStoresInner];

  @override
  final String wireName = r'CreateThreadRequestToolResourcesFileSearchVectorStoresInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateThreadRequestToolResourcesFileSearchVectorStoresInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fileIds != null) {
      yield r'file_ids';
      yield serializers.serialize(
        object.fileIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.chunkingStrategy != null) {
      yield r'chunking_strategy';
      yield serializers.serialize(
        object.chunkingStrategy,
        specifiedType: const FullType(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy),
      );
    }
    if (object.metadata != null) {
      yield r'metadata';
      yield serializers.serialize(
        object.metadata,
        specifiedType: const FullType(JsonObject),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateThreadRequestToolResourcesFileSearchVectorStoresInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateThreadRequestToolResourcesFileSearchVectorStoresInnerBuilder result,
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
            specifiedType: const FullType(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy),
          ) as CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;
          result.chunkingStrategy.replace(valueDes);
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
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
  CreateThreadRequestToolResourcesFileSearchVectorStoresInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateThreadRequestToolResourcesFileSearchVectorStoresInnerBuilder();
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

