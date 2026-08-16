//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_completion_usage.g.dart';

/// Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
///
/// Properties:
/// * [completionTokens] - Number of completion tokens used over the course of the run step.
/// * [promptTokens] - Number of prompt tokens used over the course of the run step.
/// * [totalTokens] - Total number of tokens used (prompt + completion).
@BuiltValue()
abstract class RunStepCompletionUsage implements Built<RunStepCompletionUsage, RunStepCompletionUsageBuilder> {
  /// Number of completion tokens used over the course of the run step.
  @BuiltValueField(wireName: r'completion_tokens')
  int get completionTokens;

  /// Number of prompt tokens used over the course of the run step.
  @BuiltValueField(wireName: r'prompt_tokens')
  int get promptTokens;

  /// Total number of tokens used (prompt + completion).
  @BuiltValueField(wireName: r'total_tokens')
  int get totalTokens;

  RunStepCompletionUsage._();

  factory RunStepCompletionUsage([void updates(RunStepCompletionUsageBuilder b)]) = _$RunStepCompletionUsage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepCompletionUsageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepCompletionUsage> get serializer => _$RunStepCompletionUsageSerializer();
}

class _$RunStepCompletionUsageSerializer implements PrimitiveSerializer<RunStepCompletionUsage> {
  @override
  final Iterable<Type> types = const [RunStepCompletionUsage, _$RunStepCompletionUsage];

  @override
  final String wireName = r'RunStepCompletionUsage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepCompletionUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'completion_tokens';
    yield serializers.serialize(
      object.completionTokens,
      specifiedType: const FullType(int),
    );
    yield r'prompt_tokens';
    yield serializers.serialize(
      object.promptTokens,
      specifiedType: const FullType(int),
    );
    yield r'total_tokens';
    yield serializers.serialize(
      object.totalTokens,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepCompletionUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepCompletionUsageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'completion_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.completionTokens = valueDes;
          break;
        case r'prompt_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.promptTokens = valueDes;
          break;
        case r'total_tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.totalTokens = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepCompletionUsage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepCompletionUsageBuilder();
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

