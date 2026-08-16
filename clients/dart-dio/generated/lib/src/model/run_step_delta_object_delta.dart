//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_delta_object_delta_step_details.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_object_delta.g.dart';

/// The delta containing the fields that have changed on the run step.
///
/// Properties:
/// * [stepDetails] 
@BuiltValue()
abstract class RunStepDeltaObjectDelta implements Built<RunStepDeltaObjectDelta, RunStepDeltaObjectDeltaBuilder> {
  @BuiltValueField(wireName: r'step_details')
  RunStepDeltaObjectDeltaStepDetails? get stepDetails;

  RunStepDeltaObjectDelta._();

  factory RunStepDeltaObjectDelta([void updates(RunStepDeltaObjectDeltaBuilder b)]) = _$RunStepDeltaObjectDelta;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaObjectDeltaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaObjectDelta> get serializer => _$RunStepDeltaObjectDeltaSerializer();
}

class _$RunStepDeltaObjectDeltaSerializer implements PrimitiveSerializer<RunStepDeltaObjectDelta> {
  @override
  final Iterable<Type> types = const [RunStepDeltaObjectDelta, _$RunStepDeltaObjectDelta];

  @override
  final String wireName = r'RunStepDeltaObjectDelta';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaObjectDelta object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.stepDetails != null) {
      yield r'step_details';
      yield serializers.serialize(
        object.stepDetails,
        specifiedType: const FullType(RunStepDeltaObjectDeltaStepDetails),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaObjectDelta object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaObjectDeltaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'step_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaObjectDeltaStepDetails),
          ) as RunStepDeltaObjectDeltaStepDetails;
          result.stepDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaObjectDelta deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaObjectDeltaBuilder();
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

