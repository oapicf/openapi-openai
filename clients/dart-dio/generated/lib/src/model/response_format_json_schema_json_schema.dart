//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'response_format_json_schema_json_schema.g.dart';

/// ResponseFormatJsonSchemaJsonSchema
///
/// Properties:
/// * [description] - A description of what the response format is for, used by the model to determine how to respond in the format.
/// * [name] - The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
/// * [schema] - The schema for the response format, described as a JSON Schema object.
/// * [strict] - Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
@BuiltValue()
abstract class ResponseFormatJsonSchemaJsonSchema implements Built<ResponseFormatJsonSchemaJsonSchema, ResponseFormatJsonSchemaJsonSchemaBuilder> {
  /// A description of what the response format is for, used by the model to determine how to respond in the format.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The schema for the response format, described as a JSON Schema object.
  @BuiltValueField(wireName: r'schema')
  BuiltMap<String, JsonObject?>? get schema;

  /// Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
  @BuiltValueField(wireName: r'strict')
  bool? get strict;

  ResponseFormatJsonSchemaJsonSchema._();

  factory ResponseFormatJsonSchemaJsonSchema([void updates(ResponseFormatJsonSchemaJsonSchemaBuilder b)]) = _$ResponseFormatJsonSchemaJsonSchema;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ResponseFormatJsonSchemaJsonSchemaBuilder b) => b
      ..strict = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<ResponseFormatJsonSchemaJsonSchema> get serializer => _$ResponseFormatJsonSchemaJsonSchemaSerializer();
}

class _$ResponseFormatJsonSchemaJsonSchemaSerializer implements PrimitiveSerializer<ResponseFormatJsonSchemaJsonSchema> {
  @override
  final Iterable<Type> types = const [ResponseFormatJsonSchemaJsonSchema, _$ResponseFormatJsonSchemaJsonSchema];

  @override
  final String wireName = r'ResponseFormatJsonSchemaJsonSchema';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ResponseFormatJsonSchemaJsonSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.schema != null) {
      yield r'schema';
      yield serializers.serialize(
        object.schema,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType.nullable(JsonObject)]),
      );
    }
    if (object.strict != null) {
      yield r'strict';
      yield serializers.serialize(
        object.strict,
        specifiedType: const FullType.nullable(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ResponseFormatJsonSchemaJsonSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ResponseFormatJsonSchemaJsonSchemaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'schema':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType.nullable(JsonObject)]),
          ) as BuiltMap<String, JsonObject?>;
          result.schema.replace(valueDes);
          break;
        case r'strict':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.strict = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ResponseFormatJsonSchemaJsonSchema deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ResponseFormatJsonSchemaJsonSchemaBuilder();
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

