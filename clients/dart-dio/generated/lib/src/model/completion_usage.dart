//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/completion_usage_completion_tokens_details.dart';
import 'package:openapi/src/model/completion_usage_prompt_tokens_details.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'completion_usage.g.dart';

/// Usage statistics for the completion request.
///
/// Properties:
/// * [completionTokens] - Number of tokens in the generated completion.
/// * [promptTokens] - Number of tokens in the prompt.
/// * [totalTokens] - Total number of tokens used in the request (prompt + completion).
/// * [completionTokensDetails] 
/// * [promptTokensDetails] 
@BuiltValue()
abstract class CompletionUsage implements Built<CompletionUsage, CompletionUsageBuilder> {
  /// Number of tokens in the generated completion.
  @BuiltValueField(wireName: r'completion_tokens')
  int get completionTokens;

  /// Number of tokens in the prompt.
  @BuiltValueField(wireName: r'prompt_tokens')
  int get promptTokens;

  /// Total number of tokens used in the request (prompt + completion).
  @BuiltValueField(wireName: r'total_tokens')
  int get totalTokens;

  @BuiltValueField(wireName: r'completion_tokens_details')
  CompletionUsageCompletionTokensDetails? get completionTokensDetails;

  @BuiltValueField(wireName: r'prompt_tokens_details')
  CompletionUsagePromptTokensDetails? get promptTokensDetails;

  CompletionUsage._();

  factory CompletionUsage([void updates(CompletionUsageBuilder b)]) = _$CompletionUsage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CompletionUsageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CompletionUsage> get serializer => _$CompletionUsageSerializer();
}

class _$CompletionUsageSerializer implements PrimitiveSerializer<CompletionUsage> {
  @override
  final Iterable<Type> types = const [CompletionUsage, _$CompletionUsage];

  @override
  final String wireName = r'CompletionUsage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CompletionUsage object, {
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
    if (object.completionTokensDetails != null) {
      yield r'completion_tokens_details';
      yield serializers.serialize(
        object.completionTokensDetails,
        specifiedType: const FullType(CompletionUsageCompletionTokensDetails),
      );
    }
    if (object.promptTokensDetails != null) {
      yield r'prompt_tokens_details';
      yield serializers.serialize(
        object.promptTokensDetails,
        specifiedType: const FullType(CompletionUsagePromptTokensDetails),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CompletionUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CompletionUsageBuilder result,
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
        case r'completion_tokens_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CompletionUsageCompletionTokensDetails),
          ) as CompletionUsageCompletionTokensDetails;
          result.completionTokensDetails.replace(valueDes);
          break;
        case r'prompt_tokens_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CompletionUsagePromptTokensDetails),
          ) as CompletionUsagePromptTokensDetails;
          result.promptTokensDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CompletionUsage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CompletionUsageBuilder();
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

