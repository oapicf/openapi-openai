//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_delta_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_stream_event_one_of2.g.dart';

/// Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStepStreamEventOneOf2 implements Built<RunStepStreamEventOneOf2, RunStepStreamEventOneOf2Builder> {
  @BuiltValueField(wireName: r'event')
  RunStepStreamEventOneOf2EventEnum get event;
  // enum eventEnum {  thread.run.step.delta,  };

  @BuiltValueField(wireName: r'data')
  RunStepDeltaObject get data;

  RunStepStreamEventOneOf2._();

  factory RunStepStreamEventOneOf2([void updates(RunStepStreamEventOneOf2Builder b)]) = _$RunStepStreamEventOneOf2;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepStreamEventOneOf2Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepStreamEventOneOf2> get serializer => _$RunStepStreamEventOneOf2Serializer();
}

class _$RunStepStreamEventOneOf2Serializer implements PrimitiveSerializer<RunStepStreamEventOneOf2> {
  @override
  final Iterable<Type> types = const [RunStepStreamEventOneOf2, _$RunStepStreamEventOneOf2];

  @override
  final String wireName = r'RunStepStreamEventOneOf2';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepStreamEventOneOf2 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStepStreamEventOneOf2EventEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(RunStepDeltaObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepStreamEventOneOf2 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepStreamEventOneOf2Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepStreamEventOneOf2EventEnum),
          ) as RunStepStreamEventOneOf2EventEnum;
          result.event = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaObject),
          ) as RunStepDeltaObject;
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
  RunStepStreamEventOneOf2 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepStreamEventOneOf2Builder();
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

class RunStepStreamEventOneOf2EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.step.delta')
  static const RunStepStreamEventOneOf2EventEnum threadPeriodRunPeriodStepPeriodDelta = _$runStepStreamEventOneOf2EventEnum_threadPeriodRunPeriodStepPeriodDelta;

  static Serializer<RunStepStreamEventOneOf2EventEnum> get serializer => _$runStepStreamEventOneOf2EventEnumSerializer;

  const RunStepStreamEventOneOf2EventEnum._(String name): super(name);

  static BuiltSet<RunStepStreamEventOneOf2EventEnum> get values => _$runStepStreamEventOneOf2EventEnumValues;
  static RunStepStreamEventOneOf2EventEnum valueOf(String name) => _$runStepStreamEventOneOf2EventEnumValueOf(name);
}

