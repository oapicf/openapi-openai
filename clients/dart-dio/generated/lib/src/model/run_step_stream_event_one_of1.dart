//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_stream_event_one_of1.g.dart';

/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an `in_progress` state.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStepStreamEventOneOf1 implements Built<RunStepStreamEventOneOf1, RunStepStreamEventOneOf1Builder> {
  @BuiltValueField(wireName: r'event')
  RunStepStreamEventOneOf1EventEnum get event;
  // enum eventEnum {  thread.run.step.in_progress,  };

  @BuiltValueField(wireName: r'data')
  RunStepObject get data;

  RunStepStreamEventOneOf1._();

  factory RunStepStreamEventOneOf1([void updates(RunStepStreamEventOneOf1Builder b)]) = _$RunStepStreamEventOneOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepStreamEventOneOf1Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepStreamEventOneOf1> get serializer => _$RunStepStreamEventOneOf1Serializer();
}

class _$RunStepStreamEventOneOf1Serializer implements PrimitiveSerializer<RunStepStreamEventOneOf1> {
  @override
  final Iterable<Type> types = const [RunStepStreamEventOneOf1, _$RunStepStreamEventOneOf1];

  @override
  final String wireName = r'RunStepStreamEventOneOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepStreamEventOneOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStepStreamEventOneOf1EventEnum),
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
    RunStepStreamEventOneOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepStreamEventOneOf1Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepStreamEventOneOf1EventEnum),
          ) as RunStepStreamEventOneOf1EventEnum;
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
  RunStepStreamEventOneOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepStreamEventOneOf1Builder();
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

class RunStepStreamEventOneOf1EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.step.in_progress')
  static const RunStepStreamEventOneOf1EventEnum threadPeriodRunPeriodStepPeriodInProgress = _$runStepStreamEventOneOf1EventEnum_threadPeriodRunPeriodStepPeriodInProgress;

  static Serializer<RunStepStreamEventOneOf1EventEnum> get serializer => _$runStepStreamEventOneOf1EventEnumSerializer;

  const RunStepStreamEventOneOf1EventEnum._(String name): super(name);

  static BuiltSet<RunStepStreamEventOneOf1EventEnum> get values => _$runStepStreamEventOneOf1EventEnumValues;
  static RunStepStreamEventOneOf1EventEnum valueOf(String name) => _$runStepStreamEventOneOf1EventEnumValueOf(name);
}

