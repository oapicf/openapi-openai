//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_stream_event_one_of1.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of3.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of4.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of2.dart';
import 'package:openapi/src/model/run_step_object.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of5.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of.dart';
import 'package:openapi/src/model/run_step_stream_event_one_of6.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'run_step_stream_event.g.dart';

/// RunStepStreamEvent
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStepStreamEvent implements Built<RunStepStreamEvent, RunStepStreamEventBuilder> {
  /// One Of [RunStepStreamEventOneOf], [RunStepStreamEventOneOf1], [RunStepStreamEventOneOf2], [RunStepStreamEventOneOf3], [RunStepStreamEventOneOf4], [RunStepStreamEventOneOf5], [RunStepStreamEventOneOf6]
  OneOf get oneOf;

  RunStepStreamEvent._();

  factory RunStepStreamEvent([void updates(RunStepStreamEventBuilder b)]) = _$RunStepStreamEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepStreamEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepStreamEvent> get serializer => _$RunStepStreamEventSerializer();
}

class _$RunStepStreamEventSerializer implements PrimitiveSerializer<RunStepStreamEvent> {
  @override
  final Iterable<Type> types = const [RunStepStreamEvent, _$RunStepStreamEvent];

  @override
  final String wireName = r'RunStepStreamEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepStreamEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepStreamEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  RunStepStreamEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepStreamEventBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(RunStepStreamEventOneOf), FullType(RunStepStreamEventOneOf1), FullType(RunStepStreamEventOneOf2), FullType(RunStepStreamEventOneOf3), FullType(RunStepStreamEventOneOf4), FullType(RunStepStreamEventOneOf5), FullType(RunStepStreamEventOneOf6), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class RunStepStreamEventEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.step.expired')
  static const RunStepStreamEventEventEnum threadPeriodRunPeriodStepPeriodExpired = _$runStepStreamEventEventEnum_threadPeriodRunPeriodStepPeriodExpired;

  static Serializer<RunStepStreamEventEventEnum> get serializer => _$runStepStreamEventEventEnumSerializer;

  const RunStepStreamEventEventEnum._(String name): super(name);

  static BuiltSet<RunStepStreamEventEventEnum> get values => _$runStepStreamEventEventEnumValues;
  static RunStepStreamEventEventEnum valueOf(String name) => _$runStepStreamEventEventEnumValueOf(name);
}

