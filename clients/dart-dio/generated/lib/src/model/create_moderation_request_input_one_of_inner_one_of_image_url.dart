//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_moderation_request_input_one_of_inner_one_of_image_url.g.dart';

/// Contains either an image URL or a data URL for a base64 encoded image.
///
/// Properties:
/// * [url] - Either a URL of the image or the base64 encoded image data.
@BuiltValue()
abstract class CreateModerationRequestInputOneOfInnerOneOfImageUrl implements Built<CreateModerationRequestInputOneOfInnerOneOfImageUrl, CreateModerationRequestInputOneOfInnerOneOfImageUrlBuilder> {
  /// Either a URL of the image or the base64 encoded image data.
  @BuiltValueField(wireName: r'url')
  String get url;

  CreateModerationRequestInputOneOfInnerOneOfImageUrl._();

  factory CreateModerationRequestInputOneOfInnerOneOfImageUrl([void updates(CreateModerationRequestInputOneOfInnerOneOfImageUrlBuilder b)]) = _$CreateModerationRequestInputOneOfInnerOneOfImageUrl;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateModerationRequestInputOneOfInnerOneOfImageUrlBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateModerationRequestInputOneOfInnerOneOfImageUrl> get serializer => _$CreateModerationRequestInputOneOfInnerOneOfImageUrlSerializer();
}

class _$CreateModerationRequestInputOneOfInnerOneOfImageUrlSerializer implements PrimitiveSerializer<CreateModerationRequestInputOneOfInnerOneOfImageUrl> {
  @override
  final Iterable<Type> types = const [CreateModerationRequestInputOneOfInnerOneOfImageUrl, _$CreateModerationRequestInputOneOfInnerOneOfImageUrl];

  @override
  final String wireName = r'CreateModerationRequestInputOneOfInnerOneOfImageUrl';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateModerationRequestInputOneOfInnerOneOfImageUrl object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateModerationRequestInputOneOfInnerOneOfImageUrl object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateModerationRequestInputOneOfInnerOneOfImageUrlBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateModerationRequestInputOneOfInnerOneOfImageUrl deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateModerationRequestInputOneOfInnerOneOfImageUrlBuilder();
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

