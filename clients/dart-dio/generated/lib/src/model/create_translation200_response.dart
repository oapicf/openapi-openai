//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/transcription_segment.dart';
import 'package:openapi/src/model/create_translation_response_verbose_json.dart';
import 'package:openapi/src/model/create_translation_response_json.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_translation200_response.g.dart';

/// CreateTranslation200Response
///
/// Properties:
/// * [text] - The translated text.
/// * [language] - The language of the output translation (always `english`).
/// * [duration] - The duration of the input audio.
/// * [segments] - Segments of the translated text and their corresponding details.
@BuiltValue()
abstract class CreateTranslation200Response implements Built<CreateTranslation200Response, CreateTranslation200ResponseBuilder> {
  /// One Of [CreateTranslationResponseJson], [CreateTranslationResponseVerboseJson]
  OneOf get oneOf;

  CreateTranslation200Response._();

  factory CreateTranslation200Response([void updates(CreateTranslation200ResponseBuilder b)]) = _$CreateTranslation200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateTranslation200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateTranslation200Response> get serializer => _$CreateTranslation200ResponseSerializer();
}

class _$CreateTranslation200ResponseSerializer implements PrimitiveSerializer<CreateTranslation200Response> {
  @override
  final Iterable<Type> types = const [CreateTranslation200Response, _$CreateTranslation200Response];

  @override
  final String wireName = r'CreateTranslation200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateTranslation200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateTranslation200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateTranslation200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateTranslation200ResponseBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CreateTranslationResponseJson), FullType(CreateTranslationResponseVerboseJson), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

