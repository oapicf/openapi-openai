//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'usage_embeddings_result.g.dart';

/// The aggregated embeddings usage details of the specific time bucket.
///
/// Properties:
/// * [object] 
/// * [inputTokens] - The aggregated number of input tokens used.
/// * [numModelRequests] - The count of requests made to the model.
/// * [projectId] - When `group_by=project_id`, this field provides the project ID of the grouped usage result.
/// * [userId] - When `group_by=user_id`, this field provides the user ID of the grouped usage result.
/// * [apiKeyId] - When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
/// * [model] - When `group_by=model`, this field provides the model name of the grouped usage result.
@BuiltValue()
abstract class UsageEmbeddingsResult implements Built<UsageEmbeddingsResult, UsageEmbeddingsResultBuilder> {
  @BuiltValueField(wireName: r'object')
  UsageEmbeddingsResultObjectEnum get object;
  // enum objectEnum {  organization.usage.embeddings.result,  };

  /// The aggregated number of input tokens used.
  @BuiltValueField(wireName: r'input_tokens')
  int get inputTokens;

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

  UsageEmbeddingsResult._();

  factory UsageEmbeddingsResult([void updates(UsageEmbeddingsResultBuilder b)]) = _$UsageEmbeddingsResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsageEmbeddingsResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsageEmbeddingsResult> get serializer => _$UsageEmbeddingsResultSerializer();
}

class _$UsageEmbeddingsResultSerializer implements PrimitiveSerializer<UsageEmbeddingsResult> {
  @override
  final Iterable<Type> types = const [UsageEmbeddingsResult, _$UsageEmbeddingsResult];

  @override
  final String wireName = r'UsageEmbeddingsResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsageEmbeddingsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UsageEmbeddingsResultObjectEnum),
    );
    yield r'input_tokens';
    yield serializers.serialize(
      object.inputTokens,
      specifiedType: const FullType(int),
    );
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
  }

  @override
  Object serialize(
    Serializers serializers,
    UsageEmbeddingsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UsageEmbeddingsResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UsageEmbeddingsResultObjectEnum),
          ) as UsageEmbeddingsResultObjectEnum;
          result.object = valueDes;
          break;
        case r'input_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.inputTokens = valueDes;
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UsageEmbeddingsResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsageEmbeddingsResultBuilder();
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

class UsageEmbeddingsResultObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.usage.embeddings.result')
  static const UsageEmbeddingsResultObjectEnum organizationPeriodUsagePeriodEmbeddingsPeriodResult = _$usageEmbeddingsResultObjectEnum_organizationPeriodUsagePeriodEmbeddingsPeriodResult;

  static Serializer<UsageEmbeddingsResultObjectEnum> get serializer => _$usageEmbeddingsResultObjectEnumSerializer;

  const UsageEmbeddingsResultObjectEnum._(String name): super(name);

  static BuiltSet<UsageEmbeddingsResultObjectEnum> get values => _$usageEmbeddingsResultObjectEnumValues;
  static UsageEmbeddingsResultObjectEnum valueOf(String name) => _$usageEmbeddingsResultObjectEnumValueOf(name);
}

