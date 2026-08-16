//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_stream_event_one_of4.g.dart';

/// Occurs when a [run](/docs/api-reference/runs/object) is completed.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEventOneOf4 implements Built<RunStreamEventOneOf4, RunStreamEventOneOf4Builder> {
  @BuiltValueField(wireName: r'event')
  RunStreamEventOneOf4EventEnum get event;
  // enum eventEnum {  thread.run.completed,  };

  @BuiltValueField(wireName: r'data')
  RunObject get data;

  RunStreamEventOneOf4._();

  factory RunStreamEventOneOf4([void updates(RunStreamEventOneOf4Builder b)]) = _$RunStreamEventOneOf4;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventOneOf4Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEventOneOf4> get serializer => _$RunStreamEventOneOf4Serializer();
}

class _$RunStreamEventOneOf4Serializer implements PrimitiveSerializer<RunStreamEventOneOf4> {
  @override
  final Iterable<Type> types = const [RunStreamEventOneOf4, _$RunStreamEventOneOf4];

  @override
  final String wireName = r'RunStreamEventOneOf4';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEventOneOf4 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStreamEventOneOf4EventEnum),
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
    RunStreamEventOneOf4 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStreamEventOneOf4Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStreamEventOneOf4EventEnum),
          ) as RunStreamEventOneOf4EventEnum;
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
  RunStreamEventOneOf4 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventOneOf4Builder();
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

class RunStreamEventOneOf4EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.completed')
  static const RunStreamEventOneOf4EventEnum threadPeriodRunPeriodCompleted = _$runStreamEventOneOf4EventEnum_threadPeriodRunPeriodCompleted;

  static Serializer<RunStreamEventOneOf4EventEnum> get serializer => _$runStreamEventOneOf4EventEnumSerializer;

  const RunStreamEventOneOf4EventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventOneOf4EventEnum> get values => _$runStreamEventOneOf4EventEnumValues;
  static RunStreamEventOneOf4EventEnum valueOf(String name) => _$runStreamEventOneOf4EventEnumValueOf(name);
}

