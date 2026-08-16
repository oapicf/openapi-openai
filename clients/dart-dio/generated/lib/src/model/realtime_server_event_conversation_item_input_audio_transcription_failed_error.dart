//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_conversation_item_input_audio_transcription_failed_error.g.dart';

/// Details of the transcription error.
///
/// Properties:
/// * [type] - The type of error.
/// * [code] - Error code, if any.
/// * [message] - A human-readable error message.
/// * [param] - Parameter related to the error, if any.
@BuiltValue()
abstract class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError implements Built<RealtimeServerEventConversationItemInputAudioTranscriptionFailedError, RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorBuilder> {
  /// The type of error.
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Error code, if any.
  @BuiltValueField(wireName: r'code')
  String? get code;

  /// A human-readable error message.
  @BuiltValueField(wireName: r'message')
  String? get message;

  /// Parameter related to the error, if any.
  @BuiltValueField(wireName: r'param')
  String? get param;

  RealtimeServerEventConversationItemInputAudioTranscriptionFailedError._();

  factory RealtimeServerEventConversationItemInputAudioTranscriptionFailedError([void updates(RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorBuilder b)]) = _$RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventConversationItemInputAudioTranscriptionFailedError> get serializer => _$RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorSerializer();
}

class _$RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorSerializer implements PrimitiveSerializer<RealtimeServerEventConversationItemInputAudioTranscriptionFailedError> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventConversationItemInputAudioTranscriptionFailedError, _$RealtimeServerEventConversationItemInputAudioTranscriptionFailedError];

  @override
  final String wireName = r'RealtimeServerEventConversationItemInputAudioTranscriptionFailedError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventConversationItemInputAudioTranscriptionFailedError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(String),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
    if (object.param != null) {
      yield r'param';
      yield serializers.serialize(
        object.param,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventConversationItemInputAudioTranscriptionFailedError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.type = valueDes;
          break;
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        case r'param':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.param = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventConversationItemInputAudioTranscriptionFailedError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorBuilder();
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

