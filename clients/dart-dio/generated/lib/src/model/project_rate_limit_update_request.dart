//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'project_rate_limit_update_request.g.dart';

/// ProjectRateLimitUpdateRequest
///
/// Properties:
/// * [maxRequestsPer1Minute] - The maximum requests per minute.
/// * [maxTokensPer1Minute] - The maximum tokens per minute.
/// * [maxImagesPer1Minute] - The maximum images per minute. Only relevant for certain models.
/// * [maxAudioMegabytesPer1Minute] - The maximum audio megabytes per minute. Only relevant for certain models.
/// * [maxRequestsPer1Day] - The maximum requests per day. Only relevant for certain models.
/// * [batch1DayMaxInputTokens] - The maximum batch input tokens per day. Only relevant for certain models.
@BuiltValue()
abstract class ProjectRateLimitUpdateRequest implements Built<ProjectRateLimitUpdateRequest, ProjectRateLimitUpdateRequestBuilder> {
  /// The maximum requests per minute.
  @BuiltValueField(wireName: r'max_requests_per_1_minute')
  int? get maxRequestsPer1Minute;

  /// The maximum tokens per minute.
  @BuiltValueField(wireName: r'max_tokens_per_1_minute')
  int? get maxTokensPer1Minute;

  /// The maximum images per minute. Only relevant for certain models.
  @BuiltValueField(wireName: r'max_images_per_1_minute')
  int? get maxImagesPer1Minute;

  /// The maximum audio megabytes per minute. Only relevant for certain models.
  @BuiltValueField(wireName: r'max_audio_megabytes_per_1_minute')
  int? get maxAudioMegabytesPer1Minute;

  /// The maximum requests per day. Only relevant for certain models.
  @BuiltValueField(wireName: r'max_requests_per_1_day')
  int? get maxRequestsPer1Day;

  /// The maximum batch input tokens per day. Only relevant for certain models.
  @BuiltValueField(wireName: r'batch_1_day_max_input_tokens')
  int? get batch1DayMaxInputTokens;

  ProjectRateLimitUpdateRequest._();

  factory ProjectRateLimitUpdateRequest([void updates(ProjectRateLimitUpdateRequestBuilder b)]) = _$ProjectRateLimitUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProjectRateLimitUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProjectRateLimitUpdateRequest> get serializer => _$ProjectRateLimitUpdateRequestSerializer();
}

class _$ProjectRateLimitUpdateRequestSerializer implements PrimitiveSerializer<ProjectRateLimitUpdateRequest> {
  @override
  final Iterable<Type> types = const [ProjectRateLimitUpdateRequest, _$ProjectRateLimitUpdateRequest];

  @override
  final String wireName = r'ProjectRateLimitUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProjectRateLimitUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxRequestsPer1Minute != null) {
      yield r'max_requests_per_1_minute';
      yield serializers.serialize(
        object.maxRequestsPer1Minute,
        specifiedType: const FullType(int),
      );
    }
    if (object.maxTokensPer1Minute != null) {
      yield r'max_tokens_per_1_minute';
      yield serializers.serialize(
        object.maxTokensPer1Minute,
        specifiedType: const FullType(int),
      );
    }
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
    ProjectRateLimitUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProjectRateLimitUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  ProjectRateLimitUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProjectRateLimitUpdateRequestBuilder();
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

