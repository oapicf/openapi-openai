//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'usage_audio_transcriptions_result.g.dart';

/// The aggregated audio transcriptions usage details of the specific time bucket.
///
/// Properties:
/// * [object] 
/// * [seconds] - The number of seconds processed.
/// * [numModelRequests] - The count of requests made to the model.
/// * [projectId] - When `group_by=project_id`, this field provides the project ID of the grouped usage result.
/// * [userId] - When `group_by=user_id`, this field provides the user ID of the grouped usage result.
/// * [apiKeyId] - When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
/// * [model] - When `group_by=model`, this field provides the model name of the grouped usage result.
@BuiltValue()
abstract class UsageAudioTranscriptionsResult implements Built<UsageAudioTranscriptionsResult, UsageAudioTranscriptionsResultBuilder> {
  @BuiltValueField(wireName: r'object')
  UsageAudioTranscriptionsResultObjectEnum get object;
  // enum objectEnum {  organization.usage.audio_transcriptions.result,  };

  /// The number of seconds processed.
  @BuiltValueField(wireName: r'seconds')
  int get seconds;

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

  UsageAudioTranscriptionsResult._();

  factory UsageAudioTranscriptionsResult([void updates(UsageAudioTranscriptionsResultBuilder b)]) = _$UsageAudioTranscriptionsResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsageAudioTranscriptionsResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsageAudioTranscriptionsResult> get serializer => _$UsageAudioTranscriptionsResultSerializer();
}

class _$UsageAudioTranscriptionsResultSerializer implements PrimitiveSerializer<UsageAudioTranscriptionsResult> {
  @override
  final Iterable<Type> types = const [UsageAudioTranscriptionsResult, _$UsageAudioTranscriptionsResult];

  @override
  final String wireName = r'UsageAudioTranscriptionsResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsageAudioTranscriptionsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UsageAudioTranscriptionsResultObjectEnum),
    );
    yield r'seconds';
    yield serializers.serialize(
      object.seconds,
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
    UsageAudioTranscriptionsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UsageAudioTranscriptionsResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UsageAudioTranscriptionsResultObjectEnum),
          ) as UsageAudioTranscriptionsResultObjectEnum;
          result.object = valueDes;
          break;
        case r'seconds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.seconds = valueDes;
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
  UsageAudioTranscriptionsResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsageAudioTranscriptionsResultBuilder();
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

class UsageAudioTranscriptionsResultObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.usage.audio_transcriptions.result')
  static const UsageAudioTranscriptionsResultObjectEnum organizationPeriodUsagePeriodAudioTranscriptionsPeriodResult = _$usageAudioTranscriptionsResultObjectEnum_organizationPeriodUsagePeriodAudioTranscriptionsPeriodResult;

  static Serializer<UsageAudioTranscriptionsResultObjectEnum> get serializer => _$usageAudioTranscriptionsResultObjectEnumSerializer;

  const UsageAudioTranscriptionsResultObjectEnum._(String name): super(name);

  static BuiltSet<UsageAudioTranscriptionsResultObjectEnum> get values => _$usageAudioTranscriptionsResultObjectEnumValues;
  static UsageAudioTranscriptionsResultObjectEnum valueOf(String name) => _$usageAudioTranscriptionsResultObjectEnumValueOf(name);
}

