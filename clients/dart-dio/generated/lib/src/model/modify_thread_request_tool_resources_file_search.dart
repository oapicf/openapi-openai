//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'modify_thread_request_tool_resources_file_search.g.dart';

/// ModifyThreadRequestToolResourcesFileSearch
///
/// Properties:
/// * [vectorStoreIds] - The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
@BuiltValue()
abstract class ModifyThreadRequestToolResourcesFileSearch implements Built<ModifyThreadRequestToolResourcesFileSearch, ModifyThreadRequestToolResourcesFileSearchBuilder> {
  /// The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
  @BuiltValueField(wireName: r'vector_store_ids')
  BuiltList<String>? get vectorStoreIds;

  ModifyThreadRequestToolResourcesFileSearch._();

  factory ModifyThreadRequestToolResourcesFileSearch([void updates(ModifyThreadRequestToolResourcesFileSearchBuilder b)]) = _$ModifyThreadRequestToolResourcesFileSearch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ModifyThreadRequestToolResourcesFileSearchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ModifyThreadRequestToolResourcesFileSearch> get serializer => _$ModifyThreadRequestToolResourcesFileSearchSerializer();
}

class _$ModifyThreadRequestToolResourcesFileSearchSerializer implements PrimitiveSerializer<ModifyThreadRequestToolResourcesFileSearch> {
  @override
  final Iterable<Type> types = const [ModifyThreadRequestToolResourcesFileSearch, _$ModifyThreadRequestToolResourcesFileSearch];

  @override
  final String wireName = r'ModifyThreadRequestToolResourcesFileSearch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ModifyThreadRequestToolResourcesFileSearch object, {
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
    ModifyThreadRequestToolResourcesFileSearch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ModifyThreadRequestToolResourcesFileSearchBuilder result,
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
  ModifyThreadRequestToolResourcesFileSearch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ModifyThreadRequestToolResourcesFileSearchBuilder();
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

