//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_assistant_request_tool_resources_file_search_vector_stores_inner.g.dart';

/// CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
///
/// Properties:
/// * [fileIds] - A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
/// * [chunkingStrategy] 
/// * [metadata] - Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
@BuiltValue()
abstract class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner implements Built<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner, CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerBuilder> {
  /// A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
  @BuiltValueField(wireName: r'file_ids')
  BuiltList<String>? get fileIds;

  @BuiltValueField(wireName: r'chunking_strategy')
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy? get chunkingStrategy;

  /// Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  CreateAssistantRequestToolResourcesFileSearchVectorStoresInner._();

  factory CreateAssistantRequestToolResourcesFileSearchVectorStoresInner([void updates(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerBuilder b)]) = _$CreateAssistantRequestToolResourcesFileSearchVectorStoresInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> get serializer => _$CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerSerializer();
}

class _$CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerSerializer implements PrimitiveSerializer<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> {
  @override
  final Iterable<Type> types = const [CreateAssistantRequestToolResourcesFileSearchVectorStoresInner, _$CreateAssistantRequestToolResourcesFileSearchVectorStoresInner];

  @override
  final String wireName = r'CreateAssistantRequestToolResourcesFileSearchVectorStoresInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssistantRequestToolResourcesFileSearchVectorStoresInner object, {
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
    CreateAssistantRequestToolResourcesFileSearchVectorStoresInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerBuilder result,
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
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerBuilder();
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

