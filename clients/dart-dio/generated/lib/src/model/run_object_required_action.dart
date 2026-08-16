//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/run_object_required_action_submit_tool_outputs.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'run_object_required_action.g.dart';

/// Details on the action required to continue the run. Will be `null` if no action is required.
///
/// Properties:
/// * [type] - For now, this is always `submit_tool_outputs`.
/// * [submitToolOutputs] 
@BuiltValue()
abstract class RunObjectRequiredAction implements Built<RunObjectRequiredAction, RunObjectRequiredActionBuilder> {
  /// For now, this is always `submit_tool_outputs`.
  @BuiltValueField(wireName: r'type')
  RunObjectRequiredActionTypeEnum get type;
  // enum typeEnum {  submit_tool_outputs,  };

  @BuiltValueField(wireName: r'submit_tool_outputs')
  RunObjectRequiredActionSubmitToolOutputs get submitToolOutputs;

  RunObjectRequiredAction._();

  factory RunObjectRequiredAction([void updates(RunObjectRequiredActionBuilder b)]) = _$RunObjectRequiredAction;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RunObjectRequiredActionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RunObjectRequiredAction> get serializer => _$RunObjectRequiredActionSerializer();
}

class _$RunObjectRequiredActionSerializer implements PrimitiveSerializer<RunObjectRequiredAction> {
  @override
  final Iterable<Type> types = const [RunObjectRequiredAction, _$RunObjectRequiredAction];

  @override
  final String wireName = r'RunObjectRequiredAction';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RunObjectRequiredAction object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(RunObjectRequiredActionTypeEnum),
    );
    yield r'submit_tool_outputs';
    yield serializers.serialize(
      object.submitToolOutputs,
      specifiedType: const FullType(RunObjectRequiredActionSubmitToolOutputs),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RunObjectRequiredAction object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RunObjectRequiredActionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunObjectRequiredActionTypeEnum),
          ) as RunObjectRequiredActionTypeEnum;
          result.type = valueDes;
          break;
        case r'submit_tool_outputs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RunObjectRequiredActionSubmitToolOutputs),
          ) as RunObjectRequiredActionSubmitToolOutputs;
          result.submitToolOutputs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RunObjectRequiredAction deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RunObjectRequiredActionBuilder();
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

class RunObjectRequiredActionTypeEnum extends EnumClass {

  /// For now, this is always `submit_tool_outputs`.
  @BuiltValueEnumConst(wireName: r'submit_tool_outputs')
  static const RunObjectRequiredActionTypeEnum submitToolOutputs = _$runObjectRequiredActionTypeEnum_submitToolOutputs;

  static Serializer<RunObjectRequiredActionTypeEnum> get serializer => _$runObjectRequiredActionTypeEnumSerializer;

  const RunObjectRequiredActionTypeEnum._(String name): super(name);

  static BuiltSet<RunObjectRequiredActionTypeEnum> get values => _$runObjectRequiredActionTypeEnumValues;
  static RunObjectRequiredActionTypeEnum valueOf(String name) => _$runObjectRequiredActionTypeEnumValueOf(name);
}

