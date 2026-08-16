//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_vector_store_file_response.g.dart';

/// DeleteVectorStoreFileResponse
///
/// Properties:
/// * [id] 
/// * [deleted] 
/// * [object] 
@BuiltValue()
abstract class DeleteVectorStoreFileResponse implements Built<DeleteVectorStoreFileResponse, DeleteVectorStoreFileResponseBuilder> {
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  @BuiltValueField(wireName: r'object')
  DeleteVectorStoreFileResponseObjectEnum get object;
  // enum objectEnum {  vector_store.file.deleted,  };

  DeleteVectorStoreFileResponse._();

  factory DeleteVectorStoreFileResponse([void updates(DeleteVectorStoreFileResponseBuilder b)]) = _$DeleteVectorStoreFileResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteVectorStoreFileResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteVectorStoreFileResponse> get serializer => _$DeleteVectorStoreFileResponseSerializer();
}

class _$DeleteVectorStoreFileResponseSerializer implements PrimitiveSerializer<DeleteVectorStoreFileResponse> {
  @override
  final Iterable<Type> types = const [DeleteVectorStoreFileResponse, _$DeleteVectorStoreFileResponse];

  @override
  final String wireName = r'DeleteVectorStoreFileResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteVectorStoreFileResponse object, {
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
      specifiedType: const FullType(DeleteVectorStoreFileResponseObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteVectorStoreFileResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteVectorStoreFileResponseBuilder result,
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
            specifiedType: const FullType(DeleteVectorStoreFileResponseObjectEnum),
          ) as DeleteVectorStoreFileResponseObjectEnum;
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
  DeleteVectorStoreFileResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteVectorStoreFileResponseBuilder();
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

class DeleteVectorStoreFileResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'vector_store.file.deleted')
  static const DeleteVectorStoreFileResponseObjectEnum vectorStorePeriodFilePeriodDeleted = _$deleteVectorStoreFileResponseObjectEnum_vectorStorePeriodFilePeriodDeleted;

  static Serializer<DeleteVectorStoreFileResponseObjectEnum> get serializer => _$deleteVectorStoreFileResponseObjectEnumSerializer;

  const DeleteVectorStoreFileResponseObjectEnum._(String name): super(name);

  static BuiltSet<DeleteVectorStoreFileResponseObjectEnum> get values => _$deleteVectorStoreFileResponseObjectEnumValues;
  static DeleteVectorStoreFileResponseObjectEnum valueOf(String name) => _$deleteVectorStoreFileResponseObjectEnumValueOf(name);
}

