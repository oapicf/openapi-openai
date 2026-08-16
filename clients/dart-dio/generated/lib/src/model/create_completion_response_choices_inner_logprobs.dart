//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_completion_response_choices_inner_logprobs.g.dart';

/// CreateCompletionResponseChoicesInnerLogprobs
///
/// Properties:
/// * [textOffset] 
/// * [tokenLogprobs] 
/// * [tokens] 
/// * [topLogprobs] 
@BuiltValue()
abstract class CreateCompletionResponseChoicesInnerLogprobs implements Built<CreateCompletionResponseChoicesInnerLogprobs, CreateCompletionResponseChoicesInnerLogprobsBuilder> {
  @BuiltValueField(wireName: r'text_offset')
  BuiltList<int>? get textOffset;

  @BuiltValueField(wireName: r'token_logprobs')
  BuiltList<num>? get tokenLogprobs;

  @BuiltValueField(wireName: r'tokens')
  BuiltList<String>? get tokens;

  @BuiltValueField(wireName: r'top_logprobs')
  BuiltList<BuiltMap<String, num>>? get topLogprobs;

  CreateCompletionResponseChoicesInnerLogprobs._();

  factory CreateCompletionResponseChoicesInnerLogprobs([void updates(CreateCompletionResponseChoicesInnerLogprobsBuilder b)]) = _$CreateCompletionResponseChoicesInnerLogprobs;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateCompletionResponseChoicesInnerLogprobsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateCompletionResponseChoicesInnerLogprobs> get serializer => _$CreateCompletionResponseChoicesInnerLogprobsSerializer();
}

class _$CreateCompletionResponseChoicesInnerLogprobsSerializer implements PrimitiveSerializer<CreateCompletionResponseChoicesInnerLogprobs> {
  @override
  final Iterable<Type> types = const [CreateCompletionResponseChoicesInnerLogprobs, _$CreateCompletionResponseChoicesInnerLogprobs];

  @override
  final String wireName = r'CreateCompletionResponseChoicesInnerLogprobs';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateCompletionResponseChoicesInnerLogprobs object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.textOffset != null) {
      yield r'text_offset';
      yield serializers.serialize(
        object.textOffset,
        specifiedType: const FullType(BuiltList, [FullType(int)]),
      );
    }
    if (object.tokenLogprobs != null) {
      yield r'token_logprobs';
      yield serializers.serialize(
        object.tokenLogprobs,
        specifiedType: const FullType(BuiltList, [FullType(num)]),
      );
    }
    if (object.tokens != null) {
      yield r'tokens';
      yield serializers.serialize(
        object.tokens,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.topLogprobs != null) {
      yield r'top_logprobs';
      yield serializers.serialize(
        object.topLogprobs,
        specifiedType: const FullType(BuiltList, [FullType(BuiltMap, [FullType(String), FullType(num)])]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateCompletionResponseChoicesInnerLogprobs object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateCompletionResponseChoicesInnerLogprobsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'text_offset':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(int)]),
          ) as BuiltList<int>;
          result.textOffset.replace(valueDes);
          break;
        case r'token_logprobs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(num)]),
          ) as BuiltList<num>;
          result.tokenLogprobs.replace(valueDes);
          break;
        case r'tokens':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.tokens.replace(valueDes);
          break;
        case r'top_logprobs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BuiltMap, [FullType(String), FullType(num)])]),
          ) as BuiltList<BuiltMap<String, num>>;
          result.topLogprobs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateCompletionResponseChoicesInnerLogprobs deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateCompletionResponseChoicesInnerLogprobsBuilder();
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

