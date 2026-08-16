//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_stream_event_one_of5.g.dart';

/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) is cancelled.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStepStreamEventOneOf5 implements Built<RunStepStreamEventOneOf5, RunStepStreamEventOneOf5Builder> {
  @BuiltValueField(wireName: r'event')
  RunStepStreamEventOneOf5EventEnum get event;
  // enum eventEnum {  thread.run.step.cancelled,  };

  @BuiltValueField(wireName: r'data')
  RunStepObject get data;

  RunStepStreamEventOneOf5._();

  factory RunStepStreamEventOneOf5([void updates(RunStepStreamEventOneOf5Builder b)]) = _$RunStepStreamEventOneOf5;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepStreamEventOneOf5Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepStreamEventOneOf5> get serializer => _$RunStepStreamEventOneOf5Serializer();
}

class _$RunStepStreamEventOneOf5Serializer implements PrimitiveSerializer<RunStepStreamEventOneOf5> {
  @override
  final Iterable<Type> types = const [RunStepStreamEventOneOf5, _$RunStepStreamEventOneOf5];

  @override
  final String wireName = r'RunStepStreamEventOneOf5';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepStreamEventOneOf5 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStepStreamEventOneOf5EventEnum),
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
    RunStepStreamEventOneOf5 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepStreamEventOneOf5Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepStreamEventOneOf5EventEnum),
          ) as RunStepStreamEventOneOf5EventEnum;
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
  RunStepStreamEventOneOf5 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepStreamEventOneOf5Builder();
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

class RunStepStreamEventOneOf5EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.step.cancelled')
  static const RunStepStreamEventOneOf5EventEnum threadPeriodRunPeriodStepPeriodCancelled = _$runStepStreamEventOneOf5EventEnum_threadPeriodRunPeriodStepPeriodCancelled;

  static Serializer<RunStepStreamEventOneOf5EventEnum> get serializer => _$runStepStreamEventOneOf5EventEnumSerializer;

  const RunStepStreamEventOneOf5EventEnum._(String name): super(name);

  static BuiltSet<RunStepStreamEventOneOf5EventEnum> get values => _$runStepStreamEventOneOf5EventEnumValues;
  static RunStepStreamEventOneOf5EventEnum valueOf(String name) => _$runStepStreamEventOneOf5EventEnumValueOf(name);
}

