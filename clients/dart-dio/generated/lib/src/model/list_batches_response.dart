//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/batch.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'list_batches_response.g.dart';

/// ListBatchesResponse
///
/// Properties:
/// * [data] 
/// * [firstId] 
/// * [lastId] 
/// * [hasMore] 
/// * [object] 
@BuiltValue()
abstract class ListBatchesResponse implements Built<ListBatchesResponse, ListBatchesResponseBuilder> {
  @BuiltValueField(wireName: r'data')
  BuiltList<Batch> get data;

  @BuiltValueField(wireName: r'first_id')
  String? get firstId;

  @BuiltValueField(wireName: r'last_id')
  String? get lastId;

  @BuiltValueField(wireName: r'has_more')
  bool get hasMore;

  @BuiltValueField(wireName: r'object')
  ListBatchesResponseObjectEnum get object;
  // enum objectEnum {  list,  };

  ListBatchesResponse._();

  factory ListBatchesResponse([void updates(ListBatchesResponseBuilder b)]) = _$ListBatchesResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ListBatchesResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ListBatchesResponse> get serializer => _$ListBatchesResponseSerializer();
}

class _$ListBatchesResponseSerializer implements PrimitiveSerializer<ListBatchesResponse> {
  @override
  final Iterable<Type> types = const [ListBatchesResponse, _$ListBatchesResponse];

  @override
  final String wireName = r'ListBatchesResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ListBatchesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(Batch)]),
    );
    if (object.firstId != null) {
      yield r'first_id';
      yield serializers.serialize(
        object.firstId,
        specifiedType: const FullType(String),
      );
    }
    if (object.lastId != null) {
      yield r'last_id';
      yield serializers.serialize(
        object.lastId,
        specifiedType: const FullType(String),
      );
    }
    yield r'has_more';
    yield serializers.serialize(
      object.hasMore,
      specifiedType: const FullType(bool),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ListBatchesResponseObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ListBatchesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ListBatchesResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Batch)]),
          ) as BuiltList<Batch>;
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
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ListBatchesResponseObjectEnum),
          ) as ListBatchesResponseObjectEnum;
          result.object = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ListBatchesResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ListBatchesResponseBuilder();
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

class ListBatchesResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'list')
  static const ListBatchesResponseObjectEnum list = _$listBatchesResponseObjectEnum_list;

  static Serializer<ListBatchesResponseObjectEnum> get serializer => _$listBatchesResponseObjectEnumSerializer;

  const ListBatchesResponseObjectEnum._(String name): super(name);

  static BuiltSet<ListBatchesResponseObjectEnum> get values => _$listBatchesResponseObjectEnumValues;
  static ListBatchesResponseObjectEnum valueOf(String name) => _$listBatchesResponseObjectEnumValueOf(name);
}

