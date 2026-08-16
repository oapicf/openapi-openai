//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'transcription_segment.g.dart';

/// TranscriptionSegment
///
/// Properties:
/// * [id] - Unique identifier of the segment.
/// * [seek] - Seek offset of the segment.
/// * [start] - Start time of the segment in seconds.
/// * [end] - End time of the segment in seconds.
/// * [text] - Text content of the segment.
/// * [tokens] - Array of token IDs for the text content.
/// * [temperature] - Temperature parameter used for generating the segment.
/// * [avgLogprob] - Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
/// * [compressionRatio] - Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
/// * [noSpeechProb] - Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
@BuiltValue()
abstract class TranscriptionSegment implements Built<TranscriptionSegment, TranscriptionSegmentBuilder> {
  /// Unique identifier of the segment.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// Seek offset of the segment.
  @BuiltValueField(wireName: r'seek')
  int get seek;

  /// Start time of the segment in seconds.
  @BuiltValueField(wireName: r'start')
  double get start;

  /// End time of the segment in seconds.
  @BuiltValueField(wireName: r'end')
  double get end;

  /// Text content of the segment.
  @BuiltValueField(wireName: r'text')
  String get text;

  /// Array of token IDs for the text content.
  @BuiltValueField(wireName: r'tokens')
  BuiltList<int> get tokens;

  /// Temperature parameter used for generating the segment.
  @BuiltValueField(wireName: r'temperature')
  double get temperature;

  /// Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
  @BuiltValueField(wireName: r'avg_logprob')
  double get avgLogprob;

  /// Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
  @BuiltValueField(wireName: r'compression_ratio')
  double get compressionRatio;

  /// Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
  @BuiltValueField(wireName: r'no_speech_prob')
  double get noSpeechProb;

  TranscriptionSegment._();

  factory TranscriptionSegment([void updates(TranscriptionSegmentBuilder b)]) = _$TranscriptionSegment;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TranscriptionSegmentBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TranscriptionSegment> get serializer => _$TranscriptionSegmentSerializer();
}

class _$TranscriptionSegmentSerializer implements PrimitiveSerializer<TranscriptionSegment> {
  @override
  final Iterable<Type> types = const [TranscriptionSegment, _$TranscriptionSegment];

  @override
  final String wireName = r'TranscriptionSegment';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TranscriptionSegment object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'seek';
    yield serializers.serialize(
      object.seek,
      specifiedType: const FullType(int),
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
    yield r'text';
    yield serializers.serialize(
      object.text,
      specifiedType: const FullType(String),
    );
    yield r'tokens';
    yield serializers.serialize(
      object.tokens,
      specifiedType: const FullType(BuiltList, [FullType(int)]),
    );
    yield r'temperature';
    yield serializers.serialize(
      object.temperature,
      specifiedType: const FullType(double),
    );
    yield r'avg_logprob';
    yield serializers.serialize(
      object.avgLogprob,
      specifiedType: const FullType(double),
    );
    yield r'compression_ratio';
    yield serializers.serialize(
      object.compressionRatio,
      specifiedType: const FullType(double),
    );
    yield r'no_speech_prob';
    yield serializers.serialize(
      object.noSpeechProb,
      specifiedType: const FullType(double),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TranscriptionSegment object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TranscriptionSegmentBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'seek':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.seek = valueDes;
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
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        case r'tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(int)]),
          ) as BuiltList<int>;
          result.tokens.replace(valueDes);
          break;
        case r'temperature':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(double),
          ) as double;
          result.temperature = valueDes;
          break;
        case r'avg_logprob':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(double),
          ) as double;
          result.avgLogprob = valueDes;
          break;
        case r'compression_ratio':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(double),
          ) as double;
          result.compressionRatio = valueDes;
          break;
        case r'no_speech_prob':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(double),
          ) as double;
          result.noSpeechProb = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TranscriptionSegment deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TranscriptionSegmentBuilder();
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

