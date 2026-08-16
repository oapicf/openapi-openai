//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_delta_step_details_tool_calls_function_object_function.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_tool_calls_function_object.g.dart';

/// RunStepDeltaStepDetailsToolCallsFunctionObject
///
/// Properties:
/// * [index] - The index of the tool call in the tool calls array.
/// * [id] - The ID of the tool call object.
/// * [type] - The type of tool call. This is always going to be `function` for this type of tool call.
/// * [function_] 
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsFunctionObject implements Built<RunStepDeltaStepDetailsToolCallsFunctionObject, RunStepDeltaStepDetailsToolCallsFunctionObjectBuilder> {
  /// The index of the tool call in the tool calls array.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// The ID of the tool call object.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The type of tool call. This is always going to be `function` for this type of tool call.
  @BuiltValueField(wireName: r'type')
  RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum get type;
  // enum typeEnum {  function,  };

  @BuiltValueField(wireName: r'function')
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction? get function_;

  RunStepDeltaStepDetailsToolCallsFunctionObject._();

  factory RunStepDeltaStepDetailsToolCallsFunctionObject([void updates(RunStepDeltaStepDetailsToolCallsFunctionObjectBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsFunctionObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsFunctionObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsFunctionObject> get serializer => _$RunStepDeltaStepDetailsToolCallsFunctionObjectSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsFunctionObjectSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsFunctionObject> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsFunctionObject, _$RunStepDeltaStepDetailsToolCallsFunctionObject];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsFunctionObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsFunctionObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum),
    );
    if (object.function_ != null) {
      yield r'function';
      yield serializers.serialize(
        object.function_,
        specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsFunctionObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsToolCallsFunctionObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.index = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum),
          ) as RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'function':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction),
          ) as RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
          result.function_.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaStepDetailsToolCallsFunctionObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsFunctionObjectBuilder();
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

class RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum extends EnumClass {

  /// The type of tool call. This is always going to be `function` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'function')
  static const RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum function_ = _$runStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum_function_;

  static Serializer<RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum> get serializer => _$runStepDeltaStepDetailsToolCallsFunctionObjectTypeEnumSerializer;

  const RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum> get values => _$runStepDeltaStepDetailsToolCallsFunctionObjectTypeEnumValues;
  static RunStepDeltaStepDetailsToolCallsFunctionObjectTypeEnum valueOf(String name) => _$runStepDeltaStepDetailsToolCallsFunctionObjectTypeEnumValueOf(name);
}

