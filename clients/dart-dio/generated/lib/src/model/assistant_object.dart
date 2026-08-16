//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/assistant_object_tools_inner.dart';
import 'package:openapi/src/model/assistant_object_tool_resources.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/assistants_api_response_format_option.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'assistant_object.g.dart';

/// Represents an `assistant` that can call the model and use tools.
///
/// Properties:
/// * [id] - The identifier, which can be referenced in API endpoints.
/// * [object] - The object type, which is always `assistant`.
/// * [createdAt] - The Unix timestamp (in seconds) for when the assistant was created.
/// * [name] - The name of the assistant. The maximum length is 256 characters. 
/// * [description] - The description of the assistant. The maximum length is 512 characters. 
/// * [model] - ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
/// * [instructions] - The system instructions that the assistant uses. The maximum length is 256,000 characters. 
/// * [tools] - A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
/// * [toolResources] 
/// * [metadata] - Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
/// * [temperature] - What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
/// * [topP] - An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
/// * [responseFormat] 
@BuiltValue()
abstract class AssistantObject implements Built<AssistantObject, AssistantObjectBuilder> {
  /// The identifier, which can be referenced in API endpoints.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The object type, which is always `assistant`.
  @BuiltValueField(wireName: r'object')
  AssistantObjectObjectEnum get object;
  // enum objectEnum {  assistant,  };

  /// The Unix timestamp (in seconds) for when the assistant was created.
  @BuiltValueField(wireName: r'created_at')
  int get createdAt;

  /// The name of the assistant. The maximum length is 256 characters. 
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The description of the assistant. The maximum length is 512 characters. 
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
  @BuiltValueField(wireName: r'model')
  String get model;

  /// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  @BuiltValueField(wireName: r'instructions')
  String? get instructions;

  /// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
  @BuiltValueField(wireName: r'tools')
  BuiltList<AssistantObjectToolsInner> get tools;

  @BuiltValueField(wireName: r'tool_resources')
  AssistantObjectToolResources? get toolResources;

  /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  @BuiltValueField(wireName: r'metadata')
  JsonObject? get metadata;

  /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  @BuiltValueField(wireName: r'temperature')
  num? get temperature;

  /// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  @BuiltValueField(wireName: r'top_p')
  num? get topP;

  @BuiltValueField(wireName: r'response_format')
  AssistantsApiResponseFormatOption? get responseFormat;

  AssistantObject._();

  factory AssistantObject([void updates(AssistantObjectBuilder b)]) = _$AssistantObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantObjectBuilder b) => b
      ..tools = ListBuilder()
      ..temperature = 1
      ..topP = 1;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantObject> get serializer => _$AssistantObjectSerializer();
}

class _$AssistantObjectSerializer implements PrimitiveSerializer<AssistantObject> {
  @override
  final Iterable<Type> types = const [AssistantObject, _$AssistantObject];

  @override
  final String wireName = r'AssistantObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'object';
    yield serializers.serialize(
      object.object,
      specifiedType: const FullType(AssistantObjectObjectEnum),
    );
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield object.name == null ? null : serializers.serialize(
      object.name,
      specifiedType: const FullType.nullable(String),
    );
    yield r'description';
    yield object.description == null ? null : serializers.serialize(
      object.description,
      specifiedType: const FullType.nullable(String),
    );
    yield r'model';
    yield serializers.serialize(
      object.model,
      specifiedType: const FullType(String),
    );
    yield r'instructions';
    yield object.instructions == null ? null : serializers.serialize(
      object.instructions,
      specifiedType: const FullType.nullable(String),
    );
    yield r'tools';
    yield serializers.serialize(
      object.tools,
      specifiedType: const FullType(BuiltList, [FullType(AssistantObjectToolsInner)]),
    );
    if (object.toolResources != null) {
      yield r'tool_resources';
      yield serializers.serialize(
        object.toolResources,
        specifiedType: const FullType.nullable(AssistantObjectToolResources),
      );
    }
    yield r'metadata';
    yield object.metadata == null ? null : serializers.serialize(
      object.metadata,
      specifiedType: const FullType.nullable(JsonObject),
    );
    if (object.temperature != null) {
      yield r'temperature';
      yield serializers.serialize(
        object.temperature,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.topP != null) {
      yield r'top_p';
      yield serializers.serialize(
        object.topP,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.responseFormat != null) {
      yield r'response_format';
      yield serializers.serialize(
        object.responseFormat,
        specifiedType: const FullType(AssistantsApiResponseFormatOption),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AssistantObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssistantObjectBuilder result,
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
        case r'object':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantObjectObjectEnum),
          ) as AssistantObjectObjectEnum;
          result.object = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdAt = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.model = valueDes;
          break;
        case r'instructions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.instructions = valueDes;
          break;
        case r'tools':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AssistantObjectToolsInner)]),
          ) as BuiltList<AssistantObjectToolsInner>;
          result.tools.replace(valueDes);
          break;
        case r'tool_resources':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AssistantObjectToolResources),
          ) as AssistantObjectToolResources?;
          if (valueDes == null) continue;
          result.toolResources.replace(valueDes);
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.metadata = valueDes;
          break;
        case r'temperature':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.temperature = valueDes;
          break;
        case r'top_p':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.topP = valueDes;
          break;
        case r'response_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssistantsApiResponseFormatOption),
          ) as AssistantsApiResponseFormatOption;
          result.responseFormat.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssistantObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantObjectBuilder();
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

class AssistantObjectObjectEnum extends EnumClass {

  /// The object type, which is always `assistant`.
  @BuiltValueEnumConst(wireName: r'assistant')
  static const AssistantObjectObjectEnum assistant = _$assistantObjectObjectEnum_assistant;

  static Serializer<AssistantObjectObjectEnum> get serializer => _$assistantObjectObjectEnumSerializer;

  const AssistantObjectObjectEnum._(String name): super(name);

  static BuiltSet<AssistantObjectObjectEnum> get values => _$assistantObjectObjectEnumValues;
  static AssistantObjectObjectEnum valueOf(String name) => _$assistantObjectObjectEnumValueOf(name);
}

