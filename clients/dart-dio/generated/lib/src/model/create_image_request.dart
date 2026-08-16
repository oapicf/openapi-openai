//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_image_request_model.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_image_request.g.dart';

/// CreateImageRequest
///
/// Properties:
/// * [prompt] - A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
/// * [model] 
/// * [n] - The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
/// * [quality] - The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
/// * [responseFormat] - The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
/// * [size] - The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
/// * [style] - The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
/// * [user] - A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
@BuiltValue()
abstract class CreateImageRequest implements Built<CreateImageRequest, CreateImageRequestBuilder> {
  /// A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
  @BuiltValueField(wireName: r'prompt')
  String get prompt;

  @BuiltValueField(wireName: r'model')
  CreateImageRequestModel? get model;

  /// The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
  @BuiltValueField(wireName: r'n')
  int? get n;

  /// The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
  @BuiltValueField(wireName: r'quality')
  CreateImageRequestQualityEnum? get quality;
  // enum qualityEnum {  standard,  hd,  };

  /// The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  @BuiltValueField(wireName: r'response_format')
  CreateImageRequestResponseFormatEnum? get responseFormat;
  // enum responseFormatEnum {  url,  b64_json,  };

  /// The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
  @BuiltValueField(wireName: r'size')
  CreateImageRequestSizeEnum? get size;
  // enum sizeEnum {  256x256,  512x512,  1024x1024,  1792x1024,  1024x1792,  };

  /// The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
  @BuiltValueField(wireName: r'style')
  CreateImageRequestStyleEnum? get style;
  // enum styleEnum {  vivid,  natural,  };

  /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  @BuiltValueField(wireName: r'user')
  String? get user;

  CreateImageRequest._();

  factory CreateImageRequest([void updates(CreateImageRequestBuilder b)]) = _$CreateImageRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateImageRequestBuilder b) => b
      ..n = 1
      ..quality = CreateImageRequestQualityEnum.valueOf('standard')
      ..responseFormat = CreateImageRequestResponseFormatEnum.valueOf('url')
      ..size = CreateImageRequestSizeEnum.valueOf('1024x1024')
      ..style = CreateImageRequestStyleEnum.valueOf('vivid');

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateImageRequest> get serializer => _$CreateImageRequestSerializer();
}

class _$CreateImageRequestSerializer implements PrimitiveSerializer<CreateImageRequest> {
  @override
  final Iterable<Type> types = const [CreateImageRequest, _$CreateImageRequest];

  @override
  final String wireName = r'CreateImageRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateImageRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'prompt';
    yield serializers.serialize(
      object.prompt,
      specifiedType: const FullType(String),
    );
    if (object.model != null) {
      yield r'model';
      yield serializers.serialize(
        object.model,
        specifiedType: const FullType.nullable(CreateImageRequestModel),
      );
    }
    if (object.n != null) {
      yield r'n';
      yield serializers.serialize(
        object.n,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.quality != null) {
      yield r'quality';
      yield serializers.serialize(
        object.quality,
        specifiedType: const FullType(CreateImageRequestQualityEnum),
      );
    }
    if (object.responseFormat != null) {
      yield r'response_format';
      yield serializers.serialize(
        object.responseFormat,
        specifiedType: const FullType.nullable(CreateImageRequestResponseFormatEnum),
      );
    }
    if (object.size != null) {
      yield r'size';
      yield serializers.serialize(
        object.size,
        specifiedType: const FullType.nullable(CreateImageRequestSizeEnum),
      );
    }
    if (object.style != null) {
      yield r'style';
      yield serializers.serialize(
        object.style,
        specifiedType: const FullType.nullable(CreateImageRequestStyleEnum),
      );
    }
    if (object.user != null) {
      yield r'user';
      yield serializers.serialize(
        object.user,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateImageRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateImageRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'prompt':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.prompt = valueDes;
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateImageRequestModel),
          ) as CreateImageRequestModel?;
          if (valueDes == null) continue;
          result.model.replace(valueDes);
          break;
        case r'n':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.n = valueDes;
          break;
        case r'quality':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateImageRequestQualityEnum),
          ) as CreateImageRequestQualityEnum;
          result.quality = valueDes;
          break;
        case r'response_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateImageRequestResponseFormatEnum),
          ) as CreateImageRequestResponseFormatEnum?;
          if (valueDes == null) continue;
          result.responseFormat = valueDes;
          break;
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateImageRequestSizeEnum),
          ) as CreateImageRequestSizeEnum?;
          if (valueDes == null) continue;
          result.size = valueDes;
          break;
        case r'style':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateImageRequestStyleEnum),
          ) as CreateImageRequestStyleEnum?;
          if (valueDes == null) continue;
          result.style = valueDes;
          break;
        case r'user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.user = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateImageRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateImageRequestBuilder();
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

