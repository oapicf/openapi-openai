//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/vector_store_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'list_vector_stores_response.g.dart';

/// ListVectorStoresResponse
///
/// Properties:
/// * [object] 
/// * [data] 
/// * [firstId] 
/// * [lastId] 
/// * [hasMore] 
@BuiltValue()
abstract class ListVectorStoresResponse implements Built<ListVectorStoresResponse, ListVectorStoresResponseBuilder> {
  @BuiltValueField(wireName: r'object')
  String get object;

  @BuiltValueField(wireName: r'data')
  BuiltList<VectorStoreObject> get data;

  @BuiltValueField(wireName: r'first_id')
  String get firstId;

  @BuiltValueField(wireName: r'last_id')
  String get lastId;

  @BuiltValueField(wireName: r'has_more')
  bool get hasMore;

  ListVectorStoresResponse._();

  factory ListVectorStoresResponse([void updates(ListVectorStoresResponseBuilder b)]) = _$ListVectorStoresResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ListVectorStoresResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ListVectorStoresResponse> get serializer => _$ListVectorStoresResponseSerializer();
}

class _$ListVectorStoresResponseSerializer implements PrimitiveSerializer<ListVectorStoresResponse> {
  @override
  final Iterable<Type> types = const [ListVectorStoresResponse, _$ListVectorStoresResponse];

  @override
  final String wireName = r'ListVectorStoresResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ListVectorStoresResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(String),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(VectorStoreObject)]),
    );
    yield r'first_id';
    yield serializers.serialize(
      object.firstId,
      specifiedType: const FullType(String),
    );
    yield r'last_id';
    yield serializers.serialize(
      object.lastId,
      specifiedType: const FullType(String),
    );
    yield r'has_more';
    yield serializers.serialize(
      object.hasMore,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ListVectorStoresResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ListVectorStoresResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.object = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(VectorStoreObject)]),
          ) as BuiltList<VectorStoreObject>;
          result.data.replace(valueDes);
          break;
        case r'first_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.firstId = valueDes;
          break;
        case r'last_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.lastId = valueDes;
          break;
        case r'has_more':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hasMore = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ListVectorStoresResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ListVectorStoresResponseBuilder();
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

