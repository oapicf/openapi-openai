//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_completion_response_choices_inner_logprobs.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_completion_response_choices_inner.g.dart';

/// CreateCompletionResponseChoicesInner
///
/// Properties:
/// * [finishReason] - The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
/// * [index] 
/// * [logprobs] 
/// * [text] 
@BuiltValue()
abstract class CreateCompletionResponseChoicesInner implements Built<CreateCompletionResponseChoicesInner, CreateCompletionResponseChoicesInnerBuilder> {
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
  @BuiltValueField(wireName: r'finish_reason')
  CreateCompletionResponseChoicesInnerFinishReasonEnum get finishReason;
  // enum finishReasonEnum {  stop,  length,  content_filter,  };

  @BuiltValueField(wireName: r'index')
  int get index;

  @BuiltValueField(wireName: r'logprobs')
  CreateCompletionResponseChoicesInnerLogprobs? get logprobs;

  @BuiltValueField(wireName: r'text')
  String get text;

  CreateCompletionResponseChoicesInner._();

  factory CreateCompletionResponseChoicesInner([void updates(CreateCompletionResponseChoicesInnerBuilder b)]) = _$CreateCompletionResponseChoicesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateCompletionResponseChoicesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateCompletionResponseChoicesInner> get serializer => _$CreateCompletionResponseChoicesInnerSerializer();
}

class _$CreateCompletionResponseChoicesInnerSerializer implements PrimitiveSerializer<CreateCompletionResponseChoicesInner> {
  @override
  final Iterable<Type> types = const [CreateCompletionResponseChoicesInner, _$CreateCompletionResponseChoicesInner];

  @override
  final String wireName = r'CreateCompletionResponseChoicesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateCompletionResponseChoicesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'finish_reason';
    yield serializers.serialize(
      object.finishReason,
      specifiedType: const FullType(CreateCompletionResponseChoicesInnerFinishReasonEnum),
    );
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    yield r'logprobs';
    yield object.logprobs == null ? null : serializers.serialize(
      object.logprobs,
      specifiedType: const FullType.nullable(CreateCompletionResponseChoicesInnerLogprobs),
    );
    yield r'text';
    yield serializers.serialize(
      object.text,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateCompletionResponseChoicesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateCompletionResponseChoicesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'finish_reason':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateCompletionResponseChoicesInnerFinishReasonEnum),
          ) as CreateCompletionResponseChoicesInnerFinishReasonEnum;
          result.finishReason = valueDes;
          break;
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.index = valueDes;
          break;
        case r'logprobs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateCompletionResponseChoicesInnerLogprobs),
          ) as CreateCompletionResponseChoicesInnerLogprobs?;
          if (valueDes == null) continue;
          result.logprobs.replace(valueDes);
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateCompletionResponseChoicesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateCompletionResponseChoicesInnerBuilder();
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

class CreateCompletionResponseChoicesInnerFinishReasonEnum extends EnumClass {

  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
  @BuiltValueEnumConst(wireName: r'stop')
  static const CreateCompletionResponseChoicesInnerFinishReasonEnum stop = _$createCompletionResponseChoicesInnerFinishReasonEnum_stop;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
  @BuiltValueEnumConst(wireName: r'length')
  static const CreateCompletionResponseChoicesInnerFinishReasonEnum length = _$createCompletionResponseChoicesInnerFinishReasonEnum_length;
  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
  @BuiltValueEnumConst(wireName: r'content_filter')
  static const CreateCompletionResponseChoicesInnerFinishReasonEnum contentFilter = _$createCompletionResponseChoicesInnerFinishReasonEnum_contentFilter;

  static Serializer<CreateCompletionResponseChoicesInnerFinishReasonEnum> get serializer => _$createCompletionResponseChoicesInnerFinishReasonEnumSerializer;

  const CreateCompletionResponseChoicesInnerFinishReasonEnum._(String name): super(name);

  static BuiltSet<CreateCompletionResponseChoicesInnerFinishReasonEnum> get values => _$createCompletionResponseChoicesInnerFinishReasonEnumValues;
  static CreateCompletionResponseChoicesInnerFinishReasonEnum valueOf(String name) => _$createCompletionResponseChoicesInnerFinishReasonEnumValueOf(name);
}

