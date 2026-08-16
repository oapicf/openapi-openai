//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_delta_step_details_message_creation_object_message_creation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_message_creation_object.g.dart';

/// Details of the message creation by the run step.
///
/// Properties:
/// * [type] - Always `message_creation`.
/// * [messageCreation] 
@BuiltValue()
abstract class RunStepDeltaStepDetailsMessageCreationObject implements Built<RunStepDeltaStepDetailsMessageCreationObject, RunStepDeltaStepDetailsMessageCreationObjectBuilder> {
  /// Always `message_creation`.
  @BuiltValueField(wireName: r'type')
  RunStepDeltaStepDetailsMessageCreationObjectTypeEnum get type;
  // enum typeEnum {  message_creation,  };

  @BuiltValueField(wireName: r'message_creation')
  RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? get messageCreation;

  RunStepDeltaStepDetailsMessageCreationObject._();

  factory RunStepDeltaStepDetailsMessageCreationObject([void updates(RunStepDeltaStepDetailsMessageCreationObjectBuilder b)]) = _$RunStepDeltaStepDetailsMessageCreationObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsMessageCreationObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsMessageCreationObject> get serializer => _$RunStepDeltaStepDetailsMessageCreationObjectSerializer();
}

class _$RunStepDeltaStepDetailsMessageCreationObjectSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsMessageCreationObject> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsMessageCreationObject, _$RunStepDeltaStepDetailsMessageCreationObject];

  @override
  final String wireName = r'RunStepDeltaStepDetailsMessageCreationObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsMessageCreationObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDeltaStepDetailsMessageCreationObjectTypeEnum),
    );
    if (object.messageCreation != null) {
      yield r'message_creation';
      yield serializers.serialize(
        object.messageCreation,
        specifiedType: const FullType(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsMessageCreationObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsMessageCreationObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaStepDetailsMessageCreationObjectTypeEnum),
          ) as RunStepDeltaStepDetailsMessageCreationObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'message_creation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaStepDetailsMessageCreationObjectMessageCreation),
          ) as RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
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
  RunStepDeltaStepDetailsMessageCreationObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsMessageCreationObjectBuilder();
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

class RunStepDeltaStepDetailsMessageCreationObjectTypeEnum extends EnumClass {

  /// Always `message_creation`.
  @BuiltValueEnumConst(wireName: r'message_creation')
  static const RunStepDeltaStepDetailsMessageCreationObjectTypeEnum messageCreation = _$runStepDeltaStepDetailsMessageCreationObjectTypeEnum_messageCreation;

  static Serializer<RunStepDeltaStepDetailsMessageCreationObjectTypeEnum> get serializer => _$runStepDeltaStepDetailsMessageCreationObjectTypeEnumSerializer;

  const RunStepDeltaStepDetailsMessageCreationObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaStepDetailsMessageCreationObjectTypeEnum> get values => _$runStepDeltaStepDetailsMessageCreationObjectTypeEnumValues;
  static RunStepDeltaStepDetailsMessageCreationObjectTypeEnum valueOf(String name) => _$runStepDeltaStepDetailsMessageCreationObjectTypeEnumValueOf(name);
}

