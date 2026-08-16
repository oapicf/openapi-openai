//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_stream_event_one_of8.g.dart';

/// Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEventOneOf8 implements Built<RunStreamEventOneOf8, RunStreamEventOneOf8Builder> {
  @BuiltValueField(wireName: r'event')
  RunStreamEventOneOf8EventEnum get event;
  // enum eventEnum {  thread.run.cancelled,  };

  @BuiltValueField(wireName: r'data')
  RunObject get data;

  RunStreamEventOneOf8._();

  factory RunStreamEventOneOf8([void updates(RunStreamEventOneOf8Builder b)]) = _$RunStreamEventOneOf8;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventOneOf8Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEventOneOf8> get serializer => _$RunStreamEventOneOf8Serializer();
}

class _$RunStreamEventOneOf8Serializer implements PrimitiveSerializer<RunStreamEventOneOf8> {
  @override
  final Iterable<Type> types = const [RunStreamEventOneOf8, _$RunStreamEventOneOf8];

  @override
  final String wireName = r'RunStreamEventOneOf8';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEventOneOf8 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStreamEventOneOf8EventEnum),
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
    RunStreamEventOneOf8 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStreamEventOneOf8Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStreamEventOneOf8EventEnum),
          ) as RunStreamEventOneOf8EventEnum;
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
  RunStreamEventOneOf8 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventOneOf8Builder();
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

class RunStreamEventOneOf8EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.cancelled')
  static const RunStreamEventOneOf8EventEnum threadPeriodRunPeriodCancelled = _$runStreamEventOneOf8EventEnum_threadPeriodRunPeriodCancelled;

  static Serializer<RunStreamEventOneOf8EventEnum> get serializer => _$runStreamEventOneOf8EventEnumSerializer;

  const RunStreamEventOneOf8EventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventOneOf8EventEnum> get values => _$runStreamEventOneOf8EventEnumValues;
  static RunStreamEventOneOf8EventEnum valueOf(String name) => _$runStreamEventOneOf8EventEnumValueOf(name);
}

