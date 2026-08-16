//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_stream_event_one_of6.dart';
import 'package:openapi/src/model/run_stream_event_one_of9.dart';
import 'package:openapi/src/model/run_stream_event_one_of1.dart';
import 'package:openapi/src/model/run_stream_event_one_of3.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_stream_event_one_of7.dart';
import 'package:openapi/src/model/run_stream_event_one_of.dart';
import 'package:openapi/src/model/run_stream_event_one_of2.dart';
import 'package:openapi/src/model/run_stream_event_one_of5.dart';
import 'package:openapi/src/model/run_stream_event_one_of4.dart';
import 'package:openapi/src/model/run_stream_event_one_of8.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'run_stream_event.g.dart';

/// RunStreamEvent
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEvent implements Built<RunStreamEvent, RunStreamEventBuilder> {
  /// One Of [RunStreamEventOneOf], [RunStreamEventOneOf1], [RunStreamEventOneOf2], [RunStreamEventOneOf3], [RunStreamEventOneOf4], [RunStreamEventOneOf5], [RunStreamEventOneOf6], [RunStreamEventOneOf7], [RunStreamEventOneOf8], [RunStreamEventOneOf9]
  OneOf get oneOf;

  RunStreamEvent._();

  factory RunStreamEvent([void updates(RunStreamEventBuilder b)]) = _$RunStreamEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEvent> get serializer => _$RunStreamEventSerializer();
}

class _$RunStreamEventSerializer implements PrimitiveSerializer<RunStreamEvent> {
  @override
  final Iterable<Type> types = const [RunStreamEvent, _$RunStreamEvent];

  @override
  final String wireName = r'RunStreamEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStreamEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  RunStreamEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(RunStreamEventOneOf), FullType(RunStreamEventOneOf1), FullType(RunStreamEventOneOf2), FullType(RunStreamEventOneOf3), FullType(RunStreamEventOneOf4), FullType(RunStreamEventOneOf5), FullType(RunStreamEventOneOf6), FullType(RunStreamEventOneOf7), FullType(RunStreamEventOneOf8), FullType(RunStreamEventOneOf9), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class RunStreamEventEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.expired')
  static const RunStreamEventEventEnum threadPeriodRunPeriodExpired = _$runStreamEventEventEnum_threadPeriodRunPeriodExpired;

  static Serializer<RunStreamEventEventEnum> get serializer => _$runStreamEventEventEnumSerializer;

  const RunStreamEventEventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventEventEnum> get values => _$runStreamEventEventEnumValues;
  static RunStreamEventEventEnum valueOf(String name) => _$runStreamEventEventEnumValueOf(name);
}

