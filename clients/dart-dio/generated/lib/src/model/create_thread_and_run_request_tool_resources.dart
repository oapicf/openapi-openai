//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/create_assistant_request_tool_resources_code_interpreter.dart';
import 'package:openapi/src/model/assistant_object_tool_resources_file_search.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_thread_and_run_request_tool_resources.g.dart';

/// A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
///
/// Properties:
/// * [codeInterpreter] 
/// * [fileSearch] 
@BuiltValue()
abstract class CreateThreadAndRunRequestToolResources implements Built<CreateThreadAndRunRequestToolResources, CreateThreadAndRunRequestToolResourcesBuilder> {
  @BuiltValueField(wireName: r'code_interpreter')
  CreateAssistantRequestToolResourcesCodeInterpreter? get codeInterpreter;

  @BuiltValueField(wireName: r'file_search')
  AssistantObjectToolResourcesFileSearch? get fileSearch;

  CreateThreadAndRunRequestToolResources._();

  factory CreateThreadAndRunRequestToolResources([void updates(CreateThreadAndRunRequestToolResourcesBuilder b)]) = _$CreateThreadAndRunRequestToolResources;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateThreadAndRunRequestToolResourcesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateThreadAndRunRequestToolResources> get serializer => _$CreateThreadAndRunRequestToolResourcesSerializer();
}

class _$CreateThreadAndRunRequestToolResourcesSerializer implements PrimitiveSerializer<CreateThreadAndRunRequestToolResources> {
  @override
  final Iterable<Type> types = const [CreateThreadAndRunRequestToolResources, _$CreateThreadAndRunRequestToolResources];

  @override
  final String wireName = r'CreateThreadAndRunRequestToolResources';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateThreadAndRunRequestToolResources object, {
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
        specifiedType: const FullType(AssistantObjectToolResourcesFileSearch),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateThreadAndRunRequestToolResources object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateThreadAndRunRequestToolResourcesBuilder result,
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
            specifiedType: const FullType(AssistantObjectToolResourcesFileSearch),
          ) as AssistantObjectToolResourcesFileSearch;
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
  CreateThreadAndRunRequestToolResources deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateThreadAndRunRequestToolResourcesBuilder();
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

