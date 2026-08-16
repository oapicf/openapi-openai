//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/response_format_json_schema_json_schema.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'response_format_json_schema.g.dart';

/// ResponseFormatJsonSchema
///
/// Properties:
/// * [type] - The type of response format being defined: `json_schema`
/// * [jsonSchema] 
@BuiltValue()
abstract class ResponseFormatJsonSchema implements Built<ResponseFormatJsonSchema, ResponseFormatJsonSchemaBuilder> {
  /// The type of response format being defined: `json_schema`
  @BuiltValueField(wireName: r'type')
  ResponseFormatJsonSchemaTypeEnum get type;
  // enum typeEnum {  json_schema,  };

  @BuiltValueField(wireName: r'json_schema')
  ResponseFormatJsonSchemaJsonSchema get jsonSchema;

  ResponseFormatJsonSchema._();

  factory ResponseFormatJsonSchema([void updates(ResponseFormatJsonSchemaBuilder b)]) = _$ResponseFormatJsonSchema;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ResponseFormatJsonSchemaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ResponseFormatJsonSchema> get serializer => _$ResponseFormatJsonSchemaSerializer();
}

class _$ResponseFormatJsonSchemaSerializer implements PrimitiveSerializer<ResponseFormatJsonSchema> {
  @override
  final Iterable<Type> types = const [ResponseFormatJsonSchema, _$ResponseFormatJsonSchema];

  @override
  final String wireName = r'ResponseFormatJsonSchema';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ResponseFormatJsonSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(ResponseFormatJsonSchemaTypeEnum),
    );
    yield r'json_schema';
    yield serializers.serialize(
      object.jsonSchema,
      specifiedType: const FullType(ResponseFormatJsonSchemaJsonSchema),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ResponseFormatJsonSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ResponseFormatJsonSchemaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ResponseFormatJsonSchemaTypeEnum),
          ) as ResponseFormatJsonSchemaTypeEnum;
          result.type = valueDes;
          break;
        case r'json_schema':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ResponseFormatJsonSchemaJsonSchema),
          ) as ResponseFormatJsonSchemaJsonSchema;
          result.jsonSchema.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ResponseFormatJsonSchema deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ResponseFormatJsonSchemaBuilder();
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

class ResponseFormatJsonSchemaTypeEnum extends EnumClass {

  /// The type of response format being defined: `json_schema`
  @BuiltValueEnumConst(wireName: r'json_schema')
  static const ResponseFormatJsonSchemaTypeEnum jsonSchema = _$responseFormatJsonSchemaTypeEnum_jsonSchema;

  static Serializer<ResponseFormatJsonSchemaTypeEnum> get serializer => _$responseFormatJsonSchemaTypeEnumSerializer;

  const ResponseFormatJsonSchemaTypeEnum._(String name): super(name);

  static BuiltSet<ResponseFormatJsonSchemaTypeEnum> get values => _$responseFormatJsonSchemaTypeEnumValues;
  static ResponseFormatJsonSchemaTypeEnum valueOf(String name) => _$responseFormatJsonSchemaTypeEnumValueOf(name);
}

