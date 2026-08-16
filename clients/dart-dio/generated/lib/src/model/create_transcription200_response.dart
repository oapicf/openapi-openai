//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/transcription_segment.dart';
import 'package:openapi/src/model/transcription_word.dart';
import 'package:openapi/src/model/create_transcription_response_json.dart';
import 'package:openapi/src/model/create_transcription_response_verbose_json.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'create_transcription200_response.g.dart';

/// CreateTranscription200Response
///
/// Properties:
/// * [text] - The transcribed text.
/// * [language] - The language of the input audio.
/// * [duration] - The duration of the input audio.
/// * [words] - Extracted words and their corresponding timestamps.
/// * [segments] - Segments of the transcribed text and their corresponding details.
@BuiltValue()
abstract class CreateTranscription200Response implements Built<CreateTranscription200Response, CreateTranscription200ResponseBuilder> {
  /// One Of [CreateTranscriptionResponseJson], [CreateTranscriptionResponseVerboseJson]
  OneOf get oneOf;

  CreateTranscription200Response._();

  factory CreateTranscription200Response([void updates(CreateTranscription200ResponseBuilder b)]) = _$CreateTranscription200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateTranscription200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateTranscription200Response> get serializer => _$CreateTranscription200ResponseSerializer();
}

class _$CreateTranscription200ResponseSerializer implements PrimitiveSerializer<CreateTranscription200Response> {
  @override
  final Iterable<Type> types = const [CreateTranscription200Response, _$CreateTranscription200Response];

  @override
  final String wireName = r'CreateTranscription200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateTranscription200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateTranscription200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CreateTranscription200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateTranscription200ResponseBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CreateTranscriptionResponseJson), FullType(CreateTranscriptionResponseVerboseJson), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

