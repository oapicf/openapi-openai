//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/run_step_details_tool_calls_file_search_object_file_search.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_details_tool_calls_file_search_object.g.dart';

/// RunStepDetailsToolCallsFileSearchObject
///
/// Properties:
/// * [id] - The ID of the tool call object.
/// * [type] - The type of tool call. This is always going to be `file_search` for this type of tool call.
/// * [fileSearch] 
@BuiltValue()
abstract class RunStepDetailsToolCallsFileSearchObject implements Built<RunStepDetailsToolCallsFileSearchObject, RunStepDetailsToolCallsFileSearchObjectBuilder> {
  /// The ID of the tool call object.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The type of tool call. This is always going to be `file_search` for this type of tool call.
  @BuiltValueField(wireName: r'type')
  RunStepDetailsToolCallsFileSearchObjectTypeEnum get type;
  // enum typeEnum {  file_search,  };

  @BuiltValueField(wireName: r'file_search')
  RunStepDetailsToolCallsFileSearchObjectFileSearch get fileSearch;

  RunStepDetailsToolCallsFileSearchObject._();

  factory RunStepDetailsToolCallsFileSearchObject([void updates(RunStepDetailsToolCallsFileSearchObjectBuilder b)]) = _$RunStepDetailsToolCallsFileSearchObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDetailsToolCallsFileSearchObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDetailsToolCallsFileSearchObject> get serializer => _$RunStepDetailsToolCallsFileSearchObjectSerializer();
}

class _$RunStepDetailsToolCallsFileSearchObjectSerializer implements PrimitiveSerializer<RunStepDetailsToolCallsFileSearchObject> {
  @override
  final Iterable<Type> types = const [RunStepDetailsToolCallsFileSearchObject, _$RunStepDetailsToolCallsFileSearchObject];

  @override
  final String wireName = r'RunStepDetailsToolCallsFileSearchObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDetailsToolCallsFileSearchObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDetailsToolCallsFileSearchObjectTypeEnum),
    );
    yield r'file_search';
    yield serializers.serialize(
      object.fileSearch,
      specifiedType: const FullType(RunStepDetailsToolCallsFileSearchObjectFileSearch),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDetailsToolCallsFileSearchObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDetailsToolCallsFileSearchObjectBuilder result,
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
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsFileSearchObjectTypeEnum),
          ) as RunStepDetailsToolCallsFileSearchObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'file_search':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunStepDetailsToolCallsFileSearchObjectFileSearch),
          ) as RunStepDetailsToolCallsFileSearchObjectFileSearch;
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
  RunStepDetailsToolCallsFileSearchObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDetailsToolCallsFileSearchObjectBuilder();
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

class RunStepDetailsToolCallsFileSearchObjectTypeEnum extends EnumClass {

  /// The type of tool call. This is always going to be `file_search` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'file_search')
  static const RunStepDetailsToolCallsFileSearchObjectTypeEnum fileSearch = _$runStepDetailsToolCallsFileSearchObjectTypeEnum_fileSearch;

  static Serializer<RunStepDetailsToolCallsFileSearchObjectTypeEnum> get serializer => _$runStepDetailsToolCallsFileSearchObjectTypeEnumSerializer;

  const RunStepDetailsToolCallsFileSearchObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDetailsToolCallsFileSearchObjectTypeEnum> get values => _$runStepDetailsToolCallsFileSearchObjectTypeEnumValues;
  static RunStepDetailsToolCallsFileSearchObjectTypeEnum valueOf(String name) => _$runStepDetailsToolCallsFileSearchObjectTypeEnumValueOf(name);
}

