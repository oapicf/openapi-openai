//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_stream_event_one_of9.g.dart';

/// Occurs when a [run](/docs/api-reference/runs/object) expires.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEventOneOf9 implements Built<RunStreamEventOneOf9, RunStreamEventOneOf9Builder> {
  @BuiltValueField(wireName: r'event')
  RunStreamEventOneOf9EventEnum get event;
  // enum eventEnum {  thread.run.expired,  };

  @BuiltValueField(wireName: r'data')
  RunObject get data;

  RunStreamEventOneOf9._();

  factory RunStreamEventOneOf9([void updates(RunStreamEventOneOf9Builder b)]) = _$RunStreamEventOneOf9;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventOneOf9Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEventOneOf9> get serializer => _$RunStreamEventOneOf9Serializer();
}

class _$RunStreamEventOneOf9Serializer implements PrimitiveSerializer<RunStreamEventOneOf9> {
  @override
  final Iterable<Type> types = const [RunStreamEventOneOf9, _$RunStreamEventOneOf9];

  @override
  final String wireName = r'RunStreamEventOneOf9';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEventOneOf9 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStreamEventOneOf9EventEnum),
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
    RunStreamEventOneOf9 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStreamEventOneOf9Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStreamEventOneOf9EventEnum),
          ) as RunStreamEventOneOf9EventEnum;
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
  RunStreamEventOneOf9 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventOneOf9Builder();
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

class RunStreamEventOneOf9EventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.expired')
  static const RunStreamEventOneOf9EventEnum threadPeriodRunPeriodExpired = _$runStreamEventOneOf9EventEnum_threadPeriodRunPeriodExpired;

  static Serializer<RunStreamEventOneOf9EventEnum> get serializer => _$runStreamEventOneOf9EventEnumSerializer;

  const RunStreamEventOneOf9EventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventOneOf9EventEnum> get values => _$runStreamEventOneOf9EventEnumValues;
  static RunStreamEventOneOf9EventEnum valueOf(String name) => _$runStreamEventOneOf9EventEnumValueOf(name);
}

