//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_assistant_request_tool_resources_file_search_vector_stores_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_assistant_request_tool_resources_file_search.g.dart';

/// CreateAssistantRequestToolResourcesFileSearch
///
/// Properties:
/// * [vectorStoreIds] - The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
/// * [vectorStores] - A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
@BuiltValue()
abstract class CreateAssistantRequestToolResourcesFileSearch implements Built<CreateAssistantRequestToolResourcesFileSearch, CreateAssistantRequestToolResourcesFileSearchBuilder> {
  /// The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  @BuiltValueField(wireName: r'vector_store_ids')
  BuiltList<String>? get vectorStoreIds;

  /// A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  @BuiltValueField(wireName: r'vector_stores')
  BuiltList<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner>? get vectorStores;

  CreateAssistantRequestToolResourcesFileSearch._();

  factory CreateAssistantRequestToolResourcesFileSearch([void updates(CreateAssistantRequestToolResourcesFileSearchBuilder b)]) = _$CreateAssistantRequestToolResourcesFileSearch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssistantRequestToolResourcesFileSearchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssistantRequestToolResourcesFileSearch> get serializer => _$CreateAssistantRequestToolResourcesFileSearchSerializer();
}

class _$CreateAssistantRequestToolResourcesFileSearchSerializer implements PrimitiveSerializer<CreateAssistantRequestToolResourcesFileSearch> {
  @override
  final Iterable<Type> types = const [CreateAssistantRequestToolResourcesFileSearch, _$CreateAssistantRequestToolResourcesFileSearch];

  @override
  final String wireName = r'CreateAssistantRequestToolResourcesFileSearch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssistantRequestToolResourcesFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.vectorStoreIds != null) {
      yield r'vector_store_ids';
      yield serializers.serialize(
        object.vectorStoreIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.vectorStores != null) {
      yield r'vector_stores';
      yield serializers.serialize(
        object.vectorStores,
        specifiedType: const FullType(BuiltList, [FullType(CreateAssistantRequestToolResourcesFileSearchVectorStoresInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateAssistantRequestToolResourcesFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssistantRequestToolResourcesFileSearchBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'vector_store_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.vectorStoreIds.replace(valueDes);
          break;
        case r'vector_stores':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateAssistantRequestToolResourcesFileSearchVectorStoresInner)]),
          ) as BuiltList<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner>;
          result.vectorStores.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateAssistantRequestToolResourcesFileSearch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssistantRequestToolResourcesFileSearchBuilder();
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

