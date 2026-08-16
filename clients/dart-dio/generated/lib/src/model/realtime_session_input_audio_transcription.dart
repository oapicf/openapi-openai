//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_session_input_audio_transcription.g.dart';

/// Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
///
/// Properties:
/// * [model] - The model to use for transcription, `whisper-1` is the only currently  supported model. 
@BuiltValue()
abstract class RealtimeSessionInputAudioTranscription implements Built<RealtimeSessionInputAudioTranscription, RealtimeSessionInputAudioTranscriptionBuilder> {
  /// The model to use for transcription, `whisper-1` is the only currently  supported model. 
  @BuiltValueField(wireName: r'model')
  String? get model;

  RealtimeSessionInputAudioTranscription._();

  factory RealtimeSessionInputAudioTranscription([void updates(RealtimeSessionInputAudioTranscriptionBuilder b)]) = _$RealtimeSessionInputAudioTranscription;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeSessionInputAudioTranscriptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeSessionInputAudioTranscription> get serializer => _$RealtimeSessionInputAudioTranscriptionSerializer();
}

class _$RealtimeSessionInputAudioTranscriptionSerializer implements PrimitiveSerializer<RealtimeSessionInputAudioTranscription> {
  @override
  final Iterable<Type> types = const [RealtimeSessionInputAudioTranscription, _$RealtimeSessionInputAudioTranscription];

  @override
  final String wireName = r'RealtimeSessionInputAudioTranscription';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeSessionInputAudioTranscription object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.model != null) {
      yield r'model';
      yield serializers.serialize(
        object.model,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeSessionInputAudioTranscription object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeSessionInputAudioTranscriptionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.model = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeSessionInputAudioTranscription deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeSessionInputAudioTranscriptionBuilder();
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

