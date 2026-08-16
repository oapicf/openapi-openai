//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_stream_event_one_of4.g.dart';

/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) fails.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStepStreamEventOneOf4 implements Built<RunStepStreamEventOneOf4, RunStepStreamEventOneOf4Builder> {
  @BuiltValueField(wireName: r'event')
  RunStepStreamEventOneOf4EventEnum get event;
  // enum eventEnum {  thread.run.step.failed,  };

  @BuiltValueField(wireName: r'data')
  RunStepObject get data;

  RunStepStreamEventOneOf4._();

  factory RunStepStreamEventOneOf4([void updates(RunStepStreamEventOneOf4Builder b)]) = _$RunStepStreamEventOneOf4;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepStreamEventOneOf4Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepStreamEventOneOf4> get serializer => _$RunStepStreamEventOneOf4Serializer();
}

class _$RunStepStreamEventOneOf4Serializer implements PrimitiveSerializer<RunStepStreamEventOneOf4> {
  @override
  final Iterable<Type> types = const [RunStepStreamEventOneOf4, _$RunStepStreamEventOneOf4];

  @override
  final String wireName = r'RunStepStreamEventOneOf4';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepStreamEventOneOf4 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStepStreamEventOneOf4EventEnum),
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
    RunStepStreamEventOneOf4 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepStreamEventOneOf4Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepStreamEventOneOf4EventEnum),
          ) as RunStepStreamEventOneOf4EventEnum;
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
  RunStepStreamEventOneOf4 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepStreamEventOneOf4Builder();
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

class RunStepStreamEventOneOf4EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.step.failed')
  static const RunStepStreamEventOneOf4EventEnum threadPeriodRunPeriodStepPeriodFailed = _$runStepStreamEventOneOf4EventEnum_threadPeriodRunPeriodStepPeriodFailed;

  static Serializer<RunStepStreamEventOneOf4EventEnum> get serializer => _$runStepStreamEventOneOf4EventEnumSerializer;

  const RunStepStreamEventOneOf4EventEnum._(String name): super(name);

  static BuiltSet<RunStepStreamEventOneOf4EventEnum> get values => _$runStepStreamEventOneOf4EventEnumValues;
  static RunStepStreamEventOneOf4EventEnum valueOf(String name) => _$runStepStreamEventOneOf4EventEnumValueOf(name);
}

