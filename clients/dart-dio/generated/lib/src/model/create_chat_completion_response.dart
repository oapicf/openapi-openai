//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/completion_usage.dart';
import 'package:openapi/src/model/create_chat_completion_response_choices_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_chat_completion_response.g.dart';

/// Represents a chat completion response returned by model, based on the provided input.
///
/// Properties:
/// * [id] - A unique identifier for the chat completion.
/// * [choices] - A list of chat completion choices. Can be more than one if `n` is greater than 1.
/// * [created] - The Unix timestamp (in seconds) of when the chat completion was created.
/// * [model] - The model used for the chat completion.
/// * [serviceTier] - The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
/// * [systemFingerprint] - This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
/// * [object] - The object type, which is always `chat.completion`.
/// * [usage] 
@BuiltValue()
abstract class CreateChatCompletionResponse implements Built<CreateChatCompletionResponse, CreateChatCompletionResponseBuilder> {
  /// A unique identifier for the chat completion.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// A list of chat completion choices. Can be more than one if `n` is greater than 1.
  @BuiltValueField(wireName: r'choices')
  BuiltList<CreateChatCompletionResponseChoicesInner> get choices;

  /// The Unix timestamp (in seconds) of when the chat completion was created.
  @BuiltValueField(wireName: r'created')
  int get created;

  /// The model used for the chat completion.
  @BuiltValueField(wireName: r'model')
  String get model;

  /// The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
  @BuiltValueField(wireName: r'service_tier')
  CreateChatCompletionResponseServiceTierEnum? get serviceTier;
  // enum serviceTierEnum {  scale,  default,  };

  /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  @BuiltValueField(wireName: r'system_fingerprint')
  String? get systemFingerprint;

  /// The object type, which is always `chat.completion`.
  @BuiltValueField(wireName: r'object')
  CreateChatCompletionResponseObjectEnum get object;
  // enum objectEnum {  chat.completion,  };

  @BuiltValueField(wireName: r'usage')
  CompletionUsage? get usage;

  CreateChatCompletionResponse._();

  factory CreateChatCompletionResponse([void updates(CreateChatCompletionResponseBuilder b)]) = _$CreateChatCompletionResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateChatCompletionResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateChatCompletionResponse> get serializer => _$CreateChatCompletionResponseSerializer();
}

class _$CreateChatCompletionResponseSerializer implements PrimitiveSerializer<CreateChatCompletionResponse> {
  @override
  final Iterable<Type> types = const [CreateChatCompletionResponse, _$CreateChatCompletionResponse];

  @override
  final String wireName = r'CreateChatCompletionResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateChatCompletionResponse object, {
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
      specifiedType: const FullType(BuiltList, [FullType(CreateChatCompletionResponseChoicesInner)]),
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
    if (object.serviceTier != null) {
      yield r'service_tier';
      yield serializers.serialize(
        object.serviceTier,
        specifiedType: const FullType.nullable(CreateChatCompletionResponseServiceTierEnum),
      );
    }
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
      specifiedType: const FullType(CreateChatCompletionResponseObjectEnum),
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
    CreateChatCompletionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateChatCompletionResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(CreateChatCompletionResponseChoicesInner)]),
          ) as BuiltList<CreateChatCompletionResponseChoicesInner>;
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
        case r'service_tier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateChatCompletionResponseServiceTierEnum),
          ) as CreateChatCompletionResponseServiceTierEnum?;
          if (valueDes == null) continue;
          result.serviceTier = valueDes;
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
            specifiedType: const FullType(CreateChatCompletionResponseObjectEnum),
          ) as CreateChatCompletionResponseObjectEnum;
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
  CreateChatCompletionResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateChatCompletionResponseBuilder();
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

class CreateChatCompletionResponseServiceTierEnum extends EnumClass {

  /// The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
  @BuiltValueEnumConst(wireName: r'scale')
  static const CreateChatCompletionResponseServiceTierEnum scale = _$createChatCompletionResponseServiceTierEnum_scale;
  /// The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
  @BuiltValueEnumConst(wireName: r'default')
  static const CreateChatCompletionResponseServiceTierEnum default_ = _$createChatCompletionResponseServiceTierEnum_default_;

  static Serializer<CreateChatCompletionResponseServiceTierEnum> get serializer => _$createChatCompletionResponseServiceTierEnumSerializer;

  const CreateChatCompletionResponseServiceTierEnum._(String name): super(name);

  static BuiltSet<CreateChatCompletionResponseServiceTierEnum> get values => _$createChatCompletionResponseServiceTierEnumValues;
  static CreateChatCompletionResponseServiceTierEnum valueOf(String name) => _$createChatCompletionResponseServiceTierEnumValueOf(name);
}

class CreateChatCompletionResponseObjectEnum extends EnumClass {

  /// The object type, which is always `chat.completion`.
  @BuiltValueEnumConst(wireName: r'chat.completion')
  static const CreateChatCompletionResponseObjectEnum chatPeriodCompletion = _$createChatCompletionResponseObjectEnum_chatPeriodCompletion;

  static Serializer<CreateChatCompletionResponseObjectEnum> get serializer => _$createChatCompletionResponseObjectEnumSerializer;

  const CreateChatCompletionResponseObjectEnum._(String name): super(name);

  static BuiltSet<CreateChatCompletionResponseObjectEnum> get values => _$createChatCompletionResponseObjectEnumValues;
  static CreateChatCompletionResponseObjectEnum valueOf(String name) => _$createChatCompletionResponseObjectEnumValueOf(name);
}

