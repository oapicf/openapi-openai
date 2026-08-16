//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/fine_tuning_job_checkpoint_metrics.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tuning_job_checkpoint.g.dart';

/// The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
///
/// Properties:
/// * [id] - The checkpoint identifier, which can be referenced in the API endpoints.
/// * [createdAt] - The Unix timestamp (in seconds) for when the checkpoint was created.
/// * [fineTunedModelCheckpoint] - The name of the fine-tuned checkpoint model that is created.
/// * [stepNumber] - The step number that the checkpoint was created at.
/// * [metrics] 
/// * [fineTuningJobId] - The name of the fine-tuning job that this checkpoint was created from.
/// * [object] - The object type, which is always \"fine_tuning.job.checkpoint\".
@BuiltValue()
abstract class FineTuningJobCheckpoint implements Built<FineTuningJobCheckpoint, FineTuningJobCheckpointBuilder> {
  /// The checkpoint identifier, which can be referenced in the API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The Unix timestamp (in seconds) for when the checkpoint was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The name of the fine-tuned checkpoint model that is created.
  @BuiltValueField(wireName: r'fine_tuned_model_checkpoint')
  String get fineTunedModelCheckpoint;

  /// The step number that the checkpoint was created at.
  @BuiltValueField(wireName: r'step_number')
  int get stepNumber;

  @BuiltValueField(wireName: r'metrics')
  FineTuningJobCheckpointMetrics get metrics;

  /// The name of the fine-tuning job that this checkpoint was created from.
  @BuiltValueField(wireName: r'fine_tuning_job_id')
  String get fineTuningJobId;

  /// The object type, which is always \"fine_tuning.job.checkpoint\".
  @BuiltValueField(wireName: r'object')
  FineTuningJobCheckpointObjectEnum get object;
  // enum objectEnum {  fine_tuning.job.checkpoint,  };

  FineTuningJobCheckpoint._();

  factory FineTuningJobCheckpoint([void updates(FineTuningJobCheckpointBuilder b)]) = _$FineTuningJobCheckpoint;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuningJobCheckpointBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuningJobCheckpoint> get serializer => _$FineTuningJobCheckpointSerializer();
}

class _$FineTuningJobCheckpointSerializer implements PrimitiveSerializer<FineTuningJobCheckpoint> {
  @override
  final Iterable<Type> types = const [FineTuningJobCheckpoint, _$FineTuningJobCheckpoint];

  @override
  final String wireName = r'FineTuningJobCheckpoint';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuningJobCheckpoint object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'fine_tuned_model_checkpoint';
    yield serializers.serialize(
      object.fineTunedModelCheckpoint,
      specifiedType: const FullType(String),
    );
    yield r'step_number';
    yield serializers.serialize(
      object.stepNumber,
      specifiedType: const FullType(int),
    );
    yield r'metrics';
    yield serializers.serialize(
      object.metrics,
      specifiedType: const FullType(FineTuningJobCheckpointMetrics),
    );
    yield r'fine_tuning_job_id';
    yield serializers.serialize(
      object.fineTuningJobId,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(FineTuningJobCheckpointObjectEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuningJobCheckpoint object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuningJobCheckpointBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'fine_tuned_model_checkpoint':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.fineTunedModelCheckpoint = valueDes;
          break;
        case r'step_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.stepNumber = valueDes;
          break;
        case r'metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuningJobCheckpointMetrics),
          ) as FineTuningJobCheckpointMetrics;
          result.metrics.replace(valueDes);
          break;
        case r'fine_tuning_job_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.fineTuningJobId = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(FineTuningJobCheckpointObjectEnum),
          ) as FineTuningJobCheckpointObjectEnum;
          result.object = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTuningJobCheckpoint deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuningJobCheckpointBuilder();
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

class FineTuningJobCheckpointObjectEnum extends EnumClass {

  /// The object type, which is always \"fine_tuning.job.checkpoint\".
  @BuiltValueEnumConst(wireName: r'fine_tuning.job.checkpoint')
  static const FineTuningJobCheckpointObjectEnum fineTuningPeriodJobPeriodCheckpoint = _$fineTuningJobCheckpointObjectEnum_fineTuningPeriodJobPeriodCheckpoint;

  static Serializer<FineTuningJobCheckpointObjectEnum> get serializer => _$fineTuningJobCheckpointObjectEnumSerializer;

  const FineTuningJobCheckpointObjectEnum._(String name): super(name);

  static BuiltSet<FineTuningJobCheckpointObjectEnum> get values => _$fineTuningJobCheckpointObjectEnumValues;
  static FineTuningJobCheckpointObjectEnum valueOf(String name) => _$fineTuningJobCheckpointObjectEnumValueOf(name);
}

