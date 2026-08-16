//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_stream_event_one_of.g.dart';

/// Occurs when a new [run](/docs/api-reference/runs/object) is created.
///
/// Properties:
/// * [event] 
/// * [data] 
@BuiltValue()
abstract class RunStreamEventOneOf implements Built<RunStreamEventOneOf, RunStreamEventOneOfBuilder> {
  @BuiltValueField(wireName: r'event')
  RunStreamEventOneOfEventEnum get event;
  // enum eventEnum {  thread.run.created,  };

  @BuiltValueField(wireName: r'data')
  RunObject get data;

  RunStreamEventOneOf._();

  factory RunStreamEventOneOf([void updates(RunStreamEventOneOfBuilder b)]) = _$RunStreamEventOneOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStreamEventOneOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStreamEventOneOf> get serializer => _$RunStreamEventOneOfSerializer();
}

class _$RunStreamEventOneOfSerializer implements PrimitiveSerializer<RunStreamEventOneOf> {
  @override
  final Iterable<Type> types = const [RunStreamEventOneOf, _$RunStreamEventOneOf];

  @override
  final String wireName = r'RunStreamEventOneOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStreamEventOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event';
    yield serializers.serialize(
      object.event,
      specifiedType: const FullType(RunStreamEventOneOfEventEnum),
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
    RunStreamEventOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStreamEventOneOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStreamEventOneOfEventEnum),
          ) as RunStreamEventOneOfEventEnum;
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
  RunStreamEventOneOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStreamEventOneOfBuilder();
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

class RunStreamEventOneOfEventEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'thread.run.created')
  static const RunStreamEventOneOfEventEnum threadPeriodRunPeriodCreated = _$runStreamEventOneOfEventEnum_threadPeriodRunPeriodCreated;

  static Serializer<RunStreamEventOneOfEventEnum> get serializer => _$runStreamEventOneOfEventEnumSerializer;

  const RunStreamEventOneOfEventEnum._(String name): super(name);

  static BuiltSet<RunStreamEventOneOfEventEnum> get values => _$runStreamEventOneOfEventEnumValues;
  static RunStreamEventOneOfEventEnum valueOf(String name) => _$runStreamEventOneOfEventEnumValueOf(name);
}

