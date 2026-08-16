//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_stream_event_one_of2.g.dart';

/// Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEventOneOf2 implements Built<RunStreamEventOneOf2, RunStreamEventOneOf2Builder> {
  @BuiltValueField(wireName: r'event')
  RunStreamEventOneOf2EventEnum get event;
  // enum eventEnum {  thread.run.in_progress,  };

  @BuiltValueField(wireName: r'data')
  RunObject get data;

  RunStreamEventOneOf2._();

  factory RunStreamEventOneOf2([void updates(RunStreamEventOneOf2Builder b)]) = _$RunStreamEventOneOf2;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventOneOf2Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEventOneOf2> get serializer => _$RunStreamEventOneOf2Serializer();
}

class _$RunStreamEventOneOf2Serializer implements PrimitiveSerializer<RunStreamEventOneOf2> {
  @override
  final Iterable<Type> types = const [RunStreamEventOneOf2, _$RunStreamEventOneOf2];

  @override
  final String wireName = r'RunStreamEventOneOf2';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEventOneOf2 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStreamEventOneOf2EventEnum),
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
    RunStreamEventOneOf2 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStreamEventOneOf2Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStreamEventOneOf2EventEnum),
          ) as RunStreamEventOneOf2EventEnum;
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
  RunStreamEventOneOf2 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventOneOf2Builder();
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

class RunStreamEventOneOf2EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.in_progress')
  static const RunStreamEventOneOf2EventEnum threadPeriodRunPeriodInProgress = _$runStreamEventOneOf2EventEnum_threadPeriodRunPeriodInProgress;

  static Serializer<RunStreamEventOneOf2EventEnum> get serializer => _$runStreamEventOneOf2EventEnumSerializer;

  const RunStreamEventOneOf2EventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventOneOf2EventEnum> get values => _$runStreamEventOneOf2EventEnumValues;
  static RunStreamEventOneOf2EventEnum valueOf(String name) => _$runStreamEventOneOf2EventEnumValueOf(name);
}

