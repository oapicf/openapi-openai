//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_request_message_content_part_image_image_url.g.dart';

/// ChatCompletionRequestMessageContentPartImageImageUrl
///
/// Properties:
/// * [url] - Either a URL of the image or the base64 encoded image data.
/// * [detail] - Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
@BuiltValue()
abstract class ChatCompletionRequestMessageContentPartImageImageUrl implements Built<ChatCompletionRequestMessageContentPartImageImageUrl, ChatCompletionRequestMessageContentPartImageImageUrlBuilder> {
  /// Either a URL of the image or the base64 encoded image data.
  @BuiltValueField(wireName: r'url')
  String get url;

  /// Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
  @BuiltValueField(wireName: r'detail')
  ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum? get detail;
  // enum detailEnum {  auto,  low,  high,  };

  ChatCompletionRequestMessageContentPartImageImageUrl._();

  factory ChatCompletionRequestMessageContentPartImageImageUrl([void updates(ChatCompletionRequestMessageContentPartImageImageUrlBuilder b)]) = _$ChatCompletionRequestMessageContentPartImageImageUrl;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionRequestMessageContentPartImageImageUrlBuilder b) => b
      ..detail = ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum.valueOf('auto');

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionRequestMessageContentPartImageImageUrl> get serializer => _$ChatCompletionRequestMessageContentPartImageImageUrlSerializer();
}

class _$ChatCompletionRequestMessageContentPartImageImageUrlSerializer implements PrimitiveSerializer<ChatCompletionRequestMessageContentPartImageImageUrl> {
  @override
  final Iterable<Type> types = const [ChatCompletionRequestMessageContentPartImageImageUrl, _$ChatCompletionRequestMessageContentPartImageImageUrl];

  @override
  final String wireName = r'ChatCompletionRequestMessageContentPartImageImageUrl';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionRequestMessageContentPartImageImageUrl object, {
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
        specifiedType: const FullType(ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionRequestMessageContentPartImageImageUrl object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionRequestMessageContentPartImageImageUrlBuilder result,
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
            specifiedType: const FullType(ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum),
          ) as ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum;
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
  ChatCompletionRequestMessageContentPartImageImageUrl deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionRequestMessageContentPartImageImageUrlBuilder();
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

class ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum extends EnumClass {

  /// Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
  @BuiltValueEnumConst(wireName: r'auto')
  static const ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum auto = _$chatCompletionRequestMessageContentPartImageImageUrlDetailEnum_auto;
  /// Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
  @BuiltValueEnumConst(wireName: r'low')
  static const ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum low = _$chatCompletionRequestMessageContentPartImageImageUrlDetailEnum_low;
  /// Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
  @BuiltValueEnumConst(wireName: r'high')
  static const ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum high = _$chatCompletionRequestMessageContentPartImageImageUrlDetailEnum_high;

  static Serializer<ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum> get serializer => _$chatCompletionRequestMessageContentPartImageImageUrlDetailEnumSerializer;

  const ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum._(String name): super(name);

  static BuiltSet<ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum> get values => _$chatCompletionRequestMessageContentPartImageImageUrlDetailEnumValues;
  static ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum valueOf(String name) => _$chatCompletionRequestMessageContentPartImageImageUrlDetailEnumValueOf(name);
}

