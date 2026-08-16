//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_stream_event_one_of6.g.dart';

/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) expires.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStepStreamEventOneOf6 implements Built<RunStepStreamEventOneOf6, RunStepStreamEventOneOf6Builder> {
  @BuiltValueField(wireName: r'event')
  RunStepStreamEventOneOf6EventEnum get event;
  // enum eventEnum {  thread.run.step.expired,  };

  @BuiltValueField(wireName: r'data')
  RunStepObject get data;

  RunStepStreamEventOneOf6._();

  factory RunStepStreamEventOneOf6([void updates(RunStepStreamEventOneOf6Builder b)]) = _$RunStepStreamEventOneOf6;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepStreamEventOneOf6Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepStreamEventOneOf6> get serializer => _$RunStepStreamEventOneOf6Serializer();
}

class _$RunStepStreamEventOneOf6Serializer implements PrimitiveSerializer<RunStepStreamEventOneOf6> {
  @override
  final Iterable<Type> types = const [RunStepStreamEventOneOf6, _$RunStepStreamEventOneOf6];

  @override
  final String wireName = r'RunStepStreamEventOneOf6';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepStreamEventOneOf6 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStepStreamEventOneOf6EventEnum),
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
    RunStepStreamEventOneOf6 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepStreamEventOneOf6Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepStreamEventOneOf6EventEnum),
          ) as RunStepStreamEventOneOf6EventEnum;
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
  RunStepStreamEventOneOf6 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepStreamEventOneOf6Builder();
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

class RunStepStreamEventOneOf6EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.step.expired')
  static const RunStepStreamEventOneOf6EventEnum threadPeriodRunPeriodStepPeriodExpired = _$runStepStreamEventOneOf6EventEnum_threadPeriodRunPeriodStepPeriodExpired;

  static Serializer<RunStepStreamEventOneOf6EventEnum> get serializer => _$runStepStreamEventOneOf6EventEnumSerializer;

  const RunStepStreamEventOneOf6EventEnum._(String name): super(name);

  static BuiltSet<RunStepStreamEventOneOf6EventEnum> get values => _$runStepStreamEventOneOf6EventEnumValues;
  static RunStepStreamEventOneOf6EventEnum valueOf(String name) => _$runStepStreamEventOneOf6EventEnumValueOf(name);
}

