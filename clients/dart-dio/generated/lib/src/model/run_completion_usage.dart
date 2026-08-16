//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_completion_usage.g.dart';

/// Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
///
/// Properties:
/// * [completionTokens] - Number of completion tokens used over the course of the run.
/// * [promptTokens] - Number of prompt tokens used over the course of the run.
/// * [totalTokens] - Total number of tokens used (prompt + completion).
@BuiltValue()
abstract class RunCompletionUsage implements Built<RunCompletionUsage, RunCompletionUsageBuilder> {
  /// Number of completion tokens used over the course of the run.
  @BuiltValueField(wireName: r'completion_tokens')
  int get completionTokens;

  /// Number of prompt tokens used over the course of the run.
  @BuiltValueField(wireName: r'prompt_tokens')
  int get promptTokens;

  /// Total number of tokens used (prompt + completion).
  @BuiltValueField(wireName: r'total_tokens')
  int get totalTokens;

  RunCompletionUsage._();

  factory RunCompletionUsage([void updates(RunCompletionUsageBuilder b)]) = _$RunCompletionUsage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunCompletionUsageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunCompletionUsage> get serializer => _$RunCompletionUsageSerializer();
}

class _$RunCompletionUsageSerializer implements PrimitiveSerializer<RunCompletionUsage> {
  @override
  final Iterable<Type> types = const [RunCompletionUsage, _$RunCompletionUsage];

  @override
  final String wireName = r'RunCompletionUsage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunCompletionUsage object, {
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
    RunCompletionUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunCompletionUsageBuilder result,
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
  RunCompletionUsage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunCompletionUsageBuilder();
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

