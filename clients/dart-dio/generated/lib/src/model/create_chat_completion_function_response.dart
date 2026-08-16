//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/completion_usage.dart';
import 'package:openapi/src/model/create_chat_completion_function_response_choices_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_chat_completion_function_response.g.dart';

/// Represents a chat completion response returned by model, based on the provided input.
///
/// Properties:
/// * [id] - A unique identifier for the chat completion.
/// * [choices] - A list of chat completion choices. Can be more than one if `n` is greater than 1.
/// * [created] - The Unix timestamp (in seconds) of when the chat completion was created.
/// * [model] - The model used for the chat completion.
/// * [systemFingerprint] - This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
/// * [object] - The object type, which is always `chat.completion`.
/// * [usage] 
@BuiltValue()
abstract class CreateChatCompletionFunctionResponse implements Built<CreateChatCompletionFunctionResponse, CreateChatCompletionFunctionResponseBuilder> {
  /// A unique identifier for the chat completion.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// A list of chat completion choices. Can be more than one if `n` is greater than 1.
  @BuiltValueField(wireName: r'choices')
  BuiltList<CreateChatCompletionFunctionResponseChoicesInner> get choices;

  /// The Unix timestamp (in seconds) of when the chat completion was created.
  @BuiltValueField(wireName: r'created')
  int get created;

  /// The model used for the chat completion.
  @BuiltValueField(wireName: r'model')
  String get model;

  /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  @BuiltValueField(wireName: r'system_fingerprint')
  String? get systemFingerprint;

  /// The object type, which is always `chat.completion`.
  @BuiltValueField(wireName: r'object')
  CreateChatCompletionFunctionResponseObjectEnum get object;
  // enum objectEnum {  chat.completion,  };

  @BuiltValueField(wireName: r'usage')
  CompletionUsage? get usage;

  CreateChatCompletionFunctionResponse._();

  factory CreateChatCompletionFunctionResponse([void updates(CreateChatCompletionFunctionResponseBuilder b)]) = _$CreateChatCompletionFunctionResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionFunctionResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionFunctionResponse> get serializer => _$CreateChatCompletionFunctionResponseSerializer();
}

class _$CreateChatCompletionFunctionResponseSerializer implements PrimitiveSerializer<CreateChatCompletionFunctionResponse> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionFunctionResponse, _$CreateChatCompletionFunctionResponse];

  @override
  final String wireName = r'CreateChatCompletionFunctionResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionFunctionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'choices';
    yield serializers.serialize(
      object.choices,
      specifiedType: const FullType(BuiltList, [FullType(CreateChatCompletionFunctionResponseChoicesInner)]),
    );
    yield r'created';
    yield serializers.serialize(
      object.created,
      specifiedType: const FullType(int),
    );
    yield r'model';
    yield serializers.serialize(
      object.model,
      specifiedType: const FullType(String),
    );
    if (object.systemFingerprint != null) {
      yield r'system_fingerprint';
      yield serializers.serialize(
        object.systemFingerprint,
        specifiedType: const FullType(String),
      );
    }
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(CreateChatCompletionFunctionResponseObjectEnum),
    );
    if (object.usage != null) {
      yield r'usage';
      yield serializers.serialize(
        object.usage,
        specifiedType: const FullType(CompletionUsage),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateChatCompletionFunctionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateChatCompletionFunctionResponseBuilder result,
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
        case r'choices':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateChatCompletionFunctionResponseChoicesInner)]),
          ) as BuiltList<CreateChatCompletionFunctionResponseChoicesInner>;
          result.choices.replace(valueDes);
          break;
        case r'created':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.created = valueDes;
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.model = valueDes;
          break;
        case r'system_fingerprint':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.systemFingerprint = valueDes;
          break;
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateChatCompletionFunctionResponseObjectEnum),
          ) as CreateChatCompletionFunctionResponseObjectEnum;
          result.object = valueDes;
          break;
        case r'usage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CompletionUsage),
          ) as CompletionUsage;
          result.usage.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateChatCompletionFunctionResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionFunctionResponseBuilder();
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

class CreateChatCompletionFunctionResponseObjectEnum extends EnumClass {

  /// The object type, which is always `chat.completion`.
  @BuiltValueEnumConst(wireName: r'chat.completion')
  static const CreateChatCompletionFunctionResponseObjectEnum chatPeriodCompletion = _$createChatCompletionFunctionResponseObjectEnum_chatPeriodCompletion;

  static Serializer<CreateChatCompletionFunctionResponseObjectEnum> get serializer => _$createChatCompletionFunctionResponseObjectEnumSerializer;

  const CreateChatCompletionFunctionResponseObjectEnum._(String name): super(name);

  static BuiltSet<CreateChatCompletionFunctionResponseObjectEnum> get values => _$createChatCompletionFunctionResponseObjectEnumValues;
  static CreateChatCompletionFunctionResponseObjectEnum valueOf(String name) => _$createChatCompletionFunctionResponseObjectEnumValueOf(name);
}

