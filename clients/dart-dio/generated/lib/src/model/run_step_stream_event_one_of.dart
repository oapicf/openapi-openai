//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_stream_event_one_of.g.dart';

/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) is created.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStepStreamEventOneOf implements Built<RunStepStreamEventOneOf, RunStepStreamEventOneOfBuilder> {
  @BuiltValueField(wireName: r'event')
  RunStepStreamEventOneOfEventEnum get event;
  // enum eventEnum {  thread.run.step.created,  };

  @BuiltValueField(wireName: r'data')
  RunStepObject get data;

  RunStepStreamEventOneOf._();

  factory RunStepStreamEventOneOf([void updates(RunStepStreamEventOneOfBuilder b)]) = _$RunStepStreamEventOneOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepStreamEventOneOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepStreamEventOneOf> get serializer => _$RunStepStreamEventOneOfSerializer();
}

class _$RunStepStreamEventOneOfSerializer implements PrimitiveSerializer<RunStepStreamEventOneOf> {
  @override
  final Iterable<Type> types = const [RunStepStreamEventOneOf, _$RunStepStreamEventOneOf];

  @override
  final String wireName = r'RunStepStreamEventOneOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepStreamEventOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStepStreamEventOneOfEventEnum),
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
    RunStepStreamEventOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepStreamEventOneOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepStreamEventOneOfEventEnum),
          ) as RunStepStreamEventOneOfEventEnum;
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
  RunStepStreamEventOneOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepStreamEventOneOfBuilder();
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

class RunStepStreamEventOneOfEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.step.created')
  static const RunStepStreamEventOneOfEventEnum threadPeriodRunPeriodStepPeriodCreated = _$runStepStreamEventOneOfEventEnum_threadPeriodRunPeriodStepPeriodCreated;

  static Serializer<RunStepStreamEventOneOfEventEnum> get serializer => _$runStepStreamEventOneOfEventEnumSerializer;

  const RunStepStreamEventOneOfEventEnum._(String name): super(name);

  static BuiltSet<RunStepStreamEventOneOfEventEnum> get values => _$runStepStreamEventOneOfEventEnumValues;
  static RunStepStreamEventOneOfEventEnum valueOf(String name) => _$runStepStreamEventOneOfEventEnumValueOf(name);
}