class CreateImageRequestQualityEnum extends EnumClass {

  /// The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
  @BuiltValueEnumConst(wireName: r'standard')
  static const CreateImageRequestQualityEnum standard = _$createImageRequestQualityEnum_standard;
  /// The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
  @BuiltValueEnumConst(wireName: r'hd')
  static const CreateImageRequestQualityEnum hd = _$createImageRequestQualityEnum_hd;

  static Serializer<CreateImageRequestQualityEnum> get serializer => _$createImageRequestQualityEnumSerializer;

  const CreateImageRequestQualityEnum._(String name): super(name);

  static BuiltSet<CreateImageRequestQualityEnum> get values => _$createImageRequestQualityEnumValues;
  static CreateImageRequestQualityEnum valueOf(String name) => _$createImageRequestQualityEnumValueOf(name);
}

class CreateImageRequestResponseFormatEnum extends EnumClass {

  /// The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  @BuiltValueEnumConst(wireName: r'url')
  static const CreateImageRequestResponseFormatEnum url = _$createImageRequestResponseFormatEnum_url;
  /// The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  @BuiltValueEnumConst(wireName: r'b64_json')
  static const CreateImageRequestResponseFormatEnum b64Json = _$createImageRequestResponseFormatEnum_b64Json;

  static Serializer<CreateImageRequestResponseFormatEnum> get serializer => _$createImageRequestResponseFormatEnumSerializer;

  const CreateImageRequestResponseFormatEnum._(String name): super(name);

  static BuiltSet<CreateImageRequestResponseFormatEnum> get values => _$createImageRequestResponseFormatEnumValues;
  static CreateImageRequestResponseFormatEnum valueOf(String name) => _$createImageRequestResponseFormatEnumValueOf(name);
}

class CreateImageRequestSizeEnum extends EnumClass {

  /// The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
  @BuiltValueEnumConst(wireName: r'256x256')
  static const CreateImageRequestSizeEnum n256x256 = _$createImageRequestSizeEnum_n256x256;
  /// The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
  @BuiltValueEnumConst(wireName: r'512x512')
  static const CreateImageRequestSizeEnum n512x512 = _$createImageRequestSizeEnum_n512x512;
  /// The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
  @BuiltValueEnumConst(wireName: r'1024x1024')
  static const CreateImageRequestSizeEnum n1024x1024 = _$createImageRequestSizeEnum_n1024x1024;
  /// The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
  @BuiltValueEnumConst(wireName: r'1792x1024')
  static const CreateImageRequestSizeEnum n1792x1024 = _$createImageRequestSizeEnum_n1792x1024;
  /// The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
  @BuiltValueEnumConst(wireName: r'1024x1792')
  static const CreateImageRequestSizeEnum n1024x1792 = _$createImageRequestSizeEnum_n1024x1792;

  static Serializer<CreateImageRequestSizeEnum> get serializer => _$createImageRequestSizeEnumSerializer;

  const CreateImageRequestSizeEnum._(String name): super(name);

  static BuiltSet<CreateImageRequestSizeEnum> get values => _$createImageRequestSizeEnumValues;
  static CreateImageRequestSizeEnum valueOf(String name) => _$createImageRequestSizeEnumValueOf(name);
}

class CreateImageRequestStyleEnum extends EnumClass {

  /// The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
  @BuiltValueEnumConst(wireName: r'vivid')
  static const CreateImageRequestStyleEnum vivid = _$createImageRequestStyleEnum_vivid;
  /// The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
  @BuiltValueEnumConst(wireName: r'natural')
  static const CreateImageRequestStyleEnum natural = _$createImageRequestStyleEnum_natural;

  static Serializer<CreateImageRequestStyleEnum> get serializer => _$createImageRequestStyleEnumSerializer;

  const CreateImageRequestStyleEnum._(String name): super(name);

  static BuiltSet<CreateImageRequestStyleEnum> get values => _$createImageRequestStyleEnumValues;
  static CreateImageRequestStyleEnum valueOf(String name) => _$createImageRequestStyleEnumValueOf(name);
}

