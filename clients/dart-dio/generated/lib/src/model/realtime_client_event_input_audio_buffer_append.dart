//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_client_event_input_audio_buffer_append.g.dart';

/// Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
///
/// Properties:
/// * [eventId] - Optional client-generated ID used to identify this event.
/// * [type] - The event type, must be `input_audio_buffer.append`.
/// * [audio] - Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
@BuiltValue()
abstract class RealtimeClientEventInputAudioBufferAppend implements Built<RealtimeClientEventInputAudioBufferAppend, RealtimeClientEventInputAudioBufferAppendBuilder> {
  /// Optional client-generated ID used to identify this event.
  @BuiltValueField(wireName: r'event_id')
  String? get eventId;

  /// The event type, must be `input_audio_buffer.append`.
  @BuiltValueField(wireName: r'type')
  RealtimeClientEventInputAudioBufferAppendTypeEnum get type;
  // enum typeEnum {  input_audio_buffer.append,  };

  /// Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
  @BuiltValueField(wireName: r'audio')
  String get audio;

  RealtimeClientEventInputAudioBufferAppend._();

  factory RealtimeClientEventInputAudioBufferAppend([void updates(RealtimeClientEventInputAudioBufferAppendBuilder b)]) = _$RealtimeClientEventInputAudioBufferAppend;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeClientEventInputAudioBufferAppendBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeClientEventInputAudioBufferAppend> get serializer => _$RealtimeClientEventInputAudioBufferAppendSerializer();
}

class _$RealtimeClientEventInputAudioBufferAppendSerializer implements PrimitiveSerializer<RealtimeClientEventInputAudioBufferAppend> {
  @override
  final Iterable<Type> types = const [RealtimeClientEventInputAudioBufferAppend, _$RealtimeClientEventInputAudioBufferAppend];

  @override
  final String wireName = r'RealtimeClientEventInputAudioBufferAppend';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeClientEventInputAudioBufferAppend object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventId != null) {
      yield r'event_id';
      yield serializers.serialize(
        object.eventId,
        specifiedType: const FullType(String),
      );
    }
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RealtimeClientEventInputAudioBufferAppendTypeEnum),
    );
    yield r'audio';
    yield serializers.serialize(
      object.audio,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeClientEventInputAudioBufferAppend object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeClientEventInputAudioBufferAppendBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.eventId = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeClientEventInputAudioBufferAppendTypeEnum),
          ) as RealtimeClientEventInputAudioBufferAppendTypeEnum;
          result.type = valueDes;
          break;
        case r'audio':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.audio = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeClientEventInputAudioBufferAppend deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeClientEventInputAudioBufferAppendBuilder();
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

class RealtimeClientEventInputAudioBufferAppendTypeEnum extends EnumClass {

  /// The event type, must be `input_audio_buffer.append`.
  @BuiltValueEnumConst(wireName: r'input_audio_buffer.append')
  static const RealtimeClientEventInputAudioBufferAppendTypeEnum inputAudioBufferPeriodAppend = _$realtimeClientEventInputAudioBufferAppendTypeEnum_inputAudioBufferPeriodAppend;

  static Serializer<RealtimeClientEventInputAudioBufferAppendTypeEnum> get serializer => _$realtimeClientEventInputAudioBufferAppendTypeEnumSerializer;

  const RealtimeClientEventInputAudioBufferAppendTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeClientEventInputAudioBufferAppendTypeEnum> get values => _$realtimeClientEventInputAudioBufferAppendTypeEnumValues;
  static RealtimeClientEventInputAudioBufferAppendTypeEnum valueOf(String name) => _$realtimeClientEventInputAudioBufferAppendTypeEnumValueOf(name);
}

