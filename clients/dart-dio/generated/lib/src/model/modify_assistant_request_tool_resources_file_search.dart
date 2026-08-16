//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'modify_assistant_request_tool_resources_file_search.g.dart';

/// ModifyAssistantRequestToolResourcesFileSearch
///
/// Properties:
/// * [vectorStoreIds] - Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
@BuiltValue()
abstract class ModifyAssistantRequestToolResourcesFileSearch implements Built<ModifyAssistantRequestToolResourcesFileSearch, ModifyAssistantRequestToolResourcesFileSearchBuilder> {
  /// Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  @BuiltValueField(wireName: r'vector_store_ids')
  BuiltList<String>? get vectorStoreIds;

  ModifyAssistantRequestToolResourcesFileSearch._();

  factory ModifyAssistantRequestToolResourcesFileSearch([void updates(ModifyAssistantRequestToolResourcesFileSearchBuilder b)]) = _$ModifyAssistantRequestToolResourcesFileSearch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ModifyAssistantRequestToolResourcesFileSearchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ModifyAssistantRequestToolResourcesFileSearch> get serializer => _$ModifyAssistantRequestToolResourcesFileSearchSerializer();
}

class _$ModifyAssistantRequestToolResourcesFileSearchSerializer implements PrimitiveSerializer<ModifyAssistantRequestToolResourcesFileSearch> {
  @override
  final Iterable<Type> types = const [ModifyAssistantRequestToolResourcesFileSearch, _$ModifyAssistantRequestToolResourcesFileSearch];

  @override
  final String wireName = r'ModifyAssistantRequestToolResourcesFileSearch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ModifyAssistantRequestToolResourcesFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.vectorStoreIds != null) {
      yield r'vector_store_ids';
      yield serializers.serialize(
        object.vectorStoreIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ModifyAssistantRequestToolResourcesFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ModifyAssistantRequestToolResourcesFileSearchBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ModifyAssistantRequestToolResourcesFileSearch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ModifyAssistantRequestToolResourcesFileSearchBuilder();
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

