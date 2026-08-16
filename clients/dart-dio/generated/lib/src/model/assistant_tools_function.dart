//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/function_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'assistant_tools_function.g.dart';

/// AssistantToolsFunction
///
/// Properties:
/// * [type] - The type of tool being defined: `function`
/// * [function_] 
@BuiltValue()
abstract class AssistantToolsFunction implements Built<AssistantToolsFunction, AssistantToolsFunctionBuilder> {
  /// The type of tool being defined: `function`
  @BuiltValueField(wireName: r'type')
  AssistantToolsFunctionTypeEnum get type;
  // enum typeEnum {  function,  };

  @BuiltValueField(wireName: r'function')
  FunctionObject get function_;

  AssistantToolsFunction._();

  factory AssistantToolsFunction([void updates(AssistantToolsFunctionBuilder b)]) = _$AssistantToolsFunction;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantToolsFunctionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantToolsFunction> get serializer => _$AssistantToolsFunctionSerializer();
}

class _$AssistantToolsFunctionSerializer implements PrimitiveSerializer<AssistantToolsFunction> {
  @override
  final Iterable<Type> types = const [AssistantToolsFunction, _$AssistantToolsFunction];

  @override
  final String wireName = r'AssistantToolsFunction';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantToolsFunction object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(AssistantToolsFunctionTypeEnum),
    );
    yield r'function';
    yield serializers.serialize(
      object.function_,
      specifiedType: const FullType(FunctionObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantToolsFunction object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssistantToolsFunctionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantToolsFunctionTypeEnum),
          ) as AssistantToolsFunctionTypeEnum;
          result.type = valueDes;
          break;
        case r'function':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FunctionObject),
          ) as FunctionObject;
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
  AssistantToolsFunction deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantToolsFunctionBuilder();
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

class AssistantToolsFunctionTypeEnum extends EnumClass {

  /// The type of tool being defined: `function`
  @BuiltValueEnumConst(wireName: r'function')
  static const AssistantToolsFunctionTypeEnum function_ = _$assistantToolsFunctionTypeEnum_function_;

  static Serializer<AssistantToolsFunctionTypeEnum> get serializer => _$assistantToolsFunctionTypeEnumSerializer;

  const AssistantToolsFunctionTypeEnum._(String name): super(name);

  static BuiltSet<AssistantToolsFunctionTypeEnum> get values => _$assistantToolsFunctionTypeEnumValues;
  static AssistantToolsFunctionTypeEnum valueOf(String name) => _$assistantToolsFunctionTypeEnumValueOf(name);
}

