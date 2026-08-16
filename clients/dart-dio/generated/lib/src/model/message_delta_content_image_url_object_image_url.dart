//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_delta_content_image_url_object_image_url.g.dart';

/// MessageDeltaContentImageUrlObjectImageUrl
///
/// Properties:
/// * [url] - The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
/// * [detail] - Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
@BuiltValue()
abstract class MessageDeltaContentImageUrlObjectImageUrl implements Built<MessageDeltaContentImageUrlObjectImageUrl, MessageDeltaContentImageUrlObjectImageUrlBuilder> {
  /// The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
  @BuiltValueField(wireName: r'url')
  String? get url;

  /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueField(wireName: r'detail')
  MessageDeltaContentImageUrlObjectImageUrlDetailEnum? get detail;
  // enum detailEnum {  auto,  low,  high,  };

  MessageDeltaContentImageUrlObjectImageUrl._();

  factory MessageDeltaContentImageUrlObjectImageUrl([void updates(MessageDeltaContentImageUrlObjectImageUrlBuilder b)]) = _$MessageDeltaContentImageUrlObjectImageUrl;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageDeltaContentImageUrlObjectImageUrlBuilder b) => b
      ..detail = MessageDeltaContentImageUrlObjectImageUrlDetailEnum.valueOf('auto');

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageDeltaContentImageUrlObjectImageUrl> get serializer => _$MessageDeltaContentImageUrlObjectImageUrlSerializer();
}

class _$MessageDeltaContentImageUrlObjectImageUrlSerializer implements PrimitiveSerializer<MessageDeltaContentImageUrlObjectImageUrl> {
  @override
  final Iterable<Type> types = const [MessageDeltaContentImageUrlObjectImageUrl, _$MessageDeltaContentImageUrlObjectImageUrl];

  @override
  final String wireName = r'MessageDeltaContentImageUrlObjectImageUrl';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageDeltaContentImageUrlObjectImageUrl object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType(String),
      );
    }
    if (object.detail != null) {
      yield r'detail';
      yield serializers.serialize(
        object.detail,
        specifiedType: const FullType(MessageDeltaContentImageUrlObjectImageUrlDetailEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageDeltaContentImageUrlObjectImageUrl object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageDeltaContentImageUrlObjectImageUrlBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        case r'detail':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MessageDeltaContentImageUrlObjectImageUrlDetailEnum),
          ) as MessageDeltaContentImageUrlObjectImageUrlDetailEnum;
          result.detail = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MessageDeltaContentImageUrlObjectImageUrl deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageDeltaContentImageUrlObjectImageUrlBuilder();
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

class MessageDeltaContentImageUrlObjectImageUrlDetailEnum extends EnumClass {

  /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueEnumConst(wireName: r'auto')
  static const MessageDeltaContentImageUrlObjectImageUrlDetailEnum auto = _$messageDeltaContentImageUrlObjectImageUrlDetailEnum_auto;
  /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueEnumConst(wireName: r'low')
  static const MessageDeltaContentImageUrlObjectImageUrlDetailEnum low = _$messageDeltaContentImageUrlObjectImageUrlDetailEnum_low;
  /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  @BuiltValueEnumConst(wireName: r'high')
  static const MessageDeltaContentImageUrlObjectImageUrlDetailEnum high = _$messageDeltaContentImageUrlObjectImageUrlDetailEnum_high;

  static Serializer<MessageDeltaContentImageUrlObjectImageUrlDetailEnum> get serializer => _$messageDeltaContentImageUrlObjectImageUrlDetailEnumSerializer;

  const MessageDeltaContentImageUrlObjectImageUrlDetailEnum._(String name): super(name);

  static BuiltSet<MessageDeltaContentImageUrlObjectImageUrlDetailEnum> get values => _$messageDeltaContentImageUrlObjectImageUrlDetailEnumValues;
  static MessageDeltaContentImageUrlObjectImageUrlDetailEnum valueOf(String name) => _$messageDeltaContentImageUrlObjectImageUrlDetailEnumValueOf(name);
}

