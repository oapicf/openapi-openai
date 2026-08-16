//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_tool_call_object_function.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_tool_call_object.g.dart';

/// Tool call objects
///
/// Properties:
/// * [id] - The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
/// * [type] - The type of tool call the output is required for. For now, this is always `function`.
/// * [function_] 
@BuiltValue()
abstract class RunToolCallObject implements Built<RunToolCallObject, RunToolCallObjectBuilder> {
  /// The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The type of tool call the output is required for. For now, this is always `function`.
  @BuiltValueField(wireName: r'type')
  RunToolCallObjectTypeEnum get type;
  // enum typeEnum {  function,  };

  @BuiltValueField(wireName: r'function')
  RunToolCallObjectFunction get function_;

  RunToolCallObject._();

  factory RunToolCallObject([void updates(RunToolCallObjectBuilder b)]) = _$RunToolCallObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunToolCallObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunToolCallObject> get serializer => _$RunToolCallObjectSerializer();
}

class _$RunToolCallObjectSerializer implements PrimitiveSerializer<RunToolCallObject> {
  @override
  final Iterable<Type> types = const [RunToolCallObject, _$RunToolCallObject];

  @override
  final String wireName = r'RunToolCallObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunToolCallObject object, {
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
      specifiedType: const FullType(RunToolCallObjectTypeEnum),
    );
    yield r'function';
    yield serializers.serialize(
      object.function_,
      specifiedType: const FullType(RunToolCallObjectFunction),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunToolCallObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunToolCallObjectBuilder result,
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
            specifiedType: const FullType(RunToolCallObjectTypeEnum),
          ) as RunToolCallObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'function':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunToolCallObjectFunction),
          ) as RunToolCallObjectFunction;
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
  RunToolCallObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunToolCallObjectBuilder();
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

class RunToolCallObjectTypeEnum extends EnumClass {

  /// The type of tool call the output is required for. For now, this is always `function`.
  @BuiltValueEnumConst(wireName: r'function')
  static const RunToolCallObjectTypeEnum function_ = _$runToolCallObjectTypeEnum_function_;

  static Serializer<RunToolCallObjectTypeEnum> get serializer => _$runToolCallObjectTypeEnumSerializer;

  const RunToolCallObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunToolCallObjectTypeEnum> get values => _$runToolCallObjectTypeEnumValues;
  static RunToolCallObjectTypeEnum valueOf(String name) => _$runToolCallObjectTypeEnumValueOf(name);
}

