//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_assistant_request_tool_resources_code_interpreter.dart';
import 'package:openapi/src/model/create_assistant_request_tool_resources_file_search.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_assistant_request_tool_resources.g.dart';

/// A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
///
/// Properties:
/// * [codeInterpreter] 
/// * [fileSearch] 
@BuiltValue()
abstract class CreateAssistantRequestToolResources implements Built<CreateAssistantRequestToolResources, CreateAssistantRequestToolResourcesBuilder> {
  @BuiltValueField(wireName: r'code_interpreter')
  CreateAssistantRequestToolResourcesCodeInterpreter? get codeInterpreter;

  @BuiltValueField(wireName: r'file_search')
  CreateAssistantRequestToolResourcesFileSearch? get fileSearch;

  CreateAssistantRequestToolResources._();

  factory CreateAssistantRequestToolResources([void updates(CreateAssistantRequestToolResourcesBuilder b)]) = _$CreateAssistantRequestToolResources;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssistantRequestToolResourcesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssistantRequestToolResources> get serializer => _$CreateAssistantRequestToolResourcesSerializer();
}

class _$CreateAssistantRequestToolResourcesSerializer implements PrimitiveSerializer<CreateAssistantRequestToolResources> {
  @override
  final Iterable<Type> types = const [CreateAssistantRequestToolResources, _$CreateAssistantRequestToolResources];

  @override
  final String wireName = r'CreateAssistantRequestToolResources';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssistantRequestToolResources object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.codeInterpreter != null) {
      yield r'code_interpreter';
      yield serializers.serialize(
        object.codeInterpreter,
        specifiedType: const FullType(CreateAssistantRequestToolResourcesCodeInterpreter),
      );
    }
    if (object.fileSearch != null) {
      yield r'file_search';
      yield serializers.serialize(
        object.fileSearch,
        specifiedType: const FullType.nullable(CreateAssistantRequestToolResourcesFileSearch),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateAssistantRequestToolResources object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssistantRequestToolResourcesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code_interpreter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateAssistantRequestToolResourcesCodeInterpreter),
          ) as CreateAssistantRequestToolResourcesCodeInterpreter;
          result.codeInterpreter.replace(valueDes);
          break;
        case r'file_search':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreateAssistantRequestToolResourcesFileSearch),
          ) as CreateAssistantRequestToolResourcesFileSearch?;
          if (valueDes == null) continue;
          result.fileSearch.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateAssistantRequestToolResources deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssistantRequestToolResourcesBuilder();
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

