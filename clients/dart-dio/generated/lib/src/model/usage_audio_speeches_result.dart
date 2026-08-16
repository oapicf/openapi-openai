//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'usage_audio_speeches_result.g.dart';

/// The aggregated audio speeches usage details of the specific time bucket.
///
/// Properties:
/// * [object] 
/// * [characters] - The number of characters processed.
/// * [numModelRequests] - The count of requests made to the model.
/// * [projectId] - When `group_by=project_id`, this field provides the project ID of the grouped usage result.
/// * [userId] - When `group_by=user_id`, this field provides the user ID of the grouped usage result.
/// * [apiKeyId] - When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
/// * [model] - When `group_by=model`, this field provides the model name of the grouped usage result.
@BuiltValue()
abstract class UsageAudioSpeechesResult implements Built<UsageAudioSpeechesResult, UsageAudioSpeechesResultBuilder> {
  @BuiltValueField(wireName: r'object')
  UsageAudioSpeechesResultObjectEnum get object;
  // enum objectEnum {  organization.usage.audio_speeches.result,  };

  /// The number of characters processed.
  @BuiltValueField(wireName: r'characters')
  int get characters;

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

  UsageAudioSpeechesResult._();

  factory UsageAudioSpeechesResult([void updates(UsageAudioSpeechesResultBuilder b)]) = _$UsageAudioSpeechesResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UsageAudioSpeechesResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UsageAudioSpeechesResult> get serializer => _$UsageAudioSpeechesResultSerializer();
}

class _$UsageAudioSpeechesResultSerializer implements PrimitiveSerializer<UsageAudioSpeechesResult> {
  @override
  final Iterable<Type> types = const [UsageAudioSpeechesResult, _$UsageAudioSpeechesResult];

  @override
  final String wireName = r'UsageAudioSpeechesResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UsageAudioSpeechesResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(UsageAudioSpeechesResultObjectEnum),
    );
    yield r'characters';
    yield serializers.serialize(
      object.characters,
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
    UsageAudioSpeechesResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UsageAudioSpeechesResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UsageAudioSpeechesResultObjectEnum),
          ) as UsageAudioSpeechesResultObjectEnum;
          result.object = valueDes;
          break;
        case r'characters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.characters = valueDes;
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
  UsageAudioSpeechesResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UsageAudioSpeechesResultBuilder();
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

class UsageAudioSpeechesResultObjectEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'organization.usage.audio_speeches.result')
  static const UsageAudioSpeechesResultObjectEnum organizationPeriodUsagePeriodAudioSpeechesPeriodResult = _$usageAudioSpeechesResultObjectEnum_organizationPeriodUsagePeriodAudioSpeechesPeriodResult;

  static Serializer<UsageAudioSpeechesResultObjectEnum> get serializer => _$usageAudioSpeechesResultObjectEnumSerializer;

  const UsageAudioSpeechesResultObjectEnum._(String name): super(name);

  static BuiltSet<UsageAudioSpeechesResultObjectEnum> get values => _$usageAudioSpeechesResultObjectEnumValues;
  static UsageAudioSpeechesResultObjectEnum valueOf(String name) => _$usageAudioSpeechesResultObjectEnumValueOf(name);
}

