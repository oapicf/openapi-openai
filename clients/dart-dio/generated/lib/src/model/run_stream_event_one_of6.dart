//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_stream_event_one_of6.g.dart';

/// Occurs when a [run](/docs/api-reference/runs/object) fails.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEventOneOf6 implements Built<RunStreamEventOneOf6, RunStreamEventOneOf6Builder> {
  @BuiltValueField(wireName: r'event')
  RunStreamEventOneOf6EventEnum get event;
  // enum eventEnum {  thread.run.failed,  };

  @BuiltValueField(wireName: r'data')
  RunObject get data;

  RunStreamEventOneOf6._();

  factory RunStreamEventOneOf6([void updates(RunStreamEventOneOf6Builder b)]) = _$RunStreamEventOneOf6;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventOneOf6Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEventOneOf6> get serializer => _$RunStreamEventOneOf6Serializer();
}

class _$RunStreamEventOneOf6Serializer implements PrimitiveSerializer<RunStreamEventOneOf6> {
  @override
  final Iterable<Type> types = const [RunStreamEventOneOf6, _$RunStreamEventOneOf6];

  @override
  final String wireName = r'RunStreamEventOneOf6';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEventOneOf6 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStreamEventOneOf6EventEnum),
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
    RunStreamEventOneOf6 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStreamEventOneOf6Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStreamEventOneOf6EventEnum),
          ) as RunStreamEventOneOf6EventEnum;
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
  RunStreamEventOneOf6 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventOneOf6Builder();
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

class RunStreamEventOneOf6EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.failed')
  static const RunStreamEventOneOf6EventEnum threadPeriodRunPeriodFailed = _$runStreamEventOneOf6EventEnum_threadPeriodRunPeriodFailed;

  static Serializer<RunStreamEventOneOf6EventEnum> get serializer => _$runStreamEventOneOf6EventEnumSerializer;

  const RunStreamEventOneOf6EventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventOneOf6EventEnum> get values => _$runStreamEventOneOf6EventEnumValues;
  static RunStreamEventOneOf6EventEnum valueOf(String name) => _$runStreamEventOneOf6EventEnumValueOf(name);
}

