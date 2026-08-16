//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_stream_event_one_of3.g.dart';

/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) is completed.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStepStreamEventOneOf3 implements Built<RunStepStreamEventOneOf3, RunStepStreamEventOneOf3Builder> {
  @BuiltValueField(wireName: r'event')
  RunStepStreamEventOneOf3EventEnum get event;
  // enum eventEnum {  thread.run.step.completed,  };

  @BuiltValueField(wireName: r'data')
  RunStepObject get data;

  RunStepStreamEventOneOf3._();

  factory RunStepStreamEventOneOf3([void updates(RunStepStreamEventOneOf3Builder b)]) = _$RunStepStreamEventOneOf3;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepStreamEventOneOf3Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepStreamEventOneOf3> get serializer => _$RunStepStreamEventOneOf3Serializer();
}

class _$RunStepStreamEventOneOf3Serializer implements PrimitiveSerializer<RunStepStreamEventOneOf3> {
  @override
  final Iterable<Type> types = const [RunStepStreamEventOneOf3, _$RunStepStreamEventOneOf3];

  @override
  final String wireName = r'RunStepStreamEventOneOf3';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepStreamEventOneOf3 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStepStreamEventOneOf3EventEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(RunStepObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepStreamEventOneOf3 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepStreamEventOneOf3Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepStreamEventOneOf3EventEnum),
          ) as RunStepStreamEventOneOf3EventEnum;
          result.event = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepObject),
          ) as RunStepObject;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepStreamEventOneOf3 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepStreamEventOneOf3Builder();
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

class RunStepStreamEventOneOf3EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.step.completed')
  static const RunStepStreamEventOneOf3EventEnum threadPeriodRunPeriodStepPeriodCompleted = _$runStepStreamEventOneOf3EventEnum_threadPeriodRunPeriodStepPeriodCompleted;

  static Serializer<RunStepStreamEventOneOf3EventEnum> get serializer => _$runStepStreamEventOneOf3EventEnumSerializer;

  const RunStepStreamEventOneOf3EventEnum._(String name): super(name);

  static BuiltSet<RunStepStreamEventOneOf3EventEnum> get values => _$runStepStreamEventOneOf3EventEnumValues;
  static RunStepStreamEventOneOf3EventEnum valueOf(String name) => _$runStepStreamEventOneOf3EventEnumValueOf(name);
}

