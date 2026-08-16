//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_client_event_input_audio_buffer_clear.g.dart';

/// Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
///
/// Properties:
/// * [eventId] - Optional client-generated ID used to identify this event.
/// * [type] - The event type, must be `input_audio_buffer.clear`.
@BuiltValue()
abstract class RealtimeClientEventInputAudioBufferClear implements Built<RealtimeClientEventInputAudioBufferClear, RealtimeClientEventInputAudioBufferClearBuilder> {
  /// Optional client-generated ID used to identify this event.
  @BuiltValueField(wireName: r'event_id')
  String? get eventId;

  /// The event type, must be `input_audio_buffer.clear`.
  @BuiltValueField(wireName: r'type')
  RealtimeClientEventInputAudioBufferClearTypeEnum get type;
  // enum typeEnum {  input_audio_buffer.clear,  };

  RealtimeClientEventInputAudioBufferClear._();

  factory RealtimeClientEventInputAudioBufferClear([void updates(RealtimeClientEventInputAudioBufferClearBuilder b)]) = _$RealtimeClientEventInputAudioBufferClear;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeClientEventInputAudioBufferClearBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeClientEventInputAudioBufferClear> get serializer => _$RealtimeClientEventInputAudioBufferClearSerializer();
}

class _$RealtimeClientEventInputAudioBufferClearSerializer implements PrimitiveSerializer<RealtimeClientEventInputAudioBufferClear> {
  @override
  final Iterable<Type> types = const [RealtimeClientEventInputAudioBufferClear, _$RealtimeClientEventInputAudioBufferClear];

  @override
  final String wireName = r'RealtimeClientEventInputAudioBufferClear';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeClientEventInputAudioBufferClear object, {
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
      specifiedType: const FullType(RealtimeClientEventInputAudioBufferClearTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeClientEventInputAudioBufferClear object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeClientEventInputAudioBufferClearBuilder result,
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
            specifiedType: const FullType(RealtimeClientEventInputAudioBufferClearTypeEnum),
          ) as RealtimeClientEventInputAudioBufferClearTypeEnum;
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
  RealtimeClientEventInputAudioBufferClear deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeClientEventInputAudioBufferClearBuilder();
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

class RealtimeClientEventInputAudioBufferClearTypeEnum extends EnumClass {

  /// The event type, must be `input_audio_buffer.clear`.
  @BuiltValueEnumConst(wireName: r'input_audio_buffer.clear')
  static const RealtimeClientEventInputAudioBufferClearTypeEnum inputAudioBufferPeriodClear = _$realtimeClientEventInputAudioBufferClearTypeEnum_inputAudioBufferPeriodClear;

  static Serializer<RealtimeClientEventInputAudioBufferClearTypeEnum> get serializer => _$realtimeClientEventInputAudioBufferClearTypeEnumSerializer;

  const RealtimeClientEventInputAudioBufferClearTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeClientEventInputAudioBufferClearTypeEnum> get values => _$realtimeClientEventInputAudioBufferClearTypeEnumValues;
  static RealtimeClientEventInputAudioBufferClearTypeEnum valueOf(String name) => _$realtimeClientEventInputAudioBufferClearTypeEnumValueOf(name);
}

