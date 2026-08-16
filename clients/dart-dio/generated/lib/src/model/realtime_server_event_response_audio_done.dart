//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_audio_done.g.dart';

/// Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 
///
/// Properties:
/// * [eventId] - The unique ID of the server event.
/// * [type] - The event type, must be `response.audio.done`.
/// * [responseId] - The ID of the response.
/// * [itemId] - The ID of the item.
/// * [outputIndex] - The index of the output item in the response.
/// * [contentIndex] - The index of the content part in the item's content array.
@BuiltValue()
abstract class RealtimeServerEventResponseAudioDone implements Built<RealtimeServerEventResponseAudioDone, RealtimeServerEventResponseAudioDoneBuilder> {
  /// The unique ID of the server event.
  @BuiltValueField(wireName: r'event_id')
  String get eventId;

  /// The event type, must be `response.audio.done`.
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseAudioDoneTypeEnum get type;
  // enum typeEnum {  response.audio.done,  };

  /// The ID of the response.
  @BuiltValueField(wireName: r'response_id')
  String get responseId;

  /// The ID of the item.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The index of the output item in the response.
  @BuiltValueField(wireName: r'output_index')
  int get outputIndex;

  /// The index of the content part in the item's content array.
  @BuiltValueField(wireName: r'content_index')
  int get contentIndex;

  RealtimeServerEventResponseAudioDone._();

  factory RealtimeServerEventResponseAudioDone([void updates(RealtimeServerEventResponseAudioDoneBuilder b)]) = _$RealtimeServerEventResponseAudioDone;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseAudioDoneBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseAudioDone> get serializer => _$RealtimeServerEventResponseAudioDoneSerializer();
}

class _$RealtimeServerEventResponseAudioDoneSerializer implements PrimitiveSerializer<RealtimeServerEventResponseAudioDone> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseAudioDone, _$RealtimeServerEventResponseAudioDone];

  @override
  final String wireName = r'RealtimeServerEventResponseAudioDone';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseAudioDone object, {
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
      specifiedType: const FullType(RealtimeServerEventResponseAudioDoneTypeEnum),
    );
    yield r'response_id';
    yield serializers.serialize(
      object.responseId,
      specifiedType: const FullType(String),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'output_index';
    yield serializers.serialize(
      object.outputIndex,
      specifiedType: const FullType(int),
    );
    yield r'content_index';
    yield serializers.serialize(
      object.contentIndex,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventResponseAudioDone object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseAudioDoneBuilder result,
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
            specifiedType: const FullType(RealtimeServerEventResponseAudioDoneTypeEnum),
          ) as RealtimeServerEventResponseAudioDoneTypeEnum;
          result.type = valueDes;
          break;
        case r'response_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.responseId = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'output_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.outputIndex = valueDes;
          break;
        case r'content_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.contentIndex = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventResponseAudioDone deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseAudioDoneBuilder();
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

class RealtimeServerEventResponseAudioDoneTypeEnum extends EnumClass {

  /// The event type, must be `response.audio.done`.
  @BuiltValueEnumConst(wireName: r'response.audio.done')
  static const RealtimeServerEventResponseAudioDoneTypeEnum responsePeriodAudioPeriodDone = _$realtimeServerEventResponseAudioDoneTypeEnum_responsePeriodAudioPeriodDone;

  static Serializer<RealtimeServerEventResponseAudioDoneTypeEnum> get serializer => _$realtimeServerEventResponseAudioDoneTypeEnumSerializer;

  const RealtimeServerEventResponseAudioDoneTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseAudioDoneTypeEnum> get values => _$realtimeServerEventResponseAudioDoneTypeEnumValues;
  static RealtimeServerEventResponseAudioDoneTypeEnum valueOf(String name) => _$realtimeServerEventResponseAudioDoneTypeEnumValueOf(name);
}

