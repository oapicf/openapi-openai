//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_stream_event_one_of5.g.dart';

/// Occurs when a [run](/docs/api-reference/runs/object) ends with status `incomplete`.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEventOneOf5 implements Built<RunStreamEventOneOf5, RunStreamEventOneOf5Builder> {
  @BuiltValueField(wireName: r'event')
  RunStreamEventOneOf5EventEnum get event;
  // enum eventEnum {  thread.run.incomplete,  };

  @BuiltValueField(wireName: r'data')
  RunObject get data;

  RunStreamEventOneOf5._();

  factory RunStreamEventOneOf5([void updates(RunStreamEventOneOf5Builder b)]) = _$RunStreamEventOneOf5;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventOneOf5Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEventOneOf5> get serializer => _$RunStreamEventOneOf5Serializer();
}

class _$RunStreamEventOneOf5Serializer implements PrimitiveSerializer<RunStreamEventOneOf5> {
  @override
  final Iterable<Type> types = const [RunStreamEventOneOf5, _$RunStreamEventOneOf5];

  @override
  final String wireName = r'RunStreamEventOneOf5';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEventOneOf5 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStreamEventOneOf5EventEnum),
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
    RunStreamEventOneOf5 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStreamEventOneOf5Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStreamEventOneOf5EventEnum),
          ) as RunStreamEventOneOf5EventEnum;
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
  RunStreamEventOneOf5 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventOneOf5Builder();
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

class RunStreamEventOneOf5EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.incomplete')
  static const RunStreamEventOneOf5EventEnum threadPeriodRunPeriodIncomplete = _$runStreamEventOneOf5EventEnum_threadPeriodRunPeriodIncomplete;

  static Serializer<RunStreamEventOneOf5EventEnum> get serializer => _$runStreamEventOneOf5EventEnumSerializer;

  const RunStreamEventOneOf5EventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventOneOf5EventEnum> get values => _$runStreamEventOneOf5EventEnumValues;
  static RunStreamEventOneOf5EventEnum valueOf(String name) => _$runStreamEventOneOf5EventEnumValueOf(name);
}

