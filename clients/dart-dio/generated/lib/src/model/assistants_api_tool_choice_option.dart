//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/assistants_named_tool_choice.dart';
import 'package:openapi/src/model/assistants_named_tool_choice_function.dart';
import 'package:built_collection/built_collection.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'assistants_api_tool_choice_option.g.dart';

/// Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools before responding to the user. Specifying a particular tool like `{\"type\": \"file_search\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
///
/// Properties:
/// * [type] - The type of the tool. If type is `function`, the function name must be set
/// * [function_] 
@BuiltValue()
abstract class AssistantsApiToolChoiceOption implements Built<AssistantsApiToolChoiceOption, AssistantsApiToolChoiceOptionBuilder> {
  /// One Of [AssistantsNamedToolChoice], [String]
  OneOf get oneOf;

  AssistantsApiToolChoiceOption._();

  factory AssistantsApiToolChoiceOption([void updates(AssistantsApiToolChoiceOptionBuilder b)]) = _$AssistantsApiToolChoiceOption;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantsApiToolChoiceOptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantsApiToolChoiceOption> get serializer => _$AssistantsApiToolChoiceOptionSerializer();
}

class _$AssistantsApiToolChoiceOptionSerializer implements PrimitiveSerializer<AssistantsApiToolChoiceOption> {
  @override
  final Iterable<Type> types = const [AssistantsApiToolChoiceOption, _$AssistantsApiToolChoiceOption];

  @override
  final String wireName = r'AssistantsApiToolChoiceOption';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantsApiToolChoiceOption object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantsApiToolChoiceOption object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  AssistantsApiToolChoiceOption deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantsApiToolChoiceOptionBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(AssistantsNamedToolChoice), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class AssistantsApiToolChoiceOptionTypeEnum extends EnumClass {

  /// The type of the tool. If type is `function`, the function name must be set
  @BuiltValueEnumConst(wireName: r'function')
  static const AssistantsApiToolChoiceOptionTypeEnum function_ = _$assistantsApiToolChoiceOptionTypeEnum_function_;
  /// The type of the tool. If type is `function`, the function name must be set
  @BuiltValueEnumConst(wireName: r'code_interpreter')
  static const AssistantsApiToolChoiceOptionTypeEnum codeInterpreter = _$assistantsApiToolChoiceOptionTypeEnum_codeInterpreter;
  /// The type of the tool. If type is `function`, the function name must be set
  @BuiltValueEnumConst(wireName: r'file_search')
  static const AssistantsApiToolChoiceOptionTypeEnum fileSearch = _$assistantsApiToolChoiceOptionTypeEnum_fileSearch;

  static Serializer<AssistantsApiToolChoiceOptionTypeEnum> get serializer => _$assistantsApiToolChoiceOptionTypeEnumSerializer;

  const AssistantsApiToolChoiceOptionTypeEnum._(String name): super(name);

  static BuiltSet<AssistantsApiToolChoiceOptionTypeEnum> get values => _$assistantsApiToolChoiceOptionTypeEnumValues;
  static AssistantsApiToolChoiceOptionTypeEnum valueOf(String name) => _$assistantsApiToolChoiceOptionTypeEnumValueOf(name);
}

