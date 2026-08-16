//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realtime_conversation_item_content_inner.g.dart';

/// RealtimeConversationItemContentInner
///
/// Properties:
/// * [type] - The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
/// * [text] - The text content, used for `input_text` and `text` content types. 
/// * [id] - ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
/// * [audio] - Base64-encoded audio bytes, used for `input_audio` content type. 
/// * [transcript] - The transcript of the audio, used for `input_audio` content type. 
@BuiltValue()
abstract class RealtimeConversationItemContentInner implements Built<RealtimeConversationItemContentInner, RealtimeConversationItemContentInnerBuilder> {
  /// The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
  @BuiltValueField(wireName: r'type')
  RealtimeConversationItemContentInnerTypeEnum? get type;
  // enum typeEnum {  input_audio,  input_text,  item_reference,  text,  };

  /// The text content, used for `input_text` and `text` content types. 
  @BuiltValueField(wireName: r'text')
  String? get text;

  /// ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Base64-encoded audio bytes, used for `input_audio` content type. 
  @BuiltValueField(wireName: r'audio')
  String? get audio;

  /// The transcript of the audio, used for `input_audio` content type. 
  @BuiltValueField(wireName: r'transcript')
  String? get transcript;

  RealtimeConversationItemContentInner._();

  factory RealtimeConversationItemContentInner([void updates(RealtimeConversationItemContentInnerBuilder b)]) = _$RealtimeConversationItemContentInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RealtimeConversationItemContentInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RealtimeConversationItemContentInner> get serializer => _$RealtimeConversationItemContentInnerSerializer();
}

class _$RealtimeConversationItemContentInnerSerializer implements PrimitiveSerializer<RealtimeConversationItemContentInner> {
  @override
  final Iterable<Type> types = const [RealtimeConversationItemContentInner, _$RealtimeConversationItemContentInner];

  @override
  final String wireName = r'RealtimeConversationItemContentInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RealtimeConversationItemContentInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(RealtimeConversationItemContentInnerTypeEnum),
      );
    }
    if (object.text != null) {
      yield r'text';
      yield serializers.serialize(
        object.text,
        specifiedType: const FullType(String),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
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
    RealtimeConversationItemContentInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RealtimeConversationItemContentInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RealtimeConversationItemContentInnerTypeEnum),
          ) as RealtimeConversationItemContentInnerTypeEnum;
          result.type = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
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
  RealtimeConversationItemContentInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RealtimeConversationItemContentInnerBuilder();
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

class RealtimeConversationItemContentInnerTypeEnum extends EnumClass {

  /// The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
  @BuiltValueEnumConst(wireName: r'input_audio')
  static const RealtimeConversationItemContentInnerTypeEnum inputAudio = _$realtimeConversationItemContentInnerTypeEnum_inputAudio;
  /// The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
  @BuiltValueEnumConst(wireName: r'input_text')
  static const RealtimeConversationItemContentInnerTypeEnum inputText = _$realtimeConversationItemContentInnerTypeEnum_inputText;
  /// The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
  @BuiltValueEnumConst(wireName: r'item_reference')
  static const RealtimeConversationItemContentInnerTypeEnum itemReference = _$realtimeConversationItemContentInnerTypeEnum_itemReference;
  /// The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
  @BuiltValueEnumConst(wireName: r'text')
  static const RealtimeConversationItemContentInnerTypeEnum text = _$realtimeConversationItemContentInnerTypeEnum_text;

  static Serializer<RealtimeConversationItemContentInnerTypeEnum> get serializer => _$realtimeConversationItemContentInnerTypeEnumSerializer;

  const RealtimeConversationItemContentInnerTypeEnum._(String name): super(name);

  static BuiltSet<RealtimeConversationItemContentInnerTypeEnum> get values => _$realtimeConversationItemContentInnerTypeEnumValues;
  static RealtimeConversationItemContentInnerTypeEnum valueOf(String name) => _$realtimeConversationItemContentInnerTypeEnumValueOf(name);
}

