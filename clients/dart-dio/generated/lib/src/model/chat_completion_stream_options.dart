//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_stream_options.g.dart';

/// Options for streaming response. Only set this when you set `stream: true`. 
///
/// Properties:
/// * [includeUsage] - If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
@BuiltValue()
abstract class ChatCompletionStreamOptions implements Built<ChatCompletionStreamOptions, ChatCompletionStreamOptionsBuilder> {
  /// If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
  @BuiltValueField(wireName: r'include_usage')
  bool? get includeUsage;

  ChatCompletionStreamOptions._();

  factory ChatCompletionStreamOptions([void updates(ChatCompletionStreamOptionsBuilder b)]) = _$ChatCompletionStreamOptions;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionStreamOptionsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionStreamOptions> get serializer => _$ChatCompletionStreamOptionsSerializer();
}

class _$ChatCompletionStreamOptionsSerializer implements PrimitiveSerializer<ChatCompletionStreamOptions> {
  @override
  final Iterable<Type> types = const [ChatCompletionStreamOptions, _$ChatCompletionStreamOptions];

  @override
  final String wireName = r'ChatCompletionStreamOptions';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionStreamOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.includeUsage != null) {
      yield r'include_usage';
      yield serializers.serialize(
        object.includeUsage,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionStreamOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionStreamOptionsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'include_usage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.includeUsage = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionStreamOptions deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionStreamOptionsBuilder();
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

