//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_moderation_request_input_one_of_inner_one_of_image_url.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_moderation_request_input_one_of_inner_one_of.g.dart';

/// An object describing an image to classify.
///
/// Properties:
/// * [type] - Always `image_url`.
/// * [imageUrl] 
@BuiltValue()
abstract class CreateModerationRequestInputOneOfInnerOneOf implements Built<CreateModerationRequestInputOneOfInnerOneOf, CreateModerationRequestInputOneOfInnerOneOfBuilder> {
  /// Always `image_url`.
  @BuiltValueField(wireName: r'type')
  CreateModerationRequestInputOneOfInnerOneOfTypeEnum get type;
  // enum typeEnum {  image_url,  };

  @BuiltValueField(wireName: r'image_url')
  CreateModerationRequestInputOneOfInnerOneOfImageUrl get imageUrl;

  CreateModerationRequestInputOneOfInnerOneOf._();

  factory CreateModerationRequestInputOneOfInnerOneOf([void updates(CreateModerationRequestInputOneOfInnerOneOfBuilder b)]) = _$CreateModerationRequestInputOneOfInnerOneOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationRequestInputOneOfInnerOneOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationRequestInputOneOfInnerOneOf> get serializer => _$CreateModerationRequestInputOneOfInnerOneOfSerializer();
}

class _$CreateModerationRequestInputOneOfInnerOneOfSerializer implements PrimitiveSerializer<CreateModerationRequestInputOneOfInnerOneOf> {
  @override
  final Iterable<Type> types = const [CreateModerationRequestInputOneOfInnerOneOf, _$CreateModerationRequestInputOneOfInnerOneOf];

  @override
  final String wireName = r'CreateModerationRequestInputOneOfInnerOneOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationRequestInputOneOfInnerOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(CreateModerationRequestInputOneOfInnerOneOfTypeEnum),
    );
    yield r'image_url';
    yield serializers.serialize(
      object.imageUrl,
      specifiedType: const FullType(CreateModerationRequestInputOneOfInnerOneOfImageUrl),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationRequestInputOneOfInnerOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateModerationRequestInputOneOfInnerOneOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateModerationRequestInputOneOfInnerOneOfTypeEnum),
          ) as CreateModerationRequestInputOneOfInnerOneOfTypeEnum;
          result.type = valueDes;
          break;
        case r'image_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateModerationRequestInputOneOfInnerOneOfImageUrl),
          ) as CreateModerationRequestInputOneOfInnerOneOfImageUrl;
          result.imageUrl.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateModerationRequestInputOneOfInnerOneOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationRequestInputOneOfInnerOneOfBuilder();
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

class CreateModerationRequestInputOneOfInnerOneOfTypeEnum extends EnumClass {

  /// Always `image_url`.
  @BuiltValueEnumConst(wireName: r'image_url')
  static const CreateModerationRequestInputOneOfInnerOneOfTypeEnum imageUrl = _$createModerationRequestInputOneOfInnerOneOfTypeEnum_imageUrl;

  static Serializer<CreateModerationRequestInputOneOfInnerOneOfTypeEnum> get serializer => _$createModerationRequestInputOneOfInnerOneOfTypeEnumSerializer;

  const CreateModerationRequestInputOneOfInnerOneOfTypeEnum._(String name): super(name);

  static BuiltSet<CreateModerationRequestInputOneOfInnerOneOfTypeEnum> get values => _$createModerationRequestInputOneOfInnerOneOfTypeEnumValues;
  static CreateModerationRequestInputOneOfInnerOneOfTypeEnum valueOf(String name) => _$createModerationRequestInputOneOfInnerOneOfTypeEnumValueOf(name);
}

