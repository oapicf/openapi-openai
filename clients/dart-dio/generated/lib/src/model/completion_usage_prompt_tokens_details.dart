//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'completion_usage_prompt_tokens_details.g.dart';

/// Breakdown of tokens used in the prompt.
///
/// Properties:
/// * [audioTokens] - Audio input tokens present in the prompt.
/// * [cachedTokens] - Cached tokens present in the prompt.
@BuiltValue()
abstract class CompletionUsagePromptTokensDetails implements Built<CompletionUsagePromptTokensDetails, CompletionUsagePromptTokensDetailsBuilder> {
  /// Audio input tokens present in the prompt.
  @BuiltValueField(wireName: r'audio_tokens')
  int? get audioTokens;

  /// Cached tokens present in the prompt.
  @BuiltValueField(wireName: r'cached_tokens')
  int? get cachedTokens;

  CompletionUsagePromptTokensDetails._();

  factory CompletionUsagePromptTokensDetails([void updates(CompletionUsagePromptTokensDetailsBuilder b)]) = _$CompletionUsagePromptTokensDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CompletionUsagePromptTokensDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CompletionUsagePromptTokensDetails> get serializer => _$CompletionUsagePromptTokensDetailsSerializer();
}

class _$CompletionUsagePromptTokensDetailsSerializer implements PrimitiveSerializer<CompletionUsagePromptTokensDetails> {
  @override
  final Iterable<Type> types = const [CompletionUsagePromptTokensDetails, _$CompletionUsagePromptTokensDetails];

  @override
  final String wireName = r'CompletionUsagePromptTokensDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CompletionUsagePromptTokensDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.audioTokens != null) {
      yield r'audio_tokens';
      yield serializers.serialize(
        object.audioTokens,
        specifiedType: const FullType(int),
      );
    }
    if (object.cachedTokens != null) {
      yield r'cached_tokens';
      yield serializers.serialize(
        object.cachedTokens,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CompletionUsagePromptTokensDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CompletionUsagePromptTokensDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'audio_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.audioTokens = valueDes;
          break;
        case r'cached_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.cachedTokens = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CompletionUsagePromptTokensDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CompletionUsagePromptTokensDetailsBuilder();
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

