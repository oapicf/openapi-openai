//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_assistant_request_tool_resources_code_interpreter.g.dart';

/// CreateAssistantRequestToolResourcesCodeInterpreter
///
/// Properties:
/// * [fileIds] - A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
@BuiltValue()
abstract class CreateAssistantRequestToolResourcesCodeInterpreter implements Built<CreateAssistantRequestToolResourcesCodeInterpreter, CreateAssistantRequestToolResourcesCodeInterpreterBuilder> {
  /// A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
  @BuiltValueField(wireName: r'file_ids')
  BuiltList<String>? get fileIds;

  CreateAssistantRequestToolResourcesCodeInterpreter._();

  factory CreateAssistantRequestToolResourcesCodeInterpreter([void updates(CreateAssistantRequestToolResourcesCodeInterpreterBuilder b)]) = _$CreateAssistantRequestToolResourcesCodeInterpreter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssistantRequestToolResourcesCodeInterpreterBuilder b) => b
      ..fileIds = ListBuilder();

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssistantRequestToolResourcesCodeInterpreter> get serializer => _$CreateAssistantRequestToolResourcesCodeInterpreterSerializer();
}

class _$CreateAssistantRequestToolResourcesCodeInterpreterSerializer implements PrimitiveSerializer<CreateAssistantRequestToolResourcesCodeInterpreter> {
  @override
  final Iterable<Type> types = const [CreateAssistantRequestToolResourcesCodeInterpreter, _$CreateAssistantRequestToolResourcesCodeInterpreter];

  @override
  final String wireName = r'CreateAssistantRequestToolResourcesCodeInterpreter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssistantRequestToolResourcesCodeInterpreter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.fileIds != null) {
      yield r'file_ids';
      yield serializers.serialize(
        object.fileIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateAssistantRequestToolResourcesCodeInterpreter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssistantRequestToolResourcesCodeInterpreterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'file_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.fileIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateAssistantRequestToolResourcesCodeInterpreter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssistantRequestToolResourcesCodeInterpreterBuilder();
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

