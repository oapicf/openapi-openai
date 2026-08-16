//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_details_message_creation_object_message_creation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_message_creation_object.g.dart';

/// Details of the message creation by the run step.
///
/// Properties:
/// * [type] - Always `message_creation`.
/// * [messageCreation] 
@BuiltValue()
abstract class RunStepDetailsMessageCreationObject implements Built<RunStepDetailsMessageCreationObject, RunStepDetailsMessageCreationObjectBuilder> {
  /// Always `message_creation`.
  @BuiltValueField(wireName: r'type')
  RunStepDetailsMessageCreationObjectTypeEnum get type;
  // enum typeEnum {  message_creation,  };

  @BuiltValueField(wireName: r'message_creation')
  RunStepDetailsMessageCreationObjectMessageCreation get messageCreation;

  RunStepDetailsMessageCreationObject._();

  factory RunStepDetailsMessageCreationObject([void updates(RunStepDetailsMessageCreationObjectBuilder b)]) = _$RunStepDetailsMessageCreationObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsMessageCreationObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsMessageCreationObject> get serializer => _$RunStepDetailsMessageCreationObjectSerializer();
}

class _$RunStepDetailsMessageCreationObjectSerializer implements PrimitiveSerializer<RunStepDetailsMessageCreationObject> {
  @override
  final Iterable<Type> types = const [RunStepDetailsMessageCreationObject, _$RunStepDetailsMessageCreationObject];

  @override
  final String wireName = r'RunStepDetailsMessageCreationObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsMessageCreationObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDetailsMessageCreationObjectTypeEnum),
    );
    yield r'message_creation';
    yield serializers.serialize(
      object.messageCreation,
      specifiedType: const FullType(RunStepDetailsMessageCreationObjectMessageCreation),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsMessageCreationObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsMessageCreationObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsMessageCreationObjectTypeEnum),
          ) as RunStepDetailsMessageCreationObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'message_creation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsMessageCreationObjectMessageCreation),
          ) as RunStepDetailsMessageCreationObjectMessageCreation;
          result.messageCreation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDetailsMessageCreationObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsMessageCreationObjectBuilder();
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

class RunStepDetailsMessageCreationObjectTypeEnum extends EnumClass {

  /// Always `message_creation`.
  @BuiltValueEnumConst(wireName: r'message_creation')
  static const RunStepDetailsMessageCreationObjectTypeEnum messageCreation = _$runStepDetailsMessageCreationObjectTypeEnum_messageCreation;

  static Serializer<RunStepDetailsMessageCreationObjectTypeEnum> get serializer => _$runStepDetailsMessageCreationObjectTypeEnumSerializer;

  const RunStepDetailsMessageCreationObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDetailsMessageCreationObjectTypeEnum> get values => _$runStepDetailsMessageCreationObjectTypeEnumValues;
  static RunStepDetailsMessageCreationObjectTypeEnum valueOf(String name) => _$runStepDetailsMessageCreationObjectTypeEnumValueOf(name);
}

