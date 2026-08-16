//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tuning_job_checkpoint_metrics.g.dart';

/// Metrics at the step number during the fine-tuning job.
///
/// Properties:
/// * [step] 
/// * [trainLoss] 
/// * [trainMeanTokenAccuracy] 
/// * [validLoss] 
/// * [validMeanTokenAccuracy] 
/// * [fullValidLoss] 
/// * [fullValidMeanTokenAccuracy] 
@BuiltValue()
abstract class FineTuningJobCheckpointMetrics implements Built<FineTuningJobCheckpointMetrics, FineTuningJobCheckpointMetricsBuilder> {
  @BuiltValueField(wireName: r'step')
  num? get step;

  @BuiltValueField(wireName: r'train_loss')
  num? get trainLoss;

  @BuiltValueField(wireName: r'train_mean_token_accuracy')
  num? get trainMeanTokenAccuracy;

  @BuiltValueField(wireName: r'valid_loss')
  num? get validLoss;

  @BuiltValueField(wireName: r'valid_mean_token_accuracy')
  num? get validMeanTokenAccuracy;

  @BuiltValueField(wireName: r'full_valid_loss')
  num? get fullValidLoss;

  @BuiltValueField(wireName: r'full_valid_mean_token_accuracy')
  num? get fullValidMeanTokenAccuracy;

  FineTuningJobCheckpointMetrics._();

  factory FineTuningJobCheckpointMetrics([void updates(FineTuningJobCheckpointMetricsBuilder b)]) = _$FineTuningJobCheckpointMetrics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuningJobCheckpointMetricsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuningJobCheckpointMetrics> get serializer => _$FineTuningJobCheckpointMetricsSerializer();
}

class _$FineTuningJobCheckpointMetricsSerializer implements PrimitiveSerializer<FineTuningJobCheckpointMetrics> {
  @override
  final Iterable<Type> types = const [FineTuningJobCheckpointMetrics, _$FineTuningJobCheckpointMetrics];

  @override
  final String wireName = r'FineTuningJobCheckpointMetrics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuningJobCheckpointMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.step != null) {
      yield r'step';
      yield serializers.serialize(
        object.step,
        specifiedType: const FullType(num),
      );
    }
    if (object.trainLoss != null) {
      yield r'train_loss';
      yield serializers.serialize(
        object.trainLoss,
        specifiedType: const FullType(num),
      );
    }
    if (object.trainMeanTokenAccuracy != null) {
      yield r'train_mean_token_accuracy';
      yield serializers.serialize(
        object.trainMeanTokenAccuracy,
        specifiedType: const FullType(num),
      );
    }
    if (object.validLoss != null) {
      yield r'valid_loss';
      yield serializers.serialize(
        object.validLoss,
        specifiedType: const FullType(num),
      );
    }
    if (object.validMeanTokenAccuracy != null) {
      yield r'valid_mean_token_accuracy';
      yield serializers.serialize(
        object.validMeanTokenAccuracy,
        specifiedType: const FullType(num),
      );
    }
    if (object.fullValidLoss != null) {
      yield r'full_valid_loss';
      yield serializers.serialize(
        object.fullValidLoss,
        specifiedType: const FullType(num),
      );
    }
    if (object.fullValidMeanTokenAccuracy != null) {
      yield r'full_valid_mean_token_accuracy';
      yield serializers.serialize(
        object.fullValidMeanTokenAccuracy,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuningJobCheckpointMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuningJobCheckpointMetricsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'step':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.step = valueDes;
          break;
        case r'train_loss':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.trainLoss = valueDes;
          break;
        case r'train_mean_token_accuracy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.trainMeanTokenAccuracy = valueDes;
          break;
        case r'valid_loss':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.validLoss = valueDes;
          break;
        case r'valid_mean_token_accuracy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.validMeanTokenAccuracy = valueDes;
          break;
        case r'full_valid_loss':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.fullValidLoss = valueDes;
          break;
        case r'full_valid_mean_token_accuracy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.fullValidMeanTokenAccuracy = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTuningJobCheckpointMetrics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuningJobCheckpointMetricsBuilder();
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

