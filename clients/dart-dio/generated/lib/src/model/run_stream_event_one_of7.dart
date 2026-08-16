//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_stream_event_one_of7.g.dart';

/// Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEventOneOf7 implements Built<RunStreamEventOneOf7, RunStreamEventOneOf7Builder> {
  @BuiltValueField(wireName: r'event')
  RunStreamEventOneOf7EventEnum get event;
  // enum eventEnum {  thread.run.cancelling,  };

  @BuiltValueField(wireName: r'data')
  RunObject get data;

  RunStreamEventOneOf7._();

  factory RunStreamEventOneOf7([void updates(RunStreamEventOneOf7Builder b)]) = _$RunStreamEventOneOf7;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventOneOf7Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEventOneOf7> get serializer => _$RunStreamEventOneOf7Serializer();
}

class _$RunStreamEventOneOf7Serializer implements PrimitiveSerializer<RunStreamEventOneOf7> {
  @override
  final Iterable<Type> types = const [RunStreamEventOneOf7, _$RunStreamEventOneOf7];

  @override
  final String wireName = r'RunStreamEventOneOf7';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEventOneOf7 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStreamEventOneOf7EventEnum),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(RunObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStreamEventOneOf7 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStreamEventOneOf7Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStreamEventOneOf7EventEnum),
          ) as RunStreamEventOneOf7EventEnum;
          result.event = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunObject),
          ) as RunObject;
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
  RunStreamEventOneOf7 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventOneOf7Builder();
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

class RunStreamEventOneOf7EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.cancelling')
  static const RunStreamEventOneOf7EventEnum threadPeriodRunPeriodCancelling = _$runStreamEventOneOf7EventEnum_threadPeriodRunPeriodCancelling;

  static Serializer<RunStreamEventOneOf7EventEnum> get serializer => _$runStreamEventOneOf7EventEnumSerializer;

  const RunStreamEventOneOf7EventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventOneOf7EventEnum> get values => _$runStreamEventOneOf7EventEnumValues;
  static RunStreamEventOneOf7EventEnum valueOf(String name) => _$runStreamEventOneOf7EventEnumValueOf(name);
}

