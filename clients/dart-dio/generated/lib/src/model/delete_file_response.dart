//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_file_response.g.dart';

/// DeleteFileResponse
///
/// Properties:
/// * [id] 
/// * [object] 
/// * [deleted] 
@BuiltValue()
abstract class DeleteFileResponse implements Built<DeleteFileResponse, DeleteFileResponseBuilder> {
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'object')
  DeleteFileResponseObjectEnum get object;
  // enum objectEnum {  file,  };

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  DeleteFileResponse._();

  factory DeleteFileResponse([void updates(DeleteFileResponseBuilder b)]) = _$DeleteFileResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteFileResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteFileResponse> get serializer => _$DeleteFileResponseSerializer();
}

class _$DeleteFileResponseSerializer implements PrimitiveSerializer<DeleteFileResponse> {
  @override
  final Iterable<Type> types = const [DeleteFileResponse, _$DeleteFileResponse];

  @override
  final String wireName = r'DeleteFileResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteFileResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(DeleteFileResponseObjectEnum),
    );
    yield r'deleted';
    yield serializers.serialize(
      object.deleted,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteFileResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteFileResponseBuilder result,
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
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DeleteFileResponseObjectEnum),
          ) as DeleteFileResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.deleted = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteFileResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteFileResponseBuilder();
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

class DeleteFileResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'file')
  static const DeleteFileResponseObjectEnum file = _$deleteFileResponseObjectEnum_file;

  static Serializer<DeleteFileResponseObjectEnum> get serializer => _$deleteFileResponseObjectEnumSerializer;

  const DeleteFileResponseObjectEnum._(String name): super(name);

  static BuiltSet<DeleteFileResponseObjectEnum> get values => _$deleteFileResponseObjectEnumValues;
  static DeleteFileResponseObjectEnum valueOf(String name) => _$deleteFileResponseObjectEnumValueOf(name);
}

