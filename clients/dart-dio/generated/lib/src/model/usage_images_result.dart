//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'usage_images_result.g.dart';

/// The aggregated images usage details of the specific time bucket.
///
/// Properties:
/// * [object] 
/// * [images] - The number of images processed.
/// * [numModelRequests] - The count of requests made to the model.
/// * [source_] - When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
/// * [size] - When `group_by=size`, this field provides the image size of the grouped usage result.
/// * [projectId] - When `group_by=project_id`, this field provides the project ID of the grouped usage result.
/// * [userId] - When `group_by=user_id`, this field provides the user ID of the grouped usage result.
/// * [apiKeyId] - When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
/// * [model] - When `group_by=model`, this field provides the model name of the grouped usage result.
@BuiltValue()
abstract class UsageImagesResult implements Built<UsageImagesResult, UsageImagesResultBuilder> {
  @BuiltValueField(wireName: r'object')
  UsageImagesResultObjectEnum get object;
  // enum objectEnum {  organization.usage.images.result,  };

  /// The number of images processed.
  @BuiltValueField(wireName: r'images')
  int get images;

  /// The count of requests made to the model.
  @BuiltValueField(wireName: r'num_model_requests')
  int get numModelRequests;

  /// When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
  @BuiltValueField(wireName: r'source')
  String? get source_;

  /// When `group_by=size`, this field provides the image size of the grouped usage result.
  @BuiltValueField(wireName: r'size')
  String? get size;

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

  UsageImagesResult._();

  factory UsageImagesResult([void updates(UsageImagesResultBuilder b)]) = _$UsageImagesResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsageImagesResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsageImagesResult> get serializer => _$UsageImagesResultSerializer();
}

class _$UsageImagesResultSerializer implements PrimitiveSerializer<UsageImagesResult> {
  @override
  final Iterable<Type> types = const [UsageImagesResult, _$UsageImagesResult];

  @override
  final String wireName = r'UsageImagesResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsageImagesResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UsageImagesResultObjectEnum),
    );
    yield r'images';
    yield serializers.serialize(
      object.images,
      specifiedType: const FullType(int),
    );
    yield r'num_model_requests';
    yield serializers.serialize(
      object.numModelRequests,
      specifiedType: const FullType(int),
    );
    if (object.source_ != null) {
      yield r'source';
      yield serializers.serialize(
        object.source_,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.size != null) {
      yield r'size';
      yield serializers.serialize(
        object.size,
        specifiedType: const FullType.nullable(String),
      );
    }
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
    UsageImagesResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UsageImagesResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UsageImagesResultObjectEnum),
          ) as UsageImagesResultObjectEnum;
          result.object = valueDes;
          break;
        case r'images':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.images = valueDes;
          break;
        case r'num_model_requests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.numModelRequests = valueDes;
          break;
        case r'source':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.source_ = valueDes;
          break;
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.size = valueDes;
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
  UsageImagesResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsageImagesResultBuilder();
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

class UsageImagesResultObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.usage.images.result')
  static const UsageImagesResultObjectEnum organizationPeriodUsagePeriodImagesPeriodResult = _$usageImagesResultObjectEnum_organizationPeriodUsagePeriodImagesPeriodResult;

  static Serializer<UsageImagesResultObjectEnum> get serializer => _$usageImagesResultObjectEnumSerializer;

  const UsageImagesResultObjectEnum._(String name): super(name);

  static BuiltSet<UsageImagesResultObjectEnum> get values => _$usageImagesResultObjectEnumValues;
  static UsageImagesResultObjectEnum valueOf(String name) => _$usageImagesResultObjectEnumValueOf(name);
}

