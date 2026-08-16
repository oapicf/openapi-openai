//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'assistant_tools_code.g.dart';

/// AssistantToolsCode
///
/// Properties:
/// * [type] - The type of tool being defined: `code_interpreter`
@BuiltValue()
abstract class AssistantToolsCode implements Built<AssistantToolsCode, AssistantToolsCodeBuilder> {
  /// The type of tool being defined: `code_interpreter`
  @BuiltValueField(wireName: r'type')
  AssistantToolsCodeTypeEnum get type;
  // enum typeEnum {  code_interpreter,  };

  AssistantToolsCode._();

  factory AssistantToolsCode([void updates(AssistantToolsCodeBuilder b)]) = _$AssistantToolsCode;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantToolsCodeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantToolsCode> get serializer => _$AssistantToolsCodeSerializer();
}

class _$AssistantToolsCodeSerializer implements PrimitiveSerializer<AssistantToolsCode> {
  @override
  final Iterable<Type> types = const [AssistantToolsCode, _$AssistantToolsCode];

  @override
  final String wireName = r'AssistantToolsCode';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantToolsCode object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(AssistantToolsCodeTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantToolsCode object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssistantToolsCodeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantToolsCodeTypeEnum),
          ) as AssistantToolsCodeTypeEnum;
          result.type = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssistantToolsCode deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantToolsCodeBuilder();
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

class AssistantToolsCodeTypeEnum extends EnumClass {

  /// The type of tool being defined: `code_interpreter`
  @BuiltValueEnumConst(wireName: r'code_interpreter')
  static const AssistantToolsCodeTypeEnum codeInterpreter = _$assistantToolsCodeTypeEnum_codeInterpreter;

  static Serializer<AssistantToolsCodeTypeEnum> get serializer => _$assistantToolsCodeTypeEnumSerializer;

  const AssistantToolsCodeTypeEnum._(String name): super(name);

  static BuiltSet<AssistantToolsCodeTypeEnum> get values => _$assistantToolsCodeTypeEnumValues;
  static AssistantToolsCodeTypeEnum valueOf(String name) => _$assistantToolsCodeTypeEnumValueOf(name);
}

