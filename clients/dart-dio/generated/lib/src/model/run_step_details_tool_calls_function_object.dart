//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_step_details_tool_calls_function_object_function.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_function_object.g.dart';

/// RunStepDetailsToolCallsFunctionObject
///
/// Properties:
/// * [id] - The ID of the tool call object.
/// * [type] - The type of tool call. This is always going to be `function` for this type of tool call.
/// * [function_] 
@BuiltValue()
abstract class RunStepDetailsToolCallsFunctionObject implements Built<RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsFunctionObjectBuilder> {
  /// The ID of the tool call object.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The type of tool call. This is always going to be `function` for this type of tool call.
  @BuiltValueField(wireName: r'type')
  RunStepDetailsToolCallsFunctionObjectTypeEnum get type;
  // enum typeEnum {  function,  };

  @BuiltValueField(wireName: r'function')
  RunStepDetailsToolCallsFunctionObjectFunction get function_;

  RunStepDetailsToolCallsFunctionObject._();

  factory RunStepDetailsToolCallsFunctionObject([void updates(RunStepDetailsToolCallsFunctionObjectBuilder b)]) = _$RunStepDetailsToolCallsFunctionObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsFunctionObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsFunctionObject> get serializer => _$RunStepDetailsToolCallsFunctionObjectSerializer();
}

class _$RunStepDetailsToolCallsFunctionObjectSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsFunctionObject> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsFunctionObject, _$RunStepDetailsToolCallsFunctionObject];

  @override
  final String wireName = r'RunStepDetailsToolCallsFunctionObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsFunctionObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDetailsToolCallsFunctionObjectTypeEnum),
    );
    yield r'function';
    yield serializers.serialize(
      object.function_,
      specifiedType: const FullType(RunStepDetailsToolCallsFunctionObjectFunction),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsFunctionObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsFunctionObjectBuilder result,
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
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsFunctionObjectTypeEnum),
          ) as RunStepDetailsToolCallsFunctionObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'function':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsFunctionObjectFunction),
          ) as RunStepDetailsToolCallsFunctionObjectFunction;
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
  RunStepDetailsToolCallsFunctionObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsFunctionObjectBuilder();
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

class RunStepDetailsToolCallsFunctionObjectTypeEnum extends EnumClass {

  /// The type of tool call. This is always going to be `function` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'function')
  static const RunStepDetailsToolCallsFunctionObjectTypeEnum function_ = _$runStepDetailsToolCallsFunctionObjectTypeEnum_function_;

  static Serializer<RunStepDetailsToolCallsFunctionObjectTypeEnum> get serializer => _$runStepDetailsToolCallsFunctionObjectTypeEnumSerializer;

  const RunStepDetailsToolCallsFunctionObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDetailsToolCallsFunctionObjectTypeEnum> get values => _$runStepDetailsToolCallsFunctionObjectTypeEnumValues;
  static RunStepDetailsToolCallsFunctionObjectTypeEnum valueOf(String name) => _$runStepDetailsToolCallsFunctionObjectTypeEnumValueOf(name);
}

