//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_vector_store_response.g.dart';

/// DeleteVectorStoreResponse
///
/// Properties:
/// * [id] 
/// * [deleted] 
/// * [object] 
@BuiltValue()
abstract class DeleteVectorStoreResponse implements Built<DeleteVectorStoreResponse, DeleteVectorStoreResponseBuilder> {
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  @BuiltValueField(wireName: r'object')
  DeleteVectorStoreResponseObjectEnum get object;
  // enum objectEnum {  vector_store.deleted,  };

  DeleteVectorStoreResponse._();

  factory DeleteVectorStoreResponse([void updates(DeleteVectorStoreResponseBuilder b)]) = _$DeleteVectorStoreResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteVectorStoreResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteVectorStoreResponse> get serializer => _$DeleteVectorStoreResponseSerializer();
}

class _$DeleteVectorStoreResponseSerializer implements PrimitiveSerializer<DeleteVectorStoreResponse> {
  @override
  final Iterable<Type> types = const [DeleteVectorStoreResponse, _$DeleteVectorStoreResponse];

  @override
  final String wireName = r'DeleteVectorStoreResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteVectorStoreResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'deleted';
    yield serializers.serialize(
      object.deleted,
      specifiedType: const FullType(bool),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(DeleteVectorStoreResponseObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteVectorStoreResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteVectorStoreResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.deleted = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DeleteVectorStoreResponseObjectEnum),
          ) as DeleteVectorStoreResponseObjectEnum;
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
  DeleteVectorStoreResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteVectorStoreResponseBuilder();
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

class DeleteVectorStoreResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'vector_store.deleted')
  static const DeleteVectorStoreResponseObjectEnum vectorStorePeriodDeleted = _$deleteVectorStoreResponseObjectEnum_vectorStorePeriodDeleted;

  static Serializer<DeleteVectorStoreResponseObjectEnum> get serializer => _$deleteVectorStoreResponseObjectEnumSerializer;

  const DeleteVectorStoreResponseObjectEnum._(String name): super(name);

  static BuiltSet<DeleteVectorStoreResponseObjectEnum> get values => _$deleteVectorStoreResponseObjectEnumValues;
  static DeleteVectorStoreResponseObjectEnum valueOf(String name) => _$deleteVectorStoreResponseObjectEnumValueOf(name);
}

