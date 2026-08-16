//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_content_part_done_part.g.dart';

/// The content part that is done.
///
/// Properties:
/// * [type] - The content type (\"text\", \"audio\").
/// * [text] - The text content (if type is \"text\").
/// * [audio] - Base64-encoded audio data (if type is \"audio\").
/// * [transcript] - The transcript of the audio (if type is \"audio\").
@BuiltValue()
abstract class RealtimeServerEventResponseContentPartDonePart implements Built<RealtimeServerEventResponseContentPartDonePart, RealtimeServerEventResponseContentPartDonePartBuilder> {
  /// The content type (\"text\", \"audio\").
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseContentPartDonePartTypeEnum? get type;
  // enum typeEnum {  audio,  text,  };

  /// The text content (if type is \"text\").
  @BuiltValueField(wireName: r'text')
  String? get text;

  /// Base64-encoded audio data (if type is \"audio\").
  @BuiltValueField(wireName: r'audio')
  String? get audio;

  /// The transcript of the audio (if type is \"audio\").
  @BuiltValueField(wireName: r'transcript')
  String? get transcript;

  RealtimeServerEventResponseContentPartDonePart._();

  factory RealtimeServerEventResponseContentPartDonePart([void updates(RealtimeServerEventResponseContentPartDonePartBuilder b)]) = _$RealtimeServerEventResponseContentPartDonePart;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseContentPartDonePartBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseContentPartDonePart> get serializer => _$RealtimeServerEventResponseContentPartDonePartSerializer();
}

class _$RealtimeServerEventResponseContentPartDonePartSerializer implements PrimitiveSerializer<RealtimeServerEventResponseContentPartDonePart> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseContentPartDonePart, _$RealtimeServerEventResponseContentPartDonePart];

  @override
  final String wireName = r'RealtimeServerEventResponseContentPartDonePart';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseContentPartDonePart object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(RealtimeServerEventResponseContentPartDonePartTypeEnum),
      );
    }
    if (object.text != null) {
      yield r'text';
      yield serializers.serialize(
        object.text,
        specifiedType: const FullType(String),
      );
    }
    if (object.audio != null) {
      yield r'audio';
      yield serializers.serialize(
        object.audio,
        specifiedType: const FullType(String),
      );
    }
    if (object.transcript != null) {
      yield r'transcript';
      yield serializers.serialize(
        object.transcript,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RealtimeServerEventResponseContentPartDonePart object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseContentPartDonePartBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeServerEventResponseContentPartDonePartTypeEnum),
          ) as RealtimeServerEventResponseContentPartDonePartTypeEnum;
          result.type = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        case r'audio':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.audio = valueDes;
          break;
        case r'transcript':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.transcript = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RealtimeServerEventResponseContentPartDonePart deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseContentPartDonePartBuilder();
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

class RealtimeServerEventResponseContentPartDonePartTypeEnum extends EnumClass {

  /// The content type (\"text\", \"audio\").
  @BuiltValueEnumConst(wireName: r'audio')
  static const RealtimeServerEventResponseContentPartDonePartTypeEnum audio = _$realtimeServerEventResponseContentPartDonePartTypeEnum_audio;
  /// The content type (\"text\", \"audio\").
  @BuiltValueEnumConst(wireName: r'text')
  static const RealtimeServerEventResponseContentPartDonePartTypeEnum text = _$realtimeServerEventResponseContentPartDonePartTypeEnum_text;

  static Serializer<RealtimeServerEventResponseContentPartDonePartTypeEnum> get serializer => _$realtimeServerEventResponseContentPartDonePartTypeEnumSerializer;

  const RealtimeServerEventResponseContentPartDonePartTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseContentPartDonePartTypeEnum> get values => _$realtimeServerEventResponseContentPartDonePartTypeEnumValues;
  static RealtimeServerEventResponseContentPartDonePartTypeEnum valueOf(String name) => _$realtimeServerEventResponseContentPartDonePartTypeEnumValueOf(name);
}

