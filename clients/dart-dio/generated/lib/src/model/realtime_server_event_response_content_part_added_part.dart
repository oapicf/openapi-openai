//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_server_event_response_content_part_added_part.g.dart';

/// The content part that was added.
///
/// Properties:
/// * [type] - The content type (\"text\", \"audio\").
/// * [text] - The text content (if type is \"text\").
/// * [audio] - Base64-encoded audio data (if type is \"audio\").
/// * [transcript] - The transcript of the audio (if type is \"audio\").
@BuiltValue()
abstract class RealtimeServerEventResponseContentPartAddedPart implements Built<RealtimeServerEventResponseContentPartAddedPart, RealtimeServerEventResponseContentPartAddedPartBuilder> {
  /// The content type (\"text\", \"audio\").
  @BuiltValueField(wireName: r'type')
  RealtimeServerEventResponseContentPartAddedPartTypeEnum? get type;
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

  RealtimeServerEventResponseContentPartAddedPart._();

  factory RealtimeServerEventResponseContentPartAddedPart([void updates(RealtimeServerEventResponseContentPartAddedPartBuilder b)]) = _$RealtimeServerEventResponseContentPartAddedPart;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeServerEventResponseContentPartAddedPartBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeServerEventResponseContentPartAddedPart> get serializer => _$RealtimeServerEventResponseContentPartAddedPartSerializer();
}

class _$RealtimeServerEventResponseContentPartAddedPartSerializer implements PrimitiveSerializer<RealtimeServerEventResponseContentPartAddedPart> {
  @override
  final Iterable<Type> types = const [RealtimeServerEventResponseContentPartAddedPart, _$RealtimeServerEventResponseContentPartAddedPart];

  @override
  final String wireName = r'RealtimeServerEventResponseContentPartAddedPart';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeServerEventResponseContentPartAddedPart object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(RealtimeServerEventResponseContentPartAddedPartTypeEnum),
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
    RealtimeServerEventResponseContentPartAddedPart object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeServerEventResponseContentPartAddedPartBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeServerEventResponseContentPartAddedPartTypeEnum),
          ) as RealtimeServerEventResponseContentPartAddedPartTypeEnum;
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
  RealtimeServerEventResponseContentPartAddedPart deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeServerEventResponseContentPartAddedPartBuilder();
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

class RealtimeServerEventResponseContentPartAddedPartTypeEnum extends EnumClass {

  /// The content type (\"text\", \"audio\").
  @BuiltValueEnumConst(wireName: r'audio')
  static const RealtimeServerEventResponseContentPartAddedPartTypeEnum audio = _$realtimeServerEventResponseContentPartAddedPartTypeEnum_audio;
  /// The content type (\"text\", \"audio\").
  @BuiltValueEnumConst(wireName: r'text')
  static const RealtimeServerEventResponseContentPartAddedPartTypeEnum text = _$realtimeServerEventResponseContentPartAddedPartTypeEnum_text;

  static Serializer<RealtimeServerEventResponseContentPartAddedPartTypeEnum> get serializer => _$realtimeServerEventResponseContentPartAddedPartTypeEnumSerializer;

  const RealtimeServerEventResponseContentPartAddedPartTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeServerEventResponseContentPartAddedPartTypeEnum> get values => _$realtimeServerEventResponseContentPartAddedPartTypeEnumValues;
  static RealtimeServerEventResponseContentPartAddedPartTypeEnum valueOf(String name) => _$realtimeServerEventResponseContentPartAddedPartTypeEnumValueOf(name);
}

