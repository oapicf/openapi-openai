//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'response_format_text.g.dart';

/// ResponseFormatText
///
/// Properties:
/// * [type] - The type of response format being defined: `text`
@BuiltValue()
abstract class ResponseFormatText implements Built<ResponseFormatText, ResponseFormatTextBuilder> {
  /// The type of response format being defined: `text`
  @BuiltValueField(wireName: r'type')
  ResponseFormatTextTypeEnum get type;
  // enum typeEnum {  text,  };

  ResponseFormatText._();

  factory ResponseFormatText([void updates(ResponseFormatTextBuilder b)]) = _$ResponseFormatText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ResponseFormatTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ResponseFormatText> get serializer => _$ResponseFormatTextSerializer();
}

class _$ResponseFormatTextSerializer implements PrimitiveSerializer<ResponseFormatText> {
  @override
  final Iterable<Type> types = const [ResponseFormatText, _$ResponseFormatText];

  @override
  final String wireName = r'ResponseFormatText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ResponseFormatText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(ResponseFormatTextTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ResponseFormatText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ResponseFormatTextBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ResponseFormatTextTypeEnum),
          ) as ResponseFormatTextTypeEnum;
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
  ResponseFormatText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ResponseFormatTextBuilder();
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

class ResponseFormatTextTypeEnum extends EnumClass {

  /// The type of response format being defined: `text`
  @BuiltValueEnumConst(wireName: r'text')
  static const ResponseFormatTextTypeEnum text = _$responseFormatTextTypeEnum_text;

  static Serializer<ResponseFormatTextTypeEnum> get serializer => _$responseFormatTextTypeEnumSerializer;

  const ResponseFormatTextTypeEnum._(String name): super(name);

  static BuiltSet<ResponseFormatTextTypeEnum> get values => _$responseFormatTextTypeEnumValues;
  static ResponseFormatTextTypeEnum valueOf(String name) => _$responseFormatTextTypeEnumValueOf(name);
}

