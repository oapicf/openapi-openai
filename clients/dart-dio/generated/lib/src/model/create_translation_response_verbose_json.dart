//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/transcription_segment.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_translation_response_verbose_json.g.dart';

/// CreateTranslationResponseVerboseJson
///
/// Properties:
/// * [language] - The language of the output translation (always `english`).
/// * [duration] - The duration of the input audio.
/// * [text] - The translated text.
/// * [segments] - Segments of the translated text and their corresponding details.
@BuiltValue()
abstract class CreateTranslationResponseVerboseJson implements Built<CreateTranslationResponseVerboseJson, CreateTranslationResponseVerboseJsonBuilder> {
  /// The language of the output translation (always `english`).
  @BuiltValueField(wireName: r'language')
  String get language;

  /// The duration of the input audio.
  @BuiltValueField(wireName: r'duration')
  String get duration;

  /// The translated text.
  @BuiltValueField(wireName: r'text')
  String get text;

  /// Segments of the translated text and their corresponding details.
  @BuiltValueField(wireName: r'segments')
  BuiltList<TranscriptionSegment>? get segments;

  CreateTranslationResponseVerboseJson._();

  factory CreateTranslationResponseVerboseJson([void updates(CreateTranslationResponseVerboseJsonBuilder b)]) = _$CreateTranslationResponseVerboseJson;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateTranslationResponseVerboseJsonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateTranslationResponseVerboseJson> get serializer => _$CreateTranslationResponseVerboseJsonSerializer();
}

class _$CreateTranslationResponseVerboseJsonSerializer implements PrimitiveSerializer<CreateTranslationResponseVerboseJson> {
  @override
  final Iterable<Type> types = const [CreateTranslationResponseVerboseJson, _$CreateTranslationResponseVerboseJson];

  @override
  final String wireName = r'CreateTranslationResponseVerboseJson';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateTranslationResponseVerboseJson object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(String),
    );
    yield r'duration';
    yield serializers.serialize(
      object.duration,
      specifiedType: const FullType(String),
    );
    yield r'text';
    yield serializers.serialize(
      object.text,
      specifiedType: const FullType(String),
    );
    if (object.segments != null) {
      yield r'segments';
      yield serializers.serialize(
        object.segments,
        specifiedType: const FullType(BuiltList, [FullType(TranscriptionSegment)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateTranslationResponseVerboseJson object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateTranslationResponseVerboseJsonBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.language = valueDes;
          break;
        case r'duration':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.duration = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        case r'segments':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TranscriptionSegment)]),
          ) as BuiltList<TranscriptionSegment>;
          result.segments.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateTranslationResponseVerboseJson deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateTranslationResponseVerboseJsonBuilder();
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

