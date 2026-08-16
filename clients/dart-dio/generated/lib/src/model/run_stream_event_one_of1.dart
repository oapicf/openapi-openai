//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_stream_event_one_of1.g.dart';

/// Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEventOneOf1 implements Built<RunStreamEventOneOf1, RunStreamEventOneOf1Builder> {
  @BuiltValueField(wireName: r'event')
  RunStreamEventOneOf1EventEnum get event;
  // enum eventEnum {  thread.run.queued,  };

  @BuiltValueField(wireName: r'data')
  RunObject get data;

  RunStreamEventOneOf1._();

  factory RunStreamEventOneOf1([void updates(RunStreamEventOneOf1Builder b)]) = _$RunStreamEventOneOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventOneOf1Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEventOneOf1> get serializer => _$RunStreamEventOneOf1Serializer();
}

class _$RunStreamEventOneOf1Serializer implements PrimitiveSerializer<RunStreamEventOneOf1> {
  @override
  final Iterable<Type> types = const [RunStreamEventOneOf1, _$RunStreamEventOneOf1];

  @override
  final String wireName = r'RunStreamEventOneOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEventOneOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStreamEventOneOf1EventEnum),
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
    RunStreamEventOneOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStreamEventOneOf1Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStreamEventOneOf1EventEnum),
          ) as RunStreamEventOneOf1EventEnum;
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
  RunStreamEventOneOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventOneOf1Builder();
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

class RunStreamEventOneOf1EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.queued')
  static const RunStreamEventOneOf1EventEnum threadPeriodRunPeriodQueued = _$runStreamEventOneOf1EventEnum_threadPeriodRunPeriodQueued;

  static Serializer<RunStreamEventOneOf1EventEnum> get serializer => _$runStreamEventOneOf1EventEnumSerializer;

  const RunStreamEventOneOf1EventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventOneOf1EventEnum> get values => _$runStreamEventOneOf1EventEnumValues;
  static RunStreamEventOneOf1EventEnum valueOf(String name) => _$runStreamEventOneOf1EventEnumValueOf(name);
}

