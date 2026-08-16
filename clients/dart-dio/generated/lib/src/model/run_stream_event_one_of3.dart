//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_stream_event_one_of3.g.dart';

/// Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEventOneOf3 implements Built<RunStreamEventOneOf3, RunStreamEventOneOf3Builder> {
  @BuiltValueField(wireName: r'event')
  RunStreamEventOneOf3EventEnum get event;
  // enum eventEnum {  thread.run.requires_action,  };

  @BuiltValueField(wireName: r'data')
  RunObject get data;

  RunStreamEventOneOf3._();

  factory RunStreamEventOneOf3([void updates(RunStreamEventOneOf3Builder b)]) = _$RunStreamEventOneOf3;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventOneOf3Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEventOneOf3> get serializer => _$RunStreamEventOneOf3Serializer();
}

class _$RunStreamEventOneOf3Serializer implements PrimitiveSerializer<RunStreamEventOneOf3> {
  @override
  final Iterable<Type> types = const [RunStreamEventOneOf3, _$RunStreamEventOneOf3];

  @override
  final String wireName = r'RunStreamEventOneOf3';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEventOneOf3 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStreamEventOneOf3EventEnum),
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
    RunStreamEventOneOf3 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStreamEventOneOf3Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStreamEventOneOf3EventEnum),
          ) as RunStreamEventOneOf3EventEnum;
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
  RunStreamEventOneOf3 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventOneOf3Builder();
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

class RunStreamEventOneOf3EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.requires_action')
  static const RunStreamEventOneOf3EventEnum threadPeriodRunPeriodRequiresAction = _$runStreamEventOneOf3EventEnum_threadPeriodRunPeriodRequiresAction;

  static Serializer<RunStreamEventOneOf3EventEnum> get serializer => _$runStreamEventOneOf3EventEnumSerializer;

  const RunStreamEventOneOf3EventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventOneOf3EventEnum> get values => _$runStreamEventOneOf3EventEnumValues;
  static RunStreamEventOneOf3EventEnum valueOf(String name) => _$runStreamEventOneOf3EventEnumValueOf(name);
}

