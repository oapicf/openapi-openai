//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_embedding_response_usage.g.dart';

/// The usage information for the request.
///
/// Properties:
/// * [promptTokens] - The number of tokens used by the prompt.
/// * [totalTokens] - The total number of tokens used by the request.
@BuiltValue()
abstract class CreateEmbeddingResponseUsage implements Built<CreateEmbeddingResponseUsage, CreateEmbeddingResponseUsageBuilder> {
  /// The number of tokens used by the prompt.
  @BuiltValueField(wireName: r'prompt_tokens')
  int get promptTokens;

  /// The total number of tokens used by the request.
  @BuiltValueField(wireName: r'total_tokens')
  int get totalTokens;

  CreateEmbeddingResponseUsage._();

  factory CreateEmbeddingResponseUsage([void updates(CreateEmbeddingResponseUsageBuilder b)]) = _$CreateEmbeddingResponseUsage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateEmbeddingResponseUsageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateEmbeddingResponseUsage> get serializer => _$CreateEmbeddingResponseUsageSerializer();
}

class _$CreateEmbeddingResponseUsageSerializer implements PrimitiveSerializer<CreateEmbeddingResponseUsage> {
  @override
  final Iterable<Type> types = const [CreateEmbeddingResponseUsage, _$CreateEmbeddingResponseUsage];

  @override
  final String wireName = r'CreateEmbeddingResponseUsage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateEmbeddingResponseUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    CreateEmbeddingResponseUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateEmbeddingResponseUsageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  CreateEmbeddingResponseUsage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateEmbeddingResponseUsageBuilder();
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

