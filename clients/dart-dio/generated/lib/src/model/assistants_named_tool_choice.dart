//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/assistants_named_tool_choice_function.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'assistants_named_tool_choice.g.dart';

/// Specifies a tool the model should use. Use to force the model to call a specific tool.
///
/// Properties:
/// * [type] - The type of the tool. If type is `function`, the function name must be set
/// * [function_] 
@BuiltValue()
abstract class AssistantsNamedToolChoice implements Built<AssistantsNamedToolChoice, AssistantsNamedToolChoiceBuilder> {
  /// The type of the tool. If type is `function`, the function name must be set
  @BuiltValueField(wireName: r'type')
  AssistantsNamedToolChoiceTypeEnum get type;
  // enum typeEnum {  function,  code_interpreter,  file_search,  };

  @BuiltValueField(wireName: r'function')
  AssistantsNamedToolChoiceFunction? get function_;

  AssistantsNamedToolChoice._();

  factory AssistantsNamedToolChoice([void updates(AssistantsNamedToolChoiceBuilder b)]) = _$AssistantsNamedToolChoice;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantsNamedToolChoiceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantsNamedToolChoice> get serializer => _$AssistantsNamedToolChoiceSerializer();
}

class _$AssistantsNamedToolChoiceSerializer implements PrimitiveSerializer<AssistantsNamedToolChoice> {
  @override
  final Iterable<Type> types = const [AssistantsNamedToolChoice, _$AssistantsNamedToolChoice];

  @override
  final String wireName = r'AssistantsNamedToolChoice';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantsNamedToolChoice object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(AssistantsNamedToolChoiceTypeEnum),
    );
    if (object.function_ != null) {
      yield r'function';
      yield serializers.serialize(
        object.function_,
        specifiedType: const FullType(AssistantsNamedToolChoiceFunction),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantsNamedToolChoice object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssistantsNamedToolChoiceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantsNamedToolChoiceTypeEnum),
          ) as AssistantsNamedToolChoiceTypeEnum;
          result.type = valueDes;
          break;
        case r'function':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantsNamedToolChoiceFunction),
          ) as AssistantsNamedToolChoiceFunction;
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
  AssistantsNamedToolChoice deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantsNamedToolChoiceBuilder();
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

class AssistantsNamedToolChoiceTypeEnum extends EnumClass {

  /// The type of the tool. If type is `function`, the function name must be set
  @BuiltValueEnumConst(wireName: r'function')
  static const AssistantsNamedToolChoiceTypeEnum function_ = _$assistantsNamedToolChoiceTypeEnum_function_;
  /// The type of the tool. If type is `function`, the function name must be set
  @BuiltValueEnumConst(wireName: r'code_interpreter')
  static const AssistantsNamedToolChoiceTypeEnum codeInterpreter = _$assistantsNamedToolChoiceTypeEnum_codeInterpreter;
  /// The type of the tool. If type is `function`, the function name must be set
  @BuiltValueEnumConst(wireName: r'file_search')
  static const AssistantsNamedToolChoiceTypeEnum fileSearch = _$assistantsNamedToolChoiceTypeEnum_fileSearch;

  static Serializer<AssistantsNamedToolChoiceTypeEnum> get serializer => _$assistantsNamedToolChoiceTypeEnumSerializer;

  const AssistantsNamedToolChoiceTypeEnum._(String name): super(name);

  static BuiltSet<AssistantsNamedToolChoiceTypeEnum> get values => _$assistantsNamedToolChoiceTypeEnumValues;
  static AssistantsNamedToolChoiceTypeEnum valueOf(String name) => _$assistantsNamedToolChoiceTypeEnumValueOf(name);
}

