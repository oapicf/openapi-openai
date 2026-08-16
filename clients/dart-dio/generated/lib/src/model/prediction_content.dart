//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/prediction_content_content.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'prediction_content.g.dart';

/// Static predicted output content, such as the content of a text file that is being regenerated. 
///
/// Properties:
/// * [type] - The type of the predicted content you want to provide. This type is currently always `content`. 
/// * [content] 
@BuiltValue()
abstract class PredictionContent implements Built<PredictionContent, PredictionContentBuilder> {
  /// The type of the predicted content you want to provide. This type is currently always `content`. 
  @BuiltValueField(wireName: r'type')
  PredictionContentTypeEnum get type;
  // enum typeEnum {  content,  };

  @BuiltValueField(wireName: r'content')
  PredictionContentContent get content;

  PredictionContent._();

  factory PredictionContent([void updates(PredictionContentBuilder b)]) = _$PredictionContent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PredictionContentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PredictionContent> get serializer => _$PredictionContentSerializer();
}

class _$PredictionContentSerializer implements PrimitiveSerializer<PredictionContent> {
  @override
  final Iterable<Type> types = const [PredictionContent, _$PredictionContent];

  @override
  final String wireName = r'PredictionContent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PredictionContent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(PredictionContentTypeEnum),
    );
    yield r'content';
    yield serializers.serialize(
      object.content,
      specifiedType: const FullType(PredictionContentContent),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PredictionContent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PredictionContentBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PredictionContentTypeEnum),
          ) as PredictionContentTypeEnum;
          result.type = valueDes;
          break;
        case r'content':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PredictionContentContent),
          ) as PredictionContentContent;
          result.content.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PredictionContent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PredictionContentBuilder();
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

class PredictionContentTypeEnum extends EnumClass {

  /// The type of the predicted content you want to provide. This type is currently always `content`. 
  @BuiltValueEnumConst(wireName: r'content')
  static const PredictionContentTypeEnum content = _$predictionContentTypeEnum_content;

  static Serializer<PredictionContentTypeEnum> get serializer => _$predictionContentTypeEnumSerializer;

  const PredictionContentTypeEnum._(String name): super(name);

  static BuiltSet<PredictionContentTypeEnum> get values => _$predictionContentTypeEnumValues;
  static PredictionContentTypeEnum valueOf(String name) => _$predictionContentTypeEnumValueOf(name);
}

