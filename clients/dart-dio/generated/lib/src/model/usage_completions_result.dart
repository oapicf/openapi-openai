//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'usage_completions_result.g.dart';

/// The aggregated completions usage details of the specific time bucket.
///
/// Properties:
/// * [object] 
/// * [inputTokens] - The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
/// * [inputCachedTokens] - The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
/// * [outputTokens] - The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
/// * [inputAudioTokens] - The aggregated number of audio input tokens used, including cached tokens.
/// * [outputAudioTokens] - The aggregated number of audio output tokens used.
/// * [numModelRequests] - The count of requests made to the model.
/// * [projectId] - When `group_by=project_id`, this field provides the project ID of the grouped usage result.
/// * [userId] - When `group_by=user_id`, this field provides the user ID of the grouped usage result.
/// * [apiKeyId] - When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
/// * [model] - When `group_by=model`, this field provides the model name of the grouped usage result.
/// * [batch] - When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
@BuiltValue()
abstract class UsageCompletionsResult implements Built<UsageCompletionsResult, UsageCompletionsResultBuilder> {
  @BuiltValueField(wireName: r'object')
  UsageCompletionsResultObjectEnum get object;
  // enum objectEnum {  organization.usage.completions.result,  };

  /// The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
  @BuiltValueField(wireName: r'input_tokens')
  int get inputTokens;

  /// The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
  @BuiltValueField(wireName: r'input_cached_tokens')
  int? get inputCachedTokens;

  /// The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
  @BuiltValueField(wireName: r'output_tokens')
  int get outputTokens;

  /// The aggregated number of audio input tokens used, including cached tokens.
  @BuiltValueField(wireName: r'input_audio_tokens')
  int? get inputAudioTokens;

  /// The aggregated number of audio output tokens used.
  @BuiltValueField(wireName: r'output_audio_tokens')
  int? get outputAudioTokens;

  /// The count of requests made to the model.
  @BuiltValueField(wireName: r'num_model_requests')
  int get numModelRequests;

  /// When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  @BuiltValueField(wireName: r'project_id')
  String? get projectId;

  /// When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  @BuiltValueField(wireName: r'user_id')
  String? get userId;

  /// When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  @BuiltValueField(wireName: r'api_key_id')
  String? get apiKeyId;

  /// When `group_by=model`, this field provides the model name of the grouped usage result.
  @BuiltValueField(wireName: r'model')
  String? get model;

  /// When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
  @BuiltValueField(wireName: r'batch')
  bool? get batch;

  UsageCompletionsResult._();

  factory UsageCompletionsResult([void updates(UsageCompletionsResultBuilder b)]) = _$UsageCompletionsResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsageCompletionsResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsageCompletionsResult> get serializer => _$UsageCompletionsResultSerializer();
}

class _$UsageCompletionsResultSerializer implements PrimitiveSerializer<UsageCompletionsResult> {
  @override
  final Iterable<Type> types = const [UsageCompletionsResult, _$UsageCompletionsResult];

  @override
  final String wireName = r'UsageCompletionsResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsageCompletionsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UsageCompletionsResultObjectEnum),
    );
    yield r'input_tokens';
    yield serializers.serialize(
      object.inputTokens,
      specifiedType: const FullType(int),
    );
    if (object.inputCachedTokens != null) {
      yield r'input_cached_tokens';
      yield serializers.serialize(
        object.inputCachedTokens,
        specifiedType: const FullType(int),
      );
    }
    yield r'output_tokens';
    yield serializers.serialize(
      object.outputTokens,
      specifiedType: const FullType(int),
    );
    if (object.inputAudioTokens != null) {
      yield r'input_audio_tokens';
      yield serializers.serialize(
        object.inputAudioTokens,
        specifiedType: const FullType(int),
      );
    }
    if (object.outputAudioTokens != null) {
      yield r'output_audio_tokens';
      yield serializers.serialize(
        object.outputAudioTokens,
        specifiedType: const FullType(int),
      );
    }
    yield r'num_model_requests';
    yield serializers.serialize(
      object.numModelRequests,
      specifiedType: const FullType(int),
    );
    if (object.projectId != null) {
      yield r'project_id';
      yield serializers.serialize(
        object.projectId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.userId != null) {
      yield r'user_id';
      yield serializers.serialize(
        object.userId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.apiKeyId != null) {
      yield r'api_key_id';
      yield serializers.serialize(
        object.apiKeyId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.model != null) {
      yield r'model';
      yield serializers.serialize(
        object.model,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.batch != null) {
      yield r'batch';
      yield serializers.serialize(
        object.batch,
        specifiedType: const FullType.nullable(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UsageCompletionsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UsageCompletionsResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UsageCompletionsResultObjectEnum),
          ) as UsageCompletionsResultObjectEnum;
          result.object = valueDes;
          break;
        case r'input_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.inputTokens = valueDes;
          break;
        case r'input_cached_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.inputCachedTokens = valueDes;
          break;
        case r'output_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.outputTokens = valueDes;
          break;
        case r'input_audio_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.inputAudioTokens = valueDes;
          break;
        case r'output_audio_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.outputAudioTokens = valueDes;
          break;
        case r'num_model_requests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.numModelRequests = valueDes;
          break;
        case r'project_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.projectId = valueDes;
          break;
        case r'user_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.userId = valueDes;
          break;
        case r'api_key_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.apiKeyId = valueDes;
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.model = valueDes;
          break;
        case r'batch':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.batch = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UsageCompletionsResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsageCompletionsResultBuilder();
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

class UsageCompletionsResultObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.usage.completions.result')
  static const UsageCompletionsResultObjectEnum organizationPeriodUsagePeriodCompletionsPeriodResult = _$usageCompletionsResultObjectEnum_organizationPeriodUsagePeriodCompletionsPeriodResult;

  static Serializer<UsageCompletionsResultObjectEnum> get serializer => _$usageCompletionsResultObjectEnumSerializer;

  const UsageCompletionsResultObjectEnum._(String name): super(name);

  static BuiltSet<UsageCompletionsResultObjectEnum> get values => _$usageCompletionsResultObjectEnumValues;
  static UsageCompletionsResultObjectEnum valueOf(String name) => _$usageCompletionsResultObjectEnumValueOf(name);
}

