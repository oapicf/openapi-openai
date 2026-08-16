//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_message_response.g.dart';

/// DeleteMessageResponse
///
/// Properties:
/// * [id] 
/// * [deleted] 
/// * [object] 
@BuiltValue()
abstract class DeleteMessageResponse implements Built<DeleteMessageResponse, DeleteMessageResponseBuilder> {
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  @BuiltValueField(wireName: r'object')
  DeleteMessageResponseObjectEnum get object;
  // enum objectEnum {  thread.message.deleted,  };

  DeleteMessageResponse._();

  factory DeleteMessageResponse([void updates(DeleteMessageResponseBuilder b)]) = _$DeleteMessageResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteMessageResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteMessageResponse> get serializer => _$DeleteMessageResponseSerializer();
}

class _$DeleteMessageResponseSerializer implements PrimitiveSerializer<DeleteMessageResponse> {
  @override
  final Iterable<Type> types = const [DeleteMessageResponse, _$DeleteMessageResponse];

  @override
  final String wireName = r'DeleteMessageResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteMessageResponse object, {
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
      specifiedType: const FullType(DeleteMessageResponseObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteMessageResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteMessageResponseBuilder result,
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
            specifiedType: const FullType(DeleteMessageResponseObjectEnum),
          ) as DeleteMessageResponseObjectEnum;
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
  DeleteMessageResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteMessageResponseBuilder();
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

class DeleteMessageResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.message.deleted')
  static const DeleteMessageResponseObjectEnum threadPeriodMessagePeriodDeleted = _$deleteMessageResponseObjectEnum_threadPeriodMessagePeriodDeleted;

  static Serializer<DeleteMessageResponseObjectEnum> get serializer => _$deleteMessageResponseObjectEnumSerializer;

  const DeleteMessageResponseObjectEnum._(String name): super(name);

  static BuiltSet<DeleteMessageResponseObjectEnum> get values => _$deleteMessageResponseObjectEnumValues;
  static DeleteMessageResponseObjectEnum valueOf(String name) => _$deleteMessageResponseObjectEnumValueOf(name);
}

