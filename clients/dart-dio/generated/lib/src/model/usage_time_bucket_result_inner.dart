//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/usage_audio_speeches_result.dart';
import 'package:openapi/src/model/usage_images_result.dart';
import 'package:openapi/src/model/usage_audio_transcriptions_result.dart';
import 'package:openapi/src/model/usage_completions_result.dart';
import 'package:openapi/src/model/costs_result.dart';
import 'package:openapi/src/model/usage_vector_stores_result.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/usage_embeddings_result.dart';
import 'package:openapi/src/model/usage_moderations_result.dart';
import 'package:openapi/src/model/costs_result_amount.dart';
import 'package:openapi/src/model/usage_code_interpreter_sessions_result.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'usage_time_bucket_result_inner.g.dart';

/// UsageTimeBucketResultInner
///
/// Properties:
/// * [object] 
/// * [inputTokens] - The aggregated number of input tokens used.
/// * [inputCachedTokens] - The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
/// * [outputTokens] - The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
/// * [inputAudioTokens] - The aggregated number of audio input tokens used, including cached tokens.
/// * [outputAudioTokens] - The aggregated number of audio output tokens used.
/// * [numModelRequests] - The count of requests made to the model.
/// * [projectId] - When `group_by=project_id`, this field provides the project ID of the grouped costs result.
/// * [userId] - When `group_by=user_id`, this field provides the user ID of the grouped usage result.
/// * [apiKeyId] - When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
/// * [model] - When `group_by=model`, this field provides the model name of the grouped usage result.
/// * [batch] - When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
/// * [images] - The number of images processed.
/// * [source_] - When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
/// * [size] - When `group_by=size`, this field provides the image size of the grouped usage result.
/// * [characters] - The number of characters processed.
/// * [seconds] - The number of seconds processed.
/// * [usageBytes] - The vector stores usage in bytes.
/// * [sessions] - The number of code interpreter sessions.
/// * [amount] 
/// * [lineItem] - When `group_by=line_item`, this field provides the line item of the grouped costs result.
@BuiltValue()
abstract class UsageTimeBucketResultInner implements Built<UsageTimeBucketResultInner, UsageTimeBucketResultInnerBuilder> {
  /// One Of [CostsResult], [UsageAudioSpeechesResult], [UsageAudioTranscriptionsResult], [UsageCodeInterpreterSessionsResult], [UsageCompletionsResult], [UsageEmbeddingsResult], [UsageImagesResult], [UsageModerationsResult], [UsageVectorStoresResult]
  OneOf get oneOf;

  UsageTimeBucketResultInner._();

  factory UsageTimeBucketResultInner([void updates(UsageTimeBucketResultInnerBuilder b)]) = _$UsageTimeBucketResultInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsageTimeBucketResultInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsageTimeBucketResultInner> get serializer => _$UsageTimeBucketResultInnerSerializer();
}

class _$UsageTimeBucketResultInnerSerializer implements PrimitiveSerializer<UsageTimeBucketResultInner> {
  @override
  final Iterable<Type> types = const [UsageTimeBucketResultInner, _$UsageTimeBucketResultInner];

  @override
  final String wireName = r'UsageTimeBucketResultInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsageTimeBucketResultInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    UsageTimeBucketResultInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  UsageTimeBucketResultInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsageTimeBucketResultInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(UsageCompletionsResult), FullType(UsageEmbeddingsResult), FullType(UsageModerationsResult), FullType(UsageImagesResult), FullType(UsageAudioSpeechesResult), FullType(UsageAudioTranscriptionsResult), FullType(UsageVectorStoresResult), FullType(UsageCodeInterpreterSessionsResult), FullType(CostsResult), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class UsageTimeBucketResultInnerObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.costs.result')
  static const UsageTimeBucketResultInnerObjectEnum organizationPeriodCostsPeriodResult = _$usageTimeBucketResultInnerObjectEnum_organizationPeriodCostsPeriodResult;

  static Serializer<UsageTimeBucketResultInnerObjectEnum> get serializer => _$usageTimeBucketResultInnerObjectEnumSerializer;

  const UsageTimeBucketResultInnerObjectEnum._(String name): super(name);

  static BuiltSet<UsageTimeBucketResultInnerObjectEnum> get values => _$usageTimeBucketResultInnerObjectEnumValues;
  static UsageTimeBucketResultInnerObjectEnum valueOf(String name) => _$usageTimeBucketResultInnerObjectEnumValueOf(name);
}

