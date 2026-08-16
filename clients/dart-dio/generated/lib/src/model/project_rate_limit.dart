//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_rate_limit.g.dart';

/// Represents a project rate limit config.
///
/// Properties:
/// * [object] - The object type, which is always `project.rate_limit`
/// * [id] - The identifier, which can be referenced in API endpoints.
/// * [model] - The model this rate limit applies to.
/// * [maxRequestsPer1Minute] - The maximum requests per minute.
/// * [maxTokensPer1Minute] - The maximum tokens per minute.
/// * [maxImagesPer1Minute] - The maximum images per minute. Only present for relevant models.
/// * [maxAudioMegabytesPer1Minute] - The maximum audio megabytes per minute. Only present for relevant models.
/// * [maxRequestsPer1Day] - The maximum requests per day. Only present for relevant models.
/// * [batch1DayMaxInputTokens] - The maximum batch input tokens per day. Only present for relevant models.
@BuiltValue()
abstract class ProjectRateLimit implements Built<ProjectRateLimit, ProjectRateLimitBuilder> {
  /// The object type, which is always `project.rate_limit`
  @BuiltValueField(wireName: r'object')
  ProjectRateLimitObjectEnum get object;
  // enum objectEnum {  project.rate_limit,  };

  /// The identifier, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The model this rate limit applies to.
  @BuiltValueField(wireName: r'model')
  String get model;

  /// The maximum requests per minute.
  @BuiltValueField(wireName: r'max_requests_per_1_minute')
  int get maxRequestsPer1Minute;

  /// The maximum tokens per minute.
  @BuiltValueField(wireName: r'max_tokens_per_1_minute')
  int get maxTokensPer1Minute;

  /// The maximum images per minute. Only present for relevant models.
  @BuiltValueField(wireName: r'max_images_per_1_minute')
  int? get maxImagesPer1Minute;

  /// The maximum audio megabytes per minute. Only present for relevant models.
  @BuiltValueField(wireName: r'max_audio_megabytes_per_1_minute')
  int? get maxAudioMegabytesPer1Minute;

  /// The maximum requests per day. Only present for relevant models.
  @BuiltValueField(wireName: r'max_requests_per_1_day')
  int? get maxRequestsPer1Day;

  /// The maximum batch input tokens per day. Only present for relevant models.
  @BuiltValueField(wireName: r'batch_1_day_max_input_tokens')
  int? get batch1DayMaxInputTokens;

  ProjectRateLimit._();

  factory ProjectRateLimit([void updates(ProjectRateLimitBuilder b)]) = _$ProjectRateLimit;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectRateLimitBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectRateLimit> get serializer => _$ProjectRateLimitSerializer();
}

class _$ProjectRateLimitSerializer implements PrimitiveSerializer<ProjectRateLimit> {
  @override
  final Iterable<Type> types = const [ProjectRateLimit, _$ProjectRateLimit];

  @override
  final String wireName = r'ProjectRateLimit';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectRateLimit object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(ProjectRateLimitObjectEnum),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'model';
    yield serializers.serialize(
      object.model,
      specifiedType: const FullType(String),
    );
    yield r'max_requests_per_1_minute';
    yield serializers.serialize(
      object.maxRequestsPer1Minute,
      specifiedType: const FullType(int),
    );
    yield r'max_tokens_per_1_minute';
    yield serializers.serialize(
      object.maxTokensPer1Minute,
      specifiedType: const FullType(int),
    );
    if (object.maxImagesPer1Minute != null) {
      yield r'max_images_per_1_minute';
      yield serializers.serialize(
        object.maxImagesPer1Minute,
        specifiedType: const FullType(int),
      );
    }
    if (object.maxAudioMegabytesPer1Minute != null) {
      yield r'max_audio_megabytes_per_1_minute';
      yield serializers.serialize(
        object.maxAudioMegabytesPer1Minute,
        specifiedType: const FullType(int),
      );
    }
    if (object.maxRequestsPer1Day != null) {
      yield r'max_requests_per_1_day';
      yield serializers.serialize(
        object.maxRequestsPer1Day,
        specifiedType: const FullType(int),
      );
    }
    if (object.batch1DayMaxInputTokens != null) {
      yield r'batch_1_day_max_input_tokens';
      yield serializers.serialize(
        object.batch1DayMaxInputTokens,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ProjectRateLimit object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectRateLimitBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProjectRateLimitObjectEnum),
          ) as ProjectRateLimitObjectEnum;
          result.object = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.model = valueDes;
          break;
        case r'max_requests_per_1_minute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxRequestsPer1Minute = valueDes;
          break;
        case r'max_tokens_per_1_minute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxTokensPer1Minute = valueDes;
          break;
        case r'max_images_per_1_minute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxImagesPer1Minute = valueDes;
          break;
        case r'max_audio_megabytes_per_1_minute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxAudioMegabytesPer1Minute = valueDes;
          break;
        case r'max_requests_per_1_day':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxRequestsPer1Day = valueDes;
          break;
        case r'batch_1_day_max_input_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.batch1DayMaxInputTokens = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProjectRateLimit deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectRateLimitBuilder();
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

class ProjectRateLimitObjectEnum extends EnumClass {

  /// The object type, which is always `project.rate_limit`
  @BuiltValueEnumConst(wireName: r'project.rate_limit')
  static const ProjectRateLimitObjectEnum projectPeriodRateLimit = _$projectRateLimitObjectEnum_projectPeriodRateLimit;

  static Serializer<ProjectRateLimitObjectEnum> get serializer => _$projectRateLimitObjectEnumSerializer;

  const ProjectRateLimitObjectEnum._(String name): super(name);

  static BuiltSet<ProjectRateLimitObjectEnum> get values => _$projectRateLimitObjectEnumValues;
  static ProjectRateLimitObjectEnum valueOf(String name) => _$projectRateLimitObjectEnumValueOf(name);
}

