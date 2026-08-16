//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_token_logprob_top_logprobs_inner.g.dart';

/// ChatCompletionTokenLogprobTopLogprobsInner
///
/// Properties:
/// * [token] - The token.
/// * [logprob] - The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
/// * [bytes] - A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
@BuiltValue()
abstract class ChatCompletionTokenLogprobTopLogprobsInner implements Built<ChatCompletionTokenLogprobTopLogprobsInner, ChatCompletionTokenLogprobTopLogprobsInnerBuilder> {
  /// The token.
  @BuiltValueField(wireName: r'token')
  String get token;

  /// The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
  @BuiltValueField(wireName: r'logprob')
  num get logprob;

  /// A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
  @BuiltValueField(wireName: r'bytes')
  BuiltList<int>? get bytes;

  ChatCompletionTokenLogprobTopLogprobsInner._();

  factory ChatCompletionTokenLogprobTopLogprobsInner([void updates(ChatCompletionTokenLogprobTopLogprobsInnerBuilder b)]) = _$ChatCompletionTokenLogprobTopLogprobsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChatCompletionTokenLogprobTopLogprobsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ChatCompletionTokenLogprobTopLogprobsInner> get serializer => _$ChatCompletionTokenLogprobTopLogprobsInnerSerializer();
}

class _$ChatCompletionTokenLogprobTopLogprobsInnerSerializer implements PrimitiveSerializer<ChatCompletionTokenLogprobTopLogprobsInner> {
  @override
  final Iterable<Type> types = const [ChatCompletionTokenLogprobTopLogprobsInner, _$ChatCompletionTokenLogprobTopLogprobsInner];

  @override
  final String wireName = r'ChatCompletionTokenLogprobTopLogprobsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ChatCompletionTokenLogprobTopLogprobsInner object, {
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
  }

  @override
  Object serialize(
    Serializers serializers,
    ChatCompletionTokenLogprobTopLogprobsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChatCompletionTokenLogprobTopLogprobsInnerBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ChatCompletionTokenLogprobTopLogprobsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChatCompletionTokenLogprobTopLogprobsInnerBuilder();
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

