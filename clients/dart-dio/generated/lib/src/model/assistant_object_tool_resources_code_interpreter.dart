//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'assistant_object_tool_resources_code_interpreter.g.dart';

/// AssistantObjectToolResourcesCodeInterpreter
///
/// Properties:
/// * [fileIds] - A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool. 
@BuiltValue()
abstract class AssistantObjectToolResourcesCodeInterpreter implements Built<AssistantObjectToolResourcesCodeInterpreter, AssistantObjectToolResourcesCodeInterpreterBuilder> {
  /// A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool. 
  @BuiltValueField(wireName: r'file_ids')
  BuiltList<String>? get fileIds;

  AssistantObjectToolResourcesCodeInterpreter._();

  factory AssistantObjectToolResourcesCodeInterpreter([void updates(AssistantObjectToolResourcesCodeInterpreterBuilder b)]) = _$AssistantObjectToolResourcesCodeInterpreter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssistantObjectToolResourcesCodeInterpreterBuilder b) => b
      ..fileIds = ListBuilder();

  @BuiltValueSerializer(custom: true)
  static Serializer<AssistantObjectToolResourcesCodeInterpreter> get serializer => _$AssistantObjectToolResourcesCodeInterpreterSerializer();
}

class _$AssistantObjectToolResourcesCodeInterpreterSerializer implements PrimitiveSerializer<AssistantObjectToolResourcesCodeInterpreter> {
  @override
  final Iterable<Type> types = const [AssistantObjectToolResourcesCodeInterpreter, _$AssistantObjectToolResourcesCodeInterpreter];

  @override
  final String wireName = r'AssistantObjectToolResourcesCodeInterpreter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssistantObjectToolResourcesCodeInterpreter object, {
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
    AssistantObjectToolResourcesCodeInterpreter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssistantObjectToolResourcesCodeInterpreterBuilder result,
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
  AssistantObjectToolResourcesCodeInterpreter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssistantObjectToolResourcesCodeInterpreterBuilder();
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

