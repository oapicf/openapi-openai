//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_input_audio_buffer_cleared.g.dart';

/// Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `input_audio_buffer.cleared`.
@BuiltValue()
abstract class RealtimeServerEventInputAudioBufferCleared implements Built<RealtimeServerEventInputAudioBufferCleared, RealtimeServerEventInputAudioBufferClearedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `input_audio_buffer.cleared`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventInputAudioBufferClearedTypeEnum get type;
  // enum typeEnum {  input_audio_buffer.cleared,  };

  RealtimeServerEventInputAudioBufferCleared._();

  factory RealtimeServerEventInputAudioBufferCleared([void updates(RealtimeServerEventInputAudioBufferClearedBuilder b)]) = _$RealtimeServerEventInputAudioBufferCleared;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventInputAudioBufferClearedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventInputAudioBufferCleared> get serializer => _$RealtimeServerEventInputAudioBufferClearedSerializer();
}

class _$RealtimeServerEventInputAudioBufferClearedSerializer implements PrimitiveSerializer<RealtimeServerEventInputAudioBufferCleared> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventInputAudioBufferCleared, _$RealtimeServerEventInputAudioBufferCleared];

  @override
  final String wireName = r'RealtimeServerEventInputAudioBufferCleared';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventInputAudioBufferCleared object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'event_id';
    yield serializers.serialize(
      object.eventId,
      specifiedType: const FullType(String),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RealtimeServerEventInputAudioBufferClearedTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventInputAudioBufferCleared object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventInputAudioBufferClearedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventInputAudioBufferClearedTypeEnum),
          ) as RealtimeServerEventInputAudioBufferClearedTypeEnum;
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
  RealtimeServerEventInputAudioBufferCleared deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventInputAudioBufferClearedBuilder();
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

class RealtimeServerEventInputAudioBufferClearedTypeEnum extends EnumClass {

  /// The event type, must be `input_audio_buffer.cleared`.
  @BuiltValueEnumConst(wireName: r'input_audio_buffer.cleared')
  static const RealtimeServerEventInputAudioBufferClearedTypeEnum inputAudioBufferPeriodCleared = _$realtimeServerEventInputAudioBufferClearedTypeEnum_inputAudioBufferPeriodCleared;

  static Serializer<RealtimeServerEventInputAudioBufferClearedTypeEnum> get serializer => _$realtimeServerEventInputAudioBufferClearedTypeEnumSerializer;

  const RealtimeServerEventInputAudioBufferClearedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventInputAudioBufferClearedTypeEnum> get values => _$realtimeServerEventInputAudioBufferClearedTypeEnumValues;
  static RealtimeServerEventInputAudioBufferClearedTypeEnum valueOf(String name) => _$realtimeServerEventInputAudioBufferClearedTypeEnumValueOf(name);
}

