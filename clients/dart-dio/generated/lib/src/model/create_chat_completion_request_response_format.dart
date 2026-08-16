//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/response_format_json_schema_json_schema.dart';
import 'package:openapi/src/model/response_format_json_object.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/response_format_json_schema.dart';
import 'package:openapi/src/model/response_format_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_chat_completion_request_response_format.g.dart';

/// An object specifying the format that the model must output.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
///
/// Properties:
/// * [type] - The type of response format being defined: `text`
/// * [jsonSchema] 
@BuiltValue()
abstract class CreateChatCompletionRequestResponseFormat implements Built<CreateChatCompletionRequestResponseFormat, CreateChatCompletionRequestResponseFormatBuilder> {
  /// One Of [ResponseFormatJsonObject], [ResponseFormatJsonSchema], [ResponseFormatText]
  OneOf get oneOf;

  CreateChatCompletionRequestResponseFormat._();

  factory CreateChatCompletionRequestResponseFormat([void updates(CreateChatCompletionRequestResponseFormatBuilder b)]) = _$CreateChatCompletionRequestResponseFormat;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionRequestResponseFormatBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionRequestResponseFormat> get serializer => _$CreateChatCompletionRequestResponseFormatSerializer();
}

class _$CreateChatCompletionRequestResponseFormatSerializer implements PrimitiveSerializer<CreateChatCompletionRequestResponseFormat> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionRequestResponseFormat, _$CreateChatCompletionRequestResponseFormat];

  @override
  final String wireName = r'CreateChatCompletionRequestResponseFormat';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionRequestResponseFormat object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateChatCompletionRequestResponseFormat object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateChatCompletionRequestResponseFormat deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionRequestResponseFormatBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(ResponseFormatText), FullType(ResponseFormatJsonObject), FullType(ResponseFormatJsonSchema), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CreateChatCompletionRequestResponseFormatTypeEnum extends EnumClass {

  /// The type of response format being defined: `text`
  @BuiltValueEnumConst(wireName: r'text')
  static const CreateChatCompletionRequestResponseFormatTypeEnum text = _$createChatCompletionRequestResponseFormatTypeEnum_text;
  /// The type of response format being defined: `text`
  @BuiltValueEnumConst(wireName: r'json_object')
  static const CreateChatCompletionRequestResponseFormatTypeEnum jsonObject = _$createChatCompletionRequestResponseFormatTypeEnum_jsonObject;
  /// The type of response format being defined: `text`
  @BuiltValueEnumConst(wireName: r'json_schema')
  static const CreateChatCompletionRequestResponseFormatTypeEnum jsonSchema = _$createChatCompletionRequestResponseFormatTypeEnum_jsonSchema;

  static Serializer<CreateChatCompletionRequestResponseFormatTypeEnum> get serializer => _$createChatCompletionRequestResponseFormatTypeEnumSerializer;

  const CreateChatCompletionRequestResponseFormatTypeEnum._(String name): super(name);

  static BuiltSet<CreateChatCompletionRequestResponseFormatTypeEnum> get values => _$createChatCompletionRequestResponseFormatTypeEnumValues;
  static CreateChatCompletionRequestResponseFormatTypeEnum valueOf(String name) => _$createChatCompletionRequestResponseFormatTypeEnumValueOf(name);
}

