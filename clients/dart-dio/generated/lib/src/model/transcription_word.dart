//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'transcription_word.g.dart';

/// TranscriptionWord
///
/// Properties:
/// * [word] - The text content of the word.
/// * [start] - Start time of the word in seconds.
/// * [end] - End time of the word in seconds.
@BuiltValue()
abstract class TranscriptionWord implements Built<TranscriptionWord, TranscriptionWordBuilder> {
  /// The text content of the word.
  @BuiltValueField(wireName: r'word')
  String get word;

  /// Start time of the word in seconds.
  @BuiltValueField(wireName: r'start')
  double get start;

  /// End time of the word in seconds.
  @BuiltValueField(wireName: r'end')
  double get end;

  TranscriptionWord._();

  factory TranscriptionWord([void updates(TranscriptionWordBuilder b)]) = _$TranscriptionWord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TranscriptionWordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TranscriptionWord> get serializer => _$TranscriptionWordSerializer();
}

class _$TranscriptionWordSerializer implements PrimitiveSerializer<TranscriptionWord> {
  @override
  final Iterable<Type> types = const [TranscriptionWord, _$TranscriptionWord];

  @override
  final String wireName = r'TranscriptionWord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TranscriptionWord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'word';
    yield serializers.serialize(
      object.word,
      specifiedType: const FullType(String),
    );
    yield r'start';
    yield serializers.serialize(
      object.start,
      specifiedType: const FullType(double),
    );
    yield r'end';
    yield serializers.serialize(
      object.end,
      specifiedType: const FullType(double),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TranscriptionWord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TranscriptionWordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'word':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.word = valueDes;
          break;
        case r'start':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(double),
          ) as double;
          result.start = valueDes;
          break;
        case r'end':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(double),
          ) as double;
          result.end = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TranscriptionWord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TranscriptionWordBuilder();
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

