//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_delta_object_delta.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_object.g.dart';

/// Represents a run step delta i.e. any changed fields on a run step during streaming. 
///
/// Properties:
/// * [id] - The identifier of the run step, which can be referenced in API endpoints.
/// * [object] - The object type, which is always `thread.run.step.delta`.
/// * [delta] 
@BuiltValue()
abstract class RunStepDeltaObject implements Built<RunStepDeltaObject, RunStepDeltaObjectBuilder> {
  /// The identifier of the run step, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `thread.run.step.delta`.
  @BuiltValueField(wireName: r'object')
  RunStepDeltaObjectObjectEnum get object;
  // enum objectEnum {  thread.run.step.delta,  };

  @BuiltValueField(wireName: r'delta')
  RunStepDeltaObjectDelta get delta;

  RunStepDeltaObject._();

  factory RunStepDeltaObject([void updates(RunStepDeltaObjectBuilder b)]) = _$RunStepDeltaObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaObject> get serializer => _$RunStepDeltaObjectSerializer();
}

class _$RunStepDeltaObjectSerializer implements PrimitiveSerializer<RunStepDeltaObject> {
  @override
  final Iterable<Type> types = const [RunStepDeltaObject, _$RunStepDeltaObject];

  @override
  final String wireName = r'RunStepDeltaObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(RunStepDeltaObjectObjectEnum),
    );
    yield r'delta';
    yield serializers.serialize(
      object.delta,
      specifiedType: const FullType(RunStepDeltaObjectDelta),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaObjectObjectEnum),
          ) as RunStepDeltaObjectObjectEnum;
          result.object = valueDes;
          break;
        case r'delta':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaObjectDelta),
          ) as RunStepDeltaObjectDelta;
          result.delta.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaObjectBuilder();
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

class RunStepDeltaObjectObjectEnum extends EnumClass {

  /// The object type, which is always `thread.run.step.delta`.
  @BuiltValueEnumConst(wireName: r'thread.run.step.delta')
  static const RunStepDeltaObjectObjectEnum threadPeriodRunPeriodStepPeriodDelta = _$runStepDeltaObjectObjectEnum_threadPeriodRunPeriodStepPeriodDelta;

  static Serializer<RunStepDeltaObjectObjectEnum> get serializer => _$runStepDeltaObjectObjectEnumSerializer;

  const RunStepDeltaObjectObjectEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaObjectObjectEnum> get values => _$runStepDeltaObjectObjectEnumValues;
  static RunStepDeltaObjectObjectEnum valueOf(String name) => _$runStepDeltaObjectObjectEnumValueOf(name);
}

