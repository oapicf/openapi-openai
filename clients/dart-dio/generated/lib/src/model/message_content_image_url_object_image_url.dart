//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'message_content_image_url_object_image_url.g.dart';

/// MessageContentImageUrlObjectImageUrl
///
/// Properties:
/// * [url] - The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
/// * [detail] - Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
@BuiltValue()
abstract class MessageContentImageUrlObjectImageUrl implements Built<MessageContentImageUrlObjectImageUrl, MessageContentImageUrlObjectImageUrlBuilder> {
  /// The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
  @BuiltValueField(wireName: r'url')
  String get url;

  /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
  @BuiltValueField(wireName: r'detail')
  MessageContentImageUrlObjectImageUrlDetailEnum? get detail;
  // enum detailEnum {  auto,  low,  high,  };

  MessageContentImageUrlObjectImageUrl._();

  factory MessageContentImageUrlObjectImageUrl([void updates(MessageContentImageUrlObjectImageUrlBuilder b)]) = _$MessageContentImageUrlObjectImageUrl;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MessageContentImageUrlObjectImageUrlBuilder b) => b
      ..detail = MessageContentImageUrlObjectImageUrlDetailEnum.valueOf('auto');

  @BuiltValueSerializer(custom: true)
  static Serializer<MessageContentImageUrlObjectImageUrl> get serializer => _$MessageContentImageUrlObjectImageUrlSerializer();
}

class _$MessageContentImageUrlObjectImageUrlSerializer implements PrimitiveSerializer<MessageContentImageUrlObjectImageUrl> {
  @override
  final Iterable<Type> types = const [MessageContentImageUrlObjectImageUrl, _$MessageContentImageUrlObjectImageUrl];

  @override
  final String wireName = r'MessageContentImageUrlObjectImageUrl';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MessageContentImageUrlObjectImageUrl object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
    if (object.detail != null) {
      yield r'detail';
      yield serializers.serialize(
        object.detail,
        specifiedType: const FullType(MessageContentImageUrlObjectImageUrlDetailEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MessageContentImageUrlObjectImageUrl object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MessageContentImageUrlObjectImageUrlBuilder result,
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
            specifiedType: const FullType(MessageContentImageUrlObjectImageUrlDetailEnum),
          ) as MessageContentImageUrlObjectImageUrlDetailEnum;
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
  MessageContentImageUrlObjectImageUrl deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MessageContentImageUrlObjectImageUrlBuilder();
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

class MessageContentImageUrlObjectImageUrlDetailEnum extends EnumClass {

  /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
  @BuiltValueEnumConst(wireName: r'auto')
  static const MessageContentImageUrlObjectImageUrlDetailEnum auto = _$messageContentImageUrlObjectImageUrlDetailEnum_auto;
  /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
  @BuiltValueEnumConst(wireName: r'low')
  static const MessageContentImageUrlObjectImageUrlDetailEnum low = _$messageContentImageUrlObjectImageUrlDetailEnum_low;
  /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
  @BuiltValueEnumConst(wireName: r'high')
  static const MessageContentImageUrlObjectImageUrlDetailEnum high = _$messageContentImageUrlObjectImageUrlDetailEnum_high;

  static Serializer<MessageContentImageUrlObjectImageUrlDetailEnum> get serializer => _$messageContentImageUrlObjectImageUrlDetailEnumSerializer;

  const MessageContentImageUrlObjectImageUrlDetailEnum._(String name): super(name);

  static BuiltSet<MessageContentImageUrlObjectImageUrlDetailEnum> get values => _$messageContentImageUrlObjectImageUrlDetailEnumValues;
  static MessageContentImageUrlObjectImageUrlDetailEnum valueOf(String name) => _$messageContentImageUrlObjectImageUrlDetailEnumValueOf(name);
}

