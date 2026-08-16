//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'response_format_json_object.g.dart';

/// ResponseFormatJsonObject
///
/// Properties:
/// * [type] - The type of response format being defined: `json_object`
@BuiltValue()
abstract class ResponseFormatJsonObject implements Built<ResponseFormatJsonObject, ResponseFormatJsonObjectBuilder> {
  /// The type of response format being defined: `json_object`
  @BuiltValueField(wireName: r'type')
  ResponseFormatJsonObjectTypeEnum get type;
  // enum typeEnum {  json_object,  };

  ResponseFormatJsonObject._();

  factory ResponseFormatJsonObject([void updates(ResponseFormatJsonObjectBuilder b)]) = _$ResponseFormatJsonObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ResponseFormatJsonObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ResponseFormatJsonObject> get serializer => _$ResponseFormatJsonObjectSerializer();
}

class _$ResponseFormatJsonObjectSerializer implements PrimitiveSerializer<ResponseFormatJsonObject> {
  @override
  final Iterable<Type> types = const [ResponseFormatJsonObject, _$ResponseFormatJsonObject];

  @override
  final String wireName = r'ResponseFormatJsonObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ResponseFormatJsonObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(ResponseFormatJsonObjectTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ResponseFormatJsonObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ResponseFormatJsonObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ResponseFormatJsonObjectTypeEnum),
          ) as ResponseFormatJsonObjectTypeEnum;
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
  ResponseFormatJsonObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ResponseFormatJsonObjectBuilder();
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

class ResponseFormatJsonObjectTypeEnum extends EnumClass {

  /// The type of response format being defined: `json_object`
  @BuiltValueEnumConst(wireName: r'json_object')
  static const ResponseFormatJsonObjectTypeEnum jsonObject = _$responseFormatJsonObjectTypeEnum_jsonObject;

  static Serializer<ResponseFormatJsonObjectTypeEnum> get serializer => _$responseFormatJsonObjectTypeEnumSerializer;

  const ResponseFormatJsonObjectTypeEnum._(String name): super(name);

  static BuiltSet<ResponseFormatJsonObjectTypeEnum> get values => _$responseFormatJsonObjectTypeEnumValues;
  static ResponseFormatJsonObjectTypeEnum valueOf(String name) => _$responseFormatJsonObjectTypeEnumValueOf(name);
}

