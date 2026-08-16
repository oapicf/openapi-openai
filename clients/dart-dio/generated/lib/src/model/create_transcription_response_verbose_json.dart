//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/transcription_segment.dart';
import 'package:openapi/src/model/transcription_word.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_transcription_response_verbose_json.g.dart';

/// Represents a verbose json transcription response returned by model, based on the provided input.
///
/// Properties:
/// * [language] - The language of the input audio.
/// * [duration] - The duration of the input audio.
/// * [text] - The transcribed text.
/// * [words] - Extracted words and their corresponding timestamps.
/// * [segments] - Segments of the transcribed text and their corresponding details.
@BuiltValue()
abstract class CreateTranscriptionResponseVerboseJson implements Built<CreateTranscriptionResponseVerboseJson, CreateTranscriptionResponseVerboseJsonBuilder> {
  /// The language of the input audio.
  @BuiltValueField(wireName: r'language')
  String get language;

  /// The duration of the input audio.
  @BuiltValueField(wireName: r'duration')
  String get duration;

  /// The transcribed text.
  @BuiltValueField(wireName: r'text')
  String get text;

  /// Extracted words and their corresponding timestamps.
  @BuiltValueField(wireName: r'words')
  BuiltList<TranscriptionWord>? get words;

  /// Segments of the transcribed text and their corresponding details.
  @BuiltValueField(wireName: r'segments')
  BuiltList<TranscriptionSegment>? get segments;

  CreateTranscriptionResponseVerboseJson._();

  factory CreateTranscriptionResponseVerboseJson([void updates(CreateTranscriptionResponseVerboseJsonBuilder b)]) = _$CreateTranscriptionResponseVerboseJson;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateTranscriptionResponseVerboseJsonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateTranscriptionResponseVerboseJson> get serializer => _$CreateTranscriptionResponseVerboseJsonSerializer();
}

class _$CreateTranscriptionResponseVerboseJsonSerializer implements PrimitiveSerializer<CreateTranscriptionResponseVerboseJson> {
  @override
  final Iterable<Type> types = const [CreateTranscriptionResponseVerboseJson, _$CreateTranscriptionResponseVerboseJson];

  @override
  final String wireName = r'CreateTranscriptionResponseVerboseJson';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateTranscriptionResponseVerboseJson object, {
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
    if (object.words != null) {
      yield r'words';
      yield serializers.serialize(
        object.words,
        specifiedType: const FullType(BuiltList, [FullType(TranscriptionWord)]),
      );
    }
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
    CreateTranscriptionResponseVerboseJson object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateTranscriptionResponseVerboseJsonBuilder result,
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
        case r'words':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TranscriptionWord)]),
          ) as BuiltList<TranscriptionWord>;
          result.words.replace(valueDes);
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
  CreateTranscriptionResponseVerboseJson deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateTranscriptionResponseVerboseJsonBuilder();
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

