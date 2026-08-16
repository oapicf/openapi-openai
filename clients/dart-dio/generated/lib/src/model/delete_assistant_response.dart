//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_assistant_response.g.dart';

/// DeleteAssistantResponse
///
/// Properties:
/// * [id] 
/// * [deleted] 
/// * [object] 
@BuiltValue()
abstract class DeleteAssistantResponse implements Built<DeleteAssistantResponse, DeleteAssistantResponseBuilder> {
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'deleted')
  bool get deleted;

  @BuiltValueField(wireName: r'object')
  DeleteAssistantResponseObjectEnum get object;
  // enum objectEnum {  assistant.deleted,  };

  DeleteAssistantResponse._();

  factory DeleteAssistantResponse([void updates(DeleteAssistantResponseBuilder b)]) = _$DeleteAssistantResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteAssistantResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteAssistantResponse> get serializer => _$DeleteAssistantResponseSerializer();
}

class _$DeleteAssistantResponseSerializer implements PrimitiveSerializer<DeleteAssistantResponse> {
  @override
  final Iterable<Type> types = const [DeleteAssistantResponse, _$DeleteAssistantResponse];

  @override
  final String wireName = r'DeleteAssistantResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteAssistantResponse object, {
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
      specifiedType: const FullType(DeleteAssistantResponseObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteAssistantResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteAssistantResponseBuilder result,
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
            specifiedType: const FullType(DeleteAssistantResponseObjectEnum),
          ) as DeleteAssistantResponseObjectEnum;
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
  DeleteAssistantResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteAssistantResponseBuilder();
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

class DeleteAssistantResponseObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'assistant.deleted')
  static const DeleteAssistantResponseObjectEnum assistantPeriodDeleted = _$deleteAssistantResponseObjectEnum_assistantPeriodDeleted;

  static Serializer<DeleteAssistantResponseObjectEnum> get serializer => _$deleteAssistantResponseObjectEnumSerializer;

  const DeleteAssistantResponseObjectEnum._(String name): super(name);

  static BuiltSet<DeleteAssistantResponseObjectEnum> get values => _$deleteAssistantResponseObjectEnumValues;
  static DeleteAssistantResponseObjectEnum valueOf(String name) => _$deleteAssistantResponseObjectEnumValueOf(name);
}

