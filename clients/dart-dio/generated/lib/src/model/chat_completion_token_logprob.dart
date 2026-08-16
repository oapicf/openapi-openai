//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/chat_completion_token_logprob_top_logprobs_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_token_logprob.g.dart';

/// ChatCompletionTokenLogprob
///
/// Properties:
/// * [token] - The token.
/// * [logprob] - The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
/// * [bytes] - A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
/// * [topLogprobs] - List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
@BuiltValue()
abstract class ChatCompletionTokenLogprob implements Built<ChatCompletionTokenLogprob, ChatCompletionTokenLogprobBuilder> {
  /// The token.
  @BuiltValueField(wireName: r'token')
  String get token;

  /// The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
  @BuiltValueField(wireName: r'logprob')
  num get logprob;

  /// A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
  @BuiltValueField(wireName: r'bytes')
  BuiltList<int>? get bytes;

  /// List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
  @BuiltValueField(wireName: r'top_logprobs')
  BuiltList<ChatCompletionTokenLogprobTopLogprobsInner> get topLogprobs;

  ChatCompletionTokenLogprob._();

  factory ChatCompletionTokenLogprob([void updates(ChatCompletionTokenLogprobBuilder b)]) = _$ChatCompletionTokenLogprob;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionTokenLogprobBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionTokenLogprob> get serializer => _$ChatCompletionTokenLogprobSerializer();
}

class _$ChatCompletionTokenLogprobSerializer implements PrimitiveSerializer<ChatCompletionTokenLogprob> {
  @override
  final Iterable<Type> types = const [ChatCompletionTokenLogprob, _$ChatCompletionTokenLogprob];

  @override
  final String wireName = r'ChatCompletionTokenLogprob';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionTokenLogprob object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'token';
    yield serializers.serialize(
      object.token,
      specifiedType: const FullType(String),
    );
    yield r'logprob';
    yield serializers.serialize(
      object.logprob,
      specifiedType: const FullType(num),
    );
    yield r'bytes';
    yield object.bytes == null ? null : serializers.serialize(
      object.bytes,
      specifiedType: const FullType.nullable(BuiltList, [FullType(int)]),
    );
    yield r'top_logprobs';
    yield serializers.serialize(
      object.topLogprobs,
      specifiedType: const FullType(BuiltList, [FullType(ChatCompletionTokenLogprobTopLogprobsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionTokenLogprob object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionTokenLogprobBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.token = valueDes;
          break;
        case r'logprob':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.logprob = valueDes;
          break;
        case r'bytes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(int)]),
          ) as BuiltList<int>?;
          if (valueDes == null) continue;
          result.bytes.replace(valueDes);
          break;
        case r'top_logprobs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ChatCompletionTokenLogprobTopLogprobsInner)]),
          ) as BuiltList<ChatCompletionTokenLogprobTopLogprobsInner>;
          result.topLogprobs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionTokenLogprob deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionTokenLogprobBuilder();
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

