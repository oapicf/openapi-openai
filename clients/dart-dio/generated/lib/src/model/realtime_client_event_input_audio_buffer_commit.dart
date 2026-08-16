//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_client_event_input_audio_buffer_commit.g.dart';

/// Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
///
/// Properties:
/// * [eventId] - Optional client-generated ID used to identify this event.
/// * [type] - The event type, must be `input_audio_buffer.commit`.
@BuiltValue()
abstract class RealtimeClientEventInputAudioBufferCommit implements Built<RealtimeClientEventInputAudioBufferCommit, RealtimeClientEventInputAudioBufferCommitBuilder> {
  /// Optional client-generated ID used to identify this event.
  @BuiltValueField(wireName: r'event_id')
  String? get eventId;

  /// The event type, must be `input_audio_buffer.commit`.
  @BuiltValueField(wireName: r'type')
  RealtimeClientEventInputAudioBufferCommitTypeEnum get type;
  // enum typeEnum {  input_audio_buffer.commit,  };

  RealtimeClientEventInputAudioBufferCommit._();

  factory RealtimeClientEventInputAudioBufferCommit([void updates(RealtimeClientEventInputAudioBufferCommitBuilder b)]) = _$RealtimeClientEventInputAudioBufferCommit;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeClientEventInputAudioBufferCommitBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeClientEventInputAudioBufferCommit> get serializer => _$RealtimeClientEventInputAudioBufferCommitSerializer();
}

class _$RealtimeClientEventInputAudioBufferCommitSerializer implements PrimitiveSerializer<RealtimeClientEventInputAudioBufferCommit> {
  @override
  final Iterable<Type> types = const [RealtimeClientEventInputAudioBufferCommit, _$RealtimeClientEventInputAudioBufferCommit];

  @override
  final String wireName = r'RealtimeClientEventInputAudioBufferCommit';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeClientEventInputAudioBufferCommit object, {
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
      specifiedType: const FullType(RealtimeClientEventInputAudioBufferCommitTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeClientEventInputAudioBufferCommit object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeClientEventInputAudioBufferCommitBuilder result,
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
            specifiedType: const FullType(RealtimeClientEventInputAudioBufferCommitTypeEnum),
          ) as RealtimeClientEventInputAudioBufferCommitTypeEnum;
          result.type = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeClientEventInputAudioBufferCommit deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeClientEventInputAudioBufferCommitBuilder();
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

class RealtimeClientEventInputAudioBufferCommitTypeEnum extends EnumClass {

  /// The event type, must be `input_audio_buffer.commit`.
  @BuiltValueEnumConst(wireName: r'input_audio_buffer.commit')
  static const RealtimeClientEventInputAudioBufferCommitTypeEnum inputAudioBufferPeriodCommit = _$realtimeClientEventInputAudioBufferCommitTypeEnum_inputAudioBufferPeriodCommit;

  static Serializer<RealtimeClientEventInputAudioBufferCommitTypeEnum> get serializer => _$realtimeClientEventInputAudioBufferCommitTypeEnumSerializer;

  const RealtimeClientEventInputAudioBufferCommitTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeClientEventInputAudioBufferCommitTypeEnum> get values => _$realtimeClientEventInputAudioBufferCommitTypeEnumValues;
  static RealtimeClientEventInputAudioBufferCommitTypeEnum valueOf(String name) => _$realtimeClientEventInputAudioBufferCommitTypeEnumValueOf(name);
}

