//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_chat_completion_stream_response_usage.g.dart';

/// An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
///
/// Properties:
/// * [completionTokens] - Number of tokens in the generated completion.
/// * [promptTokens] - Number of tokens in the prompt.
/// * [totalTokens] - Total number of tokens used in the request (prompt + completion).
@BuiltValue()
abstract class CreateChatCompletionStreamResponseUsage implements Built<CreateChatCompletionStreamResponseUsage, CreateChatCompletionStreamResponseUsageBuilder> {
  /// Number of tokens in the generated completion.
  @BuiltValueField(wireName: r'completion_tokens')
  int get completionTokens;

  /// Number of tokens in the prompt.
  @BuiltValueField(wireName: r'prompt_tokens')
  int get promptTokens;

  /// Total number of tokens used in the request (prompt + completion).
  @BuiltValueField(wireName: r'total_tokens')
  int get totalTokens;

  CreateChatCompletionStreamResponseUsage._();

  factory CreateChatCompletionStreamResponseUsage([void updates(CreateChatCompletionStreamResponseUsageBuilder b)]) = _$CreateChatCompletionStreamResponseUsage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionStreamResponseUsageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionStreamResponseUsage> get serializer => _$CreateChatCompletionStreamResponseUsageSerializer();
}

class _$CreateChatCompletionStreamResponseUsageSerializer implements PrimitiveSerializer<CreateChatCompletionStreamResponseUsage> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionStreamResponseUsage, _$CreateChatCompletionStreamResponseUsage];

  @override
  final String wireName = r'CreateChatCompletionStreamResponseUsage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionStreamResponseUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'completion_tokens';
    yield serializers.serialize(
      object.completionTokens,
      specifiedType: const FullType(int),
    );
    yield r'prompt_tokens';
    yield serializers.serialize(
      object.promptTokens,
      specifiedType: const FullType(int),
    );
    yield r'total_tokens';
    yield serializers.serialize(
      object.totalTokens,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateChatCompletionStreamResponseUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateChatCompletionStreamResponseUsageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'completion_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.completionTokens = valueDes;
          break;
        case r'prompt_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.promptTokens = valueDes;
          break;
        case r'total_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.totalTokens = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateChatCompletionStreamResponseUsage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionStreamResponseUsageBuilder();
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

