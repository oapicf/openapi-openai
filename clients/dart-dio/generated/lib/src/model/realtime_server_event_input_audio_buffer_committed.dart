//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_input_audio_buffer_committed.g.dart';

/// Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `input_audio_buffer.committed`.
/// * [previousItemId] - The ID of the preceding item after which the new item will be inserted. 
/// * [itemId] - The ID of the user message item that will be created.
@BuiltValue()
abstract class RealtimeServerEventInputAudioBufferCommitted implements Built<RealtimeServerEventInputAudioBufferCommitted, RealtimeServerEventInputAudioBufferCommittedBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `input_audio_buffer.committed`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventInputAudioBufferCommittedTypeEnum get type;
  // enum typeEnum {  input_audio_buffer.committed,  };

  /// The ID of the preceding item after which the new item will be inserted. 
  @BuiltValueField(wireName: r'previous_item_id')
  String get previousItemId;

  /// The ID of the user message item that will be created.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  RealtimeServerEventInputAudioBufferCommitted._();

  factory RealtimeServerEventInputAudioBufferCommitted([void updates(RealtimeServerEventInputAudioBufferCommittedBuilder b)]) = _$RealtimeServerEventInputAudioBufferCommitted;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventInputAudioBufferCommittedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventInputAudioBufferCommitted> get serializer => _$RealtimeServerEventInputAudioBufferCommittedSerializer();
}

class _$RealtimeServerEventInputAudioBufferCommittedSerializer implements PrimitiveSerializer<RealtimeServerEventInputAudioBufferCommitted> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventInputAudioBufferCommitted, _$RealtimeServerEventInputAudioBufferCommitted];

  @override
  final String wireName = r'RealtimeServerEventInputAudioBufferCommitted';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventInputAudioBufferCommitted object, {
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
      specifiedType: const FullType(RealtimeServerEventInputAudioBufferCommittedTypeEnum),
    );
    yield r'previous_item_id';
    yield serializers.serialize(
      object.previousItemId,
      specifiedType: const FullType(String),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventInputAudioBufferCommitted object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventInputAudioBufferCommittedBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventInputAudioBufferCommittedTypeEnum),
          ) as RealtimeServerEventInputAudioBufferCommittedTypeEnum;
          result.type = valueDes;
          break;
        case r'previous_item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.previousItemId = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventInputAudioBufferCommitted deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventInputAudioBufferCommittedBuilder();
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

class RealtimeServerEventInputAudioBufferCommittedTypeEnum extends EnumClass {

  /// The event type, must be `input_audio_buffer.committed`.
  @BuiltValueEnumConst(wireName: r'input_audio_buffer.committed')
  static const RealtimeServerEventInputAudioBufferCommittedTypeEnum inputAudioBufferPeriodCommitted = _$realtimeServerEventInputAudioBufferCommittedTypeEnum_inputAudioBufferPeriodCommitted;

  static Serializer<RealtimeServerEventInputAudioBufferCommittedTypeEnum> get serializer => _$realtimeServerEventInputAudioBufferCommittedTypeEnumSerializer;

  const RealtimeServerEventInputAudioBufferCommittedTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventInputAudioBufferCommittedTypeEnum> get values => _$realtimeServerEventInputAudioBufferCommittedTypeEnumValues;
  static RealtimeServerEventInputAudioBufferCommittedTypeEnum valueOf(String name) => _$realtimeServerEventInputAudioBufferCommittedTypeEnumValueOf(name);
}

