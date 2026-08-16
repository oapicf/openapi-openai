//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_step_delta_step_details_tool_calls_file_search_object.g.dart';

/// RunStepDeltaStepDetailsToolCallsFileSearchObject
///
/// Properties:
/// * [index] - The index of the tool call in the tool calls array.
/// * [id] - The ID of the tool call object.
/// * [type] - The type of tool call. This is always going to be `file_search` for this type of tool call.
/// * [fileSearch] - For now, this is always going to be an empty object.
@BuiltValue()
abstract class RunStepDeltaStepDetailsToolCallsFileSearchObject implements Built<RunStepDeltaStepDetailsToolCallsFileSearchObject, RunStepDeltaStepDetailsToolCallsFileSearchObjectBuilder> {
  /// The index of the tool call in the tool calls array.
  @BuiltValueField(wireName: r'index')
  int get index;

  /// The ID of the tool call object.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The type of tool call. This is always going to be `file_search` for this type of tool call.
  @BuiltValueField(wireName: r'type')
  RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum get type;
  // enum typeEnum {  file_search,  };

  /// For now, this is always going to be an empty object.
  @BuiltValueField(wireName: r'file_search')
  JsonObject get fileSearch;

  RunStepDeltaStepDetailsToolCallsFileSearchObject._();

  factory RunStepDeltaStepDetailsToolCallsFileSearchObject([void updates(RunStepDeltaStepDetailsToolCallsFileSearchObjectBuilder b)]) = _$RunStepDeltaStepDetailsToolCallsFileSearchObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunStepDeltaStepDetailsToolCallsFileSearchObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunStepDeltaStepDetailsToolCallsFileSearchObject> get serializer => _$RunStepDeltaStepDetailsToolCallsFileSearchObjectSerializer();
}

class _$RunStepDeltaStepDetailsToolCallsFileSearchObjectSerializer implements PrimitiveSerializer<RunStepDeltaStepDetailsToolCallsFileSearchObject> {
  @override
  final Iterable<Type> types = const [RunStepDeltaStepDetailsToolCallsFileSearchObject, _$RunStepDeltaStepDetailsToolCallsFileSearchObject];

  @override
  final String wireName = r'RunStepDeltaStepDetailsToolCallsFileSearchObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsFileSearchObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'index';
    yield serializers.serialize(
      object.index,
      specifiedType: const FullType(int),
    );
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum),
    );
    yield r'file_search';
    yield serializers.serialize(
      object.fileSearch,
      specifiedType: const FullType(JsonObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunStepDeltaStepDetailsToolCallsFileSearchObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunStepDeltaStepDetailsToolCallsFileSearchObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.index = valueDes;
          break;
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
            specifiedType: const FullType(RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum),
          ) as RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum;
          result.type = valueDes;
          break;
        case r'file_search':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
          result.fileSearch = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunStepDeltaStepDetailsToolCallsFileSearchObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunStepDeltaStepDetailsToolCallsFileSearchObjectBuilder();
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

class RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum extends EnumClass {

  /// The type of tool call. This is always going to be `file_search` for this type of tool call.
  @BuiltValueEnumConst(wireName: r'file_search')
  static const RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum fileSearch = _$runStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum_fileSearch;

  static Serializer<RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum> get serializer => _$runStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnumSerializer;

  const RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum._(String name): super(name);

  static BuiltSet<RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum> get values => _$runStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnumValues;
  static RunStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnum valueOf(String name) => _$runStepDeltaStepDetailsToolCallsFileSearchObjectTypeEnumValueOf(name);
}

