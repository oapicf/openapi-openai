//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'fine_tune_completion_request_input.g.dart';

/// The per-line training example of a fine-tuning input file for completions models
///
/// Properties:
/// * [prompt] - The input prompt for this training example.
/// * [completion] - The desired completion for this training example.
@BuiltValue()
abstract class FineTuneCompletionRequestInput implements Built<FineTuneCompletionRequestInput, FineTuneCompletionRequestInputBuilder> {
  /// The input prompt for this training example.
  @BuiltValueField(wireName: r'prompt')
  String? get prompt;

  /// The desired completion for this training example.
  @BuiltValueField(wireName: r'completion')
  String? get completion;

  FineTuneCompletionRequestInput._();

  factory FineTuneCompletionRequestInput([void updates(FineTuneCompletionRequestInputBuilder b)]) = _$FineTuneCompletionRequestInput;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FineTuneCompletionRequestInputBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FineTuneCompletionRequestInput> get serializer => _$FineTuneCompletionRequestInputSerializer();
}

class _$FineTuneCompletionRequestInputSerializer implements PrimitiveSerializer<FineTuneCompletionRequestInput> {
  @override
  final Iterable<Type> types = const [FineTuneCompletionRequestInput, _$FineTuneCompletionRequestInput];

  @override
  final String wireName = r'FineTuneCompletionRequestInput';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FineTuneCompletionRequestInput object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.prompt != null) {
      yield r'prompt';
      yield serializers.serialize(
        object.prompt,
        specifiedType: const FullType(String),
      );
    }
    if (object.completion != null) {
      yield r'completion';
      yield serializers.serialize(
        object.completion,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FineTuneCompletionRequestInput object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FineTuneCompletionRequestInputBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'prompt':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.prompt = valueDes;
          break;
        case r'completion':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.completion = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FineTuneCompletionRequestInput deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FineTuneCompletionRequestInputBuilder();
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

