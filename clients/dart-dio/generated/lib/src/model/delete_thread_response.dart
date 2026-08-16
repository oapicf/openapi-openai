//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_thread_response.g.dart';

/// DeleteThreadResponse
///
/// Properties:
/// * [id] 
/// * [deleted] 
/// * [object] 
@BuiltValue()
abstract class DeleteThreadResponse implements Built<DeleteThreadResponse, DeleteThreadResponseBuilder> {
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  @BuiltValueField(wireName: r'object')
  DeleteThreadResponseObjectEnum get object;
  // enum objectEnum {  thread.deleted,  };

  DeleteThreadResponse._();

  factory DeleteThreadResponse([void updates(DeleteThreadResponseBuilder b)]) = _$DeleteThreadResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteThreadResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteThreadResponse> get serializer => _$DeleteThreadResponseSerializer();
}

class _$DeleteThreadResponseSerializer implements PrimitiveSerializer<DeleteThreadResponse> {
  @override
  final Iterable<Type> types = const [DeleteThreadResponse, _$DeleteThreadResponse];

  @override
  final String wireName = r'DeleteThreadResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteThreadResponse object, {
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
      specifiedType: const FullType(DeleteThreadResponseObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteThreadResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteThreadResponseBuilder result,
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
            specifiedType: const FullType(DeleteThreadResponseObjectEnum),
          ) as DeleteThreadResponseObjectEnum;
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
  DeleteThreadResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteThreadResponseBuilder();
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

class DeleteThreadResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.deleted')
  static const DeleteThreadResponseObjectEnum threadPeriodDeleted = _$deleteThreadResponseObjectEnum_threadPeriodDeleted;

  static Serializer<DeleteThreadResponseObjectEnum> get serializer => _$deleteThreadResponseObjectEnumSerializer;

  const DeleteThreadResponseObjectEnum._(String name): super(name);

  static BuiltSet<DeleteThreadResponseObjectEnum> get values => _$deleteThreadResponseObjectEnumValues;
  static DeleteThreadResponseObjectEnum valueOf(String name) => _$deleteThreadResponseObjectEnumValueOf(name);
}

