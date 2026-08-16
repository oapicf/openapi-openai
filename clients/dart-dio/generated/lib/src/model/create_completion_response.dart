//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/completion_usage.dart';
import 'package:openapi/src/model/create_completion_response_choices_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_completion_response.g.dart';

/// Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
///
/// Properties:
/// * [id] - A unique identifier for the completion.
/// * [choices] - The list of completion choices the model generated for the input prompt.
/// * [created] - The Unix timestamp (in seconds) of when the completion was created.
/// * [model] - The model used for completion.
/// * [systemFingerprint] - This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
/// * [object] - The object type, which is always \"text_completion\"
/// * [usage] 
@BuiltValue()
abstract class CreateCompletionResponse implements Built<CreateCompletionResponse, CreateCompletionResponseBuilder> {
  /// A unique identifier for the completion.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The list of completion choices the model generated for the input prompt.
  @BuiltValueField(wireName: r'choices')
  BuiltList<CreateCompletionResponseChoicesInner> get choices;

  /// The Unix timestamp (in seconds) of when the completion was created.
  @BuiltValueField(wireName: r'created')
  int get created;

  /// The model used for completion.
  @BuiltValueField(wireName: r'model')
  String get model;

  /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  @BuiltValueField(wireName: r'system_fingerprint')
  String? get systemFingerprint;

  /// The object type, which is always \"text_completion\"
  @BuiltValueField(wireName: r'object')
  CreateCompletionResponseObjectEnum get object;
  // enum objectEnum {  text_completion,  };

  @BuiltValueField(wireName: r'usage')
  CompletionUsage? get usage;

  CreateCompletionResponse._();

  factory CreateCompletionResponse([void updates(CreateCompletionResponseBuilder b)]) = _$CreateCompletionResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateCompletionResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateCompletionResponse> get serializer => _$CreateCompletionResponseSerializer();
}

class _$CreateCompletionResponseSerializer implements PrimitiveSerializer<CreateCompletionResponse> {
  @override
  final Iterable<Type> types = const [CreateCompletionResponse, _$CreateCompletionResponse];

  @override
  final String wireName = r'CreateCompletionResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateCompletionResponse object, {
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
      specifiedType: const FullType(BuiltList, [FullType(CreateCompletionResponseChoicesInner)]),
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
      specifiedType: const FullType(CreateCompletionResponseObjectEnum),
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
    CreateCompletionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateCompletionResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(CreateCompletionResponseChoicesInner)]),
          ) as BuiltList<CreateCompletionResponseChoicesInner>;
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
            specifiedType: const FullType(CreateCompletionResponseObjectEnum),
          ) as CreateCompletionResponseObjectEnum;
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
  CreateCompletionResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateCompletionResponseBuilder();
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

class CreateCompletionResponseObjectEnum extends EnumClass {

  /// The object type, which is always \"text_completion\"
  @BuiltValueEnumConst(wireName: r'text_completion')
  static const CreateCompletionResponseObjectEnum textCompletion = _$createCompletionResponseObjectEnum_textCompletion;

  static Serializer<CreateCompletionResponseObjectEnum> get serializer => _$createCompletionResponseObjectEnumSerializer;

  const CreateCompletionResponseObjectEnum._(String name): super(name);

  static BuiltSet<CreateCompletionResponseObjectEnum> get values => _$createCompletionResponseObjectEnumValues;
  static CreateCompletionResponseObjectEnum valueOf(String name) => _$createCompletionResponseObjectEnumValueOf(name);
}

