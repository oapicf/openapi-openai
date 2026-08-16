//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/response_format_json_schema_json_schema.dart';
import 'package:openapi/src/model/response_format_json_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/response_format_json_schema.dart';
import 'package:openapi/src/model/response_format_text.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'assistants_api_response_format_option.g.dart';

/// Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
///
/// Properties:
/// * [type] - The type of response format being defined: `text`
/// * [jsonSchema] 
@BuiltValue()
abstract class AssistantsApiResponseFormatOption implements Built<AssistantsApiResponseFormatOption, AssistantsApiResponseFormatOptionBuilder> {
  /// One Of [ResponseFormatJsonObject], [ResponseFormatJsonSchema], [ResponseFormatText], [String]
  OneOf get oneOf;

  AssistantsApiResponseFormatOption._();

  factory AssistantsApiResponseFormatOption([void updates(AssistantsApiResponseFormatOptionBuilder b)]) = _$AssistantsApiResponseFormatOption;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantsApiResponseFormatOptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantsApiResponseFormatOption> get serializer => _$AssistantsApiResponseFormatOptionSerializer();
}

class _$AssistantsApiResponseFormatOptionSerializer implements PrimitiveSerializer<AssistantsApiResponseFormatOption> {
  @override
  final Iterable<Type> types = const [AssistantsApiResponseFormatOption, _$AssistantsApiResponseFormatOption];

  @override
  final String wireName = r'AssistantsApiResponseFormatOption';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantsApiResponseFormatOption object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantsApiResponseFormatOption object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  AssistantsApiResponseFormatOption deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantsApiResponseFormatOptionBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(OneOf0Enum), FullType(ResponseFormatText), FullType(ResponseFormatJsonObject), FullType(ResponseFormatJsonSchema), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class AssistantsApiResponseFormatOptionTypeEnum extends EnumClass {

  /// The type of response format being defined: `text`
  @BuiltValueEnumConst(wireName: r'text')
  static const AssistantsApiResponseFormatOptionTypeEnum text = _$assistantsApiResponseFormatOptionTypeEnum_text;
  /// The type of response format being defined: `text`
  @BuiltValueEnumConst(wireName: r'json_object')
  static const AssistantsApiResponseFormatOptionTypeEnum jsonObject = _$assistantsApiResponseFormatOptionTypeEnum_jsonObject;
  /// The type of response format being defined: `text`
  @BuiltValueEnumConst(wireName: r'json_schema')
  static const AssistantsApiResponseFormatOptionTypeEnum jsonSchema = _$assistantsApiResponseFormatOptionTypeEnum_jsonSchema;

  static Serializer<AssistantsApiResponseFormatOptionTypeEnum> get serializer => _$assistantsApiResponseFormatOptionTypeEnumSerializer;

  const AssistantsApiResponseFormatOptionTypeEnum._(String name): super(name);

  static BuiltSet<AssistantsApiResponseFormatOptionTypeEnum> get values => _$assistantsApiResponseFormatOptionTypeEnumValues;
  static AssistantsApiResponseFormatOptionTypeEnum valueOf(String name) => _$assistantsApiResponseFormatOptionTypeEnumValueOf(name);
}

